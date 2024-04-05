package androidx.profileinstaller;

import androidx.profileinstaller.C3063h;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p513bj.C14060k;

/* renamed from: androidx.profileinstaller.g */
public final /* synthetic */ class C3062g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f6976b;

    /* renamed from: c */
    public final /* synthetic */ int f6977c;

    /* renamed from: d */
    public final /* synthetic */ Object f6978d;

    /* renamed from: e */
    public final /* synthetic */ Object f6979e;

    public /* synthetic */ C3062g(int i, Object obj, Object obj2, int i2) {
        this.f6976b = i2;
        this.f6978d = obj;
        this.f6977c = i;
        this.f6979e = obj2;
    }

    public final void run() {
        switch (this.f6976b) {
            case 0:
                ((C3063h.C3066c) this.f6978d).mo11216a(this.f6977c, this.f6979e);
                return;
            default:
                int i = this.f6977c;
                C14060k.C14061a aVar = (C14060k.C14061a) this.f6979e;
                Iterator it = ((CopyOnWriteArraySet) this.f6978d).iterator();
                while (it.hasNext()) {
                    C14060k.C14063c cVar = (C14060k.C14063c) it.next();
                    if (!cVar.f30950d) {
                        if (i != -1) {
                            cVar.f30948b.mo46878a(i);
                        }
                        cVar.f30949c = true;
                        aVar.invoke(cVar.f30947a);
                    }
                }
                return;
        }
    }
}
