package p021b1;

import androidx.compose.p015ui.text.input.C1993m;
import p280x0.C8292f;
import p289y0.C8356g;

/* renamed from: b1.b */
public final class C3452b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C1993m f8051b;

    /* renamed from: c */
    public final /* synthetic */ int f8052c;

    public C3452b(C1993m mVar, int i) {
        this.f8051b = mVar;
        this.f8052c = i;
    }

    public final void run() {
        C1993m mVar = this.f8051b;
        int i = this.f8052c;
        C8292f.C8295c cVar = ((C8356g.C8357a) mVar).f18329B;
        if (cVar != null) {
            cVar.mo3119c(i);
        }
    }
}
