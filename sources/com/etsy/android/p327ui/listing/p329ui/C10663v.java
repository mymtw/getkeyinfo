package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.sellerinfo.favoriting.C10639c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.listing.ui.v */
public final class C10663v {

    /* renamed from: a */
    public final String f23453a;

    /* renamed from: b */
    public final String f23454b;

    /* renamed from: c */
    public final String f23455c;

    /* renamed from: d */
    public final long f23456d;

    /* renamed from: e */
    public final boolean f23457e;

    /* renamed from: f */
    public final long f23458f;

    /* renamed from: g */
    public final String f23459g;

    /* renamed from: h */
    public final String f23460h;

    /* renamed from: i */
    public final String f23461i;

    /* renamed from: j */
    public C10639c f23462j;

    public C10663v() {
        this("", "", (String) null, 0, true, 0, "", "", "", (C10639c) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10663v)) {
            return false;
        }
        C10663v vVar = (C10663v) obj;
        return C19383o.m32792b(this.f23453a, vVar.f23453a) && C19383o.m32792b(this.f23454b, vVar.f23454b) && C19383o.m32792b(this.f23455c, vVar.f23455c) && this.f23456d == vVar.f23456d && this.f23457e == vVar.f23457e && this.f23458f == vVar.f23458f && C19383o.m32792b(this.f23459g, vVar.f23459g) && C19383o.m32792b(this.f23460h, vVar.f23460h) && C19383o.m32792b(this.f23461i, vVar.f23461i) && C19383o.m32792b(this.f23462j, vVar.f23462j);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f23454b, this.f23453a.hashCode() * 31, 31);
        String str = this.f23455c;
        int i = 0;
        int b = C0071c.m190b(this.f23456d, (e + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z = this.f23457e;
        if (z) {
            z = true;
        }
        int e2 = C0023f.m105e(this.f23461i, C0023f.m105e(this.f23460h, C0023f.m105e(this.f23459g, C0071c.m190b(this.f23458f, (b + (z ? 1 : 0)) * 31, 31), 31), 31), 31);
        C10639c cVar = this.f23462j;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return e2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SellerInfoBuilder(shopOwnerName=");
        h.append(this.f23453a);
        h.append(", shopName=");
        h.append(this.f23454b);
        h.append(", imageUrl=");
        h.append(this.f23455c);
        h.append(", shopId=");
        h.append(this.f23456d);
        h.append(", showContactSellerButton=");
        h.append(this.f23457e);
        h.append(", listingId=");
        h.append(this.f23458f);
        h.append(", shopOwnerUsername=");
        h.append(this.f23459g);
        h.append(", subject=");
        h.append(this.f23460h);
        h.append(", message=");
        h.append(this.f23461i);
        h.append(", favoriteInfo=");
        h.append(this.f23462j);
        h.append(')');
        return h.toString();
    }

    public C10663v(String str, String str2, String str3, long j, boolean z, long j2, String str4, String str5, String str6, C10639c cVar) {
        C19383o.m32797g(str, "shopOwnerName");
        C19383o.m32797g(str2, "shopName");
        C19383o.m32797g(str4, "shopOwnerUsername");
        C19383o.m32797g(str5, ResponseConstants.SUBJECT);
        C19383o.m32797g(str6, "message");
        this.f23453a = str;
        this.f23454b = str2;
        this.f23455c = str3;
        this.f23456d = j;
        this.f23457e = z;
        this.f23458f = j2;
        this.f23459g = str4;
        this.f23460h = str5;
        this.f23461i = str6;
        this.f23462j = cVar;
    }
}
