package com.etsy.android.p327ui.listing.p329ui.morefromshop.row;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.apiv3.listing.LightWeightListingLike;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.listing.ui.morefromshop.row.a */
public final class C10453a {

    /* renamed from: a */
    public final long f22939a;

    /* renamed from: b */
    public final boolean f22940b;

    /* renamed from: c */
    public final String f22941c;

    /* renamed from: d */
    public final EtsyMoney f22942d;

    /* renamed from: e */
    public final EtsyMoney f22943e;

    /* renamed from: f */
    public final String f22944f;

    /* renamed from: g */
    public final ListingImage f22945g;

    /* renamed from: h */
    public final String f22946h;

    /* renamed from: i */
    public final Long f22947i;

    /* renamed from: j */
    public final String f22948j;

    /* renamed from: k */
    public final String f22949k;

    /* renamed from: l */
    public final boolean f22950l;

    /* renamed from: m */
    public final boolean f22951m;

    /* renamed from: n */
    public final C10457d f22952n;

    public C10453a(long j, boolean z, String str, EtsyMoney etsyMoney, EtsyMoney etsyMoney2, String str2, ListingImage listingImage, String str3, Long l, String str4, String str5, boolean z2, boolean z3, C10457d dVar, int i) {
        String str6 = str2;
        int i2 = i;
        C10457d dVar2 = null;
        String str7 = (i2 & 4) != 0 ? null : str;
        EtsyMoney etsyMoney3 = (i2 & 8) != 0 ? null : etsyMoney;
        EtsyMoney etsyMoney4 = (i2 & 16) != 0 ? null : etsyMoney2;
        ListingImage listingImage2 = (i2 & 64) != 0 ? null : listingImage;
        String str8 = (i2 & 128) != 0 ? null : str3;
        Long l2 = (i2 & 256) != 0 ? null : l;
        String str9 = (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? null : str4;
        String str10 = (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? null : str5;
        boolean z4 = false;
        boolean z5 = (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? false : z2;
        z4 = (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? z3 : z4;
        dVar2 = (i2 & 8192) == 0 ? dVar : dVar2;
        C19383o.m32797g(str6, "priceToDisplay");
        this.f22939a = j;
        this.f22940b = z;
        this.f22941c = str7;
        this.f22942d = etsyMoney3;
        this.f22943e = etsyMoney4;
        this.f22944f = str6;
        this.f22945g = listingImage2;
        this.f22946h = str8;
        this.f22947i = l2;
        this.f22948j = str9;
        this.f22949k = str10;
        this.f22950l = z5;
        this.f22951m = z4;
        this.f22952n = dVar2;
    }

    /* renamed from: a */
    public final LightWeightListingLike mo33998a() {
        EtsyId etsyId = new EtsyId(this.f22939a);
        String str = this.f22941c;
        EtsyMoney etsyMoney = this.f22942d;
        String str2 = this.f22946h;
        String str3 = this.f22948j;
        Long l = this.f22947i;
        return new LightWeightListingLike(etsyId, str, etsyMoney, str2, this.f22945g, str3, l != null ? new EtsyId(l.longValue()) : null, this.f22940b, this.f22950l);
    }

    /* renamed from: b */
    public final boolean mo33999b() {
        return this.f22940b || this.f22950l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10453a)) {
            return false;
        }
        C10453a aVar = (C10453a) obj;
        return this.f22939a == aVar.f22939a && this.f22940b == aVar.f22940b && C19383o.m32792b(this.f22941c, aVar.f22941c) && C19383o.m32792b(this.f22942d, aVar.f22942d) && C19383o.m32792b(this.f22943e, aVar.f22943e) && C19383o.m32792b(this.f22944f, aVar.f22944f) && C19383o.m32792b(this.f22945g, aVar.f22945g) && C19383o.m32792b(this.f22946h, aVar.f22946h) && C19383o.m32792b(this.f22947i, aVar.f22947i) && C19383o.m32792b(this.f22948j, aVar.f22948j) && C19383o.m32792b(this.f22949k, aVar.f22949k) && this.f22950l == aVar.f22950l && this.f22951m == aVar.f22951m && C19383o.m32792b(this.f22952n, aVar.f22952n);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f22939a) * 31;
        boolean z = this.f22940b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.f22941c;
        boolean z3 = false;
        int hashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
        EtsyMoney etsyMoney = this.f22942d;
        int hashCode3 = (hashCode2 + (etsyMoney == null ? 0 : etsyMoney.hashCode())) * 31;
        EtsyMoney etsyMoney2 = this.f22943e;
        int e = C0023f.m105e(this.f22944f, (hashCode3 + (etsyMoney2 == null ? 0 : etsyMoney2.hashCode())) * 31, 31);
        ListingImage listingImage = this.f22945g;
        int hashCode4 = (e + (listingImage == null ? 0 : listingImage.hashCode())) * 31;
        String str2 = this.f22946h;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f22947i;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.f22948j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f22949k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z4 = this.f22950l;
        if (z4) {
            z4 = true;
        }
        int i2 = (hashCode8 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f22951m;
        if (z5) {
            z5 = true;
        }
        int i3 = (i2 + (z5 ? 1 : 0)) * 31;
        C10457d dVar = this.f22952n;
        if (dVar != null) {
            boolean z6 = dVar.f22957a;
            if (!z6) {
                z2 = z6;
            }
            z3 = z2;
        }
        return i3 + (z3 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("MoreFromShopListing(listingId=");
        h.append(this.f22939a);
        h.append(", isFavorite=");
        h.append(this.f22940b);
        h.append(", title=");
        h.append(this.f22941c);
        h.append(", rawPrice=");
        h.append(this.f22942d);
        h.append(", discountedPrice=");
        h.append(this.f22943e);
        h.append(", priceToDisplay=");
        h.append(this.f22944f);
        h.append(", image=");
        h.append(this.f22945g);
        h.append(", url=");
        h.append(this.f22946h);
        h.append(", shopId=");
        h.append(this.f22947i);
        h.append(", shopName=");
        h.append(this.f22948j);
        h.append(", contentSource=");
        h.append(this.f22949k);
        h.append(", isInCollections=");
        h.append(this.f22950l);
        h.append(", showSaleTagOnPrice=");
        h.append(this.f22951m);
        h.append(", triggerFavoriteAnimation=");
        h.append(this.f22952n);
        h.append(')');
        return h.toString();
    }
}
