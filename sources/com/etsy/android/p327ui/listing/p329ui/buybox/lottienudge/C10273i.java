package com.etsy.android.p327ui.listing.p329ui.buybox.lottienudge;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.C0114h;
import com.airbnb.lottie.C4829d;
import com.airbnb.lottie.LottieAnimationView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.core.nudge.NudgePanelView;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.lottienudge.i */
public final class C10273i extends C10424k {

    /* renamed from: b */
    public final C13573c f22572b;

    /* renamed from: c */
    public final NudgePanelView f22573c;

    /* renamed from: d */
    public final LottieAnimationView f22574d;

    /* renamed from: e */
    public final ImageView f22575e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10273i(ViewGroup viewGroup, C8703p pVar, C13573c cVar) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_lottie_nudge, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(pVar, "analyticsTracker");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22572b = cVar;
        NudgePanelView nudgePanelView = (NudgePanelView) this.itemView.findViewById(R.id.nudge_panel);
        this.f22573c = nudgePanelView;
        View findViewById = this.itemView.findViewById(R.id.nudge_lottie);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.nudge_lottie)");
        this.f22574d = (LottieAnimationView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.nudge_image);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.nudge_image)");
        this.f22575e = (ImageView) findViewById2;
        nudgePanelView.setAnalyticsTracker(pVar);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10266c) {
            C10266c cVar = (C10266c) jVar;
            if (!cVar.f22556c) {
                this.f22573c.showStartFor(cVar.mo33640c());
            } else if (cVar.f22557d) {
                this.f22573c.showEndFor(cVar.mo33640c());
            } else if (!this.f22573c.animating()) {
                C4829d.m10421d(this.itemView.getContext(), cVar.mo33640c()).mo14619a(new C10271g(this));
                this.f22574d.addAnimatorUpdateListener(new C10272h(this));
            }
            this.f22573c.setTitle(cVar.f22554a);
            this.f22573c.show();
            return;
        }
        throw new IllegalArgumentException();
    }
}
