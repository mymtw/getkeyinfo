package com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartUi;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiSelect;
import com.etsy.android.p327ui.listing.ListingViewState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.cartbutton.handlers.b */
public final class C10232b {

    /* renamed from: a */
    public final C13573c f22506a;

    /* renamed from: b */
    public final C8694h f22507b;

    public C10232b(C13573c cVar, C8694h hVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(hVar, "logCat");
        this.f22506a = cVar;
        this.f22507b = hVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo33616a(ListingViewState.C10092d dVar, C13597g.C13605b bVar) {
        AppsInventoryAddToCartUi ui;
        List<AppsInventoryUiSelect> selects;
        Long value;
        C19383o.m32797g(bVar, "event");
        this.f22506a.mo38043a(C13597g.C13696o.f30201a);
        this.f22506a.mo38043a(C13597g.C13612c.f30085a);
        this.f22506a.mo38043a(C13597g.C13624d4.f30100a);
        this.f22506a.mo38043a(new C13597g.C13626e(bVar.f30076a));
        C13573c cVar = this.f22506a;
        AppsInventoryAddToCartContext appsInventoryAddToCartContext = dVar.f22241i;
        ArrayList arrayList = new ArrayList();
        if (!(appsInventoryAddToCartContext == null || (ui = appsInventoryAddToCartContext.getUi()) == null || (selects = ui.getSelects()) == null)) {
            for (AppsInventoryUiSelect selectedOption : selects) {
                AppsInventoryUiOption selectedOption2 = selectedOption.selectedOption();
                if (!(selectedOption2 == null || (value = selectedOption2.getValue()) == null)) {
                    arrayList.add(value.toString());
                }
            }
        }
        Map<Long, Long> variationImages = dVar.f22239g.getVariationImages();
        boolean z = false;
        if (variationImages != null && (!variationImages.isEmpty())) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                String str = (String) arrayList.get(i);
                try {
                    if (variationImages.containsKey(Long.valueOf(Long.parseLong(str)))) {
                        z = true;
                        break;
                    }
                    i++;
                } catch (NumberFormatException unused) {
                    C8694h hVar = this.f22507b;
                    String format = String.format("Invalid variation id %s", Arrays.copyOf(new Object[]{str}, 1));
                    C19383o.m32796f(format, "format(format, *args)");
                    hVar.mo21313g(format);
                }
            }
        }
        cVar.mo38043a(new C13597g.C13633f(z ? "add_to_cart_with_variation_photos" : "add_to_cart", C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.LISTING_ID, String.valueOf(dVar.f22239g.getListing().getListingId())))));
        this.f22506a.mo38043a(C13597g.C13641g0.f30122a);
        return C13574d.C13575a.f29662a;
    }
}
