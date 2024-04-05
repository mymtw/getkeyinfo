package com.airbnb.lottie;

/* renamed from: com.airbnb.lottie.m */
public final class C4842m implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C4849n f10904b;

    public C4842m(C4849n nVar) {
        this.f10904b = nVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.airbnb.lottie.n r0 = r5.f10904b
            com.airbnb.lottie.l<T> r0 = r0.f11019d
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.airbnb.lottie.n r0 = r5.f10904b
            com.airbnb.lottie.l<T> r0 = r0.f11019d
            V r1 = r0.f10902a
            if (r1 == 0) goto L_0x0032
            com.airbnb.lottie.n r0 = r5.f10904b
            monitor-enter(r0)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x002f }
            java.util.LinkedHashSet r3 = r0.f11016a     // Catch:{ all -> 0x002f }
            r2.<init>(r3)     // Catch:{ all -> 0x002f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x002f }
        L_0x001d:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x002f }
            com.airbnb.lottie.i r3 = (com.airbnb.lottie.C4838i) r3     // Catch:{ all -> 0x002f }
            r3.onResult(r1)     // Catch:{ all -> 0x002f }
            goto L_0x001d
        L_0x002d:
            monitor-exit(r0)
            goto L_0x0073
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0032:
            com.airbnb.lottie.n r1 = r5.f10904b
            java.lang.Throwable r0 = r0.f10903b
            monitor-enter(r1)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashSet r3 = r1.f11017b     // Catch:{ all -> 0x0074 }
            r2.<init>(r3)     // Catch:{ all -> 0x0074 }
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x0074 }
            if (r3 == 0) goto L_0x005e
            java.lang.String r2 = "Lottie encountered an error but no failure listener was added:"
            p3.a r3 = p206p3.C7656b.f16960a     // Catch:{ all -> 0x0074 }
            r3.getClass()     // Catch:{ all -> 0x0074 }
            java.util.HashSet r3 = p206p3.C7655a.f16959a     // Catch:{ all -> 0x0074 }
            boolean r4 = r3.contains(r2)     // Catch:{ all -> 0x0074 }
            if (r4 == 0) goto L_0x0054
            goto L_0x005c
        L_0x0054:
            java.lang.String r4 = "LOTTIE"
            android.util.Log.w(r4, r2, r0)     // Catch:{ all -> 0x0074 }
            r3.add(r2)     // Catch:{ all -> 0x0074 }
        L_0x005c:
            monitor-exit(r1)
            goto L_0x0073
        L_0x005e:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0074 }
        L_0x0062:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0074 }
            if (r3 == 0) goto L_0x0072
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0074 }
            com.airbnb.lottie.i r3 = (com.airbnb.lottie.C4838i) r3     // Catch:{ all -> 0x0074 }
            r3.onResult(r0)     // Catch:{ all -> 0x0074 }
            goto L_0x0062
        L_0x0072:
            monitor-exit(r1)
        L_0x0073:
            return
        L_0x0074:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.C4842m.run():void");
    }
}
