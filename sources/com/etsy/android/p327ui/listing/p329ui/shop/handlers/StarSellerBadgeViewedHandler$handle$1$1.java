package com.etsy.android.p327ui.listing.p329ui.shop.handlers;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10409f;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.shop.shopheader.C10644a;
import com.etsy.android.uikit.p331ui.core.NumericRatingView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.shop.handlers.StarSellerBadgeViewedHandler$handle$1$1 */
public final class StarSellerBadgeViewedHandler$handle$1$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C10644a.C10645a $starSeller;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarSellerBadgeViewedHandler$handle$1$1(C10644a.C10645a aVar) {
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
        C106411 r0 = new C19857l<C10419g.C10420a, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10419g.C10420a) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10419g.C10420a aVar) {
                C10644a aVar2;
                C10419g.C10420a aVar3 = aVar;
                C19383o.m32797g(aVar3, "$this$shop");
                C10644a aVar4 = aVar3.f22877a;
                if (aVar4 != null) {
                    C10644a.C10645a aVar5 = aVar;
                    boolean z = aVar5.f23398a;
                    String str = aVar5.f23399b;
                    String str2 = aVar5.f23400c;
                    String str3 = aVar5.f23401d;
                    String str4 = aVar5.f23402e;
                    String str5 = aVar5.f23403f;
                    aVar5.getClass();
                    C10644a.C10645a aVar6 = new C10644a.C10645a(z, str, str2, str3, str4, str5, true);
                    String str6 = aVar4.f23390a;
                    C10644a.C10646b bVar = aVar4.f23391b;
                    float f = aVar4.f23392c;
                    int i = aVar4.f23393d;
                    NumericRatingView.ReviewCountDisplayType reviewCountDisplayType = aVar4.f23394e;
                    NumericRatingView.ReviewCountColor reviewCountColor = aVar4.f23395f;
                    String str7 = aVar4.f23396g;
                    C19383o.m32797g(str6, "shopName");
                    C19383o.m32797g(bVar, "subHeader");
                    C19383o.m32797g(reviewCountDisplayType, "reviewCountDisplayType");
                    C19383o.m32797g(reviewCountColor, "reviewCountColor");
                    aVar2 = new C10644a(str6, bVar, f, i, reviewCountDisplayType, reviewCountColor, str7, aVar6);
                } else {
                    aVar2 = null;
                }
                aVar3.f22877a = aVar2;
            }
        };
        C10409f.C10415d dVar = gVar.f22862c;
        C19383o.m32797g(dVar, ResponseConstants.SHOP);
        C10419g.C10420a aVar2 = new C10419g.C10420a(dVar.f22850a);
        r0.invoke(aVar2);
        gVar.f22862c = new C10409f.C10415d(aVar2.f22877a);
    }
}
