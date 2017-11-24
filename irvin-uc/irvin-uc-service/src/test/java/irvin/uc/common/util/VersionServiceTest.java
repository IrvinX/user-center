package irvin.uc.common.util;

import irvin.api.domain.UcUserBasic;
import irvin.uc.UCApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author irvin
 * @date Create in 下午4:05 2017/11/17
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UCApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class VersionServiceTest {

    @Autowired
    VersionService versionService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void getVersion() throws Exception {
        long version = versionService.getVersion("2bb486e1b72f463ba9c0d553a8c7c092", UcUserBasic.class.getName());
        logger.info("version: {}", version);
    }

}