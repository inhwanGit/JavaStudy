package com.example.SpringStudy;

import com.example.SpringStudy.model.UserRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringStudyApplicationTests {

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void contextLoads() throws JsonProcessingException {
		var user = new UserRequest();
		user.setUserName("박인환");
		user.setUserAge(26);
		user.setUserEmail("inhwanpark19991120@gmail.com");
		user.setIsKorean(true);

		// 역직렬화
		var json = objectMapper.writeValueAsString(user);
		System.out.println(json);

		// 직렬화
		var dto = objectMapper.readValue(json, UserRequest.class);
		System.out.println(dto);
	}

}
