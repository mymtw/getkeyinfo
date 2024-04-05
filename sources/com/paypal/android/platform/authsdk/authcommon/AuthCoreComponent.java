package com.paypal.android.platform.authsdk.authcommon;

import com.paypal.android.platform.authsdk.authcommon.model.ClientConfig;
import okhttp3.C20009t;

public interface AuthCoreComponent {
    ChallengeParserRegistry getChallengeParserRegistry();

    ChallengeRegistry getChallengeRegistry();

    ClientConfig getClientConfig();

    C20009t getOkHttpClient();
}
