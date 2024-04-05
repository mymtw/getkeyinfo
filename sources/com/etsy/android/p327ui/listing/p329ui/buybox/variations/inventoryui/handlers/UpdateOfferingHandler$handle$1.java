package com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers;

import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.handlers.UpdateOfferingHandler$handle$1 */
final class UpdateOfferingHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13639f5 $event;
    public final /* synthetic */ ListingViewState.C10092d $state;
    public final /* synthetic */ C10345d this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateOfferingHandler$handle$1(ListingViewState.C10092d dVar, C13597g.C13639f5 f5Var, C10345d dVar2) {
        super(1);
        this.$state = dVar;
        this.$event = f5Var;
        this.this$0 = dVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final ListingViewState.C10092d dVar = this.$state;
        final C13597g.C13639f5 f5Var = this.$event;
        final C10345d dVar2 = this.this$0;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0069, code lost:
                r0 = r0.getUi();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(com.etsy.android.p327ui.listing.p329ui.C10195b r6) {
                /*
                    r5 = this;
                    java.lang.String r0 = "$this$buyBox"
                    kotlin.jvm.internal.C19383o.m32797g(r6, r0)
                    com.etsy.android.ui.listing.ListingViewState$d r0 = r1
                    com.etsy.android.lib.models.apiv3.listing.ListingFetch r0 = r0.f22239g
                    vc.g$f5 r1 = r2
                    com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r1 = r1.f30119a
                    com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.handlers.d r2 = r3
                    com.etsy.android.ui.listing.h r2 = r2.f22699b
                    com.etsy.android.lib.config.e r2 = r2.f22335a
                    com.etsy.android.lib.config.EtsyConfigKey r3 = com.etsy.android.lib.config.C8592b.C8601i.f18891e
                    boolean r2 = r2.mo21132b(r3)
                    com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.handlers.d r3 = r3
                    com.etsy.android.lib.util.e0 r3 = r3.f22700c
                    com.etsy.android.ui.listing.ui.buybox.stockindicator.StockIndicator r0 = com.etsy.android.p327ui.listing.p329ui.buybox.stockindicator.StockIndicator.C10306a.m18362a(r0, r1, r2, r3)
                    r6.f22377c = r0
                    com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.handlers.d r0 = r3
                    com.etsy.android.ui.listing.ui.h r0 = r0.f22698a
                    com.etsy.android.ui.listing.ListingViewState$d r1 = r1
                    com.etsy.android.lib.models.apiv3.listing.ListingFetch r2 = r1.f22239g
                    com.etsy.android.ui.listing.ui.f r1 = r1.f22238f
                    com.etsy.android.ui.listing.ui.f$a r1 = r1.f22802e
                    com.etsy.android.ui.listing.ui.buybox.signal.ListingSignalColumns r1 = r1.f22837v
                    com.etsy.android.ui.listing.ui.panels.shippingandpolicies.f r1 = r1.f22631b
                    vc.g$f5 r3 = r2
                    com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r3 = r3.f30119a
                    com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartUi r3 = r3.getUi()
                    com.etsy.android.ui.listing.ui.j r0 = r0.mo33972c(r3, r2, r1)
                    r6.f22378d = r0
                    com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.handlers.d r0 = r3
                    com.etsy.android.ui.listing.ui.h r0 = r0.f22698a
                    vc.g$f5 r1 = r2
                    com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r1 = r1.f30119a
                    com.etsy.android.lib.models.apiv3.listing.Nudge r1 = r1.getNudge()
                    com.etsy.android.ui.listing.ListingViewState$d r2 = r1
                    com.etsy.android.lib.models.apiv3.listing.ListingFetch r2 = r2.f22239g
                    com.etsy.android.lib.models.apiv3.listing.Listing r2 = r2.getListing()
                    boolean r2 = r2.canAddToCart()
                    r0.getClass()
                    com.etsy.android.ui.listing.ui.buybox.lottienudge.c r0 = com.etsy.android.p327ui.listing.p329ui.C10421h.m18420a(r1, r2)
                    r6.f22393s = r0
                    vc.g$f5 r0 = r2
                    com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r0 = r0.f30119a
                    r1 = 0
                    if (r0 == 0) goto L_0x0074
                    com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartUi r0 = r0.getUi()
                    if (r0 == 0) goto L_0x0074
                    java.lang.String r0 = r0.getUnitPriceString()
                    goto L_0x0075
                L_0x0074:
                    r0 = r1
                L_0x0075:
                    java.lang.String r0 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r0)
                    boolean r2 = p628nj.C18263b.m30839d0(r0)
                    if (r2 == 0) goto L_0x008a
                    nd.a r2 = new nd.a
                    java.lang.String r3 = "unitPrice"
                    kotlin.jvm.internal.C19383o.m32796f(r0, r3)
                    r2.<init>(r0)
                    goto L_0x008b
                L_0x008a:
                    r2 = r1
                L_0x008b:
                    r6.f22380f = r2
                    vc.g$f5 r0 = r2
                    com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r0 = r0.f30119a
                    com.etsy.android.ui.listing.ListingViewState$d r2 = r1
                    com.etsy.android.ui.listing.ui.f r2 = r2.f22238f
                    com.etsy.android.ui.listing.ui.f$a r3 = r2.f22802e
                    com.etsy.android.ui.listing.ui.j r3 = r3.f22823h
                    boolean r4 = r3 instanceof com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10334a
                    if (r4 == 0) goto L_0x00a0
                    com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.a r3 = (com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10334a) r3
                    goto L_0x00a1
                L_0x00a0:
                    r3 = r1
                L_0x00a1:
                    if (r3 == 0) goto L_0x00a6
                    com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption r3 = r3.f22681d
                    goto L_0x00a7
                L_0x00a6:
                    r3 = r1
                L_0x00a7:
                    rd.a r2 = r2.f22801d
                    com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.handlers.d r4 = r3
                    com.etsy.android.ui.core.listingnomapper.listingvariations.a r4 = r4.f22701d
                    com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.a r0 = com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10334a.C10335a.m18380a(r0, r3, r2, r4)
                    r6.f22383i = r0
                    vc.g$f5 r0 = r2
                    com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r0 = r0.f30119a
                    com.etsy.android.ui.listing.ListingViewState$d r2 = r1
                    com.etsy.android.ui.listing.ui.f r2 = r2.f22238f
                    com.etsy.android.ui.listing.ui.f$a r3 = r2.f22802e
                    com.etsy.android.ui.listing.ui.j r3 = r3.f22824i
                    boolean r4 = r3 instanceof com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10336b
                    if (r4 == 0) goto L_0x00c6
                    com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.b r3 = (com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10336b) r3
                    goto L_0x00c7
                L_0x00c6:
                    r3 = r1
                L_0x00c7:
                    if (r3 == 0) goto L_0x00cb
                    com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption r1 = r3.f22687d
                L_0x00cb:
                    rd.a r2 = r2.f22801d
                    com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.handlers.d r3 = r3
                    com.etsy.android.ui.core.listingnomapper.listingvariations.a r3 = r3.f22701d
                    com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.b r0 = com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10336b.C10337a.m18383a(r0, r1, r2, r3)
                    r6.f22384j = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers.UpdateOfferingHandler$handle$1.C103391.invoke(com.etsy.android.ui.listing.ui.b):void");
            }
        });
    }
}
