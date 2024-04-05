package p114g4;

import android.view.View;
import com.braze.models.inappmessage.C5483a;
import com.braze.models.inappmessage.C5485c;
import com.braze.p044ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import com.etsy.android.p327ui.conversation.compose.ConversationComposeFragment;
import com.etsy.android.p327ui.dialog.GiftWrapDescriptionFragment;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTermsHeaderView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCurrencyConversionView;
import com.paypal.pyplcheckout.utils.DialogMaker;

/* renamed from: g4.g */
public final /* synthetic */ class C6867g implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f15190b;

    /* renamed from: c */
    public final /* synthetic */ Object f15191c;

    public /* synthetic */ C6867g(Object obj, int i) {
        this.f15190b = i;
        this.f15191c = obj;
    }

    public final void onClick(View view) {
        switch (this.f15190b) {
            case 0:
                C6869i iVar = (C6869i) this.f15191c;
                C5483a aVar = iVar.f15197b;
                if (!(aVar instanceof C5485c)) {
                    ((DefaultInAppMessageViewLifecycleListener) iVar.f15198c).mo16323g(iVar.f15202g, iVar.f15196a, aVar);
                    return;
                } else if (((C5485c) aVar).mo16017X().isEmpty()) {
                    ((DefaultInAppMessageViewLifecycleListener) iVar.f15198c).mo16323g(iVar.f15202g, iVar.f15196a, iVar.f15197b);
                    return;
                } else {
                    return;
                }
            case 1:
                ((ConversationComposeFragment) this.f15191c).lambda$setupToolbar$1(view);
                return;
            case 2:
                ((GiftWrapDescriptionFragment) this.f15191c).lambda$buildView$0(view);
                return;
            case 3:
                PayPalBillingAgreementsTermsHeaderView.m35223onAttachedToWindow$lambda0((PayPalBillingAgreementsTermsHeaderView) this.f15191c, view);
                return;
            case 4:
                PayPalCurrencyConversionView.m35315updateCryptoCurrencyOptionsVisibility$lambda15((PayPalCurrencyConversionView) this.f15191c, view);
                return;
            default:
                ((DialogMaker) this.f15191c).lambda$onCreateView$0(view);
                return;
        }
    }
}
