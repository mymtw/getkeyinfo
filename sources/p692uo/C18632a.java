package p692uo;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;
import p003a2.C0023f;

/* renamed from: uo.a */
public final class C18632a {

    /* renamed from: a */
    public final String f41144a;

    /* renamed from: b */
    public final Set<String> f41145b;

    /* renamed from: c */
    public final String f41146c;

    /* renamed from: d */
    public final Boolean f41147d;

    public C18632a() {
        throw null;
    }

    public C18632a(PackageInfo packageInfo, boolean z) {
        String str = packageInfo.packageName;
        Signature[] signatureArr = packageInfo.signatures;
        HashSet hashSet = new HashSet();
        int length = signatureArr.length;
        int i = 0;
        while (i < length) {
            try {
                hashSet.add(Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signatureArr[i].toByteArray()), 10));
                i++;
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("Platform does not supportSHA-512 hashing");
            }
        }
        String str2 = packageInfo.versionName;
        this.f41144a = str;
        this.f41145b = hashSet;
        this.f41146c = str2;
        this.f41147d = Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C18632a)) {
            return false;
        }
        C18632a aVar = (C18632a) obj;
        return this.f41144a.equals(aVar.f41144a) && this.f41146c.equals(aVar.f41146c) && this.f41147d == aVar.f41147d && this.f41145b.equals(aVar.f41145b);
    }

    public final int hashCode() {
        int e = (this.f41147d.booleanValue() ? 1 : 0) + C0023f.m105e(this.f41146c, this.f41144a.hashCode() * 92821, 92821);
        for (String hashCode : this.f41145b) {
            e = (e * 92821) + hashCode.hashCode();
        }
        return e;
    }
}
