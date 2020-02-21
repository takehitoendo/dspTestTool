
package com.testTool.jsonModel.request;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Imp {

    @SerializedName("banner")
    @Expose
    public Banner banner;

    @SerializedName("id")
    @Expose
    public final String id = "1";

    @SerializedName("iframebuster")
    @Expose
    public final List<Object> iframebuster = new ArrayList<>();

    @SerializedName("instl")
    @Expose
    public final Integer instl = 0;

    @SerializedName("secure")
    @Expose
    public final Integer secure = 0;

    @SerializedName("tagid")
    @Expose
    public final String tagid = "1004";

    Imp(Integer width, Integer height, Integer position) {
        this.banner = new Banner(width, height, position);
    }

}
