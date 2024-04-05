package com.etsy.android.p327ui.favorites.editlist;

import com.etsy.android.p327ui.favorites.C9743a0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionBottomSheetFragment$updateCollectionSpec$2 */
public final class EditCollectionBottomSheetFragment$updateCollectionSpec$2 extends Lambda implements C19846a<C9743a0> {
    public final /* synthetic */ EditCollectionBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditCollectionBottomSheetFragment$updateCollectionSpec$2(EditCollectionBottomSheetFragment editCollectionBottomSheetFragment) {
        super(0);
        this.this$0 = editCollectionBottomSheetFragment;
    }

    public final C9743a0 invoke() {
        String key = this.this$0.getCollection().getKey();
        C19383o.m32796f(key, "collection.key");
        String name = this.this$0.getCollection().getName();
        String slug = this.this$0.getCollection().getPrivacyLevel().getSlug();
        C19383o.m32796f(slug, "collection.privacyLevel.slug");
        return new C9743a0(key, name, slug);
    }
}
