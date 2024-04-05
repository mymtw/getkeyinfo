package com.etsy.android.stylekit.views;

import android.view.View;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import com.etsy.android.p327ui.cart.viewholders.C9388j;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.summary.BuyItNowTotalContentToggle;
import com.etsy.android.stylekit.views.ratings.CollageRatingButtons;
import com.google.android.exoplayer2.p526ui.StyledPlayerControlView;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.paypal.android.platform.authsdk.otplogin.p533ui.login.OtpLoginFragment;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalAddressBookInfoView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalPoliciesAndRightsLinkView;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.stylekit.views.k */
public final /* synthetic */ class C9060k implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f19937b;

    /* renamed from: c */
    public final /* synthetic */ Object f19938c;

    public /* synthetic */ C9060k(Object obj, int i) {
        this.f19937b = i;
        this.f19938c = obj;
    }

    public final void onClick(View view) {
        switch (this.f19937b) {
            case 0:
                CollagePlayerView.m34892onFinishInflate$lambda4((CollagePlayerView) this.f19938c, view);
                return;
            case 1:
                CollageRatingButtons.m34909_init_$lambda3((CollageRatingButtons) this.f19938c, view);
                return;
            case 2:
                C9388j jVar = (C9388j) this.f19938c;
                int i = C9388j.f20789f;
                C19383o.m32797g(jVar, "this$0");
                Object tag = jVar.f20791d.getTag(R.id.tag_alert_alt_action);
                ServerDrivenAction serverDrivenAction = tag instanceof ServerDrivenAction ? (ServerDrivenAction) tag : null;
                if (serverDrivenAction != null) {
                    C9282g gVar = jVar.f20790c;
                    View view2 = jVar.itemView;
                    C19383o.m32796f(view2, "itemView");
                    gVar.mo45936d(view2, serverDrivenAction);
                    return;
                }
                return;
            case 3:
                BuyItNowTotalContentToggle.m35013_init_$lambda1((BuyItNowTotalContentToggle) this.f19938c, view);
                return;
            case 4:
                StyledPlayerControlView.C14406i iVar = (StyledPlayerControlView.C14406i) this.f19938c;
                if (StyledPlayerControlView.this.trackSelector != null) {
                    DefaultTrackSelector.C14378c buildUpon = StyledPlayerControlView.this.trackSelector.mo47858d().buildUpon();
                    for (int i2 = 0; i2 < iVar.f32437b.size(); i2++) {
                        int intValue = iVar.f32437b.get(i2).intValue();
                        buildUpon.mo47882c(intValue);
                        buildUpon.mo47884e(intValue, true);
                    }
                    DefaultTrackSelector access$4800 = StyledPlayerControlView.this.trackSelector;
                    access$4800.getClass();
                    access$4800.mo47859i(buildUpon);
                    StyledPlayerControlView.this.settingsWindow.dismiss();
                    return;
                }
                return;
            case 5:
                OtpLoginFragment.m35132onViewCreated$lambda6((OtpLoginFragment) this.f19938c, view);
                return;
            case 6:
                PayPalAddressBookInfoView.m35164setupButton$lambda6((PayPalAddressBookInfoView) this.f19938c, view);
                return;
            default:
                PayPalPoliciesAndRightsLinkView.m35337cryptoTermsLink$lambda13((PayPalPoliciesAndRightsLinkView) this.f19938c, view);
                return;
        }
    }
}
