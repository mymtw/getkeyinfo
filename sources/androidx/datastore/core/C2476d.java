package androidx.datastore.core;

/* renamed from: androidx.datastore.core.d */
public final class C2476d<T> {

    /* renamed from: a */
    public static final C2477a f5751a = new C2477a();

    /* renamed from: androidx.datastore.core.d$a */
    public static final class C2477a {
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0099  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final java.lang.Object m5441a(androidx.datastore.core.C2476d.C2477a r5, java.util.List r6, androidx.datastore.core.C2481h r7, kotlin.coroutines.C19340c r8) {
            /*
                r5.getClass()
                boolean r0 = r8 instanceof androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                if (r0 == 0) goto L_0x0016
                r0 = r8
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = (androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0016
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x001b
            L_0x0016:
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                r0.<init>(r5, r8)
            L_0x001b:
                java.lang.Object r5 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r0.label
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L_0x0047
                if (r1 == r2) goto L_0x003f
                if (r1 != r3) goto L_0x0037
                java.lang.Object r6 = r0.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r0.L$0
                kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
                androidx.compose.foundation.layout.C0761x.m1684O0(r5)     // Catch:{ all -> 0x0035 }
                goto L_0x006b
            L_0x0035:
                r5 = move-exception
                goto L_0x0084
            L_0x0037:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x003f:
                java.lang.Object r6 = r0.L$0
                java.util.List r6 = (java.util.List) r6
                androidx.compose.foundation.layout.C0761x.m1684O0(r5)
                goto L_0x0061
            L_0x0047:
                androidx.compose.foundation.layout.C0761x.m1684O0(r5)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r1 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2
                r4 = 0
                r1.<init>(r6, r5, r4)
                r0.L$0 = r5
                r0.label = r2
                java.lang.Object r6 = r7.mo9323a(r1, r0)
                if (r6 != r8) goto L_0x0060
                goto L_0x009b
            L_0x0060:
                r6 = r5
            L_0x0061:
                kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
                r5.<init>()
                java.util.Iterator r6 = r6.iterator()
                r7 = r5
            L_0x006b:
                boolean r5 = r6.hasNext()
                if (r5 == 0) goto L_0x0093
                java.lang.Object r5 = r6.next()
                kq.l r5 = (p753kq.C19857l) r5
                r0.L$0 = r7     // Catch:{ all -> 0x0035 }
                r0.L$1 = r6     // Catch:{ all -> 0x0035 }
                r0.label = r3     // Catch:{ all -> 0x0035 }
                java.lang.Object r5 = r5.invoke(r0)     // Catch:{ all -> 0x0035 }
                if (r5 != r8) goto L_0x006b
                goto L_0x009b
            L_0x0084:
                T r1 = r7.element
                if (r1 != 0) goto L_0x008b
                r7.element = r5
                goto L_0x006b
            L_0x008b:
                T r1 = r7.element
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                p568fn.C17782b.m29886t(r1, r5)
                goto L_0x006b
            L_0x0093:
                T r5 = r7.element
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 != 0) goto L_0x009c
                kotlin.m r8 = kotlin.C19394m.f43287a
            L_0x009b:
                return r8
            L_0x009c:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C2476d.C2477a.m5441a(androidx.datastore.core.d$a, java.util.List, androidx.datastore.core.h, kotlin.coroutines.c):java.lang.Object");
        }
    }
}
