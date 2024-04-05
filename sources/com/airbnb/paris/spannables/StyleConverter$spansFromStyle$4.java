package com.airbnb.paris.spannables;

import android.text.style.StyleSpan;
import com.airbnb.paris.typed_array_wrappers.C4870c;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class StyleConverter$spansFromStyle$4 extends Lambda implements C19857l<Integer, StyleSpan> {
    public final /* synthetic */ C4870c $attributes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StyleConverter$spansFromStyle$4(C4870c cVar) {
        super(1);
        this.$attributes = cVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final StyleSpan invoke(int i) {
        return new StyleSpan(this.$attributes.mo14766i(i));
    }
}
