package com.etsy.android.p327ui.favorites.editlist;

import com.etsy.android.p327ui.favorites.editlist.EditCollectionViewModel;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionViewModel$delete$1 */
final class EditCollectionViewModel$delete$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ EditCollectionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditCollectionViewModel$delete$1(EditCollectionViewModel editCollectionViewModel) {
        super(1);
        this.this$0 = editCollectionViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.f21739f.postValue(new EditCollectionViewModel.C9838a.C9839a(th));
    }
}
