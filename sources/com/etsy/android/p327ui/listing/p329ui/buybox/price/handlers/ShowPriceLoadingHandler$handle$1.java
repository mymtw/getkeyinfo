package com.etsy.android.p327ui.listing.p329ui.buybox.price.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p375jd.C12971a;
import p375jd.C12974d;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.price.handlers.ShowPriceLoadingHandler$handle$1 */
public final class ShowPriceLoadingHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C12971a $price;
    public final /* synthetic */ C12974d $priceWithDiscount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShowPriceLoadingHandler$handle$1(C12971a aVar, C12974d dVar) {
        super(1);
        this.$price = aVar;
        this.$priceWithDiscount = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C12971a aVar = this.$price;
        final C12974d dVar = this.$priceWithDiscount;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10195b bVar) {
                C19383o.m32797g(bVar, "$this$buyBox");
                C10423j jVar = aVar;
                if (jVar == null) {
                    jVar = dVar;
                }
                bVar.f22378d = jVar;
            }
        });
    }
}
