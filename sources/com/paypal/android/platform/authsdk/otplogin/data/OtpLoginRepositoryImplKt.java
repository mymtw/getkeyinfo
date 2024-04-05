package com.paypal.android.platform.authsdk.otplogin.data;

import com.google.gson.C16708i;
import com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError;
import com.paypal.android.platform.authsdk.otplogin.domain.OtpFailureResponse;
import com.paypal.android.platform.authsdk.otplogin.domain.Result;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class OtpLoginRepositoryImplKt {
    private static final String CHALLENGE = "challenge";
    private static final String OBJECT_TYPE = "objectType";

    public static final AuthenticationError toAuthError(String str) {
        C19383o.m32797g(str, "<this>");
        try {
            Result result = ((OtpFailureResponse) new C16708i().mo59458e(OtpFailureResponse.class, str)).getResult();
            if (result == null) {
                return new AuthenticationError.Network("Data not found", (String) null, (Throwable) null, "triggeredWebAuth", 6, (DefaultConstructorMarker) null);
            }
            String message = result.getMessage();
            if (message == null) {
                message = "Data not found";
            }
            String str2 = message;
            String code = result.getCode();
            if (code == null) {
                code = "triggeredWebAuth";
            }
            return new AuthenticationError.Network(str2, (String) null, (Throwable) null, code, 6, (DefaultConstructorMarker) null);
        } catch (Exception unused) {
            return new AuthenticationError.Network("Data not found", (String) null, (Throwable) null, "triggeredWebAuth", 6, (DefaultConstructorMarker) null);
        }
    }
}
