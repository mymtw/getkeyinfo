package com.etsy.android.p327ui.favorites.createalist;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.createalist.CreateNewCollectionButton$addButtonAsHeader$1 */
final class CreateNewCollectionButton$addButtonAsHeader$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ View.OnClickListener $clickListener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateNewCollectionButton$addButtonAsHeader$1(View.OnClickListener onClickListener) {
        super(1);
        this.$clickListener = onClickListener;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.$clickListener.onClick(view);
    }
}
