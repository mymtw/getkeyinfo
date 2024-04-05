package com.paypal.pyplcheckout.extensions;

import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.jvm.internal.C19383o;

public final class NumberExtensionsKt {
    public static final int getDp(Number number) {
        C19383o.m32797g(number, "<this>");
        return (int) (number.floatValue() / Resources.getSystem().getDisplayMetrics().density);
    }

    public static final float getPx(Number number) {
        C19383o.m32797g(number, "<this>");
        return TypedValue.applyDimension(1, number.floatValue(), Resources.getSystem().getDisplayMetrics());
    }
}
