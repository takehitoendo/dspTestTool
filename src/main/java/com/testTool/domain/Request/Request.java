package com.testTool.domain.Request;

// import modules from external libraries
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.testTool.domain.jsonModel.request.MockRequestModel;
import org.apache.commons.lang3.StringUtils;
import lombok.Getter;

// import module from java
import java.io.IOException;
import java.util.Objects;

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
        String targetServerId = "sdapi01";

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

    public String post() throws IOException {
        // Build requestJson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String requestJson = Objects.requireNonNull(gson.toJson(request));

        if (!canPost(requestJson)) {
            throw new IllegalStateException("Request Model has some issues");
        }

        return OkHttpPostClient.post(targetServer, requestJson);
    }

    public static void main(String[] args) {
        Request sendRequest = new Request();
        try {
            String res = sendRequest.post();
            System.out.println(res);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
