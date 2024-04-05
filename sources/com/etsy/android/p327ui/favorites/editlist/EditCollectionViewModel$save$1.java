package com.etsy.android.p327ui.favorites.editlist;

import androidx.lifecycle.C2895z;
import com.etsy.android.R;
import com.etsy.android.p327ui.favorites.editlist.EditCollectionViewModel;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionViewModel$save$1 */
public final class EditCollectionViewModel$save$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ EditCollectionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditCollectionViewModel$save$1(EditCollectionViewModel editCollectionViewModel) {
        super(1);
        this.this$0 = editCollectionViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        String str;
        C19383o.m32797g(th, "it");
        EditCollectionViewModel editCollectionViewModel = this.this$0;
        C2895z<EditCollectionViewModel.C9838a> zVar = editCollectionViewModel.f21739f;
        editCollectionViewModel.getClass();
        if (C18263b.m30839d0(th.getMessage())) {
            str = String.valueOf(th.getMessage());
        } else {
            str = editCollectionViewModel.f21738e.mo38059c(R.string.whoops_somethings_wrong, new Object[0]);
        }
        zVar.postValue(new EditCollectionViewModel.C9838a.C9842d(str, th));
    }
}
