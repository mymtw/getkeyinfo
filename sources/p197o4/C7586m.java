package p197o4;

import java.util.ArrayDeque;
import p036c5.C4426l;

/* renamed from: o4.m */
public final class C7586m<A, B> {

    /* renamed from: a */
    public final C7585l f16848a = new C7585l();

    /* renamed from: o4.m$a */
    public static final class C7587a<A> {

        /* renamed from: d */
        public static final ArrayDeque f16849d = new ArrayDeque(0);

        /* renamed from: a */
        public int f16850a;

        /* renamed from: b */
        public int f16851b;

        /* renamed from: c */
        public A f16852c;

        static {
            char[] cArr = C4426l.f9710a;
        }

        /* renamed from: a */
        public static C7587a m14595a(Object obj) {
            C7587a aVar;
            ArrayDeque arrayDeque = f16849d;
            synchronized (arrayDeque) {
                aVar = (C7587a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new C7587a();
            }
            aVar.f16852c = obj;
            aVar.f16851b = 0;
            aVar.f16850a = 0;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C7587a)) {
                return false;
            }
            C7587a aVar = (C7587a) obj;
            return this.f16851b == aVar.f16851b && this.f16850a == aVar.f16850a && this.f16852c.equals(aVar.f16852c);
        }

        public final int hashCode() {
            return this.f16852c.hashCode() + (((this.f16850a * 31) + this.f16851b) * 31);
        }
    }
}
