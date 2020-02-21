package com.testTool.domain;

public class SendRequest {
    final String UID = "edTsW7RJ2L";

    String userAgent; // called "ua"
    String url;

    // variables from screen
    String keyword; // called "q"
    Integer height;
    Integer width;
    Integer position;
    String ip;
    Boolean isPC;
    // Integer serverId; //called sdapi
    // String bancat;
    // String banct;
    // String adomain;

    SendRequest() {
        keyword = "";
        height = 250;
        width = 300;
        position = 0;
        ip = "133.173.196.95";
        isPC = false;

        if(!isPC) {
            userAgent = "Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 " +
                    "(KHTML, like Gecko) Version/11.0 Mobile/15A372 Safari/604.1";
        } else {
            userAgent = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 " +
                    "(KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36";
        }
    }
}
