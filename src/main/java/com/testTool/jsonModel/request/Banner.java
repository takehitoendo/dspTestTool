
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
    public Integer height;

    @SerializedName("pos")
    @Expose
    public Integer pos;

    @SerializedName("topframe")
    @Expose
    public final Integer topframe = 0;

    @SerializedName("w")
    @Expose
    public Integer width;

    Banner(Integer width, Integer height, Integer position) {
        this.width = width;
        this.height = height;
        this.ext = new Ext_(this.width, this.height);
        this.pos = position;
    }

}
