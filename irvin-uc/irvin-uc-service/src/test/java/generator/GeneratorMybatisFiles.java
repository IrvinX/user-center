package generator;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaofang on 2017/7/4.
 * <p>
 * 生成model/mapper/dao
 */
public class GeneratorMybatisFiles {

	// 文件名字
	private static final String FILE = "generatorConfig.xml";
	private static final File[] FILES = new File("src/test/resources").listFiles(new FileFilter() {
		public boolean accept(File file) {
			Boolean isFile = file.isFile();
			String filename = file.getName();
			return isFile && filename.equalsIgnoreCase(FILE);
		}
	});

	@Test
	public void GeneratorMybatis() {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;

		ConfigurationParser cp = new ConfigurationParser(warnings);
		try {
			Configuration config = cp.parseConfiguration(FILES[0]);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);

			myBatisGenerator.generate(null);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (InvalidConfigurationException e) {
			e.printStackTrace();
		} catch (XMLParserException e) {
			e.printStackTrace();
		}
	}
}
