
package com.testTool.jsonModel.request;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Site {

    @SerializedName("cat")
    @Expose
    public List<String> cat = null;
    @SerializedName("domain")
    @Expose
    public String domain;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("page")
    @Expose
    public String page;
    @SerializedName("publisher")
    @Expose
    public Publisher publisher;

}
