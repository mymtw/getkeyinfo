package com.airbnb.paris.typed_array_wrappers;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class MapTypedArrayWrapper$getDrawable$1 extends Lambda implements C19857l<Integer, Drawable> {
    public final /* synthetic */ MapTypedArrayWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapTypedArrayWrapper$getDrawable$1(MapTypedArrayWrapper mapTypedArrayWrapper) {
        super(1);
        this.this$0 = mapTypedArrayWrapper;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Drawable invoke(int i) {
        this.this$0.getClass();
        if (C4870c.m10570o(i)) {
            return null;
        }
        MapTypedArrayWrapper mapTypedArrayWrapper = this.this$0;
        return mapTypedArrayWrapper.f11062b.getDrawable(i, mapTypedArrayWrapper.f11063c);
    }
}
