package p312ag;

import androidx.compose.animation.C0391c;

/* renamed from: ag.j */
public final class C8535j {

    /* renamed from: a */
    public final String f18592a;

    /* renamed from: b */
    public final boolean f18593b;

    public C8535j(String str, boolean z) {
        this.f18592a = str;
        this.f18593b = z;
    }

    public final String toString() {
        String str = this.f18593b ? "Applink" : "Unclassified";
        if (this.f18592a == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        return C0391c.m1057c(sb, this.f18592a, ')');
    }
}
