package com.etsy.android.config.flags.events;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C19671s1;
import kotlinx.coroutines.flow.C19680v;

public final class ConfigFlagsEventDispatcher {

    /* renamed from: a */
    public final C19525d0 f14144a;

    /* renamed from: b */
    public final C19671s1 f14145b = C19680v.m33452a(0, 0, (BufferOverflow) null, 6);

    public ConfigFlagsEventDispatcher(C19525d0 d0Var) {
        this.f14144a = d0Var;
    }

    /* renamed from: a */
    public final void mo18133a(C6350c cVar) {
        C19383o.m32797g(cVar, "event");
        C19697g.m33468f(this.f14144a, (CoroutineContext) null, (CoroutineStart) null, new ConfigFlagsEventDispatcher$dispatch$1(this, cVar, (C19340c<? super ConfigFlagsEventDispatcher$dispatch$1>) null), 3);
    }
}
