package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C19697g;
import p753kq.C19857l;
import p753kq.C19861p;

public final class DefaultScrollableState implements C0615m {

    /* renamed from: a */
    public final C19857l<Float, Float> f1320a;

    /* renamed from: b */
    public final C0559a f1321b = new C0559a(this);

    /* renamed from: c */
    public final MutatorMutex f1322c = new MutatorMutex();

    /* renamed from: d */
    public final ParcelableSnapshotMutableState f1323d = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);

    /* renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$a */
    public static final class C0559a implements C0614l {

        /* renamed from: a */
        public final /* synthetic */ DefaultScrollableState f1324a;

        public C0559a(DefaultScrollableState defaultScrollableState) {
            this.f1324a = defaultScrollableState;
        }

        /* renamed from: a */
        public final float mo3737a(float f) {
            return this.f1324a.f1320a.invoke(Float.valueOf(f)).floatValue();
        }
    }

    public DefaultScrollableState(C19857l<? super Float, Float> lVar) {
        this.f1320a = lVar;
    }

    /* renamed from: a */
    public final Object mo3690a(MutatePriority mutatePriority, C19861p<? super C0614l, ? super C19340c<? super C19394m>, ? extends Object> pVar, C19340c<? super C19394m> cVar) {
        Object d = C19697g.m33466d(new DefaultScrollableState$scroll$2(this, mutatePriority, pVar, (C19340c<? super DefaultScrollableState$scroll$2>) null), cVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : C19394m.f43287a;
    }

    /* renamed from: b */
    public final boolean mo3691b() {
        return ((Boolean) this.f1323d.getValue()).booleanValue();
    }

    /* renamed from: d */
    public final float mo3692d(float f) {
        return this.f1320a.invoke(Float.valueOf(f)).floatValue();
    }
}
