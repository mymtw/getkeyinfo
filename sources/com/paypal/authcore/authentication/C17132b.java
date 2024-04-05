package com.paypal.authcore.authentication;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.authcore.authentication.b */
public final class C17132b {

    /* renamed from: a */
    public final AuthenticationState f37475a;

    /* renamed from: b */
    public final String f37476b;

    public C17132b(AuthenticationState authenticationState, String str) {
        C19383o.m32797g(authenticationState, "authState");
        this.f37475a = authenticationState;
        this.f37476b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17132b)) {
            return false;
        }
        C17132b bVar = (C17132b) obj;
        return this.f37475a == bVar.f37475a && C19383o.m32792b(this.f37476b, bVar.f37476b);
    }

    public final int hashCode() {
        int hashCode = this.f37475a.hashCode() * 31;
        String str = this.f37476b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AuthenticationContext(authState=");
        h.append(this.f37475a);
        h.append(", publicCredential=");
        h.append(this.f37476b);
        h.append(')');
        return h.toString();
    }
}
