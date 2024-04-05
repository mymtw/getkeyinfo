package androidx.compose.runtime;

import androidx.compose.runtime.internal.C1335b;
import androidx.compose.runtime.internal.C1336c;
import com.google.android.gms.internal.measurement.C14595c0;
import com.google.android.gms.internal.measurement.C14598c3;
import com.google.android.gms.internal.measurement.C14763p;
import com.google.android.play.core.internal.C15697i;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C19394m;
import p193o.C7494b;
import p517bn.C14132w;
import p605kk.C18116a;
import p605kk.C18123g;
import p689ul.C18603a;
import p689ul.C18606d;
import p689ul.C18614l;

/* renamed from: androidx.compose.runtime.j1 */
public final class C1339j1 implements C18603a, C14595c0, C18116a {

    /* renamed from: b */
    public Object f2932b;

    /* renamed from: c */
    public Object f2933c;

    public /* synthetic */ C1339j1(Object obj, Object obj2) {
        this.f2932b = obj;
        this.f2933c = obj2;
    }

    /* renamed from: a */
    public C14598c3 mo5884a(C14763p pVar) {
        ((C14598c3) this.f2932b).mo50403f((String) this.f2933c, pVar);
        return (C14598c3) this.f2932b;
    }

    /* renamed from: b */
    public void mo5885b(C18606d dVar) {
        C15697i iVar = (C15697i) this.f2932b;
        C18614l lVar = (C18614l) this.f2933c;
        synchronized (iVar.f35466f) {
            iVar.f35465e.remove(lVar);
        }
    }

    /* renamed from: c */
    public Object mo5886c() {
        C1335b bVar = (C1335b) ((AtomicReference) this.f2932b).get();
        int a = bVar.mo5882a(Thread.currentThread().getId());
        if (a >= 0) {
            return bVar.f2929c[a];
        }
        return null;
    }

    /* renamed from: d */
    public void mo5887d(Object obj) {
        boolean z;
        long id = Thread.currentThread().getId();
        synchronized (this.f2933c) {
            C1335b bVar = (C1335b) ((AtomicReference) this.f2932b).get();
            int a = bVar.mo5882a(id);
            if (a < 0) {
                z = false;
            } else {
                bVar.f2929c[a] = obj;
                z = true;
            }
            if (!z) {
                ((AtomicReference) this.f2932b).set(bVar.mo5883b(id, obj));
                C19394m mVar = C19394m.f43287a;
            }
        }
    }

    public Object then(C18123g gVar) {
        C14132w wVar = (C14132w) this.f2932b;
        String str = (String) this.f2933c;
        synchronized (wVar) {
            wVar.f31132b.remove(str);
        }
        return gVar;
    }

    public /* synthetic */ C1339j1(Object obj, Object obj2, int i) {
        this.f2933c = obj;
        this.f2932b = obj2;
    }

    public /* synthetic */ C1339j1(int i) {
        if (i != 1) {
            this.f2932b = new HashMap();
            this.f2933c = new HashMap();
            return;
        }
        this.f2932b = new AtomicReference();
        this.f2933c = new C7494b();
    }

    public /* synthetic */ C1339j1() {
        this.f2932b = new AtomicReference(C1336c.f2930a);
        this.f2933c = new Object();
    }
}
