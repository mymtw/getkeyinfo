package com.paypal.pyplcheckout.common.instrumentation.amplitude.repository;

import android.support.p013v4.media.session.C0087d;
import com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.dao.AmplitudeDao;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeSession;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.UserProperties;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AmplitudeRepository {
    private final String TAG = "AmplitudeRepository";
    private final AmplitudeApi api;
    private final AmplitudeDao dao;
    private boolean isInitialized;
    private final AtomicBoolean isUploadingEvents = new AtomicBoolean(false);

    public AmplitudeRepository(AmplitudeDao amplitudeDao, AmplitudeApi amplitudeApi) {
        C19383o.m32797g(amplitudeDao, "dao");
        C19383o.m32797g(amplitudeApi, "api");
        this.dao = amplitudeDao;
        this.api = amplitudeApi;
    }

    private final AmplitudeSession getAmplitudeSession() {
        return this.dao.getAmplitudeSession();
    }

    private final void logUploadedPendingEvents(List<AmplitudeEvent> list, List<AmplitudeEvent> list2) {
        PLog.transition$default(PEnums.TransitionName.UPLOAD_PENDING_AMPLITUDE_EVENTS, PEnums.Outcome.ATTEMPTED, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, C0087d.m235e("attempted: ", list.size(), " failed: ", list2.size()), (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15356, (Object) null);
    }

    private final void setAmplitudeSession(AmplitudeSession amplitudeSession) {
        this.dao.cacheAmplitudeSession(amplitudeSession);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object storeFailedEvents(java.util.List<com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent> r7, kotlin.coroutines.C19340c<? super kotlin.C19394m> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository$storeFailedEvents$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository$storeFailedEvents$1 r0 = (com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository$storeFailedEvents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository$storeFailedEvents$1 r0 = new com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository$storeFailedEvents$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository r7 = (com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)     // Catch:{ Exception -> 0x002b }
            goto L_0x0067
        L_0x002b:
            r8 = move-exception
            goto L_0x0047
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            com.paypal.pyplcheckout.common.instrumentation.amplitude.dao.AmplitudeDao r8 = r6.dao     // Catch:{ Exception -> 0x0045 }
            r0.L$0 = r6     // Catch:{ Exception -> 0x0045 }
            r0.label = r3     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r7 = r8.cachePendingEvents(r7, r0)     // Catch:{ Exception -> 0x0045 }
            if (r7 != r1) goto L_0x0067
            return r1
        L_0x0045:
            r8 = move-exception
            r7 = r6
        L_0x0047:
            java.lang.String r0 = r7.TAG
            java.lang.String r7 = "TAG"
            kotlin.jvm.internal.C19383o.m32796f(r0, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Error caching pending Amplitude events "
            r7.append(r1)
            r7.append(r8)
            java.lang.String r1 = r7.toString()
            r2 = 0
            r3 = 0
            r4 = 12
            r5 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.e$default(r0, r1, r2, r3, r4, r5)
        L_0x0067:
            kotlin.m r7 = kotlin.C19394m.f43287a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository.storeFailedEvents(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    public final void clearUserSession() {
        AmplitudeSession amplitudeSession = getAmplitudeSession();
        setAmplitudeSession(amplitudeSession == null ? null : AmplitudeSession.copy$default(amplitudeSession, (String) null, (String) null, 0, (UserProperties) null, 14, (Object) null));
        this.isInitialized = false;
    }

    public final void initializeSession(String str) {
        AmplitudeSession amplitudeSession;
        AmplitudeSession amplitudeSession2 = getAmplitudeSession();
        if (!this.isInitialized || amplitudeSession2 == null) {
            this.isInitialized = true;
            amplitudeSession = new AmplitudeSession(str, (String) null, 0, (UserProperties) null, 14, (DefaultConstructorMarker) null);
        } else {
            amplitudeSession = AmplitudeSession.copy$default(amplitudeSession2, str, (String) null, 0, (UserProperties) null, 14, (Object) null);
        }
        setAmplitudeSession(amplitudeSession);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object logEvent(java.lang.String r12, org.json.JSONObject r13, kotlin.coroutines.C19340c<? super kotlin.C19394m> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository$logEvent$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository$logEvent$1 r0 = (com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository$logEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository$logEvent$1 r0 = new com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository$logEvent$1
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            goto L_0x007c
        L_0x002a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0032:
            java.lang.Object r12 = r0.L$0
            com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository r12 = (com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository) r12
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)     // Catch:{ AmplitudeApiException -> 0x003a }
            goto L_0x007c
        L_0x003a:
            r13 = move-exception
            goto L_0x0068
        L_0x003c:
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeSession r14 = r11.getAmplitudeSession()
            if (r14 != 0) goto L_0x0059
            java.lang.String r5 = r11.TAG
            java.lang.String r12 = "TAG"
            kotlin.jvm.internal.C19383o.m32796f(r5, r12)
            r7 = 0
            r8 = 0
            r9 = 12
            r10 = 0
            java.lang.String r6 = "AmplitudeSession not initialized."
            com.paypal.pyplcheckout.common.instrumentation.PLog.e$default(r5, r6, r7, r8, r9, r10)
            kotlin.m r12 = kotlin.C19394m.f43287a
            return r12
        L_0x0059:
            com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi r2 = r11.api     // Catch:{ AmplitudeApiException -> 0x0066 }
            r0.L$0 = r11     // Catch:{ AmplitudeApiException -> 0x0066 }
            r0.label = r4     // Catch:{ AmplitudeApiException -> 0x0066 }
            java.lang.Object r12 = r2.logEvent(r14, r12, r13, r0)     // Catch:{ AmplitudeApiException -> 0x0066 }
            if (r12 != r1) goto L_0x007c
            return r1
        L_0x0066:
            r13 = move-exception
            r12 = r11
        L_0x0068:
            com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent r13 = r13.getEvent()
            java.util.List r13 = p568fn.C17782b.m29864d0(r13)
            r14 = 0
            r0.L$0 = r14
            r0.label = r3
            java.lang.Object r12 = r12.storeFailedEvents(r13, r0)
            if (r12 != r1) goto L_0x007c
            return r1
        L_0x007c:
            kotlin.m r12 = kotlin.C19394m.f43287a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository.logEvent(java.lang.String, org.json.JSONObject, kotlin.coroutines.c):java.lang.Object");
    }

    public final void setUserProperties(UserProperties userProperties) {
        C19383o.m32797g(userProperties, "userProperties");
        AmplitudeSession amplitudeSession = getAmplitudeSession();
        setAmplitudeSession(amplitudeSession == null ? null : AmplitudeSession.copy$default(amplitudeSession, (String) null, (String) null, 0, userProperties, 7, (Object) null));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:52|53|54|55|56|57|(1:59)(8:61|62|63|64|(2:66|67)|74|50|(1:75)(0))|59|60) */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0142, code lost:
        r12 = r0;
        r11 = r4;
        r13 = r8;
        r4 = r18;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0147 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095 A[SYNTHETIC, Splitter:B:27:0x0095] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0165 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Object uploadFailedEvents(kotlin.coroutines.C19340c<? super kotlin.C19394m> r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            monitor-enter(r20)
            boolean r2 = r0 instanceof com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository$uploadFailedEvents$1     // Catch:{ all -> 0x0192 }
            if (r2 == 0) goto L_0x0018
            r2 = r0
            com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository$uploadFailedEvents$1 r2 = (com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository$uploadFailedEvents$1) r2     // Catch:{ all -> 0x0192 }
            int r3 = r2.label     // Catch:{ all -> 0x0192 }
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.label = r3     // Catch:{ all -> 0x0192 }
            goto L_0x001d
        L_0x0018:
            com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository$uploadFailedEvents$1 r2 = new com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository$uploadFailedEvents$1     // Catch:{ all -> 0x0192 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0192 }
        L_0x001d:
            java.lang.Object r0 = r2.result     // Catch:{ all -> 0x0192 }
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED     // Catch:{ all -> 0x0192 }
            int r4 = r2.label     // Catch:{ all -> 0x0192 }
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            if (r4 == 0) goto L_0x0095
            if (r4 == r9) goto L_0x007c
            if (r4 == r7) goto L_0x0063
            if (r4 == r6) goto L_0x004b
            if (r4 != r5) goto L_0x0043
            java.lang.Object r3 = r2.L$2     // Catch:{ all -> 0x0192 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0192 }
            java.lang.Object r4 = r2.L$1     // Catch:{ all -> 0x0192 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x0192 }
            java.lang.Object r2 = r2.L$0     // Catch:{ all -> 0x0192 }
            com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository r2 = (com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository) r2     // Catch:{ all -> 0x0192 }
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)     // Catch:{ all -> 0x0192 }
            goto L_0x0184
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0192 }
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)     // Catch:{ all -> 0x0192 }
            throw r0     // Catch:{ all -> 0x0192 }
        L_0x004b:
            java.lang.Object r4 = r2.L$2     // Catch:{ all -> 0x0192 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x0192 }
            java.lang.Object r6 = r2.L$1     // Catch:{ all -> 0x0192 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x0192 }
            java.lang.Object r7 = r2.L$0     // Catch:{ all -> 0x0192 }
            com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository r7 = (com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository) r7     // Catch:{ all -> 0x0192 }
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)     // Catch:{ all -> 0x0192 }
            r0 = r2
            r2 = r7
        L_0x005c:
            r19 = r4
            r4 = r3
            r3 = r19
            goto L_0x016c
        L_0x0063:
            java.lang.Object r4 = r2.L$4     // Catch:{ all -> 0x0192 }
            com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent r4 = (com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent) r4     // Catch:{ all -> 0x0192 }
            java.lang.Object r10 = r2.L$3     // Catch:{ all -> 0x0192 }
            java.util.Iterator r10 = (java.util.Iterator) r10     // Catch:{ all -> 0x0192 }
            java.lang.Object r11 = r2.L$2     // Catch:{ all -> 0x0192 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0192 }
            java.lang.Object r12 = r2.L$1     // Catch:{ all -> 0x0192 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x0192 }
            java.lang.Object r13 = r2.L$0     // Catch:{ all -> 0x0192 }
            com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository r13 = (com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository) r13     // Catch:{ all -> 0x0192 }
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)     // Catch:{ Exception -> 0x0147 }
            goto L_0x014a
        L_0x007c:
            java.lang.Object r4 = r2.L$4     // Catch:{ all -> 0x0192 }
            com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent r4 = (com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent) r4     // Catch:{ all -> 0x0192 }
            java.lang.Object r10 = r2.L$3     // Catch:{ all -> 0x0192 }
            java.util.Iterator r10 = (java.util.Iterator) r10     // Catch:{ all -> 0x0192 }
            java.lang.Object r11 = r2.L$2     // Catch:{ all -> 0x0192 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0192 }
            java.lang.Object r12 = r2.L$1     // Catch:{ all -> 0x0192 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x0192 }
            java.lang.Object r13 = r2.L$0     // Catch:{ all -> 0x0192 }
            com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository r13 = (com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository) r13     // Catch:{ all -> 0x0192 }
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)     // Catch:{ Exception -> 0x0147 }
            goto L_0x0129
        L_0x0095:
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)     // Catch:{ all -> 0x0192 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.isUploadingEvents     // Catch:{ all -> 0x0192 }
            boolean r0 = r0.compareAndSet(r8, r9)     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x00a4
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0192 }
            monitor-exit(r20)
            return r0
        L_0x00a4:
            com.paypal.pyplcheckout.common.instrumentation.amplitude.dao.AmplitudeDao r0 = r1.dao     // Catch:{ all -> 0x0192 }
            java.util.List r0 = r0.getPendingEvents()     // Catch:{ all -> 0x0192 }
            boolean r4 = r0.isEmpty()     // Catch:{ all -> 0x0192 }
            if (r4 == 0) goto L_0x00b9
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.isUploadingEvents     // Catch:{ all -> 0x0192 }
            r0.set(r8)     // Catch:{ all -> 0x0192 }
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0192 }
            monitor-exit(r20)
            return r0
        L_0x00b9:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0192 }
            r4.<init>()     // Catch:{ all -> 0x0192 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0192 }
            r10.<init>()     // Catch:{ all -> 0x0192 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x0192 }
        L_0x00c7:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0192 }
            if (r12 == 0) goto L_0x00ee
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0192 }
            r13 = r12
            com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent r13 = (com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent) r13     // Catch:{ all -> 0x0192 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0192 }
            long r16 = r13.getTimestamp()     // Catch:{ all -> 0x0192 }
            long r14 = r14 - r16
            r16 = 2592000(0x278d00, double:1.280618E-317)
            int r13 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r13 >= 0) goto L_0x00e7
            r13 = r9
            goto L_0x00e8
        L_0x00e7:
            r13 = r8
        L_0x00e8:
            if (r13 == 0) goto L_0x00c7
            r10.add(r12)     // Catch:{ all -> 0x0192 }
            goto L_0x00c7
        L_0x00ee:
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0192 }
            r15 = r1
        L_0x00f3:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x0192 }
            if (r11 == 0) goto L_0x014f
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x0192 }
            r14 = r11
            com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent r14 = (com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent) r14     // Catch:{ all -> 0x0192 }
            com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi r11 = r15.api     // Catch:{ Exception -> 0x013f }
            r13 = 0
            r16 = 2
            r17 = 0
            r2.L$0 = r15     // Catch:{ Exception -> 0x013f }
            r2.L$1 = r0     // Catch:{ Exception -> 0x013f }
            r2.L$2 = r4     // Catch:{ Exception -> 0x013f }
            r2.L$3 = r10     // Catch:{ Exception -> 0x013f }
            r2.L$4 = r14     // Catch:{ Exception -> 0x013f }
            r2.label = r9     // Catch:{ Exception -> 0x013f }
            r12 = r14
            r18 = r14
            r14 = r2
            r8 = r15
            r15 = r16
            r16 = r17
            java.lang.Object r11 = com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi.logEvent$default(r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0142 }
            if (r11 != r3) goto L_0x0124
            monitor-exit(r20)
            return r3
        L_0x0124:
            r12 = r0
            r11 = r4
            r13 = r8
            r4 = r18
        L_0x0129:
            r14 = 2
            r2.L$0 = r13     // Catch:{ Exception -> 0x0147 }
            r2.L$1 = r12     // Catch:{ Exception -> 0x0147 }
            r2.L$2 = r11     // Catch:{ Exception -> 0x0147 }
            r2.L$3 = r10     // Catch:{ Exception -> 0x0147 }
            r2.L$4 = r4     // Catch:{ Exception -> 0x0147 }
            r2.label = r7     // Catch:{ Exception -> 0x0147 }
            java.lang.Object r0 = p628nj.C18263b.m30814I(r14, r2)     // Catch:{ Exception -> 0x0147 }
            if (r0 != r3) goto L_0x014a
            monitor-exit(r20)
            return r3
        L_0x013f:
            r18 = r14
            r8 = r15
        L_0x0142:
            r12 = r0
            r11 = r4
            r13 = r8
            r4 = r18
        L_0x0147:
            r11.add(r4)     // Catch:{ all -> 0x0192 }
        L_0x014a:
            r4 = r11
            r0 = r12
            r15 = r13
            r8 = 0
            goto L_0x00f3
        L_0x014f:
            r8 = r15
            com.paypal.pyplcheckout.common.instrumentation.amplitude.dao.AmplitudeDao r7 = r8.dao     // Catch:{ all -> 0x0192 }
            r2.L$0 = r8     // Catch:{ all -> 0x0192 }
            r2.L$1 = r0     // Catch:{ all -> 0x0192 }
            r2.L$2 = r4     // Catch:{ all -> 0x0192 }
            r10 = 0
            r2.L$3 = r10     // Catch:{ all -> 0x0192 }
            r2.L$4 = r10     // Catch:{ all -> 0x0192 }
            r2.label = r6     // Catch:{ all -> 0x0192 }
            java.lang.Object r6 = r7.clearPendingEvents(r2)     // Catch:{ all -> 0x0192 }
            if (r6 != r3) goto L_0x0167
            monitor-exit(r20)
            return r3
        L_0x0167:
            r6 = r0
            r0 = r2
            r2 = r8
            goto L_0x005c
        L_0x016c:
            boolean r7 = r3.isEmpty()     // Catch:{ all -> 0x0192 }
            r7 = r7 ^ r9
            if (r7 == 0) goto L_0x0185
            r0.L$0 = r2     // Catch:{ all -> 0x0192 }
            r0.L$1 = r6     // Catch:{ all -> 0x0192 }
            r0.L$2 = r3     // Catch:{ all -> 0x0192 }
            r0.label = r5     // Catch:{ all -> 0x0192 }
            java.lang.Object r0 = r2.storeFailedEvents(r3, r0)     // Catch:{ all -> 0x0192 }
            if (r0 != r4) goto L_0x0183
            monitor-exit(r20)
            return r4
        L_0x0183:
            r4 = r6
        L_0x0184:
            r6 = r4
        L_0x0185:
            r2.logUploadedPendingEvents(r6, r3)     // Catch:{ all -> 0x0192 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.isUploadingEvents     // Catch:{ all -> 0x0192 }
            r2 = 0
            r0.set(r2)     // Catch:{ all -> 0x0192 }
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0192 }
            monitor-exit(r20)
            return r0
        L_0x0192:
            r0 = move-exception
            monitor-exit(r20)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository.uploadFailedEvents(kotlin.coroutines.c):java.lang.Object");
    }
}
