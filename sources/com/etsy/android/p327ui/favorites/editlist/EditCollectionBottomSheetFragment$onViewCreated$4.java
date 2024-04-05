package com.etsy.android.p327ui.favorites.editlist;

import android.view.View;
import android.widget.ImageView;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.p327ui.favorites.C9743a0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionBottomSheetFragment$onViewCreated$4 */
public final class EditCollectionBottomSheetFragment$onViewCreated$4 extends Lambda implements C19861p<View, Boolean, C19394m> {
    public final /* synthetic */ EditCollectionBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditCollectionBottomSheetFragment$onViewCreated$4(EditCollectionBottomSheetFragment editCollectionBottomSheetFragment) {
        super(2);
        this.this$0 = editCollectionBottomSheetFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((View) obj, ((Boolean) obj2).booleanValue());
        return C19394m.f43287a;
    }

    public final void invoke(View view, boolean z) {
        C19383o.m32797g(view, "<anonymous parameter 0>");
        Collection.PrivacyLevel privacyLevel = z ? Collection.PrivacyLevel.PRIVATE : Collection.PrivacyLevel.PUBLIC;
        C9743a0 access$getUpdateCollectionSpec = this.this$0.getUpdateCollectionSpec();
        String slug = privacyLevel.getSlug();
        C19383o.m32796f(slug, "privacyLevel.slug");
        access$getUpdateCollectionSpec.getClass();
        access$getUpdateCollectionSpec.f21541c = slug;
        ImageView access$getPrivacyIcon$p = this.this$0.privacyIcon;
        if (access$getPrivacyIcon$p != null) {
            access$getPrivacyIcon$p.setImageResource(privacyLevel.getIcon());
        } else {
            C19383o.m32805o("privacyIcon");
            throw null;
        }
    }
}
