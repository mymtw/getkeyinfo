package com.paypal.android.platform.authsdk.splitlogin.data;

import androidx.appcompat.widget.C0326j;
import com.google.gson.C16708i;
import com.paypal.android.platform.authsdk.authcommon.model.ResultStatus;
import com.paypal.android.platform.authsdk.splitlogin.data.api.SplitLoginApiRequest;
import com.paypal.android.platform.authsdk.splitlogin.data.api.SplitLoginApiService;
import com.paypal.android.platform.authsdk.splitlogin.domain.SplitLoginData;
import com.paypal.android.platform.authsdk.splitlogin.domain.SplitLoginRepository;
import com.paypal.android.platform.authsdk.splitlogin.domain.SplitLoginRequest;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineDispatcher;

public final class SplitLoginRepositoryImpl implements SplitLoginRepository {
    private final SplitLoginRequest data;
    private final CoroutineDispatcher dispatcher;
    /* access modifiers changed from: private */
    public final SplitLoginApiService splitLoginApiService;

    public SplitLoginRepositoryImpl(SplitLoginApiService splitLoginApiService2, SplitLoginRequest splitLoginRequest, CoroutineDispatcher coroutineDispatcher) {
        C19383o.m32797g(splitLoginApiService2, "splitLoginApiService");
        C19383o.m32797g(splitLoginRequest, "data");
        C19383o.m32797g(coroutineDispatcher, "dispatcher");
        this.splitLoginApiService = splitLoginApiService2;
        this.data = splitLoginRequest;
        this.dispatcher = coroutineDispatcher;
    }

    /* access modifiers changed from: private */
    public final SplitLoginApiRequest createRequestBody(SplitLoginRequest splitLoginRequest) {
        return new SplitLoginApiRequest(splitLoginRequest.getClientConfig().getDeviceInfo().getId(), splitLoginRequest.getThirdPartyClientID(), splitLoginRequest.getPublicCredential(), splitLoginRequest.getClientConfig().getTenant().toString(), splitLoginRequest.getClientConfig().getRedirectUri(), C0326j.m864i("auth-", splitLoginRequest.getClientConfig().getGuid()), new C16708i().mo59463j(splitLoginRequest.getClientConfig().getAppInfo()), new C16708i().mo59463j(splitLoginRequest.getClientConfig().getDeviceInfo()), splitLoginRequest.getClientConfig().getRiskData());
    }

    public final SplitLoginRequest getData() {
        return this.data;
    }

    public Object verifyCredential(SplitLoginRequest splitLoginRequest, C19340c<? super ResultStatus<SplitLoginData>> cVar) {
        return C19697g.m33471i(cVar, this.dispatcher, new SplitLoginRepositoryImpl$verifyCredential$2(this, splitLoginRequest, (C19340c<? super SplitLoginRepositoryImpl$verifyCredential$2>) null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SplitLoginRepositoryImpl(SplitLoginApiService splitLoginApiService2, SplitLoginRequest splitLoginRequest, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(splitLoginApiService2, splitLoginRequest, (i & 4) != 0 ? C19760n0.f43720b : coroutineDispatcher);
    }
}
