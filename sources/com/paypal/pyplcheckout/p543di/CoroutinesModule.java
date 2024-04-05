package com.paypal.pyplcheckout.p543di;

import androidx.compose.p015ui.text.input.C1993m;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19707i1;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C19729m;
import p001a0.C0005b;
import p768rq.C20153b;

/* renamed from: com.paypal.pyplcheckout.di.CoroutinesModule */
public final class CoroutinesModule {
    public final CoroutineDispatcher providesDefaultDispatcher() {
        return C19760n0.f43719a;
    }

    public final CoroutineDispatcher providesIODispatcher() {
        return C19760n0.f43720b;
    }

    public final CoroutineContext providesMainCoroutineContextChild() {
        C19707i1 l = C1993m.m4368l();
        C20153b bVar = C19760n0.f43719a;
        return l.plus(C19729m.f43681a);
    }

    public final C19525d0 providesSupervisorIODispatcher() {
        return C19697g.m33463a(C0005b.m44j().plus(C19760n0.f43720b));
    }
}
