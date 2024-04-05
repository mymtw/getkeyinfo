package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p077d1.C6621e;
import p193o.C7498f;
import p193o.C7506i;

/* renamed from: androidx.recyclerview.widget.i0 */
public final class C3160i0 {

    /* renamed from: a */
    public final C7506i<RecyclerView.C3084b0, C3161a> f7279a = new C7506i<>();

    /* renamed from: b */
    public final C7498f<RecyclerView.C3084b0> f7280b = new C7498f<>();

    /* renamed from: androidx.recyclerview.widget.i0$a */
    public static class C3161a {

        /* renamed from: d */
        public static C6621e f7281d = new C6621e(20);

        /* renamed from: a */
        public int f7282a;

        /* renamed from: b */
        public RecyclerView.C3094l.C3097c f7283b;

        /* renamed from: c */
        public RecyclerView.C3094l.C3097c f7284c;

        /* renamed from: a */
        public static C3161a m7759a() {
            C3161a aVar = (C3161a) f7281d.mo18807b();
            return aVar == null ? new C3161a() : aVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i0$b */
    public interface C3162b {
    }

    /* renamed from: a */
    public final void mo11883a(RecyclerView.C3084b0 b0Var, RecyclerView.C3094l.C3097c cVar) {
        C3161a orDefault = this.f7279a.getOrDefault(b0Var, null);
        if (orDefault == null) {
            orDefault = C3161a.m7759a();
            this.f7279a.put(b0Var, orDefault);
        }
        orDefault.f7284c = cVar;
        orDefault.f7282a |= 8;
    }

    /* renamed from: b */
    public final void mo11884b(RecyclerView.C3084b0 b0Var, RecyclerView.C3094l.C3097c cVar) {
        C3161a orDefault = this.f7279a.getOrDefault(b0Var, null);
        if (orDefault == null) {
            orDefault = C3161a.m7759a();
            this.f7279a.put(b0Var, orDefault);
        }
        orDefault.f7283b = cVar;
        orDefault.f7282a |= 4;
    }

    /* renamed from: c */
    public final RecyclerView.C3094l.C3097c mo11885c(RecyclerView.C3084b0 b0Var, int i) {
        C3161a n;
        RecyclerView.C3094l.C3097c cVar;
        int e = this.f7279a.mo19972e(b0Var);
        if (e >= 0 && (n = this.f7279a.mo19980n(e)) != null) {
            int i2 = n.f7282a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                n.f7282a = i3;
                if (i == 4) {
                    cVar = n.f7283b;
                } else if (i == 8) {
                    cVar = n.f7284c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f7279a.mo14353j(e);
                    n.f7282a = 0;
                    n.f7283b = null;
                    n.f7284c = null;
                    C3161a.f7281d.mo18806a(n);
                }
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void mo11886d(RecyclerView.C3084b0 b0Var) {
        C3161a orDefault = this.f7279a.getOrDefault(b0Var, null);
        if (orDefault != null) {
            orDefault.f7282a &= -2;
        }
    }

    /* renamed from: e */
    public final void mo11887e(RecyclerView.C3084b0 b0Var) {
        int i = this.f7280b.mo19891i() - 1;
        while (true) {
            if (i < 0) {
                break;
            } else if (b0Var == this.f7280b.mo19892j(i)) {
                C7498f<RecyclerView.C3084b0> fVar = this.f7280b;
                Object[] objArr = fVar.f16722d;
                Object obj = objArr[i];
                Object obj2 = C7498f.f16719f;
                if (obj != obj2) {
                    objArr[i] = obj2;
                    fVar.f16720b = true;
                }
            } else {
                i--;
            }
        }
        C3161a remove = this.f7279a.remove(b0Var);
        if (remove != null) {
            remove.f7282a = 0;
            remove.f7283b = null;
            remove.f7284c = null;
            C3161a.f7281d.mo18806a(remove);
        }
    }
}
