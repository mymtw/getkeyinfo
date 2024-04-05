package p480xb;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: xb.c */
public final class C13871c {

    /* renamed from: a */
    public final String f30530a;

    /* renamed from: b */
    public final String f30531b;

    /* renamed from: c */
    public final String f30532c;

    public C13871c(String str, String str2, String str3) {
        this.f30530a = str;
        this.f30531b = str2;
        this.f30532c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13871c)) {
            return false;
        }
        C13871c cVar = (C13871c) obj;
        return C19383o.m32792b(this.f30530a, cVar.f30530a) && C19383o.m32792b(this.f30531b, cVar.f30531b) && C19383o.m32792b(this.f30532c, cVar.f30532c);
    }

    public final int hashCode() {
        return this.f30532c.hashCode() + C0023f.m105e(this.f30531b, this.f30530a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SignedMessage(encryptedMessage=");
        h.append(this.f30530a);
        h.append(", ephemeralPublicKey=");
        h.append(this.f30531b);
        h.append(", tag=");
        return C0391c.m1057c(h, this.f30532c, ')');
    }
}
