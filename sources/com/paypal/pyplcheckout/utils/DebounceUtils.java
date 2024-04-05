package com.paypal.pyplcheckout.utils;

import androidx.compose.p015ui.text.input.C1993m;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19707i1;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.internal.C19729m;
import p753kq.C19857l;
import p768rq.C20153b;

public final class DebounceUtils {
    public static final DebounceUtils INSTANCE = new DebounceUtils();

    private DebounceUtils() {
    }

    public static C19857l debounce$default(DebounceUtils debounceUtils, long j, C19525d0 d0Var, C19857l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        if ((i & 2) != 0) {
            C19707i1 l = C1993m.m4368l();
            C20153b bVar = C19760n0.f43719a;
            d0Var = C19697g.m33463a(l.plus(C19729m.f43681a));
        }
        return debounceUtils.debounce(j, d0Var, lVar);
    }

    public static C19857l throttleLatest$default(DebounceUtils debounceUtils, long j, C19525d0 d0Var, C19857l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        if ((i & 2) != 0) {
            C19707i1 l = C1993m.m4368l();
            C20153b bVar = C19760n0.f43719a;
            d0Var = C19697g.m33463a(l.plus(C19729m.f43681a));
        }
        return debounceUtils.throttleLatest(j, d0Var, lVar);
    }

    public static C19857l throttleLatestUnique$default(DebounceUtils debounceUtils, long j, C19525d0 d0Var, C19857l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        if ((i & 2) != 0) {
            C19707i1 l = C1993m.m4368l();
            C20153b bVar = C19760n0.f43719a;
            d0Var = C19697g.m33463a(l.plus(C19729m.f43681a));
        }
        return debounceUtils.throttleLatestUnique(j, d0Var, lVar);
    }

    public final <T> C19857l<T, C19394m> debounce(long j, C19525d0 d0Var, C19857l<? super T, C19394m> lVar) {
        C19383o.m32797g(d0Var, "coroutineScope");
        C19383o.m32797g(lVar, "callback");
        return new DebounceUtils$debounce$1(new Ref$ObjectRef(), d0Var, j, lVar);
    }

    public final <T> C19857l<T, C19394m> debounce(long j, C19857l<? super T, C19394m> lVar) {
        C19383o.m32797g(lVar, "callback");
        return debounce$default(this, j, (C19525d0) null, lVar, 2, (Object) null);
    }

    public final <T> C19857l<T, C19394m> debounce(C19857l<? super T, C19394m> lVar) {
        C19383o.m32797g(lVar, "callback");
        return debounce$default(this, 0, (C19525d0) null, lVar, 3, (Object) null);
    }

    public final <T> C19857l<T, C19394m> throttleLatest(long j, C19525d0 d0Var, C19857l<? super T, C19394m> lVar) {
        C19383o.m32797g(d0Var, "coroutineScope");
        C19383o.m32797g(lVar, "callback");
        return new DebounceUtils$throttleLatest$1(new Ref$ObjectRef(), new Ref$ObjectRef(), d0Var, j, lVar);
    }

    public final <T> C19857l<T, C19394m> throttleLatest(long j, C19857l<? super T, C19394m> lVar) {
        C19383o.m32797g(lVar, "callback");
        return throttleLatest$default(this, j, (C19525d0) null, lVar, 2, (Object) null);
    }

    public final <T> C19857l<T, C19394m> throttleLatest(C19857l<? super T, C19394m> lVar) {
        C19383o.m32797g(lVar, "callback");
        return throttleLatest$default(this, 0, (C19525d0) null, lVar, 3, (Object) null);
    }

    public final <T> C19857l<T, C19394m> throttleLatestUnique(long j, C19525d0 d0Var, C19857l<? super T, C19394m> lVar) {
        C19383o.m32797g(d0Var, "coroutineScope");
        C19383o.m32797g(lVar, "callback");
        return new DebounceUtils$throttleLatestUnique$1(new Ref$ObjectRef(), new Ref$ObjectRef(), d0Var, j, lVar);
    }

    public final <T> C19857l<T, C19394m> throttleLatestUnique(long j, C19857l<? super T, C19394m> lVar) {
        C19383o.m32797g(lVar, "callback");
        return throttleLatestUnique$default(this, j, (C19525d0) null, lVar, 2, (Object) null);
    }

    public final <T> C19857l<T, C19394m> throttleLatestUnique(C19857l<? super T, C19394m> lVar) {
        C19383o.m32797g(lVar, "callback");
        return throttleLatestUnique$default(this, 0, (C19525d0) null, lVar, 3, (Object) null);
    }
}
