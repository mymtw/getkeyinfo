package com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10194a;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.handlers.ReadItemDescriptionClickedHandler$handle$1 */
public final class ReadItemDescriptionClickedHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13762x2 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReadItemDescriptionClickedHandler$handle$1(C13597g.C13762x2 x2Var) {
        super(1);
        this.$event = x2Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C13597g.C13762x2 x2Var = this.$event;
        gVar.mo33961a(new C19857l<C10194a, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10194a) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10194a aVar) {
                C19383o.m32797g(aVar, "$this$bottomSheetContent");
                C13597g.C13762x2 x2Var = x2Var;
                aVar.f22367a = x2Var.f30290a;
                aVar.f22369c = x2Var.f30291b;
                Boolean bool = Boolean.TRUE;
                aVar.f22370d = bool;
                aVar.f22371e = bool;
                MachineTranslationViewState machineTranslationViewState = x2Var.f30292c;
                C19383o.m32797g(machineTranslationViewState, "<set-?>");
                aVar.f22372f = machineTranslationViewState;
                aVar.f22373g = x2Var.f30293d;
            }
        });
    }
}
