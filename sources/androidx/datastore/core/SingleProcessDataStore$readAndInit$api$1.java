package androidx.datastore.core;

import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.sync.C19814c;

public final class SingleProcessDataStore$readAndInit$api$1 implements C2481h<T> {

    /* renamed from: a */
    public final /* synthetic */ C19814c f5745a;

    /* renamed from: b */
    public final /* synthetic */ Ref$BooleanRef f5746b;

    /* renamed from: c */
    public final /* synthetic */ Ref$ObjectRef<T> f5747c;

    /* renamed from: d */
    public final /* synthetic */ SingleProcessDataStore<T> f5748d;

    public SingleProcessDataStore$readAndInit$api$1(C19814c cVar, Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef<T> ref$ObjectRef, SingleProcessDataStore<T> singleProcessDataStore) {
        this.f5745a = cVar;
        this.f5746b = ref$BooleanRef;
        this.f5747c = ref$ObjectRef;
        this.f5748d = singleProcessDataStore;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097 A[Catch:{ all -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7 A[Catch:{ all -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cd A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d8 A[SYNTHETIC, Splitter:B:48:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo9323a(p753kq.C19861p<? super T, ? super kotlin.coroutines.C19340c<? super T>, ? extends java.lang.Object> r11, kotlin.coroutines.C19340c<? super T> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0070
            if (r2 == r5) goto L_0x0057
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r11 = r0.L$2
            java.lang.Object r1 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.sync.c r0 = (kotlinx.coroutines.sync.C19814c) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)     // Catch:{ all -> 0x0039 }
            goto L_0x00c9
        L_0x0039:
            r11 = move-exception
            goto L_0x00d4
        L_0x003c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0044:
            java.lang.Object r11 = r0.L$2
            androidx.datastore.core.SingleProcessDataStore r11 = (androidx.datastore.core.SingleProcessDataStore) r11
            java.lang.Object r2 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.sync.c r4 = (kotlinx.coroutines.sync.C19814c) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)     // Catch:{ all -> 0x0054 }
            goto L_0x00af
        L_0x0054:
            r11 = move-exception
            goto L_0x00d6
        L_0x0057:
            java.lang.Object r11 = r0.L$4
            androidx.datastore.core.SingleProcessDataStore r11 = (androidx.datastore.core.SingleProcessDataStore) r11
            java.lang.Object r2 = r0.L$3
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r5 = r0.L$2
            kotlin.jvm.internal.Ref$BooleanRef r5 = (kotlin.jvm.internal.Ref$BooleanRef) r5
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.sync.c r7 = (kotlinx.coroutines.sync.C19814c) r7
            java.lang.Object r8 = r0.L$0
            kq.p r8 = (p753kq.C19861p) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            r12 = r7
            goto L_0x0093
        L_0x0070:
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            kotlinx.coroutines.sync.c r12 = r10.f5745a
            kotlin.jvm.internal.Ref$BooleanRef r2 = r10.f5746b
            kotlin.jvm.internal.Ref$ObjectRef<T> r7 = r10.f5747c
            androidx.datastore.core.SingleProcessDataStore<T> r8 = r10.f5748d
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r2
            r0.L$3 = r7
            r0.L$4 = r8
            r0.label = r5
            java.lang.Object r5 = r12.mo72641c(r6, r0)
            if (r5 != r1) goto L_0x008e
            return r1
        L_0x008e:
            r5 = r2
            r2 = r7
            r9 = r8
            r8 = r11
            r11 = r9
        L_0x0093:
            boolean r5 = r5.element     // Catch:{ all -> 0x00e0 }
            if (r5 != 0) goto L_0x00d8
            T r5 = r2.element     // Catch:{ all -> 0x00e0 }
            r0.L$0 = r12     // Catch:{ all -> 0x00e0 }
            r0.L$1 = r2     // Catch:{ all -> 0x00e0 }
            r0.L$2 = r11     // Catch:{ all -> 0x00e0 }
            r0.L$3 = r6     // Catch:{ all -> 0x00e0 }
            r0.L$4 = r6     // Catch:{ all -> 0x00e0 }
            r0.label = r4     // Catch:{ all -> 0x00e0 }
            java.lang.Object r4 = r8.invoke(r5, r0)     // Catch:{ all -> 0x00e0 }
            if (r4 != r1) goto L_0x00ac
            return r1
        L_0x00ac:
            r9 = r4
            r4 = r12
            r12 = r9
        L_0x00af:
            T r5 = r2.element     // Catch:{ all -> 0x0054 }
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r12, r5)     // Catch:{ all -> 0x0054 }
            if (r5 != 0) goto L_0x00cd
            r0.L$0 = r4     // Catch:{ all -> 0x0054 }
            r0.L$1 = r2     // Catch:{ all -> 0x0054 }
            r0.L$2 = r12     // Catch:{ all -> 0x0054 }
            r0.label = r3     // Catch:{ all -> 0x0054 }
            java.lang.Object r11 = r11.mo9312j(r12, r0)     // Catch:{ all -> 0x0054 }
            if (r11 != r1) goto L_0x00c6
            return r1
        L_0x00c6:
            r11 = r12
            r1 = r2
            r0 = r4
        L_0x00c9:
            r1.element = r11     // Catch:{ all -> 0x0039 }
            r2 = r1
            goto L_0x00ce
        L_0x00cd:
            r0 = r4
        L_0x00ce:
            T r11 = r2.element     // Catch:{ all -> 0x0039 }
            r0.mo72642d(r6)
            return r11
        L_0x00d4:
            r12 = r0
            goto L_0x00e1
        L_0x00d6:
            r12 = r4
            goto L_0x00e1
        L_0x00d8:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "InitializerApi.updateData should not be called after initialization is complete."
            r11.<init>(r0)     // Catch:{ all -> 0x00e0 }
            throw r11     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r11 = move-exception
        L_0x00e1:
            r12.mo72642d(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1.mo9323a(kq.p, kotlin.coroutines.c):java.lang.Object");
    }
}
