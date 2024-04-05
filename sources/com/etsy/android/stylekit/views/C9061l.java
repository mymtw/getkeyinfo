package com.etsy.android.stylekit.views;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.apiv3.ListReminder;
import com.etsy.android.lib.models.apiv3.SearchBannerMessage;
import com.etsy.android.p327ui.cardview.viewholders.C9200n0;
import com.etsy.android.uikit.viewholder.C12015x;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTermsFooterLink;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BaTermsFooterState;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;
import p423pf.C13230a;

/* renamed from: com.etsy.android.stylekit.views.l */
public final /* synthetic */ class C9061l implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f19939b;

    /* renamed from: c */
    public final /* synthetic */ Object f19940c;

    /* renamed from: d */
    public final /* synthetic */ Object f19941d;

    public /* synthetic */ C9061l(int i, Object obj, Object obj2) {
        this.f19939b = i;
        this.f19940c = obj;
        this.f19941d = obj2;
    }

    public final void onClick(View view) {
        String str;
        String deepLink;
        SearchBannerMessage.DisplayFormat displayFormat;
        switch (this.f19939b) {
            case 0:
                CollageRadioGroup.m34894setRadioButtonOnCheckListener$lambda0((CollageRadioGroup) this.f19940c, (CollageRadioButton) this.f19941d, view);
                return;
            case 1:
                C9200n0 n0Var = (C9200n0) this.f19940c;
                int i = C9200n0.f20305d;
                C19383o.m32797g(n0Var, "this$0");
                n0Var.f20306c.mo31328c((ListReminder) this.f19941d);
                return;
            case 2:
                C12015x xVar = (C12015x) this.f19940c;
                SearchBannerMessage searchBannerMessage = (SearchBannerMessage) this.f19941d;
                int i2 = C12015x.f26779g;
                C19383o.m32797g(xVar, "this$0");
                C8672b bVar = xVar.f26962b;
                String str2 = "";
                if (searchBannerMessage == null || (displayFormat = searchBannerMessage.getDisplayFormat()) == null || (str = displayFormat.getAnalyticsName()) == null) {
                    str = str2;
                }
                bVar.mo21333d(str, (Map<? extends AnalyticsProperty, Object>) null);
                C13171a<SearchBannerMessage> aVar = xVar.f26780c;
                C13230a aVar2 = aVar instanceof C13230a ? (C13230a) aVar : null;
                if (aVar2 != null) {
                    if (!(searchBannerMessage == null || (deepLink = searchBannerMessage.getDeepLink()) == null)) {
                        str2 = deepLink;
                    }
                    aVar2.mo45934f((Integer) null, str2, false);
                    return;
                }
                return;
            default:
                PayPalBillingAgreementsTermsFooterLink.m35222initViewModelObservers$lambda1$lambda0((PayPalBillingAgreementsTermsFooterLink) this.f19940c, (BaTermsFooterState) this.f19941d, view);
                return;
        }
    }
}
