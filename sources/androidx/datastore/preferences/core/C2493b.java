package androidx.datastore.preferences.core;

import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.datastore.preferences.core.b */
public abstract class C2493b {

    /* renamed from: androidx.datastore.preferences.core.b$a */
    public static final class C2494a<T> {

        /* renamed from: a */
        public final String f5764a;

        public C2494a(String str) {
            this.f5764a = str;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C2494a) {
                return C19383o.m32792b(this.f5764a, ((C2494a) obj).f5764a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f5764a.hashCode();
        }

        public final String toString() {
            return this.f5764a;
        }
    }

    /* renamed from: androidx.datastore.preferences.core.b$b */
    public static final class C2495b<T> {
    }

    /* renamed from: a */
    public abstract Map<C2494a<?>, Object> mo9350a();

    /* renamed from: b */
    public abstract <T> T mo9351b(C2494a<T> aVar);
}
