package com.etsy.android.util;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.EtsyConfigKey;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.util.n */
public final class C12056n implements C17555d<EtsyConfigKey> {

    /* renamed from: com.etsy.android.util.n$a */
    public static final class C12057a {

        /* renamed from: a */
        public static final C12056n f26880a = new C12056n();
    }

    public final Object get() {
        EtsyConfigKey etsyConfigKey = C8592b.C8596d.f18866a;
        C19383o.m32796f(etsyConfigKey, "BOE_BRAZE_KILLSWITCH");
        return etsyConfigKey;
    }
}
