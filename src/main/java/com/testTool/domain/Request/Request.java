package com.testTool.domain.Request;

// import modules from external libraries
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.StringUtils;
import lombok.Getter;

// import module from java
import java.io.IOException;
import java.util.Objects;

// import class from other packages
import com.testTool.domain.jsonModel.request.MockRequestModel;
import com.testTool.domain.Response.Response;
import org.springframework.http.ResponseEntity;

@Getter
public class Request {
    private final MockRequestModel request;
    private final ServerType targetServer;

    public Request() {
        // mock inputs
        String keyword = "";
        Integer height = 250;
        Integer width = 300;
        Integer position = 1;
        String ip = "60.193.223.46";
        String targetDeviceTypeString = "MOBILE";
        String targetServerId = "sdapi04";

        // initialize targetServer
        targetServer = ServerType.getById(targetServerId);

        // initialize userAgent
        TargetDeviceType targetDevice = TargetDeviceType.valueOf(targetDeviceTypeString);
        String userAgent = targetDevice.getUserAgent();

        //initialize Json Model for Request
         request = new MockRequestModel(width, height, position, ip, userAgent);

    }

    private boolean canPost(String json) {
        return StringUtils.isNotBlank(json);
    }

    public Response post() throws IOException, IllegalStateException {
        // Build requestJson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String requestJson = Objects.requireNonNull(gson.toJson(request));

        System.out.println("Request Json");
        System.out.println(requestJson);

        if (!canPost(requestJson)) {
            throw new IllegalStateException("Request Model has some issues");
        }

        String responseString = OkHttpPostClient.post(targetServer, requestJson);
        return new Response(responseString);
    }

    public static void main(String[] args) {
        Request sendRequest = new Request();
        try {
            Response res = sendRequest.post();
            System.out.println(res);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
