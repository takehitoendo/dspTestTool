package com.testTool.domain.Response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.testTool.domain.jsonModel.response.MockResponseModel;

public class Response {
    private final MockResponseModel response;

    public Response(String responseJson) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String prettyJson = gson.toJson(responseJson);
        System.out.println(prettyJson);

        response = gson.fromJson(responseJson, MockResponseModel.class);
    }

    public String proceed() {
        String adm = response.seatbid.get(0).bid.get(0).adm;
        String replacedAdm = replaceAuctionPrice(adm);
        return replacedAdm;
    }

    private String replaceAuctionPrice(String adm) {
        return adm.replace("${AUCTION_PRICE:BF}", "BF730E9808E1CC7C");
    }
}

