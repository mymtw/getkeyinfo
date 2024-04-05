package p418pa;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: pa.e */
public abstract class C13203e {

    /* renamed from: pa.e$a */
    public static final class C13204a extends C13203e {

        /* renamed from: a */
        public static final C13204a f29039a = new C13204a();
    }

    /* renamed from: pa.e$b */
    public static final class C13205b extends C13203e {

        /* renamed from: a */
        public static final C13205b f29040a = new C13205b();
    }

    /* renamed from: pa.e$c */
    public static final class C13206c extends C13203e {

        /* renamed from: a */
        public final List<C13207f> f29041a;

        public C13206c(List<? extends C13207f> list) {
            C19383o.m32797g(list, "settingsList");
            this.f29041a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13206c) && C19383o.m32792b(this.f29041a, ((C13206c) obj).f29041a);
        }

        public final int hashCode() {
            return this.f29041a.hashCode();
        }

        public final String toString() {
            return C0070b.m186i(C0072d.m201h("Success(settingsList="), this.f29041a, ')');
        }
    }
}
