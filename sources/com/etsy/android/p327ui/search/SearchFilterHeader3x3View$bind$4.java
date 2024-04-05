package com.etsy.android.p327ui.search;

import android.view.View;
import com.etsy.android.p327ui.cardview.clickhandlers.C9141v;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.SearchFilterHeader3x3View$bind$4 */
public final class SearchFilterHeader3x3View$bind$4 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C9141v $clickHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFilterHeader3x3View$bind$4(C9141v vVar) {
        super(1);
        this.$clickHandler = vVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C19846a<C19394m> aVar = this.$clickHandler.f20084d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
