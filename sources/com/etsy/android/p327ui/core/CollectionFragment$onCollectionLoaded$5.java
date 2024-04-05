package com.etsy.android.p327ui.core;

import com.etsy.android.lib.models.cardviewelement.Page;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.CollectionFragment$onCollectionLoaded$5 */
public final class CollectionFragment$onCollectionLoaded$5 extends Lambda implements C19857l<Page, C19394m> {
    public final /* synthetic */ C9618f $result;
    public final /* synthetic */ CollectionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionFragment$onCollectionLoaded$5(CollectionFragment collectionFragment, C9618f fVar) {
        super(1);
        this.this$0 = collectionFragment;
        this.$result = fVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Page) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Page page) {
        this.this$0.onLoadComplete(page);
        this.this$0.getPagination().mo46061d(this.this$0.adapter.getItemCount() - 1, this.$result.f21311b);
    }
}
