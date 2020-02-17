
package com.testTool.jsonModel.request;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Imp {

    @SerializedName("banner")
    @Expose
    public Banner banner;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("iframebuster")
    @Expose
    public List<Object> iframebuster = null;
    @SerializedName("instl")
    @Expose
    public Integer instl;
    @SerializedName("secure")
    @Expose
    public Integer secure;
    @SerializedName("tagid")
    @Expose
    public String tagid;

}
