package androidx.core.view;

import androidx.appcompat.widget.C0342q0;
import androidx.lifecycle.C2885q;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.core.view.j */
public final class C2310j {

    /* renamed from: a */
    public final Runnable f5568a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<C2313k> f5569b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final HashMap f5570c = new HashMap();

    /* renamed from: androidx.core.view.j$a */
    public static class C2311a {

        /* renamed from: a */
        public final Lifecycle f5571a;

        /* renamed from: b */
        public C2885q f5572b;

        public C2311a(Lifecycle lifecycle, C2885q qVar) {
            this.f5571a = lifecycle;
            this.f5572b = qVar;
            lifecycle.mo10733a(qVar);
        }
    }

    public C2310j(C0342q0 q0Var) {
        this.f5568a = q0Var;
    }

    /* renamed from: a */
    public final void mo8898a(C2313k kVar) {
        this.f5569b.remove(kVar);
        C2311a aVar = (C2311a) this.f5570c.remove(kVar);
        if (aVar != null) {
            aVar.f5571a.mo10735c(aVar.f5572b);
            aVar.f5572b = null;
        }
        this.f5568a.run();
    }
}
