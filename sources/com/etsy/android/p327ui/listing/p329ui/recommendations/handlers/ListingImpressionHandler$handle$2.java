package com.etsy.android.p327ui.listing.p329ui.recommendations.handlers;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.p072ad.ProlistLogResponse;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.listing.ui.recommendations.handlers.ListingImpressionHandler$handle$2 */
public final class ListingImpressionHandler$handle$2 extends Lambda implements C19857l<C20145v<ProlistLogResponse>, C19394m> {
    public final /* synthetic */ C13597g.C13740u1 $event;
    public final /* synthetic */ ListingImpressionHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingImpressionHandler$handle$2(ListingImpressionHandler listingImpressionHandler, C13597g.C13740u1 u1Var) {
        super(1);
        this.this$0 = listingImpressionHandler;
        this.$event = u1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C20145v<ProlistLogResponse>) (C20145v) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C20145v<ProlistLogResponse> vVar) {
        C8694h hVar = this.this$0.f23330e;
        StringBuilder h = C0072d.m201h("Prolist: Logged prolist impressions: ");
        h.append(this.$event.f30264b);
        hVar.mo21310e(h.toString());
    }
}
