package com.paypal.pyplcheckout.home.view.adapters;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.etsy.android.p327ui.search.listingresults.C10905e;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import com.paypal.pyplcheckout.interfaces.SelectedListener;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;

public final class NativeAddCardViewHolder extends CarouselAdapterViewHolder {
    private final ImageView backgroundImage;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NativeAddCardViewHolder(View view, SelectedListener selectedListener) {
        super(view, selectedListener, (DefaultConstructorMarker) null);
        C19383o.m32797g(view, "itemView");
        C19383o.m32797g(selectedListener, "selectedListener");
        View findViewById = view.findViewById(C17165R.C17167id.payment_source_background);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…ayment_source_background)");
        this.backgroundImage = (ImageView) findViewById;
    }

    /* access modifiers changed from: private */
    /* renamed from: bind$lambda-0  reason: not valid java name */
    public static final void m35266bind$lambda0(NativeAddCardViewHolder nativeAddCardViewHolder, CardUiModel.AddCardUiModel.Native nativeR, View view) {
        C19383o.m32797g(nativeAddCardViewHolder, "this$0");
        C19383o.m32797g(nativeR, "$addCardUiModel");
        nativeAddCardViewHolder.getSelectedListener().onTaskCompleted(nativeR);
    }

    public final void bind(CardUiModel.AddCardUiModel.Native nativeR) {
        C19383o.m32797g(nativeR, "addCardUiModel");
        this.itemView.setOnClickListener(new C10905e(2, this, nativeR));
        ImageView imageView = this.backgroundImage;
        Context context = this.itemView.getContext();
        int backgroundImage2 = nativeR.getBackgroundImage();
        Object obj = C8184a.f17966a;
        imageView.setImageDrawable(C8184a.C8187c.m16466b(context, backgroundImage2));
    }
}
