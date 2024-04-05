package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.home.view.customviews.SnappingRecyclerView;
import com.paypal.pyplcheckout.utils.DialogMaker;

/* renamed from: com.paypal.pyplcheckout.home.view.customviews.n */
public final /* synthetic */ class C17250n implements SnappingRecyclerView.OnSmoothScrollByListener, DialogMaker.PositiveClickListener {

    /* renamed from: b */
    public final /* synthetic */ PayPalSnappingRecyclerView f37773b;

    public /* synthetic */ C17250n(PayPalSnappingRecyclerView payPalSnappingRecyclerView) {
        this.f37773b = payPalSnappingRecyclerView;
    }

    public final void onCompleted() {
        PayPalSnappingRecyclerView.m35367setUpCarousel$lambda29$lambda28(this.f37773b);
    }

    public final void onPositiveClick(DialogMaker dialogMaker) {
        PayPalSnappingRecyclerView.m35364onAddCardClicked$lambda21(this.f37773b, dialogMaker);
    }
}
