package com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10625r;
import com.etsy.android.p327ui.listing.p329ui.C10649t;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.handlers.ReviewTypeTabSelectedHandler$handle$1 */
public final class ReviewTypeTabSelectedHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13630e3 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewTypeTabSelectedHandler$handle$1(C13597g.C13630e3 e3Var) {
        super(1);
        this.$event = e3Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C13597g.C13630e3 e3Var = this.$event;
        gVar.mo33964d(new C19857l<C10625r, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10625r) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10625r rVar) {
                C19383o.m32797g(rVar, "$this$panels");
                final C13597g.C13630e3 e3Var = e3Var;
                rVar.mo34253c(new C19857l<C10649t, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C10649t) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(C10649t tVar) {
                        C19383o.m32797g(tVar, "$this$reviewsPanel");
                        e3Var.getClass();
                        C19383o.m32797g((Object) null, "<set-?>");
                        throw null;
                    }
                });
            }
        });
    }
}
