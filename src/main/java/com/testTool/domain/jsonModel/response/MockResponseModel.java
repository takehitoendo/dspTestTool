
package com.testTool.domain.jsonModel.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MockResponseModel {

    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("cur")
    @Expose
    public String cur;
    @SerializedName("seatbid")
    @Expose
    public List<Seatbid> seatbid = null;

}
