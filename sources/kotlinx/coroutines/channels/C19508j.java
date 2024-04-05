package kotlinx.coroutines.channels;

/* renamed from: kotlinx.coroutines.channels.j */
public final /* synthetic */ class C19508j {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33191a(kotlin.coroutines.C19340c r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1
            if (r0 == 0) goto L_0x0013
            r0 = r4
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.q r0 = (kotlinx.coroutines.channels.C19515q) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)     // Catch:{ all -> 0x002f }
            kotlin.jvm.internal.C19388s.m32827J(r0, r3)
            return r4
        L_0x002f:
            r4 = move-exception
            r3 = r0
            goto L_0x003f
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x003a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)
            throw r3     // Catch:{ all -> 0x003e }
        L_0x003e:
            r4 = move-exception
        L_0x003f:
            throw r4     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33191a(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33192b(kotlin.coroutines.C19340c r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            if (r2 == 0) goto L_0x006a
            r4 = 1
            if (r2 != r4) goto L_0x0062
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.q r5 = (kotlinx.coroutines.channels.C19515q) r5
            java.lang.Object r6 = r0.L$0
            kotlin.jvm.internal.Ref$IntRef r6 = (kotlin.jvm.internal.Ref$IntRef) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)     // Catch:{ all -> 0x005f }
        L_0x0033:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x005f }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x0052
            r2.next()     // Catch:{ all -> 0x005f }
            int r7 = r6.element     // Catch:{ all -> 0x005f }
            int r7 = r7 + r4
            r6.element = r7     // Catch:{ all -> 0x005f }
            r0.L$0 = r6     // Catch:{ all -> 0x005f }
            r0.L$1 = r5     // Catch:{ all -> 0x005f }
            r0.L$2 = r2     // Catch:{ all -> 0x005f }
            r0.label = r4     // Catch:{ all -> 0x005f }
            java.lang.Object r7 = r2.mo72148a(r0)     // Catch:{ all -> 0x005f }
            if (r7 != r1) goto L_0x0033
            return r1
        L_0x0052:
            kotlin.m r7 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x005f }
            kotlin.jvm.internal.C19388s.m32827J(r5, r3)
            int r7 = r6.element
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r7)
            return r0
        L_0x005f:
            r7 = move-exception
            r3 = r5
            goto L_0x0074
        L_0x0062:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x006a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = new kotlin.jvm.internal.Ref$IntRef
            r7.<init>()
            throw r3     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r7 = move-exception
        L_0x0074:
            throw r7     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33192b(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33193c(kotlin.coroutines.C19340c r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            java.lang.String r3 = "ReceiveChannel doesn't contain element at index "
            r4 = 0
            if (r2 == 0) goto L_0x0083
            r5 = 1
            if (r2 != r5) goto L_0x007b
            int r2 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.f r7 = (kotlinx.coroutines.channels.C19502f) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.q r8 = (kotlinx.coroutines.channels.C19515q) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)     // Catch:{ all -> 0x0079 }
        L_0x0035:
            r9 = 46
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x005e }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x005e }
            if (r10 == 0) goto L_0x0061
            java.lang.Object r10 = r7.next()     // Catch:{ all -> 0x005e }
            int r9 = r2 + 1
            if (r6 != r2) goto L_0x004b
            kotlin.jvm.internal.C19388s.m32827J(r8, r4)
            return r10
        L_0x004b:
            r0.L$0 = r8     // Catch:{ all -> 0x005e }
            r0.L$1 = r7     // Catch:{ all -> 0x005e }
            r0.I$0 = r6     // Catch:{ all -> 0x005e }
            r0.I$1 = r9     // Catch:{ all -> 0x005e }
            r0.label = r5     // Catch:{ all -> 0x005e }
            java.lang.Object r10 = r7.mo72148a(r0)     // Catch:{ all -> 0x005e }
            if (r10 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r2 = r9
            goto L_0x0035
        L_0x005e:
            r10 = move-exception
            r4 = r8
            goto L_0x0088
        L_0x0061:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x005e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            r0.<init>()     // Catch:{ all -> 0x005e }
            r0.append(r3)     // Catch:{ all -> 0x005e }
            r0.append(r6)     // Catch:{ all -> 0x005e }
            r0.append(r9)     // Catch:{ all -> 0x005e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x005e }
            r10.<init>(r0)     // Catch:{ all -> 0x005e }
            throw r10     // Catch:{ all -> 0x005e }
        L_0x0079:
            r10 = move-exception
            goto L_0x0089
        L_0x007b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0083:
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            throw r4     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r10 = move-exception
        L_0x0088:
            r8 = r4
        L_0x0089:
            throw r10     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r8, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33193c(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33194d(kotlin.coroutines.C19340c r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            if (r2 == 0) goto L_0x006b
            r4 = 1
            if (r2 != r4) goto L_0x0063
            int r2 = r0.I$1
            int r5 = r0.I$0
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.f r6 = (kotlinx.coroutines.channels.C19502f) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.q r7 = (kotlinx.coroutines.channels.C19515q) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ all -> 0x0061 }
        L_0x0033:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x005a }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x005a }
            if (r9 == 0) goto L_0x005d
            java.lang.Object r9 = r6.next()     // Catch:{ all -> 0x005a }
            int r8 = r2 + 1
            if (r5 != r2) goto L_0x0047
            kotlin.jvm.internal.C19388s.m32827J(r7, r3)
            return r9
        L_0x0047:
            r0.L$0 = r7     // Catch:{ all -> 0x005a }
            r0.L$1 = r6     // Catch:{ all -> 0x005a }
            r0.I$0 = r5     // Catch:{ all -> 0x005a }
            r0.I$1 = r8     // Catch:{ all -> 0x005a }
            r0.label = r4     // Catch:{ all -> 0x005a }
            java.lang.Object r9 = r6.mo72148a(r0)     // Catch:{ all -> 0x005a }
            if (r9 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r2 = r8
            goto L_0x0033
        L_0x005a:
            r9 = move-exception
            r3 = r7
            goto L_0x0070
        L_0x005d:
            kotlin.jvm.internal.C19388s.m32827J(r7, r3)
            return r3
        L_0x0061:
            r9 = move-exception
            goto L_0x0071
        L_0x0063:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x006b:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            throw r3     // Catch:{ all -> 0x006f }
        L_0x006f:
            r9 = move-exception
        L_0x0070:
            r7 = r3
        L_0x0071:
            throw r9     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r7, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33194d(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33195e(kotlin.coroutines.C19340c r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            if (r2 == 0) goto L_0x0064
            r4 = 1
            if (r2 != r4) goto L_0x005c
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.q r5 = (kotlinx.coroutines.channels.C19515q) r5
            java.lang.Object r6 = r0.L$0
            java.util.Collection r6 = (java.util.Collection) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)     // Catch:{ all -> 0x0059 }
        L_0x0033:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0059 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0059 }
            if (r7 == 0) goto L_0x0053
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x0059 }
            if (r7 == 0) goto L_0x0044
            r6.add(r7)     // Catch:{ all -> 0x0059 }
        L_0x0044:
            r0.L$0 = r6     // Catch:{ all -> 0x0059 }
            r0.L$1 = r5     // Catch:{ all -> 0x0059 }
            r0.L$2 = r2     // Catch:{ all -> 0x0059 }
            r0.label = r4     // Catch:{ all -> 0x0059 }
            java.lang.Object r7 = r2.mo72148a(r0)     // Catch:{ all -> 0x0059 }
            if (r7 != r1) goto L_0x0033
            return r1
        L_0x0053:
            kotlin.m r7 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0059 }
            kotlin.jvm.internal.C19388s.m32827J(r5, r3)
            return r6
        L_0x0059:
            r7 = move-exception
            r3 = r5
            goto L_0x0069
        L_0x005c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0064:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            throw r3     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r7 = move-exception
        L_0x0069:
            throw r7     // Catch:{ all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33195e(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056 A[Catch:{ all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079 A[Catch:{ all -> 0x007a }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d A[Catch:{ all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33196f(kotlin.coroutines.C19340c r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            if (r2 == 0) goto L_0x0085
            r4 = 1
            r5 = 2
            if (r2 == r4) goto L_0x003f
            if (r2 != r5) goto L_0x0037
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.q r6 = (kotlinx.coroutines.channels.C19515q) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.u r7 = (kotlinx.coroutines.channels.C19519u) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)     // Catch:{ all -> 0x0083 }
            goto L_0x006b
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003f:
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.q r6 = (kotlinx.coroutines.channels.C19515q) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.u r7 = (kotlinx.coroutines.channels.C19519u) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)     // Catch:{ all -> 0x0083 }
        L_0x004e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x007a }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x007a }
            if (r8 == 0) goto L_0x007d
            java.lang.Object r8 = r2.next()     // Catch:{ all -> 0x007a }
            if (r8 == 0) goto L_0x006b
            r0.L$0 = r7     // Catch:{ all -> 0x007a }
            r0.L$1 = r6     // Catch:{ all -> 0x007a }
            r0.L$2 = r2     // Catch:{ all -> 0x007a }
            r0.label = r5     // Catch:{ all -> 0x007a }
            java.lang.Object r8 = r7.mo72188E(r8, r0)     // Catch:{ all -> 0x007a }
            if (r8 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r0.L$0 = r7     // Catch:{ all -> 0x007a }
            r0.L$1 = r6     // Catch:{ all -> 0x007a }
            r0.L$2 = r2     // Catch:{ all -> 0x007a }
            r0.label = r4     // Catch:{ all -> 0x007a }
            java.lang.Object r8 = r2.mo72148a(r0)     // Catch:{ all -> 0x007a }
            if (r8 != r1) goto L_0x004e
            return r1
        L_0x007a:
            r8 = move-exception
            r3 = r6
            goto L_0x008a
        L_0x007d:
            kotlin.m r8 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x007a }
            kotlin.jvm.internal.C19388s.m32827J(r6, r3)
            return r7
        L_0x0083:
            r8 = move-exception
            goto L_0x008b
        L_0x0085:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            throw r3     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r8 = move-exception
        L_0x008a:
            r6 = r3
        L_0x008b:
            throw r8     // Catch:{ all -> 0x008c }
        L_0x008c:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r6, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33196f(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33197g(kotlin.coroutines.C19340c r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1
            if (r0 == 0) goto L_0x0013
            r0 = r4
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0052
            if (r1 != r2) goto L_0x004a
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.q r0 = (kotlinx.coroutines.channels.C19515q) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0047 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x003f
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x0047 }
            kotlin.jvm.internal.C19388s.m32827J(r0, r3)
            return r4
        L_0x003f:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = "ReceiveChannel is empty."
            r4.<init>(r1)     // Catch:{ all -> 0x0047 }
            throw r4     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r4 = move-exception
            r3 = r0
            goto L_0x0057
        L_0x004a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x0052:
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)
            throw r3     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r4 = move-exception
        L_0x0057:
            throw r4     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33197g(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33198h(kotlin.coroutines.C19340c r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r4
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x004e
            if (r1 != r2) goto L_0x0046
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.q r0 = (kotlinx.coroutines.channels.C19515q) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)     // Catch:{ all -> 0x0043 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0043 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0043 }
            if (r4 != 0) goto L_0x003b
            kotlin.jvm.internal.C19388s.m32827J(r0, r3)
            return r3
        L_0x003b:
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x0043 }
            kotlin.jvm.internal.C19388s.m32827J(r0, r3)
            return r4
        L_0x0043:
            r4 = move-exception
            r3 = r0
            goto L_0x0053
        L_0x0046:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x004e:
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)
            throw r3     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r4 = move-exception
        L_0x0053:
            throw r4     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33198h(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33199i(kotlin.coroutines.C19340c r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            if (r2 == 0) goto L_0x007f
            r4 = 1
            if (r2 != r4) goto L_0x0077
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.q r5 = (kotlinx.coroutines.channels.C19515q) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.internal.Ref$IntRef r6 = (kotlin.jvm.internal.Ref$IntRef) r6
            java.lang.Object r7 = r0.L$0
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)     // Catch:{ all -> 0x0074 }
        L_0x0035:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0074 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0074 }
            if (r8 == 0) goto L_0x0068
            java.lang.Object r8 = r2.next()     // Catch:{ all -> 0x0074 }
            boolean r8 = kotlin.jvm.internal.C19383o.m32792b(r7, r8)     // Catch:{ all -> 0x0074 }
            if (r8 == 0) goto L_0x0052
            int r8 = r6.element     // Catch:{ all -> 0x0074 }
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ all -> 0x0074 }
            r0.<init>(r8)     // Catch:{ all -> 0x0074 }
            kotlin.jvm.internal.C19388s.m32827J(r5, r3)
            return r0
        L_0x0052:
            int r8 = r6.element     // Catch:{ all -> 0x0074 }
            int r8 = r8 + r4
            r6.element = r8     // Catch:{ all -> 0x0074 }
            r0.L$0 = r7     // Catch:{ all -> 0x0074 }
            r0.L$1 = r6     // Catch:{ all -> 0x0074 }
            r0.L$2 = r5     // Catch:{ all -> 0x0074 }
            r0.L$3 = r2     // Catch:{ all -> 0x0074 }
            r0.label = r4     // Catch:{ all -> 0x0074 }
            java.lang.Object r8 = r2.mo72148a(r0)     // Catch:{ all -> 0x0074 }
            if (r8 != r1) goto L_0x0035
            return r1
        L_0x0068:
            kotlin.m r8 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0074 }
            kotlin.jvm.internal.C19388s.m32827J(r5, r3)
            r8 = -1
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r8)
            return r0
        L_0x0074:
            r8 = move-exception
            r3 = r5
            goto L_0x0089
        L_0x0077:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x007f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            kotlin.jvm.internal.Ref$IntRef r8 = new kotlin.jvm.internal.Ref$IntRef
            r8.<init>()
            throw r3     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r8 = move-exception
        L_0x0089:
            throw r8     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r3, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33199i(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33200j(kotlin.coroutines.C19340c r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x008e
            r5 = 2
            if (r2 == r3) goto L_0x003f
            if (r2 != r5) goto L_0x0037
            java.lang.Object r2 = r0.L$2
            java.lang.Object r3 = r0.L$1
            kotlinx.coroutines.channels.f r3 = (kotlinx.coroutines.channels.C19502f) r3
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.q r6 = (kotlinx.coroutines.channels.C19515q) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)     // Catch:{ all -> 0x0035 }
            goto L_0x006c
        L_0x0035:
            r8 = move-exception
            goto L_0x007f
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003f:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.channels.q r3 = (kotlinx.coroutines.channels.C19515q) r3
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)     // Catch:{ all -> 0x008c }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x008c }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x008c }
            if (r8 == 0) goto L_0x0084
            java.lang.Object r8 = r2.next()     // Catch:{ all -> 0x008c }
            r7 = r2
            r2 = r8
            r8 = r7
        L_0x0059:
            r0.L$0 = r3     // Catch:{ all -> 0x0081 }
            r0.L$1 = r8     // Catch:{ all -> 0x0081 }
            r0.L$2 = r2     // Catch:{ all -> 0x0081 }
            r0.label = r5     // Catch:{ all -> 0x0081 }
            java.lang.Object r6 = r8.mo72148a(r0)     // Catch:{ all -> 0x0081 }
            if (r6 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r7 = r3
            r3 = r8
            r8 = r6
            r6 = r7
        L_0x006c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0035 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0035 }
            if (r8 == 0) goto L_0x007b
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0035 }
            r8 = r3
            r3 = r6
            goto L_0x0059
        L_0x007b:
            kotlin.jvm.internal.C19388s.m32827J(r6, r4)
            return r2
        L_0x007f:
            r3 = r6
            goto L_0x0094
        L_0x0081:
            r8 = move-exception
            r4 = r3
            goto L_0x0093
        L_0x0084:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "ReceiveChannel is empty."
            r8.<init>(r0)     // Catch:{ all -> 0x008c }
            throw r8     // Catch:{ all -> 0x008c }
        L_0x008c:
            r8 = move-exception
            goto L_0x0094
        L_0x008e:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            throw r4     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r8 = move-exception
        L_0x0093:
            r3 = r4
        L_0x0094:
            throw r8     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r3, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33200j(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33201k(kotlin.coroutines.C19340c r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            if (r2 == 0) goto L_0x007f
            r4 = 1
            if (r2 != r4) goto L_0x0077
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r5 = r0.L$3
            kotlinx.coroutines.channels.q r5 = (kotlinx.coroutines.channels.C19515q) r5
            java.lang.Object r6 = r0.L$2
            kotlin.jvm.internal.Ref$IntRef r6 = (kotlin.jvm.internal.Ref$IntRef) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.internal.Ref$IntRef r7 = (kotlin.jvm.internal.Ref$IntRef) r7
            java.lang.Object r8 = r0.L$0
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ all -> 0x0074 }
        L_0x0039:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0074 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0074 }
            if (r9 == 0) goto L_0x0067
            java.lang.Object r9 = r2.next()     // Catch:{ all -> 0x0074 }
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r8, r9)     // Catch:{ all -> 0x0074 }
            if (r9 == 0) goto L_0x004f
            int r9 = r6.element     // Catch:{ all -> 0x0074 }
            r7.element = r9     // Catch:{ all -> 0x0074 }
        L_0x004f:
            int r9 = r6.element     // Catch:{ all -> 0x0074 }
            int r9 = r9 + r4
            r6.element = r9     // Catch:{ all -> 0x0074 }
            r0.L$0 = r8     // Catch:{ all -> 0x0074 }
            r0.L$1 = r7     // Catch:{ all -> 0x0074 }
            r0.L$2 = r6     // Catch:{ all -> 0x0074 }
            r0.L$3 = r5     // Catch:{ all -> 0x0074 }
            r0.L$4 = r2     // Catch:{ all -> 0x0074 }
            r0.label = r4     // Catch:{ all -> 0x0074 }
            java.lang.Object r9 = r2.mo72148a(r0)     // Catch:{ all -> 0x0074 }
            if (r9 != r1) goto L_0x0039
            return r1
        L_0x0067:
            kotlin.m r9 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0074 }
            kotlin.jvm.internal.C19388s.m32827J(r5, r3)
            int r9 = r7.element
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r9)
            return r0
        L_0x0074:
            r9 = move-exception
            r3 = r5
            goto L_0x0091
        L_0x0077:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x007f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            r0 = -1
            r9.element = r0
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            throw r3     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r9 = move-exception
        L_0x0091:
            throw r9     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r3, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33201k(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0078 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33202l(kotlin.coroutines.C19340c r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x008a
            r5 = 2
            if (r2 == r3) goto L_0x003f
            if (r2 != r5) goto L_0x0037
            java.lang.Object r2 = r0.L$2
            java.lang.Object r3 = r0.L$1
            kotlinx.coroutines.channels.f r3 = (kotlinx.coroutines.channels.C19502f) r3
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.q r6 = (kotlinx.coroutines.channels.C19515q) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)     // Catch:{ all -> 0x0035 }
            goto L_0x0070
        L_0x0035:
            r8 = move-exception
            goto L_0x0083
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003f:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.channels.q r3 = (kotlinx.coroutines.channels.C19515q) r3
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)     // Catch:{ all -> 0x0088 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0088 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0088 }
            if (r8 != 0) goto L_0x0056
            kotlin.jvm.internal.C19388s.m32827J(r3, r4)
            return r4
        L_0x0056:
            java.lang.Object r8 = r2.next()     // Catch:{ all -> 0x0088 }
            r7 = r2
            r2 = r8
            r8 = r7
        L_0x005d:
            r0.L$0 = r3     // Catch:{ all -> 0x0085 }
            r0.L$1 = r8     // Catch:{ all -> 0x0085 }
            r0.L$2 = r2     // Catch:{ all -> 0x0085 }
            r0.label = r5     // Catch:{ all -> 0x0085 }
            java.lang.Object r6 = r8.mo72148a(r0)     // Catch:{ all -> 0x0085 }
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r7 = r3
            r3 = r8
            r8 = r6
            r6 = r7
        L_0x0070:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0035 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0035 }
            if (r8 == 0) goto L_0x007f
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0035 }
            r8 = r3
            r3 = r6
            goto L_0x005d
        L_0x007f:
            kotlin.jvm.internal.C19388s.m32827J(r6, r4)
            return r2
        L_0x0083:
            r3 = r6
            goto L_0x0090
        L_0x0085:
            r8 = move-exception
            r4 = r3
            goto L_0x008f
        L_0x0088:
            r8 = move-exception
            goto L_0x0090
        L_0x008a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            throw r4     // Catch:{ all -> 0x008e }
        L_0x008e:
            r8 = move-exception
        L_0x008f:
            r3 = r4
        L_0x0090:
            throw r8     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r3, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33202l(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: kotlinx.coroutines.channels.q} */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (r7.compare(r2, r9) < 0) goto L_0x0065;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007f A[Catch:{ all -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33203m(kotlin.coroutines.C19340c r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0091
            r5 = 2
            if (r2 == r3) goto L_0x0043
            if (r2 != r5) goto L_0x003b
            java.lang.Object r2 = r0.L$3
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.channels.f r3 = (kotlinx.coroutines.channels.C19502f) r3
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.q r6 = (kotlinx.coroutines.channels.C19515q) r6
            java.lang.Object r7 = r0.L$0
            java.util.Comparator r7 = (java.util.Comparator) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ all -> 0x0039 }
            goto L_0x0077
        L_0x0039:
            r9 = move-exception
            goto L_0x0097
        L_0x003b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0043:
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r3 = r0.L$1
            r6 = r3
            kotlinx.coroutines.channels.q r6 = (kotlinx.coroutines.channels.C19515q) r6
            java.lang.Object r3 = r0.L$0
            java.util.Comparator r3 = (java.util.Comparator) r3
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ all -> 0x0039 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0039 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0039 }
            if (r9 != 0) goto L_0x005f
            kotlin.jvm.internal.C19388s.m32827J(r6, r4)
            return r4
        L_0x005f:
            java.lang.Object r9 = r2.next()     // Catch:{ all -> 0x0039 }
            r7 = r3
            r3 = r2
        L_0x0065:
            r2 = r9
        L_0x0066:
            r0.L$0 = r7     // Catch:{ all -> 0x008e }
            r0.L$1 = r6     // Catch:{ all -> 0x008e }
            r0.L$2 = r3     // Catch:{ all -> 0x008e }
            r0.L$3 = r2     // Catch:{ all -> 0x008e }
            r0.label = r5     // Catch:{ all -> 0x008e }
            java.lang.Object r9 = r3.mo72148a(r0)     // Catch:{ all -> 0x008e }
            if (r9 != r1) goto L_0x0077
            return r1
        L_0x0077:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x008e }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x008e }
            if (r9 == 0) goto L_0x008a
            java.lang.Object r9 = r3.next()     // Catch:{ all -> 0x008e }
            int r8 = r7.compare(r2, r9)     // Catch:{ all -> 0x008e }
            if (r8 >= 0) goto L_0x0066
            goto L_0x0065
        L_0x008a:
            kotlin.jvm.internal.C19388s.m32827J(r6, r4)
            return r2
        L_0x008e:
            r9 = move-exception
            r4 = r6
            goto L_0x0096
        L_0x0091:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            throw r4     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r9 = move-exception
        L_0x0096:
            r6 = r4
        L_0x0097:
            throw r9     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r6, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33203m(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: kotlinx.coroutines.channels.q} */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (r7.compare(r2, r9) > 0) goto L_0x0065;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007f A[Catch:{ all -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33204n(kotlin.coroutines.C19340c r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0091
            r5 = 2
            if (r2 == r3) goto L_0x0043
            if (r2 != r5) goto L_0x003b
            java.lang.Object r2 = r0.L$3
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.channels.f r3 = (kotlinx.coroutines.channels.C19502f) r3
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.q r6 = (kotlinx.coroutines.channels.C19515q) r6
            java.lang.Object r7 = r0.L$0
            java.util.Comparator r7 = (java.util.Comparator) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ all -> 0x0039 }
            goto L_0x0077
        L_0x0039:
            r9 = move-exception
            goto L_0x0097
        L_0x003b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0043:
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r3 = r0.L$1
            r6 = r3
            kotlinx.coroutines.channels.q r6 = (kotlinx.coroutines.channels.C19515q) r6
            java.lang.Object r3 = r0.L$0
            java.util.Comparator r3 = (java.util.Comparator) r3
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ all -> 0x0039 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0039 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0039 }
            if (r9 != 0) goto L_0x005f
            kotlin.jvm.internal.C19388s.m32827J(r6, r4)
            return r4
        L_0x005f:
            java.lang.Object r9 = r2.next()     // Catch:{ all -> 0x0039 }
            r7 = r3
            r3 = r2
        L_0x0065:
            r2 = r9
        L_0x0066:
            r0.L$0 = r7     // Catch:{ all -> 0x008e }
            r0.L$1 = r6     // Catch:{ all -> 0x008e }
            r0.L$2 = r3     // Catch:{ all -> 0x008e }
            r0.L$3 = r2     // Catch:{ all -> 0x008e }
            r0.label = r5     // Catch:{ all -> 0x008e }
            java.lang.Object r9 = r3.mo72148a(r0)     // Catch:{ all -> 0x008e }
            if (r9 != r1) goto L_0x0077
            return r1
        L_0x0077:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x008e }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x008e }
            if (r9 == 0) goto L_0x008a
            java.lang.Object r9 = r3.next()     // Catch:{ all -> 0x008e }
            int r8 = r7.compare(r2, r9)     // Catch:{ all -> 0x008e }
            if (r8 <= 0) goto L_0x0066
            goto L_0x0065
        L_0x008a:
            kotlin.jvm.internal.C19388s.m32827J(r6, r4)
            return r2
        L_0x008e:
            r9 = move-exception
            r4 = r6
            goto L_0x0096
        L_0x0091:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            throw r4     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r9 = move-exception
        L_0x0096:
            r6 = r4
        L_0x0097:
            throw r9     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r6, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33204n(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33205o(kotlin.coroutines.C19340c r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1
            if (r0 == 0) goto L_0x0013
            r0 = r4
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0048
            if (r1 != r2) goto L_0x0040
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.q r0 = (kotlinx.coroutines.channels.C19515q) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)     // Catch:{ all -> 0x003d }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x003d }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x003d }
            if (r4 != 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x003d }
            kotlin.jvm.internal.C19388s.m32827J(r0, r3)
            return r4
        L_0x003d:
            r4 = move-exception
            r3 = r0
            goto L_0x004d
        L_0x0040:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x0048:
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)
            throw r3     // Catch:{ all -> 0x004c }
        L_0x004c:
            r4 = move-exception
        L_0x004d:
            throw r4     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33205o(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33206p(kotlin.coroutines.C19340c r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0082
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r1 = r0.L$1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.q r0 = (kotlinx.coroutines.channels.C19515q) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)     // Catch:{ all -> 0x0031 }
            goto L_0x0063
        L_0x0031:
            r6 = move-exception
            r5 = r0
            goto L_0x0087
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003c:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.q r4 = (kotlinx.coroutines.channels.C19515q) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)     // Catch:{ all -> 0x007f }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x007f }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x007f }
            if (r6 == 0) goto L_0x0077
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x007f }
            r0.L$0 = r4     // Catch:{ all -> 0x007f }
            r0.L$1 = r6     // Catch:{ all -> 0x007f }
            r0.label = r3     // Catch:{ all -> 0x007f }
            java.lang.Object r0 = r2.mo72148a(r0)     // Catch:{ all -> 0x007f }
            if (r0 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r1 = r6
            r6 = r0
            r0 = r4
        L_0x0063:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0031 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0031 }
            if (r6 != 0) goto L_0x006f
            kotlin.jvm.internal.C19388s.m32827J(r0, r5)
            return r1
        L_0x006f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0031 }
            java.lang.String r1 = "ReceiveChannel has more than one element."
            r6.<init>(r1)     // Catch:{ all -> 0x0031 }
            throw r6     // Catch:{ all -> 0x0031 }
        L_0x0077:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch:{ all -> 0x007f }
            java.lang.String r0 = "ReceiveChannel is empty."
            r6.<init>(r0)     // Catch:{ all -> 0x007f }
            throw r6     // Catch:{ all -> 0x007f }
        L_0x007f:
            r6 = move-exception
            r5 = r4
            goto L_0x0087
        L_0x0082:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            throw r5     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r6 = move-exception
        L_0x0087:
            throw r6     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r5, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33206p(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33207q(kotlin.coroutines.C19340c r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x007a
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r1 = r0.L$1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.q r0 = (kotlinx.coroutines.channels.C19515q) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)     // Catch:{ all -> 0x0031 }
            goto L_0x0067
        L_0x0031:
            r6 = move-exception
            r5 = r0
            goto L_0x007f
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003c:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.q r4 = (kotlinx.coroutines.channels.C19515q) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)     // Catch:{ all -> 0x0077 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0077 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0077 }
            if (r6 != 0) goto L_0x0053
            kotlin.jvm.internal.C19388s.m32827J(r4, r5)
            return r5
        L_0x0053:
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x0077 }
            r0.L$0 = r4     // Catch:{ all -> 0x0077 }
            r0.L$1 = r6     // Catch:{ all -> 0x0077 }
            r0.label = r3     // Catch:{ all -> 0x0077 }
            java.lang.Object r0 = r2.mo72148a(r0)     // Catch:{ all -> 0x0077 }
            if (r0 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r1 = r6
            r6 = r0
            r0 = r4
        L_0x0067:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0031 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0031 }
            if (r6 == 0) goto L_0x0073
            kotlin.jvm.internal.C19388s.m32827J(r0, r5)
            return r5
        L_0x0073:
            kotlin.jvm.internal.C19388s.m32827J(r0, r5)
            return r1
        L_0x0077:
            r6 = move-exception
            r5 = r4
            goto L_0x007f
        L_0x007a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            throw r5     // Catch:{ all -> 0x007e }
        L_0x007e:
            r6 = move-exception
        L_0x007f:
            throw r6     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r5, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33207q(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlinx.coroutines.channels.o, code=kotlinx.coroutines.channels.u, for r8v0, types: [kotlinx.coroutines.channels.o] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0077 A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33208r(kotlinx.coroutines.channels.C19515q r7, kotlinx.coroutines.channels.C19519u r8, kotlin.coroutines.C19340c r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x0053
            if (r2 == r3) goto L_0x0041
            if (r2 != r4) goto L_0x0039
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.f r7 = (kotlinx.coroutines.channels.C19502f) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.q r8 = (kotlinx.coroutines.channels.C19515q) r8
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.u r2 = (kotlinx.coroutines.channels.C19519u) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ all -> 0x0051 }
        L_0x0035:
            r9 = r7
            r7 = r8
            r8 = r2
            goto L_0x005a
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0041:
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.f r7 = (kotlinx.coroutines.channels.C19502f) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.q r8 = (kotlinx.coroutines.channels.C19515q) r8
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.u r2 = (kotlinx.coroutines.channels.C19519u) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ all -> 0x0051 }
            goto L_0x006e
        L_0x0051:
            r7 = move-exception
            goto L_0x0094
        L_0x0053:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            kotlinx.coroutines.channels.f r9 = r7.iterator()     // Catch:{ all -> 0x0090 }
        L_0x005a:
            r0.L$0 = r8     // Catch:{ all -> 0x0090 }
            r0.L$1 = r7     // Catch:{ all -> 0x0090 }
            r0.L$2 = r9     // Catch:{ all -> 0x0090 }
            r0.label = r3     // Catch:{ all -> 0x0090 }
            java.lang.Object r2 = r9.mo72148a(r0)     // Catch:{ all -> 0x0090 }
            if (r2 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r2
            r2 = r6
        L_0x006e:
            r5 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0051 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0051 }
            if (r9 == 0) goto L_0x008a
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x0051 }
            r0.L$0 = r2     // Catch:{ all -> 0x0051 }
            r0.L$1 = r8     // Catch:{ all -> 0x0051 }
            r0.L$2 = r7     // Catch:{ all -> 0x0051 }
            r0.label = r4     // Catch:{ all -> 0x0051 }
            java.lang.Object r9 = r2.mo72188E(r9, r0)     // Catch:{ all -> 0x0051 }
            if (r9 != r1) goto L_0x0035
            return r1
        L_0x008a:
            kotlin.m r7 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0051 }
            kotlin.jvm.internal.C19388s.m32827J(r8, r5)
            return r2
        L_0x0090:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x0094:
            throw r7     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r9 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33208r(kotlinx.coroutines.channels.q, kotlinx.coroutines.channels.o, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33209s(kotlin.coroutines.C19340c r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            if (r2 == 0) goto L_0x0062
            r4 = 1
            if (r2 != r4) goto L_0x005a
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.q r5 = (kotlinx.coroutines.channels.C19515q) r5
            java.lang.Object r6 = r0.L$0
            java.util.Collection r6 = (java.util.Collection) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)     // Catch:{ all -> 0x0057 }
        L_0x0033:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0057 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0057 }
            if (r7 == 0) goto L_0x0051
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x0057 }
            r6.add(r7)     // Catch:{ all -> 0x0057 }
            r0.L$0 = r6     // Catch:{ all -> 0x0057 }
            r0.L$1 = r5     // Catch:{ all -> 0x0057 }
            r0.L$2 = r2     // Catch:{ all -> 0x0057 }
            r0.label = r4     // Catch:{ all -> 0x0057 }
            java.lang.Object r7 = r2.mo72148a(r0)     // Catch:{ all -> 0x0057 }
            if (r7 != r1) goto L_0x0033
            return r1
        L_0x0051:
            kotlin.m r7 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0057 }
            kotlin.jvm.internal.C19388s.m32827J(r5, r3)
            return r6
        L_0x0057:
            r7 = move-exception
            r3 = r5
            goto L_0x0067
        L_0x005a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0062:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            throw r3     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r7 = move-exception
        L_0x0067:
            throw r7     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33209s(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33210t(kotlin.coroutines.C19340c r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            if (r2 == 0) goto L_0x006c
            r4 = 1
            if (r2 != r4) goto L_0x0064
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.q r5 = (kotlinx.coroutines.channels.C19515q) r5
            java.lang.Object r6 = r0.L$0
            java.util.Map r6 = (java.util.Map) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)     // Catch:{ all -> 0x0061 }
        L_0x0033:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0061 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0061 }
            if (r8 == 0) goto L_0x005b
            java.lang.Object r8 = r2.next()     // Catch:{ all -> 0x0061 }
            kotlin.Pair r8 = (kotlin.Pair) r8     // Catch:{ all -> 0x0061 }
            java.lang.Object r7 = r8.getFirst()     // Catch:{ all -> 0x0061 }
            java.lang.Object r8 = r8.getSecond()     // Catch:{ all -> 0x0061 }
            r6.put(r7, r8)     // Catch:{ all -> 0x0061 }
            r0.L$0 = r6     // Catch:{ all -> 0x0061 }
            r0.L$1 = r5     // Catch:{ all -> 0x0061 }
            r0.L$2 = r2     // Catch:{ all -> 0x0061 }
            r0.label = r4     // Catch:{ all -> 0x0061 }
            java.lang.Object r8 = r2.mo72148a(r0)     // Catch:{ all -> 0x0061 }
            if (r8 != r1) goto L_0x0033
            return r1
        L_0x005b:
            kotlin.m r8 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0061 }
            kotlin.jvm.internal.C19388s.m32827J(r5, r3)
            return r6
        L_0x0061:
            r8 = move-exception
            r3 = r5
            goto L_0x0071
        L_0x0064:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x006c:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            throw r3     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r8 = move-exception
        L_0x0071:
            throw r8     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r3, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19508j.m33210t(kotlin.coroutines.c):java.lang.Object");
    }
}
