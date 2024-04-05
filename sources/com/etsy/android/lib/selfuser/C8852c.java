package com.etsy.android.lib.selfuser;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.User;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.selfuser.c */
public abstract class C8852c {

    /* renamed from: com.etsy.android.lib.selfuser.c$a */
    public static final class C8853a extends C8852c {

        /* renamed from: a */
        public final Throwable f19528a;

        public C8853a(Throwable th) {
            C19383o.m32797g(th, "cause");
            this.f19528a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8853a) && C19383o.m32792b(this.f19528a, ((C8853a) obj).f19528a);
        }

        public final int hashCode() {
            return this.f19528a.hashCode();
        }

        public final String toString() {
            return C0070b.m185h(C0072d.m201h("Failure(cause="), this.f19528a, ')');
        }
    }

    /* renamed from: com.etsy.android.lib.selfuser.c$b */
    public static final class C8854b extends C8852c {

        /* renamed from: a */
        public final User f19529a;

        public C8854b(User user) {
            this.f19529a = user;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8854b) && C19383o.m32792b(this.f19529a, ((C8854b) obj).f19529a);
        }

        public final int hashCode() {
            return this.f19529a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(user=");
            h.append(this.f19529a);
            h.append(')');
            return h.toString();
        }
    }
}
