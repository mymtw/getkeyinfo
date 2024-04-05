package com.etsy.android.feedback;

import androidx.lifecycle.C2843a0;
import com.etsy.android.lib.network.oauth2.signin.C8790q;
import com.etsy.android.lib.network.oauth2.signin.OAuth2SignInFragment;
import com.etsy.android.p327ui.conversation.details.ccm.ConversationDetailsFragment;
import com.etsy.android.p327ui.listing.ListingFragment;
import com.etsy.android.p327ui.user.review.C11744s;
import com.etsy.android.p327ui.user.review.CreateReviewActivity;
import com.etsy.android.util.C12059p;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalAddressBookInfoView;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressSearchView;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCompoundHeaderView;
import com.paypal.pyplcheckout.home.view.customviews.ShippingView;
import com.paypal.pyplcheckout.pojo.ShippingAddress;
import kotlin.Pair;

/* renamed from: com.etsy.android.feedback.b */
public final /* synthetic */ class C6457b implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ int f14311b;

    /* renamed from: c */
    public final /* synthetic */ Object f14312c;

    public /* synthetic */ C6457b(Object obj, int i) {
        this.f14311b = i;
        this.f14312c = obj;
    }

    public final void onChanged(Object obj) {
        switch (this.f14311b) {
            case 0:
                ((FeedbackFragment) this.f14312c).handleContactShopVisibilityChanged((Boolean) obj);
                return;
            case 1:
                OAuth2SignInFragment.m34868onCreateView$lambda1((OAuth2SignInFragment) this.f14312c, (C8790q) obj);
                return;
            case 2:
                ConversationDetailsFragment.m34937onViewCreated$lambda9$lambda4((ConversationDetailsFragment) this.f14312c, (Boolean) obj);
                return;
            case 3:
                ((ListingFragment) this.f14312c).handleSideEffect((C12059p) obj);
                return;
            case 4:
                CreateReviewActivity.m35076onCreate$lambda14((CreateReviewActivity) this.f14312c, (C11744s) obj);
                return;
            case 5:
                PayPalAddressBookInfoView.m35161initViewModelObservers$lambda1((PayPalAddressBookInfoView) this.f14312c, (ShippingAddress) obj);
                return;
            case 6:
                PayPalNewShippingAddressSearchView.m35181initViewModelObservers$lambda7((PayPalNewShippingAddressSearchView) this.f14312c, (Pair) obj);
                return;
            case 7:
                PayPalCompoundHeaderView.m35294initViewModelObservers$lambda5((PayPalCompoundHeaderView) this.f14312c, (ContingencyEventsModel) obj);
                return;
            default:
                ShippingView.m35393initViewModelObservers$lambda4((ShippingView) this.f14312c, (Boolean) obj);
                return;
        }
    }
}
