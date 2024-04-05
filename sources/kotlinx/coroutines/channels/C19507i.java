package kotlinx.coroutines.channels;

/* renamed from: kotlinx.coroutines.channels.i */
public final /* synthetic */ class C19507i {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33190a(kotlin.coroutines.C19340c r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            if (r2 == 0) goto L_0x0073
            r4 = 1
            if (r2 != r4) goto L_0x006b
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.q r5 = (kotlinx.coroutines.channels.C19515q) r5
            java.lang.Object r6 = r0.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)     // Catch:{ all -> 0x0068 }
        L_0x0037:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0068 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0068 }
            if (r8 == 0) goto L_0x0057
            java.lang.Object r8 = r2.next()     // Catch:{ all -> 0x0068 }
            r6.add(r8)     // Catch:{ all -> 0x0068 }
            r0.L$0 = r7     // Catch:{ all -> 0x0068 }
            r0.L$1 = r6     // Catch:{ all -> 0x0068 }
            r0.L$2 = r5     // Catch:{ all -> 0x0068 }
            r0.L$3 = r2     // Catch:{ all -> 0x0068 }
            r0.label = r4     // Catch:{ all -> 0x0068 }
            java.lang.Object r8 = r2.mo72148a(r0)     // Catch:{ all -> 0x0068 }
            if (r8 != r1) goto L_0x0037
            return r1
        L_0x0057:
            kotlin.m r8 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0068 }
            kotlin.jvm.internal.C19388s.m32827J(r5, r3)
            java.lang.String r8 = "builder"
            kotlin.jvm.internal.C19383o.m32797g(r7, r8)
            kotlin.collections.builders.ListBuilder r7 = (kotlin.collections.builders.ListBuilder) r7
            java.util.List r8 = r7.build()
            return r8
        L_0x0068:
            r8 = move-exception
            r3 = r5
            goto L_0x007d
        L_0x006b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0073:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            kotlin.collections.builders.ListBuilder r8 = new kotlin.collections.builders.ListBuilder
            r8.<init>()
            throw r3     // Catch:{ all -> 0x007c }
        L_0x007c:
            r8 = move-exception
        L_0x007d:
            throw r8     // Catch:{ all -> 0x007e }
        L_0x007e:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r3, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19507i.m33190a(kotlin.coroutines.c):java.lang.Object");
    }
}
