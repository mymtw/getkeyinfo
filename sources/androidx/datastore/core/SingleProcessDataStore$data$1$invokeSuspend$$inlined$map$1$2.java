package androidx.datastore.core;

import kotlinx.coroutines.flow.C19600e;

public final class SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2 implements C19600e<C2484k<Object>> {

    /* renamed from: b */
    public final /* synthetic */ C19600e f5744b;

    public SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2(C19600e eVar) {
        this.f5744b = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.C19340c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2.C24711
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1 r0 = (androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2.C24711) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1 r0 = new androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x004f
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            kotlinx.coroutines.flow.e r6 = r4.f5744b
            androidx.datastore.core.k r5 = (androidx.datastore.core.C2484k) r5
            boolean r2 = r5 instanceof androidx.datastore.core.C2482i
            if (r2 != 0) goto L_0x006d
            boolean r2 = r5 instanceof androidx.datastore.core.C2480g
            if (r2 != 0) goto L_0x0068
            boolean r2 = r5 instanceof androidx.datastore.core.C2474b
            if (r2 == 0) goto L_0x0052
            androidx.datastore.core.b r5 = (androidx.datastore.core.C2474b) r5
            T r5 = r5.f5749a
            r0.label = r3
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L_0x004f
            return r1
        L_0x004f:
            kotlin.m r5 = kotlin.C19394m.f43287a
            return r5
        L_0x0052:
            boolean r5 = r5 instanceof androidx.datastore.core.C2485l
            if (r5 == 0) goto L_0x0062
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x0062:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x0068:
            androidx.datastore.core.g r5 = (androidx.datastore.core.C2480g) r5
            java.lang.Throwable r5 = r5.f5752a
            throw r5
        L_0x006d:
            androidx.datastore.core.i r5 = (androidx.datastore.core.C2482i) r5
            java.lang.Throwable r5 = r5.f5753a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
