package com.paypal.android.platform.authsdk.splitlogin.domain;

import com.paypal.android.platform.authsdk.authcommon.model.ResultStatus;
import kotlin.coroutines.C19340c;

public interface SplitLoginRepository {
    Object verifyCredential(SplitLoginRequest splitLoginRequest, C19340c<? super ResultStatus<SplitLoginData>> cVar);
}
