package com.airbnb.paris.typed_array_wrappers;

import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class MapTypedArrayWrapper$getLayoutDimension$1 extends Lambda implements C19857l<Integer, Integer> {
    public final /* synthetic */ MapTypedArrayWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapTypedArrayWrapper$getLayoutDimension$1(MapTypedArrayWrapper mapTypedArrayWrapper) {
        super(1);
        this.this$0 = mapTypedArrayWrapper;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf(invoke(((Number) obj).intValue()));
    }

    public final int invoke(int i) {
        Resources resources = this.this$0.f11062b;
        C19383o.m32793c(resources, "resources");
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 16 || i2 > 31) {
            return (int) typedValue.getDimension(resources.getDisplayMetrics());
        }
        return typedValue.data;
    }
}
