package com.etsy.android.p327ui.util;

import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.subjects.PublishSubject;
import p400mf.C13074b;
import p400mf.C13079d;

/* renamed from: com.etsy.android.ui.util.f */
public final /* synthetic */ class C11778f implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ C11782j f26244b;

    /* renamed from: c */
    public final /* synthetic */ C11780h f26245c;

    public /* synthetic */ C11778f(C11782j jVar, C11780h hVar) {
        this.f26244b = jVar;
        this.f26245c = hVar;
    }

    public final void accept(Object obj) {
        C11782j jVar = this.f26244b;
        C11780h hVar = this.f26245c;
        Throwable th = (Throwable) obj;
        C19383o.m32797g(jVar, "$specs");
        C19383o.m32797g(hVar, "this$0");
        PublishSubject<C13074b> publishSubject = C13079d.f28754a;
        long idAsLongDeprecated = jVar.f26248a.getIdAsLongDeprecated();
        String str = jVar.f26249b;
        C19383o.m32797g(str, "shopName");
        C13079d.f28754a.onNext(new C13074b.C13077c(idAsLongDeprecated, str, !jVar.f26250c));
        hVar.mo38048b(jVar.f26248a, !jVar.f26250c);
    }
}
