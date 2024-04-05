package com.airbnb.paris.typed_array_wrappers;

import kotlin.jvm.internal.Lambda;
import p242t3.C7955e;
import p753kq.C19857l;

final class MapTypedArrayWrapper$getStyle$1 extends Lambda implements C19857l<Integer, C7955e> {
    public static final MapTypedArrayWrapper$getStyle$1 INSTANCE = new MapTypedArrayWrapper$getStyle$1();

    public MapTypedArrayWrapper$getStyle$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final C7955e invoke(int i) {
        return new C7955e(i);
    }
}
