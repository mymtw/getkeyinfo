package p354gc;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: gc.e */
public abstract class C12767e {

    /* renamed from: a */
    public final C12783l f28219a;

    /* renamed from: gc.e$a */
    public static final class C12768a extends C12767e {

        /* renamed from: b */
        public final C12783l f28220b;

        public C12768a(C12783l lVar) {
            super(lVar);
            this.f28220b = lVar;
        }

        /* renamed from: a */
        public final C12783l mo45523a() {
            return this.f28220b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12768a) && C19383o.m32792b(this.f28220b, ((C12768a) obj).f28220b);
        }

        public final int hashCode() {
            return this.f28220b.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("BottomGroupedMessageItem(message=");
            h.append(this.f28220b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: gc.e$b */
    public static final class C12769b extends C12767e {

        /* renamed from: b */
        public final C12783l f28221b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12769b(C12783l lVar) {
            super(lVar);
            C19383o.m32797g(lVar, "message");
            this.f28221b = lVar;
        }

        /* renamed from: a */
        public final C12783l mo45523a() {
            return this.f28221b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12769b) && C19383o.m32792b(this.f28221b, ((C12769b) obj).f28221b);
        }

        public final int hashCode() {
            return this.f28221b.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("IndividualMessageItem(message=");
            h.append(this.f28221b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: gc.e$c */
    public static final class C12770c extends C12767e {

        /* renamed from: b */
        public final C12783l f28222b;

        public C12770c(C12783l lVar) {
            super(lVar);
            this.f28222b = lVar;
        }

        /* renamed from: a */
        public final C12783l mo45523a() {
            return this.f28222b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12770c) && C19383o.m32792b(this.f28222b, ((C12770c) obj).f28222b);
        }

        public final int hashCode() {
            return this.f28222b.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("MiddleGroupedMessageItem(message=");
            h.append(this.f28222b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: gc.e$d */
    public static final class C12771d extends C12767e {

        /* renamed from: b */
        public final C12783l f28223b;

        public C12771d(C12783l lVar) {
            super(lVar);
            this.f28223b = lVar;
        }

        /* renamed from: a */
        public final C12783l mo45523a() {
            return this.f28223b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12771d) && C19383o.m32792b(this.f28223b, ((C12771d) obj).f28223b);
        }

        public final int hashCode() {
            return this.f28223b.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("TopGroupedMessageItem(message=");
            h.append(this.f28223b);
            h.append(')');
            return h.toString();
        }
    }

    public C12767e(C12783l lVar) {
        this.f28219a = lVar;
    }

    /* renamed from: a */
    public C12783l mo45523a() {
        return this.f28219a;
    }
}
