package com.etsy.android.p327ui.search.p330v2.impressions;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p340ea.C12677p;
import p422pe.C13225d;
import p440s9.C13366a;

/* renamed from: com.etsy.android.ui.search.v2.impressions.SearchImpressionsUploadWorker */
public final class SearchImpressionsUploadWorker extends Worker implements C13366a {

    /* renamed from: h */
    public C12677p f24451h;

    /* renamed from: i */
    public C13225d f24452i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchImpressionsUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(workerParameters, "workerParameters");
    }

    /* renamed from: h */
    public final ListenableWorker.C3367a mo12834h() {
        C19382n.m32757l0(this);
        try {
            C13225d dVar = this.f24452i;
            if (dVar != null) {
                dVar.mo45932a();
                return new ListenableWorker.C3367a.C3370c();
            }
            C19383o.m32805o("searchImpressionRepository");
            throw null;
        } catch (Exception e) {
            C12677p pVar = this.f24451h;
            if (pVar != null) {
                StringBuilder h = C0072d.m201h("doWork() - Error uploading search impressions\n");
                h.append(e.getMessage());
                pVar.mo45452a("SearchImpressionsUploadWorker", h.toString(), e);
            } else {
                C19383o.m32805o("workerElkLogger");
                throw null;
            }
        }
    }
}
