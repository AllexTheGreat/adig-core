package com.adigsoft.core.test;

import com.adigsoft.core.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * -- Alex Dobrescu --
 */
@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloWorldTest {

  @Autowired
  private MockMvc mvc;

  @Test
  public void helloWorldTest() throws Exception {
    mvc.perform(get("/").accept(MediaType.TEXT_PLAIN)).andExpect(status().isOk());

  }

}
