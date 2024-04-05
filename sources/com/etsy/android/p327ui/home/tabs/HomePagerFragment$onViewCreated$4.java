package com.etsy.android.p327ui.home.tabs;

import android.graphics.drawable.Drawable;
import android.support.p013v4.media.C0072d;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.marketing.sweepstakes.SweepstakesBanner;
import com.etsy.android.p327ui.common.listingreview.redesign.ListingReviewViewRedesign;
import com.etsy.android.stylekit.views.CollageAlert;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p003a2.C0023f;
import p377jf.C12979a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.tabs.HomePagerFragment$onViewCreated$4 */
public final class HomePagerFragment$onViewCreated$4 extends Lambda implements C19857l<SweepstakesBanner, C19394m> {
    public final /* synthetic */ HomePagerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePagerFragment$onViewCreated$4(HomePagerFragment homePagerFragment) {
        super(1);
        this.this$0 = homePagerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SweepstakesBanner) obj);
        return C19394m.f43287a;
    }

    public final void invoke(SweepstakesBanner sweepstakesBanner) {
        C19383o.m32797g(sweepstakesBanner, "sweepstakesBanner");
        int identifier = this.this$0.getResources().getIdentifier(C0023f.m110k(C0072d.m201h(ListingReviewViewRedesign.COLLAGE_ICON_CORE), sweepstakesBanner.f19696c, ListingReviewViewRedesign.COLLAGE_ICON_V1), "drawable", this.this$0.requireContext().getPackageName());
        if (identifier == 0) {
            identifier = R.drawable.clg_icon_core_gift_v1;
        }
        this.this$0.getViewModel().f22139y = false;
        FragmentActivity requireActivity = this.this$0.requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C12979a a = C12979a.C12980a.m20683a(requireActivity);
        HomePagerFragment homePagerFragment = this.this$0;
        a.mo45785e(sweepstakesBanner.f19694a);
        a.f28588b.setBodyText(sweepstakesBanner.f19695b, (Drawable) null);
        a.mo45781a(CollageAlert.AlertType.SUCCESS);
        a.mo45783c(identifier);
        a.f28591e = 6000;
        a.f28587a.setOnDismissListener(new C10057g(homePagerFragment));
        a.mo45786f();
        this.this$0.getAnalyticsContext().mo21333d("sweepstakes_confirmation_banner_shown", (Map<? extends AnalyticsProperty, Object>) null);
    }
}
