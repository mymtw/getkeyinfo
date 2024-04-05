package com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.C10285a;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.personalization.required.handlers.PersonalizationRequiredToggledHandler$handle$1$1 */
public final class PersonalizationRequiredToggledHandler$handle$1$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C10285a $personalizationRequired;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersonalizationRequiredToggledHandler$handle$1$1(C10285a aVar) {
        super(1);
        this.$personalizationRequired = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C10285a aVar = this.$personalizationRequired;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10195b bVar) {
                C19383o.m32797g(bVar, "$this$buyBox");
                C10285a aVar = aVar;
                bVar.f22388n = C10285a.m18346b(aVar, !aVar.f22599a, (Integer) null, (String) null, 30);
            }
        });
    }
}
