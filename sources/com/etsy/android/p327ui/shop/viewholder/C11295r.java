package com.etsy.android.p327ui.shop.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.shop.C11188p0;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import com.etsy.android.uikit.view.TranslateButton;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p452te.C13394c;

/* renamed from: com.etsy.android.ui.shop.viewholder.r */
public final class C11295r extends C12086e<C13394c> {

    /* renamed from: c */
    public final C8923u f24937c;

    /* renamed from: d */
    public final TextView f24938d;

    /* renamed from: e */
    public final TranslateButton f24939e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11295r(ViewGroup viewGroup, C8923u uVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shop_home_review_message, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(uVar, "translationHelper");
        this.f24937c = uVar;
        View findViewById = this.itemView.findViewById(R.id.review_message);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.review_message)");
        this.f24938d = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.shop_review_translate_button);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.…_review_translate_button)");
        this.f24939e = (TranslateButton) findViewById2;
        C11188p0.m19137a(this.itemView);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C13394c cVar = (C13394c) obj;
        C19383o.m32797g(cVar, "data");
        mo36979g(cVar);
        TranslateButton translateButton = this.f24939e;
        MachineTranslationViewState machineTranslationViewState = cVar.f29334d;
        C19383o.m32796f(machineTranslationViewState, "data.translationState");
        translateButton.configureForState(machineTranslationViewState);
        if (this.f24937c.mo30498a(cVar.f29331a.getReviewMessage(), cVar.f29331a.getReviewLanguage())) {
            ViewExtensions.m12869m(this.f24939e);
            this.f24939e.setOnTranslateClickListener(new ShopHomeReviewMessageViewHolder$bind$1(cVar, this, new C8698l[0]));
            return;
        }
        ViewExtensions.m12860d(this.f24939e);
    }

    /* renamed from: g */
    public final void mo36979g(C13394c cVar) {
        this.f24938d.setText((!cVar.f29331a.getTranslationState().isTranslated() || !cVar.f29331a.getTranslationState().getShouldShowTranslation()) ? cVar.f29331a.getReviewMessage() : cVar.f29331a.getTranslatedReview());
    }
}
