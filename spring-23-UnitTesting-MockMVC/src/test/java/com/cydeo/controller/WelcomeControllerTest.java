package com.cydeo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(WelcomeController.class)
public class WelcomeControllerTest {

    @Autowired
    private MockMvc mvc;


    @Test
    void welcomeTest() throws Exception {

        // call  /welcome
        // verify response

        RequestBuilder request = MockMvcRequestBuilders.get("/welcome")
                .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mvc.perform(request).andReturn();

        assertEquals(200, result.getResponse().getStatus());
        assertEquals("welcome", result.getResponse().getContentAsString());
    }

    @Test
    void welcomeTest2() throws Exception {

        RequestBuilder request = MockMvcRequestBuilders.get("/welcome")
                .accept(MediaType.APPLICATION_JSON);

        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("welcome"))
                .andReturn();
    }

}
