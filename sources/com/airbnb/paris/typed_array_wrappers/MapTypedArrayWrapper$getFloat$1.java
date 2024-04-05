package com.airbnb.paris.typed_array_wrappers;

import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class MapTypedArrayWrapper$getFloat$1 extends Lambda implements C19857l<Integer, Float> {
    public final /* synthetic */ MapTypedArrayWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapTypedArrayWrapper$getFloat$1(MapTypedArrayWrapper mapTypedArrayWrapper) {
        super(1);
        this.this$0 = mapTypedArrayWrapper;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Float.valueOf(invoke(((Number) obj).intValue()));
    }

    public final float invoke(int i) {
        Resources resources = this.this$0.f11062b;
        C19383o.m32793c(resources, "resources");
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        return typedValue.getFloat();
    }
}
