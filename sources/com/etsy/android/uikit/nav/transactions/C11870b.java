package com.etsy.android.uikit.nav.transactions;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.uikit.nav.transactions.b */
public final class C11870b<S> implements C2870k0.C2872b {

    /* renamed from: a */
    public final S f26407a;

    public C11870b(S s) {
        this.f26407a = s;
    }

    public final <T extends C2866i0> T create(Class<T> cls) {
        T newInstance = cls.getDeclaredConstructors()[0].newInstance(new Object[]{this.f26407a});
        C19383o.m32795e(newInstance, "null cannot be cast to non-null type T of com.etsy.android.uikit.nav.transactions.TransactionViewModelFactory.create");
        return (C2866i0) newInstance;
    }
}
