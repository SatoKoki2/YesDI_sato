package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class WebTestForGroup {

	private MockMvc MOCKMVC;

	@Autowired
	GroupController target;

	@Before
	public void setup() {
		MOCKMVC = MockMvcBuilders.standaloneSetup(target).build();
	}

	@Test
	public void isStatusTest() throws Exception {
		// /inputでアクセスして、statusがOKになるかのテスト
		MOCKMVC.perform(get("/group_input")).andExpect(status().isOk());
		//(解答※なくても可)MOCKMVC.perform(get("/input")).andExpect(status().isNotFound());
	}
}
