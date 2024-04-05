package com.airbnb.paris.typed_array_wrappers;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class MapTypedArrayWrapper$getString$1 extends Lambda implements C19857l<Integer, String> {
    public final /* synthetic */ MapTypedArrayWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapTypedArrayWrapper$getString$1(MapTypedArrayWrapper mapTypedArrayWrapper) {
        super(1);
        this.this$0 = mapTypedArrayWrapper;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final String invoke(int i) {
        return this.this$0.f11062b.getString(i);
    }
}
