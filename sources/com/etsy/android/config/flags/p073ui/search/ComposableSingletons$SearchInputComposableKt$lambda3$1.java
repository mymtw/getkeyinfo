package com.etsy.android.config.flags.p073ui.search;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.config.flags.ui.search.ComposableSingletons$SearchInputComposableKt$lambda-3$1  reason: invalid class name */
public final class ComposableSingletons$SearchInputComposableKt$lambda3$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public static final ComposableSingletons$SearchInputComposableKt$lambda3$1 INSTANCE = new ComposableSingletons$SearchInputComposableKt$lambda3$1();

    public ComposableSingletons$SearchInputComposableKt$lambda3$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            SearchInputComposableKt.m12834a("boe", C64041.INSTANCE, C64052.INSTANCE, dVar, 438);
        } else {
            dVar.mo5396C();
        }
    }
}
