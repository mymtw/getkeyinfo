package com.paypal.pyplcheckout.home.view.adapters;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import com.squareup.picasso.C17439e;
import kotlin.jvm.internal.C19383o;

public final class FundingOptionViewHolder$bind$2 implements C17439e {
    public final /* synthetic */ CardUiModel.PaymentSourceUiModel $paymentSourceUiModel;
    public final /* synthetic */ FundingOptionViewHolder this$0;

    public FundingOptionViewHolder$bind$2(FundingOptionViewHolder fundingOptionViewHolder, CardUiModel.PaymentSourceUiModel paymentSourceUiModel) {
        this.this$0 = fundingOptionViewHolder;
        this.$paymentSourceUiModel = paymentSourceUiModel;
    }

    public void onError(Exception exc) {
        C19383o.m32797g(exc, "exception");
        String access$getTAG$cp = FundingOptionViewHolder.TAG;
        C19383o.m32796f(access$getTAG$cp, "TAG");
        PLog.e$default(access$getTAG$cp, exc.getMessage(), (Throwable) null, 0, 12, (Object) null);
    }

    public void onSuccess() {
        FundingOptionViewHolder fundingOptionViewHolder = this.this$0;
        Drawable drawable = fundingOptionViewHolder.backGroundImage.getDrawable();
        if (drawable != null) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            C19383o.m32796f(bitmap, "backGroundImage.drawable as BitmapDrawable).bitmap");
            fundingOptionViewHolder.setTextColor(bitmap, this.$paymentSourceUiModel.getFundingOptionId());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
    }
}
