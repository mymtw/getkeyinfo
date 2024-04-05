package com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers;

import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10194a;
import com.etsy.android.p327ui.listing.p329ui.C10408e;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10625r;
import com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.handlers.ContentMachineTranslationLoadingHandler$handle$1 */
final class ContentMachineTranslationLoadingHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13731t $event;
    public final /* synthetic */ ListingViewState.C10092d $state;
    public final /* synthetic */ C10507b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentMachineTranslationLoadingHandler$handle$1(ListingViewState.C10092d dVar, C10507b bVar, C13597g.C13731t tVar) {
        super(1);
        this.$state = dVar;
        this.this$0 = bVar;
        this.$event = tVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C13597g.C13731t tVar = this.$event;
        gVar.mo33964d(new C19857l<C10625r, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10625r) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10625r rVar) {
                C19383o.m32797g(rVar, "$this$panels");
                final C13597g.C13731t tVar = tVar;
                rVar.mo34252b(new C19857l<C10408e, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C10408e) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(C10408e eVar) {
                        MachineTranslationViewState machineTranslationViewState;
                        C19383o.m32797g(eVar, "$this$itemDetailsPanel");
                        if (tVar.f30253a) {
                            machineTranslationViewState = MachineTranslationViewState.LOADING;
                        } else {
                            machineTranslationViewState = MachineTranslationViewState.VISIBLE;
                        }
                        C19383o.m32797g(machineTranslationViewState, "<set-?>");
                        eVar.f22796n = machineTranslationViewState;
                    }
                });
            }
        });
        if (C19383o.m32792b(this.$state.f22238f.f22803f.f22848f.f23014f, Boolean.FALSE) && this.this$0.f23056a.mo33537a()) {
            final C13597g.C13731t tVar2 = this.$event;
            final ListingViewState.C10092d dVar = this.$state;
            gVar.mo33961a(new C19857l<C10194a, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((C10194a) obj);
                    return C19394m.f43287a;
                }

                public final void invoke(C10194a aVar) {
                    MachineTranslationViewState machineTranslationViewState;
                    C19383o.m32797g(aVar, "$this$bottomSheetContent");
                    if (tVar2.f30253a) {
                        machineTranslationViewState = MachineTranslationViewState.LOADING;
                    } else {
                        machineTranslationViewState = MachineTranslationViewState.VISIBLE;
                    }
                    C19383o.m32797g(machineTranslationViewState, "<set-?>");
                    aVar.f22372f = machineTranslationViewState;
                    Boolean bool = Boolean.TRUE;
                    aVar.f22370d = bool;
                    aVar.f22371e = bool;
                    aVar.f22373g = dVar.f22238f.f22803f.f22848f.mo34050b();
                }
            });
        }
    }
}
