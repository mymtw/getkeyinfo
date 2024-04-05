package com.etsy.android.stylekit.views;

import android.view.View;
import android.widget.PopupWindow;
import com.etsy.android.R;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import com.etsy.android.p327ui.login.ThirdPartySignInFragment;
import com.google.android.exoplayer2.p526ui.StyledPlayerControlView;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.paypal.android.platform.authsdk.otplogin.p533ui.error.OtpErrorFragment;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsInfoHeader;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.stylekit.views.i */
public final /* synthetic */ class C9058i implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f19933b;

    /* renamed from: c */
    public final /* synthetic */ Object f19934c;

    public /* synthetic */ C9058i(Object obj, int i) {
        this.f19933b = i;
        this.f19934c = obj;
    }

    public final void onClick(View view) {
        switch (this.f19933b) {
            case 0:
                CollagePlayerView.m34889onFinishInflate$lambda1((CollagePlayerView) this.f19934c, view);
                return;
            case 1:
                ThirdPartySignInFragment.m35023setupToolbar$lambda12((EtsyDialogFragment) this.f19934c, view);
                return;
            case 2:
                PopupWindow popupWindow = (PopupWindow) this.f19934c;
                C19383o.m32797g(popupWindow, "$popupWindow");
                popupWindow.dismiss();
                return;
            case 3:
                StyledPlayerControlView.C14398a aVar = (StyledPlayerControlView.C14398a) this.f19934c;
                if (StyledPlayerControlView.this.trackSelector != null) {
                    DefaultTrackSelector.C14378c buildUpon = StyledPlayerControlView.this.trackSelector.mo47858d().buildUpon();
                    for (int i = 0; i < aVar.f32437b.size(); i++) {
                        buildUpon.mo47882c(aVar.f32437b.get(i).intValue());
                    }
                    DefaultTrackSelector access$4800 = StyledPlayerControlView.this.trackSelector;
                    access$4800.getClass();
                    access$4800.mo47859i(buildUpon);
                }
                StyledPlayerControlView.C14404g access$3000 = StyledPlayerControlView.this.settingsAdapter;
                access$3000.f32426c[1] = StyledPlayerControlView.this.getResources().getString(R.string.exo_track_selection_auto);
                StyledPlayerControlView.this.settingsWindow.dismiss();
                return;
            case 4:
                OtpErrorFragment.m35129onViewCreated$lambda5((OtpErrorFragment) this.f19934c, view);
                return;
            default:
                PayPalBillingAgreementsInfoHeader.m35219setupViews$lambda0((PayPalBillingAgreementsInfoHeader) this.f19934c, view);
                return;
        }
    }
}
