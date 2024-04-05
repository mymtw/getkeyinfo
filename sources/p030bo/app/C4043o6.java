package p030bo.app;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.o6 */
public final class C4043o6 {

    /* renamed from: a */
    private final List<C4275x2> f9026a;

    public C4043o6(List<? extends C4275x2> list) {
        C19383o.m32797g(list, "triggeredActions");
        this.f9026a = list;
    }

    /* renamed from: a */
    public final List<C4275x2> mo13822a() {
        return this.f9026a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4043o6) && C19383o.m32792b(this.f9026a, ((C4043o6) obj).f9026a);
    }

    public int hashCode() {
        return this.f9026a.hashCode();
    }

    public String toString() {
        return C0070b.m186i(C0072d.m201h("TriggeredActionsReceivedEvent(triggeredActions="), this.f9026a, ')');
    }
}
