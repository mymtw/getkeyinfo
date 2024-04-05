package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10453a;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10457d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.n */
public final class C10458n {

    /* renamed from: a */
    public Long f22958a;

    /* renamed from: b */
    public boolean f22959b;

    /* renamed from: c */
    public String f22960c;

    /* renamed from: d */
    public EtsyMoney f22961d;

    /* renamed from: e */
    public String f22962e;

    /* renamed from: f */
    public ListingImage f22963f;

    /* renamed from: g */
    public String f22964g;

    /* renamed from: h */
    public Long f22965h;

    /* renamed from: i */
    public String f22966i;

    /* renamed from: j */
    public String f22967j;

    /* renamed from: k */
    public boolean f22968k;

    /* renamed from: l */
    public boolean f22969l;

    /* renamed from: m */
    public C10457d f22970m;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10458n(com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10453a r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "moreFromShopListing"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            long r1 = r0.f22939a
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            boolean r5 = r0.f22940b
            java.lang.String r6 = r0.f22941c
            com.etsy.android.lib.currency.EtsyMoney r7 = r0.f22942d
            java.lang.String r8 = r0.f22944f
            com.etsy.android.lib.models.apiv3.listing.ListingImage r9 = r0.f22945g
            java.lang.String r10 = r0.f22946h
            java.lang.Long r11 = r0.f22947i
            java.lang.String r12 = r0.f22948j
            java.lang.String r13 = r0.f22949k
            boolean r14 = r0.f22950l
            boolean r15 = r0.f22951m
            com.etsy.android.ui.listing.ui.morefromshop.row.d r0 = r0.f22952n
            r3 = r17
            r16 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.C10458n.<init>(com.etsy.android.ui.listing.ui.morefromshop.row.a):void");
    }

    /* renamed from: a */
    public final C10453a mo34009a() {
        Long l = this.f22958a;
        C19383o.m32794d(l);
        long longValue = l.longValue();
        boolean z = this.f22959b;
        String str = this.f22960c;
        EtsyMoney etsyMoney = this.f22961d;
        String str2 = this.f22962e;
        C19383o.m32794d(str2);
        return new C10453a(longValue, z, str, etsyMoney, (EtsyMoney) null, str2, this.f22963f, this.f22964g, this.f22965h, this.f22966i, this.f22967j, this.f22968k, this.f22969l, this.f22970m, 16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10458n)) {
            return false;
        }
        C10458n nVar = (C10458n) obj;
        return C19383o.m32792b(this.f22958a, nVar.f22958a) && this.f22959b == nVar.f22959b && C19383o.m32792b(this.f22960c, nVar.f22960c) && C19383o.m32792b(this.f22961d, nVar.f22961d) && C19383o.m32792b(this.f22962e, nVar.f22962e) && C19383o.m32792b(this.f22963f, nVar.f22963f) && C19383o.m32792b(this.f22964g, nVar.f22964g) && C19383o.m32792b(this.f22965h, nVar.f22965h) && C19383o.m32792b(this.f22966i, nVar.f22966i) && C19383o.m32792b(this.f22967j, nVar.f22967j) && this.f22968k == nVar.f22968k && this.f22969l == nVar.f22969l && C19383o.m32792b(this.f22970m, nVar.f22970m);
    }

    public final int hashCode() {
        Long l = this.f22958a;
        boolean z = false;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        boolean z2 = this.f22959b;
        if (z2) {
            z2 = true;
        }
        int i = (hashCode + (z2 ? 1 : 0)) * 31;
        String str = this.f22960c;
        int hashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
        EtsyMoney etsyMoney = this.f22961d;
        int hashCode3 = (hashCode2 + (etsyMoney == null ? 0 : etsyMoney.hashCode())) * 31;
        String str2 = this.f22962e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ListingImage listingImage = this.f22963f;
        int hashCode5 = (hashCode4 + (listingImage == null ? 0 : listingImage.hashCode())) * 31;
        String str3 = this.f22964g;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.f22965h;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.f22966i;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f22967j;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z3 = this.f22968k;
        if (z3) {
            z3 = true;
        }
        int i2 = (hashCode9 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f22969l;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        C10457d dVar = this.f22970m;
        if (dVar != null && (z = dVar.f22957a)) {
            z = true;
        }
        return i3 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("MoreFromShopListingBuilder(listingId=");
        h.append(this.f22958a);
        h.append(", isFavorite=");
        h.append(this.f22959b);
        h.append(", title=");
        h.append(this.f22960c);
        h.append(", rawPrice=");
        h.append(this.f22961d);
        h.append(", priceToDisplay=");
        h.append(this.f22962e);
        h.append(", image=");
        h.append(this.f22963f);
        h.append(", url=");
        h.append(this.f22964g);
        h.append(", shopId=");
        h.append(this.f22965h);
        h.append(", shopName=");
        h.append(this.f22966i);
        h.append(", contentSource=");
        h.append(this.f22967j);
        h.append(", isInCollections=");
        h.append(this.f22968k);
        h.append(", showSaleTagOnPrice=");
        h.append(this.f22969l);
        h.append(", triggerFavoriteAnimation=");
        h.append(this.f22970m);
        h.append(')');
        return h.toString();
    }

    public C10458n() {
        this((Long) null, false, (String) null, (EtsyMoney) null, (String) null, (ListingImage) null, (String) null, (Long) null, (String) null, (String) null, false, false, (C10457d) null);
    }

    public C10458n(Long l, boolean z, String str, EtsyMoney etsyMoney, String str2, ListingImage listingImage, String str3, Long l2, String str4, String str5, boolean z2, boolean z3, C10457d dVar) {
        this.f22958a = l;
        this.f22959b = z;
        this.f22960c = str;
        this.f22961d = etsyMoney;
        this.f22962e = str2;
        this.f22963f = listingImage;
        this.f22964g = str3;
        this.f22965h = l2;
        this.f22966i = str4;
        this.f22967j = str5;
        this.f22968k = z2;
        this.f22969l = z3;
        this.f22970m = dVar;
    }
}
