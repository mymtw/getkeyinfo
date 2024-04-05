package com.etsy.android.p327ui.core.listinggallery;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseModelImageCompat;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext;
import com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout;
import com.etsy.android.lib.models.apiv3.listing.ListingFetch;
import com.etsy.android.lib.models.apiv3.listing.ShopReview;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.core.listinggallery.e */
public final class C9680e {

    /* renamed from: a */
    public final ListingFetch f21440a;

    /* renamed from: b */
    public final ListingExpressCheckout f21441b;

    /* renamed from: c */
    public final AppsInventoryAddToCartContext f21442c;

    /* renamed from: d */
    public final String f21443d;

    /* renamed from: e */
    public final String f21444e;

    /* renamed from: f */
    public final ShopReview f21445f;

    /* renamed from: g */
    public final List<BaseModelImageCompat> f21446g;

    public C9680e() {
        this((ListingFetch) null, (ShopReview) null, (List) null, 127);
    }

    public C9680e(ListingFetch listingFetch, ListingExpressCheckout listingExpressCheckout, AppsInventoryAddToCartContext appsInventoryAddToCartContext, String str, String str2, ShopReview shopReview, List<? extends BaseModelImageCompat> list) {
        C19383o.m32797g(list, "images");
        this.f21440a = listingFetch;
        this.f21441b = listingExpressCheckout;
        this.f21442c = appsInventoryAddToCartContext;
        this.f21443d = str;
        this.f21444e = str2;
        this.f21445f = shopReview;
        this.f21446g = list;
    }

    /* renamed from: a */
    public static C9680e m18017a(C9680e eVar, String str, int i) {
        List<BaseModelImageCompat> list = null;
        ListingFetch listingFetch = (i & 1) != 0 ? eVar.f21440a : null;
        ListingExpressCheckout listingExpressCheckout = (i & 2) != 0 ? eVar.f21441b : null;
        AppsInventoryAddToCartContext appsInventoryAddToCartContext = (i & 4) != 0 ? eVar.f21442c : null;
        String str2 = (i & 8) != 0 ? eVar.f21443d : null;
        if ((i & 16) != 0) {
            str = eVar.f21444e;
        }
        String str3 = str;
        ShopReview shopReview = (i & 32) != 0 ? eVar.f21445f : null;
        if ((i & 64) != 0) {
            list = eVar.f21446g;
        }
        List<BaseModelImageCompat> list2 = list;
        C19383o.m32797g(list2, "images");
        return new C9680e(listingFetch, listingExpressCheckout, appsInventoryAddToCartContext, str2, str3, shopReview, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9680e)) {
            return false;
        }
        C9680e eVar = (C9680e) obj;
        return C19383o.m32792b(this.f21440a, eVar.f21440a) && C19383o.m32792b(this.f21441b, eVar.f21441b) && C19383o.m32792b(this.f21442c, eVar.f21442c) && C19383o.m32792b(this.f21443d, eVar.f21443d) && C19383o.m32792b(this.f21444e, eVar.f21444e) && C19383o.m32792b(this.f21445f, eVar.f21445f) && C19383o.m32792b(this.f21446g, eVar.f21446g);
    }

    public final int hashCode() {
        ListingFetch listingFetch = this.f21440a;
        int i = 0;
        int hashCode = (listingFetch == null ? 0 : listingFetch.hashCode()) * 31;
        ListingExpressCheckout listingExpressCheckout = this.f21441b;
        int hashCode2 = (hashCode + (listingExpressCheckout == null ? 0 : listingExpressCheckout.hashCode())) * 31;
        AppsInventoryAddToCartContext appsInventoryAddToCartContext = this.f21442c;
        int hashCode3 = (hashCode2 + (appsInventoryAddToCartContext == null ? 0 : appsInventoryAddToCartContext.hashCode())) * 31;
        String str = this.f21443d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21444e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShopReview shopReview = this.f21445f;
        if (shopReview != null) {
            i = shopReview.hashCode();
        }
        return this.f21446g.hashCode() + ((hashCode5 + i) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ListingState(listingFetch=");
        h.append(this.f21440a);
        h.append(", listingExpressCheckout=");
        h.append(this.f21441b);
        h.append(", inventoryContext=");
        h.append(this.f21442c);
        h.append(", personalizationEntered=");
        h.append(this.f21443d);
        h.append(", addToCartGuid=");
        h.append(this.f21444e);
        h.append(", featuredReview=");
        h.append(this.f21445f);
        h.append(", images=");
        return C0070b.m186i(h, this.f21446g, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C9680e(ListingFetch listingFetch, ShopReview shopReview, List list, int i) {
        this((i & 1) != 0 ? null : listingFetch, (ListingExpressCheckout) null, (AppsInventoryAddToCartContext) null, (String) null, (String) null, (i & 32) != 0 ? null : shopReview, (i & 64) != 0 ? EmptyList.INSTANCE : list);
    }
}
