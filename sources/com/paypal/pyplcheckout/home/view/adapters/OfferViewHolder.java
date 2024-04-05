package com.paypal.pyplcheckout.home.view.adapters;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.etsy.android.p327ui.cart.viewholders.C9403q;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import com.paypal.pyplcheckout.interfaces.SelectedListener;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;

public final class OfferViewHolder extends CarouselAdapterViewHolder {
    private final ImageView backGroundImage;
    private final TextView payLaterTextView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OfferViewHolder(View view, SelectedListener selectedListener) {
        super(view, selectedListener, (DefaultConstructorMarker) null);
        C19383o.m32797g(view, "itemView");
        C19383o.m32797g(selectedListener, "selectedListener");
        View findViewById = view.findViewById(C17165R.C17167id.payment_source_background);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…ayment_source_background)");
        this.backGroundImage = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C17165R.C17167id.offer_pay_later_tv);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.offer_pay_later_tv)");
        this.payLaterTextView = (TextView) findViewById2;
    }

    /* access modifiers changed from: private */
    /* renamed from: bind$lambda-0  reason: not valid java name */
    public static final void m35267bind$lambda0(OfferViewHolder offerViewHolder, CardUiModel.OfferCardUiModel offerCardUiModel, View view) {
        C19383o.m32797g(offerViewHolder, "this$0");
        C19383o.m32797g(offerCardUiModel, "$offerCardUiModel");
        offerViewHolder.getSelectedListener().onTaskCompleted(offerCardUiModel);
    }

    public final void bind(CardUiModel.OfferCardUiModel offerCardUiModel) {
        C19383o.m32797g(offerCardUiModel, "offerCardUiModel");
        this.itemView.setOnClickListener(new C9403q(3, this, offerCardUiModel));
        this.payLaterTextView.setVisibility(0);
        ImageView imageView = this.backGroundImage;
        Context context = this.itemView.getContext();
        int backgroundImage = offerCardUiModel.getBackgroundImage();
        Object obj = C8184a.f17966a;
        imageView.setImageDrawable(C8184a.C8187c.m16466b(context, backgroundImage));
    }
}
