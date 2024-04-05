package com.etsy.android.p327ui.listing;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.listing.viewholders.C10672a;
import dagger.internal.C17555d;
import dagger.internal.C17556e;
import kotlin.jvm.internal.C19383o;
import p040c9.C4591k;
import p084d9.C6672b;
import p487ya.C13895a;
import p514bk.C14088a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.listing.f */
public final class C10103f implements C17555d<C10672a> {

    /* renamed from: a */
    public final C14088a f22279a;

    /* renamed from: b */
    public final C19011a<BOEActivity> f22280b;

    /* renamed from: c */
    public final C19011a<C13895a> f22281c;

    /* renamed from: d */
    public final C19011a<C8618c> f22282d;

    /* renamed from: e */
    public final C19011a<C10156h> f22283e;

    public C10103f(C14088a aVar, C17556e eVar, C19011a aVar2, C4591k kVar, C6672b bVar) {
        this.f22279a = aVar;
        this.f22280b = eVar;
        this.f22281c = aVar2;
        this.f22282d = kVar;
        this.f22283e = bVar;
    }

    public final Object get() {
        C14088a aVar = this.f22279a;
        BOEActivity bOEActivity = this.f22280b.get();
        C13895a aVar2 = this.f22281c.get();
        C8618c cVar = this.f22282d.get();
        C10156h hVar = this.f22283e.get();
        aVar.getClass();
        C19383o.m32797g(bOEActivity, "boeActivity");
        C19383o.m32797g(aVar2, "fileSupport");
        C19383o.m32797g(cVar, "configMap");
        C19383o.m32797g(hVar, "listingViewEligibility");
        return new C10672a(bOEActivity, aVar2, cVar, hVar);
    }
}
