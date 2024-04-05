package com.etsy.android.p327ui.user.inappnotifications;

import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.user.inappnotifications.IANShopUiModel */
public final class IANShopUiModel {

    /* renamed from: a */
    public final String f25441a;

    /* renamed from: b */
    public final Float f25442b;

    /* renamed from: c */
    public final Integer f25443c;

    /* renamed from: d */
    public final boolean f25444d;

    /* renamed from: e */
    public final String f25445e;

    /* renamed from: f */
    public final List<String> f25446f;

    /* renamed from: g */
    public final ShopCardType f25447g;

    /* renamed from: com.etsy.android.ui.user.inappnotifications.IANShopUiModel$ShopCardType */
    public enum ShopCardType {
        SCROLLING_SHOP,
        CHIP_SHOP
    }

    public IANShopUiModel(String str, Float f, Integer num, boolean z, String str2, ArrayList arrayList, ShopCardType shopCardType) {
        C19383o.m32797g(str, "shopName");
        C19383o.m32797g(shopCardType, "shopCardType");
        this.f25441a = str;
        this.f25442b = f;
        this.f25443c = num;
        this.f25444d = z;
        this.f25445e = str2;
        this.f25446f = arrayList;
        this.f25447g = shopCardType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IANShopUiModel)) {
            return false;
        }
        IANShopUiModel iANShopUiModel = (IANShopUiModel) obj;
        return C19383o.m32792b(this.f25441a, iANShopUiModel.f25441a) && C19383o.m32792b(this.f25442b, iANShopUiModel.f25442b) && C19383o.m32792b(this.f25443c, iANShopUiModel.f25443c) && this.f25444d == iANShopUiModel.f25444d && C19383o.m32792b(this.f25445e, iANShopUiModel.f25445e) && C19383o.m32792b(this.f25446f, iANShopUiModel.f25446f) && this.f25447g == iANShopUiModel.f25447g;
    }

    public final int hashCode() {
        int hashCode = this.f25441a.hashCode() * 31;
        Float f = this.f25442b;
        int i = 0;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.f25443c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.f25444d;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str = this.f25445e;
        if (str != null) {
            i = str.hashCode();
        }
        return this.f25447g.hashCode() + C13983i.m21488g(this.f25446f, (i2 + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("IANShopUiModel(shopName=");
        h.append(this.f25441a);
        h.append(", rating=");
        h.append(this.f25442b);
        h.append(", reviewCount=");
        h.append(this.f25443c);
        h.append(", isFavorite=");
        h.append(this.f25444d);
        h.append(", sellerAvatarUrl=");
        h.append(this.f25445e);
        h.append(", displayListingUrls=");
        h.append(this.f25446f);
        h.append(", shopCardType=");
        h.append(this.f25447g);
        h.append(')');
        return h.toString();
    }
}
