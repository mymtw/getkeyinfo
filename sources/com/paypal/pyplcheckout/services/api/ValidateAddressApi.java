package com.paypal.pyplcheckout.services.api;

import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.pojo.ValidateAddressQueryParams;
import com.paypal.pyplcheckout.pojo.ValidateAddressResponse;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import okhttp3.C20011u;

public final class ValidateAddressApi {
    /* access modifiers changed from: private */
    public final String accessToken;
    private final CoroutineDispatcher dispatcher;
    /* access modifiers changed from: private */
    public final C20009t okHttpClient;
    /* access modifiers changed from: private */
    public final String query;
    /* access modifiers changed from: private */
    public final C20011u.C20012a requestBuilder;

    public ValidateAddressApi(String str, C20011u.C20012a aVar, CoroutineDispatcher coroutineDispatcher, C20009t tVar) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        C19383o.m32797g(aVar, "requestBuilder");
        C19383o.m32797g(coroutineDispatcher, "dispatcher");
        C19383o.m32797g(tVar, "okHttpClient");
        this.accessToken = str;
        this.requestBuilder = aVar;
        this.dispatcher = coroutineDispatcher;
        this.okHttpClient = tVar;
        this.query = "query VALIDATE_ADDRESS(\n    $line1: String,\n    $line2: String,\n    $city: String,\n    $state: String,\n    $postalCode: String,\n    $countryCode: CountryCodes) {\n        validateAddress(\n            line1: $line1, \n            line2: $line2, \n            city: $city, \n            state: $state, \n            postalCode: $postalCode,\n            countryCode: $countryCode\n        ) {\n          success\n        }\n    }";
    }

    public final Object validateAddress(ValidateAddressQueryParams validateAddressQueryParams, C19340c<? super ValidateAddressResponse> cVar) {
        return C19697g.m33471i(cVar, this.dispatcher, new ValidateAddressApi$validateAddress$2(this, validateAddressQueryParams, (C19340c<? super ValidateAddressApi$validateAddress$2>) null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ValidateAddressApi(String str, C20011u.C20012a aVar, CoroutineDispatcher coroutineDispatcher, C20009t tVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new C20011u.C20012a() : aVar, (i & 4) != 0 ? C19760n0.f43720b : coroutineDispatcher, (i & 8) != 0 ? NetworkObject.INSTANCE.getOkHttpClient() : tVar);
    }
}
