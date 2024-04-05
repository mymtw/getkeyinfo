package com.etsy.android.lib.push.registration;

import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.operators.flowable.C19107d;
import p145io.reactivex.internal.operators.flowable.C19116l;
import p145io.reactivex.internal.operators.flowable.C19126u;
import p145io.reactivex.internal.operators.flowable.FlowableFlatMap;
import p248tp.C8054g;
import p287xp.C8339g;
import p503zp.C13971g;
import p764pq.C20057i;

/* renamed from: com.etsy.android.lib.push.registration.f */
public final /* synthetic */ class C8833f implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f19425b;

    /* renamed from: c */
    public final /* synthetic */ C8835h f19426c;

    /* renamed from: d */
    public final /* synthetic */ long f19427d;

    public /* synthetic */ C8833f(C8835h hVar, int i, long j) {
        this.f19425b = i;
        this.f19426c = hVar;
        this.f19427d = j;
    }

    public final Object apply(Object obj) {
        Object obj2;
        int i = this.f19425b;
        C8835h hVar = this.f19426c;
        long j = this.f19427d;
        C8054g gVar = (C8054g) obj;
        C19383o.m32797g(hVar, "this$0");
        C19383o.m32797g(gVar, "errors");
        C19126u uVar = new C19126u(gVar, new C20057i(1, i), new C0015b());
        C8834g gVar2 = new C8834g(new FcmTokenRequest$requestFcmToken$1$2(hVar, i, j), 0);
        int i2 = C8054g.f17572b;
        C12965a.m20651c(i2, "maxConcurrency");
        C12965a.m20651c(i2, "bufferSize");
        if (uVar instanceof C13971g) {
            Object call = ((C13971g) uVar).call();
            if (call == null) {
                return C19107d.f42672c;
            }
            obj2 = new C19116l(gVar2, call);
        } else {
            obj2 = new FlowableFlatMap(uVar, gVar2, i2, i2);
        }
        return obj2;
    }
}
