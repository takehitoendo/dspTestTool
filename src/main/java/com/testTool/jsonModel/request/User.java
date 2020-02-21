
package com.testTool.jsonModel.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("buyeruid")
    @Expose
    public final String buyeruid = "Vl67ifl52h";

    @SerializedName("ext")
    @Expose
    public Ext__ ext = new Ext__();

    @SerializedName("id")
    @Expose
    public final String id = "6bcb06434de93cf09945e29388912ff825de088e";

}
