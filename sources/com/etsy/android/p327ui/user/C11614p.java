package com.etsy.android.p327ui.user;

import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;

/* renamed from: com.etsy.android.ui.user.p */
public final class C11614p {

    /* renamed from: a */
    public final String f25716a;

    public C11614p(String str) {
        C19383o.m32797g(str, "receiptId");
        this.f25716a = str;
        if (!(!C19459m.m33037f1(str, ','))) {
            throw new IllegalArgumentException("No multiple receipt ids are allowed. Introduce a single receipt id.".toString());
        }
    }
}
