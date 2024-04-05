package p248tp;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.util.NotificationLite;

/* renamed from: tp.m */
public final class C8060m<T> {

    /* renamed from: b */
    public static final C8060m<Object> f17573b = new C8060m<>((Object) null);

    /* renamed from: a */
    public final Object f17574a;

    public C8060m(Object obj) {
        this.f17574a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8060m) {
            return C12965a.m20649a(this.f17574a, ((C8060m) obj).f17574a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f17574a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f17574a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (!NotificationLite.isError(obj)) {
            return C0071c.m192d(C0072d.m201h("OnNextNotification["), this.f17574a, "]");
        }
        StringBuilder h = C0072d.m201h("OnErrorNotification[");
        h.append(NotificationLite.getError(obj));
        h.append("]");
        return h.toString();
    }
}
