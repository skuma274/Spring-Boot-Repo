package com.cg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.boot.DasBoot1Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DasBoot1Application.class)
@WebAppConfiguration
public class DasBoot1ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
