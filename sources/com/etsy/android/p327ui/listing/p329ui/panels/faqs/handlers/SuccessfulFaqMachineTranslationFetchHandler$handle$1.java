package com.etsy.android.p327ui.listing.p329ui.panels.faqs.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10406c;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10625r;
import com.etsy.android.p327ui.listing.p329ui.panels.faqs.FaqsPanel;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.faqs.handlers.SuccessfulFaqMachineTranslationFetchHandler$handle$1 */
public final class SuccessfulFaqMachineTranslationFetchHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ List<FaqsPanel.C10461a> $translatedFaqs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuccessfulFaqMachineTranslationFetchHandler$handle$1(List<FaqsPanel.C10461a> list) {
        super(1);
        this.$translatedFaqs = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final List<FaqsPanel.C10461a> list = this.$translatedFaqs;
        gVar.mo33964d(new C19857l<C10625r, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10625r) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10625r rVar) {
                C19383o.m32797g(rVar, "$this$panels");
                final List<FaqsPanel.C10461a> list = list;
                rVar.mo34251a(new C19857l<C10406c, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C10406c) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(C10406c cVar) {
                        C19383o.m32797g(cVar, "$this$faqsPanel");
                        List<FaqsPanel.C10461a> list = list;
                        C19383o.m32797g(list, "<set-?>");
                        cVar.f22775b = list;
                        FaqsPanel.LanguageState languageState = FaqsPanel.LanguageState.ALTERNATE;
                        C19383o.m32797g(languageState, "<set-?>");
                        cVar.f22776c = languageState;
                    }
                });
            }
        });
    }
}
