package com.etsy.android.p327ui.favorites.editlist;

import android.content.Context;
import android.view.View;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.C9056g;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionBottomSheetFragment$onViewCreated$1 */
public final class EditCollectionBottomSheetFragment$onViewCreated$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ EditCollectionBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditCollectionBottomSheetFragment$onViewCreated$1(EditCollectionBottomSheetFragment editCollectionBottomSheetFragment) {
        super(1);
        this.this$0 = editCollectionBottomSheetFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        Context requireContext = this.this$0.requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        C9056g gVar = new C9056g(requireContext);
        EditCollectionBottomSheetFragment editCollectionBottomSheetFragment = this.this$0;
        gVar.mo70023l(R.string.collection_delete_warning_alert_body);
        gVar.setPositiveButton(R.string.delete, new C9846b(editCollectionBottomSheetFragment));
        gVar.setNegativeButton(R.string.cancel, new C9847c());
        gVar.create();
        gVar.mo1240k();
    }
}
