package com.etsy.android.p327ui.listing.p329ui.buybox.personalization.optional.handlers;

import com.etsy.android.R;
import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.optional.C10279a;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.personalization.optional.handlers.PersonalizationOptionalTextChangedHandler$handle$1 */
public final class PersonalizationOptionalTextChangedHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13713q2 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersonalizationOptionalTextChangedHandler$handle$1(C13597g.C13713q2 q2Var) {
        super(1);
        this.$event = q2Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C13597g.C13713q2 q2Var = this.$event;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10195b bVar) {
                C19383o.m32797g(bVar, "$this$buyBox");
                C10423j jVar = bVar.f22388n;
                Integer num = null;
                C10279a aVar = jVar instanceof C10279a ? (C10279a) jVar : null;
                if (aVar != null) {
                    C13597g.C13713q2 q2Var = q2Var;
                    if (q2Var.f30227a.length() > aVar.f22587c) {
                        num = Integer.valueOf(R.string.listing_personalization_length_error);
                    }
                    bVar.f22388n = C10279a.m18340b(aVar, false, num, q2Var.f30227a, 7);
                }
            }
        });
    }
}
