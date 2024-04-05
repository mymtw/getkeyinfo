package com.paypal.pyplcheckout.utils;

import androidx.appcompat.widget.C0326j;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19451e;
import p753kq.C19857l;

public final class StringExtensionsKt$toSnakeCase$1 extends Lambda implements C19857l<C19451e, CharSequence> {
    public static final StringExtensionsKt$toSnakeCase$1 INSTANCE = new StringExtensionsKt$toSnakeCase$1();

    public StringExtensionsKt$toSnakeCase$1() {
        super(1);
    }

    public final CharSequence invoke(C19451e eVar) {
        C19383o.m32797g(eVar, "it");
        return C0326j.m864i("_", eVar.getValue());
    }
}
