package com.etsy.android.uikit.adapter;

import android.view.View;
import com.etsy.android.uikit.adapter.C11840k;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class ListingImagesPagerAdapter$activateZoom$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ int $position;
    public final /* synthetic */ C11842l this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingImagesPagerAdapter$activateZoom$1(C11842l lVar, int i) {
        super(1);
        this.this$0 = lVar;
        this.$position = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C11840k.C11841a aVar = this.this$0.f26333p;
        if (aVar != null) {
            aVar.mo34364e(this.$position);
        }
    }
}
