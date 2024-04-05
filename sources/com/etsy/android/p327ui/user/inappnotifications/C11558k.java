package com.etsy.android.p327ui.user.inappnotifications;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard;
import com.etsy.android.lib.models.apiv3.listing.ShopIcon;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.inappnotifications.k */
public final class C11558k {

    /* renamed from: a */
    public final int f25599a;

    /* renamed from: b */
    public final int f25600b;

    /* renamed from: c */
    public final ShopIcon f25601c;

    /* renamed from: d */
    public final String f25602d;

    /* renamed from: e */
    public final String f25603e;

    /* renamed from: f */
    public final boolean f25604f;

    /* renamed from: g */
    public final List<IANListingCard> f25605g;

    public C11558k(int i, int i2, ShopIcon shopIcon, String str, String str2, boolean z, List<IANListingCard> list) {
        this.f25599a = i;
        this.f25600b = i2;
        this.f25601c = shopIcon;
        this.f25602d = str;
        this.f25603e = str2;
        this.f25604f = z;
        this.f25605g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11558k)) {
            return false;
        }
        C11558k kVar = (C11558k) obj;
        return this.f25599a == kVar.f25599a && this.f25600b == kVar.f25600b && C19383o.m32792b(this.f25601c, kVar.f25601c) && C19383o.m32792b(this.f25602d, kVar.f25602d) && C19383o.m32792b(this.f25603e, kVar.f25603e) && this.f25604f == kVar.f25604f && C19383o.m32792b(this.f25605g, kVar.f25605g);
    }

    public final int hashCode() {
        int a = C0069a.m170a(this.f25600b, Integer.hashCode(this.f25599a) * 31, 31);
        ShopIcon shopIcon = this.f25601c;
        int i = 0;
        int hashCode = (a + (shopIcon == null ? 0 : shopIcon.hashCode())) * 31;
        String str = this.f25602d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25603e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.f25604f;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        List<IANListingCard> list = this.f25605g;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("IANUiModel(avatarSize=");
        h.append(this.f25599a);
        h.append(", scrollPosition=");
        h.append(this.f25600b);
        h.append(", shopIcon=");
        h.append(this.f25601c);
        h.append(", notificationText=");
        h.append(this.f25602d);
        h.append(", notificationTimePassed=");
        h.append(this.f25603e);
        h.append(", notificationIsRead=");
        h.append(this.f25604f);
        h.append(", listings=");
        return C0070b.m186i(h, this.f25605g, ')');
    }
}
