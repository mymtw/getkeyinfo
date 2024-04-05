package com.etsy.android.p327ui.listing.fetch;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13558a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.fetch.ListingFetchHandler$fetchListing$3 */
final class ListingFetchHandler$fetchListing$3 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C13558a.C13561c $event;
    public final /* synthetic */ C10139c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingFetchHandler$fetchListing$3(C10139c cVar, C13558a.C13561c cVar2) {
        super(1);
        this.this$0 = cVar;
        this.$event = cVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.f22299a.mo38043a(new C13558a.C13562d(this.$event.f29646a, th));
    }
}
