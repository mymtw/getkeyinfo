package com.paypal.android.platform.authsdk.authcommon.network.utils;

import androidx.compose.animation.C0388a;
import com.paypal.android.platform.authsdk.authcommon.model.ClientConfig;
import com.paypal.android.platform.authsdk.authcommon.utils.Base64;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AuthHeaderBuilder {
    private final HashMap<String, String> headers;

    public AuthHeaderBuilder(ClientConfig clientConfig, String str) {
        C19383o.m32797g(clientConfig, "clientConfig");
        HashMap<String, String> hashMap = new HashMap<>();
        this.headers = hashMap;
        String str2 = "";
        String encode = Base64.INSTANCE.encode(C0388a.m1049e(new Object[]{clientConfig.getProxyClientId(), str2}, 2, "%s:%s", "format(format, *args)"));
        str2 = encode != null ? encode : str2;
        hashMap.put("Authorization", "Basic " + str2);
        hashMap.put(AuthHeaderBuilderKt.PAYPAL_CLIENT_METADATA_ID, AuthHeaderBuilderKt.toPayPalClientMetaDataId(clientConfig.getRiskData()));
        hashMap.put(ConstantsKt.PAYPAL_ENTRY_POINT, ConstantsKt.PAYPAL_ENTRY_POINT_VALUE);
        hashMap.putAll(HeaderUtilsKt.createPayPalConsumerAppContextHeader(clientConfig.getDeviceInfo(), clientConfig.getAppInfo(), clientConfig.getGuid(), str));
    }

    public final HashMap<String, String> buildHeaderMap() {
        return this.headers;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuthHeaderBuilder(ClientConfig clientConfig, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(clientConfig, (i & 2) != 0 ? null : str);
    }
}
