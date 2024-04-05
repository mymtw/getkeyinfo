package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.C0614l;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3", mo70541f = "LazyListScrolling.kt", mo70542l = {114, 205}, mo70543m = "invokeSuspend")
final class LazyListScrollingKt$doSmoothScrollToItem$3 extends SuspendLambda implements C19861p<C0614l, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ int $scrollOffset;
    public final /* synthetic */ LazyListState $this_doSmoothScrollToItem;
    public float F$0;
    public float F$1;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListScrollingKt$doSmoothScrollToItem$3(LazyListState lazyListState, int i, int i2, C19340c<? super LazyListScrollingKt$doSmoothScrollToItem$3> cVar) {
        super(2, cVar);
        this.$this_doSmoothScrollToItem = lazyListState;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    public static final boolean access$invokeSuspend$isOvershot(boolean z, LazyListState lazyListState, int i, int i2) {
        if (z) {
            if (lazyListState.mo4224e() <= i && (lazyListState.mo4224e() != i || lazyListState.mo4225f() <= i2)) {
                return false;
            }
        } else if (lazyListState.mo4224e() >= i && (lazyListState.mo4224e() != i || lazyListState.mo4225f() >= i2)) {
            return false;
        }
        return true;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        LazyListScrollingKt$doSmoothScrollToItem$3 lazyListScrollingKt$doSmoothScrollToItem$3 = new LazyListScrollingKt$doSmoothScrollToItem$3(this.$this_doSmoothScrollToItem, this.$index, this.$scrollOffset, cVar);
        lazyListScrollingKt$doSmoothScrollToItem$3.L$0 = obj;
        return lazyListScrollingKt$doSmoothScrollToItem$3;
    }

    public final Object invoke(C0614l lVar, C19340c<? super C19394m> cVar) {
        return ((LazyListScrollingKt$doSmoothScrollToItem$3) create(lVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: androidx.compose.foundation.gestures.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ca A[SYNTHETIC, Splitter:B:31:0x00ca] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ff A[Catch:{ ItemFoundInScroll -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100 A[Catch:{ ItemFoundInScroll -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0134 A[Catch:{ ItemFoundInScroll -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0136 A[Catch:{ ItemFoundInScroll -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0139 A[Catch:{ ItemFoundInScroll -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013b A[Catch:{ ItemFoundInScroll -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0140 A[Catch:{ ItemFoundInScroll -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0143 A[Catch:{ ItemFoundInScroll -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0228 A[RETURN] */
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
            goto L_0x0229
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
            goto L_0x01ac
        L_0x003e:
            r0 = move-exception
            r10 = r1
            goto L_0x01d8
        L_0x0042:
            androidx.compose.foundation.layout.C0761x.m1684O0(r31)
            java.lang.Object r0 = r1.L$0
            r12 = r0
            androidx.compose.foundation.gestures.l r12 = (androidx.compose.foundation.gestures.C0614l) r12
            androidx.compose.foundation.lazy.LazyListState r0 = r1.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r0.f1605e     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            m0.b r0 = (p174m0.C7282b) r0     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            float r7 = androidx.compose.foundation.lazy.C0862u.f1851a     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            float r0 = r0.mo3789B0(r7)     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            androidx.compose.foundation.lazy.LazyListState r7 = r1.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            androidx.compose.runtime.ParcelableSnapshotMutableState r7 = r7.f1605e     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            m0.b r7 = (p174m0.C7282b) r7     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            float r8 = androidx.compose.foundation.lazy.C0862u.f1852b     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            float r7 = r7.mo3789B0(r8)     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            r8.<init>()     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            r8.element = r6     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            r9.<init>()     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            r10 = 30
            androidx.compose.animation.core.f r10 = androidx.activity.C0114h.m311p(r4, r4, r10)     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            r9.element = r10     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            androidx.compose.foundation.lazy.LazyListState r10 = r1.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            int r11 = r1.$index     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            androidx.compose.foundation.lazy.j r10 = androidx.compose.foundation.lazy.C0862u.m1918a(r10, r11)     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            if (r10 != 0) goto L_0x01cb
            int r10 = r1.$index     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            androidx.compose.foundation.lazy.LazyListState r11 = r1.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            int r11 = r11.mo4224e()     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            if (r10 <= r11) goto L_0x0094
            r10 = r6
            goto L_0x0095
        L_0x0094:
            r10 = 0
        L_0x0095:
            kotlin.jvm.internal.Ref$IntRef r11 = new kotlin.jvm.internal.Ref$IntRef     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            r11.<init>()     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            r11.element = r6     // Catch:{ ItemFoundInScroll -> 0x01d5 }
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
            boolean r7 = r11.element     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            if (r7 == 0) goto L_0x0232
            androidx.compose.foundation.lazy.LazyListState r7 = r10.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            androidx.compose.foundation.lazy.m r7 = r7.mo4226g()     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            int r7 = r7.mo4243a()     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            if (r7 <= 0) goto L_0x0232
            androidx.compose.foundation.lazy.LazyListState r7 = r10.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            androidx.compose.foundation.lazy.m r7 = r7.mo4226g()     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            java.util.List r7 = r7.mo4244b()     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            int r8 = r7.size()     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            r5 = 0
            r16 = 0
        L_0x00c8:
            if (r5 >= r8) goto L_0x00d9
            java.lang.Object r17 = r7.get(r5)     // Catch:{ ItemFoundInScroll -> 0x01b9 }
            androidx.compose.foundation.lazy.j r17 = (androidx.compose.foundation.lazy.C0827j) r17     // Catch:{ ItemFoundInScroll -> 0x01b9 }
            int r17 = r17.mo4359a()     // Catch:{ ItemFoundInScroll -> 0x01b9 }
            int r16 = r16 + r17
            int r5 = r5 + 1
            goto L_0x00c8
        L_0x00d9:
            int r5 = r7.size()     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            int r16 = r16 / r5
            int r5 = r10.$index     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            androidx.compose.foundation.lazy.LazyListState r7 = r10.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            int r7 = r7.mo4224e()     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            int r5 = r5 - r7
            int r5 = r5 * r16
            float r5 = (float) r5     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            int r7 = r10.$scrollOffset     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            float r7 = (float) r7     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            float r5 = r5 + r7
            androidx.compose.foundation.lazy.LazyListState r7 = r10.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            int r7 = r7.mo4225f()     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            float r7 = (float) r7     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            float r5 = r5 - r7
            float r7 = java.lang.Math.abs(r5)     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 >= 0) goto L_0x0100
            goto L_0x0105
        L_0x0100:
            if (r0 == 0) goto L_0x0104
            r8 = r14
            goto L_0x0106
        L_0x0104:
            float r5 = -r14
        L_0x0105:
            r8 = r5
        L_0x0106:
            T r5 = r12.element     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            androidx.compose.animation.core.f r5 = (androidx.compose.animation.core.C0424f) r5     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            androidx.compose.animation.core.f r5 = androidx.activity.C0114h.m288S(r5)     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            r12.element = r5     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            kotlin.jvm.internal.Ref$FloatRef r5 = new kotlin.jvm.internal.Ref$FloatRef     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            r5.<init>()     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            T r7 = r12.element     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            r19 = r7
            androidx.compose.animation.core.f r19 = (androidx.compose.animation.core.C0424f) r19     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            java.lang.Float r7 = new java.lang.Float     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            r7.<init>(r8)     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            r20 = 0
            T r3 = r12.element     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            androidx.compose.animation.core.f r3 = (androidx.compose.animation.core.C0424f) r3     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            java.lang.Object r3 = r3.mo3484d()     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            float r3 = r3.floatValue()     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0136
            r3 = r6
            goto L_0x0137
        L_0x0136:
            r3 = 0
        L_0x0137:
            if (r3 != 0) goto L_0x013b
            r3 = r6
            goto L_0x013c
        L_0x013b:
            r3 = 0
        L_0x013c:
            androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3$2 r21 = new androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3$2     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            if (r0 == 0) goto L_0x0143
            r16 = r6
            goto L_0x0145
        L_0x0143:
            r16 = 0
        L_0x0145:
            int r4 = r10.$index     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            androidx.compose.foundation.lazy.LazyListState r6 = r10.$this_doSmoothScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            int r1 = r10.$scrollOffset     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            r22 = r7
            r7 = r21
            r31 = r9
            r9 = r5
            r5 = r10
            r10 = r31
            r24 = r11
            r25 = r12
            r12 = r16
            r26 = r13
            r13 = r15
            r27 = r2
            r2 = r14
            r14 = r26
            r28 = r3
            r3 = r15
            r15 = r4
            r16 = r6
            r17 = r1
            r18 = r25
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ ItemFoundInScroll -> 0x01c0 }
            r1 = 2
            r12 = r31
            r5.L$0 = r12     // Catch:{ ItemFoundInScroll -> 0x01bc }
            r8 = r24
            r5.L$1 = r8     // Catch:{ ItemFoundInScroll -> 0x01bc }
            r9 = r25
            r5.L$2 = r9     // Catch:{ ItemFoundInScroll -> 0x01bc }
            r11 = r26
            r5.L$3 = r11     // Catch:{ ItemFoundInScroll -> 0x01bc }
            r5.F$0 = r2     // Catch:{ ItemFoundInScroll -> 0x01bc }
            r5.F$1 = r3     // Catch:{ ItemFoundInScroll -> 0x01bc }
            r5.I$0 = r0     // Catch:{ ItemFoundInScroll -> 0x01bc }
            r4 = 1
            r5.label = r4     // Catch:{ ItemFoundInScroll -> 0x01bc }
            r16 = r19
            r17 = r22
            r18 = r20
            r19 = r28
            r20 = r21
            r21 = r5
            r22 = r1
            java.lang.Object r1 = androidx.compose.animation.core.SuspendAnimationKt.m1074e(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ ItemFoundInScroll -> 0x01bc }
            r4 = r27
            if (r1 != r4) goto L_0x01a1
            return r4
        L_0x01a1:
            r14 = r2
            r15 = r3
            r2 = r4
            r10 = r5
            r13 = r11
            r11 = r8
            r29 = r12
            r12 = r9
            r9 = r29
        L_0x01ac:
            int r1 = r13.element     // Catch:{ ItemFoundInScroll -> 0x01b9 }
            r3 = 1
            int r1 = r1 + r3
            r13.element = r1     // Catch:{ ItemFoundInScroll -> 0x01b9 }
            r1 = r30
            r3 = 2
            r4 = 0
            r6 = 1
            goto L_0x00a7
        L_0x01b9:
            r0 = move-exception
            r12 = r9
            goto L_0x01d8
        L_0x01bc:
            r0 = move-exception
        L_0x01bd:
            r4 = r27
            goto L_0x01c8
        L_0x01c0:
            r0 = move-exception
            r12 = r31
            goto L_0x01bd
        L_0x01c4:
            r0 = move-exception
            r4 = r2
            r12 = r9
            r5 = r10
        L_0x01c8:
            r2 = r4
            r10 = r5
            goto L_0x01d8
        L_0x01cb:
            androidx.compose.foundation.lazy.ItemFoundInScroll r0 = new androidx.compose.foundation.lazy.ItemFoundInScroll     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            T r1 = r9.element     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            androidx.compose.animation.core.f r1 = (androidx.compose.animation.core.C0424f) r1     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            r0.<init>(r10, r1)     // Catch:{ ItemFoundInScroll -> 0x01d5 }
            throw r0     // Catch:{ ItemFoundInScroll -> 0x01d5 }
        L_0x01d5:
            r0 = move-exception
            r10 = r30
        L_0x01d8:
            androidx.compose.animation.core.f r1 = r0.getPreviousAnimation()
            androidx.compose.animation.core.f r3 = androidx.activity.C0114h.m288S(r1)
            androidx.compose.foundation.lazy.j r0 = r0.getItem()
            int r0 = r0.getOffset()
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
            if (r6 != 0) goto L_0x020a
            r6 = 1
            r23 = 1
            goto L_0x020d
        L_0x020a:
            r6 = 1
            r23 = 0
        L_0x020d:
            r6 = r23 ^ 1
            androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3$4 r7 = new androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3$4
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
            if (r0 != r2) goto L_0x0229
            return r2
        L_0x0229:
            androidx.compose.foundation.lazy.LazyListState r0 = r10.$this_doSmoothScrollToItem
            int r1 = r10.$index
            int r2 = r10.$scrollOffset
            r0.mo4227h(r1, r2)
        L_0x0232:
            kotlin.m r0 = kotlin.C19394m.f43287a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
