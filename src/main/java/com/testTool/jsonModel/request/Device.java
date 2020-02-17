
package com.testTool.jsonModel.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Device {

    @SerializedName("connectiontype")
    @Expose
    public Integer connectiontype;
    @SerializedName("devicetype")
    @Expose
    public Integer devicetype;
    @SerializedName("ext")
    @Expose
    public Ext ext;
    @SerializedName("geo")
    @Expose
    public Geo geo;
    @SerializedName("ip")
    @Expose
    public String ip;
    @SerializedName("js")
    @Expose
    public Integer js;
    @SerializedName("language")
    @Expose
    public String language;
    @SerializedName("ua")
    @Expose
    public String ua;

}
