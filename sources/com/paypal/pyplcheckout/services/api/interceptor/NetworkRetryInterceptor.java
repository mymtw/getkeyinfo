package com.paypal.pyplcheckout.services.api.interceptor;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.C0761x;
import com.facebook.login.LoginFragment;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.C19294b0;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.C19456j;
import kotlinx.coroutines.C19697g;
import okhttp3.C19928a0;
import okhttp3.C19994o;
import okhttp3.C19997p;
import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20016y;
import okhttp3.C20018z;
import p735br.C18980c;

public final class NetworkRetryInterceptor implements C20000q {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int DEFAULT_MAX_RETRIES_COUNT = 3;
    public static final long DEFAULT_MAX_RETRIES_DURATION = 10000;
    public static final long DEFAULT_RETRY_DELAY = 2000;
    public static final String RETRY_DELAY_HEADER = "x-retry-delay";
    public static final String RETRY_MAX_COUNT_HEADER = "x-retry-max-count";
    public static final String RETRY_TIMEOUT_HEADER = "x-retry-timeout";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class RetryConfiguration {
        private final long delay;
        private final int maxRetriesCount;
        private final long maxRetriesDuration;
        private final C20011u request;

        public RetryConfiguration(C20011u uVar, int i, long j, long j2) {
            C19383o.m32797g(uVar, LoginFragment.EXTRA_REQUEST);
            this.request = uVar;
            this.maxRetriesCount = i;
            this.maxRetriesDuration = j;
            this.delay = j2;
        }

        public static /* synthetic */ RetryConfiguration copy$default(RetryConfiguration retryConfiguration, C20011u uVar, int i, long j, long j2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uVar = retryConfiguration.request;
            }
            if ((i2 & 2) != 0) {
                i = retryConfiguration.maxRetriesCount;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                j = retryConfiguration.maxRetriesDuration;
            }
            long j3 = j;
            if ((i2 & 8) != 0) {
                j2 = retryConfiguration.delay;
            }
            return retryConfiguration.copy(uVar, i3, j3, j2);
        }

        public final C20011u component1() {
            return this.request;
        }

        public final int component2() {
            return this.maxRetriesCount;
        }

        public final long component3() {
            return this.maxRetriesDuration;
        }

        public final long component4() {
            return this.delay;
        }

