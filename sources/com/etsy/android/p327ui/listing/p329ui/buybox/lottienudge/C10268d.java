package com.etsy.android.p327ui.listing.p329ui.buybox.lottienudge;

import com.airbnb.lottie.C4828c;
import com.airbnb.lottie.C4838i;
import com.etsy.android.extensions.ViewExtensions;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.lottienudge.d */
public final /* synthetic */ class C10268d implements C4838i {

    /* renamed from: a */
    public final /* synthetic */ C10270f f22562a;

    public /* synthetic */ C10268d(C10270f fVar) {
        this.f22562a = fVar;
    }

    public final void onResult(Object obj) {
        C10270f fVar = this.f22562a;
        C19383o.m32797g(fVar, "this$0");
        fVar.f22568e.setComposition((C4828c) obj);
        fVar.f22568e.playAnimation();
        ViewExtensions.m12869m(fVar.f22568e);
        ViewExtensions.m12860d(fVar.f22569f);
    }
}
