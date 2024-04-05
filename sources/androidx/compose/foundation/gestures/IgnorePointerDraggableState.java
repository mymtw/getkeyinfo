package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import com.etsy.android.push.CartRefreshDelegate;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

public final class IgnorePointerDraggableState implements C0611i, C0610h {

    /* renamed from: a */
    public final C0607e f1332a;

    /* renamed from: b */
    public C0606d f1333b;

    public IgnorePointerDraggableState(C0607e eVar) {
        C19383o.m32797g(eVar, CartRefreshDelegate.ARG_ORIGIN);
        this.f1332a = eVar;
    }

    /* renamed from: a */
    public final Object mo3785a(MutatePriority mutatePriority, C19861p<? super C0610h, ? super C19340c<? super C19394m>, ? extends Object> pVar, C19340c<? super C19394m> cVar) {
        Object a = this.f1332a.mo3733a(mutatePriority, new IgnorePointerDraggableState$drag$2(this, pVar, (C19340c<? super IgnorePointerDraggableState$drag$2>) null), cVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : C19394m.f43287a;
    }

    /* renamed from: b */
    public final void mo3786b(long j, float f) {
        C0606d dVar = this.f1333b;
        if (dVar != null) {
            dVar.mo3734a(f);
        }
    }
}
