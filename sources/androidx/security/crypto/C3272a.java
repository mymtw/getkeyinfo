package androidx.security.crypto;

import android.security.keystore.KeyGenParameterSpec;

/* renamed from: androidx.security.crypto.a */
public final class C3272a {

    /* renamed from: a */
    public static final KeyGenParameterSpec f7598a = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256).build();
}
