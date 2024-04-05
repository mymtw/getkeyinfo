package com.etsy.android.config.flags.p073ui.search;

import androidx.compose.foundation.text.C0952f;
import androidx.compose.p015ui.platform.C1819b1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.config.flags.ui.search.SearchInputComposableKt$SearchInput$1$1 */
public final class SearchInputComposableKt$SearchInput$1$1 extends Lambda implements C19857l<C0952f, C19394m> {
    public final /* synthetic */ C1819b1 $keyboardController;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchInputComposableKt$SearchInput$1$1(C1819b1 b1Var) {
        super(1);
        this.$keyboardController = b1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C0952f) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C0952f fVar) {
        C19383o.m32797g(fVar, "$this$$receiver");
        C1819b1 b1Var = this.$keyboardController;
        if (b1Var != null) {
            b1Var.mo7198b();
        }
    }
}
