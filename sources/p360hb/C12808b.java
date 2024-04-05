package p360hb;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p347fb.C12709e;
import p360hb.C12804a;

/* renamed from: hb.b */
public final class C12808b {

    /* renamed from: a */
    public final C12804a f28293a;

    /* renamed from: b */
    public final List<C12709e> f28294b;

    public C12808b() {
        this(0);
    }

    public C12808b(C12804a aVar, List<? extends C12709e> list) {
        C19383o.m32797g(aVar, "quizUi");
        C19383o.m32797g(list, "sideEffects");
        this.f28293a = aVar;
        this.f28294b = list;
    }

    /* renamed from: a */
    public static C12808b m20447a(C12808b bVar, C12804a aVar, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            aVar = bVar.f28293a;
        }
        List list = arrayList;
        if ((i & 2) != 0) {
            list = bVar.f28294b;
        }
        C19383o.m32797g(aVar, "quizUi");
        C19383o.m32797g(list, "sideEffects");
        return new C12808b(aVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12808b)) {
            return false;
        }
        C12808b bVar = (C12808b) obj;
        return C19383o.m32792b(this.f28293a, bVar.f28293a) && C19383o.m32792b(this.f28294b, bVar.f28294b);
    }

    public final int hashCode() {
        return this.f28294b.hashCode() + (this.f28293a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CategoryQuizViewState(quizUi=");
        h.append(this.f28293a);
        h.append(", sideEffects=");
        return C0070b.m186i(h, this.f28294b, ')');
    }

    public C12808b(int i) {
        this(C12804a.C12806b.f28291a, EmptyList.INSTANCE);
    }
}
