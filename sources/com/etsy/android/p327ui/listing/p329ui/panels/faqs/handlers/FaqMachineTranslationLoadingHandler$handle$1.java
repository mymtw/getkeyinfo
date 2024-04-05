package com.etsy.android.p327ui.listing.p329ui.panels.faqs.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10406c;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10625r;
import com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.faqs.handlers.FaqMachineTranslationLoadingHandler$handle$1 */
public final class FaqMachineTranslationLoadingHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13662j0 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FaqMachineTranslationLoadingHandler$handle$1(C13597g.C13662j0 j0Var) {
        super(1);
        this.$event = j0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C13597g.C13662j0 j0Var = this.$event;
        gVar.mo33964d(new C19857l<C10625r, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10625r) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10625r rVar) {
                C19383o.m32797g(rVar, "$this$panels");
                final C13597g.C13662j0 j0Var = j0Var;
                rVar.mo34251a(new C19857l<C10406c, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C10406c) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(C10406c cVar) {
                        MachineTranslationViewState machineTranslationViewState;
                        C19383o.m32797g(cVar, "$this$faqsPanel");
                        if (j0Var.f30155a) {
                            machineTranslationViewState = MachineTranslationViewState.LOADING;
                        } else {
                            machineTranslationViewState = MachineTranslationViewState.VISIBLE;
                        }
                        C19383o.m32797g(machineTranslationViewState, "<set-?>");
                        cVar.f22777d = machineTranslationViewState;
                    }
                });
            }
        });
    }
}
