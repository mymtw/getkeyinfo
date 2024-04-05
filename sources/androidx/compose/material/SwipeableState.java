package androidx.compose.material;

import androidx.compose.animation.core.C0422e;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DefaultDraggableState;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1333i1;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Map;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;
import p753kq.C19857l;
import p753kq.C19861p;

public class SwipeableState<T> {

    /* renamed from: a */
    public final C0422e<Float> f2278a;

    /* renamed from: b */
    public final C19857l<T, Boolean> f2279b;

    /* renamed from: c */
    public final ParcelableSnapshotMutableState f2280c;

    /* renamed from: d */
    public final ParcelableSnapshotMutableState f2281d = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);

    /* renamed from: e */
    public final ParcelableSnapshotMutableState f2282e;

    /* renamed from: f */
    public final ParcelableSnapshotMutableState f2283f;

    /* renamed from: g */
    public final ParcelableSnapshotMutableState f2284g;

    /* renamed from: h */
    public final ParcelableSnapshotMutableState f2285h;

    /* renamed from: i */
    public final ParcelableSnapshotMutableState f2286i;

    /* renamed from: j */
    public final FlowKt__LimitKt$take$$inlined$unsafeFlow$1 f2287j;

    /* renamed from: k */
    public float f2288k;

    /* renamed from: l */
    public float f2289l;

    /* renamed from: m */
    public final ParcelableSnapshotMutableState f2290m;

    /* renamed from: n */
    public final ParcelableSnapshotMutableState f2291n;

    /* renamed from: o */
    public final ParcelableSnapshotMutableState f2292o;

    /* renamed from: p */
    public final DefaultDraggableState f2293p;

    /* renamed from: androidx.compose.material.SwipeableState$a */
    public static final class C1148a implements C19600e<Map<Float, ? extends T>> {

        /* renamed from: b */
        public final /* synthetic */ SwipeableState<T> f2294b;

        /* renamed from: c */
        public final /* synthetic */ float f2295c;

        public C1148a(SwipeableState<T> swipeableState, float f) {
            this.f2294b = swipeableState;
            this.f2295c = f;
        }

        public final Object emit(Object obj, C19340c cVar) {
            Map map = (Map) obj;
            Float b = C1261v1.m2393b(this.f2294b.mo5116d(), map);
            C19383o.m32794d(b);
            float floatValue = b.floatValue();
            Object obj2 = map.get(new Float(C1261v1.m2392a(((Number) this.f2294b.f2282e.getValue()).floatValue(), floatValue, map.keySet(), (C19861p) this.f2294b.f2290m.getValue(), this.f2295c, ((Number) this.f2294b.f2291n.getValue()).floatValue())));
            if (obj2 == null || !this.f2294b.f2279b.invoke(obj2).booleanValue()) {
                SwipeableState<T> swipeableState = this.f2294b;
                Object a = swipeableState.mo5114a(floatValue, swipeableState.f2278a, cVar);
                return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : C19394m.f43287a;
            }
            Object b2 = SwipeableState.m2243b(this.f2294b, obj2, cVar);
            return b2 == CoroutineSingletons.COROUTINE_SUSPENDED ? b2 : C19394m.f43287a;
        }
    }

    public SwipeableState(T t, C0422e<Float> eVar, C19857l<? super T, Boolean> lVar) {
        C19383o.m32797g(eVar, "animationSpec");
        C19383o.m32797g(lVar, "confirmStateChange");
        this.f2278a = eVar;
        this.f2279b = lVar;
        this.f2280c = C0761x.m1751w0(t, C1351n1.f2948a);
        Float valueOf = Float.valueOf(0.0f);
        this.f2282e = C0761x.m1751w0(valueOf, C1351n1.f2948a);
        this.f2283f = C0761x.m1751w0(valueOf, C1351n1.f2948a);
        this.f2284g = C0761x.m1751w0(valueOf, C1351n1.f2948a);
        this.f2285h = C0761x.m1751w0((Object) null, C1351n1.f2948a);
        this.f2286i = C0761x.m1751w0(C19294b0.m32559p0(), C1351n1.f2948a);
        this.f2287j = new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(new SwipeableState$special$$inlined$filter$1(C1333i1.m2796b(new SwipeableState$latestNonEmptyAnchorsFlow$1(this))));
        this.f2288k = Float.NEGATIVE_INFINITY;
        this.f2289l = Float.POSITIVE_INFINITY;
        this.f2290m = C0761x.m1751w0(SwipeableState$thresholds$2.INSTANCE, C1351n1.f2948a);
        this.f2291n = C0761x.m1751w0(valueOf, C1351n1.f2948a);
        this.f2292o = C0761x.m1751w0((Object) null, C1351n1.f2948a);
        this.f2293p = new DefaultDraggableState(new SwipeableState$draggableState$1(this));
    }

    /* renamed from: b */
    public static Object m2243b(SwipeableState swipeableState, Object obj, C19340c cVar) {
        Object collect = swipeableState.f2287j.collect(new SwipeableState$animateTo$2(obj, swipeableState, swipeableState.f2278a), cVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : C19394m.f43287a;
    }

    /* renamed from: a */
    public final Object mo5114a(float f, C0422e<Float> eVar, C19340c<? super C19394m> cVar) {
        Object b = this.f2293p.mo3733a(MutatePriority.Default, new SwipeableState$animateInternalToOffset$2(this, f, eVar, (C19340c<? super SwipeableState$animateInternalToOffset$2>) null), cVar);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : C19394m.f43287a;
    }

    /* renamed from: c */
    public final Map<Float, T> mo5115c() {
        return (Map) this.f2286i.getValue();
    }

    /* renamed from: d */
    public final T mo5116d() {
        return this.f2280c.getValue();
    }

    /* renamed from: e */
    public final T mo5117e() {
        float f;
        Float f2 = (Float) this.f2285h.getValue();
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            float floatValue = ((Number) this.f2282e.getValue()).floatValue();
            Float b = C1261v1.m2393b(mo5116d(), mo5115c());
            f = C1261v1.m2392a(floatValue, b != null ? b.floatValue() : ((Number) this.f2282e.getValue()).floatValue(), mo5115c().keySet(), (C19861p) this.f2290m.getValue(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t = mo5115c().get(Float.valueOf(f));
        return t == null ? mo5116d() : t;
    }

    /* renamed from: f */
    public final float mo5118f(float f) {
        float L = C19388s.m32831L(((Number) this.f2284g.getValue()).floatValue() + f, this.f2288k, this.f2289l) - ((Number) this.f2284g.getValue()).floatValue();
        if (Math.abs(L) > 0.0f) {
            this.f2293p.f1316a.invoke(Float.valueOf(L));
        }
        return L;
    }

    /* renamed from: g */
    public final Object mo5119g(float f, C19340c<? super C19394m> cVar) {
        Object collect = this.f2287j.collect(new C1148a(this, f), cVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : C19394m.f43287a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:17|18|19|83|84|(1:86)(1:87)|(1:89)(4:90|91|94|95)) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0207 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x021e A[Catch:{ all -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x021f A[Catch:{ all -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0223 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0224  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5120h(java.util.Map<java.lang.Float, ? extends T> r11, java.util.Map<java.lang.Float, ? extends T> r12, kotlin.coroutines.C19340c<? super kotlin.C19394m> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.compose.material.SwipeableState$processNewAnchors$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            androidx.compose.material.SwipeableState$processNewAnchors$1 r0 = (androidx.compose.material.SwipeableState$processNewAnchors$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SwipeableState$processNewAnchors$1 r0 = new androidx.compose.material.SwipeableState$processNewAnchors$1
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x005b
            if (r2 == r5) goto L_0x0057
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            float r11 = r0.F$0
            java.lang.Object r12 = r0.L$1
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r0 = r0.L$0
            androidx.compose.material.SwipeableState r0 = (androidx.compose.material.SwipeableState) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)     // Catch:{ all -> 0x0039 }
            goto L_0x0225
        L_0x0039:
            r13 = move-exception
            goto L_0x0254
        L_0x003c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0044:
            float r11 = r0.F$0
            java.lang.Object r12 = r0.L$1
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.SwipeableState r2 = (androidx.compose.material.SwipeableState) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)     // Catch:{ CancellationException -> 0x0207 }
            goto L_0x01d3
        L_0x0053:
            r13 = move-exception
            r0 = r2
            goto L_0x0254
        L_0x0057:
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
            goto L_0x00a9
        L_0x005b:
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
            boolean r13 = r11.isEmpty()
            if (r13 == 0) goto L_0x00b8
            java.util.Set r11 = r12.keySet()
            java.lang.Float r11 = kotlin.collections.C19327t.m32648d1(r11)
            kotlin.jvm.internal.C19383o.m32794d(r11)
            float r11 = r11.floatValue()
            r10.f2288k = r11
            java.util.Set r11 = r12.keySet()
            java.lang.Float r11 = kotlin.collections.C19327t.m32647c1(r11)
            kotlin.jvm.internal.C19383o.m32794d(r11)
            float r11 = r11.floatValue()
            r10.f2289l = r11
            java.lang.Object r11 = r10.mo5116d()
            java.lang.Float r11 = androidx.compose.material.C1261v1.m2393b(r11, r12)
            if (r11 == 0) goto L_0x00ac
            float r11 = r11.floatValue()
            r0.label = r5
            androidx.compose.foundation.gestures.DefaultDraggableState r12 = r10.f2293p
            androidx.compose.material.SwipeableState$snapInternalToOffset$2 r13 = new androidx.compose.material.SwipeableState$snapInternalToOffset$2
            r13.<init>(r11, r10, r6)
            java.lang.Object r11 = r12.mo3733a(androidx.compose.foundation.MutatePriority.Default, r13, r0)
            if (r11 != r1) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            kotlin.m r11 = kotlin.C19394m.f43287a
        L_0x00a6:
            if (r11 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            kotlin.m r11 = kotlin.C19394m.f43287a
            return r11
        L_0x00ac:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "The initial value must have an associated anchor."
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x00b8:
            boolean r13 = kotlin.jvm.internal.C19383o.m32792b(r12, r11)
            if (r13 != 0) goto L_0x0283
            r13 = -8388608(0xffffffffff800000, float:-Infinity)
            r10.f2288k = r13
            r13 = 2139095040(0x7f800000, float:Infinity)
            r10.f2289l = r13
            androidx.compose.runtime.ParcelableSnapshotMutableState r13 = r10.f2285h
            java.lang.Object r13 = r13.getValue()
            java.lang.Float r13 = (java.lang.Float) r13
            if (r13 == 0) goto L_0x0138
            java.lang.Object r11 = r11.get(r13)
            java.lang.Float r11 = androidx.compose.material.C1261v1.m2393b(r11, r12)
            if (r11 == 0) goto L_0x00e0
            float r11 = r11.floatValue()
            goto L_0x01c1
        L_0x00e0:
            java.util.Set r11 = r12.keySet()
            java.util.Iterator r2 = r11.iterator()
            boolean r11 = r2.hasNext()
            if (r11 != 0) goto L_0x00f0
            r11 = r6
            goto L_0x012d
        L_0x00f0:
            java.lang.Object r11 = r2.next()
            boolean r5 = r2.hasNext()
            if (r5 != 0) goto L_0x00fb
            goto L_0x012d
        L_0x00fb:
            r5 = r11
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r7 = r13.floatValue()
            float r5 = r5 - r7
            float r5 = java.lang.Math.abs(r5)
        L_0x010b:
            java.lang.Object r7 = r2.next()
            r8 = r7
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            float r9 = r13.floatValue()
            float r8 = r8 - r9
            float r8 = java.lang.Math.abs(r8)
            int r9 = java.lang.Float.compare(r5, r8)
            if (r9 <= 0) goto L_0x0127
            r11 = r7
            r5 = r8
        L_0x0127:
            boolean r7 = r2.hasNext()
            if (r7 != 0) goto L_0x010b
        L_0x012d:
            kotlin.jvm.internal.C19383o.m32794d(r11)
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            goto L_0x01c1
        L_0x0138:
            androidx.compose.runtime.ParcelableSnapshotMutableState r13 = r10.f2282e
            java.lang.Object r13 = r13.getValue()
            java.lang.Object r11 = r11.get(r13)
            java.lang.Object r13 = r10.mo5116d()
            boolean r13 = kotlin.jvm.internal.C19383o.m32792b(r11, r13)
            if (r13 == 0) goto L_0x0150
            java.lang.Object r11 = r10.mo5116d()
        L_0x0150:
            java.lang.Float r11 = androidx.compose.material.C1261v1.m2393b(r11, r12)
            if (r11 == 0) goto L_0x015b
            float r11 = r11.floatValue()
            goto L_0x01c1
        L_0x015b:
            java.util.Set r11 = r12.keySet()
            java.util.Iterator r11 = r11.iterator()
            boolean r13 = r11.hasNext()
            if (r13 != 0) goto L_0x016b
            r13 = r6
            goto L_0x01b8
        L_0x016b:
            java.lang.Object r13 = r11.next()
            boolean r2 = r11.hasNext()
            if (r2 != 0) goto L_0x0176
            goto L_0x01b8
        L_0x0176:
            r2 = r13
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            androidx.compose.runtime.ParcelableSnapshotMutableState r5 = r10.f2282e
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
        L_0x018e:
            java.lang.Object r5 = r11.next()
            r7 = r5
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r10.f2282e
            java.lang.Object r8 = r8.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            float r7 = r7 - r8
            float r7 = java.lang.Math.abs(r7)
            int r8 = java.lang.Float.compare(r2, r7)
            if (r8 <= 0) goto L_0x01b2
            r13 = r5
            r2 = r7
        L_0x01b2:
            boolean r5 = r11.hasNext()
            if (r5 != 0) goto L_0x018e
        L_0x01b8:
            kotlin.jvm.internal.C19383o.m32794d(r13)
            java.lang.Number r13 = (java.lang.Number) r13
            float r11 = r13.floatValue()
        L_0x01c1:
            androidx.compose.animation.core.e<java.lang.Float> r13 = r10.f2278a     // Catch:{ CancellationException -> 0x0206, all -> 0x0203 }
            r0.L$0 = r10     // Catch:{ CancellationException -> 0x0206, all -> 0x0203 }
            r0.L$1 = r12     // Catch:{ CancellationException -> 0x0206, all -> 0x0203 }
            r0.F$0 = r11     // Catch:{ CancellationException -> 0x0206, all -> 0x0203 }
            r0.label = r4     // Catch:{ CancellationException -> 0x0206, all -> 0x0203 }
            java.lang.Object r13 = r10.mo5114a(r11, r13, r0)     // Catch:{ CancellationException -> 0x0206, all -> 0x0203 }
            if (r13 != r1) goto L_0x01d2
            return r1
        L_0x01d2:
            r2 = r10
        L_0x01d3:
            java.lang.Float r13 = new java.lang.Float
            r13.<init>(r11)
            java.lang.Object r11 = kotlin.collections.C19294b0.m32560q0(r13, r12)
            r2.mo5121i(r11)
            java.util.Set r11 = r12.keySet()
            java.lang.Float r11 = kotlin.collections.C19327t.m32648d1(r11)
            kotlin.jvm.internal.C19383o.m32794d(r11)
            float r11 = r11.floatValue()
            r2.f2288k = r11
            java.util.Set r11 = r12.keySet()
            java.lang.Float r11 = kotlin.collections.C19327t.m32647c1(r11)
            kotlin.jvm.internal.C19383o.m32794d(r11)
            float r11 = r11.floatValue()
            r2.f2289l = r11
            goto L_0x0283
        L_0x0203:
            r13 = move-exception
            r0 = r10
            goto L_0x0254
        L_0x0206:
            r2 = r10
        L_0x0207:
            r0.L$0 = r2     // Catch:{ all -> 0x0053 }
            r0.L$1 = r12     // Catch:{ all -> 0x0053 }
            r0.F$0 = r11     // Catch:{ all -> 0x0053 }
            r0.label = r3     // Catch:{ all -> 0x0053 }
            androidx.compose.foundation.gestures.DefaultDraggableState r13 = r2.f2293p     // Catch:{ all -> 0x0053 }
            androidx.compose.material.SwipeableState$snapInternalToOffset$2 r3 = new androidx.compose.material.SwipeableState$snapInternalToOffset$2     // Catch:{ all -> 0x0053 }
            r3.<init>(r11, r2, r6)     // Catch:{ all -> 0x0053 }
            java.lang.Object r13 = r13.mo3733a(androidx.compose.foundation.MutatePriority.Default, r3, r0)     // Catch:{ all -> 0x0053 }
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED     // Catch:{ all -> 0x0053 }
            if (r13 != r0) goto L_0x021f
            goto L_0x0221
        L_0x021f:
            kotlin.m r13 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0053 }
        L_0x0221:
            if (r13 != r1) goto L_0x0224
            return r1
        L_0x0224:
            r0 = r2
        L_0x0225:
            java.lang.Float r13 = new java.lang.Float
            r13.<init>(r11)
            java.lang.Object r11 = kotlin.collections.C19294b0.m32560q0(r13, r12)
            r0.mo5121i(r11)
            java.util.Set r11 = r12.keySet()
            java.lang.Float r11 = kotlin.collections.C19327t.m32648d1(r11)
            kotlin.jvm.internal.C19383o.m32794d(r11)
            float r11 = r11.floatValue()
            r0.f2288k = r11
            java.util.Set r11 = r12.keySet()
            java.lang.Float r11 = kotlin.collections.C19327t.m32647c1(r11)
            kotlin.jvm.internal.C19383o.m32794d(r11)
            float r11 = r11.floatValue()
            r0.f2289l = r11
            goto L_0x0283
        L_0x0254:
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r11)
            java.lang.Object r11 = kotlin.collections.C19294b0.m32560q0(r1, r12)
            r0.mo5121i(r11)
            java.util.Set r11 = r12.keySet()
            java.lang.Float r11 = kotlin.collections.C19327t.m32648d1(r11)
            kotlin.jvm.internal.C19383o.m32794d(r11)
            float r11 = r11.floatValue()
            r0.f2288k = r11
            java.util.Set r11 = r12.keySet()
            java.lang.Float r11 = kotlin.collections.C19327t.m32647c1(r11)
            kotlin.jvm.internal.C19383o.m32794d(r11)
            float r11 = r11.floatValue()
            r0.f2289l = r11
            throw r13
        L_0x0283:
            kotlin.m r11 = kotlin.C19394m.f43287a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.mo5120h(java.util.Map, java.util.Map, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: i */
    public final void mo5121i(T t) {
        this.f2280c.setValue(t);
    }
}
