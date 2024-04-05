package com.bugsnag.android;

import com.bugsnag.android.internal.C5763c;
import com.bugsnag.android.internal.dag.C5766a;
import com.bugsnag.android.internal.dag.DependencyModule;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.s2 */
public final class C5910s2 extends DependencyModule {

    /* renamed from: b */
    public final C5803l1 f12605b;

    /* renamed from: c */
    public final C5738e2 f12606c;

    public C5910s2(C5766a aVar, StorageModule storageModule, C5917u uVar, C5746g gVar, C5805m mVar) {
        C19383o.m32798h(uVar, "client");
        C5763c cVar = aVar.f12339b;
        this.f12605b = new C5803l1(cVar);
        this.f12606c = new C5738e2(cVar, mVar, uVar, (C5733d2) storageModule.f12134g.getValue(), cVar.f12329s, gVar);
    }
}
