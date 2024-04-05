package com.etsy.android.p327ui.favorites.recommendations;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.etsy.android.p327ui.favorites.CollectionTitleView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.favorites.recommendations.CollectionContainerFragment$collectionTitleView$2 */
public final class CollectionContainerFragment$collectionTitleView$2 extends Lambda implements C19846a<CollectionTitleView> {
    public final /* synthetic */ CollectionContainerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionContainerFragment$collectionTitleView$2(CollectionContainerFragment collectionContainerFragment) {
        super(0);
        this.this$0 = collectionContainerFragment;
    }

    public final CollectionTitleView invoke() {
        Context context;
        View view = this.this$0.getView();
        if (view == null || (context = view.getContext()) == null) {
            return null;
        }
        return new CollectionTitleView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }
}
