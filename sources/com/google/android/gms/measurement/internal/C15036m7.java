package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.m7 */
public final class C15036m7 {

    /* renamed from: a */
    public final C15103u3 f33685a;

    public C15036m7(C15103u3 u3Var) {
        this.f33685a = u3Var;
    }

    /* renamed from: a */
    public final void mo52249a(Bundle bundle, String str) {
        String str2;
        this.f33685a.mo52015a().mo51995g();
        if (!this.f33685a.mo52321e()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String next : bundle.keySet()) {
                    builder.appendQueryParameter(next, bundle.getString(next));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f33685a.mo52330q().f33316u.mo51938b(str2);
                this.f33685a.mo52330q().f33317v.mo52364b(this.f33685a.f33885o.currentTimeMillis());
            }
        }
    }

    /* renamed from: b */
    public final boolean mo52250b() {
        return this.f33685a.mo52330q().f33317v.mo52363a() > 0;
    }

    /* renamed from: c */
    public final boolean mo52251c() {
        return mo52250b() && this.f33685a.f33885o.currentTimeMillis() - this.f33685a.mo52330q().f33317v.mo52363a() > this.f33685a.f33878h.mo51970m((String) null, C14959e2.f33384R);
    }
}
