package p418pa;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: pa.f */
public abstract class C13207f {

    /* renamed from: pa.f$a */
    public static final class C13208a extends C13207f {

        /* renamed from: a */
        public static final C13208a f29042a = new C13208a();
    }

    /* renamed from: pa.f$b */
    public static final class C13209b extends C13207f {

        /* renamed from: a */
        public final String f29043a;

        /* renamed from: b */
        public final String f29044b;

        public C13209b(String str, String str2) {
            this.f29043a = str;
            this.f29044b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13209b)) {
                return false;
            }
            C13209b bVar = (C13209b) obj;
            return C19383o.m32792b(this.f29043a, bVar.f29043a) && C19383o.m32792b(this.f29044b, bVar.f29044b);
        }

        public final int hashCode() {
            return this.f29044b.hashCode() + (this.f29043a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("InfoPrivacySetting(title=");
            h.append(this.f29043a);
            h.append(", value=");
            return C0391c.m1057c(h, this.f29044b, ')');
        }
    }

    /* renamed from: pa.f$c */
    public static final class C13210c extends C13207f {

        /* renamed from: a */
        public final String f29045a;

        /* renamed from: b */
        public final boolean f29046b;

        public C13210c(String str, boolean z) {
            C19383o.m32797g(str, "key");
            this.f29045a = str;
            this.f29046b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13210c)) {
                return false;
            }
            C13210c cVar = (C13210c) obj;
            return C19383o.m32792b(this.f29045a, cVar.f29045a) && this.f29046b == cVar.f29046b;
        }

        public final int hashCode() {
            int hashCode = this.f29045a.hashCode() * 31;
            boolean z = this.f29046b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("TogglePrivacySetting(key=");
            h.append(this.f29045a);
            h.append(", value=");
            return C0391c.m1058d(h, this.f29046b, ')');
        }
    }
}
