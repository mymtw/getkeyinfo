package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.C19340c;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.internal.C19729m;
import p753kq.C19861p;
import p768rq.C20153b;

public final class PausingDispatcherKt {
    /* renamed from: a */
    public static final <T> Object m6780a(Lifecycle lifecycle, Lifecycle.State state, C19861p<? super C19525d0, ? super C19340c<? super T>, ? extends Object> pVar, C19340c<? super T> cVar) {
        C20153b bVar = C19760n0.f43719a;
        return C19697g.m33471i(cVar, C19729m.f43681a.mo72111E0(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, pVar, (C19340c<? super PausingDispatcherKt$whenStateAtLeast$2>) null));
    }
}
