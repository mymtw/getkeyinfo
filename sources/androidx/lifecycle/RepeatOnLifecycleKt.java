package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import p753kq.C19861p;

public final class RepeatOnLifecycleKt {
    /* renamed from: a */
    public static final Object m6782a(Lifecycle lifecycle, Lifecycle.State state, C19861p<? super C19525d0, ? super C19340c<? super C19394m>, ? extends Object> pVar, C19340c<? super C19394m> cVar) {
        if (!(state != Lifecycle.State.INITIALIZED)) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        } else if (lifecycle.mo10734b() == Lifecycle.State.DESTROYED) {
            return C19394m.f43287a;
        } else {
            Object d = C19697g.m33466d(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, pVar, (C19340c<? super RepeatOnLifecycleKt$repeatOnLifecycle$3>) null), cVar);
            return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : C19394m.f43287a;
        }
    }

    /* renamed from: b */
    public static final Object m6783b(C2887s sVar, Lifecycle.State state, C19861p<? super C19525d0, ? super C19340c<? super C19394m>, ? extends Object> pVar, C19340c<? super C19394m> cVar) {
        Lifecycle lifecycle = sVar.getLifecycle();
        C19383o.m32796f(lifecycle, "lifecycle");
        Object a = m6782a(lifecycle, state, pVar, cVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : C19394m.f43287a;
    }
}
