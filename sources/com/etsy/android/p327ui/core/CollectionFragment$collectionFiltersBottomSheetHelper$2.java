package com.etsy.android.p327ui.core;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import p420pc.C13212a;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.core.CollectionFragment$collectionFiltersBottomSheetHelper$2 */
public final class CollectionFragment$collectionFiltersBottomSheetHelper$2 extends Lambda implements C19846a<C13212a> {
    public final /* synthetic */ CollectionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionFragment$collectionFiltersBottomSheetHelper$2(CollectionFragment collectionFragment) {
        super(0);
        this.this$0 = collectionFragment;
    }

    public final C13212a invoke() {
        Context context = this.this$0.getContext();
        if (context != null) {
            return new C13212a(context);
        }
        return null;
    }
}
