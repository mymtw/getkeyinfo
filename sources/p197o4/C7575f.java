package p197o4;

import android.net.Uri;
import android.text.TextUtils;
import androidx.activity.C0114h;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import p150j4.C7109b;

/* renamed from: o4.f */
public final class C7575f implements C7109b {

    /* renamed from: b */
    public final C7576g f16830b;

    /* renamed from: c */
    public final URL f16831c;

    /* renamed from: d */
    public final String f16832d;

    /* renamed from: e */
    public String f16833e;

    /* renamed from: f */
    public URL f16834f;

    /* renamed from: g */
    public volatile byte[] f16835g;

    /* renamed from: h */
    public int f16836h;

    public C7575f(URL url) {
        C7578i iVar = C7576g.f16837a;
        C0114h.m281L(url);
        this.f16831c = url;
        this.f16832d = null;
        C0114h.m281L(iVar);
        this.f16830b = iVar;
    }

    /* renamed from: b */
    public final void mo12991b(MessageDigest messageDigest) {
        if (this.f16835g == null) {
            this.f16835g = mo20010c().getBytes(C7109b.f15813a);
        }
        messageDigest.update(this.f16835g);
    }

    /* renamed from: c */
    public final String mo20010c() {
        String str = this.f16832d;
        if (str != null) {
            return str;
        }
        URL url = this.f16831c;
        C0114h.m281L(url);
        return url.toString();
    }

    /* renamed from: d */
    public final URL mo20011d() throws MalformedURLException {
        if (this.f16834f == null) {
            if (TextUtils.isEmpty(this.f16833e)) {
                String str = this.f16832d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f16831c;
                    C0114h.m281L(url);
                    str = url.toString();
                }
                this.f16833e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f16834f = new URL(this.f16833e);
        }
        return this.f16834f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7575f)) {
            return false;
        }
        C7575f fVar = (C7575f) obj;
        return mo20010c().equals(fVar.mo20010c()) && this.f16830b.equals(fVar.f16830b);
    }

    public final int hashCode() {
        if (this.f16836h == 0) {
            int hashCode = mo20010c().hashCode();
            this.f16836h = hashCode;
            this.f16836h = this.f16830b.hashCode() + (hashCode * 31);
        }
        return this.f16836h;
    }

    public final String toString() {
        return mo20010c();
    }

    public C7575f(String str) {
        C7578i iVar = C7576g.f16837a;
        this.f16831c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f16832d = str;
            C0114h.m281L(iVar);
            this.f16830b = iVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
