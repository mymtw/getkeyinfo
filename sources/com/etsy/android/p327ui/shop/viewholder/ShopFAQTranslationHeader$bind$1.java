package com.etsy.android.p327ui.shop.viewholder;

import android.view.View;
import com.etsy.android.lib.models.apiv3.FAQs;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.viewholder.ShopFAQTranslationHeader$bind$1 */
public final class ShopFAQTranslationHeader$bind$1 extends TrackingOnClickListener {
    public final /* synthetic */ FAQs $faqs;
    public final /* synthetic */ ShopFAQTranslationHeader this$0;

    public ShopFAQTranslationHeader$bind$1(FAQs fAQs, ShopFAQTranslationHeader shopFAQTranslationHeader) {
        this.$faqs = fAQs;
        this.this$0 = shopFAQTranslationHeader;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        if (!this.$faqs.getTranslationState().isTranslated()) {
            this.$faqs.getTranslationState().setTranslating();
        }
        ShopFAQTranslationHeader shopFAQTranslationHeader = this.this$0;
        int i = ShopFAQTranslationHeader.f24844f;
        shopFAQTranslationHeader.mo36958g().configureForState(this.$faqs.getTranslationState());
        C11192q0 q0Var = this.this$0.f24845c;
        FAQs fAQs = this.$faqs;
        C11192q0.C11193a aVar = q0Var.f24741a;
        if (aVar != null) {
            aVar.translateFAQs(fAQs);
        }
    }
}
