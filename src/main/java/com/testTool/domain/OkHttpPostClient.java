package com.testTool.domain;

import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class OkHttpPostClient {
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    //final HttpUrl endpoint;
    final String endpoint;
    final String requestJson;

    OkHttpPostClient(ServerType server, String json) {
        if (StringUtils.isBlank(json)) throw new IllegalArgumentException("Request SHOULD NOT be blank");

        endpoint = "http://" + server.getDomain() + "/dsp/api/bid/s/s/rubicon";
//        endpoint = new HttpUrl.Builder()
//                .scheme("http")
//                .host(host)
//                .build();

        requestJson = json;
    }

    public String post() throws IOException {
        RequestBody body = RequestBody.create(requestJson, JSON);
        Request request = new Request.Builder().url(endpoint).post(body).build();

        OkHttpClient client = new OkHttpClient();
        try (Response response = client.newCall(request).execute()) {
            if(! response.isSuccessful()) return "No Bid";

            return Objects.requireNonNull(response.body()).string();
        }
    }
}
