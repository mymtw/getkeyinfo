package kotlin;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.io.Serializable;
import kotlin.jvm.internal.C19383o;

public final class Result<T> implements Serializable {
    public static final C19281a Companion = new C19281a();
    private final Object value;

    public static final class Failure implements Serializable {
        public final Throwable exception;

        public Failure(Throwable th) {
            C19383o.m32797g(th, "exception");
            this.exception = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Failure) && C19383o.m32792b(this.exception, ((Failure) obj).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return C0070b.m185h(C0072d.m201h("Failure("), this.exception, ')');
        }
    }

    /* renamed from: kotlin.Result$a */
    public static final class C19281a {
    }

    public /* synthetic */ Result(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Result m35479boximpl(Object obj) {
        return new Result(obj);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> Object m35480constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35481equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof Result) && C19383o.m32792b(obj, ((Result) obj2).m35488unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35482equalsimpl0(Object obj, Object obj2) {
        return C19383o.m32792b(obj, obj2);
    }

    /* renamed from: exceptionOrNull-impl  reason: not valid java name */
    public static final Throwable m35483exceptionOrNullimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35484hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isFailure-impl  reason: not valid java name */
    public static final boolean m35485isFailureimpl(Object obj) {
        return obj instanceof Failure;
    }

    /* renamed from: isSuccess-impl  reason: not valid java name */
    public static final boolean m35486isSuccessimpl(Object obj) {
        return !(obj instanceof Failure);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35487toStringimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m35481equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m35484hashCodeimpl(this.value);
    }

    public String toString() {
        return m35487toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Object m35488unboximpl() {
        return this.value;
    }
}
