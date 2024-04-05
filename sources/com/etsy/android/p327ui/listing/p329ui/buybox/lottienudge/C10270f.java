package com.etsy.android.p327ui.listing.p329ui.buybox.lottienudge;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.C0114h;
import com.airbnb.lottie.C4829d;
import com.airbnb.lottie.LottieAnimationView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.core.nudge.NudgePanelViewRedesign;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.listing.p329ui.buybox.lottienudge.C10266c;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.lottienudge.f */
public final class C10270f extends C10424k {

    /* renamed from: b */
    public final C8703p f22565b;

    /* renamed from: c */
    public final C13573c f22566c;

    /* renamed from: d */
    public final NudgePanelViewRedesign f22567d;

    /* renamed from: e */
    public final LottieAnimationView f22568e;

    /* renamed from: f */
    public final ImageView f22569f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10270f(ViewGroup viewGroup, C8703p pVar, C13573c cVar) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_lottie_nudge_redesign, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(pVar, "analyticsTracker");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22565b = pVar;
        this.f22566c = cVar;
        View view = this.itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type com.etsy.android.ui.core.nudge.NudgePanelViewRedesign");
        this.f22567d = (NudgePanelViewRedesign) view;
        View findViewById = this.itemView.findViewById(R.id.nudge_lottie);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.nudge_lottie)");
        this.f22568e = (LottieAnimationView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.nudge_image);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.nudge_image)");
        this.f22569f = (ImageView) findViewById2;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10266c) {
            C10266c cVar = (C10266c) jVar;
            if (cVar.f22560g) {
                ViewExtensions.m12860d(this.itemView);
                return;
            }
            if (!cVar.f22556c) {
                this.f22567d.showStartFor(cVar.mo33640c());
            } else if (cVar.f22557d) {
                this.f22567d.showEndFor(cVar.mo33640c());
            } else if (!this.f22567d.animating()) {
                C4829d.m10421d(this.itemView.getContext(), cVar.mo33640c()).mo14619a(new C10268d(this));
                this.f22568e.addAnimatorUpdateListener(new C10269e(this, 0));
            }
            Drawable background = this.itemView.getBackground();
            Context context = this.itemView.getContext();
            int i = C10266c.C10267a.f22561a[cVar.f22555b.ordinal()];
            int i2 = R.color.listing_nudge_denim;
            if (!(i == 1 || i == 2 || (i != 4 && i != 5 && i != 6 && i != 7 && i != 9))) {
                i2 = R.color.listing_nudge_lavender;
            }
            Object obj = C8184a.f17966a;
            background.setTint(C8184a.C8188d.m16468a(context, i2));
            this.itemView.setBackground(background);
            this.f22567d.setAnalyticsTracker(this.f22565b);
            String str = cVar.f22558e;
            if (str != null) {
                this.f22567d.setTitle(str);
            }
            String str2 = cVar.f22559f;
            if (str2 != null) {
                this.f22567d.setContent(str2);
            }
            this.f22567d.show();
            return;
        }
        throw new IllegalArgumentException();
    }
}
