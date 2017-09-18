package irvin.api.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public abstract class AbstractAdapter {

	@Autowired
	private RestTemplate restTemplate;

}
