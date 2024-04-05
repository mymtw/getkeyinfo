package com.etsy.android.p327ui.favorites.recommendations;

import android.view.View;
import com.etsy.android.lib.models.UserCollection;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.EditCollectionBottomSheetKey;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p356ge.C12790b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.recommendations.CollectionContainerFragment$setUpCollectionTitleView$1$1 */
public final class CollectionContainerFragment$setUpCollectionTitleView$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CollectionContainerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionContainerFragment$setUpCollectionTitleView$1$1(CollectionContainerFragment collectionContainerFragment) {
        super(1);
        this.this$0 = collectionContainerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        Collection collection;
        UserCollection userCollection = this.this$0.getUserCollection();
        if (userCollection != null && (collection = userCollection.getCollection()) != null) {
            CollectionContainerFragment collectionContainerFragment = this.this$0;
            C12790b.m20430b(collectionContainerFragment, new EditCollectionBottomSheetKey(C19421p.m32935c0(collectionContainerFragment.getActivity()), collection));
        }
    }
}
