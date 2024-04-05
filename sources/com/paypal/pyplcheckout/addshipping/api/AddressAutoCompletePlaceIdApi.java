package com.paypal.pyplcheckout.addshipping.api;

import android.support.p013v4.media.C0069a;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompletePlaceIdRequest;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompletePlaceIdResponse;
import com.paypal.pyplcheckout.services.api.NetworkObject;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import okhttp3.C20011u;

public final class AddressAutoCompletePlaceIdApi {
    /* access modifiers changed from: private */
    public final String accessToken;
    private final CoroutineDispatcher dispatcher;
    /* access modifiers changed from: private */
    public final C20009t okHttpClient;
    /* access modifiers changed from: private */
    public final C20011u.C20012a requestBuilder;
    /* access modifiers changed from: private */
    public final String sessionId;

    public AddressAutoCompletePlaceIdApi(String str, C20011u.C20012a aVar, CoroutineDispatcher coroutineDispatcher, C20009t tVar, String str2) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        C19383o.m32797g(aVar, "requestBuilder");
        C19383o.m32797g(coroutineDispatcher, "dispatcher");
        C19383o.m32797g(tVar, "okHttpClient");
        C19383o.m32797g(str2, "sessionId");
        this.accessToken = str;
        this.requestBuilder = aVar;
        this.dispatcher = coroutineDispatcher;
        this.okHttpClient = tVar;
        this.sessionId = str2;
    }

    public final Object getAddressAutoCompletePlaceId(AddressAutoCompletePlaceIdRequest addressAutoCompletePlaceIdRequest, C19340c<? super AddressAutoCompletePlaceIdResponse> cVar) {
        return C19697g.m33471i(cVar, this.dispatcher, new AddressAutoCompletePlaceIdApi$getAddressAutoCompletePlaceId$2(this, addressAutoCompletePlaceIdRequest, (C19340c<? super AddressAutoCompletePlaceIdApi$getAddressAutoCompletePlaceId$2>) null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AddressAutoCompletePlaceIdApi(String str, C20011u.C20012a aVar, CoroutineDispatcher coroutineDispatcher, C20009t tVar, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new C20011u.C20012a() : aVar, (i & 4) != 0 ? C19760n0.f43720b : coroutineDispatcher, (i & 8) != 0 ? NetworkObject.INSTANCE.getOkHttpClient() : tVar, (i & 16) != 0 ? C0069a.m174e("randomUUID().toString()") : str2);
    }
}
