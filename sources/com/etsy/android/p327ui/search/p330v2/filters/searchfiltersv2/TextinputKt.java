package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.TextinputKt */
public final class TextinputKt {
    /* renamed from: a */
    public static final void m18959a(CollageTextInput collageTextInput, C19857l<? super String, C19394m> lVar) {
        C19383o.m32797g(collageTextInput, "<this>");
        C19383o.m32797g(lVar, "afterTextChanged");
        collageTextInput.setTextChangeListener(new TextinputKt$afterTextChanged$1(lVar));
    }

    /* renamed from: b */
    public static final void m18960b(CollageTextInput collageTextInput, C19846a<C19394m> aVar) {
        C19383o.m32797g(collageTextInput, "<this>");
        collageTextInput.setOnFocusChangeListener(new C11025u(aVar));
    }
}
