package com.etsy.android.p327ui.core;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.CollectionFragment$getCollection$2 */
public final class CollectionFragment$getCollection$2 extends Lambda implements C19857l<C9618f, C19394m> {
    public final /* synthetic */ CollectionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionFragment$getCollection$2(CollectionFragment collectionFragment) {
        super(1);
        this.this$0 = collectionFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9618f) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9618f fVar) {
        CollectionFragment collectionFragment = this.this$0;
        C19383o.m32796f(fVar, "it");
        collectionFragment.onCollectionLoaded(fVar);
    }
}
