package com.etsy.android.p327ui.home.tabs;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.tabs.a */
public final class C10051a {

    /* renamed from: a */
    public final boolean f22141a;

    /* renamed from: b */
    public final boolean f22142b;

    /* renamed from: c */
    public final String f22143c;

    /* renamed from: d */
    public final byte[] f22144d;

    /* renamed from: e */
    public final boolean f22145e;

    /* renamed from: f */
    public final boolean f22146f;

    /* renamed from: g */
    public final Long f22147g;

    /* renamed from: h */
    public final Long f22148h;

    public C10051a(boolean z, boolean z2, String str, byte[] bArr, boolean z3, boolean z4, Long l, Long l2) {
        C19383o.m32797g(bArr, "requestBody");
        this.f22141a = z;
        this.f22142b = z2;
        this.f22143c = str;
        this.f22144d = bArr;
        this.f22145e = z3;
        this.f22146f = z4;
        this.f22147g = l;
        this.f22148h = l2;
    }

    /* renamed from: a */
    public final LinkedHashMap mo33350a() {
        LinkedHashMap t0 = C19294b0.m32563t0(new Pair("include_content", "true"), new Pair("is_tablet", String.valueOf(this.f22141a)), new Pair("is_refresh", "true"));
        String str = this.f22143c;
        if (str != null) {
            t0.put("coupon_code", str);
        }
        Long l = this.f22147g;
        if (l != null) {
            t0.put(ResponseConstants.RECEIPT_ID, String.valueOf(l.longValue()));
        }
        Long l2 = this.f22148h;
        if (l2 != null) {
            t0.put(ResponseConstants.RECEIPT_SHIPPING_ID, String.valueOf(l2.longValue()));
        }
        if (this.f22146f && !this.f22145e) {
            t0.put(ResponseConstants.IS_GUEST, "true");
            t0.put("show_onboarding_banner_redesign", "true");
            t0.put("include_content", "true");
        }
        return t0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10051a)) {
            return false;
        }
        C10051a aVar = (C10051a) obj;
        return this.f22141a == aVar.f22141a && this.f22142b == aVar.f22142b && C19383o.m32792b(this.f22143c, aVar.f22143c) && C19383o.m32792b(this.f22144d, aVar.f22144d) && this.f22145e == aVar.f22145e && this.f22146f == aVar.f22146f && C19383o.m32792b(this.f22147g, aVar.f22147g) && C19383o.m32792b(this.f22148h, aVar.f22148h);
    }

    public final int hashCode() {
        boolean z = this.f22141a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f22142b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        String str = this.f22143c;
        int i3 = 0;
        int hashCode = (Arrays.hashCode(this.f22144d) + ((i2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        boolean z4 = this.f22145e;
        if (z4) {
            z4 = true;
        }
        int i4 = (hashCode + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f22146f;
        if (!z5) {
            z2 = z5;
        }
        int i5 = (i4 + (z2 ? 1 : 0)) * 31;
        Long l = this.f22147g;
        int hashCode2 = (i5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f22148h;
        if (l2 != null) {
            i3 = l2.hashCode();
        }
        return hashCode2 + i3;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("GetHomeScreenTabsSpecs(isWide=");
        h.append(this.f22141a);
        h.append(", isAdminTabsEnabled=");
        h.append(this.f22142b);
        h.append(", couponCode=");
        h.append(this.f22143c);
        h.append(", requestBody=");
        h.append(Arrays.toString(this.f22144d));
        h.append(", isSignedIn=");
        h.append(this.f22145e);
        h.append(", showSignedOutContent=");
        h.append(this.f22146f);
        h.append(", receiptId=");
        h.append(this.f22147g);
        h.append(", trackingId=");
        h.append(this.f22148h);
        h.append(')');
        return h.toString();
    }
}
