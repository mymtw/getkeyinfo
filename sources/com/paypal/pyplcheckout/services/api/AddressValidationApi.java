package com.paypal.pyplcheckout.services.api;

import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.pojo.AddressValidationResponse;
import com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import okhttp3.C20011u;

public final class AddressValidationApi {
    /* access modifiers changed from: private */
    public final String accessToken;
    private final CoroutineDispatcher dispatcher;
    /* access modifiers changed from: private */
    public final C20009t okHttpClient;
    /* access modifiers changed from: private */
    public final C20011u.C20012a requestBuilder;

    public AddressValidationApi(String str, C20011u.C20012a aVar, CoroutineDispatcher coroutineDispatcher, C20009t tVar) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        C19383o.m32797g(aVar, "requestBuilder");
        C19383o.m32797g(coroutineDispatcher, "dispatcher");
        C19383o.m32797g(tVar, "okHttpClient");
        this.accessToken = str;
        this.requestBuilder = aVar;
        this.dispatcher = coroutineDispatcher;
        this.okHttpClient = tVar;
    }

    public final Object validateAddress(PortableShippingAddressRequest portableShippingAddressRequest, C19340c<? super AddressValidationResponse> cVar) {
        return C19697g.m33471i(cVar, this.dispatcher, new AddressValidationApi$validateAddress$2(portableShippingAddressRequest, this, (C19340c<? super AddressValidationApi$validateAddress$2>) null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AddressValidationApi(String str, C20011u.C20012a aVar, CoroutineDispatcher coroutineDispatcher, C20009t tVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new C20011u.C20012a() : aVar, (i & 4) != 0 ? C19760n0.f43720b : coroutineDispatcher, (i & 8) != 0 ? NetworkObject.INSTANCE.getOkHttpClient() : tVar);
    }
}
