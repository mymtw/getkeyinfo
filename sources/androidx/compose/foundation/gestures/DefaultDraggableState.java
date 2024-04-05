package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C19697g;
import p753kq.C19857l;
import p753kq.C19861p;

public final class DefaultDraggableState implements C0607e {

    /* renamed from: a */
    public final C19857l<Float, C19394m> f1316a;

    /* renamed from: b */
    public final C0558a f1317b = new C0558a(this);

    /* renamed from: c */
    public final MutatorMutex f1318c = new MutatorMutex();

    /* renamed from: androidx.compose.foundation.gestures.DefaultDraggableState$a */
    public static final class C0558a implements C0606d {

        /* renamed from: a */
        public final /* synthetic */ DefaultDraggableState f1319a;

        public C0558a(DefaultDraggableState defaultDraggableState) {
            this.f1319a = defaultDraggableState;
        }

        /* renamed from: a */
        public final void mo3734a(float f) {
            this.f1319a.f1316a.invoke(Float.valueOf(f));
        }
    }

    public DefaultDraggableState(C19857l<? super Float, C19394m> lVar) {
        this.f1316a = lVar;
    }

    /* renamed from: a */
    public final Object mo3733a(MutatePriority mutatePriority, C19861p<? super C0606d, ? super C19340c<? super C19394m>, ? extends Object> pVar, C19340c<? super C19394m> cVar) {
        Object d = C19697g.m33466d(new DefaultDraggableState$drag$2(this, mutatePriority, pVar, (C19340c<? super DefaultDraggableState$drag$2>) null), cVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : C19394m.f43287a;
    }
}
