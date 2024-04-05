package com.google.common.base;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.base.t */
public final class C15805t {
    @NullableDecl

    /* renamed from: a */
    public static final Object f35589a;

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005c */
    static {
        /*
            java.lang.String r0 = "sun.misc.JavaLangAccess"
            java.lang.String r1 = "getJavaLangAccess"
            java.lang.String r2 = "sun.misc.SharedSecrets"
            r3 = 0
            r4 = 0
            java.lang.Class r5 = java.lang.Class.forName(r2, r4, r3)     // Catch:{ ThreadDeath -> 0x0070, all -> 0x0019 }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ThreadDeath -> 0x0070, all -> 0x0019 }
            java.lang.reflect.Method r5 = r5.getMethod(r1, r6)     // Catch:{ ThreadDeath -> 0x0070, all -> 0x0019 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ ThreadDeath -> 0x0070, all -> 0x0019 }
            java.lang.Object r5 = r5.invoke(r3, r6)     // Catch:{ ThreadDeath -> 0x0070, all -> 0x0019 }
            goto L_0x001a
        L_0x0019:
            r5 = r3
        L_0x001a:
            f35589a = r5
            r6 = 1
            if (r5 != 0) goto L_0x0020
            goto L_0x0034
        L_0x0020:
            r7 = 2
            java.lang.Class[] r7 = new java.lang.Class[r7]
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            r7[r4] = r8
            java.lang.Class r8 = java.lang.Integer.TYPE
            r7[r6] = r8
            java.lang.String r8 = "getStackTraceElement"
            java.lang.Class r9 = java.lang.Class.forName(r0, r4, r3)     // Catch:{ ThreadDeath -> 0x006e, all -> 0x0034 }
            r9.getMethod(r8, r7)     // Catch:{ ThreadDeath -> 0x006e, all -> 0x0034 }
        L_0x0034:
            if (r5 != 0) goto L_0x0037
            goto L_0x006d
        L_0x0037:
            java.lang.String r5 = "getStackTraceDepth"
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x006d }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            r7[r4] = r8     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x006d }
            java.lang.Class r0 = java.lang.Class.forName(r0, r4, r3)     // Catch:{ ThreadDeath -> 0x006b, all -> 0x0048 }
            java.lang.reflect.Method r0 = r0.getMethod(r5, r7)     // Catch:{ ThreadDeath -> 0x006b, all -> 0x0048 }
            goto L_0x0049
        L_0x0048:
            r0 = r3
        L_0x0049:
            if (r0 != 0) goto L_0x004c
            goto L_0x006d
        L_0x004c:
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r3)     // Catch:{ ThreadDeath -> 0x0069, all -> 0x005c }
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ ThreadDeath -> 0x0069, all -> 0x005c }
            java.lang.reflect.Method r1 = r2.getMethod(r1, r5)     // Catch:{ ThreadDeath -> 0x0069, all -> 0x005c }
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ ThreadDeath -> 0x0069, all -> 0x005c }
            java.lang.Object r3 = r1.invoke(r3, r2)     // Catch:{ ThreadDeath -> 0x0069, all -> 0x005c }
        L_0x005c:
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x006d }
            java.lang.Throwable r2 = new java.lang.Throwable     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x006d }
            r2.<init>()     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x006d }
            r1[r4] = r2     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x006d }
            r0.invoke(r3, r1)     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x006d }
            goto L_0x006d
        L_0x0069:
            r0 = move-exception
            throw r0     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x006d }
        L_0x006b:
            r0 = move-exception
            throw r0     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x006d }
        L_0x006d:
            return
        L_0x006e:
            r0 = move-exception
            throw r0
        L_0x0070:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.C15805t.<clinit>():void");
    }

    /* renamed from: a */
    public static void m25629a(Exception exc) {
        if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        } else if (exc instanceof Error) {
            throw ((Error) exc);
        }
    }
}
