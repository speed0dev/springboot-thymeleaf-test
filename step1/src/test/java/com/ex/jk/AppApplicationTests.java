package com.ex.jk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@AutoConfigureMockMvc
@SpringBootTest
class AppApplicationTests {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	//private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(cbsRestCallerTest.class);


	@Autowired
	MockMvc mvc;

	// mock test sample
	@Test
	void callTest() {
		log.debug("mockTest() begin -------------------------");
		log.debug(" mvc:" + mvc);

//		try {
//
//			mvc.perform(get("/v/books"))
//					.andExpect(status().isOk())
//					//.andExpect(view().name("book"))
//					.andExpect(model().attributeExists("bookList"))
//					//.andExpect(model().attribute("bookList", contains(book)))
//			;
//
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		log.debug("mockTest() end ===========================");


	}

}
