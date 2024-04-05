package p354gc;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: gc.d */
public final class C12766d {

    /* renamed from: a */
    public final C12763b f28216a;

    /* renamed from: b */
    public final List<C12783l> f28217b;

    /* renamed from: c */
    public final boolean f28218c;

    public C12766d(C12763b bVar, List<C12783l> list) {
        this.f28216a = bVar;
        this.f28217b = list;
        this.f28218c = bVar.f28212f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12766d)) {
            return false;
        }
        C12766d dVar = (C12766d) obj;
        return C19383o.m32792b(this.f28216a, dVar.f28216a) && C19383o.m32792b(this.f28217b, dVar.f28217b);
    }

    public final int hashCode() {
        return this.f28217b.hashCode() + (this.f28216a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ConversationUiModel(metadata=");
        h.append(this.f28216a);
        h.append(", messages=");
        return C0070b.m186i(h, this.f28217b, ')');
    }
}
