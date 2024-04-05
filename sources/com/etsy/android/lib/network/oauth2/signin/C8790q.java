package com.etsy.android.lib.network.oauth2.signin;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.network.oauth2.AccessTokens;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.network.oauth2.signin.q */
public abstract class C8790q {

    /* renamed from: com.etsy.android.lib.network.oauth2.signin.q$a */
    public static final class C8791a extends C8790q {

        /* renamed from: a */
        public final Throwable f19344a;

        public C8791a(Throwable th) {
            this.f19344a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8791a) && C19383o.m32792b(this.f19344a, ((C8791a) obj).f19344a);
        }

        public final int hashCode() {
            return this.f19344a.hashCode();
        }

        public final String toString() {
            return C0070b.m185h(C0072d.m201h("Error(throwable="), this.f19344a, ')');
        }
    }

    /* renamed from: com.etsy.android.lib.network.oauth2.signin.q$b */
    public static final class C8792b extends C8790q {

        /* renamed from: a */
        public final AccessTokens f19345a;

        public C8792b(AccessTokens accessTokens) {
            C19383o.m32797g(accessTokens, "tokenPackage");
            this.f19345a = accessTokens;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8792b) && C19383o.m32792b(this.f19345a, ((C8792b) obj).f19345a);
        }

        public final int hashCode() {
            return this.f19345a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(tokenPackage=");
            h.append(this.f19345a);
            h.append(')');
            return h.toString();
        }
    }
}
