package p030bo.app;

import java.util.List;

/* renamed from: bo.app.c */
public final class C3595c extends C3855k3 {
    public C3595c(List<C3548a2> list) {
        super(list);
    }

    /* renamed from: a */
    public boolean mo13074a(C4173s2 s2Var) {
        boolean z = false;
        for (C3548a2 a : this.f8736b) {
            if (!a.mo13074a(s2Var)) {
                return false;
            }
            z = true;
        }
        return z;
    }
}
