package com.etsy.android.stylekit.views;

import android.view.View;
import com.etsy.android.p327ui.common.listingreview.redesign.ListingReviewViewRedesign;
import com.etsy.android.p327ui.conversation.details.ccm.C9502k;
import com.etsy.android.p327ui.conversation.details.ccm.ConversationDetailsFragment;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import com.etsy.android.p327ui.favorites.editlist.EditCollectionBottomSheetFragment;
import com.etsy.android.p327ui.login.ThirdPartySignInFragment;
import com.etsy.android.uikit.view.RatingIconView;
import com.google.android.exoplayer2.p526ui.StyledPlayerControlView;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressReviewView;

/* renamed from: com.etsy.android.stylekit.views.f */
public final /* synthetic */ class C9055f implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f19929b;

    /* renamed from: c */
    public final /* synthetic */ Object f19930c;

    public /* synthetic */ C9055f(Object obj, int i) {
        this.f19929b = i;
        this.f19930c = obj;
    }

    public final void onClick(View view) {
        switch (this.f19929b) {
            case 0:
                CollageContentToggleShort.m34886setupClickListener$lambda3((CollageContentToggleShort) this.f19930c, view);
                return;
            case 1:
                ListingReviewViewRedesign.m34931showBuyerVideosAlert$lambda2((ListingReviewViewRedesign) this.f19930c, view);
                return;
            case 2:
                ConversationDetailsFragment.m34934handleViewState$lambda11$lambda10((C9502k) this.f19930c, view);
                return;
            case 3:
                EditCollectionBottomSheetFragment.m34978onCreateView$lambda2$lambda1$lambda0((EditCollectionBottomSheetFragment) this.f19930c, view);
                return;
            case 4:
                ThirdPartySignInFragment.m35021onViewCreated$lambda8((EtsyDialogFragment) this.f19930c, view);
                return;
            case 5:
                ((RatingIconView) this.f19930c).lambda$updateView$0(view);
                return;
            case 6:
                ((StyledPlayerControlView) this.f19930c).onFullScreenButtonClicked(view);
                return;
            default:
                PayPalNewShippingAddressReviewView.m35170initViews$lambda11((PayPalNewShippingAddressReviewView) this.f19930c, view);
                return;
        }
    }
}
