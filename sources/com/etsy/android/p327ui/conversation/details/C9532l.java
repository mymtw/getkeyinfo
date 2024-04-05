package com.etsy.android.p327ui.conversation.details;

import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;
import p145io.reactivex.internal.operators.observable.C19165h;
import p145io.reactivex.internal.operators.observable.C19179q;
import p145io.reactivex.subjects.PublishSubject;
import p426qa.C13277c;
import p426qa.C13278d;
import p470w9.C13793a;

/* renamed from: com.etsy.android.ui.conversation.details.l */
public final class C9532l {

    /* renamed from: a */
    public final C13278d f21116a;

    public C9532l(C13278d dVar) {
        C19383o.m32797g(dVar, "notificationRepository");
        this.f21116a = dVar;
    }

    /* renamed from: a */
    public final C19179q mo32082a() {
        PublishSubject<C13277c> publishSubject = this.f21116a.f29184a;
        C0015b bVar = new C0015b();
        publishSubject.getClass();
        return new C19179q(new C19165h(publishSubject, bVar), new C13793a(2));
    }
}
