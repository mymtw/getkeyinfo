package com.airbnb.paris.typed_array_wrappers;

import android.content.res.ColorStateList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p221r3.C7739a;
import p753kq.C19857l;

public final class MapTypedArrayWrapper$getColorStateList$2 extends Lambda implements C19857l<C7739a, ColorStateList> {
    public static final MapTypedArrayWrapper$getColorStateList$2 INSTANCE = new MapTypedArrayWrapper$getColorStateList$2();

    public MapTypedArrayWrapper$getColorStateList$2() {
        super(1);
    }

    public final ColorStateList invoke(C7739a aVar) {
        C19383o.m32798h(aVar, "colorValue");
        ColorStateList valueOf = ColorStateList.valueOf(aVar.f17164a);
        C19383o.m32793c(valueOf, "ColorStateList.valueOf(this)");
        return valueOf;
    }
}
