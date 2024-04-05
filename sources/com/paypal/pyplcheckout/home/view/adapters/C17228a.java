package com.paypal.pyplcheckout.home.view.adapters;

import android.view.View;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import p753kq.C19846a;

/* renamed from: com.paypal.pyplcheckout.home.view.adapters.a */
public final /* synthetic */ class C17228a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ FundingOptionViewHolder f37742b;

    /* renamed from: c */
    public final /* synthetic */ CardUiModel.PaymentSourceUiModel f37743c;

    /* renamed from: d */
    public final /* synthetic */ C19846a f37744d;

    public /* synthetic */ C17228a(FundingOptionViewHolder fundingOptionViewHolder, CardUiModel.PaymentSourceUiModel paymentSourceUiModel, C19846a aVar) {
        this.f37742b = fundingOptionViewHolder;
        this.f37743c = paymentSourceUiModel;
        this.f37744d = aVar;
    }

    public final void onClick(View view) {
        FundingOptionViewHolder.m35265bind$lambda1(this.f37742b, this.f37743c, this.f37744d, view);
    }
}
