package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p505aj.C13999g;
import p505aj.C14001h;
import p505aj.C14002i;
import p505aj.C14014t;

/* renamed from: com.google.android.exoplayer2.source.hls.a */
public final class C14308a implements C13999g {

    /* renamed from: a */
    public final C13999g f31856a;

    /* renamed from: b */
    public final byte[] f31857b;

    /* renamed from: c */
    public final byte[] f31858c;

    /* renamed from: d */
    public CipherInputStream f31859d;

    public C14308a(C13999g gVar, byte[] bArr, byte[] bArr2) {
        this.f31856a = gVar;
        this.f31857b = bArr;
        this.f31858c = bArr2;
    }

    /* renamed from: b */
    public final long mo46812b(C14002i iVar) throws IOException {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                instance.init(2, new SecretKeySpec(this.f31857b, "AES"), new IvParameterSpec(this.f31858c));
                C14001h hVar = new C14001h(this.f31856a, iVar);
                this.f31859d = new CipherInputStream(hVar, instance);
                hVar.mo46817a();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void close() throws IOException {
        if (this.f31859d != null) {
            this.f31859d = null;
            this.f31856a.close();
        }
    }

    /* renamed from: d */
    public final Map<String, List<String>> mo46815d() {
        return this.f31856a.mo46815d();
    }

    /* renamed from: e */
    public final void mo46806e(C14014t tVar) {
        tVar.getClass();
        this.f31856a.mo46806e(tVar);
    }

    public final Uri getUri() {
        return this.f31856a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.f31859d.getClass();
        int read = this.f31859d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
