package com.appboy.p043ui.widget;

import android.view.View;
import com.appboy.models.cards.BannerImageCard;
import com.etsy.android.lib.models.cardviewelement.SectionFooter;
import com.etsy.android.lib.models.cardviewelement.TooltipButton;
import com.etsy.android.vespa.viewholders.C12081b0;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.appboy.ui.widget.a */
public final /* synthetic */ class C4955a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f11156b;

    /* renamed from: c */
    public final /* synthetic */ Object f11157c;

    /* renamed from: d */
    public final /* synthetic */ Object f11158d;

    public /* synthetic */ C4955a(int i, Object obj, Object obj2) {
        this.f11156b = i;
        this.f11157c = obj;
        this.f11158d = obj2;
    }

    public final void onClick(View view) {
        switch (this.f11156b) {
            case 0:
                ((BannerImageCardView) this.f11157c).lambda$onSetCard$0((BannerImageCard) this.f11158d, view);
                return;
            default:
                SectionFooter sectionFooter = (SectionFooter) this.f11157c;
                C12081b0 b0Var = (C12081b0) this.f11158d;
                int i = C12081b0.f26950d;
                C19383o.m32797g(sectionFooter, "$data");
                C19383o.m32797g(b0Var, "this$0");
                TooltipButton tooltipButton = sectionFooter.getTooltipButton();
                if (tooltipButton != null) {
                    b0Var.f26951c.mo31328c(tooltipButton);
                    return;
                }
                return;
        }
    }
}
