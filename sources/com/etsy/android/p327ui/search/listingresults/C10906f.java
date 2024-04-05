package com.etsy.android.p327ui.search.listingresults;

import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.dagger.C8655n;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.search.listingresults.f */
public final class C10906f implements C17555d<ListingCardViewHolderOptions.C11974h> {

    /* renamed from: a */
    public final C19382n f24212a;

    /* renamed from: b */
    public final C19011a<C8623e> f24213b;

    public C10906f(C19382n nVar, C8655n nVar2) {
        this.f24212a = nVar;
        this.f24213b = nVar2;
    }

    public final Object get() {
        C19382n nVar = this.f24212a;
        C8623e eVar = this.f24213b.get();
        nVar.getClass();
        C19383o.m32797g(eVar, "configMap");
        return new ListingCardViewHolderOptions.C11974h(eVar);
    }
}
