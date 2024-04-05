package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.R;
import com.etsy.android.lib.models.ISearchSuggestion;
import com.etsy.android.p327ui.favorites.search.C9891e;
import com.etsy.android.p327ui.favorites.search.SearchView;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.unstructured.C10615a;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.unstructured.ShippingUnstructuredPoliciesPanelViewHolder;
import com.paypal.pyplcheckout.home.view.adapters.FundingOptionViewHolder;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.cardview.viewholders.h1 */
public final /* synthetic */ class C9182h1 implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f20216b;

    /* renamed from: c */
    public final /* synthetic */ Object f20217c;

    /* renamed from: d */
    public final /* synthetic */ Object f20218d;

    public /* synthetic */ C9182h1(int i, Object obj, Object obj2) {
        this.f20216b = i;
        this.f20217c = obj;
        this.f20218d = obj2;
    }

    public final void onClick(View view) {
        switch (this.f20216b) {
            case 0:
                C9185i1 i1Var = (C9185i1) this.f20217c;
                ISearchSuggestion iSearchSuggestion = (ISearchSuggestion) this.f20218d;
                C19383o.m32797g(i1Var, "this$0");
                C19383o.m32797g(iSearchSuggestion, "$suggestion");
                i1Var.f20222c.mo31328c(iSearchSuggestion);
                return;
            case 1:
                SearchView.m34979bindSearch$lambda6$lambda1((SearchView) this.f20217c, (C9891e) this.f20218d, view);
                return;
            case 2:
                ShippingUnstructuredPoliciesPanelViewHolder shippingUnstructuredPoliciesPanelViewHolder = (ShippingUnstructuredPoliciesPanelViewHolder) this.f20217c;
                C10615a aVar = (C10615a) this.f20218d;
                int i = ShippingUnstructuredPoliciesPanelViewHolder.f23264w;
                C19383o.m32797g(shippingUnstructuredPoliciesPanelViewHolder, "this$0");
                C19383o.m32797g(aVar, "$uiModel");
                C13573c cVar = shippingUnstructuredPoliciesPanelViewHolder.f23265b;
                String string = shippingUnstructuredPoliciesPanelViewHolder.itemView.getContext().getString(R.string.seller_details_title);
                C19383o.m32796f(string, "itemView.context.getStri…ing.seller_details_title)");
                cVar.mo38043a(new C13597g.C13693n3(string, aVar.f23302q));
                return;
            default:
                FundingOptionViewHolder.m35264bind$lambda0((FundingOptionViewHolder) this.f20217c, (CardUiModel.PaymentSourceUiModel) this.f20218d, view);
                return;
        }
    }
}
