package com.paypal.android.platform.authsdk.authcommon.partnerauth.security;

public final class SecureKeyFactory {
    public static final SecureKeyFactory INSTANCE = new SecureKeyFactory();

    private SecureKeyFactory() {
    }

    public final CryptoSecureKeyWrapper createCryptoSecureKeyWrapper() {
        return new CryptoSecureKeyWrapperImpl();
    }

    public final SecureKeyWrapper createSecureKeyWrapper() {
        return new NoAuthSecureKeyWrapper();
    }
}
