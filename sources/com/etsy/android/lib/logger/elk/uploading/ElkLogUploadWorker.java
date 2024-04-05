package com.etsy.android.lib.logger.elk.uploading;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p340ea.C12677p;
import p440s9.C13366a;

public final class ElkLogUploadWorker extends Worker implements C13366a {

    /* renamed from: j */
    public static final Object f19066j = new Object();

    /* renamed from: h */
    public C12677p f19067h;

    /* renamed from: i */
    public C8682c f19068i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ElkLogUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(workerParameters, "workerParameters");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        return r1;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.work.ListenableWorker.C3367a mo12834h() {
        /*
            r6 = this;
            kotlin.jvm.internal.C19382n.m32757l0(r6)
            java.lang.Object r0 = f19066j
            monitor-enter(r0)
            androidx.work.WorkerParameters r1 = r6.f7854c     // Catch:{ all -> 0x002b }
            int r2 = r1.f7864c     // Catch:{ all -> 0x002b }
            r3 = 20
            if (r2 < r3) goto L_0x0015
            androidx.work.ListenableWorker$a$a r1 = new androidx.work.ListenableWorker$a$a     // Catch:{ all -> 0x002b }
            r1.<init>()     // Catch:{ all -> 0x002b }
            monitor-exit(r0)
            return r1
        L_0x0015:
            r2 = 0
            androidx.work.e r1 = r1.f7863b     // Catch:{ Exception -> 0x002d }
            java.util.HashMap r1 = r1.f7899a     // Catch:{ Exception -> 0x002d }
            java.lang.String r3 = "should_drain_queue"
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x002d }
            boolean r3 = r1 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x002d }
            if (r3 == 0) goto L_0x002f
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x002d }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x002d }
            goto L_0x0030
        L_0x002b:
            r1 = move-exception
            goto L_0x0077
        L_0x002d:
            r1 = move-exception
            goto L_0x004c
        L_0x002f:
            r1 = 0
        L_0x0030:
            com.etsy.android.lib.logger.elk.uploading.c r3 = r6.f19068i     // Catch:{ Exception -> 0x002d }
            if (r3 == 0) goto L_0x0046
            boolean r1 = r3.mo21338a(r1)     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x0040
            androidx.work.ListenableWorker$a$c r1 = new androidx.work.ListenableWorker$a$c     // Catch:{ Exception -> 0x002d }
            r1.<init>()     // Catch:{ Exception -> 0x002d }
            goto L_0x006f
        L_0x0040:
            androidx.work.ListenableWorker$a$b r1 = new androidx.work.ListenableWorker$a$b     // Catch:{ Exception -> 0x002d }
            r1.<init>()     // Catch:{ Exception -> 0x002d }
            goto L_0x006f
        L_0x0046:
            java.lang.String r1 = "elkLogUpload"
            kotlin.jvm.internal.C19383o.m32805o(r1)     // Catch:{ Exception -> 0x002d }
            throw r2     // Catch:{ Exception -> 0x002d }
        L_0x004c:
            ea.p r3 = r6.f19067h     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0071
            java.lang.String r2 = "ElkLogUploadWorker"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
            r4.<init>()     // Catch:{ all -> 0x002b }
            java.lang.String r5 = "doWork() - Error uploading ELK logs\n"
            r4.append(r5)     // Catch:{ all -> 0x002b }
            java.lang.String r5 = r1.getMessage()     // Catch:{ all -> 0x002b }
            r4.append(r5)     // Catch:{ all -> 0x002b }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x002b }
            r3.mo45452a(r2, r4, r1)     // Catch:{ all -> 0x002b }
            androidx.work.ListenableWorker$a$a r1 = new androidx.work.ListenableWorker$a$a     // Catch:{ all -> 0x002b }
            r1.<init>()     // Catch:{ all -> 0x002b }
        L_0x006f:
            monitor-exit(r0)
            return r1
        L_0x0071:
            java.lang.String r1 = "workerElkLogger"
            kotlin.jvm.internal.C19383o.m32805o(r1)     // Catch:{ all -> 0x002b }
            throw r2     // Catch:{ all -> 0x002b }
        L_0x0077:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.logger.elk.uploading.ElkLogUploadWorker.mo12834h():androidx.work.ListenableWorker$a");
    }
}
