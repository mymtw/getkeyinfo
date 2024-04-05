package com.etsy.android.lib.dagger;

import com.google.android.gms.common.GoogleApiAvailability;
import dagger.internal.C17555d;
import p568fn.C17782b;

/* renamed from: com.etsy.android.lib.dagger.d */
public final class C8644d implements C17555d<GoogleApiAvailability> {

    /* renamed from: com.etsy.android.lib.dagger.d$a */
    public static final class C8645a {

        /* renamed from: a */
        public static final C8644d f19004a = new C8644d();
    }

    public final Object get() {
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        C17782b.m29841G(instance);
        return instance;
    }
}
