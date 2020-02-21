
package com.testTool.jsonModel.request;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MockRequest {
    // definition of variables
    @SerializedName("at")
    @Expose
    public final Integer at = 2;

    @SerializedName("device")
    @Expose
    public Device device;

    @SerializedName("id")
    @Expose
    public String impId;

    @SerializedName("imp")
    @Expose
    public List<Imp> imp = null;

    @SerializedName("site")
    @Expose
    public final Site site = new Site();

    @SerializedName("tmax")
    @Expose
    public final Integer tmax = 120;

    @SerializedName("user")
    @Expose
    public final User user = new User();

    MockRequest(Integer width, Integer height, Integer position, String ip, String impId, String userAgent) {
        this.device = new Device(ip, userAgent);
        this.impId = impId;
        this.imp.add(new Imp(width, height, position));
    }

}
