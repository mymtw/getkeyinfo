package com.paypal.platform.authsdk.partnerauth.platform;

import android.support.p013v4.media.C0070b;
import android.util.Log;
import androidx.compose.p015ui.text.input.C1993m;
import com.paypal.android.platform.authsdk.authcommon.ChallengeError;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authinterface.Authentication;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationContext;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationError;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationTokensProvider;
import com.paypal.platform.authsdk.partnerauth.platform.C17163a;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19707i1;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.internal.C19721f;
import kotlinx.coroutines.internal.C19729m;
import p768rq.C20153b;

public final class PartnerAuthChallengeRouter {

    /* renamed from: a */
    public final PartnerAuthEngine f37640a;

    /* renamed from: b */
    public final Queue<C17163a> f37641b;

    /* renamed from: c */
    public final String f37642c;

    /* renamed from: d */
    public final C19721f f37643d;

    /* renamed from: com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthChallengeRouter$a */
    public static final class C17162a implements AuthenticationTokensProvider {

        /* renamed from: a */
        public final /* synthetic */ ChallengeResult f37644a;

        public C17162a(ChallengeResult challengeResult) {
            this.f37644a = challengeResult;
        }

        public final String getAccessToken() {
            return ((ChallengeResult.Completed) this.f37644a).getData().getUserAccessToken();
        }

        public final Map<String, String> getAuthHeaders() {
            throw new NotImplementedError(C19383o.m32802l("Not yet implemented", "An operation is not implemented: "));
        }

        public final String getIdToken() {
            return ((ChallengeResult.Completed) this.f37644a).getData().getIdToken();
        }

        public final Map<String, Object> getResultServiceMetadata() {
            throw new NotImplementedError(C19383o.m32802l("Not yet implemented", "An operation is not implemented: "));
        }
    }

    public PartnerAuthChallengeRouter() {
        throw null;
    }

    public PartnerAuthChallengeRouter(PartnerAuthEngine partnerAuthEngine) {
        LinkedList linkedList = new LinkedList();
        new LinkedList();
        C19383o.m32797g(partnerAuthEngine, "authEngine");
        this.f37640a = partnerAuthEngine;
        this.f37641b = linkedList;
        this.f37642c = "AuthChallengeRouter";
        C19707i1 l = C1993m.m4368l();
        C20153b bVar = C19760n0.f43719a;
        this.f37643d = C19697g.m33463a(l.plus(C19729m.f43681a));
    }

    /* renamed from: a */
    public final void mo62600a(AuthenticationContext authenticationContext, Authentication.Listener listener, String str) {
        C19383o.m32797g(authenticationContext, "authenticationContext");
        C19383o.m32797g(listener, "authenticationListener");
        Log.d(this.f37642c, "authenticate");
        C17163a.C17164a aVar = new C17163a.C17164a(authenticationContext, listener);
        C0070b.m187j("authenticate to request ", aVar.f37649c, this.f37642c);
        synchronized (this.f37641b) {
            this.f37641b.add(aVar);
            String str2 = this.f37642c;
            int size = this.f37641b.size();
            Log.d(str2, "pendingLoginReqeust Queue " + size + " ");
            if (this.f37641b.size() == 1) {
                C17163a peek = this.f37641b.peek();
                if (peek != null) {
                    String str3 = this.f37642c;
                    String str4 = peek.f37649c;
                    Log.d(str3, "Current loginRequest to delegated " + str4);
                    C19697g.m33468f(this.f37643d, (CoroutineContext) null, (CoroutineStart) null, new PartnerAuthChallengeRouter$authenticate$1$1$1(this, peek, str, (C19340c<? super PartnerAuthChallengeRouter$authenticate$1$1$1>) null), 3);
                }
            }
            C19394m mVar = C19394m.f43287a;
        }
    }

