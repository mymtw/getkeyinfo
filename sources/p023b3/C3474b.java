package p023b3;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C3409a;
import p034c3.C4391o;
import p034c3.C4394q;

/* renamed from: b3.b */
public final class C3474b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ WorkDatabase f8094b;

    /* renamed from: c */
    public final /* synthetic */ String f8095c;

    /* renamed from: d */
    public final /* synthetic */ C3409a f8096d;

    public C3474b(C3409a aVar, WorkDatabase workDatabase, String str) {
        this.f8096d = aVar;
        this.f8094b = workDatabase;
        this.f8095c = str;
    }

    public final void run() {
        C4391o i = ((C4394q) this.f8094b.mo12857t()).mo14333i(this.f8095c);
        if (i != null && i.mo14318b()) {
            synchronized (this.f8096d.f7976e) {
                this.f8096d.f7979h.put(this.f8095c, i);
                this.f8096d.f7980i.add(i);
                C3409a aVar = this.f8096d;
                aVar.f7981j.mo20960b(aVar.f7980i);
            }
        }
    }
}
