package com.etsy.android.p327ui.listing.p329ui.buybox.lottienudge;

import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.lottienudge.LottieNudgeVisibilityChangedHandler$handle$1 */
final class LottieNudgeVisibilityChangedHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13767y1 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LottieNudgeVisibilityChangedHandler$handle$1(C13597g.C13767y1 y1Var) {
        super(1);
        this.$event = y1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C13597g.C13767y1 y1Var = this.$event;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10195b bVar) {
                C19383o.m32797g(bVar, "$this$buyBox");
                C10266c cVar = bVar.f22393s;
                bVar.f22393s = cVar != null ? C10266c.m18331b(cVar, y1Var.f30298a, false, 123) : null;
            }
        });
    }
}
