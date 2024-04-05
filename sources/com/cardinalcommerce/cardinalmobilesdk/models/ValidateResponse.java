package com.cardinalcommerce.cardinalmobilesdk.models;

import java.io.Serializable;
import kotlin.jvm.internal.C19382n;
import org.json.JSONObject;
import p103f5.C6789d;

public class ValidateResponse implements Serializable {

    /* renamed from: a */
    private boolean f13277a;

    /* renamed from: b */
    private Payment f13278b;

    /* renamed from: c */
    private CardinalActionCode f13279c;

    /* renamed from: d */
    private int f13280d;

    /* renamed from: e */
    private String f13281e;

    public ValidateResponse(String str) {
        String optString = new JSONObject(C19382n.m32758m(str)).optString("Payload", "");
        if (!optString.isEmpty()) {
            JSONObject jSONObject = new JSONObject(optString);
            String optString2 = jSONObject.optString("Payment", "");
            this.f13277a = jSONObject.optBoolean("Validated", false);
            if (!optString2.isEmpty()) {
                this.f13278b = new Payment(optString2);
            }
            this.f13279c = CardinalActionCode.getActionCode(jSONObject.optString("ActionCode", ""));
            this.f13280d = jSONObject.optInt("ErrorNumber", 0);
            this.f13281e = jSONObject.optString("ErrorDescription", "");
        }
    }

    public ValidateResponse(boolean z, CardinalActionCode cardinalActionCode, C6789d dVar) {
        this.f13277a = z;
        this.f13279c = cardinalActionCode;
        this.f13280d = dVar.f14947a;
        this.f13281e = dVar.f14948b;
    }

    public CardinalActionCode getActionCode() {
        return this.f13279c;
    }

    public String getErrorDescription() {
        return this.f13281e;
    }

    public int getErrorNumber() {
        return this.f13280d;
    }

    public Payment getPayment() {
        return this.f13278b;
    }

    public boolean isValidated() {
        return this.f13277a;
    }
}
