package com.etsy.android.p327ui.favorites.editlist;

import android.content.Context;
import android.view.View;
import androidx.compose.p015ui.text.input.C1993m;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionBottomSheetFragment$onViewCreated$5 */
public final class EditCollectionBottomSheetFragment$onViewCreated$5 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ EditCollectionBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditCollectionBottomSheetFragment$onViewCreated$5(EditCollectionBottomSheetFragment editCollectionBottomSheetFragment) {
        super(1);
        this.this$0 = editCollectionBottomSheetFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        Context requireContext = this.this$0.requireContext();
        C19383o.m32796f(requireContext, "this.requireContext()");
        String url = this.this$0.getCollection().getUrl();
        C19383o.m32796f(url, "collection.url");
        C1993m.m4365Z(requireContext, url);
    }
}
