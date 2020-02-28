package com.testTool.domain;

import lombok.Getter;
import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.NoSuchElementException;

@AllArgsConstructor @Getter
enum ServerType {
    SD_API_01("sdapi01", "192.168.100.84"),
    SD_API_04("sdapi04", "bidding-dsp.t-ad-m.asia");

    // Field Definition
    String serverId;
    String domain;

    public static ServerType getById(String serverId) {
        return Arrays.stream(ServerType.values())
                .filter(server -> server.getServerId().equals(serverId))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Server " + serverId + " does NOT found "));
    }

}
