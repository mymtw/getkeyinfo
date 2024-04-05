package com.braze.p044ui.inappmessage.views;

import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.p327ui.common.listingreview.redesign.ListingReviewViewRedesign;
import com.google.android.exoplayer2.p526ui.StyledPlayerControlView;

/* renamed from: com.braze.ui.inappmessage.views.d */
public final /* synthetic */ class C5698d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f12087b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f12088c;

    public /* synthetic */ C5698d(ViewGroup viewGroup, int i) {
        this.f12087b = i;
        this.f12088c = viewGroup;
    }

    public final void onClick(View view) {
        switch (this.f12087b) {
            case 0:
                ((InAppMessageFullView) this.f12088c).lambda$resetMessageMargins$0(view);
                return;
            case 1:
                ListingReviewViewRedesign.m34930initialize$lambda0((ListingReviewViewRedesign) this.f12088c, view);
                return;
            default:
                ((StyledPlayerControlView) this.f12088c).onFullScreenButtonClicked(view);
                return;
        }
    }
}
