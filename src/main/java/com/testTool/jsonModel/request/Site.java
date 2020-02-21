
package com.testTool.jsonModel.request;

import java.util.Arrays;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Site {

    @SerializedName("cat")
    @Expose
    public final List<String> cat = Arrays.asList("IAB12-2");

    @SerializedName("domain")
    @Expose
    public final String domain = "flukiest.com";

    @SerializedName("id")
    @Expose
    public final String id = "1001";

    @SerializedName("name")
    @Expose
    public final String name = "Flukiest";

    @SerializedName("page")
    @Expose
    public final String page = "http://integration.rubiconproject.com/rtb/request";

    @SerializedName("publisher")
    @Expose
    public final Publisher publisher = new Publisher();

}
