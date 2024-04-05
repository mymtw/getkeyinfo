package p021b1;

import android.os.Handler;
import androidx.compose.p015ui.text.input.C1993m;
import p021b1.C3461j;
import p289y0.C8356g;

/* renamed from: b1.c */
public final class C3453c {

    /* renamed from: a */
    public final C1993m f8053a;

    /* renamed from: b */
    public final Handler f8054b;

    public C3453c(C8356g.C8357a aVar, Handler handler) {
        this.f8053a = aVar;
        this.f8054b = handler;
    }

    /* renamed from: a */
    public final void mo12973a(C3461j.C3462a aVar) {
        int i = aVar.f8076b;
        if (i == 0) {
            this.f8054b.post(new C3451a(this.f8053a, aVar.f8075a));
            return;
        }
        this.f8054b.post(new C3452b(this.f8053a, i));
    }
}
