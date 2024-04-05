package com.airbnb.paris.typed_array_wrappers;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class MapTypedArrayWrapper$getBoolean$1 extends Lambda implements C19857l<Integer, Boolean> {
    public final /* synthetic */ MapTypedArrayWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapTypedArrayWrapper$getBoolean$1(MapTypedArrayWrapper mapTypedArrayWrapper) {
        super(1);
        this.this$0 = mapTypedArrayWrapper;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke(((Number) obj).intValue()));
    }

    public final boolean invoke(int i) {
        return this.this$0.f11062b.getBoolean(i);
    }
}
