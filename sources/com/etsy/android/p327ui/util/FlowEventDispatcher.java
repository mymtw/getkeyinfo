package com.etsy.android.p327ui.util;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C19671s1;
import kotlinx.coroutines.flow.C19680v;

/* renamed from: com.etsy.android.ui.util.FlowEventDispatcher */
public class FlowEventDispatcher<T> {

    /* renamed from: a */
    public final C19525d0 f26217a;

    /* renamed from: b */
    public final C19671s1 f26218b = C19680v.m33452a(0, 0, (BufferOverflow) null, 7);

    public FlowEventDispatcher(C19525d0 d0Var) {
        this.f26217a = d0Var;
    }

    /* renamed from: a */
    public final void mo38013a(T t) {
        C19383o.m32797g(t, "event");
        C19697g.m33468f(this.f26217a, (CoroutineContext) null, (CoroutineStart) null, new FlowEventDispatcher$dispatch$1(this, t, (C19340c<? super FlowEventDispatcher$dispatch$1>) null), 3);
    }
}
