package com.etsy.android.p327ui.search.listingresults;

import android.view.View;
import com.etsy.android.p327ui.search.p330v2.filters.C10978a;
import com.etsy.android.p327ui.shop.homesection.C11166p;
import com.paypal.pyplcheckout.home.view.adapters.NativeAddCardViewHolder;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import kotlin.jvm.internal.C19383o;
import p460ue.C13498h;

/* renamed from: com.etsy.android.ui.search.listingresults.e */
public final /* synthetic */ class C10905e implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f24209b;

    /* renamed from: c */
    public final /* synthetic */ Object f24210c;

    /* renamed from: d */
    public final /* synthetic */ Object f24211d;

    public /* synthetic */ C10905e(int i, Object obj, Object obj2) {
        this.f24209b = i;
        this.f24210c = obj;
        this.f24211d = obj2;
    }

    public final void onClick(View view) {
        switch (this.f24209b) {
            case 0:
                SearchResultsListingsFragment.m35040createFilterRemovalView$lambda22((SearchResultsListingsFragment) this.f24210c, (C10978a) this.f24211d, view);
                return;
            case 1:
                C13498h hVar = (C13498h) this.f24210c;
                C11166p pVar = (C11166p) this.f24211d;
                int i = C11166p.f24690f;
                C19383o.m32797g(hVar, "$uiModel");
                C19383o.m32797g(pVar, "this$0");
                boolean z = !hVar.f29534b;
                hVar.f29534b = z;
                pVar.f24691c.onTranslateShopButtonClicked(z);
                return;
            default:
                NativeAddCardViewHolder.m35266bind$lambda0((NativeAddCardViewHolder) this.f24210c, (CardUiModel.AddCardUiModel.Native) this.f24211d, view);
                return;
        }
    }
}
