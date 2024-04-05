package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C19624a;
import kotlinx.coroutines.flow.internal.C19625b;
import kotlinx.coroutines.flow.internal.C19629f;
import kotlinx.coroutines.flow.internal.C19634k;
import p772tq.C20203a;

public final class StateFlowImpl<T> extends C19624a<C19692y1> implements C19656n1<T>, C19597d, C19634k<T> {
    private volatile /* synthetic */ Object _state;

    /* renamed from: f */
    public int f43559f;

    public StateFlowImpl(Object obj) {
        this._state = obj;
    }

    /* renamed from: a */
    public final boolean mo72331a(T t) {
        setValue(t);
        return true;
    }

    /* renamed from: b */
    public final C19597d<T> mo72332b(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return ((((i >= 0 && i < 2) || i == -2) && bufferOverflow == BufferOverflow.DROP_OLDEST) || ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND)) ? this : new C19629f(i, coroutineContext, bufferOverflow, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: kotlinx.coroutines.flow.y1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: kotlinx.coroutines.flow.StateFlowImpl} */
    /* JADX WARNING: type inference failed for: r2v11, types: [kotlin.coroutines.CoroutineContext$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae A[Catch:{ all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00af A[Catch:{ all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c1 A[Catch:{ all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c3 A[Catch:{ all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d6 A[Catch:{ all -> 0x0077 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d7 A[Catch:{ all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ec A[Catch:{ all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ee A[Catch:{ all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f2 A[Catch:{ all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(kotlinx.coroutines.flow.C19600e<? super T> r18, kotlin.coroutines.C19340c<?> r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            boolean r3 = r2 instanceof kotlinx.coroutines.flow.StateFlowImpl$collect$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r3 = (kotlinx.coroutines.flow.StateFlowImpl$collect$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r3 = new kotlinx.coroutines.flow.StateFlowImpl$collect$1
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.label
            r6 = 1
            r7 = 2
            r8 = 3
            r9 = 0
            if (r5 == 0) goto L_0x007a
            if (r5 == r6) goto L_0x0065
            if (r5 == r7) goto L_0x004e
            if (r5 != r8) goto L_0x0046
            java.lang.Object r0 = r3.L$4
            java.lang.Object r5 = r3.L$3
            kotlinx.coroutines.g1 r5 = (kotlinx.coroutines.C19699g1) r5
            java.lang.Object r10 = r3.L$2
            kotlinx.coroutines.flow.y1 r10 = (kotlinx.coroutines.flow.C19692y1) r10
            java.lang.Object r11 = r3.L$1
            kotlinx.coroutines.flow.e r11 = (kotlinx.coroutines.flow.C19600e) r11
            java.lang.Object r12 = r3.L$0
            kotlinx.coroutines.flow.StateFlowImpl r12 = (kotlinx.coroutines.flow.StateFlowImpl) r12
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)     // Catch:{ all -> 0x0077 }
            goto L_0x00aa
        L_0x0046:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004e:
            java.lang.Object r0 = r3.L$4
            java.lang.Object r5 = r3.L$3
            kotlinx.coroutines.g1 r5 = (kotlinx.coroutines.C19699g1) r5
            java.lang.Object r10 = r3.L$2
            kotlinx.coroutines.flow.y1 r10 = (kotlinx.coroutines.flow.C19692y1) r10
            java.lang.Object r11 = r3.L$1
            kotlinx.coroutines.flow.e r11 = (kotlinx.coroutines.flow.C19600e) r11
            java.lang.Object r12 = r3.L$0
            kotlinx.coroutines.flow.StateFlowImpl r12 = (kotlinx.coroutines.flow.StateFlowImpl) r12
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)     // Catch:{ all -> 0x0077 }
            goto L_0x00d8
        L_0x0065:
            java.lang.Object r0 = r3.L$2
            r10 = r0
            kotlinx.coroutines.flow.y1 r10 = (kotlinx.coroutines.flow.C19692y1) r10
            java.lang.Object r0 = r3.L$1
            kotlinx.coroutines.flow.e r0 = (kotlinx.coroutines.flow.C19600e) r0
            java.lang.Object r5 = r3.L$0
            r12 = r5
            kotlinx.coroutines.flow.StateFlowImpl r12 = (kotlinx.coroutines.flow.StateFlowImpl) r12
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)     // Catch:{ all -> 0x0077 }
            goto L_0x009b
        L_0x0077:
            r0 = move-exception
            goto L_0x0138
        L_0x007a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            kotlinx.coroutines.flow.internal.b r2 = r17.mo72369c()
            kotlinx.coroutines.flow.y1 r2 = (kotlinx.coroutines.flow.C19692y1) r2
            boolean r5 = r0 instanceof kotlinx.coroutines.flow.C19695z1     // Catch:{ all -> 0x013a }
            if (r5 == 0) goto L_0x0099
            r5 = r0
            kotlinx.coroutines.flow.z1 r5 = (kotlinx.coroutines.flow.C19695z1) r5     // Catch:{ all -> 0x013a }
            r3.L$0 = r1     // Catch:{ all -> 0x013a }
            r3.L$1 = r0     // Catch:{ all -> 0x013a }
            r3.L$2 = r2     // Catch:{ all -> 0x013a }
            r3.label = r6     // Catch:{ all -> 0x013a }
            kotlin.m r5 = r5.mo72389b(r3)     // Catch:{ all -> 0x013a }
            if (r5 != r4) goto L_0x0099
            return r4
        L_0x0099:
            r12 = r1
            r10 = r2
        L_0x009b:
            kotlin.coroutines.CoroutineContext r2 = r3.getContext()     // Catch:{ all -> 0x0077 }
            kotlinx.coroutines.g1$b r5 = kotlinx.coroutines.C19699g1.C19701b.f43635b     // Catch:{ all -> 0x0077 }
            kotlin.coroutines.CoroutineContext$a r2 = r2.get(r5)     // Catch:{ all -> 0x0077 }
            r5 = r2
            kotlinx.coroutines.g1 r5 = (kotlinx.coroutines.C19699g1) r5     // Catch:{ all -> 0x0077 }
            r11 = r0
            r0 = r9
        L_0x00aa:
            java.lang.Object r2 = r12._state     // Catch:{ all -> 0x0077 }
            if (r5 != 0) goto L_0x00af
            goto L_0x00b5
        L_0x00af:
            boolean r13 = r5.isActive()     // Catch:{ all -> 0x0077 }
            if (r13 == 0) goto L_0x0133
        L_0x00b5:
            if (r0 == 0) goto L_0x00bd
            boolean r13 = kotlin.jvm.internal.C19383o.m32792b(r0, r2)     // Catch:{ all -> 0x0077 }
            if (r13 != 0) goto L_0x00d8
        L_0x00bd:
            kotlinx.coroutines.internal.t r0 = p772tq.C20203a.f44778h     // Catch:{ all -> 0x0077 }
            if (r2 != r0) goto L_0x00c3
            r0 = r9
            goto L_0x00c4
        L_0x00c3:
            r0 = r2
        L_0x00c4:
            r3.L$0 = r12     // Catch:{ all -> 0x0077 }
            r3.L$1 = r11     // Catch:{ all -> 0x0077 }
            r3.L$2 = r10     // Catch:{ all -> 0x0077 }
            r3.L$3 = r5     // Catch:{ all -> 0x0077 }
            r3.L$4 = r2     // Catch:{ all -> 0x0077 }
            r3.label = r7     // Catch:{ all -> 0x0077 }
            java.lang.Object r0 = r11.emit(r0, r3)     // Catch:{ all -> 0x0077 }
            if (r0 != r4) goto L_0x00d7
            return r4
        L_0x00d7:
            r0 = r2
        L_0x00d8:
            r10.getClass()     // Catch:{ all -> 0x0077 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.flow.C19692y1.f43632a     // Catch:{ all -> 0x0077 }
            kotlinx.coroutines.internal.t r13 = kotlin.jvm.internal.C19388s.f43279j     // Catch:{ all -> 0x0077 }
            java.lang.Object r14 = r2.getAndSet(r10, r13)     // Catch:{ all -> 0x0077 }
            kotlin.jvm.internal.C19383o.m32794d(r14)     // Catch:{ all -> 0x0077 }
            kotlinx.coroutines.internal.t r15 = kotlin.jvm.internal.C19388s.f43280k     // Catch:{ all -> 0x0077 }
            r16 = 0
            if (r14 != r15) goto L_0x00ee
            r14 = r6
            goto L_0x00f0
        L_0x00ee:
            r14 = r16
        L_0x00f0:
            if (r14 != 0) goto L_0x00aa
            r3.L$0 = r12     // Catch:{ all -> 0x0077 }
            r3.L$1 = r11     // Catch:{ all -> 0x0077 }
            r3.L$2 = r10     // Catch:{ all -> 0x0077 }
            r3.L$3 = r5     // Catch:{ all -> 0x0077 }
            r3.L$4 = r0     // Catch:{ all -> 0x0077 }
            r3.label = r8     // Catch:{ all -> 0x0077 }
            kotlinx.coroutines.l r14 = new kotlinx.coroutines.l     // Catch:{ all -> 0x0077 }
            kotlin.coroutines.c r15 = kotlin.jvm.internal.C19388s.m32873m0(r3)     // Catch:{ all -> 0x0077 }
            r14.<init>(r6, r15)     // Catch:{ all -> 0x0077 }
            r14.mo72548n()     // Catch:{ all -> 0x0077 }
        L_0x010a:
            boolean r15 = r2.compareAndSet(r10, r13, r14)     // Catch:{ all -> 0x0077 }
            if (r15 == 0) goto L_0x0113
            r16 = r6
            goto L_0x0119
        L_0x0113:
            java.lang.Object r15 = r2.get(r10)     // Catch:{ all -> 0x0077 }
            if (r15 == r13) goto L_0x010a
        L_0x0119:
            if (r16 == 0) goto L_0x011c
            goto L_0x0125
        L_0x011c:
            kotlin.m r2 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0077 }
            java.lang.Object r2 = kotlin.Result.m35480constructorimpl(r2)     // Catch:{ all -> 0x0077 }
            r14.resumeWith(r2)     // Catch:{ all -> 0x0077 }
        L_0x0125:
            java.lang.Object r2 = r14.mo72547l()     // Catch:{ all -> 0x0077 }
            kotlin.coroutines.intrinsics.CoroutineSingletons r13 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED     // Catch:{ all -> 0x0077 }
            if (r2 != r13) goto L_0x012e
            goto L_0x0130
        L_0x012e:
            kotlin.m r2 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0077 }
        L_0x0130:
            if (r2 != r4) goto L_0x00aa
            return r4
        L_0x0133:
            java.util.concurrent.CancellationException r0 = r5.mo72398h()     // Catch:{ all -> 0x0077 }
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x0138:
            r2 = r10
            goto L_0x013c
        L_0x013a:
            r0 = move-exception
            r12 = r1
        L_0x013c:
            r12.mo72371h(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(kotlinx.coroutines.flow.e, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: e */
    public final void mo72333e() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public final Object emit(T t, C19340c<? super C19394m> cVar) {
        setValue(t);
        return C19394m.f43287a;
    }

