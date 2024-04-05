package p594jh;

import android.util.Log;
import p594jh.C17900d;
import p611lh.C18167d;

/* renamed from: jh.c */
public final /* synthetic */ class C17897c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C17900d.C17901a f38868b;

    /* renamed from: c */
    public final /* synthetic */ int f38869c;

    public /* synthetic */ C17897c(C17900d.C17901a aVar, int i) {
        this.f38868b = aVar;
        this.f38869c = i;
    }

    public final void run() {
        C17900d.C17901a aVar = this.f38868b;
        int i = this.f38869c;
        C17900d dVar = C17900d.this;
        boolean z = true;
        if (i == -3 || i == -2) {
            if (i != -2) {
                C18167d dVar2 = dVar.f38880d;
                if (dVar2 == null || dVar2.f39739a != 1) {
                    z = false;
                }
                if (!z) {
                    dVar.mo69367d(3);
                    return;
                }
            }
            dVar.mo69365b(0);
            dVar.mo69367d(2);
        } else if (i == -1) {
            dVar.mo69365b(-1);
            dVar.mo69364a();
        } else if (i != 1) {
            dVar.getClass();
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown focus change type: ");
            sb.append(i);
            Log.w("AudioFocusManager", sb.toString());
        } else {
            dVar.mo69367d(1);
            dVar.mo69365b(1);
        }
    }
}
