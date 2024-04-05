package com.cardinalcommerce.cardinalmobilesdk.models;

import java.io.Serializable;
import org.json.JSONObject;

public class Payment implements Serializable {

    /* renamed from: a */
    private String f13274a;

    /* renamed from: b */
    private String f13275b;

    /* renamed from: c */
    private ExtendedData f13276c;

    public Payment(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.f13274a = jSONObject.optString("Type", "");
        this.f13275b = jSONObject.optString("ProcessorTransactionId", "");
        String optString = jSONObject.optString("ExtendedData", "");
        if (optString != null && !optString.isEmpty()) {
            this.f13276c = new ExtendedData(optString);
        }
    }

    public ExtendedData getExtendedData() {
        return this.f13276c;
    }

    public String getProcessorTransactionId() {
        return this.f13275b;
    }

    public String getType() {
        return this.f13274a;
    }
}
