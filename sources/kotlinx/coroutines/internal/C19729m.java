package kotlinx.coroutines.internal;

import kotlinx.coroutines.C19764o1;

/* renamed from: kotlinx.coroutines.internal.m */
public final class C19729m {

    /* renamed from: a */
    public static final C19764o1 f43681a;

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r3.hintOnError();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x005e */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            int r1 = kotlinx.coroutines.internal.C19737u.f43688a
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x000a }
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            if (r0 != 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            java.lang.Boolean.parseBoolean(r0)
        L_0x0011:
            java.util.Iterator r0 = androidx.compose.animation.C0472h.m1245h()     // Catch:{ all -> 0x006e }
            kotlin.sequences.g r0 = kotlin.sequences.C19435k.m33000j1(r0)     // Catch:{ all -> 0x006e }
            java.util.ArrayList r0 = kotlin.sequences.SequencesKt___SequencesKt.m32989t1(r0)     // Catch:{ all -> 0x006e }
            java.util.List r0 = p568fn.C17782b.m29867g0(r0)     // Catch:{ all -> 0x006e }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x006e }
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x006e }
            if (r3 != 0) goto L_0x002d
            r3 = r1
            goto L_0x0054
        L_0x002d:
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x006e }
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x006e }
            if (r4 != 0) goto L_0x0038
            goto L_0x0054
        L_0x0038:
            r4 = r3
            kotlinx.coroutines.internal.l r4 = (kotlinx.coroutines.internal.C19728l) r4     // Catch:{ all -> 0x006e }
            int r4 = r4.getLoadPriority()     // Catch:{ all -> 0x006e }
        L_0x003f:
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x006e }
            r6 = r5
            kotlinx.coroutines.internal.l r6 = (kotlinx.coroutines.internal.C19728l) r6     // Catch:{ all -> 0x006e }
            int r6 = r6.getLoadPriority()     // Catch:{ all -> 0x006e }
            if (r4 >= r6) goto L_0x004e
            r3 = r5
            r4 = r6
        L_0x004e:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x006e }
            if (r5 != 0) goto L_0x003f
        L_0x0054:
            kotlinx.coroutines.internal.l r3 = (kotlinx.coroutines.internal.C19728l) r3     // Catch:{ all -> 0x006e }
            if (r3 != 0) goto L_0x0059
            goto L_0x0061
        L_0x0059:
            kotlinx.coroutines.o1 r1 = r3.createDispatcher(r0)     // Catch:{ all -> 0x005e }
            goto L_0x0061
        L_0x005e:
            r3.hintOnError()     // Catch:{ all -> 0x006e }
        L_0x0061:
            if (r1 == 0) goto L_0x0066
            f43681a = r1
            return
        L_0x0066:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006e }
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r0.<init>(r1)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C19729m.<clinit>():void");
    }
}
