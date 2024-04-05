package p228s;

import com.google.android.play.core.appupdate.C15562d;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C19289b;
import kotlin.jvm.internal.C19383o;
import p755lq.C19875a;

/* renamed from: s.a */
public interface C7788a<E> extends List<E>, Collection, C19875a {

    /* renamed from: s.a$a */
    public static final class C7789a<E> extends C19289b<E> implements C7788a<E> {

        /* renamed from: b */
        public final C7788a<E> f17228b;

        /* renamed from: c */
        public final int f17229c;

        /* renamed from: d */
        public int f17230d;

        public C7789a(C7788a<? extends E> aVar, int i, int i2) {
            C19383o.m32797g(aVar, "source");
            this.f17228b = aVar;
            this.f17229c = i;
            C15562d.m25209y(i, i2, aVar.size());
            this.f17230d = i2 - i;
        }

        /* renamed from: a */
        public final int mo5763a() {
            return this.f17230d;
        }

        public final E get(int i) {
            C15562d.m25207w(i, this.f17230d);
            return this.f17228b.get(this.f17229c + i);
        }

        public final List subList(int i, int i2) {
            C15562d.m25209y(i, i2, this.f17230d);
            C7788a<E> aVar = this.f17228b;
            int i3 = this.f17229c;
            return new C7789a(aVar, i + i3, i3 + i2);
        }
    }
}
