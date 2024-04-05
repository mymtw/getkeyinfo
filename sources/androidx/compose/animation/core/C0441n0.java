package androidx.compose.animation.core;

import java.util.ArrayList;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19388s;
import p764pq.C20056h;
import p764pq.C20057i;

/* renamed from: androidx.compose.animation.core.n0 */
public final class C0441n0 implements C0434k {

    /* renamed from: a */
    public final ArrayList f1164a;

    public C0441n0(float f, float f2, C0432j jVar) {
        C20057i D0 = C19388s.m32816D0(0, jVar.mo3489b());
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(D0));
        C20056h l = D0.iterator();
        while (l.f44419d) {
            arrayList.add(new C0460w(f, f2, jVar.mo3488a(l.nextInt())));
        }
        this.f1164a = arrayList;
    }

    public final C0456u get(int i) {
        return (C0460w) this.f1164a.get(i);
    }
}
