package ie.backofireland.demo_app;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @Test
  public void testSayHello() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
        .andExpect(status().isOk())
        .andExpect(content().string("Hello World!"));
  }
}
