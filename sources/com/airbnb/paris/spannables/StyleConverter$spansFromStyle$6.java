package com.airbnb.paris.spannables;

import android.content.res.ColorStateList;
import android.text.style.ForegroundColorSpan;
import com.airbnb.paris.typed_array_wrappers.C4870c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class StyleConverter$spansFromStyle$6 extends Lambda implements C19857l<Integer, ForegroundColorSpan> {
    public final /* synthetic */ C4870c $attributes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StyleConverter$spansFromStyle$6(C4870c cVar) {
        super(1);
        this.$attributes = cVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final ForegroundColorSpan invoke(int i) {
        ColorStateList b = this.$attributes.mo14759b(i);
        if (b != null) {
            return new ForegroundColorSpan(b.getDefaultColor());
        }
        C19383o.m32803m();
        throw null;
    }
}
