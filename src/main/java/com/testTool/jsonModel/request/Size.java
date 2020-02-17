
package com.testTool.jsonModel.request;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Size {

    @SerializedName("fmt")
    @Expose
    public List<Integer> fmt = null;
    @SerializedName("h")
    @Expose
    public Integer h;
    @SerializedName("w")
    @Expose
    public Integer w;

}
