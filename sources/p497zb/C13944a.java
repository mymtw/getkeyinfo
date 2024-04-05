package p497zb;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;

/* renamed from: zb.a */
public final class C13944a {

    /* renamed from: a */
    public final List<C13945b> f30663a;

    public C13944a(List<C13945b> list) {
        C19383o.m32797g(list, ResponseConstants.ITEMS);
        this.f30663a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13944a) && C19383o.m32792b(this.f30663a, ((C13944a) obj).f30663a);
    }

    public final int hashCode() {
        return this.f30663a.hashCode();
    }

    public final String toString() {
        return C0070b.m186i(C0072d.m201h("SaveForLaterCart(items="), this.f30663a, ')');
    }

    public C13944a() {
        this(EmptyList.INSTANCE);
    }
}
