package com.etsy.android.p327ui.listing.p329ui.toppanel;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.toppanel.TopPanelHelper$bindTransparent$2$1 */
final class TopPanelHelper$bindTransparent$2$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C10658e $topPanelUiModel;
    public final /* synthetic */ String $url;
    public final /* synthetic */ C10661g this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopPanelHelper$bindTransparent$2$1(C10661g gVar, String str, C10658e eVar) {
        super(1);
        this.this$0 = gVar;
        this.$url = str;
        this.$topPanelUiModel = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f23440a.mo38043a(new C13597g.C13714q3(this.$url, this.$topPanelUiModel.f23428b.f30539b));
    }
}
