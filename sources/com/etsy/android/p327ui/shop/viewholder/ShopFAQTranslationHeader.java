package com.etsy.android.p327ui.shop.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FAQ;
import com.etsy.android.lib.models.apiv3.FAQs;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.uikit.view.MachineTranslationButton;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.Iterator;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import p486y9.C13888d;

/* renamed from: com.etsy.android.ui.shop.viewholder.ShopFAQTranslationHeader */
public final class ShopFAQTranslationHeader extends C12086e<FAQs> {

    /* renamed from: f */
    public static final /* synthetic */ int f24844f = 0;

    /* renamed from: c */
    public final C11192q0 f24845c;

    /* renamed from: d */
    public final C13888d f24846d;

    /* renamed from: e */
    public final C19285c f24847e = C19350d.m32677b(new ShopFAQTranslationHeader$translationButton$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShopFAQTranslationHeader(ViewGroup viewGroup, C11192q0 q0Var, C13888d dVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shop_home_subsection_with_translate, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(q0Var, "stateManager");
        C19383o.m32797g(dVar, "currentLocale");
        this.f24845c = q0Var;
        this.f24846d = dVar;
        ((TextView) this.itemView.findViewById(R.id.title)).setText(this.itemView.getContext().getString(R.string.faq_title));
        View view = this.itemView;
        C19383o.m32796f(view, "itemView");
        ViewsExtensionsKt.m17424c(view, true);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        boolean z;
        FAQs fAQs = (FAQs) obj;
        C19383o.m32797g(fAQs, "faqs");
        String language = this.f24846d.mo46718b().getLanguage();
        Iterator it = fAQs.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            FAQ faq = (FAQ) it.next();
            if (C8885d0.m17323g(faq.getLanguage()) && !C19383o.m32792b(faq.getLanguage(), language)) {
                z = true;
                break;
            }
        }
        if (z) {
            ViewExtensions.m12869m(mo36958g());
            mo36958g().configureForState(fAQs.getTranslationState());
            mo36958g().setOnClickListener(new ShopFAQTranslationHeader$bind$1(fAQs, this));
            return;
        }
        ViewExtensions.m12860d(mo36958g());
    }

    /* renamed from: g */
    public final MachineTranslationButton mo36958g() {
        Object value = this.f24847e.getValue();
        C19383o.m32796f(value, "<get-translationButton>(...)");
        return (MachineTranslationButton) value;
    }
}
