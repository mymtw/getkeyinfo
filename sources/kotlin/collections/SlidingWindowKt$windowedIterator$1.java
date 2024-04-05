package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.C19433i;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", mo70541f = "SlidingWindow.kt", mo70542l = {34, 40, 49, 55, 58}, mo70543m = "invokeSuspend")
final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements C19861p<C19433i<? super List<Object>>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Iterator<Object> $iterator;
    public final /* synthetic */ boolean $partialWindows;
    public final /* synthetic */ boolean $reuseBuffer;
    public final /* synthetic */ int $size;
    public final /* synthetic */ int $step;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SlidingWindowKt$windowedIterator$1(int i, int i2, Iterator<Object> it, boolean z, boolean z2, C19340c<? super SlidingWindowKt$windowedIterator$1> cVar) {
        super(2, cVar);
        this.$size = i;
        this.$step = i2;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, cVar);
        slidingWindowKt$windowedIterator$1.L$0 = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    public final Object invoke(C19433i<? super List<Object>> iVar, C19340c<? super C19394m> cVar) {
        return ((SlidingWindowKt$windowedIterator$1) create(iVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00da A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x00b9 A[SYNTHETIC] */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 3
            r6 = 4
            r7 = 5
            r8 = 0
            r9 = 1
            if (r2 == 0) goto L_0x005b
            if (r2 == r9) goto L_0x0047
            if (r2 == r4) goto L_0x0042
            if (r2 == r5) goto L_0x0030
            if (r2 == r6) goto L_0x0022
            if (r2 != r7) goto L_0x001a
            goto L_0x0042
        L_0x001a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0022:
            java.lang.Object r2 = r0.L$1
            kotlin.collections.c0 r2 = (kotlin.collections.C19308c0) r2
            java.lang.Object r4 = r0.L$0
            kotlin.sequences.i r4 = (kotlin.sequences.C19433i) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r18)
            r11 = r0
            goto L_0x0198
        L_0x0030:
            java.lang.Object r2 = r0.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.L$1
            kotlin.collections.c0 r4 = (kotlin.collections.C19308c0) r4
            java.lang.Object r10 = r0.L$0
            kotlin.sequences.i r10 = (kotlin.sequences.C19433i) r10
            androidx.compose.foundation.layout.C0761x.m1684O0(r18)
            r11 = r0
            goto L_0x0163
        L_0x0042:
            androidx.compose.foundation.layout.C0761x.m1684O0(r18)
            goto L_0x01b4
        L_0x0047:
            int r2 = r0.I$0
            java.lang.Object r5 = r0.L$2
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.L$1
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r7 = r0.L$0
            kotlin.sequences.i r7 = (kotlin.sequences.C19433i) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r18)
            r12 = r2
            r2 = r0
            goto L_0x00a8
        L_0x005b:
            androidx.compose.foundation.layout.C0761x.m1684O0(r18)
            java.lang.Object r2 = r0.L$0
            kotlin.sequences.i r2 = (kotlin.sequences.C19433i) r2
            int r10 = r0.$size
            r11 = 1024(0x400, float:1.435E-42)
            if (r10 <= r11) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r11 = r10
        L_0x006a:
            int r12 = r0.$step
            int r12 = r12 - r10
            if (r12 < 0) goto L_0x00db
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r11)
            java.util.Iterator<java.lang.Object> r6 = r0.$iterator
            r7 = r2
            r2 = r0
            r16 = r6
            r6 = r5
            r5 = r16
        L_0x007d:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x00b9
            java.lang.Object r10 = r5.next()
            if (r8 <= 0) goto L_0x008c
            int r8 = r8 + -1
            goto L_0x007d
        L_0x008c:
            r6.add(r10)
            int r10 = r6.size()
            int r11 = r2.$size
            if (r10 != r11) goto L_0x007d
            r2.L$0 = r7
            r2.L$1 = r6
            r2.L$2 = r5
            r2.I$0 = r12
            r2.label = r9
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = r7.mo72006a(r6, r2)
            if (r8 != r1) goto L_0x00a8
            return r1
        L_0x00a8:
            boolean r8 = r2.$reuseBuffer
            if (r8 == 0) goto L_0x00b0
            r6.clear()
            goto L_0x00b7
        L_0x00b0:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r8 = r2.$size
            r6.<init>(r8)
        L_0x00b7:
            r8 = r12
            goto L_0x007d
        L_0x00b9:
            boolean r5 = r6.isEmpty()
            r5 = r5 ^ r9
            if (r5 == 0) goto L_0x01b4
            boolean r5 = r2.$partialWindows
            if (r5 != 0) goto L_0x00cc
            int r5 = r6.size()
            int r8 = r2.$size
            if (r5 != r8) goto L_0x01b4
        L_0x00cc:
            r2.L$0 = r3
            r2.L$1 = r3
            r2.L$2 = r3
            r2.label = r4
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = r7.mo72006a(r6, r2)
            if (r2 != r1) goto L_0x01b4
            return r1
        L_0x00db:
            kotlin.collections.c0 r4 = new kotlin.collections.c0
            java.lang.Object[] r10 = new java.lang.Object[r11]
            r4.<init>(r10, r8)
            java.util.Iterator<java.lang.Object> r10 = r0.$iterator
            r11 = r0
            r16 = r10
            r10 = r2
            r2 = r16
        L_0x00ea:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x0172
            java.lang.Object r12 = r2.next()
            int r13 = r4.mo5763a()
            int r14 = r4.f43175c
            if (r13 != r14) goto L_0x00fe
            r13 = r9
            goto L_0x00ff
        L_0x00fe:
            r13 = r8
        L_0x00ff:
            if (r13 != 0) goto L_0x016a
            java.lang.Object[] r13 = r4.f43174b
            int r15 = r4.f43176d
            int r8 = r4.f43177e
            int r15 = r15 + r8
            int r15 = r15 % r14
            r13[r15] = r12
            int r8 = r8 + 1
            r4.f43177e = r8
            int r8 = r4.mo5763a()
            int r12 = r4.f43175c
            if (r8 != r12) goto L_0x0119
            r8 = r9
            goto L_0x011a
        L_0x0119:
            r8 = 0
        L_0x011a:
            if (r8 == 0) goto L_0x0168
            int r8 = r4.f43177e
            int r13 = r11.$size
            if (r8 >= r13) goto L_0x0149
            int r8 = r12 >> 1
            int r12 = r12 + r8
            int r12 = r12 + r9
            if (r12 <= r13) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r13 = r12
        L_0x012a:
            int r8 = r4.f43176d
            if (r8 != 0) goto L_0x013a
            java.lang.Object[] r8 = r4.f43174b
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r13)
            java.lang.String r12 = "copyOf(this, newSize)"
            kotlin.jvm.internal.C19383o.m32796f(r8, r12)
            goto L_0x0140
        L_0x013a:
            java.lang.Object[] r8 = new java.lang.Object[r13]
            java.lang.Object[] r8 = r4.toArray(r8)
        L_0x0140:
            kotlin.collections.c0 r12 = new kotlin.collections.c0
            int r4 = r4.f43177e
            r12.<init>(r8, r4)
            r4 = r12
            goto L_0x0168
        L_0x0149:
            boolean r8 = r11.$reuseBuffer
            if (r8 == 0) goto L_0x014f
            r8 = r4
            goto L_0x0154
        L_0x014f:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r4)
        L_0x0154:
            r11.L$0 = r10
            r11.L$1 = r4
            r11.L$2 = r2
            r11.label = r5
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = r10.mo72006a(r8, r11)
            if (r8 != r1) goto L_0x0163
            return r1
        L_0x0163:
            int r8 = r11.$step
            r4.mo71717c(r8)
        L_0x0168:
            r8 = 0
            goto L_0x00ea
        L_0x016a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "ring buffer is full"
            r1.<init>(r2)
            throw r1
        L_0x0172:
            boolean r2 = r11.$partialWindows
            if (r2 == 0) goto L_0x01b4
            r2 = r4
            r4 = r10
        L_0x0178:
            int r5 = r2.f43177e
            int r8 = r11.$step
            if (r5 <= r8) goto L_0x019e
            boolean r5 = r11.$reuseBuffer
            if (r5 == 0) goto L_0x0184
            r5 = r2
            goto L_0x0189
        L_0x0184:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
        L_0x0189:
            r11.L$0 = r4
            r11.L$1 = r2
            r11.L$2 = r3
            r11.label = r6
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = r4.mo72006a(r5, r11)
            if (r5 != r1) goto L_0x0198
            return r1
        L_0x0198:
            int r5 = r11.$step
            r2.mo71717c(r5)
            goto L_0x0178
        L_0x019e:
            boolean r5 = r2.isEmpty()
            r5 = r5 ^ r9
            if (r5 == 0) goto L_0x01b4
            r11.L$0 = r3
            r11.L$1 = r3
            r11.L$2 = r3
            r11.label = r7
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = r4.mo72006a(r2, r11)
            if (r2 != r1) goto L_0x01b4
            return r1
        L_0x01b4:
            kotlin.m r1 = kotlin.C19394m.f43287a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt$windowedIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
