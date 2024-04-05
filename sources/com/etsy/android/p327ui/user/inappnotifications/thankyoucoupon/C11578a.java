package com.etsy.android.p327ui.user.inappnotifications.thankyoucoupon;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType;
import com.etsy.android.lib.models.apiv3.listing.ShopIcon;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.user.inappnotifications.thankyoucoupon.a */
public final class C11578a {

    /* renamed from: a */
    public String f25651a;

    /* renamed from: b */
    public String f25652b;

    /* renamed from: c */
    public Long f25653c;

    /* renamed from: d */
    public String f25654d;

    /* renamed from: e */
    public String f25655e;

    /* renamed from: f */
    public long f25656f;

    /* renamed from: g */
    public ShopIcon f25657g;

    /* renamed from: h */
    public InAppNotificationClickType f25658h;

    /* renamed from: i */
    public boolean f25659i;

    /* renamed from: j */
    public String f25660j;

    /* renamed from: k */
    public String f25661k;

    /* renamed from: l */
    public boolean f25662l;

    /* renamed from: m */
    public String f25663m;

    /* renamed from: n */
    public String f25664n;

    /* renamed from: o */
    public long f25665o;

    /* renamed from: p */
    public String f25666p;

    public C11578a(String str, String str2, Long l, String str3, String str4, long j, ShopIcon shopIcon, InAppNotificationClickType inAppNotificationClickType, boolean z, String str5, String str6, boolean z2, String str7, String str8, long j2, String str9) {
        InAppNotificationClickType inAppNotificationClickType2 = inAppNotificationClickType;
        String str10 = str6;
        String str11 = str7;
        String str12 = str9;
        C19383o.m32797g(str2, "feedId");
        C19383o.m32797g(inAppNotificationClickType2, "clickType");
        C19383o.m32797g(str10, "couponCode");
        C19383o.m32797g(str11, "promoText");
        C19383o.m32797g(str12, "disclaimerText");
        this.f25651a = str;
        this.f25652b = str2;
        this.f25653c = l;
        this.f25654d = str3;
        this.f25655e = str4;
        this.f25656f = j;
        this.f25657g = shopIcon;
        this.f25658h = inAppNotificationClickType2;
        this.f25659i = z;
        this.f25660j = str5;
        this.f25661k = str10;
        this.f25662l = z2;
        this.f25663m = str11;
        this.f25664n = str8;
        this.f25665o = j2;
        this.f25666p = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11578a)) {
            return false;
        }
        C11578a aVar = (C11578a) obj;
        return C19383o.m32792b(this.f25651a, aVar.f25651a) && C19383o.m32792b(this.f25652b, aVar.f25652b) && C19383o.m32792b(this.f25653c, aVar.f25653c) && C19383o.m32792b(this.f25654d, aVar.f25654d) && C19383o.m32792b(this.f25655e, aVar.f25655e) && this.f25656f == aVar.f25656f && C19383o.m32792b(this.f25657g, aVar.f25657g) && this.f25658h == aVar.f25658h && this.f25659i == aVar.f25659i && C19383o.m32792b(this.f25660j, aVar.f25660j) && C19383o.m32792b(this.f25661k, aVar.f25661k) && this.f25662l == aVar.f25662l && C19383o.m32792b(this.f25663m, aVar.f25663m) && C19383o.m32792b(this.f25664n, aVar.f25664n) && this.f25665o == aVar.f25665o && C19383o.m32792b(this.f25666p, aVar.f25666p);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f25652b, this.f25651a.hashCode() * 31, 31);
        Long l = this.f25653c;
        int i = 0;
        int hashCode = (e + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f25654d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25655e;
        int b = C0071c.m190b(this.f25656f, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        ShopIcon shopIcon = this.f25657g;
        int hashCode3 = (this.f25658h.hashCode() + ((b + (shopIcon == null ? 0 : shopIcon.hashCode())) * 31)) * 31;
        boolean z = this.f25659i;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str3 = this.f25660j;
        int e2 = C0023f.m105e(this.f25661k, (i2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        boolean z3 = this.f25662l;
        if (!z3) {
            z2 = z3;
        }
        int e3 = C0023f.m105e(this.f25663m, (e2 + (z2 ? 1 : 0)) * 31, 31);
        String str4 = this.f25664n;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return this.f25666p.hashCode() + C0071c.m190b(this.f25665o, (e3 + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ThankYouCouponUiModel(eventType=");
        h.append(this.f25651a);
        h.append(", feedId=");
        h.append(this.f25652b);
        h.append(", feedIndex=");
        h.append(this.f25653c);
        h.append(", text=");
        h.append(this.f25654d);
        h.append(", timePassed=");
        h.append(this.f25655e);
        h.append(", shopId=");
        h.append(this.f25656f);
        h.append(", shopIcon=");
        h.append(this.f25657g);
        h.append(", clickType=");
        h.append(this.f25658h);
        h.append(", isRead=");
        h.append(this.f25659i);
        h.append(", buttonText=");
        h.append(this.f25660j);
        h.append(", couponCode=");
        h.append(this.f25661k);
        h.append(", buttonEnabled=");
        h.append(this.f25662l);
        h.append(", promoText=");
        h.append(this.f25663m);
        h.append(", unavailableText=");
        h.append(this.f25664n);
        h.append(", promoId=");
        h.append(this.f25665o);
        h.append(", disclaimerText=");
        return C0391c.m1057c(h, this.f25666p, ')');
    }
}
