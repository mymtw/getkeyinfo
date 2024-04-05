package p030bo.app;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p005a4.C0034a;

/* renamed from: bo.app.m1 */
public final class C3960m1 {

    /* renamed from: a */
    private final List<C0034a> f8893a;

    public C3960m1(List<C0034a> list) {
        C19383o.m32797g(list, "geofencesList");
        this.f8893a = list;
    }

    /* renamed from: a */
    public final List<C0034a> mo13711a() {
        return this.f8893a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3960m1) && C19383o.m32792b(this.f8893a, ((C3960m1) obj).f8893a);
    }

    public int hashCode() {
        return this.f8893a.hashCode();
    }

    public String toString() {
        return C0070b.m186i(C0072d.m201h("GeofencesReceivedEvent(geofencesList="), this.f8893a, ')');
    }
}
