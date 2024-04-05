package kotlinx.coroutines.channels;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: kotlinx.coroutines.channels.g */
public final class C19503g<T> {

    /* renamed from: b */
    public static final C19505b f43449b = new C19505b();

    /* renamed from: a */
    public final Object f43450a;

    /* renamed from: kotlinx.coroutines.channels.g$a */
    public static final class C19504a extends C19505b {

        /* renamed from: a */
        public final Throwable f43451a;

        public C19504a(Throwable th) {
            this.f43451a = th;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof C19504a) && C19383o.m32792b(this.f43451a, ((C19504a) obj).f43451a);
        }

        public final int hashCode() {
            Throwable th = this.f43451a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final String toString() {
            return C0070b.m185h(C0072d.m201h("Closed("), this.f43451a, ')');
        }
    }

    /* renamed from: kotlinx.coroutines.channels.g$b */
    public static class C19505b {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ C19503g(Object obj) {
        this.f43450a = obj;
    }

    /* renamed from: a */
    public static final Throwable m33187a(Object obj) {
        C19504a aVar = obj instanceof C19504a ? (C19504a) obj : null;
        if (aVar == null) {
            return null;
        }
        return aVar.f43451a;
    }

    /* renamed from: b */
    public static final T m33188b(Object obj) {
        if (!(obj instanceof C19505b)) {
            return obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C19503g) && C19383o.m32792b(this.f43450a, ((C19503g) obj).f43450a);
    }

    public final int hashCode() {
        Object obj = this.f43450a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f43450a;
        if (obj instanceof C19504a) {
            return ((C19504a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
