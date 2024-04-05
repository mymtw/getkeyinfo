package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.C0601c;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.input.pointer.C1631c;
import androidx.compose.p015ui.input.pointer.C1644p;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.channels.C19499d;
import p087e0.C6687f;
import p288y.C8343c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

public final class DraggableKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: androidx.compose.foundation.gestures.Orientation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: e0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: androidx.compose.runtime.k1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: androidx.compose.runtime.k1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.Serializable m1373a(androidx.compose.p015ui.input.pointer.C1631c r9, androidx.compose.runtime.C1342k1 r10, androidx.compose.runtime.C1342k1 r11, p087e0.C6687f r12, androidx.compose.foundation.gestures.Orientation r13, kotlin.coroutines.C19340c r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1 r0 = (androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1 r0 = new androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1
            r0.<init>(r14)
        L_0x0018:
            r14 = r0
            java.lang.Object r0 = r14.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r14.label
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x0076
            if (r2 == r7) goto L_0x005a
            if (r2 == r6) goto L_0x0049
            if (r2 == r5) goto L_0x0040
            if (r2 != r4) goto L_0x0038
            java.lang.Object r9 = r14.L$0
            kotlin.jvm.internal.Ref$FloatRef r9 = (kotlin.jvm.internal.Ref$FloatRef) r9
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            goto L_0x0123
        L_0x0038:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0040:
            java.lang.Object r9 = r14.L$0
            kotlin.jvm.internal.Ref$FloatRef r9 = (kotlin.jvm.internal.Ref$FloatRef) r9
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            goto L_0x010a
        L_0x0049:
            java.lang.Object r9 = r14.L$2
            androidx.compose.foundation.gestures.Orientation r9 = (androidx.compose.foundation.gestures.Orientation) r9
            java.lang.Object r10 = r14.L$1
            e0.f r10 = (p087e0.C6687f) r10
            java.lang.Object r11 = r14.L$0
            androidx.compose.ui.input.pointer.c r11 = (androidx.compose.p015ui.input.pointer.C1631c) r11
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            goto L_0x00e1
        L_0x005a:
            java.lang.Object r9 = r14.L$4
            r13 = r9
            androidx.compose.foundation.gestures.Orientation r13 = (androidx.compose.foundation.gestures.Orientation) r13
            java.lang.Object r9 = r14.L$3
            r12 = r9
            e0.f r12 = (p087e0.C6687f) r12
            java.lang.Object r9 = r14.L$2
            r11 = r9
            androidx.compose.runtime.k1 r11 = (androidx.compose.runtime.C1342k1) r11
            java.lang.Object r9 = r14.L$1
            r10 = r9
            androidx.compose.runtime.k1 r10 = (androidx.compose.runtime.C1342k1) r10
            java.lang.Object r9 = r14.L$0
            androidx.compose.ui.input.pointer.c r9 = (androidx.compose.p015ui.input.pointer.C1631c) r9
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            goto L_0x008f
        L_0x0076:
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            androidx.compose.ui.input.pointer.PointerEventPass r0 = androidx.compose.p015ui.input.pointer.PointerEventPass.Initial
            r14.L$0 = r9
            r14.L$1 = r10
            r14.L$2 = r11
            r14.L$3 = r12
            r14.L$4 = r13
            r14.label = r7
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m1411c(r9, r0, r3, r14)
            if (r0 != r1) goto L_0x008f
            goto L_0x0135
        L_0x008f:
            androidx.compose.ui.input.pointer.p r0 = (androidx.compose.p015ui.input.pointer.C1644p) r0
            java.lang.Object r10 = r10.getValue()
            kq.l r10 = (p753kq.C19857l) r10
            java.lang.Object r10 = r10.invoke(r0)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x00a5
            goto L_0x0134
        L_0x00a5:
            java.lang.Object r10 = r11.getValue()
            kq.a r10 = (p753kq.C19846a) r10
            java.lang.Object r10 = r10.invoke()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00cb
            r0.mo6614a()
            androidx.compose.foundation.layout.C0761x.m1748v(r12, r0)
            r9 = 0
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r9)
            kotlin.Pair r9 = new kotlin.Pair
            r9.<init>(r0, r10)
        L_0x00c8:
            r1 = r9
            goto L_0x0135
        L_0x00cb:
            r14.L$0 = r9
            r14.L$1 = r12
            r14.L$2 = r13
            r14.L$3 = r8
            r14.L$4 = r8
            r14.label = r6
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m1410b(r9, r3, r14)
            if (r0 != r1) goto L_0x00de
            goto L_0x0135
        L_0x00de:
            r11 = r9
            r10 = r12
            r9 = r13
        L_0x00e1:
            androidx.compose.ui.input.pointer.p r0 = (androidx.compose.p015ui.input.pointer.C1644p) r0
            androidx.compose.foundation.layout.C0761x.m1748v(r10, r0)
            kotlin.jvm.internal.Ref$FloatRef r2 = new kotlin.jvm.internal.Ref$FloatRef
            r2.<init>()
            androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1 r13 = new androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1
            r13.<init>(r10, r2)
            androidx.compose.foundation.gestures.Orientation r10 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r9 != r10) goto L_0x010d
            long r3 = r0.f3656a
            int r12 = r0.f3663h
            r14.L$0 = r2
            r14.L$1 = r8
            r14.L$2 = r8
            r14.label = r5
            r9 = r11
            r10 = r3
            java.lang.Object r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1362e(r9, r10, r12, r13, r14)
            if (r0 != r1) goto L_0x0109
            goto L_0x0135
        L_0x0109:
            r9 = r2
        L_0x010a:
            androidx.compose.ui.input.pointer.p r0 = (androidx.compose.p015ui.input.pointer.C1644p) r0
            goto L_0x0125
        L_0x010d:
            long r5 = r0.f3656a
            int r12 = r0.f3663h
            r14.L$0 = r2
            r14.L$1 = r8
            r14.L$2 = r8
            r14.label = r4
            r9 = r11
            r10 = r5
            java.lang.Object r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1360c(r9, r10, r12, r13, r14)
            if (r0 != r1) goto L_0x0122
            goto L_0x0135
        L_0x0122:
            r9 = r2
        L_0x0123:
            androidx.compose.ui.input.pointer.p r0 = (androidx.compose.p015ui.input.pointer.C1644p) r0
        L_0x0125:
            if (r0 == 0) goto L_0x0134
            float r9 = r9.element
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r9)
            kotlin.Pair r9 = new kotlin.Pair
            r9.<init>(r0, r10)
            goto L_0x00c8
        L_0x0134:
            r1 = r8
        L_0x0135:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.m1373a(androidx.compose.ui.input.pointer.c, androidx.compose.runtime.k1, androidx.compose.runtime.k1, e0.f, androidx.compose.foundation.gestures.Orientation, kotlin.coroutines.c):java.io.Serializable");
    }

    /* renamed from: b */
    public static final Object m1374b(C1631c cVar, Pair pair, C6687f fVar, C19499d dVar, boolean z, Orientation orientation, C19340c cVar2) {
        float floatValue = ((Number) pair.getSecond()).floatValue();
        C1644p pVar = (C1644p) pair.getFirst();
        Orientation orientation2 = Orientation.Vertical;
        long q = orientation == orientation2 ? C19421p.m32952q(0.0f, floatValue) : C19421p.m32952q(floatValue, 0.0f);
        long j = pVar.f3658c;
        long e = C8343c.m16644e(j, C8343c.m16646g(q, Math.signum(orientation == orientation2 ? C8343c.m16643d(j) : C8343c.m16642c(j))));
        dVar.mo72199l(new C0601c.C0604c(e));
        if (z) {
            floatValue *= (float) -1;
        }
        dVar.mo72199l(new C0601c.C0603b(floatValue, e));
        DraggableKt$awaitDrag$dragTick$1 draggableKt$awaitDrag$dragTick$1 = new DraggableKt$awaitDrag$dragTick$1(fVar, orientation, dVar, z);
        return orientation == orientation2 ? DragGestureDetectorKt.m1369l(cVar, pVar.f3656a, draggableKt$awaitDrag$dragTick$1, cVar2) : DragGestureDetectorKt.m1366i(cVar, pVar.f3656a, draggableKt$awaitDrag$dragTick$1, cVar2);
    }

    /* renamed from: c */
    public static final C1436d m1375c(C1436d dVar, C19861p<? super C1302d, ? super Integer, ? extends C0611i> pVar, C19857l<? super C1644p, Boolean> lVar, Orientation orientation, boolean z, C0640j jVar, C19846a<Boolean> aVar, C19862q<? super C19525d0, ? super C8343c, ? super C19340c<? super C19394m>, ? extends Object> qVar, C19862q<? super C19525d0, ? super Float, ? super C19340c<? super C19394m>, ? extends Object> qVar2, boolean z2) {
        C1436d dVar2 = dVar;
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(lVar, "canDrag");
        Orientation orientation2 = orientation;
        C19383o.m32797g(orientation2, "orientation");
        C19862q<? super C19525d0, ? super C8343c, ? super C19340c<? super C19394m>, ? extends Object> qVar3 = qVar;
        C19383o.m32797g(qVar3, "onDragStarted");
        C19862q<? super C19525d0, ? super Float, ? super C19340c<? super C19394m>, ? extends Object> qVar4 = qVar2;
        C19383o.m32797g(qVar4, "onDragStopped");
        return ComposedModifierKt.m3049a(dVar, InspectableValueKt.f4032a, new DraggableKt$draggable$9(pVar, jVar, aVar, lVar, qVar3, qVar4, orientation2, z, z2));
    }

    /* renamed from: d */
    public static C1436d m1376d(C0607e eVar, Orientation orientation, boolean z, C0640j jVar, boolean z2, C19862q qVar, boolean z3) {
        C0607e eVar2 = eVar;
        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
        DraggableKt$draggable$1 draggableKt$draggable$1 = new DraggableKt$draggable$1((C19340c<? super DraggableKt$draggable$1>) null);
        C19383o.m32797g(eVar, "state");
        C19383o.m32797g(orientation, "orientation");
        C19383o.m32797g(qVar, "onDragStopped");
        DraggableKt$draggable$3 draggableKt$draggable$3 = new DraggableKt$draggable$3(eVar);
        DraggableKt$draggable$4 draggableKt$draggable$4 = DraggableKt$draggable$4.INSTANCE;
        boolean z4 = z2;
        return m1375c(aVar, draggableKt$draggable$3, draggableKt$draggable$4, orientation, z, jVar, new DraggableKt$draggable$5(z2), draggableKt$draggable$1, qVar, z3);
    }
}
