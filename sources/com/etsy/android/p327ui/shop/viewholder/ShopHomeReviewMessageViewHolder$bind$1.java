package com.etsy.android.p327ui.shop.viewholder;

import android.view.View;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.uikit.view.TranslateButton;
import kotlin.jvm.internal.C19383o;
import p452te.C13394c;

/* renamed from: com.etsy.android.ui.shop.viewholder.ShopHomeReviewMessageViewHolder$bind$1 */
public final class ShopHomeReviewMessageViewHolder$bind$1 extends TrackingOnClickListener {
    public final /* synthetic */ C13394c $data;
    public final /* synthetic */ C11295r this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShopHomeReviewMessageViewHolder$bind$1(C13394c cVar, C11295r rVar, C8698l[] lVarArr) {
        super(false, lVarArr);
        this.$data = cVar;
        this.this$0 = rVar;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "view");
        this.$data.f29331a.getTranslationState().toggleShouldShowTranslation();
        if (this.$data.f29331a.getTranslationState().isTranslated()) {
            TranslateButton translateButton = this.this$0.f24939e;
            MachineTranslationViewState translationState = this.$data.f29331a.getTranslationState();
            C19383o.m32796f(translationState, "data.review.translationState");
            translateButton.configureForState(translationState);
            this.this$0.mo36979g(this.$data);
            return;
        }
        this.$data.f29334d.setTranslating();
        TranslateButton translateButton2 = this.this$0.f24939e;
        MachineTranslationViewState machineTranslationViewState = this.$data.f29334d;
        C19383o.m32796f(machineTranslationViewState, "data.translationState");
        translateButton2.configureForState(machineTranslationViewState);
        C13394c cVar = this.$data;
        C11192q0.C11193a aVar = cVar.f29333c.f24741a;
        if (aVar != null) {
            aVar.translateReviewMessage(cVar);
        }
    }
}
