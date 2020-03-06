package com.testTool.domain.jsonModel.request;

import java.util.UUID;

public class ImpIdBuilder {
    
    static String build() {
        StringBuffer impId = new StringBuffer();

        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();

        impId.append(uuid1);
        impId.append("-");
        impId.append(uuid2);
        impId.append("-000000000000");

        return impId.toString();
    }
}
