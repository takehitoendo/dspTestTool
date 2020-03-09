package com.testTool.domain.Response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.testTool.domain.jsonModel.response.MockResponseModel;

public class Response {
    private final MockResponseModel response;
    private final String REPLACE_TARGET = "${AUCTION_PRICE:BF}";

    public Response(String responseJson) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        response = gson.fromJson(responseJson, MockResponseModel.class);

        System.out.println("Response Json");
        System.out.println(gson.toJson(response));
    }

    /**
     * pick fist "seatbid" content from Admatrix response, then get ONLY first bid content
     * Because, we just need one AD tag, sometimes it respond multiple tag though
     * Then, in order to mock SSP processing, replace price tag to another string
     * @return adsTag
     */
    public String execute() {
        String adm = response.seatbid.get(0).bid.get(0).adm;
        String replacedAdm = replaceAuctionPrice(adm);
        return replacedAdm;
    }

    private String replaceAuctionPrice(String adm) {
        return adm.replace(REPLACE_TARGET, "BF730E9808E1CC7C");
    }
}

