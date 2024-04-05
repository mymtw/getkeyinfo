package com.etsy.android.p327ui.user.purchases.module;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.user.purchases.module.e */
public final class C11664e {

    /* renamed from: a */
    public final String f25814a;

    /* renamed from: b */
    public final String f25815b;

    /* renamed from: c */
    public final String f25816c;

    /* renamed from: d */
    public final String f25817d;

    public C11664e(String str, String str2, String str3, String str4) {
        C19383o.m32797g(str, "linkTitle");
        C19383o.m32797g(str2, "apiPath");
        this.f25814a = str;
        this.f25815b = str2;
        this.f25816c = str3;
        this.f25817d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11664e)) {
            return false;
        }
        C11664e eVar = (C11664e) obj;
        return C19383o.m32792b(this.f25814a, eVar.f25814a) && C19383o.m32792b(this.f25815b, eVar.f25815b) && C19383o.m32792b(this.f25816c, eVar.f25816c) && C19383o.m32792b(this.f25817d, eVar.f25817d);
    }

    public final int hashCode() {
        return this.f25817d.hashCode() + C0023f.m105e(this.f25816c, C0023f.m105e(this.f25815b, this.f25814a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ModuleLandingPageUiModel(linkTitle=");
        h.append(this.f25814a);
        h.append(", apiPath=");
        h.append(this.f25815b);
        h.append(", linkLandingTitle=");
        h.append(this.f25816c);
        h.append(", eventName=");
        return C0391c.m1057c(h, this.f25817d, ')');
    }
}
