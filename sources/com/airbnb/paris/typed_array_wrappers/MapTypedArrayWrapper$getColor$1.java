package com.airbnb.paris.typed_array_wrappers;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class MapTypedArrayWrapper$getColor$1 extends Lambda implements C19857l<Integer, Integer> {
    public final /* synthetic */ MapTypedArrayWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapTypedArrayWrapper$getColor$1(MapTypedArrayWrapper mapTypedArrayWrapper) {
        super(1);
        this.this$0 = mapTypedArrayWrapper;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf(invoke(((Number) obj).intValue()));
    }

    public final int invoke(int i) {
        MapTypedArrayWrapper mapTypedArrayWrapper = this.this$0;
        return mapTypedArrayWrapper.f11062b.getColor(i, mapTypedArrayWrapper.f11063c);
    }
}