        public final RetryConfiguration copy(C20011u uVar, int i, long j, long j2) {
            C19383o.m32797g(uVar, LoginFragment.EXTRA_REQUEST);
            return new RetryConfiguration(uVar, i, j, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RetryConfiguration)) {
                return false;
            }
            RetryConfiguration retryConfiguration = (RetryConfiguration) obj;
            return C19383o.m32792b(this.request, retryConfiguration.request) && this.maxRetriesCount == retryConfiguration.maxRetriesCount && this.maxRetriesDuration == retryConfiguration.maxRetriesDuration && this.delay == retryConfiguration.delay;
        }

        public final long getDelay() {
            return this.delay;
        }

        public final int getMaxRetriesCount() {
            return this.maxRetriesCount;
        }

        public final long getMaxRetriesDuration() {
            return this.maxRetriesDuration;
        }

        public final C20011u getRequest() {
            return this.request;
        }

        public int hashCode() {
            return Long.hashCode(this.delay) + C0071c.m190b(this.maxRetriesDuration, C0069a.m170a(this.maxRetriesCount, this.request.hashCode() * 31, 31), 31);
        }

        public String toString() {
            C20011u uVar = this.request;
            int i = this.maxRetriesCount;
            long j = this.maxRetriesDuration;
            long j2 = this.delay;
            return "RetryConfiguration(request=" + uVar + ", maxRetriesCount=" + i + ", maxRetriesDuration=" + j + ", delay=" + j2 + ")";
        }
    }

    private final void logRequestError(C20018z zVar, Throwable th) {
        String str;
        C19928a0 a0Var;
        C20018z zVar2 = zVar;
        Throwable th2 = th;
        Exception exc = th2 == null ? null : new Exception(th2);
        if (exc == null) {
            if (zVar2 == null || (a0Var = zVar2.f44368i) == null || (str = a0Var.mo72844g()) == null) {
                str = "n/a";
            }
            exc = new Exception(C0326j.m864i("Api call did not succeed -> ", str));
        }
        Exception exc2 = exc;
        PLog pLog = PLog.INSTANCE;
        PEnums.TransitionName transitionName = PEnums.TransitionName.RETRY_ON_FAILURE;
        PEnums.ErrorType errorType = PEnums.ErrorType.WARNING;
        PEnums.EventCode eventCode = PEnums.EventCode.E637;
        String localizedMessage = exc2.getLocalizedMessage();
        PLog.error$default(errorType, eventCode, localizedMessage == null ? "n/a" : localizedMessage, (String) null, exc2, transitionName, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1992, (Object) null);
    }

    private final void logRetryDecision(C20018z zVar, Throwable th, int i) {
        Throwable th2;
        C19928a0 a0Var;
        C20018z zVar2 = zVar;
        if (th == null) {
            String str = null;
            if (!(zVar2 == null || (a0Var = zVar2.f44368i) == null)) {
                str = a0Var.mo72844g();
            }
            th2 = new Exception(C0326j.m864i("Api call did not succeed -> ", str));
        } else {
            th2 = th;
        }
        PEnums.TransitionName transitionName = PEnums.TransitionName.RETRY_ON_FAILURE;
        PEnums.Outcome outcome = PEnums.Outcome.ATTEMPTED;
        PEnums.StateName stateName = PEnums.StateName.CUSTOM_STATE_NAME.setStateName("retry");
        String message = th2.getMessage();
        PLog.decision$default(transitionName, outcome, (PEnums.EventCode) null, stateName, (String) null, (String) null, "retry = " + i + ", " + message, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1972, (Object) null);
    }

    public final boolean canRetry(long j, int i, RetryConfiguration retryConfiguration) {
        C19383o.m32797g(retryConfiguration, "config");
        return i + 1 < retryConfiguration.getMaxRetriesCount() && Calendar.getInstance().getTimeInMillis() - j < retryConfiguration.getMaxRetriesDuration();
    }

    public final RetryConfiguration getRetryConfiguration(C20011u uVar) {
        Map map;
        Long U0;
        Long U02;
        Integer T0;
        C20011u uVar2 = uVar;
        C19383o.m32797g(uVar2, LoginFragment.EXTRA_REQUEST);
        if (uVar2.f44344d.mo72948a(RETRY_MAX_COUNT_HEADER) == null) {
            return null;
        }
        String a = uVar2.f44344d.mo72948a(RETRY_MAX_COUNT_HEADER);
        int i = 3;
        if (!(a == null || (T0 = C19456j.m33016T0(a)) == null)) {
            i = T0.intValue();
        }
        int i2 = i;
        String a2 = uVar2.f44344d.mo72948a(RETRY_TIMEOUT_HEADER);
        long j = DEFAULT_MAX_RETRIES_DURATION;
        if (!(a2 == null || (U02 = C19456j.m33017U0(a2)) == null)) {
            j = U02.longValue();
        }
        long j2 = j;
        String a3 = uVar2.f44344d.mo72948a(RETRY_DELAY_HEADER);
        long j3 = DEFAULT_RETRY_DELAY;
        if (!(a3 == null || (U0 = C19456j.m33017U0(a3)) == null)) {
            j3 = U0.longValue();
        }
        new LinkedHashMap();
        C19997p pVar = uVar2.f44342b;
        String str = uVar2.f44343c;
        C20016y yVar = uVar2.f44345e;
        LinkedHashMap linkedHashMap = uVar2.f44346f.isEmpty() ? new LinkedHashMap() : C19294b0.m32558A0(uVar2.f44346f);
        C19994o.C19995a g = uVar2.f44344d.mo72952g();
        g.mo72963f(RETRY_MAX_COUNT_HEADER);
        g.mo72963f(RETRY_TIMEOUT_HEADER);
        g.mo72963f(RETRY_DELAY_HEADER);
        if (pVar != null) {
            C19994o d = g.mo72961d();
            byte[] bArr = C18980c.f42301a;
            if (linkedHashMap.isEmpty()) {
                map = C19294b0.m32559p0();
            } else {
                map = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                C19383o.m32796f(map, "Collections.unmodifiableMap(LinkedHashMap(this))");
            }
            return new RetryConfiguration(new C20011u(pVar, str, d, yVar, map), i2, j2, j3);
        }
        throw new IllegalStateException("url == null".toString());
    }

    public C20018z intercept(C20000q.C20001a aVar) {
        Object obj;
        Map map;
        C19383o.m32797g(aVar, "chain");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        T g = aVar.mo70455g();
        ref$ObjectRef.element = g;
        RetryConfiguration retryConfiguration = getRetryConfiguration(g);
        if (retryConfiguration == null) {
            return aVar.mo70453a((C20011u) ref$ObjectRef.element);
        }
        T request = retryConfiguration.getRequest();
        ref$ObjectRef.element = request;
        try {
            obj = Result.m35480constructorimpl(aVar.mo70453a(request));
        } catch (Throwable th) {
            obj = Result.m35480constructorimpl(C0761x.m1673J(th));
        }
        Object obj2 = obj;
        C20018z zVar = Result.m35485isFailureimpl(obj2) ? null : obj2;
        C20018z zVar2 = (C20018z) zVar;
        if (shouldRetry(zVar2 == null ? null : Integer.valueOf(zVar2.f44365f))) {
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            int i = 0;
            logRequestError((C20018z) (Result.m35485isFailureimpl(obj2) ? null : obj2), Result.m35483exceptionOrNullimpl(obj2));
            while (true) {
                C20018z zVar3 = (C20018z) zVar;
                if (!shouldRetry(zVar3 == null ? null : Integer.valueOf(zVar3.f44365f)) || !canRetry(timeInMillis, i, retryConfiguration)) {
                    break;
                }
                int i2 = i + 1;
                logRetryDecision((C20018z) (Result.m35485isFailureimpl(obj2) ? null : obj2), Result.m35483exceptionOrNullimpl(obj2), i2);
                Pair pair = (Pair) C19697g.m33469g(EmptyCoroutineContext.INSTANCE, new NetworkRetryInterceptor$intercept$1(this, ref$ObjectRef, aVar, retryConfiguration, (C19340c<? super NetworkRetryInterceptor$intercept$1>) null));
                C20018z zVar4 = (C20018z) pair.component1();
                Throwable th2 = (Throwable) pair.component2();
                if (shouldRetry(zVar4 == null ? null : Integer.valueOf(zVar4.f44365f))) {
                    logRequestError(zVar4, th2);
                }
                zVar = zVar4;
                i = i2;
            }
        }
        C20018z zVar5 = (C20018z) zVar;
        if (zVar5 != null) {
            return zVar5;
        }
        C20011u uVar = (C20011u) ref$ObjectRef.element;
        uVar.getClass();
        new LinkedHashMap();
        C19997p pVar = uVar.f44342b;
        String str = uVar.f44343c;
        C20016y yVar = uVar.f44345e;
        LinkedHashMap linkedHashMap = uVar.f44346f.isEmpty() ? new LinkedHashMap() : C19294b0.m32558A0(uVar.f44346f);
        C19994o.C19995a g2 = uVar.f44344d.mo72952g();
        if (pVar != null) {
            C19994o d = g2.mo72961d();
            byte[] bArr = C18980c.f42301a;
            if (linkedHashMap.isEmpty()) {
                map = C19294b0.m32559p0();
            } else {
                map = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                C19383o.m32796f(map, "Collections.unmodifiableMap(LinkedHashMap(this))");
            }
            return aVar.mo70453a(new C20011u(pVar, str, d, yVar, map));
        }
        throw new IllegalStateException("url == null".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object retry(okhttp3.C20011u r11, okhttp3.C20000q.C20001a r12, com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor.RetryConfiguration r13, kotlin.coroutines.C19340c<? super kotlin.Pair<okhttp3.C20018z, ? extends java.lang.Throwable>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor$retry$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor$retry$1 r0 = (com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor$retry$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor$retry$1 r0 = new com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor$retry$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r11 = r0.L$1
            okhttp3.u r11 = (okhttp3.C20011u) r11
            java.lang.Object r12 = r0.L$0
            okhttp3.q$a r12 = (okhttp3.C20000q.C20001a) r12
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)     // Catch:{ all -> 0x002f }
            goto L_0x009e
        L_0x002f:
            r11 = move-exception
            goto L_0x00a7
        L_0x0032:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            r11.getClass()
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            okhttp3.p r5 = r11.f44342b
            java.lang.String r6 = r11.f44343c
            okhttp3.y r8 = r11.f44345e
            java.util.Map<java.lang.Class<?>, java.lang.Object> r14 = r11.f44346f
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x0059
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            goto L_0x005f
        L_0x0059:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r14 = r11.f44346f
            java.util.LinkedHashMap r14 = kotlin.collections.C19294b0.m32558A0(r14)
        L_0x005f:
            okhttp3.o r11 = r11.f44344d
            okhttp3.o$a r11 = r11.mo72952g()
            if (r5 == 0) goto L_0x00c2
            okhttp3.o r7 = r11.mo72961d()
            byte[] r11 = p735br.C18980c.f42301a
            boolean r11 = r14.isEmpty()
            if (r11 == 0) goto L_0x0078
            java.util.Map r11 = kotlin.collections.C19294b0.m32559p0()
            goto L_0x0086
        L_0x0078:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>(r14)
            java.util.Map r11 = java.util.Collections.unmodifiableMap(r11)
            java.lang.String r14 = "Collections.unmodifiableMap(LinkedHashMap(this))"
            kotlin.jvm.internal.C19383o.m32796f(r11, r14)
        L_0x0086:
            r9 = r11
            okhttp3.u r11 = new okhttp3.u
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            long r13 = r13.getDelay()     // Catch:{ all -> 0x002f }
            r0.L$0 = r12     // Catch:{ all -> 0x002f }
            r0.L$1 = r11     // Catch:{ all -> 0x002f }
            r0.label = r3     // Catch:{ all -> 0x002f }
            java.lang.Object r13 = p628nj.C18263b.m30814I(r13, r0)     // Catch:{ all -> 0x002f }
            if (r13 != r1) goto L_0x009e
            return r1
        L_0x009e:
            okhttp3.z r11 = r12.mo70453a(r11)     // Catch:{ all -> 0x002f }
            java.lang.Object r11 = kotlin.Result.m35480constructorimpl(r11)     // Catch:{ all -> 0x002f }
            goto L_0x00af
        L_0x00a7:
            kotlin.Result$Failure r11 = androidx.compose.foundation.layout.C0761x.m1673J(r11)
            java.lang.Object r11 = kotlin.Result.m35480constructorimpl(r11)
        L_0x00af:
            kotlin.Pair r12 = new kotlin.Pair
            boolean r13 = kotlin.Result.m35485isFailureimpl(r11)
            if (r13 == 0) goto L_0x00b9
            r13 = 0
            goto L_0x00ba
        L_0x00b9:
            r13 = r11
        L_0x00ba:
            java.lang.Throwable r11 = kotlin.Result.m35483exceptionOrNullimpl(r11)
            r12.<init>(r13, r11)
            return r12
        L_0x00c2:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "url == null"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor.retry(okhttp3.u, okhttp3.q$a, com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor$RetryConfiguration, kotlin.coroutines.c):java.lang.Object");
    }

    public final boolean shouldRetry(Integer num) {
        return (num != null && num.intValue() == 408) || (num != null && num.intValue() == 409) || ((num != null && num.intValue() == 429) || ((num != null && num.intValue() >= 500) || num == null));
    }
}
