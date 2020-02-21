
package com.testTool.jsonModel.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Device {

    @SerializedName("connectiontype")
    @Expose
    public final Integer connectiontype = 0;

    @SerializedName("devicetype")
    @Expose
    public final Integer devicetype = 2;

    @SerializedName("ext")
    @Expose
    public final Ext ext = new Ext() ;

    @SerializedName("geo")
    @Expose
    public final Geo geo = new Geo();

    @SerializedName("ip")
    @Expose
    public String ip;

    @SerializedName("js")
    @Expose
    public final Integer js = 1;

    @SerializedName("language")
    @Expose
    public final String language = "ja";

    @SerializedName("ua")
    @Expose
    public String ua;

    Device(String ip, String userAgent) {
        this.ip = ip;
        this.ua = userAgent;
    }
}
