package androidx.security.crypto;

import com.google.crypto.tink.KeyTemplate;
import p551dm.C17654m;

public enum EncryptedFile$FileEncryptionScheme {
    AES256_GCM_HKDF_4KB(KeyTemplate.m26517a("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", ((C17654m) r2.mo58538l()).mo58605c(), KeyTemplate.OutputPrefixType.RAW));
    
    private final KeyTemplate mStreamingAeadKeyTemplate;

    private EncryptedFile$FileEncryptionScheme(KeyTemplate keyTemplate) {
        this.mStreamingAeadKeyTemplate = keyTemplate;
    }

    public KeyTemplate getKeyTemplate() {
        return this.mStreamingAeadKeyTemplate;
    }
}
