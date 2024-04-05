package com.etsy.android.p327ui.listing.p329ui.buybox.personalization.optional.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.optional.C10279a;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.personalization.optional.handlers.PersonalizationOptionalToggledHandler$handle$1$1 */
public final class PersonalizationOptionalToggledHandler$handle$1$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ boolean $newCheckedValue;
    public final /* synthetic */ C10279a $personalizationOptional;
    public final /* synthetic */ String $userInput;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersonalizationOptionalToggledHandler$handle$1$1(C10279a aVar, boolean z, String str) {
        super(1);
        this.$personalizationOptional = aVar;
        this.$newCheckedValue = z;
        this.$userInput = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C10279a aVar = this.$personalizationOptional;
        final boolean z = this.$newCheckedValue;
        final String str = this.$userInput;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10195b bVar) {
                C19383o.m32797g(bVar, "$this$buyBox");
                bVar.f22388n = C10279a.m18340b(aVar, z, (Integer) null, str, 14);
            }
        });
    }
}
