package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.C0614l;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3", mo70541f = "LazyGridScrolling.kt", mo70542l = {128, 223}, mo70543m = "invokeSuspend")
final class LazyGridScrollingKt$doSmoothScrollToItem$3 extends SuspendLambda implements C19861p<C0614l, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ int $scrollOffset;
    public final /* synthetic */ int $slotsPerLine;
    public final /* synthetic */ LazyGridState $this_doSmoothScrollToItem;
    public float F$0;
    public float F$1;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridScrollingKt$doSmoothScrollToItem$3(LazyGridState lazyGridState, int i, int i2, int i3, C19340c<? super LazyGridScrollingKt$doSmoothScrollToItem$3> cVar) {
        super(2, cVar);
        this.$this_doSmoothScrollToItem = lazyGridState;
        this.$index = i;
        this.$slotsPerLine = i2;
        this.$scrollOffset = i3;
    }

    public static final boolean access$invokeSuspend$isOvershot(boolean z, LazyGridState lazyGridState, int i, int i2) {
        if (z) {
            if (lazyGridState.mo4313e() <= i && (lazyGridState.mo4313e() != i || lazyGridState.mo4314f() <= i2)) {
                return false;
            }
        } else if (lazyGridState.mo4313e() >= i && (lazyGridState.mo4313e() != i || lazyGridState.mo4314f() >= i2)) {
            return false;
        }
        return true;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        LazyGridScrollingKt$doSmoothScrollToItem$3 lazyGridScrollingKt$doSmoothScrollToItem$3 = new LazyGridScrollingKt$doSmoothScrollToItem$3(this.$this_doSmoothScrollToItem, this.$index, this.$slotsPerLine, this.$scrollOffset, cVar);
        lazyGridScrollingKt$doSmoothScrollToItem$3.L$0 = obj;
        return lazyGridScrollingKt$doSmoothScrollToItem$3;
    }

    public final Object invoke(C0614l lVar, C19340c<? super C19394m> cVar) {
        return ((LazyGridScrollingKt$doSmoothScrollToItem$3) create(lVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: androidx.compose.foundation.gestures.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cf A[Catch:{ ItemFoundInScroll -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d1 A[Catch:{ ItemFoundInScroll -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e1 A[Catch:{ ItemFoundInScroll -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e3 A[Catch:{ ItemFoundInScroll -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101 A[Catch:{ ItemFoundInScroll -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0102 A[Catch:{ ItemFoundInScroll -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0134 A[Catch:{ ItemFoundInScroll -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0136 A[Catch:{ ItemFoundInScroll -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0139 A[Catch:{ ItemFoundInScroll -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013b A[Catch:{ ItemFoundInScroll -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0140 A[Catch:{ ItemFoundInScroll -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0143 A[Catch:{ ItemFoundInScroll -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0230 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            r30 = this;
            r1 = r30
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r1.label
            r3 = 2
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0042
            if (r0 == r6) goto L_0x001d
            if (r0 != r3) goto L_0x0015
            androidx.compose.foundation.layout.C0761x.m1684O0(r31)
            r10 = r1
            goto L_0x0231
        L_0x0015:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x001d:
            int r0 = r1.I$0
            float r7 = r1.F$1
            float r8 = r1.F$0
            java.lang.Object r9 = r1.L$3
            kotlin.jvm.internal.Ref$IntRef r9 = (kotlin.jvm.internal.Ref$IntRef) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r11 = r1.L$1
            kotlin.jvm.internal.Ref$BooleanRef r11 = (kotlin.jvm.internal.Ref$BooleanRef) r11
            java.lang.Object r12 = r1.L$0
            androidx.compose.foundation.gestures.l r12 = (androidx.compose.foundation.gestures.C0614l) r12
            androidx.compose.foundation.layout.C0761x.m1684O0(r31)     // Catch:{ ItemFoundInScroll -> 0x003e }
            r15 = r7
            r14 = r8
            r13 = r9
            r9 = r12
            r12 = r10
            r10 = r1
            goto L_0x01ab
        L_0x003e:
            r0 = move-exception
            r10 = r1
            goto L_0x01dc
        L_0x0042:
            androidx.compose.foundation.layout.C0761x.m1684O0(r31)
            java.lang.Object r0 = r1.L$0
            r12 = r0
            androidx.compose.foundation.gestures.l r12 = (androidx.compose.foundation.gestures.C0614l) r12
            androidx.compose.foundation.lazy.grid.LazyGridState r0 = r1.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r0.f1678f     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            m0.b r0 = (p174m0.C7282b) r0     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            float r7 = androidx.compose.foundation.lazy.grid.C0816r.f1740a     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            float r0 = r0.mo3789B0(r7)     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            androidx.compose.foundation.lazy.grid.LazyGridState r7 = r1.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            androidx.compose.runtime.ParcelableSnapshotMutableState r7 = r7.f1678f     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            m0.b r7 = (p174m0.C7282b) r7     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            float r8 = androidx.compose.foundation.lazy.grid.C0816r.f1741b     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            float r7 = r7.mo3789B0(r8)     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            r8.<init>()     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            r8.element = r6     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            r9.<init>()     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            r10 = 30
            androidx.compose.animation.core.f r10 = androidx.activity.C0114h.m311p(r4, r4, r10)     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            r9.element = r10     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            androidx.compose.foundation.lazy.grid.LazyGridState r10 = r1.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            int r11 = r1.$index     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            androidx.compose.foundation.lazy.grid.g r10 = androidx.compose.foundation.lazy.grid.C0816r.m1851b(r10, r11)     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            if (r10 != 0) goto L_0x01cf
            int r10 = r1.$index     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            androidx.compose.foundation.lazy.grid.LazyGridState r11 = r1.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            int r11 = r11.mo4313e()     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            if (r10 <= r11) goto L_0x0094
            r10 = r6
            goto L_0x0095
        L_0x0094:
            r10 = 0
        L_0x0095:
            kotlin.jvm.internal.Ref$IntRef r11 = new kotlin.jvm.internal.Ref$IntRef     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            r11.<init>()     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            r11.element = r6     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            r14 = r0
            r15 = r7
            r0 = r10
            r13 = r11
            r10 = r1
            r11 = r8
            r29 = r12
            r12 = r9
            r9 = r29
        L_0x00a7:
            boolean r7 = r11.element     // Catch:{ ItemFoundInScroll -> 0x01cb }
            if (r7 == 0) goto L_0x023a
            androidx.compose.foundation.lazy.grid.LazyGridState r7 = r10.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01cb }
            androidx.compose.foundation.lazy.grid.m r7 = r7.mo4315g()     // Catch:{ ItemFoundInScroll -> 0x01cb }
            int r7 = r7.mo4330a()     // Catch:{ ItemFoundInScroll -> 0x01cb }
            if (r7 <= 0) goto L_0x023a
            androidx.compose.foundation.lazy.grid.LazyGridState r7 = r10.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01cb }
            androidx.compose.foundation.lazy.grid.m r7 = r7.mo4315g()     // Catch:{ ItemFoundInScroll -> 0x01cb }
            java.util.List r7 = r7.mo4331b()     // Catch:{ ItemFoundInScroll -> 0x01cb }
            int r7 = androidx.compose.foundation.lazy.grid.C0816r.m1850a(r7)     // Catch:{ ItemFoundInScroll -> 0x01cb }
            int r8 = r10.$index     // Catch:{ ItemFoundInScroll -> 0x01cb }
            androidx.compose.foundation.lazy.grid.LazyGridState r5 = r10.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01cb }
            int r5 = r5.mo4313e()     // Catch:{ ItemFoundInScroll -> 0x01cb }
            if (r8 >= r5) goto L_0x00d1
            r5 = r6
            goto L_0x00d2
        L_0x00d1:
            r5 = 0
        L_0x00d2:
            int r8 = r10.$index     // Catch:{ ItemFoundInScroll -> 0x01cb }
            androidx.compose.foundation.lazy.grid.LazyGridState r3 = r10.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01cb }
            int r3 = r3.mo4313e()     // Catch:{ ItemFoundInScroll -> 0x01cb }
            int r8 = r8 - r3
            int r3 = r10.$slotsPerLine     // Catch:{ ItemFoundInScroll -> 0x01cb }
            int r16 = r3 + -1
            if (r5 == 0) goto L_0x00e3
            r5 = -1
            goto L_0x00e4
        L_0x00e3:
            r5 = r6
        L_0x00e4:
            int r16 = r16 * r5
            int r16 = r16 + r8
            int r16 = r16 / r3
            int r7 = r7 * r16
            float r3 = (float) r7     // Catch:{ ItemFoundInScroll -> 0x01cb }
            int r5 = r10.$scrollOffset     // Catch:{ ItemFoundInScroll -> 0x01cb }
            float r5 = (float) r5     // Catch:{ ItemFoundInScroll -> 0x01cb }
            float r3 = r3 + r5
            androidx.compose.foundation.lazy.grid.LazyGridState r5 = r10.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01cb }
            int r5 = r5.mo4314f()     // Catch:{ ItemFoundInScroll -> 0x01cb }
            float r5 = (float) r5     // Catch:{ ItemFoundInScroll -> 0x01cb }
            float r3 = r3 - r5
            float r5 = java.lang.Math.abs(r3)     // Catch:{ ItemFoundInScroll -> 0x01cb }
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 >= 0) goto L_0x0102
            goto L_0x0107
        L_0x0102:
            if (r0 == 0) goto L_0x0106
            r8 = r14
            goto L_0x0108
        L_0x0106:
            float r3 = -r14
        L_0x0107:
            r8 = r3
        L_0x0108:
            T r3 = r12.element     // Catch:{ ItemFoundInScroll -> 0x01cb }
            androidx.compose.animation.core.f r3 = (androidx.compose.animation.core.C0424f) r3     // Catch:{ ItemFoundInScroll -> 0x01cb }
            androidx.compose.animation.core.f r3 = androidx.activity.C0114h.m288S(r3)     // Catch:{ ItemFoundInScroll -> 0x01cb }
            r12.element = r3     // Catch:{ ItemFoundInScroll -> 0x01cb }
            kotlin.jvm.internal.Ref$FloatRef r3 = new kotlin.jvm.internal.Ref$FloatRef     // Catch:{ ItemFoundInScroll -> 0x01cb }
            r3.<init>()     // Catch:{ ItemFoundInScroll -> 0x01cb }
            T r5 = r12.element     // Catch:{ ItemFoundInScroll -> 0x01cb }
            androidx.compose.animation.core.f r5 = (androidx.compose.animation.core.C0424f) r5     // Catch:{ ItemFoundInScroll -> 0x01cb }
            java.lang.Float r7 = new java.lang.Float     // Catch:{ ItemFoundInScroll -> 0x01cb }
            r7.<init>(r8)     // Catch:{ ItemFoundInScroll -> 0x01cb }
            r19 = 0
            T r6 = r12.element     // Catch:{ ItemFoundInScroll -> 0x01cb }
            androidx.compose.animation.core.f r6 = (androidx.compose.animation.core.C0424f) r6     // Catch:{ ItemFoundInScroll -> 0x01cb }
            java.lang.Object r6 = r6.mo3484d()     // Catch:{ ItemFoundInScroll -> 0x01cb }
            java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ ItemFoundInScroll -> 0x01cb }
            float r6 = r6.floatValue()     // Catch:{ ItemFoundInScroll -> 0x01cb }
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0136
            r6 = 1
            goto L_0x0137
        L_0x0136:
            r6 = 0
        L_0x0137:
            if (r6 != 0) goto L_0x013b
            r6 = 1
            goto L_0x013c
        L_0x013b:
            r6 = 0
        L_0x013c:
            androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3$2 r20 = new androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3$2     // Catch:{ ItemFoundInScroll -> 0x01cb }
            if (r0 == 0) goto L_0x0143
            r16 = 1
            goto L_0x0145
        L_0x0143:
            r16 = 0
        L_0x0145:
            int r4 = r10.$index     // Catch:{ ItemFoundInScroll -> 0x01cb }
            androidx.compose.foundation.lazy.grid.LazyGridState r1 = r10.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01cb }
            r31 = r2
            int r2 = r10.$scrollOffset     // Catch:{ ItemFoundInScroll -> 0x01c5 }
            r21 = r7
            r7 = r20
            r24 = r9
            r9 = r3
            r3 = r10
            r10 = r24
            r25 = r11
            r26 = r12
            r12 = r16
            r27 = r13
            r13 = r15
            r22 = r6
            r6 = r14
            r14 = r27
            r28 = r5
            r5 = r15
            r15 = r4
            r16 = r1
            r17 = r2
            r18 = r26
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ ItemFoundInScroll -> 0x01bf }
            r1 = 2
            r12 = r24
            r3.L$0 = r12     // Catch:{ ItemFoundInScroll -> 0x01bb }
            r8 = r25
            r3.L$1 = r8     // Catch:{ ItemFoundInScroll -> 0x01bb }
            r9 = r26
            r3.L$2 = r9     // Catch:{ ItemFoundInScroll -> 0x01bb }
            r11 = r27
            r3.L$3 = r11     // Catch:{ ItemFoundInScroll -> 0x01bb }
            r3.F$0 = r6     // Catch:{ ItemFoundInScroll -> 0x01bb }
            r3.F$1 = r5     // Catch:{ ItemFoundInScroll -> 0x01bb }
            r3.I$0 = r0     // Catch:{ ItemFoundInScroll -> 0x01bb }
            r2 = 1
            r3.label = r2     // Catch:{ ItemFoundInScroll -> 0x01bb }
            r16 = r28
            r17 = r21
            r18 = r19
            r19 = r22
            r21 = r3
            r22 = r1
            java.lang.Object r1 = androidx.compose.animation.core.SuspendAnimationKt.m1074e(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ ItemFoundInScroll -> 0x01bb }
            r2 = r31
            if (r1 != r2) goto L_0x01a1
            return r2
        L_0x01a1:
            r10 = r3
            r15 = r5
            r14 = r6
            r13 = r11
            r11 = r8
            r29 = r12
            r12 = r9
            r9 = r29
        L_0x01ab:
            int r1 = r13.element     // Catch:{ ItemFoundInScroll -> 0x01b8 }
            r3 = 1
            int r1 = r1 + r3
            r13.element = r1     // Catch:{ ItemFoundInScroll -> 0x01b8 }
            r1 = r30
            r3 = 2
            r4 = 0
            r6 = 1
            goto L_0x00a7
        L_0x01b8:
            r0 = move-exception
            r12 = r9
            goto L_0x01dc
        L_0x01bb:
            r0 = move-exception
            r2 = r31
            goto L_0x01cd
        L_0x01bf:
            r0 = move-exception
            r2 = r31
            r12 = r24
            goto L_0x01cd
        L_0x01c5:
            r0 = move-exception
            r2 = r31
        L_0x01c8:
            r12 = r9
            r3 = r10
            goto L_0x01cd
        L_0x01cb:
            r0 = move-exception
            goto L_0x01c8
        L_0x01cd:
            r10 = r3
            goto L_0x01dc
        L_0x01cf:
            androidx.compose.foundation.lazy.grid.ItemFoundInScroll r0 = new androidx.compose.foundation.lazy.grid.ItemFoundInScroll     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            T r1 = r9.element     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            androidx.compose.animation.core.f r1 = (androidx.compose.animation.core.C0424f) r1     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            r0.<init>(r10, r1)     // Catch:{ ItemFoundInScroll -> 0x01d9 }
            throw r0     // Catch:{ ItemFoundInScroll -> 0x01d9 }
        L_0x01d9:
            r0 = move-exception
            r10 = r30
        L_0x01dc:
            androidx.compose.animation.core.f r1 = r0.getPreviousAnimation()
            androidx.compose.animation.core.f r3 = androidx.activity.C0114h.m288S(r1)
            androidx.compose.foundation.lazy.grid.g r0 = r0.getItem()
            long r0 = r0.mo4342d()
            int r0 = p174m0.C7287g.m13992b(r0)
            int r1 = r10.$scrollOffset
            int r0 = r0 + r1
            float r0 = (float) r0
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r0)
            r5 = 0
            java.lang.Object r6 = r3.mo3484d()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0212
            r6 = 1
            r23 = 1
            goto L_0x0215
        L_0x0212:
            r6 = 1
            r23 = 0
        L_0x0215:
            r6 = r23 ^ 1
            androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3$4 r7 = new androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3$4
            r7.<init>(r0, r1, r12)
            r9 = 2
            r0 = 0
            r10.L$0 = r0
            r10.L$1 = r0
            r10.L$2 = r0
            r10.L$3 = r0
            r1 = 2
            r10.label = r1
            r8 = r10
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.m1074e(r3, r4, r5, r6, r7, r8, r9)
            if (r0 != r2) goto L_0x0231
            return r2
        L_0x0231:
            androidx.compose.foundation.lazy.grid.LazyGridState r0 = r10.$this_doSmoothScrollToItem
            int r1 = r10.$index
            int r2 = r10.$scrollOffset
            r0.mo4316h(r1, r2)
        L_0x023a:
            kotlin.m r0 = kotlin.C19394m.f43287a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
