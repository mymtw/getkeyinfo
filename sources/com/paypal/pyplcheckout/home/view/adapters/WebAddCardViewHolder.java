package com.paypal.pyplcheckout.home.view.adapters;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.etsy.android.stylekit.views.C9069r;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import com.paypal.pyplcheckout.interfaces.SelectedListener;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;

public final class WebAddCardViewHolder extends CarouselAdapterViewHolder {
    private final ImageView backGroundImage;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebAddCardViewHolder(View view, SelectedListener selectedListener) {
        super(view, selectedListener, (DefaultConstructorMarker) null);
        C19383o.m32797g(view, "itemView");
        C19383o.m32797g(selectedListener, "selectedListener");
        View findViewById = view.findViewById(C17165R.C17167id.payment_source_background);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…ayment_source_background)");
        this.backGroundImage = (ImageView) findViewById;
    }

    /* access modifiers changed from: private */
    /* renamed from: bind$lambda-0  reason: not valid java name */
    public static final void m35268bind$lambda0(WebAddCardViewHolder webAddCardViewHolder, CardUiModel.AddCardUiModel.Web web, View view) {
        C19383o.m32797g(webAddCardViewHolder, "this$0");
        C19383o.m32797g(web, "$addCardUiModel");
        webAddCardViewHolder.getSelectedListener().onTaskCompleted(web);
    }

    public final void bind(CardUiModel.AddCardUiModel.Web web) {
        C19383o.m32797g(web, "addCardUiModel");
        this.itemView.setOnClickListener(new C9069r(3, this, web));
        ImageView imageView = this.backGroundImage;
        Context context = this.itemView.getContext();
        int backgroundImage = web.getBackgroundImage();
        Object obj = C8184a.f17966a;
        imageView.setImageDrawable(C8184a.C8187c.m16466b(context, backgroundImage));
    }
}
