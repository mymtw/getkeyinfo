package com.etsy.android.p327ui.listing.p329ui.recommendations.handlers;

import android.support.p013v4.media.C0072d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p340ea.C12673n;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.recommendations.handlers.ListingImpressionHandler$handle$1 */
public final class ListingImpressionHandler$handle$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C13597g.C13740u1 $event;
    public final /* synthetic */ ListingImpressionHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingImpressionHandler$handle$1(ListingImpressionHandler listingImpressionHandler, C13597g.C13740u1 u1Var) {
        super(1);
        this.this$0 = listingImpressionHandler;
        this.$event = u1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        C12673n nVar = this.this$0.f23329d;
        StringBuilder h = C0072d.m201h("Failed to log prolist impression event with logging keys: ");
        h.append(this.$event.f30264b);
        nVar.mo45449a(h.toString());
    }
}
