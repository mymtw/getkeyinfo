package com.etsy.android.p327ui.listing.p329ui.buybox.lottienudge;

import com.airbnb.lottie.C4828c;
import com.airbnb.lottie.C4838i;
import com.etsy.android.extensions.ViewExtensions;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.lottienudge.g */
public final /* synthetic */ class C10271g implements C4838i {

    /* renamed from: a */
    public final /* synthetic */ C10273i f22570a;

    public /* synthetic */ C10271g(C10273i iVar) {
        this.f22570a = iVar;
    }

    public final void onResult(Object obj) {
        C10273i iVar = this.f22570a;
        C19383o.m32797g(iVar, "this$0");
        iVar.f22574d.setComposition((C4828c) obj);
        iVar.f22574d.playAnimation();
        ViewExtensions.m12869m(iVar.f22574d);
        ViewExtensions.m12860d(iVar.f22575e);
    }
}
