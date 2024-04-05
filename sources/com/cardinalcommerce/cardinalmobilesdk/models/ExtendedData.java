package com.cardinalcommerce.cardinalmobilesdk.models;

import java.io.Serializable;
import org.json.JSONObject;

public class ExtendedData implements Serializable {

    /* renamed from: a */
    private String f13268a;

    /* renamed from: b */
    private String f13269b;

    /* renamed from: c */
    private String f13270c;

    /* renamed from: d */
    private String f13271d;

    /* renamed from: e */
    private String f13272e;

    /* renamed from: f */
    private String f13273f;

    public ExtendedData(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.f13271d = jSONObject.optString("CAVV", "");
        this.f13272e = jSONObject.optString("ECIFlag", "");
        this.f13273f = jSONObject.optString("XID", "");
        this.f13269b = jSONObject.optString("PAResStatus", "");
        this.f13270c = jSONObject.optString("SignatureVerification", "");
        this.f13268a = jSONObject.optString("Enrolled", "");
    }

    public String getCavv() {
        return this.f13271d;
    }

    public String getEciFlag() {
        return this.f13272e;
    }

    public String getEnrolled() {
        return this.f13268a;
    }

    public String getPaResStatus() {
        return this.f13269b;
    }

    public String getSignatureVerification() {
        return this.f13270c;
    }

    public String getXid() {
        return this.f13273f;
    }
}