    /* renamed from: f */
    public final C19625b mo72334f() {
        return new C19692y1();
    }

    /* renamed from: g */
    public final C19625b[] mo72335g() {
        return new C19692y1[2];
    }

    public final T getValue() {
        T t = C20203a.f44778h;
        T t2 = this._state;
        if (t2 == t) {
            return null;
        }
        return t2;
    }

    /* renamed from: i */
    public final boolean mo72337i(T t, T t2) {
        if (t == null) {
            t = C20203a.f44778h;
        }
        if (t2 == null) {
            t2 = C20203a.f44778h;
        }
        return mo72338j(t, t2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
        r12 = (kotlinx.coroutines.flow.C19692y1[]) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0029, code lost:
        if (r12 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002c, code lost:
        r2 = r12.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002e, code lost:
        if (r3 >= r2) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0030, code lost:
        r4 = r12[r3];
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0034, code lost:
        if (r4 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0037, code lost:
        r5 = r4._state;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0039, code lost:
        if (r5 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003c, code lost:
        r6 = kotlin.jvm.internal.C19388s.f43280k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003e, code lost:
        if (r5 != r6) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        r7 = kotlin.jvm.internal.C19388s.f43279j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0043, code lost:
        if (r5 != r7) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        r8 = kotlinx.coroutines.flow.C19692y1.f43632a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004b, code lost:
        if (r8.compareAndSet(r4, r5, r6) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004d, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0053, code lost:
        if (r8.get(r4) == r5) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0055, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0056, code lost:
        if (r5 == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0059, code lost:
        r6 = kotlinx.coroutines.flow.C19692y1.f43632a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005f, code lost:
        if (r6.compareAndSet(r4, r5, r7) == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0061, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0067, code lost:
        if (r6.get(r4) == r5) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0069, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006a, code lost:
        if (r6 == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x006c, code lost:
        ((kotlinx.coroutines.C19753l) r5).resumeWith(kotlin.Result.m35480constructorimpl(kotlin.C19394m.f43287a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0078, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r12 = r10.f43559f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007b, code lost:
        if (r12 != r11) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x007d, code lost:
        r10.f43559f = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0080, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0081, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r11 = r10.f43587b;
        r2 = kotlin.C19394m.f43287a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0086, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0087, code lost:
        r9 = r12;
        r12 = r11;
        r11 = r9;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo72338j(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.Object r0 = r10._state     // Catch:{ all -> 0x0094 }
            r1 = 0
            if (r11 == 0) goto L_0x000e
            boolean r11 = kotlin.jvm.internal.C19383o.m32792b(r0, r11)     // Catch:{ all -> 0x0094 }
            if (r11 != 0) goto L_0x000e
            monitor-exit(r10)
            return r1
        L_0x000e:
            boolean r11 = kotlin.jvm.internal.C19383o.m32792b(r0, r12)     // Catch:{ all -> 0x0094 }
            r0 = 1
            if (r11 == 0) goto L_0x0017
            monitor-exit(r10)
            return r0
        L_0x0017:
            r10._state = r12     // Catch:{ all -> 0x0094 }
            int r11 = r10.f43559f     // Catch:{ all -> 0x0094 }
            r12 = r11 & 1
            if (r12 != 0) goto L_0x008e
            int r11 = r11 + r0
            r10.f43559f = r11     // Catch:{ all -> 0x0094 }
            S[] r12 = r10.f43587b     // Catch:{ all -> 0x0094 }
            kotlin.m r2 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0094 }
            monitor-exit(r10)
        L_0x0027:
            kotlinx.coroutines.flow.y1[] r12 = (kotlinx.coroutines.flow.C19692y1[]) r12
            if (r12 != 0) goto L_0x002c
            goto L_0x0078
        L_0x002c:
            int r2 = r12.length
            r3 = r1
        L_0x002e:
            if (r3 >= r2) goto L_0x0078
            r4 = r12[r3]
            int r3 = r3 + 1
            if (r4 != 0) goto L_0x0037
            goto L_0x002e
        L_0x0037:
            java.lang.Object r5 = r4._state
            if (r5 != 0) goto L_0x003c
            goto L_0x002e
        L_0x003c:
            kotlinx.coroutines.internal.t r6 = kotlin.jvm.internal.C19388s.f43280k
            if (r5 != r6) goto L_0x0041
            goto L_0x002e
        L_0x0041:
            kotlinx.coroutines.internal.t r7 = kotlin.jvm.internal.C19388s.f43279j
            if (r5 != r7) goto L_0x0059
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = kotlinx.coroutines.flow.C19692y1.f43632a
        L_0x0047:
            boolean r7 = r8.compareAndSet(r4, r5, r6)
            if (r7 == 0) goto L_0x004f
            r5 = r0
            goto L_0x0056
        L_0x004f:
            java.lang.Object r7 = r8.get(r4)
            if (r7 == r5) goto L_0x0047
            r5 = r1
        L_0x0056:
            if (r5 == 0) goto L_0x0037
            goto L_0x002e
        L_0x0059:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.flow.C19692y1.f43632a
        L_0x005b:
            boolean r8 = r6.compareAndSet(r4, r5, r7)
            if (r8 == 0) goto L_0x0063
            r6 = r0
            goto L_0x006a
        L_0x0063:
            java.lang.Object r8 = r6.get(r4)
            if (r8 == r5) goto L_0x005b
            r6 = r1
        L_0x006a:
            if (r6 == 0) goto L_0x0037
            kotlinx.coroutines.l r5 = (kotlinx.coroutines.C19753l) r5
            kotlin.m r4 = kotlin.C19394m.f43287a
            java.lang.Object r4 = kotlin.Result.m35480constructorimpl(r4)
            r5.resumeWith(r4)
            goto L_0x002e
        L_0x0078:
            monitor-enter(r10)
            int r12 = r10.f43559f     // Catch:{ all -> 0x008b }
            if (r12 != r11) goto L_0x0082
            int r11 = r11 + r0
            r10.f43559f = r11     // Catch:{ all -> 0x008b }
            monitor-exit(r10)
            return r0
        L_0x0082:
            S[] r11 = r10.f43587b     // Catch:{ all -> 0x008b }
            kotlin.m r2 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x008b }
            monitor-exit(r10)
            r9 = r12
            r12 = r11
            r11 = r9
            goto L_0x0027
        L_0x008b:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L_0x008e:
            int r11 = r11 + 2
            r10.f43559f = r11     // Catch:{ all -> 0x0094 }
            monitor-exit(r10)
            return r0
        L_0x0094:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.mo72338j(java.lang.Object, java.lang.Object):boolean");
    }

    public final void setValue(T t) {
        if (t == null) {
            t = C20203a.f44778h;
        }
        mo72338j((Object) null, t);
    }
}
