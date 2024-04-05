package androidx.navigation;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import androidx.navigation.C2990p;
import p010a9.C0048b;

@C2990p.C2991a("navigation")
/* renamed from: androidx.navigation.j */
public final class C2968j extends C2990p<C2966i> {

    /* renamed from: a */
    public final C2992q f6745a;

    public C2968j(C2992q qVar) {
        this.f6745a = qVar;
    }

    /* renamed from: a */
    public final C2964h mo10951a() {
        return new C2966i(this);
    }

    /* renamed from: b */
    public final C2964h mo10952b(C2964h hVar, Bundle bundle, C2971m mVar) {
        String str;
        C2966i iVar = (C2966i) hVar;
        int i = iVar.f6740k;
        if (i == 0) {
            StringBuilder h = C0072d.m201h("no start destination defined via app:startDestination for ");
            int i2 = iVar.f6728d;
            if (i2 != 0) {
                if (iVar.f6729e == null) {
                    iVar.f6729e = Integer.toString(i2);
                }
                str = iVar.f6729e;
            } else {
                str = "the root navigation";
            }
            h.append(str);
            throw new IllegalStateException(h.toString());
        }
        C2964h m = iVar.mo10973m(i, false);
        if (m != null) {
            return this.f6745a.mo10998c(m.f6726b).mo10952b(m, m.mo10967a(bundle), mVar);
        }
        if (iVar.f6741l == null) {
            iVar.f6741l = Integer.toString(iVar.f6740k);
        }
        throw new IllegalArgumentException(C0048b.m163a("navigation destination ", iVar.f6741l, " is not a direct child of this NavGraph"));
    }

    /* renamed from: e */
    public final boolean mo10953e() {
        return true;
    }
}
