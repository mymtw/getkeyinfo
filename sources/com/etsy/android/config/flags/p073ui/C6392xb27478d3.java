package com.etsy.android.config.flags.p073ui;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.config.flags.ui.ConfigsListComposableKt$ConfigsList$1$invoke$$inlined$items$default$2 */
public final class C6392xb27478d3 extends Lambda implements C19857l<Integer, Object> {
    public final /* synthetic */ List $items;
    public final /* synthetic */ C19857l $key;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6392xb27478d3(C19857l lVar, List list) {
        super(1);
        this.$key = lVar;
        this.$items = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        return this.$key.invoke(this.$items.get(i));
    }
}
