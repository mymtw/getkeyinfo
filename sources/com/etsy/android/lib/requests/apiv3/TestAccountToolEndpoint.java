package com.etsy.android.lib.requests.apiv3;

import com.etsy.android.lib.models.apiv3.TestAccountToolResponse;
import p248tp.C8071s;

public interface TestAccountToolEndpoint {
    C8071s<TestAccountToolResponse> getTestAccountToolAuthTokenAndSecret(String str);
}
