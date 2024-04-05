package p499zd;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: zd.a */
public abstract class C13950a {

    /* renamed from: zd.a$a */
    public static final class C13951a extends C13950a {

        /* renamed from: a */
        public final Throwable f30669a;

        public C13951a(Throwable th) {
            C19383o.m32797g(th, "throwable");
            this.f30669a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13951a) && C19383o.m32792b(this.f30669a, ((C13951a) obj).f30669a);
        }

        public final int hashCode() {
            return this.f30669a.hashCode();
        }

        public final String toString() {
            return C0070b.m185h(C0072d.m201h("Error(throwable="), this.f30669a, ')');
        }
    }

    /* renamed from: zd.a$b */
    public static final class C13952b extends C13950a {

        /* renamed from: a */
        public static final C13952b f30670a = new C13952b();
    }

    /* renamed from: zd.a$c */
    public static final class C13953c extends C13950a {

        /* renamed from: a */
        public final String f30671a;

        public C13953c(String str) {
            this.f30671a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13953c) && C19383o.m32792b(this.f30671a, ((C13953c) obj).f30671a);
        }

        public final int hashCode() {
            String str = this.f30671a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("Success(message="), this.f30671a, ')');
        }

        public C13953c() {
            this((String) null);
        }
    }
}