    /* renamed from: b */
    public final void mo62601b(Queue<C17163a> queue, ChallengeResult challengeResult) {
        Log.d(this.f37642c, "complete all pending requests with result ");
        while (!queue.isEmpty()) {
            C17163a poll = queue.poll();
            if (poll != null) {
                String str = this.f37642c;
                String str2 = poll.f37649c;
                Log.d(str, "completed request " + str2 + " with result " + challengeResult);
                if (challengeResult instanceof ChallengeResult.Completed) {
                    poll.f37648b.onSuccess(new C17162a(challengeResult));
                    String str3 = this.f37642c;
                    String str4 = poll.f37649c;
                    String userAccessToken = ((ChallengeResult.Completed) challengeResult).getData().getUserAccessToken();
                    Log.d(str3, "completed request " + str4 + " with accessToken " + userAccessToken);
                } else {
                    String str5 = null;
                    if (challengeResult instanceof ChallengeResult.Failed) {
                        ChallengeResult.Failed failed = (ChallengeResult.Failed) challengeResult;
                        ChallengeError error = failed.getError();
                        if (error instanceof ChallengeError.Failure) {
                            Authentication.Listener listener = poll.f37648b;
                            Error reason = ((ChallengeError.Failure) failed.getError()).getReason();
                            String message = reason == null ? null : reason.getMessage();
                            Error reason2 = ((ChallengeError.Failure) failed.getError()).getReason();
                            String message2 = reason2 == null ? null : reason2.getMessage();
                            Error reason3 = ((ChallengeError.Failure) failed.getError()).getReason();
                            if (reason3 != null) {
                                str5 = reason3.getMessage();
                            }
                            listener.onError(new AuthenticationError.Auth(str5, message2, "", message, AuthenticationError.AuthError.AuthenticationFailure.INSTANCE));
                        } else if (error instanceof ChallengeError.Cancelled) {
                            Authentication.Listener listener2 = poll.f37648b;
                            Error reason4 = ((ChallengeError.Cancelled) failed.getError()).getReason();
                            String message3 = reason4 == null ? null : reason4.getMessage();
                            Error reason5 = ((ChallengeError.Cancelled) failed.getError()).getReason();
                            String message4 = reason5 == null ? null : reason5.getMessage();
                            Error reason6 = ((ChallengeError.Cancelled) failed.getError()).getReason();
                            if (reason6 != null) {
                                str5 = reason6.getMessage();
                            }
                            listener2.onError(new AuthenticationError.Auth(str5, message4, "", message3, AuthenticationError.AuthError.UserCancelled.INSTANCE));
                        } else if (error instanceof ChallengeError.Unsupported) {
                            poll.f37648b.onError(AuthenticationError.NOT_IMPLEMENTED.INSTANCE);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (challengeResult instanceof ChallengeResult.UnHandled) {
                        Authentication.Listener listener3 = poll.f37648b;
                        ChallengeResult.UnHandled unHandled = (ChallengeResult.UnHandled) challengeResult;
                        Error reason7 = unHandled.getReason();
                        String message5 = reason7 == null ? null : reason7.getMessage();
                        Error reason8 = unHandled.getReason();
                        String message6 = reason8 == null ? null : reason8.getMessage();
                        Error reason9 = unHandled.getReason();
                        if (reason9 != null) {
                            str5 = reason9.getMessage();
                        }
                        listener3.onError(new AuthenticationError.Auth(str5, message6, "", message5, AuthenticationError.AuthError.AuthenticationFailure.INSTANCE));
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        r0.L$0 = null;
        r0.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (r5.mo62603d((com.paypal.android.platform.authsdk.authcommon.ChallengeResult) r6, r0) != r1) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        return kotlin.C19394m.f43287a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
        r0.L$0 = null;
        r0.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0099, code lost:
        if (r5.mo62603d((com.paypal.android.platform.authsdk.authcommon.ChallengeResult) r6, r0) != r1) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
        return kotlin.C19394m.f43287a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b2, code lost:
        r0.L$0 = null;
        r0.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bd, code lost:
        if (r5.mo62603d((com.paypal.android.platform.authsdk.authcommon.ChallengeResult) r6, r0) != r1) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bf, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c2, code lost:
        return kotlin.C19394m.f43287a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo62602c(com.paypal.android.platform.authsdk.authcommon.Challenge r5, kotlin.coroutines.C19340c<? super kotlin.C19394m> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthChallengeRouter$delegateChallenge$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthChallengeRouter$delegateChallenge$1 r0 = (com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthChallengeRouter$delegateChallenge$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthChallengeRouter$delegateChallenge$1 r0 = new com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthChallengeRouter$delegateChallenge$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L_0x0050;
                case 1: goto L_0x0048;
                case 2: goto L_0x0044;
                case 3: goto L_0x003c;
                case 4: goto L_0x0038;
                case 5: goto L_0x002f;
                case 6: goto L_0x002a;
                default: goto L_0x0022;
            }
        L_0x0022:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x00c0
        L_0x002f:
            java.lang.Object r5 = r0.L$0
            com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthChallengeRouter r5 = (com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthChallengeRouter) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x00b2
        L_0x0038:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x009c
        L_0x003c:
            java.lang.Object r5 = r0.L$0
            com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthChallengeRouter r5 = (com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthChallengeRouter) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x008e
        L_0x0044:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x0074
        L_0x0048:
            java.lang.Object r5 = r0.L$0
            com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthChallengeRouter r5 = (com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthChallengeRouter) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x0066
        L_0x0050:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            boolean r6 = r5 instanceof com.paypal.android.platform.authsdk.authcommon.Challenge.LoginChallenge
            r2 = 1
            if (r6 == 0) goto L_0x0077
            com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthEngine r6 = r4.f37640a
            r0.L$0 = r4
            r0.label = r2
            java.lang.Object r6 = r6.mo62605a(r5, r0)
            if (r6 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r5 = r4
        L_0x0066:
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult r6 = (com.paypal.android.platform.authsdk.authcommon.ChallengeResult) r6
            r0.L$0 = r3
            r2 = 2
            r0.label = r2
            java.lang.Object r5 = r5.mo62603d(r6, r0)
            if (r5 != r1) goto L_0x0074
            return r1
        L_0x0074:
            kotlin.m r5 = kotlin.C19394m.f43287a
            return r5
        L_0x0077:
            boolean r6 = r5 instanceof com.paypal.android.platform.authsdk.authcommon.Challenge.Biometric
            if (r6 != 0) goto L_0x00c6
            boolean r6 = r5 instanceof com.paypal.android.platform.authsdk.authcommon.Challenge.OTPLogin
            if (r6 == 0) goto L_0x009f
            com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthEngine r6 = r4.f37640a
            r0.L$0 = r4
            r2 = 3
            r0.label = r2
            java.lang.Object r6 = r6.mo62605a(r5, r0)
            if (r6 != r1) goto L_0x008d
            return r1
        L_0x008d:
            r5 = r4
        L_0x008e:
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult r6 = (com.paypal.android.platform.authsdk.authcommon.ChallengeResult) r6
            r0.L$0 = r3
            r2 = 4
            r0.label = r2
            java.lang.Object r5 = r5.mo62603d(r6, r0)
            if (r5 != r1) goto L_0x009c
            return r1
        L_0x009c:
            kotlin.m r5 = kotlin.C19394m.f43287a
            return r5
        L_0x009f:
            boolean r6 = r5 instanceof com.paypal.android.platform.authsdk.authcommon.Challenge.SplitLogin
            if (r6 == 0) goto L_0x00c3
            com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthEngine r6 = r4.f37640a
            r0.L$0 = r4
            r2 = 5
            r0.label = r2
            java.lang.Object r6 = r6.mo62605a(r5, r0)
            if (r6 != r1) goto L_0x00b1
            return r1
        L_0x00b1:
            r5 = r4
        L_0x00b2:
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult r6 = (com.paypal.android.platform.authsdk.authcommon.ChallengeResult) r6
            r0.L$0 = r3
            r2 = 6
            r0.label = r2
            java.lang.Object r5 = r5.mo62603d(r6, r0)
            if (r5 != r1) goto L_0x00c0
            return r1
        L_0x00c0:
            kotlin.m r5 = kotlin.C19394m.f43287a
            return r5
        L_0x00c3:
            kotlin.m r5 = kotlin.C19394m.f43287a
            return r5
        L_0x00c6:
            kotlin.NotImplementedError r5 = new kotlin.NotImplementedError
            r5.<init>(r3, r2, r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthChallengeRouter.mo62602c(com.paypal.android.platform.authsdk.authcommon.Challenge, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: d */
    public final Object mo62603d(ChallengeResult challengeResult, C19340c<? super C19394m> cVar) {
        String str = this.f37642c;
        Log.d(str, "handleChallengeResult " + challengeResult);
        if (challengeResult instanceof ChallengeResult.Completed) {
            mo62601b(this.f37641b, challengeResult);
        } else if (challengeResult instanceof ChallengeResult.Failed) {
            ChallengeError error = ((ChallengeResult.Failed) challengeResult).getError();
            if (error instanceof ChallengeError.Failure ? true : error instanceof ChallengeError.Cancelled) {
                mo62601b(this.f37641b, challengeResult);
            } else if (error instanceof ChallengeError.Unsupported) {
                mo62601b(this.f37641b, challengeResult);
            }
        } else if (challengeResult instanceof ChallengeResult.UnHandled) {
            Object c = mo62602c(((ChallengeResult.UnHandled) challengeResult).getChallenge(), cVar);
            return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : C19394m.f43287a;
        }
        return C19394m.f43287a;
    }
}
