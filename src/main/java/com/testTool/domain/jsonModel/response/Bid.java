
package com.testTool.domain.jsonModel.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bid {

    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("impid")
    @Expose
    public String impid;
    @SerializedName("adid")
    @Expose
    public String adid;
    @SerializedName("crid")
    @Expose
    public String crid;
    @SerializedName("cid")
    @Expose
    public String cid;
    @SerializedName("h")
    @Expose
    public Integer h;
    @SerializedName("w")
    @Expose
    public Integer w;
    @SerializedName("price")
    @Expose
    public Integer price;
    @SerializedName("adm")
    @Expose
    public String adm;
    @SerializedName("adomain")
    @Expose
    public List<String> adomain = null;

}
