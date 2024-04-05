package androidx.compose.animation.core;

import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0717c0;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1449e;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;
import p753kq.C19861p;

public final class SuspendAnimationKt {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f3 A[Catch:{ CancellationException -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, V extends androidx.compose.animation.core.C0432j> java.lang.Object m1070a(androidx.compose.animation.core.C0424f<T, V> r24, androidx.compose.animation.core.C0413b<T, V> r25, long r26, p753kq.C19857l<? super androidx.compose.animation.core.C0419d<T, V>, kotlin.C19394m> r28, kotlin.coroutines.C19340c<? super kotlin.C19394m> r29) {
        /*
            r9 = r24
            r0 = r25
            r1 = r29
            boolean r2 = r1 instanceof androidx.compose.animation.core.SuspendAnimationKt$animate$4
            if (r2 == 0) goto L_0x0019
            r2 = r1
            androidx.compose.animation.core.SuspendAnimationKt$animate$4 r2 = (androidx.compose.animation.core.SuspendAnimationKt$animate$4) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001e
        L_0x0019:
            androidx.compose.animation.core.SuspendAnimationKt$animate$4 r2 = new androidx.compose.animation.core.SuspendAnimationKt$animate$4
            r2.<init>(r1)
        L_0x001e:
            r10 = r2
            java.lang.Object r1 = r10.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r11 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r10.label
            r12 = 2
            r13 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r13) goto L_0x0036
            if (r2 != r12) goto L_0x002e
            goto L_0x0036
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0036:
            java.lang.Object r0 = r10.L$3
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            java.lang.Object r2 = r10.L$2
            kq.l r2 = (p753kq.C19857l) r2
            java.lang.Object r3 = r10.L$1
            androidx.compose.animation.core.b r3 = (androidx.compose.animation.core.C0413b) r3
            java.lang.Object r4 = r10.L$0
            androidx.compose.animation.core.f r4 = (androidx.compose.animation.core.C0424f) r4
            r5 = r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)     // Catch:{ CancellationException -> 0x004d }
            r0 = r3
            goto L_0x00de
        L_0x004d:
            r0 = move-exception
            goto L_0x0130
        L_0x0050:
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            r1 = 0
            java.lang.Object r15 = r0.mo3468f(r1)
            androidx.compose.animation.core.j r17 = r0.mo3464b(r1)
            kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
            r14.<init>()
            r1 = -9223372036854775808
            int r1 = (r26 > r1 ? 1 : (r26 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00a7
            kotlin.coroutines.CoroutineContext r1 = r10.getContext()     // Catch:{ CancellationException -> 0x0098 }
            float r7 = m1076g(r1)     // Catch:{ CancellationException -> 0x0098 }
            androidx.compose.animation.core.SuspendAnimationKt$animate$6 r8 = new androidx.compose.animation.core.SuspendAnimationKt$animate$6     // Catch:{ CancellationException -> 0x0098 }
            r1 = r8
            r2 = r14
            r3 = r15
            r4 = r25
            r5 = r17
            r6 = r24
            r15 = r8
            r8 = r28
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ CancellationException -> 0x0098 }
            r10.L$0 = r9     // Catch:{ CancellationException -> 0x0098 }
            r10.L$1 = r0     // Catch:{ CancellationException -> 0x0098 }
            r8 = r28
            r10.L$2 = r8     // Catch:{ CancellationException -> 0x0098 }
            r10.L$3 = r14     // Catch:{ CancellationException -> 0x0098 }
            r10.label = r13     // Catch:{ CancellationException -> 0x0098 }
            boolean r1 = r25.mo3463a()     // Catch:{ CancellationException -> 0x0098 }
            if (r1 == 0) goto L_0x009b
            java.lang.Object r1 = androidx.compose.animation.core.C0464y.m1233a(r15, r10)     // Catch:{ CancellationException -> 0x0098 }
            goto L_0x00a4
        L_0x0098:
            r0 = move-exception
            goto L_0x0134
        L_0x009b:
            androidx.compose.animation.core.SuspendAnimationKt$callWithFrameNanos$2 r1 = new androidx.compose.animation.core.SuspendAnimationKt$callWithFrameNanos$2     // Catch:{ CancellationException -> 0x0098 }
            r1.<init>(r15)     // Catch:{ CancellationException -> 0x0098 }
            java.lang.Object r1 = p628nj.C18263b.m30871u0(r1, r10)     // Catch:{ CancellationException -> 0x0098 }
        L_0x00a4:
            if (r1 != r11) goto L_0x00db
            return r11
        L_0x00a7:
            r8 = r28
            androidx.compose.animation.core.d r7 = new androidx.compose.animation.core.d     // Catch:{ CancellationException -> 0x0098 }
            androidx.compose.animation.core.k0 r16 = r25.mo3467e()     // Catch:{ CancellationException -> 0x0098 }
            java.lang.Object r20 = r25.mo3469g()     // Catch:{ CancellationException -> 0x0098 }
            androidx.compose.animation.core.SuspendAnimationKt$animate$7 r1 = new androidx.compose.animation.core.SuspendAnimationKt$animate$7     // Catch:{ CancellationException -> 0x0098 }
            r1.<init>(r9)     // Catch:{ CancellationException -> 0x0098 }
            r6 = r14
            r14 = r7
            r18 = r26
            r21 = r26
            r23 = r1
            r14.<init>(r15, r16, r17, r18, r20, r21, r23)     // Catch:{ CancellationException -> 0x0132 }
            kotlin.coroutines.CoroutineContext r1 = r10.getContext()     // Catch:{ CancellationException -> 0x0132 }
            float r4 = m1076g(r1)     // Catch:{ CancellationException -> 0x0132 }
            r1 = r7
            r2 = r26
            r5 = r25
            r14 = r6
            r6 = r24
            r15 = r7
            r7 = r28
            m1075f(r1, r2, r4, r5, r6, r7)     // Catch:{ CancellationException -> 0x0098 }
            r14.element = r15     // Catch:{ CancellationException -> 0x0098 }
        L_0x00db:
            r2 = r8
            r4 = r9
            r5 = r14
        L_0x00de:
            T r1 = r5.element     // Catch:{ CancellationException -> 0x004d }
            kotlin.jvm.internal.C19383o.m32794d(r1)     // Catch:{ CancellationException -> 0x004d }
            androidx.compose.animation.core.d r1 = (androidx.compose.animation.core.C0419d) r1     // Catch:{ CancellationException -> 0x004d }
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r1.f1104i     // Catch:{ CancellationException -> 0x004d }
            java.lang.Object r1 = r1.getValue()     // Catch:{ CancellationException -> 0x004d }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ CancellationException -> 0x004d }
            boolean r1 = r1.booleanValue()     // Catch:{ CancellationException -> 0x004d }
            if (r1 == 0) goto L_0x012d
            kotlin.coroutines.CoroutineContext r1 = r10.getContext()     // Catch:{ CancellationException -> 0x004d }
            float r1 = m1076g(r1)     // Catch:{ CancellationException -> 0x004d }
            androidx.compose.animation.core.SuspendAnimationKt$animate$9 r3 = new androidx.compose.animation.core.SuspendAnimationKt$animate$9     // Catch:{ CancellationException -> 0x004d }
            r24 = r3
            r25 = r5
            r26 = r1
            r27 = r0
            r28 = r4
            r29 = r2
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ CancellationException -> 0x004d }
            r10.L$0 = r4     // Catch:{ CancellationException -> 0x004d }
            r10.L$1 = r0     // Catch:{ CancellationException -> 0x004d }
            r10.L$2 = r2     // Catch:{ CancellationException -> 0x004d }
            r10.L$3 = r5     // Catch:{ CancellationException -> 0x004d }
            r10.label = r12     // Catch:{ CancellationException -> 0x004d }
            boolean r1 = r0.mo3463a()     // Catch:{ CancellationException -> 0x004d }
            if (r1 == 0) goto L_0x0121
            java.lang.Object r1 = androidx.compose.animation.core.C0464y.m1233a(r3, r10)     // Catch:{ CancellationException -> 0x004d }
            goto L_0x012a
        L_0x0121:
            androidx.compose.animation.core.SuspendAnimationKt$callWithFrameNanos$2 r1 = new androidx.compose.animation.core.SuspendAnimationKt$callWithFrameNanos$2     // Catch:{ CancellationException -> 0x004d }
            r1.<init>(r3)     // Catch:{ CancellationException -> 0x004d }
            java.lang.Object r1 = p628nj.C18263b.m30871u0(r1, r10)     // Catch:{ CancellationException -> 0x004d }
        L_0x012a:
            if (r1 != r11) goto L_0x00de
            return r11
        L_0x012d:
            kotlin.m r0 = kotlin.C19394m.f43287a
            return r0
        L_0x0130:
            r14 = r5
            goto L_0x0135
        L_0x0132:
            r0 = move-exception
            r14 = r6
        L_0x0134:
            r4 = r9
        L_0x0135:
            T r1 = r14.element
            androidx.compose.animation.core.d r1 = (androidx.compose.animation.core.C0419d) r1
            r2 = 0
            if (r1 != 0) goto L_0x013d
            goto L_0x0144
        L_0x013d:
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r1.f1104i
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.setValue(r3)
        L_0x0144:
            T r1 = r14.element
            androidx.compose.animation.core.d r1 = (androidx.compose.animation.core.C0419d) r1
            if (r1 == 0) goto L_0x0153
            long r5 = r1.f1102g
            long r7 = r4.f1112e
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0153
            goto L_0x0154
        L_0x0153:
            r13 = r2
        L_0x0154:
            if (r13 == 0) goto L_0x0158
            r4.f1114g = r2
        L_0x0158:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.m1070a(androidx.compose.animation.core.f, androidx.compose.animation.core.b, long, kq.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: b */
    public static Object m1071b(float f, C0422e eVar, C19861p pVar, C19340c cVar) {
        C0437l0 l0Var = VectorConvertersKt.f1076a;
        Float f2 = new Float(0.0f);
        float f3 = f;
        Float f4 = new Float(f);
        C0432j jVar = (C0432j) l0Var.f1150a.invoke(new Float(0.0f));
        if (jVar == null) {
            C0432j jVar2 = (C0432j) l0Var.f1150a.invoke(f2);
            C19383o.m32797g(jVar2, "<this>");
            jVar = jVar2.mo3490c();
        }
        C0432j jVar3 = jVar;
        Object a = m1070a(new C0424f(l0Var, f2, jVar3, 56), new C0431i0(eVar, l0Var, f2, f4, jVar3), Long.MIN_VALUE, new SuspendAnimationKt$animate$3(pVar, l0Var), cVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (a != coroutineSingletons) {
            a = C19394m.f43287a;
        }
        return a == coroutineSingletons ? a : C19394m.f43287a;
    }

    /* renamed from: c */
    public static final Object m1072c(float f, float f2, C0717c0 c0Var, C19861p pVar, C19340c cVar) {
        C19383o.m32797g(c0Var, "animationSpec");
        Object a = m1070a(C0114h.m311p(f, f2, 28), new C0440n(new C0444p(c0Var), VectorConvertersKt.f1076a, Float.valueOf(f), new C0426g(f2)), Long.MIN_VALUE, new SuspendAnimationKt$animateDecay$2(pVar), cVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : C19394m.f43287a;
    }

    /* renamed from: d */
    public static Object m1073d(C0424f fVar, C0442o oVar, C19857l lVar, C19340c cVar) {
        Object a = m1070a(fVar, new C0440n(oVar, fVar.f1109b, fVar.getValue(), fVar.f1111d), Long.MIN_VALUE, lVar, cVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : C19394m.f43287a;
    }

    /* renamed from: e */
    public static Object m1074e(C0424f fVar, Object obj, C0422e eVar, boolean z, C19857l lVar, C19340c cVar, int i) {
        if ((i & 2) != 0) {
            eVar = C0761x.m1678L0(0.0f, 0.0f, (Object) null, 7);
        }
        C0422e eVar2 = eVar;
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            lVar = SuspendAnimationKt$animateTo$2.INSTANCE;
        }
        Object a = m1070a(fVar, new C0431i0(eVar2, fVar.f1109b, fVar.getValue(), obj, fVar.f1111d), z ? fVar.f1112e : Long.MIN_VALUE, lVar, cVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : C19394m.f43287a;
    }

    /* renamed from: f */
    public static final <T, V extends C0432j> void m1075f(C0419d<T, V> dVar, long j, float f, C0413b<T, V> bVar, C0424f<T, V> fVar, C19857l<? super C0419d<T, V>, C19394m> lVar) {
        long d = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0 ? bVar.mo3466d() : (long) (((float) (j - dVar.f1098c)) / f);
        dVar.f1102g = j;
        dVar.f1100e.setValue(bVar.mo3468f(d));
        V b = bVar.mo3464b(d);
        C19383o.m32797g(b, "<set-?>");
        dVar.f1101f = b;
        if (bVar.mo3465c(d)) {
            dVar.f1103h = dVar.f1102g;
            dVar.f1104i.setValue(Boolean.FALSE);
        }
        m1077h(dVar, fVar);
        lVar.invoke(dVar);
    }

    /* renamed from: g */
    public static final float m1076g(CoroutineContext coroutineContext) {
        C19383o.m32797g(coroutineContext, "<this>");
        int i = C1449e.f3143b0;
        C1449e eVar = (C1449e) coroutineContext.get(C1449e.C1450a.f3144b);
        float r = eVar != null ? eVar.mo6178r() : 1.0f;
        if (r >= 0.0f) {
            return r;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: h */
    public static final <T, V extends C0432j> void m1077h(C0419d<T, V> dVar, C0424f<T, V> fVar) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(fVar, "state");
        fVar.f1110c.setValue(dVar.mo3481b());
        V v = fVar.f1111d;
        V v2 = dVar.f1101f;
        C19383o.m32797g(v, "<this>");
        C19383o.m32797g(v2, "source");
        int b = v.mo3489b();
        for (int i = 0; i < b; i++) {
            v.mo3492e(v2.mo3488a(i), i);
        }
        fVar.f1113f = dVar.f1103h;
        fVar.f1112e = dVar.f1102g;
        fVar.f1114g = ((Boolean) dVar.f1104i.getValue()).booleanValue();
    }
}
