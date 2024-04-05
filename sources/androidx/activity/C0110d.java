package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.result.C0118a;
import androidx.activity.result.C0123f;
import p019b.C3443a;

/* renamed from: androidx.activity.d */
public final class C0110d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f157b;

    /* renamed from: c */
    public final /* synthetic */ C3443a.C3444a f158c;

    /* renamed from: d */
    public final /* synthetic */ ComponentActivity.C0094b f159d;

    public C0110d(ComponentActivity.C0094b bVar, int i, C3443a.C3444a aVar) {
        this.f159d = bVar;
        this.f157b = i;
        this.f158c = aVar;
    }

    public final void run() {
        C0118a<O> aVar;
        ComponentActivity.C0094b bVar = this.f159d;
        int i = this.f157b;
        T t = this.f158c.f8047a;
        String str = (String) bVar.f202b.get(Integer.valueOf(i));
        if (str != null) {
            bVar.f205e.remove(str);
            C0123f.C0124a aVar2 = (C0123f.C0124a) bVar.f206f.get(str);
            if (aVar2 == null || (aVar = aVar2.f209a) == null) {
                bVar.f208h.remove(str);
                bVar.f207g.put(str, t);
                return;
            }
            aVar.mo413a(t);
        }
    }
}
