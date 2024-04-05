package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p288y.C8343c;
import p753kq.C19861p;

public final class ScrollDraggableState implements C0611i, C0610h {

    /* renamed from: a */
    public final C1342k1<ScrollingLogic> f1338a;

    /* renamed from: b */
    public C0614l f1339b = ScrollableKt.f1340a;

    public ScrollDraggableState(C1338j0 j0Var) {
        this.f1338a = j0Var;
    }

    /* renamed from: a */
    public final Object mo3785a(MutatePriority mutatePriority, C19861p<? super C0610h, ? super C19340c<? super C19394m>, ? extends Object> pVar, C19340c<? super C19394m> cVar) {
        Object a = this.f1338a.getValue().f1347d.mo3690a(mutatePriority, new ScrollDraggableState$drag$2(this, pVar, (C19340c<? super ScrollDraggableState$drag$2>) null), cVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : C19394m.f43287a;
    }

    /* renamed from: b */
    public final void mo3786b(long j, float f) {
        ScrollingLogic value = this.f1338a.getValue();
        value.mo3817a(this.f1339b, value.mo3821e(f), new C8343c(j), 1);
    }
}
