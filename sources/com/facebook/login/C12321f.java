package com.facebook.login;

import android.support.p013v4.media.C0072d;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.facebook.login.f */
public final class C12321f {

    /* renamed from: a */
    public final AccessToken f27459a;

    /* renamed from: b */
    public final AuthenticationToken f27460b;

    /* renamed from: c */
    public final Set<String> f27461c;

    /* renamed from: d */
    public final Set<String> f27462d;

    public C12321f(AccessToken accessToken, AuthenticationToken authenticationToken, HashSet hashSet, HashSet hashSet2) {
        this.f27459a = accessToken;
        this.f27460b = authenticationToken;
        this.f27461c = hashSet;
        this.f27462d = hashSet2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12321f)) {
            return false;
        }
        C12321f fVar = (C12321f) obj;
        return C19383o.m32792b(this.f27459a, fVar.f27459a) && C19383o.m32792b(this.f27460b, fVar.f27460b) && C19383o.m32792b(this.f27461c, fVar.f27461c) && C19383o.m32792b(this.f27462d, fVar.f27462d);
    }

    public final int hashCode() {
        AccessToken accessToken = this.f27459a;
        int i = 0;
        int hashCode = (accessToken != null ? accessToken.hashCode() : 0) * 31;
        AuthenticationToken authenticationToken = this.f27460b;
        int hashCode2 = (hashCode + (authenticationToken != null ? authenticationToken.hashCode() : 0)) * 31;
        Set<String> set = this.f27461c;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Set<String> set2 = this.f27462d;
        if (set2 != null) {
            i = set2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("LoginResult(accessToken=");
        h.append(this.f27459a);
        h.append(", authenticationToken=");
        h.append(this.f27460b);
        h.append(", recentlyGrantedPermissions=");
        h.append(this.f27461c);
        h.append(", recentlyDeniedPermissions=");
        h.append(this.f27462d);
        h.append(")");
        return h.toString();
    }
}
