package androidx.compose.animation.core;

import androidx.compose.animation.core.C0450s;
import com.google.logging.type.LogSeverity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p753kq.C19857l;

/* renamed from: androidx.compose.animation.core.b0 */
public final class C0414b0<T> implements C0446q<T> {

    /* renamed from: a */
    public final C0416b<T> f1086a;

    /* renamed from: androidx.compose.animation.core.b0$a */
    public static final class C0415a<T> {

        /* renamed from: a */
        public final T f1087a;

        /* renamed from: b */
        public C0448r f1088b;

        public C0415a() {
            throw null;
        }

        public C0415a(Float f) {
            C0450s.C0451a aVar = C0450s.C0451a.f1169a;
            this.f1087a = f;
            this.f1088b = aVar;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C0415a) {
                C0415a aVar = (C0415a) obj;
                return C19383o.m32792b(aVar.f1087a, this.f1087a) && C19383o.m32792b(aVar.f1088b, this.f1088b);
            }
        }

        public final int hashCode() {
            T t = this.f1087a;
            return this.f1088b.hashCode() + ((t != null ? t.hashCode() : 0) * 31);
        }
    }

    /* renamed from: androidx.compose.animation.core.b0$b */
    public static final class C0416b<T> {

        /* renamed from: a */
        public int f1089a = LogSeverity.NOTICE_VALUE;

        /* renamed from: b */
        public final LinkedHashMap f1090b = new LinkedHashMap();

        /* renamed from: a */
        public final C0415a mo3476a(int i, Float f) {
            C0415a aVar = new C0415a(f);
            this.f1090b.put(Integer.valueOf(i), aVar);
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C0416b) {
                C0416b bVar = (C0416b) obj;
                bVar.getClass();
                return this.f1089a == bVar.f1089a && C19383o.m32792b(this.f1090b, bVar.f1090b);
            }
        }

        public final int hashCode() {
            return this.f1090b.hashCode() + (((this.f1089a * 31) + 0) * 31);
        }
    }

    public C0414b0(C0416b<T> bVar) {
        this.f1086a = bVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0414b0) && C19383o.m32792b(this.f1086a, ((C0414b0) obj).f1086a);
    }

    /* renamed from: f */
    public final <V extends C0432j> C0459v0<V> m1119a(C0435k0<T, V> k0Var) {
        C19383o.m32797g(k0Var, "converter");
        LinkedHashMap linkedHashMap = this.f1086a.f1090b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C19421p.m32930T(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            C0415a aVar = (C0415a) entry.getValue();
            C19857l<T, V> a = k0Var.mo3509a();
            aVar.getClass();
            C19383o.m32797g(a, "convertToVector");
            linkedHashMap2.put(key, new Pair(a.invoke(aVar.f1087a), aVar.f1088b));
        }
        return new C0459v0<>(linkedHashMap2, this.f1086a.f1089a);
    }

    public final int hashCode() {
        return this.f1086a.hashCode();
    }
}
