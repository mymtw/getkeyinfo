package com.etsy.android.lib.core.posts;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p340ea.C12677p;
import p440s9.C13366a;
import p463v9.C13541d;

public final class EtsyPostWorker extends Worker implements C13366a {

    /* renamed from: j */
    public static final Object f18956j = new Object();

    /* renamed from: h */
    public C13541d f18957h;

    /* renamed from: i */
    public C12677p f18958i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EtsyPostWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(workerParameters, "workerParameters");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        return r2;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.work.ListenableWorker.C3367a mo12834h() {
        /*
            r6 = this;
            kotlin.jvm.internal.C19382n.m32757l0(r6)
            java.lang.Object r0 = f18956j
            monitor-enter(r0)
            androidx.work.WorkerParameters r1 = r6.f7854c     // Catch:{ all -> 0x0032 }
            int r1 = r1.f7864c     // Catch:{ all -> 0x0032 }
            r2 = 20
            if (r1 < r2) goto L_0x0015
            androidx.work.ListenableWorker$a$a r1 = new androidx.work.ListenableWorker$a$a     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)
            return r1
        L_0x0015:
            r1 = 0
            v9.d r2 = r6.f18957h     // Catch:{ Exception -> 0x0034 }
            if (r2 == 0) goto L_0x002c
            boolean r2 = r2.mo46200d()     // Catch:{ Exception -> 0x0034 }
            if (r2 == 0) goto L_0x0026
            androidx.work.ListenableWorker$a$c r2 = new androidx.work.ListenableWorker$a$c     // Catch:{ Exception -> 0x0034 }
            r2.<init>()     // Catch:{ Exception -> 0x0034 }
            goto L_0x0058
        L_0x0026:
            androidx.work.ListenableWorker$a$b r2 = new androidx.work.ListenableWorker$a$b     // Catch:{ Exception -> 0x0034 }
            r2.<init>()     // Catch:{ Exception -> 0x0034 }
            goto L_0x0058
        L_0x002c:
            java.lang.String r2 = "etsyPostUpload"
            kotlin.jvm.internal.C19383o.m32805o(r2)     // Catch:{ Exception -> 0x0034 }
            throw r1     // Catch:{ Exception -> 0x0034 }
        L_0x0032:
            r1 = move-exception
            goto L_0x0060
        L_0x0034:
            r2 = move-exception
            ea.p r3 = r6.f18958i     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x005a
            java.lang.String r1 = "EtsyPostWorker"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r4.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r5 = "doWork() - Error uploading Etsy Post events\n"
            r4.append(r5)     // Catch:{ all -> 0x0032 }
            java.lang.String r5 = r2.getMessage()     // Catch:{ all -> 0x0032 }
            r4.append(r5)     // Catch:{ all -> 0x0032 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0032 }
            r3.mo45452a(r1, r4, r2)     // Catch:{ all -> 0x0032 }
            androidx.work.ListenableWorker$a$b r2 = new androidx.work.ListenableWorker$a$b     // Catch:{ all -> 0x0032 }
            r2.<init>()     // Catch:{ all -> 0x0032 }
        L_0x0058:
            monitor-exit(r0)
            return r2
        L_0x005a:
            java.lang.String r2 = "workerElkLogger"
            kotlin.jvm.internal.C19383o.m32805o(r2)     // Catch:{ all -> 0x0032 }
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x0060:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.core.posts.EtsyPostWorker.mo12834h():androidx.work.ListenableWorker$a");
    }
}
