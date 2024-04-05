package com.etsy.android.p327ui.styledbanner;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.etsy.android.lib.models.StyledBannerModel;
import kotlin.jvm.internal.C19383o;
import p468ve.C13786c;

/* renamed from: com.etsy.android.ui.styledbanner.StyledBannerViewHolder$createClickableBannerSpan$1 */
public final class StyledBannerViewHolder$createClickableBannerSpan$1 extends ClickableSpan {
    public final /* synthetic */ StyledBannerModel $styledBannerModel;
    public final /* synthetic */ int $textColor;
    public final /* synthetic */ C13786c this$0;

    public StyledBannerViewHolder$createClickableBannerSpan$1(C13786c cVar, StyledBannerModel styledBannerModel, int i) {
        this.this$0 = cVar;
        this.$styledBannerModel = styledBannerModel;
        this.$textColor = i;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        this.this$0.f30325e.mo31328c(this.$styledBannerModel);
    }

    public void updateDrawState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "drawState");
        textPaint.setUnderlineText(false);
        textPaint.linkColor = this.$textColor;
    }
}
