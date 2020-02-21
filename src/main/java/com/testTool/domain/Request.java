package com.testTool.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.testTool.jsonModel.request.MockRequestModel;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

public class Request {
    String requestJson;

    final String UID = "edTsW7RJ2L";
    String userAgent; // called "ua"
    String url;

    // variables from screen
    String keyword; // called "q"
    Integer height;
    Integer width;
    Integer position;
    String ip;
    String impId;
    Boolean isPC;
    // Integer serverId; //called sdapi
    // String bancat;
    // String banct;
    // String adomain;

    public Request() {

        keyword = "";
        height = 250;
        width = 300;
        position = 1;
        ip = "133.173.196.95";
        isPC = false;

        // initialize impId
        StringBuilder builder = new StringBuilder();
        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();
        String[] strs = {uuid1.toString(), "-", uuid2.toString(), "-000000000000"};
        impId = String.join("", strs);


        // initialize userAgent
        //TODO　切り出し検討
        if(!isPC) {
            userAgent = "Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 " +
                    "(KHTML, like Gecko) Version/11.0 Mobile/15A372 Safari/604.1";
        } else {
            userAgent = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 " +
                    "(KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36";
        }

        //initialize Json Model for Request
        MockRequestModel model = new MockRequestModel(width, height, position, ip, impId, userAgent);

        // initialize requestJson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        requestJson = gson.toJson(model);
    }

    private Boolean canSendRequest() {
        return StringUtils.isNotEmpty(requestJson);
    }

    public static void main(String[] args) {
        Request sendRequest = new Request();

    }
}
