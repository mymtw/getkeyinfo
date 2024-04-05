package com.paypal.android.platform.authsdk.splitlogin.data;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError;
import com.paypal.android.platform.authsdk.authcommon.model.ResultStatus;
import com.paypal.android.platform.authsdk.authcommon.network.utils.AuthHeaderBuilder;
import com.paypal.android.platform.authsdk.splitlogin.data.api.SplitLoginApiRequest;
import com.paypal.android.platform.authsdk.splitlogin.data.api.SplitLoginApiService;
import com.paypal.android.platform.authsdk.splitlogin.domain.SplitLoginData;
import com.paypal.android.platform.authsdk.splitlogin.domain.SplitLoginRequest;
import java.io.IOException;
import java.util.HashMap;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;
import retrofit2.C20145v;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.splitlogin.data.SplitLoginRepositoryImpl$verifyCredential$2", mo70541f = "SplitLoginRepositoryImpl.kt", mo70542l = {29}, mo70543m = "invokeSuspend")
public final class SplitLoginRepositoryImpl$verifyCredential$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super ResultStatus<SplitLoginData>>, Object> {
    public final /* synthetic */ SplitLoginRequest $data;
    public int label;
    public final /* synthetic */ SplitLoginRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitLoginRepositoryImpl$verifyCredential$2(SplitLoginRepositoryImpl splitLoginRepositoryImpl, SplitLoginRequest splitLoginRequest, C19340c<? super SplitLoginRepositoryImpl$verifyCredential$2> cVar) {
        super(2, cVar);
        this.this$0 = splitLoginRepositoryImpl;
        this.$data = splitLoginRequest;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SplitLoginRepositoryImpl$verifyCredential$2(this.this$0, this.$data, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super ResultStatus<SplitLoginData>> cVar) {
        return ((SplitLoginRepositoryImpl$verifyCredential$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            SplitLoginApiRequest access$createRequestBody = this.this$0.createRequestBody(this.$data);
            SplitLoginApiService access$getSplitLoginApiService$p = this.this$0.splitLoginApiService;
            HashMap<String, String> buildHeaderMap = new AuthHeaderBuilder(this.$data.getClientConfig(), this.$data.getRiskVisitorId()).buildHeaderMap();
            this.label = 1;
            obj = access$getSplitLoginApiService$p.verifyCredential(buildHeaderMap, access$createRequestBody, this);
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
            SplitLoginResponse splitLoginResponse = (SplitLoginResponse) vVar.f44615b;
            if (splitLoginResponse == null) {
                return ResultStatus.Companion.withException(new AuthenticationError.Network("Data not found", (String) null, (Throwable) null, (String) null, 14, (DefaultConstructorMarker) null));
            }
            if (vVar.f44614a.f44365f != 206) {
                return ResultStatus.Companion.withSuccess(SplitLoginResponseKt.toSplitLoginData(splitLoginResponse));
            }
            String jsonData = SplitLoginResponseKt.toJsonData(splitLoginResponse);
            return ResultStatus.Companion.withUnhandled(jsonData, SplitLoginResponseKt.getChallengeType(splitLoginResponse, jsonData));
        }
        ResultStatus.Companion companion = ResultStatus.Companion;
        String str = vVar.f44614a.f44364e;
        C19383o.m32796f(str, "response.message()");
        return companion.withException(new AuthenticationError.Network(str, (String) null, (Throwable) null, (String) null, 14, (DefaultConstructorMarker) null));
    }
}
