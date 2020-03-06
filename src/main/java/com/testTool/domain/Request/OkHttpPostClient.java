package com.testTool.domain.Request;

import okhttp3.Request;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.SocketException;
import java.net.URL;
import java.util.Objects;

public class OkHttpPostClient {
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static final OkHttpClient client = new OkHttpClient();

    public static String post(ServerType server, String json) throws IOException {
        if((server == null) || (StringUtils.isBlank(json))) throw new IllegalArgumentException();

        URL endpoint = server.getURL();
        String requestJson = json;

        RequestBody body = RequestBody.create(requestJson, JSON);
        Request request = new Request.Builder().url(endpoint).post(body).build();

        try (Response response = client.newCall(request).execute()) {
            if(! response.isSuccessful()) throw new IOException("Unexpected code " + response);

            return Objects.requireNonNull(response.body()).string();
        } catch (SocketException e) {
            return "No Bid";
        }
    }
}
