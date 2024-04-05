package com.etsy.android.config.flags.p073ui;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.config.flags.ui.ConfigsListComposableKt$ConfigsList$1$invoke$$inlined$items$default$3 */
public final class C6393xb27478d4 extends Lambda implements C19857l<Integer, Object> {
    public final /* synthetic */ C19857l $contentType;
    public final /* synthetic */ List $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6393xb27478d4(C19857l lVar, List list) {
        super(1);
        this.$contentType = lVar;
        this.$items = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        return this.$contentType.invoke(this.$items.get(i));
    }
}
