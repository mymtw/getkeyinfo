package com.etsy.android.p072ad;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p277w8.C8267e;
import p340ea.C12673n;
import p440s9.C13366a;

/* renamed from: com.etsy.android.ad.AdImpressionsUploadWorker */
public final class AdImpressionsUploadWorker extends Worker implements C13366a {

    /* renamed from: h */
    public C12673n f14103h;

    /* renamed from: i */
    public C8267e f14104i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdImpressionsUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(workerParameters, "workerParameters");
    }

    /* renamed from: h */
    public final ListenableWorker.C3367a mo12834h() {
        C19382n.m32757l0(this);
        try {
            C8267e eVar = this.f14104i;
            if (eVar != null) {
                eVar.mo20869c();
                C8267e eVar2 = this.f14104i;
                if (eVar2 != null) {
                    eVar2.mo20870d();
                    return new ListenableWorker.C3367a.C3370c();
                }
                C19383o.m32805o("adImpressionRepository");
                throw null;
            }
            C19383o.m32805o("adImpressionRepository");
            throw null;
        } catch (Exception e) {
            C12673n nVar = this.f14103h;
            if (nVar != null) {
                StringBuilder h = C0072d.m201h("doWork() - Error uploading ad impressions\n");
                h.append(e.getMessage());
                nVar.mo45450b("AdImpressionsUploadWorker", h.toString());
                return new ListenableWorker.C3367a.C3369b();
            }
            C19383o.m32805o("elkLogger");
            throw null;
        }
    }
}
