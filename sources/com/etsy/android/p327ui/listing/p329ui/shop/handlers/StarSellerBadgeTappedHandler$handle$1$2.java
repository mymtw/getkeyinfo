package com.etsy.android.p327ui.listing.p329ui.shop.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10194a;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.shop.shopheader.C10644a;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.shop.handlers.StarSellerBadgeTappedHandler$handle$1$2 */
public final class StarSellerBadgeTappedHandler$handle$1$2 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C10644a.C10645a $starSeller;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarSellerBadgeTappedHandler$handle$1$2(C10644a.C10645a aVar) {
        super(1);
        this.$starSeller = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C10644a.C10645a aVar = this.$starSeller;
        gVar.mo33961a(new C19857l<C10194a, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10194a) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10194a aVar) {
                C19383o.m32797g(aVar, "$this$bottomSheetContent");
                C10644a.C10645a aVar2 = aVar;
                aVar.f22367a = aVar2.f23400c;
                aVar.f22369c = aVar2.f23401d;
            }
        });
    }
}
