package com.etsy.android.p327ui.favorites.recommendations;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.favorites.recommendations.CollectionContainerFragment$buyersInformationHeaderIsEnabled$2 */
public final class CollectionContainerFragment$buyersInformationHeaderIsEnabled$2 extends Lambda implements C19846a<Boolean> {
    public final /* synthetic */ CollectionContainerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionContainerFragment$buyersInformationHeaderIsEnabled$2(CollectionContainerFragment collectionContainerFragment) {
        super(0);
        this.this$0 = collectionContainerFragment;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.getCollectionHeaderEligibility().mo32787a());
    }
}
