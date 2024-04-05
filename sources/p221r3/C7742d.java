package p221r3;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p242t3.C7956f;

/* renamed from: r3.d */
public final class C7742d {

    /* renamed from: a */
    public final List<C7956f> f17167a = new ArrayList();

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C7742d) && C19383o.m32792b(this.f17167a, ((C7742d) obj).f17167a);
        }
        return true;
    }

    public final int hashCode() {
        List<C7956f> list = this.f17167a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return C0326j.m865j(C0072d.m201h("Styles(list="), this.f17167a, ")");
    }
}
