package jmerkle.sequential.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jmerkle.sequential.JMerkle;
import jmerkle.sequential.JMerkleAlterable;
import jmerkle.sequential.JMerkleMarshaler;

/**
 * Shows a simple example of how a mobile device might sync its data with a
 * central datastore through the use of Merkle tree comparisons.
 * 
 * @author Irvin
 */
public class HelloJMerkle {

	private static final String TMP_DIR = System.getProperty("java.io.tmpdir");

	public static void main(String[] args) throws Exception {

		// create the initial JMerkle structure, representative of an inventory:
		List<JMerkleAlterable> initialInventoryAlterations = initialInventory();

		JMerkle initialInventoryTree = JMerkle.alter(null,
				initialInventoryAlterations);

		// mimic storage of the initialInventoryTree by marshaling it:
		byte[] marshaledInitialInventory = JMerkleMarshaler
				.marshal(initialInventoryTree);

		// //////////////////////////////////////////////////////////////////
		// uncomment below to store the marshaled "initial inventory" tree to
		// the java.io.tmpdir (to try merkle_parser, etc):
		// FileOutputStream fos1 = new FileOutputStream(TMP_DIR +
		// "/InitialInventoryTree.out");
		// fos1.write(marshaledInitialInventory);
		// //////////////////////////////////////////////////////////////////

		// mimic retrieval of the initialInventoryTree by unmarshaling the
		// stored value:
		JMerkle unmarshaledInitialInventory = JMerkleMarshaler
				.unmarshal(marshaledInitialInventory);

		// client requests a bootstrap sync with the central data server; this
		// is done
		// either by getting all the keys on the current inventory or by
		// diff'ing an empty
		// (null) value to the current inventory. we'll use the allkeys method:
		List<String> allkeysBootstrap = JMerkle
				.allkeys(unmarshaledInitialInventory);

		System.out
				.println("mobile device needs bootstrap data for the following inventory Widgets:");
		System.out.println(allkeysBootstrap);

		// time passes, the mobile device goes offline... meanwhile the
		// inventory changes w/ three updates:
		// a brand new Widget:
		Widget brandNewWidget = new Widget("brand new!", new ProductValue(99,
				""));

		// sold 1 widget2:
		Widget widget2 = new Widget("widget2", new ProductValue(23, ""));

		// and all widget4's were sold:
		Widget widget4 = new Widget("widget4", new ProductValue());

		// batch up the alterations:
		List<JMerkleAlterable> alterations = new ArrayList<JMerkleAlterable>(3);
		alterations.add(brandNewWidget);
		alterations.add(widget2);
		alterations.add(widget4);

		// and merge them into the initialInventoryTree:
		JMerkle alteredInventoryTree = JMerkle.alter(initialInventoryTree,
				alterations);

		// //////////////////////////////////////////////////////////////////
		// uncomment below to store the marshaled "altered inventory" tree to
		// the java.io.tmpdir (to try merkle_parser, etc):
		// FileOutputStream fos2 = new FileOutputStream(TMP_DIR +
		// "/AlteredInventoryTree.out");
		// fos2.write(JMerkleMarshaler.marshal(alteredInventoryTree));
		// //////////////////////////////////////////////////////////////////

		System.out
				.println("after selling all of the widget4's, 1 widget2, and adding 99 \"brand new!\" widgets, the current inventory consists of:");
		System.out.println(JMerkle.allkeys(alteredInventoryTree));

		// the mobile device comes back online, requests an update to sync its
		// data... this likely wouldn't involve
		// passing the entire JMerkle structure, only a minimal amount of data
		// to identify the tree used when the
		// mobile device was bootstrapped:
		List<String> diff = JMerkle.diff(unmarshaledInitialInventory,
				alteredInventoryTree);

		System.out
				.println("mobile device needs to sync only the following values to be up to date on ALL widgets and their counts:");
		System.out.println(diff); // notice, the device will be instructed that
									// widget4 is no longer in stock.

		// etc., etc.
	}

	private static List<JMerkleAlterable> initialInventory() {
		List<JMerkleAlterable> initialInventory = new ArrayList<JMerkleAlterable>(
				5);
		for (int i = 0; i < 5; i++) {
			initialInventory.add(new Widget("widget" + i, new ProductValue(
					i + 1, "")));
		}
		return initialInventory;
	}

	/**
	 * Barebones JMerkleAlterable implementation.
	 */
	private static class Widget implements JMerkleAlterable {

		private String productId;
		private ProductValue count;

		public Widget(String productId, ProductValue count) {
			this.productId = productId;
			this.count = count;
		}

		@Override
		public String getKey() {
			return productId;
		}

		@Override
		public Serializable getValue() {
			return count;
		}
	}

	private static class ProductValue implements Serializable {
		/**
		 * @author:Irvin
		 * @time:2017年7月3日 上午10:28:27
		 */
		private static final long serialVersionUID = -4257084955412987976L;
		private Integer count;
		private String name;

		public ProductValue(Integer count, String name) {
			super();
			this.count = count;
			this.name = name;
		}

		public ProductValue() {
		}

		public Integer getCount() {
			return count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
}