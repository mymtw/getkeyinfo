package com.etsy.android.p327ui.listing.p329ui.productwarninginfo;

import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10633s;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.productwarninginfo.ProductWarningInfoAnalyticsHandler$handle$1 */
public final class ProductWarningInfoAnalyticsHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public static final ProductWarningInfoAnalyticsHandler$handle$1 INSTANCE = new ProductWarningInfoAnalyticsHandler$handle$1();

    public ProductWarningInfoAnalyticsHandler$handle$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C10621a aVar;
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        C106181 r0 = C106181.INSTANCE;
        C19383o.m32797g(r0, "lambda");
        C10621a aVar2 = gVar.f22871l;
        if (aVar2 != null) {
            C10633s sVar = new C10633s(aVar2);
            r0.invoke(sVar);
            C10621a aVar3 = sVar.f23338a;
            aVar = new C10621a(aVar3.f23312c, aVar3.f23310a, aVar3.f23311b);
        } else {
            aVar = null;
        }
        gVar.f22871l = aVar;
    }
}
