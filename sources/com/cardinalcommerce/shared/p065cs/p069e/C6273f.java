package com.cardinalcommerce.shared.p065cs.p069e;

import android.content.Context;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.cardinalcommerce.shared.cs.e.f */
public class C6273f implements Serializable {

    /* renamed from: a */
    public boolean f13788a = true;

    /* renamed from: b */
    private String f13789b;

    /* renamed from: c */
    private String f13790c;

    /* renamed from: d */
    private String f13791d;

    public C6273f(String str) {
        if (!str.equals("")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f13789b = jSONObject.getString("medium");
                this.f13791d = jSONObject.getString("extraHigh");
                this.f13790c = jSONObject.getString("high");
            } catch (Exception unused) {
                this.f13788a = false;
            }
        } else {
            this.f13788a = true;
        }
    }

    /* renamed from: a */
    public String mo17796a(Context context) {
        int i = context.getResources().getConfiguration().screenLayout & 15;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? this.f13790c : this.f13791d : this.f13791d : this.f13790c : this.f13789b;
    }
}
