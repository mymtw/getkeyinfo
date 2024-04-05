package com.usebutton.merchant;

import android.support.p013v4.media.C0072d;
import org.json.JSONObject;

/* renamed from: com.usebutton.merchant.b0 */
public final class C17475b0 {

    /* renamed from: a */
    public int f38231a;

    /* renamed from: b */
    public JSONObject f38232b;

    public C17475b0(int i, JSONObject jSONObject) {
        this.f38231a = i;
        this.f38232b = jSONObject;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("[Status Code]: ");
        h.append(this.f38231a);
        h.append("\n[Body]: ");
        h.append(this.f38232b.toString());
        return h.toString();
    }
}
