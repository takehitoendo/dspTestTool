package com.testTool.domain;

import lombok.Getter;
import lombok.AllArgsConstructor;

@AllArgsConstructor @Getter
enum TargetDeviceType {
    PC("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36"),
    MOBILE("Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/11.0 Mobile/15A372 Safari/604.1");

    // Filed Definition
    private final String userAgent;

}
