package com.etsy.android.lib.dagger;

import com.google.firebase.messaging.FirebaseMessaging;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p486y9.C13885a;
import p568fn.C17782b;

/* renamed from: com.etsy.android.lib.dagger.i */
public final class C8650i implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19012a;

    /* renamed from: b */
    public final Object f19013b;

    public /* synthetic */ C8650i(Object obj, int i) {
        this.f19012a = i;
        this.f19013b = obj;
    }

    public final Object get() {
        switch (this.f19012a) {
            case 0:
                ((C19388s) this.f19013b).getClass();
                return new C13885a();
            default:
                ((C17782b) this.f19013b).getClass();
                FirebaseMessaging instance = FirebaseMessaging.getInstance();
                C19383o.m32796f(instance, "getInstance()");
                return instance;
        }
    }
}
