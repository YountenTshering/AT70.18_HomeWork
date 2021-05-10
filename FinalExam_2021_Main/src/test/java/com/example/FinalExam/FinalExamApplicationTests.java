package com.example.FinalExam;

import com.example.FinalExam.dao.ProductDao;
import com.example.FinalExam.services.PurchaseService;

import org.assertj.core.api.Assertions;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class FinalExamApplicationTests {
	@Autowired
	PurchaseService pService;

	@Autowired
	ProductDao pDao;

	@Test
	void contextLoads() {
	}

	org.jboss.logging.Logger logger = LoggerFactory.logger(FinalExamApplicationTests.class);

	void testWriteLock() throws Exception {

		// //Benefits are lazy load
		// System.out.println("-- Loading Benefits --");
		// System.out.println("Benefits loaded: " +
		// employee.getBenefits().iterator().next().getTitle());

		Thread.sleep(1000);
		Assertions.assertEquals(4, pDao.getOne(1).getStock());
	}
}
