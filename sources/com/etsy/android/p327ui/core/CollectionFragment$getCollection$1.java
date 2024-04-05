package com.etsy.android.p327ui.core;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.CollectionFragment$getCollection$1 */
public final class CollectionFragment$getCollection$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ CollectionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionFragment$getCollection$1(CollectionFragment collectionFragment) {
        super(1);
        this.this$0 = collectionFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.onLoadFailure();
    }
}
