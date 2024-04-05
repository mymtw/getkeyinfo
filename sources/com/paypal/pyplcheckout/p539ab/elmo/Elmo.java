package com.paypal.pyplcheckout.p539ab.elmo;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.p539ab.C17172Ab;
import com.paypal.pyplcheckout.p539ab.experiment.DataResponse;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentCallback;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentRequest;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentResponse;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import java.util.Map;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;

/* renamed from: com.paypal.pyplcheckout.ab.elmo.Elmo */
public final class Elmo implements C17172Ab {
    private Map<String, ? extends DataResponse> cache;
    private final Context context;
    private final CoroutineDispatcher dispatcher;
    /* access modifiers changed from: private */
    public final ElmoApi elmoApi;
    /* access modifiers changed from: private */
    public final String resource = ElmoAbExperiment.ELMO_RESOURCE;
    private String uuid = "";

    public Elmo(Context context2, ElmoApi elmoApi2, CoroutineDispatcher coroutineDispatcher) {
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        C19383o.m32797g(elmoApi2, "elmoApi");
        C19383o.m32797g(coroutineDispatcher, "dispatcher");
        this.context = context2;
        this.elmoApi = elmoApi2;
        this.dispatcher = coroutineDispatcher;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080 A[Catch:{ Exception -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0081 A[Catch:{ Exception -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00dd A[Catch:{ Exception -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00de A[Catch:{ Exception -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0116 A[Catch:{ Exception -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0117 A[Catch:{ Exception -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011d A[Catch:{ Exception -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012a A[Catch:{ Exception -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchRemoteTreatment(com.paypal.pyplcheckout.p539ab.experiment.ExperimentRequest r9, kotlin.coroutines.C19340c<? super com.paypal.pyplcheckout.p539ab.experiment.ExperimentResponse> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.paypal.pyplcheckout.p539ab.elmo.Elmo$fetchRemoteTreatment$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.paypal.pyplcheckout.ab.elmo.Elmo$fetchRemoteTreatment$1 r0 = (com.paypal.pyplcheckout.p539ab.elmo.Elmo$fetchRemoteTreatment$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.pyplcheckout.ab.elmo.Elmo$fetchRemoteTreatment$1 r0 = new com.paypal.pyplcheckout.ab.elmo.Elmo$fetchRemoteTreatment$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r9 = r0.L$1
            com.paypal.pyplcheckout.ab.experiment.ExperimentRequest r9 = (com.paypal.pyplcheckout.p539ab.experiment.ExperimentRequest) r9
            java.lang.Object r0 = r0.L$0
            com.paypal.pyplcheckout.ab.elmo.Elmo r0 = (com.paypal.pyplcheckout.p539ab.elmo.Elmo) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)     // Catch:{ Exception -> 0x002f }
            goto L_0x0077
        L_0x002f:
            r9 = move-exception
            goto L_0x0139
        L_0x0032:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            java.lang.String r10 = r8.uuid
            int r10 = r10.length()
            if (r10 != 0) goto L_0x0047
            r10 = r3
            goto L_0x0048
        L_0x0047:
            r10 = 0
        L_0x0048:
            if (r10 == 0) goto L_0x0057
            com.paypal.pyplcheckout.ab.experiment.ExperimentResponse$Failure r9 = new com.paypal.pyplcheckout.ab.experiment.ExperimentResponse$Failure
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Must call setup() before requesting ELMO response"
            r10.<init>(r0)
            r9.<init>(r10)
            return r9
        L_0x0057:
            com.paypal.pyplcheckout.utils.PYPLCheckoutUtils$Companion r10 = com.paypal.pyplcheckout.utils.PYPLCheckoutUtils.Companion
            com.paypal.pyplcheckout.utils.PYPLCheckoutUtils r10 = r10.getInstance()
            android.content.Context r2 = r8.context
            java.lang.String r10 = r10.getLocale(r2)
            com.paypal.pyplcheckout.ab.elmo.ElmoApi r2 = r8.elmoApi     // Catch:{ Exception -> 0x002f }
            java.lang.String r4 = r8.uuid     // Catch:{ Exception -> 0x002f }
            java.lang.String r5 = r8.resource     // Catch:{ Exception -> 0x002f }
            r0.L$0 = r8     // Catch:{ Exception -> 0x002f }
            r0.L$1 = r9     // Catch:{ Exception -> 0x002f }
            r0.label = r3     // Catch:{ Exception -> 0x002f }
            java.lang.Object r10 = r2.getExperiments(r4, r5, r10, r0)     // Catch:{ Exception -> 0x002f }
            if (r10 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r0 = r8
        L_0x0077:
            com.paypal.pyplcheckout.ab.elmo.ElmoResponse r10 = (com.paypal.pyplcheckout.p539ab.elmo.ElmoResponse) r10     // Catch:{ Exception -> 0x002f }
            com.paypal.pyplcheckout.ab.elmo.ElmoData r1 = r10.getData()     // Catch:{ Exception -> 0x002f }
            r2 = 0
            if (r1 != 0) goto L_0x0081
            goto L_0x008e
        L_0x0081:
            com.paypal.pyplcheckout.ab.elmo.ElmoExperiment r1 = r1.getElmoExperiment()     // Catch:{ Exception -> 0x002f }
            if (r1 != 0) goto L_0x0088
            goto L_0x008e
        L_0x0088:
            java.util.List r1 = r1.getTreatments()     // Catch:{ Exception -> 0x002f }
            if (r1 != 0) goto L_0x0090
        L_0x008e:
            r4 = r2
            goto L_0x00d4
        L_0x0090:
            int r3 = kotlin.collections.C19322o.m32624F0(r1)     // Catch:{ Exception -> 0x002f }
            int r3 = kotlin.reflect.C19421p.m32930T(r3)     // Catch:{ Exception -> 0x002f }
            r4 = 16
            if (r3 >= r4) goto L_0x009d
            r3 = r4
        L_0x009d:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x002f }
            r4.<init>(r3)     // Catch:{ Exception -> 0x002f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x002f }
        L_0x00a6:
            boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x002f }
            if (r3 == 0) goto L_0x00d4
            java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x002f }
            com.paypal.pyplcheckout.ab.elmo.Treatment r3 = (com.paypal.pyplcheckout.p539ab.elmo.Treatment) r3     // Catch:{ Exception -> 0x002f }
            java.lang.String r5 = r3.getExperimentName()     // Catch:{ Exception -> 0x002f }
            com.paypal.pyplcheckout.ab.experiment.ElmoDataResponse r6 = new com.paypal.pyplcheckout.ab.experiment.ElmoDataResponse     // Catch:{ Exception -> 0x002f }
            java.lang.String r7 = r3.getTreatmentName()     // Catch:{ Exception -> 0x002f }
            java.util.Map r3 = r3.getFactors()     // Catch:{ Exception -> 0x002f }
            r6.<init>(r7, r3)     // Catch:{ Exception -> 0x002f }
            kotlin.Pair r3 = new kotlin.Pair     // Catch:{ Exception -> 0x002f }
            r3.<init>(r5, r6)     // Catch:{ Exception -> 0x002f }
            java.lang.Object r5 = r3.getFirst()     // Catch:{ Exception -> 0x002f }
            java.lang.Object r3 = r3.getSecond()     // Catch:{ Exception -> 0x002f }
            r4.put(r5, r3)     // Catch:{ Exception -> 0x002f }
            goto L_0x00a6
        L_0x00d4:
            r0.setCache(r4)     // Catch:{ Exception -> 0x002f }
            com.paypal.pyplcheckout.ab.elmo.ElmoData r10 = r10.getData()     // Catch:{ Exception -> 0x002f }
            if (r10 != 0) goto L_0x00de
            goto L_0x00eb
        L_0x00de:
            com.paypal.pyplcheckout.ab.elmo.ElmoExperiment r10 = r10.getElmoExperiment()     // Catch:{ Exception -> 0x002f }
            if (r10 != 0) goto L_0x00e5
            goto L_0x00eb
        L_0x00e5:
            java.util.List r10 = r10.getTreatments()     // Catch:{ Exception -> 0x002f }
            if (r10 != 0) goto L_0x00ed
        L_0x00eb:
            r0 = r2
            goto L_0x0114
        L_0x00ed:
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x002f }
        L_0x00f1:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x002f }
            if (r0 == 0) goto L_0x0111
            java.lang.Object r0 = r10.next()     // Catch:{ Exception -> 0x002f }
            r1 = r0
            com.paypal.pyplcheckout.ab.elmo.Treatment r1 = (com.paypal.pyplcheckout.p539ab.elmo.Treatment) r1     // Catch:{ Exception -> 0x002f }
            java.lang.String r1 = r1.getExperimentName()     // Catch:{ Exception -> 0x002f }
            com.paypal.pyplcheckout.ab.experiment.Experiment r3 = r9.getExperiment()     // Catch:{ Exception -> 0x002f }
            java.lang.String r3 = r3.experimentName()     // Catch:{ Exception -> 0x002f }
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r3)     // Catch:{ Exception -> 0x002f }
            if (r1 == 0) goto L_0x00f1
            goto L_0x0112
        L_0x0111:
            r0 = r2
        L_0x0112:
            com.paypal.pyplcheckout.ab.elmo.Treatment r0 = (com.paypal.pyplcheckout.p539ab.elmo.Treatment) r0     // Catch:{ Exception -> 0x002f }
        L_0x0114:
            if (r0 != 0) goto L_0x0117
            goto L_0x011b
        L_0x0117:
            java.lang.String r2 = r0.getTreatmentName()     // Catch:{ Exception -> 0x002f }
        L_0x011b:
            if (r2 != 0) goto L_0x012a
            com.paypal.pyplcheckout.ab.experiment.ExperimentResponse$Failure r9 = new com.paypal.pyplcheckout.ab.experiment.ExperimentResponse$Failure     // Catch:{ Exception -> 0x002f }
            java.lang.Exception r10 = new java.lang.Exception     // Catch:{ Exception -> 0x002f }
            java.lang.String r0 = "Error Parsing Experiment"
            r10.<init>(r0)     // Catch:{ Exception -> 0x002f }
            r9.<init>(r10)     // Catch:{ Exception -> 0x002f }
            return r9
        L_0x012a:
            com.paypal.pyplcheckout.ab.experiment.ExperimentResponse$Success r9 = new com.paypal.pyplcheckout.ab.experiment.ExperimentResponse$Success     // Catch:{ Exception -> 0x002f }
            com.paypal.pyplcheckout.ab.experiment.ElmoDataResponse r10 = new com.paypal.pyplcheckout.ab.experiment.ElmoDataResponse     // Catch:{ Exception -> 0x002f }
            java.util.Map r0 = r0.getFactors()     // Catch:{ Exception -> 0x002f }
            r10.<init>(r2, r0)     // Catch:{ Exception -> 0x002f }
            r9.<init>(r10)     // Catch:{ Exception -> 0x002f }
            goto L_0x013f
        L_0x0139:
            com.paypal.pyplcheckout.ab.experiment.ExperimentResponse$Failure r10 = new com.paypal.pyplcheckout.ab.experiment.ExperimentResponse$Failure
            r10.<init>(r9)
            r9 = r10
        L_0x013f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.p539ab.elmo.Elmo.fetchRemoteTreatment(com.paypal.pyplcheckout.ab.experiment.ExperimentRequest, kotlin.coroutines.c):java.lang.Object");
    }

    public Map<String, DataResponse> getCache() {
        return this.cache;
    }

    public ExperimentResponse getTreatment(ExperimentRequest experimentRequest) {
        C19383o.m32797g(experimentRequest, "experimentRequest");
        if (getCache() == null) {
            new ExperimentResponse.Failure(new Exception("Cache has not been populated yet"));
        }
        Map<String, DataResponse> cache2 = getCache();
        DataResponse dataResponse = cache2 == null ? null : cache2.get(experimentRequest.getExperiment().experimentName());
        return dataResponse == null ? new ExperimentResponse.Failure(new Exception("Experiment not found in cache")) : new ExperimentResponse.Success(dataResponse);
    }

    public void getTreatmentRemote(ExperimentRequest experimentRequest, ExperimentCallback experimentCallback) {
        C19383o.m32797g(experimentRequest, "experimentRequest");
        C19383o.m32797g(experimentCallback, "callback");
        C19697g.m33468f(C19697g.m33463a(this.dispatcher), (CoroutineContext) null, (CoroutineStart) null, new Elmo$getTreatmentRemote$1(this, experimentRequest, experimentCallback, (C19340c<? super Elmo$getTreatmentRemote$1>) null), 3);
    }

    public void setCache(Map<String, ? extends DataResponse> map) {
        this.cache = map;
    }

    public void setup(String str) {
        C19383o.m32797g(str, "uuid");
        this.uuid = str;
        C19697g.m33468f(C19697g.m33463a(this.dispatcher), (CoroutineContext) null, (CoroutineStart) null, new Elmo$setup$1(this, str, PYPLCheckoutUtils.Companion.getInstance().getLocale(this.context), (C19340c<? super Elmo$setup$1>) null), 3);
    }
}
