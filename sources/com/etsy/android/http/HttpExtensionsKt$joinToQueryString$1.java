package com.etsy.android.http;

import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class HttpExtensionsKt$joinToQueryString$1 extends Lambda implements C19857l<Map.Entry<? extends String, ? extends String>, CharSequence> {
    public static final HttpExtensionsKt$joinToQueryString$1 INSTANCE = new HttpExtensionsKt$joinToQueryString$1();

    public HttpExtensionsKt$joinToQueryString$1() {
        super(1);
    }

    public final CharSequence invoke(Map.Entry<String, String> entry) {
        C19383o.m32797g(entry, "<name for destructuring parameter 0>");
        return C6489a.m12901b(entry.getKey()) + '=' + C6489a.m12901b(entry.getValue());
    }
}
