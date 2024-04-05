package p021b1;

import android.graphics.Typeface;
import androidx.compose.p015ui.text.input.C1993m;
import p280x0.C8292f;
import p289y0.C8356g;

/* renamed from: b1.a */
public final class C3451a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C1993m f8049b;

    /* renamed from: c */
    public final /* synthetic */ Typeface f8050c;

    public C3451a(C1993m mVar, Typeface typeface) {
        this.f8049b = mVar;
        this.f8050c = typeface;
    }

    public final void run() {
        C1993m mVar = this.f8049b;
        Typeface typeface = this.f8050c;
        C8292f.C8295c cVar = ((C8356g.C8357a) mVar).f18329B;
        if (cVar != null) {
            cVar.mo3120d(typeface);
        }
    }
}
