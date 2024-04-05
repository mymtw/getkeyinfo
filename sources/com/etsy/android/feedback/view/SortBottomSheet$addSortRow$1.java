package com.etsy.android.feedback.view;

import android.view.View;
import com.etsy.android.feedback.data.SortType;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class SortBottomSheet$addSortRow$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ SortType $sortType;
    public final /* synthetic */ SortBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SortBottomSheet$addSortRow$1(SortBottomSheet sortBottomSheet, SortType sortType) {
        super(1);
        this.this$0 = sortBottomSheet;
        this.$sortType = sortType;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C19857l<SortType, C19394m> sortClickListener = this.this$0.getSortClickListener();
        if (sortClickListener != null) {
            sortClickListener.invoke(this.$sortType);
        }
    }
}
