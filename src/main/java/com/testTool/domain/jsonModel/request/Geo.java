
package com.testTool.domain.jsonModel.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Geo {

    @SerializedName("country")
    @Expose
    public final String country = "JPN";

    @SerializedName("region")
    @Expose
    public final String region = "JP";

}
