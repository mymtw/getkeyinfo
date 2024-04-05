package com.etsy.android.p327ui.listing.p329ui.panels.faqs.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10406c;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10625r;
import com.etsy.android.p327ui.listing.p329ui.panels.faqs.FaqsPanel;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.faqs.handlers.FaqMachineTranslationToggleHandler$handle$1$1 */
public final class FaqMachineTranslationToggleHandler$handle$1$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ FaqsPanel.LanguageState $currentLanguageState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FaqMachineTranslationToggleHandler$handle$1$1(FaqsPanel.LanguageState languageState) {
        super(1);
        this.$currentLanguageState = languageState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final FaqsPanel.LanguageState languageState = this.$currentLanguageState;
        gVar.mo33964d(new C19857l<C10625r, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10625r) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10625r rVar) {
                C19383o.m32797g(rVar, "$this$panels");
                final FaqsPanel.LanguageState languageState = languageState;
                rVar.mo34251a(new C19857l<C10406c, C19394m>() {

                    /* renamed from: com.etsy.android.ui.listing.ui.panels.faqs.handlers.FaqMachineTranslationToggleHandler$handle$1$1$1$1$a */
                    public /* synthetic */ class C10471a {

                        /* renamed from: a */
                        public static final /* synthetic */ int[] f22998a;

                        static {
                            int[] iArr = new int[FaqsPanel.LanguageState.values().length];
                            iArr[FaqsPanel.LanguageState.ORIGINAL.ordinal()] = 1;
                            iArr[FaqsPanel.LanguageState.ALTERNATE.ordinal()] = 2;
                            f22998a = iArr;
                        }
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C10406c) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(C10406c cVar) {
                        FaqsPanel.LanguageState languageState;
                        C19383o.m32797g(cVar, "$this$faqsPanel");
                        int i = C10471a.f22998a[languageState.ordinal()];
                        if (i == 1) {
                            languageState = FaqsPanel.LanguageState.ALTERNATE;
                        } else if (i == 2) {
                            languageState = FaqsPanel.LanguageState.ORIGINAL;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        C19383o.m32797g(languageState, "<set-?>");
                        cVar.f22776c = languageState;
                    }
                });
            }
        });
    }
}
