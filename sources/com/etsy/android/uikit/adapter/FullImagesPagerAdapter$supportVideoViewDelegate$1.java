package com.etsy.android.uikit.adapter;

import com.etsy.android.uikit.adapter.C11840k;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class FullImagesPagerAdapter$supportVideoViewDelegate$1 extends Lambda implements C19857l<Boolean, C19394m> {
    public final /* synthetic */ C11840k.C11841a $imageEventListener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FullImagesPagerAdapter$supportVideoViewDelegate$1(C11840k.C11841a aVar) {
        super(1);
        this.$imageEventListener = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C19394m.f43287a;
    }

    public final void invoke(boolean z) {
        this.$imageEventListener.mo34362c(Boolean.valueOf(z));
    }
}
