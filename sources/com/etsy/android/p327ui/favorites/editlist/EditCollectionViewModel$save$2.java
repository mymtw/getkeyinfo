package com.etsy.android.p327ui.favorites.editlist;

import androidx.lifecycle.C2895z;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.p327ui.favorites.editlist.EditCollectionViewModel;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionViewModel$save$2 */
public final class EditCollectionViewModel$save$2 extends Lambda implements C19857l<Collection, C19394m> {
    public final /* synthetic */ EditCollectionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditCollectionViewModel$save$2(EditCollectionViewModel editCollectionViewModel) {
        super(1);
        this.this$0 = editCollectionViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Collection) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Collection collection) {
        C2895z<EditCollectionViewModel.C9838a> zVar = this.this$0.f21739f;
        C19383o.m32796f(collection, "it");
        zVar.postValue(new EditCollectionViewModel.C9838a.C9843e(collection));
    }
}
