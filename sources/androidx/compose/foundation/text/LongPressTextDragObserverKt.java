package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p015ui.input.pointer.C1652w;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C19697g;

public final class LongPressTextDragObserverKt {
    /* renamed from: a */
    public static final Object m1969a(C1652w wVar, C0958l lVar, C19340c<? super C19394m> cVar) {
        Object d = C19697g.m33466d(new C0913x3c48fd5d(wVar, lVar, (C19340c<? super C0913x3c48fd5d>) null), cVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : C19394m.f43287a;
    }

    /* renamed from: b */
    public static final Object m1970b(C1652w wVar, C0958l lVar, C19340c<? super C19394m> cVar) {
        Object g = DragGestureDetectorKt.m1364g(wVar, new C0916x131dfa73(lVar), new C0917x131dfa74(lVar), new C0918x131dfa75(lVar), new C0919x131dfa76(lVar), cVar);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : C19394m.f43287a;
    }
}
