package com.paypal.android.platform.authsdk.otplogin.p533ui;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.lifecycle.C2895z;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.AuthCoreComponent;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeHandler;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.ChallengeType;
import com.paypal.android.platform.authsdk.authcommon.CleanUp;
import com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder;
import com.paypal.android.platform.authsdk.authcommon.analytics.ITracker;
import com.paypal.android.platform.authsdk.authcommon.network.utils.ApiUtilsKt;
import com.paypal.android.platform.authsdk.authcommon.p531ui.HostNavigationController;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.otplogin.data.OtpLoginRepositoryImpl;
import com.paypal.android.platform.authsdk.otplogin.data.api.OtpLoginApiService;
import com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData;
import com.paypal.android.platform.authsdk.otplogin.p533ui.login.OtpLoginFragment;
import com.paypal.android.platform.authsdk.otplogin.p533ui.phone.OtpPhoneFragment;
import com.paypal.android.platform.authsdk.splitlogin.domain.AuthOptionChallengeData;
import com.paypal.android.platform.authsdk.splitlogin.domain.ChallengeData;
import com.paypal.android.platform.authsdk.splitlogin.domain.Phone;
import com.paypal.platform.authsdk.AuthProviders;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19707i1;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C19729m;
import p716xo.C18829b;
import p716xo.C18834f;
import p768rq.C20153b;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginHandler */
public final class OTPLoginHandler implements ChallengeHandler, C18829b {
    private final AuthCoreComponent authCoreComponent;
    /* access modifiers changed from: private */
    public final AuthProviders authProviders;
    /* access modifiers changed from: private */
    public final Context context;
    /* access modifiers changed from: private */
    public final ITracker iTracker;
    private final C19525d0 scope;
    /* access modifiers changed from: private */
    public final C18834f tokenStore;

    public OTPLoginHandler(Context context2, C18834f fVar, AuthCoreComponent authCoreComponent2, AuthProviders authProviders2, ITracker iTracker2) {
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        C19383o.m32797g(fVar, "tokenStore");
        C19383o.m32797g(authCoreComponent2, ConstantsKt.AUTH_CORE_COMPONENT);
        C19383o.m32797g(authProviders2, "authProviders");
        C19383o.m32797g(iTracker2, "iTracker");
        this.context = context2;
        this.tokenStore = fVar;
        this.authCoreComponent = authCoreComponent2;
        this.authProviders = authProviders2;
        this.iTracker = iTracker2;
        authCoreComponent2.getChallengeRegistry().registerChallengeHandler(ChallengeType.OTPLogin, this);
        C19707i1 l = C1993m.m4368l();
        C20153b bVar = C19760n0.f43719a;
        this.scope = C19697g.m33463a(l.plus(C19729m.f43681a));
    }

    private final OtpLoginRepositoryImpl generateOTPLoginRepository(AuthCoreComponent authCoreComponent2, OTPLoginData oTPLoginData) {
        return new OtpLoginRepositoryImpl((OtpLoginApiService) ApiUtilsKt.getAuthApi(authCoreComponent2, OtpLoginApiService.class), oTPLoginData, (CoroutineDispatcher) null, 4, (DefaultConstructorMarker) null);
    }

    private final CleanUp getCleanupHandler(C2895z<ChallengeResult> zVar, String str) {
        return new OTPLoginHandler$getCleanupHandler$1(zVar, str);
    }

