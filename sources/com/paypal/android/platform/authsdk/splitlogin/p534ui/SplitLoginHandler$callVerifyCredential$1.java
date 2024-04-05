package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2895z;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeError;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.ChallengeType;
import com.paypal.android.platform.authsdk.authcommon.model.ResultStatus;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.SecureKeyWrapper;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.authcommon.utils.PKCEParamHelper;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.android.platform.authsdk.captcha.utils.CaptchaChallengeUtils;
import com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData;
import com.paypal.android.platform.authsdk.splitlogin.data.SplitLoginRepositoryImpl;
import com.paypal.android.platform.authsdk.splitlogin.domain.AuthOptionChallengeData;
import com.paypal.android.platform.authsdk.splitlogin.domain.SplitLoginData;
import com.paypal.android.platform.authsdk.splitlogin.domain.SplitLoginRepository;
import com.paypal.android.platform.authsdk.splitlogin.domain.SplitLoginRequest;
import com.paypal.android.platform.authsdk.stepup.utils.StepUpChallengeUtils;
import com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthEngine;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import okhttp3.C20018z;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$callVerifyCredential$1", mo70541f = "SplitLoginHandler.kt", mo70542l = {183}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$callVerifyCredential$1 */
public final class SplitLoginHandler$callVerifyCredential$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Challenge $challenge;
    public final /* synthetic */ String $email;
    public final /* synthetic */ C2895z<ChallengeResult> $liveData;
    public final /* synthetic */ SplitLoginRepository $repository;
    public int label;
    public final /* synthetic */ SplitLoginHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitLoginHandler$callVerifyCredential$1(SplitLoginHandler splitLoginHandler, String str, C2895z<ChallengeResult> zVar, Challenge challenge, SplitLoginRepository splitLoginRepository, C19340c<? super SplitLoginHandler$callVerifyCredential$1> cVar) {
        super(2, cVar);
        this.this$0 = splitLoginHandler;
        this.$email = str;
        this.$liveData = zVar;
        this.$challenge = challenge;
        this.$repository = splitLoginRepository;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SplitLoginHandler$callVerifyCredential$1(this.this$0, this.$email, this.$liveData, this.$challenge, this.$repository, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SplitLoginHandler$callVerifyCredential$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ArrayList arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            boolean unused = this.this$0.isValidEmail(this.$email);
            SplitLoginRepository splitLoginRepository = this.$repository;
            String str = this.$email;
            SplitLoginRequest data = ((SplitLoginRepositoryImpl) splitLoginRepository).getData();
            data.setPublicCredential(str);
            this.label = 1;
            obj2 = splitLoginRepository.verifyCredential(data, this);
            if (obj2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultStatus resultStatus = (ResultStatus) obj2;
        if (resultStatus instanceof ResultStatus.Failure) {
            this.$liveData.postValue(new ChallengeResult.UnHandled(this.$challenge, (String) null, (ChallengeType) null, (String) null, (C20018z) null, (Object) null, (Error) null, (C19857l) null, 252, (DefaultConstructorMarker) null));
        } else if (!(resultStatus instanceof ResultStatus.Pending)) {
            if (resultStatus instanceof ResultStatus.Success) {
                ArrayList<AuthOptionChallengeData> authOptionChallenges = ((SplitLoginData) ((ResultStatus.Success) resultStatus).getData()).getAuthOptionChallenges();
                if (authOptionChallenges == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (T next : authOptionChallenges) {
                        if (C19383o.m32792b(((AuthOptionChallengeData) next).getAuthOption(), ConstantsKt.OTP)) {
                            arrayList.add(next);
                        }
                    }
                }
                if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                    SplitLoginHandler splitLoginHandler = this.this$0;
                    SplitLoginRepository splitLoginRepository2 = this.$repository;
                    String str2 = this.$email;
                    Challenge challenge = this.$challenge;
                    C2895z<ChallengeResult> zVar = this.$liveData;
                    OTPLoginData oTPLoginData = new OTPLoginData(splitLoginHandler.authCoreComponent.getClientConfig(), str2, (String) null, ((AuthOptionChallengeData) arrayList.get(0)).getNonce(), (AuthOptionChallengeData) arrayList.get(0), ((SplitLoginRepositoryImpl) splitLoginRepository2).getData().getThirdPartyClientID(), (String) null, (String) null, (String) null, (String) null, (String) null, false, splitLoginHandler.getTokenState().decryptString("riskVisitorId", (String) null), 4036, (DefaultConstructorMarker) null);
                    PKCEParamHelper pKCEParamHelper = new PKCEParamHelper((SecureKeyWrapper) null, splitLoginHandler.getContext(), 1, (DefaultConstructorMarker) null);
                    oTPLoginData.setCodeNonce(pKCEParamHelper.getAuthNonce());
                    oTPLoginData.setCodeChallenge(pKCEParamHelper.getAuthCodeChallenge());
                    oTPLoginData.setCodeVerifier(pKCEParamHelper.getCodeVerifier());
                    C19697g.m33468f(splitLoginHandler.getScope(), (CoroutineContext) null, (CoroutineStart) null, new SplitLoginHandler$callVerifyCredential$1$1$1((PartnerAuthEngine) splitLoginHandler.authCoreComponent.getChallengeRegistry(), challenge, oTPLoginData, zVar, (C19340c<? super SplitLoginHandler$callVerifyCredential$1$1$1>) null), 3);
                } else {
                    this.$liveData.postValue(new ChallengeResult.Failed(this.$challenge.getRequestId(), new ChallengeError.Failure(new Error("triggeredWebAuth"))));
                }
            } else if (resultStatus instanceof ResultStatus.Unhandled) {
                ResultStatus.Unhandled unhandled = (ResultStatus.Unhandled) resultStatus;
                if (C19457k.m33019W0(unhandled.getChallengeType(), "AuthAdsUriChallenge", true)) {
                    this.this$0.onHandleCaptcha(CaptchaChallengeUtils.Companion.toCaptchaUriData$auth_sdk_thirdPartyRelease(unhandled.getChallengeData()), this.$repository, this.$email, this.$liveData, this.$challenge);
                } else if (C19457k.m33019W0(unhandled.getChallengeType(), UriChallengeConstantKt.CHALLENGE_TYPE_STEP_UP, true)) {
                    this.this$0.onHandleStepUp(StepUpChallengeUtils.Companion.toStepUpChallengeData$auth_sdk_thirdPartyRelease(unhandled.getChallengeData()), this.$repository, this.$email, this.$liveData, this.$challenge);
                }
            }
        }
        return C19394m.f43287a;
    }
}
