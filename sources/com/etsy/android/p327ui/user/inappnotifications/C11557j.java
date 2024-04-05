package com.etsy.android.p327ui.user.inappnotifications;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.j */
public final class C11557j {

    /* renamed from: a */
    public final long f25595a;

    /* renamed from: b */
    public final long f25596b;

    /* renamed from: c */
    public final String f25597c;

    /* renamed from: d */
    public final C19857l<C11580v, C19394m> f25598d;

    public C11557j(long j, long j2, String str, C19857l<? super C11580v, C19394m> lVar) {
        C19383o.m32797g(str, "shopName");
        C19383o.m32797g(lVar, "clickHandler");
        this.f25595a = j;
        this.f25596b = j2;
        this.f25597c = str;
        this.f25598d = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11557j)) {
            return false;
        }
        C11557j jVar = (C11557j) obj;
        return this.f25595a == jVar.f25595a && this.f25596b == jVar.f25596b && C19383o.m32792b(this.f25597c, jVar.f25597c) && C19383o.m32792b(this.f25598d, jVar.f25598d);
    }

    public final int hashCode() {
        return this.f25598d.hashCode() + C0023f.m105e(this.f25597c, C0071c.m190b(this.f25596b, Long.hashCode(this.f25595a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("IANShopViewHolderDependencies(shopUserId=");
        h.append(this.f25595a);
        h.append(", shopId=");
        h.append(this.f25596b);
        h.append(", shopName=");
        h.append(this.f25597c);
        h.append(", clickHandler=");
        h.append(this.f25598d);
        h.append(')');
        return h.toString();
    }
}
