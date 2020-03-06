package com.testTool.domain;

import java.util.UUID;

public class ImpIdBuilder {
    static String build() {
        StringBuilder builder = new StringBuilder();
        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();
        String[] uuid3 = {uuid1.toString(), "-", uuid2.toString(), "-000000000000"};
        return String.join("", uuid3);
    }
}