    private final String getSelectedPhoneNumber(OTPLoginData oTPLoginData) {
        Phone phone;
        ChallengeData challengeData;
        ArrayList<Phone> phones;
        AuthOptionChallengeData authOptionChallengeData = oTPLoginData.getAuthOptionChallengeData();
        String str = null;
        if (authOptionChallengeData == null || (challengeData = authOptionChallengeData.getChallengeData()) == null || (phones = challengeData.getPhones()) == null) {
            phone = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (T next : phones) {
                if (C19383o.m32792b(((Phone) next).getChallengeId(), oTPLoginData.getChallengeId())) {
                    arrayList.add(next);
                }
            }
            phone = (Phone) arrayList.get(0);
        }
        if (phone != null) {
            str = phone.getPhoneNumber();
        }
        return String.valueOf(str);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r0 = (r0 = r0.getChallengeData()).getPhones();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isAutoSMSEnabled(com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData r5) {
        /*
            r4 = this;
            com.paypal.android.platform.authsdk.splitlogin.domain.AuthOptionChallengeData r0 = r5.getAuthOptionChallengeData()
            r1 = 0
            if (r0 != 0) goto L_0x0009
        L_0x0007:
            r0 = r1
            goto L_0x001b
        L_0x0009:
            com.paypal.android.platform.authsdk.splitlogin.domain.ChallengeData r0 = r0.getChallengeData()
            if (r0 != 0) goto L_0x0010
            goto L_0x0007
        L_0x0010:
            java.util.ArrayList r0 = r0.getPhones()
            if (r0 != 0) goto L_0x0017
            goto L_0x0007
        L_0x0017:
            java.util.List r0 = kotlin.collections.C19327t.m32660p1(r0)
        L_0x001b:
            if (r0 != 0) goto L_0x001e
            goto L_0x003e
        L_0x001e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0027:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003e
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.paypal.android.platform.authsdk.splitlogin.domain.Phone r3 = (com.paypal.android.platform.authsdk.splitlogin.domain.Phone) r3
            boolean r3 = r3.getNotified()
            if (r3 == 0) goto L_0x0027
            r1.add(r2)
            goto L_0x0027
        L_0x003e:
            r0 = 0
            r2 = 1
            if (r1 != 0) goto L_0x0044
        L_0x0042:
            r3 = r0
            goto L_0x004c
        L_0x0044:
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ r2
            if (r3 != r2) goto L_0x0042
            r3 = r2
        L_0x004c:
            if (r3 == 0) goto L_0x005b
            java.lang.Object r3 = r1.get(r0)
            com.paypal.android.platform.authsdk.splitlogin.domain.Phone r3 = (com.paypal.android.platform.authsdk.splitlogin.domain.Phone) r3
            java.lang.String r3 = r3.getChallengeId()
            r5.setChallengeId(r3)
        L_0x005b:
            if (r1 != 0) goto L_0x005e
            goto L_0x0066
        L_0x005e:
            boolean r5 = r1.isEmpty()
            r5 = r5 ^ r2
            if (r5 != r2) goto L_0x0066
            r0 = r2
        L_0x0066:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.otplogin.p533ui.OTPLoginHandler.isAutoSMSEnabled(com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData):boolean");
    }

    private final OtpLoginFragment returnOTPLoginFragment(OTPLoginData oTPLoginData, Challenge challenge, C2895z<ChallengeResult> zVar) {
        Challenge challenge2 = challenge;
        C2895z<ChallengeResult> zVar2 = zVar;
        OtpLoginFragment fragment = OtpLoginFragment.Companion.getFragment(this, challenge2, zVar2, generateOTPLoginRepository(this.authCoreComponent, oTPLoginData), getCleanupHandler(zVar, challenge.getRequestId()));
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            arguments.putBinder("tracker_object", new ObjectWrapperForBinder(new OTPLoginHandler$returnOTPLoginFragment$otpLoginFragment$1$1(this)));
        }
        this.authProviders.getAuthPresenter().onViewPresentRequested(fragment, false);
        return fragment;
    }

    /* access modifiers changed from: private */
    public final OtpPhoneFragment returnOTPPhoneFragment(OTPLoginData oTPLoginData, Challenge challenge, C2895z<ChallengeResult> zVar) {
        Challenge challenge2 = challenge;
        C2895z<ChallengeResult> zVar2 = zVar;
        OtpPhoneFragment fragment = OtpPhoneFragment.Companion.getFragment(getSelectedPhoneNumber(oTPLoginData), this, challenge2, zVar2, generateOTPLoginRepository(this.authCoreComponent, oTPLoginData), getCleanupHandler(zVar, challenge.getRequestId()));
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            arguments.putBinder("tracker_object", new ObjectWrapperForBinder(new OTPLoginHandler$returnOTPPhoneFragment$otpPhoneFragment$1$1(this)));
        }
        this.authProviders.getAuthPresenter().onViewPresentRequested(fragment, false);
        return fragment;
    }

    private final Error toError(Throwable th) {
        return new Error(th);
    }

    public AuthCoreComponent getAuthCoreComponent() {
        return this.authCoreComponent;
    }

    public AuthProviders getAuthProviders() {
        return this.authProviders;
    }

    public final C19525d0 getScope() {
        return this.scope;
    }

    public ITracker getTracker() {
        return this.iTracker;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cd A[Catch:{ Exception -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object handleChallenge(com.paypal.android.platform.authsdk.authcommon.Challenge r14, kotlin.coroutines.C19340c<? super com.paypal.android.platform.authsdk.authcommon.ChallengeResult> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.paypal.android.platform.authsdk.otplogin.p533ui.OTPLoginHandler$handleChallenge$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginHandler$handleChallenge$1 r0 = (com.paypal.android.platform.authsdk.otplogin.p533ui.OTPLoginHandler$handleChallenge$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginHandler$handleChallenge$1 r0 = new com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginHandler$handleChallenge$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x004f
            if (r2 != r3) goto L_0x0047
            java.lang.Object r14 = r0.L$5
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            java.lang.Object r1 = r0.L$4
            androidx.lifecycle.z r1 = (androidx.lifecycle.C2895z) r1
            java.lang.Object r1 = r0.L$3
            com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData r1 = (com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData) r1
            java.lang.Object r1 = r0.L$2
            kotlin.jvm.internal.Ref$BooleanRef r1 = (kotlin.jvm.internal.Ref$BooleanRef) r1
            java.lang.Object r2 = r0.L$1
            com.paypal.android.platform.authsdk.authcommon.Challenge r2 = (com.paypal.android.platform.authsdk.authcommon.Challenge) r2
            java.lang.Object r0 = r0.L$0
            com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginHandler r0 = (com.paypal.android.platform.authsdk.otplogin.p533ui.OTPLoginHandler) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r15)     // Catch:{ Exception -> 0x0040 }
            goto L_0x00c3
        L_0x0040:
            r15 = move-exception
            r1 = r0
            r0 = r15
            r15 = r14
            r14 = r2
            goto L_0x00d9
        L_0x0047:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x004f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r15)
            kotlin.jvm.internal.Ref$BooleanRef r15 = new kotlin.jvm.internal.Ref$BooleanRef
            r15.<init>()
            r2 = r14
            com.paypal.android.platform.authsdk.authcommon.Challenge$OTPLogin r2 = (com.paypal.android.platform.authsdk.authcommon.Challenge.OTPLogin) r2
            java.lang.String r2 = r2.getJsonInput()
            com.google.gson.i r4 = new com.google.gson.i
            r4.<init>()
            java.lang.Class<com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData> r5 = com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData.class
            java.lang.Object r2 = r4.mo59458e(r5, r2)
            r6 = r2
            com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData r6 = (com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData) r6
            androidx.lifecycle.z r4 = new androidx.lifecycle.z
            r4.<init>()
            boolean r2 = r6.isOtpSent()
            if (r2 != 0) goto L_0x0083
            boolean r2 = r13.isAutoSMSEnabled(r6)
            if (r2 == 0) goto L_0x007e
            goto L_0x0083
        L_0x007e:
            com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginFragment r2 = r13.returnOTPLoginFragment(r6, r14, r4)
            goto L_0x0087
        L_0x0083:
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneFragment r2 = r13.returnOTPPhoneFragment(r6, r14, r4)
        L_0x0087:
            r10 = r2
            r0.L$0 = r13     // Catch:{ Exception -> 0x00db }
            r0.L$1 = r14     // Catch:{ Exception -> 0x00db }
            r0.L$2 = r15     // Catch:{ Exception -> 0x00db }
            r0.L$3 = r6     // Catch:{ Exception -> 0x00db }
            r0.L$4 = r4     // Catch:{ Exception -> 0x00db }
            r0.L$5 = r10     // Catch:{ Exception -> 0x00db }
            r0.label = r3     // Catch:{ Exception -> 0x00db }
            kotlinx.coroutines.l r11 = new kotlinx.coroutines.l     // Catch:{ Exception -> 0x00db }
            kotlin.coroutines.c r0 = kotlin.jvm.internal.C19388s.m32873m0(r0)     // Catch:{ Exception -> 0x00db }
            r11.<init>(r3, r0)     // Catch:{ Exception -> 0x00db }
            r11.mo72548n()     // Catch:{ Exception -> 0x00db }
            kotlinx.coroutines.d0 r0 = r13.getScope()     // Catch:{ Exception -> 0x00db }
            com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginHandler$handleChallenge$result$1$1 r12 = new com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginHandler$handleChallenge$result$1$1     // Catch:{ Exception -> 0x00db }
            r9 = 0
            r2 = r12
            r3 = r4
            r4 = r15
            r5 = r13
            r7 = r14
            r8 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00db }
            r2 = 3
            r3 = 0
            kotlinx.coroutines.C19697g.m33468f(r0, r3, r3, r12, r2)     // Catch:{ Exception -> 0x00db }
            java.lang.Object r0 = r11.mo72547l()     // Catch:{ Exception -> 0x00db }
            if (r0 != r1) goto L_0x00be
            return r1
        L_0x00be:
            r2 = r14
            r1 = r15
            r15 = r0
            r14 = r10
            r0 = r13
        L_0x00c3:
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult r15 = (com.paypal.android.platform.authsdk.authcommon.ChallengeResult) r15     // Catch:{ Exception -> 0x0040 }
            com.paypal.android.platform.authsdk.authcommon.utils.FragmentUtils$Companion r3 = com.paypal.android.platform.authsdk.authcommon.utils.FragmentUtils.Companion     // Catch:{ Exception -> 0x0040 }
            boolean r3 = r3.isFragmentAlive(r14)     // Catch:{ Exception -> 0x0040 }
            if (r3 == 0) goto L_0x00d8
            com.paypal.platform.authsdk.AuthProviders r3 = r0.authProviders     // Catch:{ Exception -> 0x0040 }
            com.paypal.android.platform.authsdk.authcommon.ui.AuthPresenter r3 = r3.getAuthPresenter()     // Catch:{ Exception -> 0x0040 }
            boolean r1 = r1.element     // Catch:{ Exception -> 0x0040 }
            r3.onViewDismissRequested(r14, r1)     // Catch:{ Exception -> 0x0040 }
        L_0x00d8:
            return r15
        L_0x00d9:
            r10 = r15
            goto L_0x00de
        L_0x00db:
            r15 = move-exception
            r0 = r15
            r1 = r13
        L_0x00de:
            com.paypal.android.platform.authsdk.authcommon.utils.FragmentUtils$Companion r15 = com.paypal.android.platform.authsdk.authcommon.utils.FragmentUtils.Companion
            boolean r15 = r15.isFragmentAlive(r10)
            if (r15 == 0) goto L_0x00f0
            com.paypal.platform.authsdk.AuthProviders r15 = r1.authProviders
            com.paypal.android.platform.authsdk.authcommon.ui.AuthPresenter r15 = r15.getAuthPresenter()
            r2 = 0
            r15.onViewDismissRequested(r10, r2)
        L_0x00f0:
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed r15 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed
            java.lang.String r14 = r14.getRequestId()
            com.paypal.android.platform.authsdk.authcommon.ChallengeError$Failure r2 = new com.paypal.android.platform.authsdk.authcommon.ChallengeError$Failure
            java.lang.Error r0 = r1.toError(r0)
            r2.<init>(r0)
            r15.<init>(r14, r2)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.otplogin.p533ui.OTPLoginHandler.handleChallenge(com.paypal.android.platform.authsdk.authcommon.Challenge, kotlin.coroutines.c):java.lang.Object");
    }

    public void handleChallenge(Challenge challenge, HostNavigationController hostNavigationController, C2895z<ChallengeResult> zVar) {
        C19383o.m32797g(challenge, "challenge");
        C19383o.m32797g(hostNavigationController, "hostNavigationController");
        C19383o.m32797g(zVar, "challengeResultLiveData");
    }
}
