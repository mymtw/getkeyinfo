package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.animation.C0391c;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.m */
public final class C15028m {

    /* renamed from: a */
    public final String f33668a;

    /* renamed from: b */
    public final String f33669b;

    /* renamed from: c */
    public final String f33670c;

    /* renamed from: d */
    public final long f33671d;

    /* renamed from: e */
    public final long f33672e;

    /* renamed from: f */
    public final zzar f33673f;

    public C15028m(C15103u3 u3Var, String str, String str2, String str3, long j, Bundle bundle) {
        zzar zzar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.f33668a = str2;
        this.f33669b = str3;
        this.f33670c = true == TextUtils.isEmpty(str) ? null : str;
        this.f33671d = j;
        this.f33672e = 0;
        if (bundle == null || bundle.isEmpty()) {
            zzar = new zzar(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    u3Var.mo52016b().f33724g.mo52237a("Param name can't be null");
                    it.remove();
                } else {
                    Object k = u3Var.mo52335w().mo52213k(bundle2.get(next), next);
                    if (k == null) {
                        u3Var.mo52016b().f33727j.mo52238b(u3Var.f33884n.mo52143e(next), "Param value can't be null");
                        it.remove();
                    } else {
                        u3Var.mo52335w().mo52223w(bundle2, k, next);
                    }
                }
            }
            zzar = new zzar(bundle2);
        }
        this.f33673f = zzar;
    }

    /* renamed from: a */
    public final C15028m mo52235a(C15103u3 u3Var, long j) {
        return new C15028m(u3Var, this.f33670c, this.f33668a, this.f33669b, this.f33671d, j, this.f33673f);
    }

    public final String toString() {
        String str = this.f33668a;
        String str2 = this.f33669b;
        String zzar = this.f33673f.toString();
        StringBuilder sb = new StringBuilder(zzar.length() + String.valueOf(str).length() + 33 + String.valueOf(str2).length());
        C0391c.m1061h(sb, "Event{appId='", str, "', name='", str2);
        sb.append("', params=");
        sb.append(zzar);
        sb.append('}');
        return sb.toString();
    }

    public C15028m(C15103u3 u3Var, String str, String str2, String str3, long j, long j2, zzar zzar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzar);
        this.f33668a = str2;
        this.f33669b = str3;
        this.f33670c = true == TextUtils.isEmpty(str) ? null : str;
        this.f33671d = j;
        this.f33672e = j2;
        if (j2 != 0 && j2 > j) {
            u3Var.mo52016b().f33727j.mo52239c(C15049o2.m24575p(str2), "Event created with reverse previous/current timestamps. appId, name", C15049o2.m24575p(str3));
        }
        this.f33673f = zzar;
    }
}
