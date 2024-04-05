package com.etsy.android.p327ui.cart;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.UserCounters;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.c */
public abstract class C9265c {

    /* renamed from: com.etsy.android.ui.cart.c$a */
    public static final class C9266a extends C9265c {

        /* renamed from: a */
        public final Throwable f20466a;

        public C9266a(Throwable th) {
            C19383o.m32797g(th, "error");
            this.f20466a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9266a) && C19383o.m32792b(this.f20466a, ((C9266a) obj).f20466a);
        }

        public final int hashCode() {
            return this.f20466a.hashCode();
        }

        public final String toString() {
            return C0070b.m185h(C0072d.m201h("Error(error="), this.f20466a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.cart.c$b */
    public static final class C9267b extends C9265c {

        /* renamed from: a */
        public final UserCounters f20467a;

        public C9267b(UserCounters userCounters) {
            this.f20467a = userCounters;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9267b) && C19383o.m32792b(this.f20467a, ((C9267b) obj).f20467a);
        }

        public final int hashCode() {
            UserCounters userCounters = this.f20467a;
            if (userCounters == null) {
                return 0;
            }
            return userCounters.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(userCounter=");
            h.append(this.f20467a);
            h.append(')');
            return h.toString();
        }
    }
}
