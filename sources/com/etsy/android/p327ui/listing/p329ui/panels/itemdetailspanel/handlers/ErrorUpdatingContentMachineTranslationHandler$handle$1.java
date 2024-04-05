package com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers;

import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.handlers.ErrorUpdatingContentMachineTranslationHandler$handle$1 */
public final class ErrorUpdatingContentMachineTranslationHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ ListingViewState.C10092d $state;
    public final /* synthetic */ ErrorUpdatingContentMachineTranslationHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ErrorUpdatingContentMachineTranslationHandler$handle$1(ListingViewState.C10092d dVar, ErrorUpdatingContentMachineTranslationHandler errorUpdatingContentMachineTranslationHandler) {
        super(1);
        this.$state = dVar;
        this.this$0 = errorUpdatingContentMachineTranslationHandler;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        gVar.mo33964d(C104961.INSTANCE);
        if (C19383o.m32792b(this.$state.f22238f.f22803f.f22848f.f23014f, Boolean.FALSE) && this.this$0.f23049a.mo33537a()) {
            gVar.mo33961a(C104982.INSTANCE);
        }
    }
}
