package p459ud;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;

/* renamed from: ud.a */
public abstract class C13473a {

    /* renamed from: a */
    public final EmptyList f29495a = EmptyList.INSTANCE;

    /* renamed from: ud.a$a */
    public static final class C13474a extends C13473a {

        /* renamed from: b */
        public static final C13474a f29496b = new C13474a();
    }

    /* renamed from: ud.a$b */
    public static final class C13475b extends C13473a {

        /* renamed from: b */
        public static final C13475b f29497b = new C13475b();
    }

    /* renamed from: ud.a$c */
    public static final class C13476c extends C13473a {

        /* renamed from: b */
        public static final C13476c f29498b = new C13476c();

        /* renamed from: a */
        public final List<C10423j> mo46151a() {
            return C17782b.m29864d0(C13479b.f29502a);
        }
    }

    /* renamed from: ud.a$d */
    public static final class C13477d extends C13473a {

        /* renamed from: b */
        public static final C13477d f29499b = new C13477d();
    }

    /* renamed from: ud.a$e */
    public static final class C13478e extends C13473a {

        /* renamed from: b */
        public final List<C10423j> f29500b;

        /* renamed from: c */
        public final List<C10423j> f29501c;

        public C13478e(ArrayList arrayList) {
            this.f29500b = arrayList;
            this.f29501c = arrayList;
        }

        /* renamed from: a */
        public final List<C10423j> mo46151a() {
            return this.f29501c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13478e) && C19383o.m32792b(this.f29500b, ((C13478e) obj).f29500b);
        }

        public final int hashCode() {
            return this.f29500b.hashCode();
        }

        public final String toString() {
            return C0070b.m186i(C0072d.m201h("Success(recommendations="), this.f29500b, ')');
        }
    }

    /* renamed from: a */
    public List<C10423j> mo46151a() {
        return this.f29495a;
    }
}
