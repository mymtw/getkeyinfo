package p308ac;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;

/* renamed from: ac.b */
public interface C8498b {

    /* renamed from: ac.b$a */
    public static final class C8499a implements C8498b {

        /* renamed from: a */
        public static final C8499a f18521a = new C8499a();
    }

    /* renamed from: ac.b$b */
    public static final class C8500b implements C8498b {

        /* renamed from: a */
        public static final C8500b f18522a = new C8500b();
    }

    /* renamed from: ac.b$c */
    public static final class C8501c implements C8498b {

        /* renamed from: a */
        public static final C8501c f18523a = new C8501c();
    }

    /* renamed from: ac.b$d */
    public static final class C8502d implements C8498b {

        /* renamed from: a */
        public static final C8502d f18524a = new C8502d();
    }

    /* renamed from: ac.b$e */
    public static final class C8503e implements C8498b {

        /* renamed from: a */
        public final List<C8497a> f18525a;

        public C8503e(List<? extends C8497a> list) {
            C19383o.m32797g(list, ResponseConstants.ITEMS);
            this.f18525a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8503e) && C19383o.m32792b(this.f18525a, ((C8503e) obj).f18525a);
        }

        public final int hashCode() {
            return this.f18525a.hashCode();
        }

        public final String toString() {
            return C0070b.m186i(C0072d.m201h("Ui(items="), this.f18525a, ')');
        }

        public C8503e() {
            this(EmptyList.INSTANCE);
        }
    }
}
