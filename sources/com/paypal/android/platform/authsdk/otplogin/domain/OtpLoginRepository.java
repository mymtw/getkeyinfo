package com.paypal.android.platform.authsdk.otplogin.domain;

import com.paypal.android.platform.authsdk.authcommon.model.ResultStatus;
import java.util.Map;
import kotlin.coroutines.C19340c;

public interface OtpLoginRepository {
    Object generateChallenge(OTPLoginData oTPLoginData, C19340c<? super ResultStatus<GenerateChallengeData>> cVar);

    Object performOtpLogin(OTPLoginData oTPLoginData, Map<String, String> map, C19340c<? super ResultStatus<OtpLoginResultData>> cVar);
}
