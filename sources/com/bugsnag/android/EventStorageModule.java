package com.bugsnag.android;

import com.bugsnag.android.internal.C5763c;
import com.bugsnag.android.internal.dag.C5766a;
import com.bugsnag.android.internal.dag.C5767b;
import com.bugsnag.android.internal.dag.C5768c;
import com.bugsnag.android.internal.dag.DependencyModule;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;

public final class EventStorageModule extends DependencyModule {

    /* renamed from: b */
    public final C5763c f12115b;

    /* renamed from: c */
    public final C19285c f12116c;

    /* renamed from: d */
    public final C19285c f12117d;

    public EventStorageModule(C5767b bVar, C5766a aVar, C5721b0 b0Var, C5746g gVar, C5910s2 s2Var, C5768c cVar, C5914t1 t1Var, C5805m mVar) {
        C5746g gVar2 = gVar;
        C5914t1 t1Var2 = t1Var;
        C5805m mVar2 = mVar;
        C19383o.m32798h(gVar2, "bgTaskService");
        C19383o.m32798h(t1Var2, "notifier");
        C19383o.m32798h(mVar2, "callbackState");
        this.f12115b = aVar.f12339b;
        this.f12116c = mo16552a(new EventStorageModule$delegate$2(this, bVar, cVar, b0Var, s2Var, t1Var, gVar));
        this.f12117d = mo16552a(new EventStorageModule$eventStore$2(this, t1Var2, gVar2, mVar2));
    }
}
