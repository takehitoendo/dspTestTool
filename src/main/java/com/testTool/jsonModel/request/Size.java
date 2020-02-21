
package com.testTool.jsonModel.request;

import java.util.Arrays;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Size {

    @SerializedName("fmt")
    @Expose
    public final List<Integer> fmt = Arrays.asList(15);

    @SerializedName("h")
    @Expose
    public Integer height;

    @SerializedName("w")
    @Expose
    public Integer width;

    Size(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

}
