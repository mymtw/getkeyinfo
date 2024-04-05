package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.BaseSecureKeyWrapper;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: com.google.firebase.installations.local.a */
public final class C16572a {

    /* renamed from: c */
    public static final String[] f36772c = {"*", FirebaseMessaging.INSTANCE_ID_SCOPE, "GCM", ""};

    /* renamed from: a */
    public final SharedPreferences f36773a;

    /* renamed from: b */
    public final String f36774b;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        if (r0.isEmpty() != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16572a(p575gm.C17793c r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.mo69021a()
            android.content.Context r0 = r4.f38672a
            r1 = 0
            java.lang.String r2 = "com.google.android.gms.appid"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r1)
            r3.f36773a = r0
            r4.mo69021a()
            gm.e r0 = r4.f38674c
            java.lang.String r0 = r0.f38688e
            if (r0 == 0) goto L_0x001b
            goto L_0x004a
        L_0x001b:
            r4.mo69021a()
            gm.e r4 = r4.f38674c
            java.lang.String r0 = r4.f38685b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L_0x0033
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L_0x0033
            goto L_0x004a
        L_0x0033:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L_0x0040
        L_0x003e:
            r0 = r2
            goto L_0x004a
        L_0x0040:
            r0 = 1
            r0 = r4[r0]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x004a
            goto L_0x003e
        L_0x004a:
            r3.f36774b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.local.C16572a.<init>(gm.c):void");
    }

    /* renamed from: a */
    public final String mo59103a() {
        String str;
        PublicKey publicKey;
        synchronized (this.f36773a) {
            str = null;
            String string = this.f36773a.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance(BaseSecureKeyWrapper.RSA_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("ContentValues", "Invalid key stored " + e);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
        }
        return str;
    }
}
