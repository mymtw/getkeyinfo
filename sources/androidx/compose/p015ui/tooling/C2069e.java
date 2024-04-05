package androidx.compose.p015ui.tooling;

import android.support.p013v4.media.C0069a;
import androidx.compose.p015ui.tooling.data.C2067j;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19324q;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p174m0.C7289h;

/* renamed from: androidx.compose.ui.tooling.e */
public final class C2069e {

    /* renamed from: a */
    public final String f4690a;

    /* renamed from: b */
    public final int f4691b;

    /* renamed from: c */
    public final C7289h f4692c;

    /* renamed from: d */
    public final C2067j f4693d;

    /* renamed from: e */
    public final List<C2069e> f4694e;

    public C2069e(String str, int i, C7289h hVar, C2067j jVar, ArrayList arrayList) {
        C19383o.m32797g(hVar, "bounds");
        this.f4690a = str;
        this.f4691b = i;
        this.f4692c = hVar;
        this.f4693d = jVar;
        this.f4694e = arrayList;
    }

    /* renamed from: a */
    public final ArrayList mo7844a() {
        List<C2069e> list = this.f4694e;
        ArrayList arrayList = new ArrayList();
        for (C2069e a : list) {
            C19324q.m32628J0(a.mo7844a(), arrayList);
        }
        return C19327t.m32650f1(arrayList, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2069e)) {
            return false;
        }
        C2069e eVar = (C2069e) obj;
        return C19383o.m32792b(this.f4690a, eVar.f4690a) && this.f4691b == eVar.f4691b && C19383o.m32792b(this.f4692c, eVar.f4692c) && C19383o.m32792b(this.f4693d, eVar.f4693d) && C19383o.m32792b(this.f4694e, eVar.f4694e);
    }

    public final int hashCode() {
        int hashCode = (this.f4692c.hashCode() + C0069a.m170a(this.f4691b, this.f4690a.hashCode() * 31, 31)) * 31;
        C2067j jVar = this.f4693d;
        return this.f4694e.hashCode() + ((hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004d, code lost:
        if (r0 == null) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r4 = this;
            r0 = 40
            java.lang.StringBuilder r1 = androidx.appcompat.widget.C0326j.m866k(r0)
            java.lang.String r2 = r4.f4690a
            r1.append(r2)
            r2 = 58
            r1.append(r2)
            int r2 = r4.f4691b
            r1.append(r2)
            java.lang.String r2 = ",\n            |bounds=(top="
            r1.append(r2)
            m0.h r2 = r4.f4692c
            int r2 = r2.f16168b
            r1.append(r2)
            java.lang.String r2 = ", left="
            r1.append(r2)
            m0.h r2 = r4.f4692c
            int r2 = r2.f16167a
            r1.append(r2)
            java.lang.String r2 = ",\n            |location="
            r1.append(r2)
            androidx.compose.ui.tooling.data.j r2 = r4.f4693d
            if (r2 == 0) goto L_0x004f
            java.lang.StringBuilder r0 = androidx.appcompat.widget.C0326j.m866k(r0)
            int r3 = r2.f4683b
            r0.append(r3)
            r3 = 76
            r0.append(r3)
            int r2 = r2.f4684c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0051
        L_0x004f:
            java.lang.String r0 = "<none>"
        L_0x0051:
            r1.append(r0)
            java.lang.String r0 = "\n            |bottom="
            r1.append(r0)
            m0.h r0 = r4.f4692c
            int r0 = r0.f16170d
            r1.append(r0)
            java.lang.String r0 = ", right="
            r1.append(r0)
            m0.h r0 = r4.f4692c
            int r0 = r0.f16169c
            r1.append(r0)
            java.lang.String r0 = "),\n            |childrenCount="
            r1.append(r0)
            java.util.List<androidx.compose.ui.tooling.e> r0 = r4.f4694e
            int r0 = r0.size()
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = kotlin.text.C19453g.m33014R0(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.tooling.C2069e.toString():java.lang.String");
    }
}
