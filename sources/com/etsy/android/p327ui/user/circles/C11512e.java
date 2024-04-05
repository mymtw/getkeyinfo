package com.etsy.android.p327ui.user.circles;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.circles.e */
public abstract class C11512e {

    /* renamed from: com.etsy.android.ui.user.circles.e$a */
    public static final class C11513a extends C11512e {

        /* renamed from: a */
        public final int f25398a;

        public C11513a(int i) {
            this.f25398a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11513a) && this.f25398a == ((C11513a) obj).f25398a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f25398a);
        }

        public final String toString() {
            return C0073e.m208h(C0072d.m201h("CirclesContainingMe(offset="), this.f25398a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.circles.e$b */
    public static final class C11514b extends C11512e {

        /* renamed from: a */
        public final String f25399a;

        /* renamed from: b */
        public final int f25400b;

        public C11514b(String str, int i) {
            C19383o.m32797g(str, "userId");
            this.f25399a = str;
            this.f25400b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11514b)) {
                return false;
            }
            C11514b bVar = (C11514b) obj;
            return C19383o.m32792b(this.f25399a, bVar.f25399a) && this.f25400b == bVar.f25400b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f25400b) + (this.f25399a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("CirclesContainingUser(userId=");
            h.append(this.f25399a);
            h.append(", offset=");
            return C0073e.m208h(h, this.f25400b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.circles.e$c */
    public static final class C11515c extends C11512e {

        /* renamed from: a */
        public final int f25401a;

        public C11515c(int i) {
            this.f25401a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11515c) && this.f25401a == ((C11515c) obj).f25401a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f25401a);
        }

        public final String toString() {
            return C0073e.m208h(C0072d.m201h("MembersOfMyCircle(offset="), this.f25401a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.circles.e$d */
    public static final class C11516d extends C11512e {

        /* renamed from: a */
        public final String f25402a;

        /* renamed from: b */
        public final int f25403b;

        public C11516d(String str, int i) {
            C19383o.m32797g(str, "userId");
            this.f25402a = str;
            this.f25403b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11516d)) {
                return false;
            }
            C11516d dVar = (C11516d) obj;
            return C19383o.m32792b(this.f25402a, dVar.f25402a) && this.f25403b == dVar.f25403b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f25403b) + (this.f25402a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("MembersOfUsersCircle(userId=");
            h.append(this.f25402a);
            h.append(", offset=");
            return C0073e.m208h(h, this.f25403b, ')');
        }
    }
}
