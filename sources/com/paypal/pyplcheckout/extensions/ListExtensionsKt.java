package com.paypal.pyplcheckout.extensions;

import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class ListExtensionsKt {
    public static final <T> List<T> orThrow(List<? extends T> list, String str) {
        C19383o.m32797g(str, "message");
        if (!(list == null || list.isEmpty())) {
            return list;
        }
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ List orThrow$default(List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "null or empty list";
        }
        return orThrow(list, str);
    }
}
