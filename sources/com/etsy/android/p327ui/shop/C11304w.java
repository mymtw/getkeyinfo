package com.etsy.android.p327ui.shop;

import com.etsy.android.lib.models.ShopSection;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.ShopHomePage;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C19383o;
import p400mf.C13074b;

/* renamed from: com.etsy.android.ui.shop.w */
public final /* synthetic */ class C11304w implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C11127a0 f24953b;

    /* renamed from: c */
    public final /* synthetic */ C13074b f24954c;

    public /* synthetic */ C11304w(C11127a0 a0Var, C13074b bVar) {
        this.f24953b = a0Var;
        this.f24954c = bVar;
    }

    public final Object call() {
        ListingCard listingCard;
        boolean z;
        ListingCard listingCard2;
        ListingCard listingCard3;
        T t;
        boolean z2;
        T t2;
        boolean z3;
        T t3;
        boolean z4;
        C11127a0 a0Var = this.f24953b;
        C13074b bVar = this.f24954c;
        a0Var.getClass();
        C13074b.C13076b bVar2 = (C13074b.C13076b) bVar;
        ShopHomePage shopHomePage = a0Var.f24614i;
        C19383o.m32797g(bVar2, "listingUpdate");
        boolean z5 = false;
        if (shopHomePage != null) {
            List<ListingCard> featuredListings = shopHomePage.getFeaturedListings();
            if (featuredListings != null) {
                Iterator<T> it = featuredListings.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t3 = null;
                        break;
                    }
                    t3 = it.next();
                    if (bVar2.f28749a == ((ListingCard) t3).getListingId().getIdAsLongDeprecated()) {
                        z4 = true;
                        continue;
                    } else {
                        z4 = false;
                        continue;
                    }
                    if (z4) {
                        break;
                    }
                }
                listingCard = (ListingCard) t3;
            } else {
                listingCard = null;
            }
            if (listingCard != null) {
                listingCard.setIsFavorite(bVar2.f28750b);
                z = true;
            } else {
                z = false;
            }
            List<ListingCard> shopListings = shopHomePage.getShopListings();
            if (shopListings != null) {
                Iterator<T> it2 = shopListings.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        t2 = null;
                        break;
                    }
                    t2 = it2.next();
                    if (bVar2.f28749a == ((ListingCard) t2).getListingId().getIdAsLongDeprecated()) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = false;
                        continue;
                    }
                    if (z3) {
                        break;
                    }
                }
                listingCard2 = (ListingCard) t2;
            } else {
                listingCard2 = null;
            }
            if (listingCard2 != null) {
                listingCard2.setIsFavorite(bVar2.f28750b);
                z = true;
            }
            List<ShopSection> shopSections = shopHomePage.getShopSections();
            if (shopSections != null) {
                for (ShopSection listings : shopSections) {
                    List<ListingCard> listings2 = listings.getListings();
                    if (listings2 != null) {
                        Iterator<T> it3 = listings2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it3.next();
                            if (bVar2.f28749a == ((ListingCard) t).getListingId().getIdAsLongDeprecated()) {
                                z2 = true;
                                continue;
                            } else {
                                z2 = false;
                                continue;
                            }
                            if (z2) {
                                break;
                            }
                        }
                        listingCard3 = (ListingCard) t;
                    } else {
                        listingCard3 = null;
                    }
                    if (listingCard3 != null) {
                        listingCard3.setIsFavorite(bVar2.f28750b);
                        z = true;
                    }
                }
            }
            z5 = z;
        }
        return Boolean.valueOf(z5);
    }
}
