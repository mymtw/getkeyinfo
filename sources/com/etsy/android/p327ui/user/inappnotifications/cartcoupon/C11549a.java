package com.etsy.android.p327ui.user.inappnotifications.cartcoupon;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType;
import com.etsy.android.lib.models.apiv3.listing.ShopIcon;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.user.inappnotifications.cartcoupon.a */
public final class C11549a {

    /* renamed from: a */
    public final String f25557a;

    /* renamed from: b */
    public final String f25558b;

    /* renamed from: c */
    public Long f25559c;

    /* renamed from: d */
    public String f25560d;

    /* renamed from: e */
    public String f25561e;

    /* renamed from: f */
    public long f25562f;

    /* renamed from: g */
    public ShopIcon f25563g;

    /* renamed from: h */
    public InAppNotificationClickType f25564h;

    /* renamed from: i */
    public List<IANListingCard> f25565i;

    /* renamed from: j */
    public boolean f25566j;

    /* renamed from: k */
    public String f25567k;

    /* renamed from: l */
    public String f25568l;

    /* renamed from: m */
    public boolean f25569m;

    /* renamed from: n */
    public String f25570n;

    /* renamed from: o */
    public String f25571o;

    /* renamed from: p */
    public long f25572p;

    /* renamed from: q */
    public List<String> f25573q;

    public C11549a(String str, String str2, Long l, String str3, String str4, long j, ShopIcon shopIcon, InAppNotificationClickType inAppNotificationClickType, List<IANListingCard> list, boolean z, String str5, String str6, boolean z2, String str7, String str8, long j2, List<String> list2) {
        InAppNotificationClickType inAppNotificationClickType2 = inAppNotificationClickType;
        String str9 = str6;
        String str10 = str7;
        C19383o.m32797g(str2, "feedId");
        C19383o.m32797g(inAppNotificationClickType2, "clickType");
        C19383o.m32797g(str9, "couponCode");
        C19383o.m32797g(str10, "promoText");
        this.f25557a = str;
        this.f25558b = str2;
        this.f25559c = l;
        this.f25560d = str3;
        this.f25561e = str4;
        this.f25562f = j;
        this.f25563g = shopIcon;
        this.f25564h = inAppNotificationClickType2;
        this.f25565i = list;
        this.f25566j = z;
        this.f25567k = str5;
        this.f25568l = str9;
        this.f25569m = z2;
        this.f25570n = str10;
        this.f25571o = str8;
        this.f25572p = j2;
        this.f25573q = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11549a)) {
            return false;
        }
        C11549a aVar = (C11549a) obj;
        return C19383o.m32792b(this.f25557a, aVar.f25557a) && C19383o.m32792b(this.f25558b, aVar.f25558b) && C19383o.m32792b(this.f25559c, aVar.f25559c) && C19383o.m32792b(this.f25560d, aVar.f25560d) && C19383o.m32792b(this.f25561e, aVar.f25561e) && this.f25562f == aVar.f25562f && C19383o.m32792b(this.f25563g, aVar.f25563g) && this.f25564h == aVar.f25564h && C19383o.m32792b(this.f25565i, aVar.f25565i) && this.f25566j == aVar.f25566j && C19383o.m32792b(this.f25567k, aVar.f25567k) && C19383o.m32792b(this.f25568l, aVar.f25568l) && this.f25569m == aVar.f25569m && C19383o.m32792b(this.f25570n, aVar.f25570n) && C19383o.m32792b(this.f25571o, aVar.f25571o) && this.f25572p == aVar.f25572p && C19383o.m32792b(this.f25573q, aVar.f25573q);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f25558b, this.f25557a.hashCode() * 31, 31);
        Long l = this.f25559c;
        int i = 0;
        int hashCode = (e + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f25560d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25561e;
        int b = C0071c.m190b(this.f25562f, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        ShopIcon shopIcon = this.f25563g;
        int hashCode3 = (this.f25564h.hashCode() + ((b + (shopIcon == null ? 0 : shopIcon.hashCode())) * 31)) * 31;
        List<IANListingCard> list = this.f25565i;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z = this.f25566j;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        String str3 = this.f25567k;
        int e2 = C0023f.m105e(this.f25568l, (i2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        boolean z3 = this.f25569m;
        if (!z3) {
            z2 = z3;
        }
        int e3 = C0023f.m105e(this.f25570n, (e2 + (z2 ? 1 : 0)) * 31, 31);
        String str4 = this.f25571o;
        int b2 = C0071c.m190b(this.f25572p, (e3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        List<String> list2 = this.f25573q;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return b2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CartCouponUiModel(eventType=");
        h.append(this.f25557a);
        h.append(", feedId=");
        h.append(this.f25558b);
        h.append(", feedIndex=");
        h.append(this.f25559c);
        h.append(", text=");
        h.append(this.f25560d);
        h.append(", timePassed=");
        h.append(this.f25561e);
        h.append(", shopId=");
        h.append(this.f25562f);
        h.append(", shopIcon=");
        h.append(this.f25563g);
        h.append(", clickType=");
        h.append(this.f25564h);
        h.append(", listings=");
        h.append(this.f25565i);
        h.append(", isRead=");
        h.append(this.f25566j);
        h.append(", buttonText=");
        h.append(this.f25567k);
        h.append(", couponCode=");
        h.append(this.f25568l);
        h.append(", buttonEnabled=");
        h.append(this.f25569m);
        h.append(", promoText=");
        h.append(this.f25570n);
        h.append(", unavailableText=");
        h.append(this.f25571o);
        h.append(", promoOfferId=");
        h.append(this.f25572p);
        h.append(", promoOfferTokens=");
        return C0070b.m186i(h, this.f25573q, ')');
    }
}
