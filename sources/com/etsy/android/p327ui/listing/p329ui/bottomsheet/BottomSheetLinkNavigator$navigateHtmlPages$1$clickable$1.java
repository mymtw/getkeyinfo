package com.etsy.android.p327ui.listing.p329ui.bottomsheet;

import android.text.style.URLSpan;
import android.view.View;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.bottomsheet.BottomSheetLinkNavigator$navigateHtmlPages$1$clickable$1 */
public final class BottomSheetLinkNavigator$navigateHtmlPages$1$clickable$1 extends URLSpan {
    public final /* synthetic */ URLSpan $span;
    public final /* synthetic */ C10209i this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetLinkNavigator$navigateHtmlPages$1$clickable$1(String str, C10209i iVar, URLSpan uRLSpan) {
        super(str);
        this.this$0 = iVar;
        this.$span = uRLSpan;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        this.this$0.f22449a.dismiss();
        C13573c cVar = this.this$0.f22450b;
        String url = this.$span.getURL();
        C19383o.m32796f(url, "span.url");
        cVar.mo38043a(new C13597g.C13681l5(url));
    }
}
