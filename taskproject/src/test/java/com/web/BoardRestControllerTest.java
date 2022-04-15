package com.web;

import com.web.controller.api.BoardRestController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ContextConfiguration(classes = BoardRestController.class)
@ExtendWith(MockitoExtension.class)
  class BoardRestControllerTest {


	private MockMvc mockMvc;

	@BeforeEach
	public void setUp(WebApplicationContext context) {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		mockMvc.perform(get("/api/v1/board/init"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("init application.")));
	}

}
