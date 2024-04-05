package p186n2;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.view.View;
import androidx.appcompat.widget.C0326j;
import java.util.ArrayList;
import java.util.HashMap;
import p504ai.C13983i;

/* renamed from: n2.t */
public final class C7433t {

    /* renamed from: a */
    public final HashMap f16606a = new HashMap();

    /* renamed from: b */
    public View f16607b;

    /* renamed from: c */
    public final ArrayList<C7418m> f16608c = new ArrayList<>();

    @Deprecated
    public C7433t() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7433t)) {
            return false;
        }
        C7433t tVar = (C7433t) obj;
        return this.f16607b == tVar.f16607b && this.f16606a.equals(tVar.f16606a);
    }

    public final int hashCode() {
        return this.f16606a.hashCode() + (this.f16607b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TransitionValues@");
        h.append(Integer.toHexString(hashCode()));
        h.append(":\n");
        StringBuilder k = C0073e.m211k(h.toString(), "    view = ");
        k.append(this.f16607b);
        k.append("\n");
        String i = C0326j.m864i(k.toString(), "    values:");
        for (String str : this.f16606a.keySet()) {
            StringBuilder n = C13983i.m21495n(i, "    ", str, ": ");
            n.append(this.f16606a.get(str));
            n.append("\n");
            i = n.toString();
        }
        return i;
    }

    public C7433t(View view) {
        this.f16607b = view;
    }
}
