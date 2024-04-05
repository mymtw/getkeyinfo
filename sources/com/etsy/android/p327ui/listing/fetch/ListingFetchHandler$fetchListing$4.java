package com.etsy.android.p327ui.listing.fetch;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p321cc.C8569c;
import p466vc.C13558a;
import p466vc.C13573c;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.fetch.ListingFetchHandler$fetchListing$4 */
final class ListingFetchHandler$fetchListing$4 extends Lambda implements C19857l<C8569c.C8570a, C19394m> {
    public final /* synthetic */ C13558a.C13561c $event;
    public final /* synthetic */ C10139c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingFetchHandler$fetchListing$4(C10139c cVar, C13558a.C13561c cVar2) {
        super(1);
        this.this$0 = cVar;
        this.$event = cVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8569c.C8570a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8569c.C8570a aVar) {
        C13573c cVar = this.this$0.f22299a;
        long j = this.$event.f29646a;
        C19383o.m32796f(aVar, "it");
        cVar.mo38043a(new C13558a.C13563e(j, aVar));
    }
}
