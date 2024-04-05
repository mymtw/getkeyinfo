package com.etsy.android.p327ui.styledbanner;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.etsy.android.lib.models.StyledBannerModel;
import com.etsy.android.lib.models.apiv3.cart.InfoModal;
import com.etsy.android.p327ui.cardview.clickhandlers.C9144y;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.text.C19459m;
import p468ve.C13786c;

/* renamed from: com.etsy.android.ui.styledbanner.StyledBannerViewHolder$processMessageLinks$1$clickableLinkSpan$1 */
public final class StyledBannerViewHolder$processMessageLinks$1$clickableLinkSpan$1 extends URLSpan {
    public final /* synthetic */ TextView $it;
    public final /* synthetic */ String $originalMessageWithLink;
    public final /* synthetic */ StyledBannerModel $styledBannerModel;
    public final /* synthetic */ C13786c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StyledBannerViewHolder$processMessageLinks$1$clickableLinkSpan$1(String str, C13786c cVar, StyledBannerModel styledBannerModel, TextView textView, String str2) {
        super(str2);
        this.$originalMessageWithLink = str;
        this.this$0 = cVar;
        this.$styledBannerModel = styledBannerModel;
        this.$it = textView;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        if (C19459m.m33036e1(this.$originalMessageWithLink, "show_home_banner_info_modal", false)) {
            C9144y yVar = this.this$0.f30325e;
            InfoModal infoModal = this.$styledBannerModel.getInfoModal();
            String analyticsName = this.$styledBannerModel.getAnalyticsName();
            StyledBannerModel styledBannerModel = this.$styledBannerModel;
            C19383o.m32797g(styledBannerModel, "<this>");
            yVar.mo31367e(infoModal, analyticsName, C19388s.m32882r0(styledBannerModel));
            return;
        }
        super.onClick(view);
    }

    public void updateDrawState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "ds");
        textPaint.setUnderlineText(true);
        textPaint.linkColor = this.$it.getCurrentTextColor();
    }
}
