
package com.testTool.jsonModel.request;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Banner {

    @SerializedName("api")
    @Expose
    public List<Object> api = null;
    @SerializedName("battr")
    @Expose
    public List<Object> battr = null;
    @SerializedName("ext")
    @Expose
    public Ext_ ext;
    @SerializedName("h")
    @Expose
    public Integer h;
    @SerializedName("pos")
    @Expose
    public Integer pos;
    @SerializedName("topframe")
    @Expose
    public Integer topframe;
    @SerializedName("w")
    @Expose
    public Integer w;

}
