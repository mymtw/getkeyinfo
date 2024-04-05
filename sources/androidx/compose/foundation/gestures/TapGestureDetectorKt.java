package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.input.pointer.C1631c;
import androidx.compose.p015ui.input.pointer.C1644p;
import androidx.compose.p015ui.input.pointer.C1652w;
import androidx.compose.p015ui.input.pointer.PointerEventPass;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C19697g;
import p288y.C8343c;
import p753kq.C19857l;
import p753kq.C19862q;

public final class TapGestureDetectorKt {

    /* renamed from: a */
    public static final C19862q<C0612j, C8343c, C19340c<? super C19394m>, Object> f1352a = new TapGestureDetectorKt$NoPressGesture$1((C19340c<? super TapGestureDetectorKt$NoPressGesture$1>) null);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d A[LOOP:0: B:16:0x004b->B:17:0x004d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071 A[EDGE_INSN: B:27:0x0071->B:24:0x0071 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public static final java.lang.Object m1409a(androidx.compose.p015ui.input.pointer.C1631c r8, kotlin.coroutines.C19340c r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.c r8 = (androidx.compose.p015ui.input.pointer.C1631c) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            goto L_0x0041
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
        L_0x0036:
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r8.mo6568f0(androidx.compose.p015ui.input.pointer.PointerEventPass.Main, r0)
            if (r9 != r1) goto L_0x0041
            goto L_0x0075
        L_0x0041:
            androidx.compose.ui.input.pointer.l r9 = (androidx.compose.p015ui.input.pointer.C1640l) r9
            java.util.List<androidx.compose.ui.input.pointer.p> r2 = r9.f3651a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L_0x004b:
            if (r6 >= r4) goto L_0x0059
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.p r7 = (androidx.compose.p015ui.input.pointer.C1644p) r7
            r7.mo6614a()
            int r6 = r6 + 1
            goto L_0x004b
        L_0x0059:
            java.util.List<androidx.compose.ui.input.pointer.p> r9 = r9.f3651a
            int r2 = r9.size()
            r4 = r5
        L_0x0060:
            if (r4 >= r2) goto L_0x0071
            java.lang.Object r6 = r9.get(r4)
            androidx.compose.ui.input.pointer.p r6 = (androidx.compose.p015ui.input.pointer.C1644p) r6
            boolean r6 = r6.f3659d
            if (r6 == 0) goto L_0x006e
            r5 = r3
            goto L_0x0071
        L_0x006e:
            int r4 = r4 + 1
            goto L_0x0060
        L_0x0071:
            if (r5 != 0) goto L_0x0036
            kotlin.m r1 = kotlin.C19394m.f43287a
        L_0x0075:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.m1409a(androidx.compose.ui.input.pointer.c, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: b */
    public static final Object m1410b(C1631c cVar, boolean z, C19340c<? super C1644p> cVar2) {
        return m1411c(cVar, PointerEventPass.Main, z, cVar2);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072 A[SYNTHETIC] */
    /* renamed from: c */
    public static final java.lang.Object m1411c(androidx.compose.p015ui.input.pointer.C1631c r9, androidx.compose.p015ui.input.pointer.PointerEventPass r10, boolean r11, kotlin.coroutines.C19340c<? super androidx.compose.p015ui.input.pointer.C1644p> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            boolean r9 = r0.Z$0
            java.lang.Object r10 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r10 = (androidx.compose.p015ui.input.pointer.PointerEventPass) r10
            java.lang.Object r11 = r0.L$0
            androidx.compose.ui.input.pointer.c r11 = (androidx.compose.p015ui.input.pointer.C1631c) r11
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            r8 = r11
            r11 = r9
            r9 = r8
            goto L_0x004e
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
        L_0x003f:
            r0.L$0 = r9
            r0.L$1 = r10
            r0.Z$0 = r11
            r0.label = r3
            java.lang.Object r12 = r9.mo6568f0(r10, r0)
            if (r12 != r1) goto L_0x004e
            return r1
        L_0x004e:
            androidx.compose.ui.input.pointer.l r12 = (androidx.compose.p015ui.input.pointer.C1640l) r12
            java.util.List<androidx.compose.ui.input.pointer.p> r2 = r12.f3651a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L_0x0058:
            if (r6 >= r4) goto L_0x0072
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.p r7 = (androidx.compose.p015ui.input.pointer.C1644p) r7
            if (r11 == 0) goto L_0x0067
            boolean r7 = com.google.android.play.core.appupdate.C15562d.m25203s(r7)
            goto L_0x006b
        L_0x0067:
            boolean r7 = com.google.android.play.core.appupdate.C15562d.m25204t(r7)
        L_0x006b:
            if (r7 != 0) goto L_0x006f
            r2 = r5
            goto L_0x0073
        L_0x006f:
            int r6 = r6 + 1
            goto L_0x0058
        L_0x0072:
            r2 = r3
        L_0x0073:
            if (r2 == 0) goto L_0x003f
            java.util.List<androidx.compose.ui.input.pointer.p> r9 = r12.f3651a
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.m1411c(androidx.compose.ui.input.pointer.c, androidx.compose.ui.input.pointer.PointerEventPass, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: d */
    public static final Object m1412d(C1652w wVar, C19862q<? super C0612j, ? super C8343c, ? super C19340c<? super C19394m>, ? extends Object> qVar, C19857l<? super C8343c, C19394m> lVar, C19340c<? super C19394m> cVar) {
        Object b = ForEachGestureKt.m1378b(wVar, new TapGestureDetectorKt$detectTapAndPress$2(new PressGestureScopeImpl(wVar), qVar, lVar, (C19340c<? super TapGestureDetectorKt$detectTapAndPress$2>) null), cVar);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : C19394m.f43287a;
    }

    /* renamed from: e */
    public static final Object m1413e(C1652w wVar, C19862q qVar, C19857l lVar, C19857l lVar2, C19857l lVar3, C19340c cVar) {
        Object d = C19697g.m33466d(new TapGestureDetectorKt$detectTapGestures$2(wVar, qVar, lVar2, lVar, lVar3, (C19340c<? super TapGestureDetectorKt$detectTapGestures$2>) null), cVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : C19394m.f43287a;
    }

    /* renamed from: f */
    public static /* synthetic */ Object m1414f(C1652w wVar, C19862q<C0612j, C8343c, C19340c<? super C19394m>, Object> qVar, C19857l lVar, C19340c cVar, int i) {
        if ((i & 4) != 0) {
            qVar = f1352a;
        }
        C19862q<C0612j, C8343c, C19340c<? super C19394m>, Object> qVar2 = qVar;
        if ((i & 8) != 0) {
            lVar = null;
        }
        return m1413e(wVar, qVar2, (C19857l) null, (C19857l) null, lVar, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x006d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m1415g(androidx.compose.p015ui.input.pointer.C1631c r13, kotlin.coroutines.C19340c<? super androidx.compose.p015ui.input.pointer.C1644p> r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$1
            r0.<init>(r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r6) goto L_0x0039
            if (r2 != r5) goto L_0x0031
            java.lang.Object r13 = r0.L$0
            androidx.compose.ui.input.pointer.c r13 = (androidx.compose.p015ui.input.pointer.C1631c) r13
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            goto L_0x00b6
        L_0x0031:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0039:
            java.lang.Object r13 = r0.L$0
            androidx.compose.ui.input.pointer.c r13 = (androidx.compose.p015ui.input.pointer.C1631c) r13
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            goto L_0x0051
        L_0x0041:
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
        L_0x0044:
            androidx.compose.ui.input.pointer.PointerEventPass r14 = androidx.compose.p015ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r13
            r0.label = r6
            java.lang.Object r14 = r13.mo6568f0(r14, r0)
            if (r14 != r1) goto L_0x0051
            return r1
        L_0x0051:
            androidx.compose.ui.input.pointer.l r14 = (androidx.compose.p015ui.input.pointer.C1640l) r14
            java.util.List<androidx.compose.ui.input.pointer.p> r2 = r14.f3651a
            int r7 = r2.size()
            r8 = r3
        L_0x005a:
            if (r8 >= r7) goto L_0x006d
            java.lang.Object r9 = r2.get(r8)
            androidx.compose.ui.input.pointer.p r9 = (androidx.compose.p015ui.input.pointer.C1644p) r9
            boolean r9 = com.google.android.play.core.appupdate.C15562d.m25205u(r9)
            if (r9 != 0) goto L_0x006a
            r2 = r3
            goto L_0x006e
        L_0x006a:
            int r8 = r8 + 1
            goto L_0x005a
        L_0x006d:
            r2 = r6
        L_0x006e:
            if (r2 == 0) goto L_0x0077
            java.util.List<androidx.compose.ui.input.pointer.p> r13 = r14.f3651a
            java.lang.Object r13 = r13.get(r3)
            return r13
        L_0x0077:
            java.util.List<androidx.compose.ui.input.pointer.p> r14 = r14.f3651a
            int r2 = r14.size()
            r7 = r3
        L_0x007e:
            if (r7 >= r2) goto L_0x00a5
            java.lang.Object r8 = r14.get(r7)
            androidx.compose.ui.input.pointer.p r8 = (androidx.compose.p015ui.input.pointer.C1644p) r8
            boolean r9 = r8.mo6615b()
            if (r9 != 0) goto L_0x009d
            long r9 = r13.mo6566a()
            long r11 = r13.mo6565R()
            boolean r8 = com.google.android.play.core.appupdate.C15562d.m25180R(r8, r9, r11)
            if (r8 == 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r8 = r3
            goto L_0x009e
        L_0x009d:
            r8 = r6
        L_0x009e:
            if (r8 == 0) goto L_0x00a2
            r14 = r6
            goto L_0x00a6
        L_0x00a2:
            int r7 = r7 + 1
            goto L_0x007e
        L_0x00a5:
            r14 = r3
        L_0x00a6:
            if (r14 == 0) goto L_0x00a9
            return r4
        L_0x00a9:
            androidx.compose.ui.input.pointer.PointerEventPass r14 = androidx.compose.p015ui.input.pointer.PointerEventPass.Final
            r0.L$0 = r13
            r0.label = r5
            java.lang.Object r14 = r13.mo6568f0(r14, r0)
            if (r14 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            androidx.compose.ui.input.pointer.l r14 = (androidx.compose.p015ui.input.pointer.C1640l) r14
            java.util.List<androidx.compose.ui.input.pointer.p> r14 = r14.f3651a
            int r2 = r14.size()
            r7 = r3
        L_0x00bf:
            if (r7 >= r2) goto L_0x00d2
            java.lang.Object r8 = r14.get(r7)
            androidx.compose.ui.input.pointer.p r8 = (androidx.compose.p015ui.input.pointer.C1644p) r8
            boolean r8 = r8.mo6615b()
            if (r8 == 0) goto L_0x00cf
            r14 = r6
            goto L_0x00d3
        L_0x00cf:
            int r7 = r7 + 1
            goto L_0x00bf
        L_0x00d2:
            r14 = r3
        L_0x00d3:
            if (r14 == 0) goto L_0x0044
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.m1415g(androidx.compose.ui.input.pointer.c, kotlin.coroutines.c):java.lang.Object");
    }
}
