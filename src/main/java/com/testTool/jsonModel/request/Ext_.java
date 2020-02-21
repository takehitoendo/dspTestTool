
package com.testTool.jsonModel.request;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ext_ {

    @SerializedName("sizes")
    @Expose
    public List<Size> sizes = null;

    Ext_(Integer width, Integer height) {
        Size size = new Size(width, height);
        sizes.add(size);
    }

}
