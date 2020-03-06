
package com.testTool.domain.jsonModel.response;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Seatbid {

    @SerializedName("bid")
    @Expose
    public List<Bid> bid = null;

}
