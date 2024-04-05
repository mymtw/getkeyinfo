package com.etsy.android.p327ui.listing.p329ui.panels.faqs.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.apiv3.TranslatedFaq;
import com.etsy.android.lib.models.apiv3.cart.GooglePayData;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10409f;
import com.etsy.android.p327ui.listing.p329ui.C10425l;
import com.etsy.android.p327ui.listing.p329ui.panels.faqs.FaqsPanel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p466vc.C13574d;
import p466vc.C13597g;
import p735br.C18980c;

/* renamed from: com.etsy.android.ui.listing.ui.panels.faqs.handlers.SuccessfulFaqMachineTranslationFetchHandler */
public final class SuccessfulFaqMachineTranslationFetchHandler {
    /* renamed from: a */
    public static C13574d.C13594c m18461a(ListingViewState.C10092d dVar, C13597g.C13715q4 q4Var) {
        FaqsPanel.C10461a aVar;
        long j;
        C19383o.m32797g(q4Var, "event");
        List<TranslatedFaq> list = q4Var.f30230a;
        ArrayList arrayList = new ArrayList();
        for (TranslatedFaq translatedFaq : list) {
            String id = translatedFaq.getId();
            if (id != null) {
                byte[] bArr = C18980c.f42301a;
                try {
                    j = Long.parseLong(id);
                } catch (NumberFormatException unused) {
                    j = 0;
                }
                String str = q4Var.f30231b;
                String question = translatedFaq.getQuestion();
                String str2 = question == null ? "" : question;
                String answer = translatedFaq.getAnswer();
                aVar = new FaqsPanel.C10461a(j, str, str2, answer == null ? "" : answer);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return C0761x.m1709a1(ListingViewState.C10092d.m18242e(dVar, false, (C10409f) null, (GooglePayData) null, (AppsInventoryAddToCartContext) null, C10425l.m18427a(dVar.f22242j, false, true, 255), false, 895), new SuccessfulFaqMachineTranslationFetchHandler$handle$1(arrayList));
    }
}
