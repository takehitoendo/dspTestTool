
package com.testTool.jsonModel.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("buyeruid")
    @Expose
    public String buyeruid;
    @SerializedName("ext")
    @Expose
    public Ext__ ext;
    @SerializedName("id")
    @Expose
    public String id;

}
