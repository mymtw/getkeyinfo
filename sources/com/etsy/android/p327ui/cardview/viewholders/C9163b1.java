package com.etsy.android.p327ui.cardview.viewholders;

import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.Variation;
import com.etsy.android.lib.models.apiv3.FormattedMoney;
import com.etsy.android.lib.models.apiv3.Money;
import com.etsy.android.lib.models.apiv3.cart.SavedCart;
import com.etsy.android.lib.models.apiv3.cart.SavedCartListing;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.cardview.viewholders.b1 */
public final class C9163b1 {

    /* renamed from: a */
    public final SavedCart f20152a;

    /* renamed from: b */
    public final SavedCartListing f20153b;

    /* renamed from: c */
    public final String f20154c;

    /* renamed from: d */
    public final boolean f20155d;

    /* renamed from: e */
    public final boolean f20156e;

    /* renamed from: f */
    public final EtsyId f20157f;

    /* renamed from: g */
    public final String f20158g;

    /* renamed from: h */
    public final ListingImage f20159h;

    /* renamed from: i */
    public final String f20160i;

    /* renamed from: j */
    public final String f20161j;

    /* renamed from: k */
    public final String f20162k;

    /* renamed from: l */
    public final boolean f20163l;

    /* renamed from: m */
    public final boolean f20164m;

    /* renamed from: n */
    public final int f20165n;

    /* renamed from: o */
    public final String f20166o;

    /* renamed from: p */
    public final String f20167p;

    /* renamed from: q */
    public final boolean f20168q;

    /* renamed from: r */
    public final boolean f20169r;

    public C9163b1(SavedCart savedCart, SavedCartListing savedCartListing) {
        String str;
        EtsyMoney asEtsyMoney;
        C19383o.m32797g(savedCart, "savedCart");
        this.f20152a = savedCart;
        this.f20153b = savedCartListing;
        String title = savedCartListing.getTitle();
        String str2 = "";
        this.f20154c = title == null ? str2 : title;
        this.f20155d = savedCart.getViewState().isLoading();
        this.f20156e = savedCart.isAvailable();
        this.f20157f = savedCart.getShopCard().getShopId();
        String shopName = savedCart.getShopCard().getShopName();
        this.f20158g = shopName == null ? str2 : shopName;
        this.f20159h = savedCartListing.getListingImage();
        String itemPriceString = savedCartListing.getItemPriceString();
        this.f20160i = itemPriceString == null ? str2 : itemPriceString;
        Money discountedPrice = savedCartListing.getDiscountedPrice();
        String str3 = (discountedPrice == null || (asEtsyMoney = discountedPrice.asEtsyMoney()) == null || (str3 = asEtsyMoney.format()) == null) ? str2 : str3;
        this.f20161j = str3;
        FormattedMoney discountDescription = savedCart.getDiscountDescription();
        String str4 = (discountDescription == null || (str4 = discountDescription.toString()) == null) ? str2 : str4;
        this.f20162k = str4;
        boolean z = false;
        this.f20163l = C18263b.m30837c0(str3) && C18263b.m30837c0(str4);
        boolean z2 = savedCartListing.getPurchaseQuantity() > 1;
        this.f20164m = z2;
        this.f20165n = savedCartListing.getPurchaseQuantity();
        if (savedCartListing.getSelectedVariations().size() > 0) {
            Variation variation = savedCartListing.getSelectedVariations().get(0);
            str = variation.getFormattedName() + ": " + variation.getFormattedValue();
        } else {
            str = str2;
        }
        this.f20166o = str;
        if (savedCartListing.getSelectedVariations().size() > 1) {
            Variation variation2 = savedCartListing.getSelectedVariations().get(1);
            str2 = variation2.getFormattedName() + ": " + variation2.getFormattedValue();
        }
        this.f20167p = str2;
        this.f20168q = z2 || C18263b.m30837c0(str) || C18263b.m30837c0(str2);
        if (!savedCartListing.isDigital() && !savedCartListing.isGiftCard()) {
            z = true;
        }
        this.f20169r = z;
    }
}
