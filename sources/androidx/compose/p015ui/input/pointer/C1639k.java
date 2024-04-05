package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.layout.C1689j;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p219r.C7734e;

/* renamed from: androidx.compose.ui.input.pointer.k */
public class C1639k {

    /* renamed from: a */
    public final C7734e<C1638j> f3650a = new C7734e<>(new C1638j[16]);

    /* renamed from: a */
    public boolean mo6602a(Map<C1643o, C1644p> map, C1689j jVar, C1635g gVar, boolean z) {
        C19383o.m32797g(map, "changes");
        C19383o.m32797g(jVar, "parentCoordinates");
        C7734e<C1638j> eVar = this.f3650a;
        int i = eVar.f17157d;
        if (i <= 0) {
            return false;
        }
        T[] tArr = eVar.f17155b;
        int i2 = 0;
        boolean z2 = false;
        do {
            z2 = ((C1638j) tArr[i2]).mo6602a(map, jVar, gVar, z) || z2;
            i2++;
        } while (i2 < i);
        return z2;
    }

    /* renamed from: b */
    public void mo6603b(C1635g gVar) {
        for (int i = this.f3650a.f17157d - 1; -1 < i; i--) {
            if (((C1638j) this.f3650a.f17155b[i]).f3643c.mo20239m()) {
                this.f3650a.mo20243q(i);
            }
        }
    }

    /* renamed from: c */
    public void mo6604c() {
        C7734e<C1638j> eVar = this.f3650a;
        int i = eVar.f17157d;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = eVar.f17155b;
            do {
                ((C1638j) tArr[i2]).mo6604c();
                i2++;
            } while (i2 < i);
        }
    }

    /* renamed from: d */
    public boolean mo6605d(C1635g gVar) {
        C7734e<C1638j> eVar = this.f3650a;
        int i = eVar.f17157d;
        boolean z = false;
        if (i > 0) {
            T[] tArr = eVar.f17155b;
            int i2 = 0;
            boolean z2 = false;
            do {
                z2 = ((C1638j) tArr[i2]).mo6605d(gVar) || z2;
                i2++;
            } while (i2 < i);
            z = z2;
        }
        mo6603b(gVar);
        return z;
    }

    /* renamed from: e */
    public boolean mo6606e(Map<C1643o, C1644p> map, C1689j jVar, C1635g gVar, boolean z) {
        C19383o.m32797g(map, "changes");
        C19383o.m32797g(jVar, "parentCoordinates");
        C7734e<C1638j> eVar = this.f3650a;
        int i = eVar.f17157d;
        if (i <= 0) {
            return false;
        }
        T[] tArr = eVar.f17155b;
        int i2 = 0;
        boolean z2 = false;
        do {
            z2 = ((C1638j) tArr[i2]).mo6606e(map, jVar, gVar, z) || z2;
            i2++;
        } while (i2 < i);
        return z2;
    }

    /* renamed from: f */
    public final void mo6608f() {
        int i = 0;
        while (true) {
            C7734e<C1638j> eVar = this.f3650a;
            if (i < eVar.f17157d) {
                C1638j jVar = (C1638j) eVar.f17155b[i];
                if (!jVar.f3642b.f3688c) {
                    eVar.mo20243q(i);
                    jVar.mo6604c();
                } else {
                    i++;
                    jVar.mo6608f();
                }
            } else {
                return;
            }
        }
    }
}
