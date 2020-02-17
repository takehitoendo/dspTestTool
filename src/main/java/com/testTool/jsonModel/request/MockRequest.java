
package com.testTool.jsonModel.request;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MockRequest {

    @SerializedName("at")
    @Expose
    public Integer at;
    @SerializedName("device")
    @Expose
    public Device device;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("imp")
    @Expose
    public List<Imp> imp = null;
    @SerializedName("site")
    @Expose
    public Site site;
    @SerializedName("tmax")
    @Expose
    public Integer tmax;
    @SerializedName("user")
    @Expose
    public User user;

}
