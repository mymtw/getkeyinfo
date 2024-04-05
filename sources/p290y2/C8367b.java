package p290y2;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: y2.b */
public final class C8367b {

    /* renamed from: a */
    public boolean f18342a;

    /* renamed from: b */
    public boolean f18343b;

    /* renamed from: c */
    public boolean f18344c;

    /* renamed from: d */
    public boolean f18345d;

    public C8367b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f18342a = z;
        this.f18343b = z2;
        this.f18344c = z3;
        this.f18345d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8367b)) {
            return false;
        }
        C8367b bVar = (C8367b) obj;
        return this.f18342a == bVar.f18342a && this.f18343b == bVar.f18343b && this.f18344c == bVar.f18344c && this.f18345d == bVar.f18345d;
    }

    public final int hashCode() {
        int i = this.f18342a;
        if (this.f18343b) {
            i += 16;
        }
        if (this.f18344c) {
            i += 256;
        }
        return this.f18345d ? i + RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT : i;
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f18342a), Boolean.valueOf(this.f18343b), Boolean.valueOf(this.f18344c), Boolean.valueOf(this.f18345d)});
    }
}
