package androidx.compose.material;

import androidx.compose.animation.core.C0422e;
import java.util.Map;
import kotlinx.coroutines.flow.C19600e;

public final class SwipeableState$animateTo$2 implements C19600e<Map<Float, Object>> {

    /* renamed from: b */
    public final /* synthetic */ Object f2298b;

    /* renamed from: c */
    public final /* synthetic */ SwipeableState<Object> f2299c;

    /* renamed from: d */
    public final /* synthetic */ C0422e<Float> f2300d;

    public SwipeableState$animateTo$2(Object obj, SwipeableState<Object> swipeableState, C0422e<Float> eVar) {
        this.f2298b = obj;
        this.f2299c = swipeableState;
        this.f2300d = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(java.util.Map<java.lang.Float, java.lang.Object> r9, kotlin.coroutines.C19340c<? super kotlin.C19394m> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.material.SwipeableState$animateTo$2$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.material.SwipeableState$animateTo$2$emit$1 r0 = (androidx.compose.material.SwipeableState$animateTo$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SwipeableState$animateTo$2$emit$1 r0 = new androidx.compose.material.SwipeableState$animateTo$2$emit$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r5) goto L_0x0035
            java.lang.Object r9 = r0.L$1
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r0 = r0.L$0
            androidx.compose.material.SwipeableState$animateTo$2 r0 = (androidx.compose.material.SwipeableState$animateTo$2) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)     // Catch:{ all -> 0x0032 }
            goto L_0x005e
        L_0x0032:
            r10 = move-exception
            goto L_0x00cf
        L_0x0035:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003d:
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            java.lang.Object r10 = r8.f2298b     // Catch:{ all -> 0x00cd }
            java.lang.Float r10 = androidx.compose.material.C1261v1.m2393b(r10, r9)     // Catch:{ all -> 0x00cd }
            if (r10 == 0) goto L_0x00c1
            androidx.compose.material.SwipeableState<java.lang.Object> r2 = r8.f2299c     // Catch:{ all -> 0x00cd }
            float r10 = r10.floatValue()     // Catch:{ all -> 0x00cd }
            androidx.compose.animation.core.e<java.lang.Float> r6 = r8.f2300d     // Catch:{ all -> 0x00cd }
            r0.L$0 = r8     // Catch:{ all -> 0x00cd }
            r0.L$1 = r9     // Catch:{ all -> 0x00cd }
            r0.label = r5     // Catch:{ all -> 0x00cd }
            java.lang.Object r10 = r2.mo5114a(r10, r6, r0)     // Catch:{ all -> 0x00cd }
            if (r10 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r0 = r8
        L_0x005e:
            androidx.compose.material.SwipeableState<java.lang.Object> r10 = r0.f2299c
            androidx.compose.runtime.ParcelableSnapshotMutableState r10 = r10.f2284g
            java.lang.Object r10 = r10.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x0079:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x00a9
            java.lang.Object r2 = r9.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r6 = r2.getKey()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r6 = r6 - r10
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x009a
            r6 = r5
            goto L_0x009b
        L_0x009a:
            r6 = r3
        L_0x009b:
            if (r6 == 0) goto L_0x0079
            java.lang.Object r6 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r1.put(r6, r2)
            goto L_0x0079
        L_0x00a9:
            java.util.Collection r9 = r1.values()
            java.lang.Object r9 = kotlin.collections.C19327t.m32639U0(r9)
            if (r9 != 0) goto L_0x00b9
            androidx.compose.material.SwipeableState<java.lang.Object> r9 = r0.f2299c
            java.lang.Object r9 = r9.mo5116d()
        L_0x00b9:
            androidx.compose.material.SwipeableState<java.lang.Object> r10 = r0.f2299c
            r10.mo5121i(r9)
            kotlin.m r9 = kotlin.C19394m.f43287a
            return r9
        L_0x00c1:
            java.lang.String r10 = "The target value must have an associated anchor."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00cd }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00cd }
            r0.<init>(r10)     // Catch:{ all -> 0x00cd }
            throw r0     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            r10 = move-exception
            r0 = r8
        L_0x00cf:
            androidx.compose.material.SwipeableState<java.lang.Object> r1 = r0.f2299c
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r1.f2284g
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x00ea:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L_0x011a
            java.lang.Object r6 = r9.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r7 = r7 - r1
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x010b
            r7 = r5
            goto L_0x010c
        L_0x010b:
            r7 = r3
        L_0x010c:
            if (r7 == 0) goto L_0x00ea
            java.lang.Object r7 = r6.getKey()
            java.lang.Object r6 = r6.getValue()
            r2.put(r7, r6)
            goto L_0x00ea
        L_0x011a:
            java.util.Collection r9 = r2.values()
            java.lang.Object r9 = kotlin.collections.C19327t.m32639U0(r9)
            if (r9 != 0) goto L_0x012a
            androidx.compose.material.SwipeableState<java.lang.Object> r9 = r0.f2299c
            java.lang.Object r9 = r9.mo5116d()
        L_0x012a:
            androidx.compose.material.SwipeableState<java.lang.Object> r0 = r0.f2299c
            r0.mo5121i(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$animateTo$2.emit(java.util.Map, kotlin.coroutines.c):java.lang.Object");
    }
}
