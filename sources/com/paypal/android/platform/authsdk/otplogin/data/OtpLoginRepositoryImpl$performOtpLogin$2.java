package com.paypal.android.platform.authsdk.otplogin.data;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError;
import com.paypal.android.platform.authsdk.authcommon.model.ResultStatus;
import com.paypal.android.platform.authsdk.authcommon.network.utils.AuthHeaderBuilder;
import com.paypal.android.platform.authsdk.otplogin.data.api.OtpLoginAPIResponse;
import com.paypal.android.platform.authsdk.otplogin.data.api.OtpLoginAPIResponseKt;
import com.paypal.android.platform.authsdk.otplogin.data.api.OtpLoginApiService;
import com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData;
import com.paypal.android.platform.authsdk.otplogin.domain.OtpLoginResultData;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19543e0;
import okhttp3.C19928a0;
import okhttp3.C20016y;
import p744gq.C19060c;
import p753kq.C19861p;
import retrofit2.C20145v;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.data.OtpLoginRepositoryImpl$performOtpLogin$2", mo70541f = "OtpLoginRepositoryImpl.kt", mo70542l = {81}, mo70543m = "invokeSuspend")
public final class OtpLoginRepositoryImpl$performOtpLogin$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super ResultStatus<OtpLoginResultData>>, Object> {
    public final /* synthetic */ Map<String, String> $extraPayload;
    public final /* synthetic */ OTPLoginData $otpLoginData;
    public int label;
    public final /* synthetic */ OtpLoginRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpLoginRepositoryImpl$performOtpLogin$2(OtpLoginRepositoryImpl otpLoginRepositoryImpl, OTPLoginData oTPLoginData, Map<String, String> map, C19340c<? super OtpLoginRepositoryImpl$performOtpLogin$2> cVar) {
        super(2, cVar);
        this.this$0 = otpLoginRepositoryImpl;
        this.$otpLoginData = oTPLoginData;
        this.$extraPayload = map;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new OtpLoginRepositoryImpl$performOtpLogin$2(this.this$0, this.$otpLoginData, this.$extraPayload, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super ResultStatus<OtpLoginResultData>> cVar) {
        return ((OtpLoginRepositoryImpl$performOtpLogin$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C20016y access$createOtpLoginRequestBody = this.this$0.createOtpLoginRequestBody(this.$otpLoginData, this.$extraPayload);
            OtpLoginApiService access$getOtpLoginApiService$p = this.this$0.otpLoginApiService;
            HashMap<String, String> buildHeaderMap = new AuthHeaderBuilder(this.$otpLoginData.getClientConfig(), this.this$0.getData().getRiskVisitorId()).buildHeaderMap();
            this.label = 1;
            obj = access$getOtpLoginApiService$p.performOtpLogin(buildHeaderMap, access$createOtpLoginRequestBody, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
            } catch (IOException e) {
                return ResultStatus.Companion.withException(new AuthenticationError.Network(String.valueOf(e.getMessage()), (String) null, (Throwable) null, (String) null, 14, (DefaultConstructorMarker) null));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C20145v vVar = (C20145v) obj;
        if (vVar.mo74384a()) {
            OtpLoginAPIResponse otpLoginAPIResponse = (OtpLoginAPIResponse) vVar.f44615b;
            if (otpLoginAPIResponse == null) {
                return ResultStatus.Companion.withException(new AuthenticationError.Network("Data not found", (String) null, (Throwable) null, (String) null, 14, (DefaultConstructorMarker) null));
            }
            OtpLoginRepositoryImpl otpLoginRepositoryImpl = this.this$0;
            if (vVar.f44614a.f44365f != 206) {
                return ResultStatus.Companion.withSuccess(OtpLoginAPIResponseKt.toOtpLoginResultData(otpLoginAPIResponse, OtpLoginAPIResponseKt.toGenerateTokenResult(otpLoginAPIResponse)));
            }
            String jsonData = OtpLoginAPIResponseKt.toJsonData(otpLoginAPIResponse);
            return ResultStatus.Companion.withUnhandled(jsonData, otpLoginRepositoryImpl.getChallengeType(jsonData));
        } else if (vVar.f44614a.f44365f == 400) {
            C19928a0 a0Var = vVar.f44616c;
            if (a0Var != null) {
                return ResultStatus.Companion.withException(OtpLoginRepositoryImplKt.toAuthError(C19543e0.m33313f0(a0Var.mo72842b())));
            }
            ResultStatus.Companion companion = ResultStatus.Companion;
            String str = vVar.f44614a.f44364e;
            C19383o.m32796f(str, "response.message()");
            return companion.withException(new AuthenticationError.Network(str, "triggeredWebAuth", (Throwable) null, (String) null, 12, (DefaultConstructorMarker) null));
        } else {
            ResultStatus.Companion companion2 = ResultStatus.Companion;
            String str2 = vVar.f44614a.f44364e;
            C19383o.m32796f(str2, "response.message()");
            return companion2.withException(new AuthenticationError.Network(str2, (String) null, (Throwable) null, (String) null, 14, (DefaultConstructorMarker) null));
        }
    }
}
