package com.footprint.config;

import com.footprint.UserCenterApplication;
import net.sf.ehcache.CacheManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by gaofang on 17/04/2017.
 * <p>
 * Ehcache 测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UserCenterApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class EhcacheTest {

	private static final Logger logger = LoggerFactory.getLogger(EhcacheTest.class);

	@Autowired
	private CacheManager cacheManager;

	@Test
	public void cacheExists() {
		Boolean b = cacheManager.cacheExists(EhcacheConstant.CACHE_NAME_ENPT);
		logger.info("cacheExists:\n\t" + b);
	}

	@Test
	public void cacheExists1() {
//		Cache b = cacheManager.get(EhcacheConstant.CACHE_NAME_ENPT);
//		logger.info("cacheExists:\n\t" + b);
	}

}
