package androidx.work;

import android.annotation.SuppressLint;

/* renamed from: androidx.work.n */
public interface C3429n {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a */
    public static final C3430a.C3433c f8035a = new C3430a.C3433c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b */
    public static final C3430a.C3432b f8036b = new C3430a.C3432b();

    /* renamed from: androidx.work.n$a */
    public static abstract class C3430a {

        /* renamed from: androidx.work.n$a$a */
        public static final class C3431a extends C3430a {

            /* renamed from: a */
            public final Throwable f8037a;

            public C3431a(Throwable th) {
                this.f8037a = th;
            }

            public final String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.f8037a.getMessage()});
            }
        }

        /* renamed from: androidx.work.n$a$b */
        public static final class C3432b extends C3430a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* renamed from: androidx.work.n$a$c */
        public static final class C3433c extends C3430a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
