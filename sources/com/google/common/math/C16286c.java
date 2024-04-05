package com.google.common.math;

/* renamed from: com.google.common.math.c */
public abstract class C16286c {

    /* renamed from: com.google.common.math.c$a */
    public static final class C16287a extends C16286c {

        /* renamed from: a */
        public static final C16287a f36382a = new C16287a();

        public final String toString() {
            return "NaN";
        }
    }

    /* renamed from: com.google.common.math.c$b */
    public static final class C16288b extends C16286c {

        /* renamed from: a */
        public final double f36383a;

        /* renamed from: b */
        public final double f36384b;

        public C16288b(double d, double d2) {
            this.f36383a = d;
            this.f36384b = d2;
        }

        public final String toString() {
            return String.format("y = %g * x + %g", new Object[]{Double.valueOf(this.f36383a), Double.valueOf(this.f36384b)});
        }
    }

    /* renamed from: com.google.common.math.c$c */
    public static final class C16289c extends C16286c {

        /* renamed from: a */
        public final double f36385a;

        public C16289c(double d) {
            this.f36385a = d;
        }

        public final String toString() {
            return String.format("x = %g", new Object[]{Double.valueOf(this.f36385a)});
        }
    }
}
