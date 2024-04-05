package com.etsy.android.p327ui.home.home;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.home.home.k */
public final class C10011k {

    /* renamed from: a */
    public final boolean f22032a;

    /* renamed from: b */
    public final String f22033b;

    /* renamed from: c */
    public final Map<String, String> f22034c = null;

    /* renamed from: d */
    public final boolean f22035d;

    /* renamed from: e */
    public final boolean f22036e;

    /* renamed from: f */
    public final boolean f22037f;

    /* renamed from: g */
    public final String f22038g;

    /* renamed from: h */
    public final Boolean f22039h;

    /* renamed from: i */
    public final boolean f22040i;

    /* renamed from: j */
    public final String f22041j;

    /* renamed from: k */
    public final Long f22042k;

    /* renamed from: l */
    public final Long f22043l;

    public C10011k(boolean z, String str, boolean z2, boolean z3, boolean z4, String str2, Boolean bool, boolean z5, String str3, Long l, Long l2) {
        C19383o.m32797g(str, "url");
        this.f22032a = z;
        this.f22033b = str;
        this.f22035d = z2;
        this.f22036e = z3;
        this.f22037f = z4;
        this.f22038g = str2;
        this.f22039h = bool;
        this.f22040i = z5;
        this.f22041j = str3;
        this.f22042k = l;
        this.f22043l = l2;
    }

    /* renamed from: a */
    public final HashMap mo33238a() {
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.f22034c;
        if (map != null) {
            hashMap.putAll(map);
        }
        String str = this.f22038g;
        if (str != null) {
            hashMap.put("coupon_code", str);
        }
        Long l = this.f22042k;
        if (l != null) {
            hashMap.put(ResponseConstants.RECEIPT_ID, String.valueOf(l.longValue()));
        }
        Long l2 = this.f22043l;
        if (l2 != null) {
            hashMap.put(ResponseConstants.RECEIPT_SHIPPING_ID, String.valueOf(l2.longValue()));
        }
        if (!C19383o.m32792b(this.f22039h, Boolean.TRUE)) {
            return hashMap;
        }
        hashMap.put("is_tablet", String.valueOf(this.f22040i));
        hashMap.put(EventsNameKt.DEVICE_ID, this.f22041j);
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10011k)) {
            return false;
        }
        C10011k kVar = (C10011k) obj;
        return this.f22032a == kVar.f22032a && C19383o.m32792b(this.f22033b, kVar.f22033b) && C19383o.m32792b(this.f22034c, kVar.f22034c) && this.f22035d == kVar.f22035d && this.f22036e == kVar.f22036e && this.f22037f == kVar.f22037f && C19383o.m32792b(this.f22038g, kVar.f22038g) && C19383o.m32792b(this.f22039h, kVar.f22039h) && this.f22040i == kVar.f22040i && C19383o.m32792b(this.f22041j, kVar.f22041j) && C19383o.m32792b(this.f22042k, kVar.f22042k) && C19383o.m32792b(this.f22043l, kVar.f22043l);
    }

    public final int hashCode() {
        boolean z = this.f22032a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int e = C0023f.m105e(this.f22033b, (z ? 1 : 0) * true, 31);
        Map<String, String> map = this.f22034c;
        int i = 0;
        int hashCode = (e + (map == null ? 0 : map.hashCode())) * 31;
        boolean z3 = this.f22035d;
        if (z3) {
            z3 = true;
        }
        int i2 = (hashCode + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f22036e;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f22037f;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        String str = this.f22038g;
        int hashCode2 = (i4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f22039h;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z6 = this.f22040i;
        if (!z6) {
            z2 = z6;
        }
        int e2 = C0023f.m105e(this.f22041j, (hashCode3 + (z2 ? 1 : 0)) * 31, 31);
        Long l = this.f22042k;
        int hashCode4 = (e2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f22043l;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("LoadHomeSpec(isExplore=");
        h.append(this.f22032a);
        h.append(", url=");
        h.append(this.f22033b);
        h.append(", paginationParams=");
        h.append(this.f22034c);
        h.append(", showAdminTabs=");
        h.append(this.f22035d);
        h.append(", isSignedIn=");
        h.append(this.f22036e);
        h.append(", showSignedOutContent=");
        h.append(this.f22037f);
        h.append(", couponCode=");
        h.append(this.f22038g);
        h.append(", needsRecentlyViewedIds=");
        h.append(this.f22039h);
        h.append(", isTablet=");
        h.append(this.f22040i);
        h.append(", deviceId=");
        h.append(this.f22041j);
        h.append(", receiptId=");
        h.append(this.f22042k);
        h.append(", trackingId=");
        h.append(this.f22043l);
        h.append(')');
        return h.toString();
    }
}
