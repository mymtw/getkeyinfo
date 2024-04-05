package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.C0606d;
import androidx.compose.foundation.gestures.C0607e;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C19697g;
import p753kq.C19857l;
import p753kq.C19861p;

public final class SliderDraggableState implements C0607e {

    /* renamed from: a */
    public final C19857l<Float, C19394m> f2253a;

    /* renamed from: b */
    public final ParcelableSnapshotMutableState f2254b = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);

    /* renamed from: c */
    public final C1112a f2255c = new C1112a(this);

    /* renamed from: d */
    public final MutatorMutex f2256d = new MutatorMutex();

    /* renamed from: androidx.compose.material.SliderDraggableState$a */
    public static final class C1112a implements C0606d {

        /* renamed from: a */
        public final /* synthetic */ SliderDraggableState f2257a;

        public C1112a(SliderDraggableState sliderDraggableState) {
            this.f2257a = sliderDraggableState;
        }

        /* renamed from: a */
        public final void mo3734a(float f) {
            this.f2257a.f2253a.invoke(Float.valueOf(f));
        }
    }

    public SliderDraggableState(C19857l<? super Float, C19394m> lVar) {
        this.f2253a = lVar;
    }

    /* renamed from: a */
    public final Object mo3733a(MutatePriority mutatePriority, C19861p<? super C0606d, ? super C19340c<? super C19394m>, ? extends Object> pVar, C19340c<? super C19394m> cVar) {
        Object d = C19697g.m33466d(new SliderDraggableState$drag$2(this, mutatePriority, pVar, (C19340c<? super SliderDraggableState$drag$2>) null), cVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : C19394m.f43287a;
    }
}
