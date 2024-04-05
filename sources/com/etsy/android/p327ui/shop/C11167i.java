package com.etsy.android.p327ui.shop;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.datatypes.EtsyId;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.shop.i */
public final class C11167i {

    /* renamed from: a */
    public final EtsyId f24694a;

    /* renamed from: b */
    public final String f24695b;

    /* renamed from: c */
    public final boolean f24696c;

    /* renamed from: d */
    public final ShopHomeInitialLoadConfiguration f24697d;

    /* renamed from: e */
    public final String f24698e;

    /* renamed from: f */
    public final String f24699f;

    /* renamed from: g */
    public final boolean f24700g = true;

    /* renamed from: h */
    public final boolean f24701h;

    public C11167i(EtsyId etsyId, String str, boolean z, ShopHomeInitialLoadConfiguration shopHomeInitialLoadConfiguration, String str2, String str3, boolean z2) {
        C19383o.m32797g(str, "shopName");
        this.f24694a = etsyId;
        this.f24695b = str;
        this.f24696c = z;
        this.f24697d = shopHomeInitialLoadConfiguration;
        this.f24698e = str2;
        this.f24699f = str3;
        this.f24701h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11167i)) {
            return false;
        }
        C11167i iVar = (C11167i) obj;
        return C19383o.m32792b(this.f24694a, iVar.f24694a) && C19383o.m32792b(this.f24695b, iVar.f24695b) && this.f24696c == iVar.f24696c && C19383o.m32792b(this.f24697d, iVar.f24697d) && C19383o.m32792b(this.f24698e, iVar.f24698e) && C19383o.m32792b(this.f24699f, iVar.f24699f) && this.f24700g == iVar.f24700g && this.f24701h == iVar.f24701h;
    }

    public final int hashCode() {
        EtsyId etsyId = this.f24694a;
        int i = 0;
        int e = C0023f.m105e(this.f24695b, (etsyId == null ? 0 : etsyId.hashCode()) * 31, 31);
        boolean z = this.f24696c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (e + (z ? 1 : 0)) * 31;
        ShopHomeInitialLoadConfiguration shopHomeInitialLoadConfiguration = this.f24697d;
        int hashCode = (i2 + (shopHomeInitialLoadConfiguration == null ? 0 : shopHomeInitialLoadConfiguration.hashCode())) * 31;
        String str = this.f24698e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24699f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i3 = (hashCode2 + i) * 31;
        boolean z3 = this.f24700g;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f24701h;
        if (!z4) {
            z2 = z4;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BaseShopHomePageSpecs(shopId=");
        h.append(this.f24694a);
        h.append(", shopName=");
        h.append(this.f24695b);
        h.append(", isPageDataNull=");
        h.append(this.f24696c);
        h.append(", initialLoadConfig=");
        h.append(this.f24697d);
        h.append(", listingId=");
        h.append(this.f24698e);
        h.append(", coupon=");
        h.append(this.f24699f);
        h.append(", includeShopRatings=");
        h.append(this.f24700g);
        h.append(", includeTranslations=");
        return C0391c.m1058d(h, this.f24701h, ')');
    }
}
