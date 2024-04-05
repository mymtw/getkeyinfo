package com.etsy.android.p327ui.home.home;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.user.auth.C11487l;
import kotlin.jvm.internal.C19383o;
import p415of.C13185n;

/* renamed from: com.etsy.android.ui.home.home.g */
public abstract class C9998g {

    /* renamed from: com.etsy.android.ui.home.home.g$a */
    public static final class C9999a extends C9998g {

        /* renamed from: a */
        public final C11487l f22002a;

        public C9999a(C11487l lVar) {
            C19383o.m32797g(lVar, "signInToken");
            this.f22002a = lVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9999a) && C19383o.m32792b(this.f22002a, ((C9999a) obj).f22002a);
        }

        public final int hashCode() {
            return this.f22002a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("GoToSignIn(signInToken=");
            h.append(this.f22002a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.home.home.g$b */
    public static final class C10000b extends C9998g {

        /* renamed from: a */
        public final C13185n f22003a;

        /* renamed from: b */
        public final String f22004b;

        /* renamed from: c */
        public final boolean f22005c;

        public C10000b(C13185n nVar, String str, boolean z) {
            C19383o.m32797g(nVar, "page");
            this.f22003a = nVar;
            this.f22004b = str;
            this.f22005c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10000b)) {
                return false;
            }
            C10000b bVar = (C10000b) obj;
            return C19383o.m32792b(this.f22003a, bVar.f22003a) && C19383o.m32792b(this.f22004b, bVar.f22004b) && this.f22005c == bVar.f22005c;
        }

        public final int hashCode() {
            int hashCode = this.f22003a.hashCode() * 31;
            String str = this.f22004b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            boolean z = this.f22005c;
            if (z) {
                z = true;
            }
            return hashCode2 + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("HomePageLoaded(page=");
            h.append(this.f22003a);
            h.append(", nextPageUrl=");
            h.append(this.f22004b);
            h.append(", scrollToTop=");
            return C0391c.m1058d(h, this.f22005c, ')');
        }
    }
}
