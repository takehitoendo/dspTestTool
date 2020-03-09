package com.testTool.web.service;

// import class form other packages
import com.testTool.domain.Request.Request;
import com.testTool.domain.Response.Response;

// import modules from java libraries
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class MockSspTestService {

    public String execute() throws IOException, IllegalStateException {
        Request request = new Request();
        Response response = request.post();
        return response.execute();
    }

    public static void main(String[] args) {
        MockSspTestService test = new MockSspTestService();
        try {
            System.out.println(test.execute());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
