package com.google.android.play.core.assetpacks;

import java.util.List;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.assetpacks.m1 */
public final /* synthetic */ class C15628m1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C15632n1 f35239b;

    /* renamed from: c */
    public final /* synthetic */ List f35240c;

    /* renamed from: d */
    public final /* synthetic */ C15579a0 f35241d;

    /* renamed from: e */
    public final /* synthetic */ C18614l f35242e;

    public /* synthetic */ C15628m1(C15632n1 n1Var, List list, C15676y1 y1Var, C18614l lVar) {
        this.f35239b = n1Var;
        this.f35240c = list;
        this.f35241d = y1Var;
        this.f35242e = lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            com.google.android.play.core.assetpacks.n1 r0 = r14.f35239b
            java.util.List r1 = r14.f35240c
            com.google.android.play.core.assetpacks.a0 r2 = r14.f35241d
            ul.l r3 = r14.f35242e
            r0.getClass()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
            r5 = 0
        L_0x0016:
            boolean r7 = r1.hasNext()
            r8 = 1
            if (r7 == 0) goto L_0x0075
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            r9 = r2
            com.google.android.play.core.assetpacks.y1 r9 = (com.google.android.play.core.assetpacks.C15676y1) r9
            com.google.android.play.core.assetpacks.q2 r9 = r9.f35418b
            r10 = 8
            com.google.android.play.core.assetpacks.b0 r11 = r9.f35295a
            r11.getClass()
            r12 = 0
            java.lang.String r11 = r11.mo55385m(r7)     // Catch:{ IOException -> 0x0038 }
            if (r11 == 0) goto L_0x0038
            r11 = r8
            goto L_0x0039
        L_0x0038:
            r11 = r12
        L_0x0039:
            r13 = 4
            com.google.android.play.core.assetpacks.b0 r9 = r9.f35295a
            r9.getClass()
            java.lang.String r9 = r9.mo55385m(r7)     // Catch:{ IOException -> 0x0046 }
            if (r9 == 0) goto L_0x0046
            r12 = r8
        L_0x0046:
            if (r12 == 0) goto L_0x0049
            r10 = r13
        L_0x0049:
            com.google.android.play.core.assetpacks.g0 r8 = r0.mo55472j(r10, r7)     // Catch:{ LocalTestingException -> 0x0054 }
            long r9 = r8.f35151e
            long r5 = r5 + r9
            r4.put(r7, r8)
            goto L_0x0016
        L_0x0054:
            r0 = move-exception
            ul.o r1 = r3.f41104a
            java.lang.Object r2 = r1.f41106a
            monitor-enter(r2)
            boolean r3 = r1.f41108c     // Catch:{ all -> 0x0072 }
            r3 = r3 ^ r8
            if (r3 == 0) goto L_0x006a
            r1.f41108c = r8     // Catch:{ all -> 0x0072 }
            r1.f41110e = r0     // Catch:{ all -> 0x0072 }
            monitor-exit(r2)     // Catch:{ all -> 0x0072 }
            ul.k r0 = r1.f41107b
            r0.mo70124b(r1)
            goto L_0x008e
        L_0x006a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "Task is already complete"
            r0.<init>(r1)     // Catch:{ all -> 0x0072 }
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0072 }
            throw r0
        L_0x0075:
            com.google.android.play.core.assetpacks.h0 r0 = new com.google.android.play.core.assetpacks.h0
            r0.<init>(r5, r4)
            ul.o r1 = r3.f41104a
            java.lang.Object r2 = r1.f41106a
            monitor-enter(r2)
            boolean r3 = r1.f41108c     // Catch:{ all -> 0x0097 }
            r3 = r3 ^ r8
            if (r3 == 0) goto L_0x008f
            r1.f41108c = r8     // Catch:{ all -> 0x0097 }
            r1.f41109d = r0     // Catch:{ all -> 0x0097 }
            monitor-exit(r2)     // Catch:{ all -> 0x0097 }
            ul.k r0 = r1.f41107b
            r0.mo70124b(r1)
        L_0x008e:
            return
        L_0x008f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0097 }
            java.lang.String r1 = "Task is already complete"
            r0.<init>(r1)     // Catch:{ all -> 0x0097 }
            throw r0     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0097 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C15628m1.run():void");
    }
}
