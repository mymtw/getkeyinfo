package com.airbnb.paris.typed_array_wrappers;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class MapTypedArrayWrapper$getFraction$1 extends Lambda implements C19857l<Integer, Float> {
    public final /* synthetic */ int $base;
    public final /* synthetic */ int $pbase;
    public final /* synthetic */ MapTypedArrayWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapTypedArrayWrapper$getFraction$1(MapTypedArrayWrapper mapTypedArrayWrapper, int i, int i2) {
        super(1);
        this.this$0 = mapTypedArrayWrapper;
        this.$base = i;
        this.$pbase = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Float.valueOf(invoke(((Number) obj).intValue()));
    }

    public final float invoke(int i) {
        return this.this$0.f11062b.getFraction(i, this.$base, this.$pbase);
    }
}
