package com.testTool.domain;

// import modules from external libraries
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.testTool.domain.jsonModel.request.MockRequestModel;
import org.apache.commons.lang3.StringUtils;
import lombok.Getter;
import sun.net.www.http.HttpClient;

// import module from java
import java.io.IOException;
import java.util.Objects;

@Getter
public class Request {
    private final String requestJson;
    private final ServerType targetServer;

    public Request() {
        // mock inputs
        String keyword = "";
        Integer height = 250;
        Integer width = 300;
        Integer position = 1;
        String ip = "60.193.223.46";
        String targetDeviceString = "MOBILE";
        String targetServerId = "sdapi04";

        // initialize targetServer
        targetServer = ServerType.getById(targetServerId);

        // initialize impId
        String impId = ImpIdBuilder.build();

        // initialize userAgent
        TargetDeviceType targetDevice = TargetDeviceType.valueOf(targetDeviceString);
        String userAgent = targetDevice.getUserAgent();

        //initialize Json Model for Request
        MockRequestModel model = new MockRequestModel(width, height, position, ip, impId, userAgent);

        // initialize requestJson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        requestJson = Objects.requireNonNull(gson.toJson(model));
    }

    private String post() throws IOException {
        OkHttpPostClient client = new OkHttpPostClient(targetServer, requestJson);
        String bidResponse = client.post();
        return bidResponse;
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
