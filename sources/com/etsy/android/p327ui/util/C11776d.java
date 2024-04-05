package com.etsy.android.p327ui.util;

import kotlin.jvm.internal.C19383o;
import p145io.reactivex.subjects.PublishSubject;

/* renamed from: com.etsy.android.ui.util.d */
public class C11776d<T> {

    /* renamed from: a */
    public final PublishSubject<T> f26240a = new PublishSubject<>();

    /* renamed from: a */
    public final void mo38043a(T t) {
        C19383o.m32797g(t, "event");
        this.f26240a.onNext(t);
    }
}
