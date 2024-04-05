package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;

/* renamed from: androidx.lifecycle.h0 */
public final class C2863h0 {

    /* renamed from: a */
    public final C2888t f6500a;

    /* renamed from: b */
    public final Handler f6501b = new Handler();

    /* renamed from: c */
    public C2864a f6502c;

    /* renamed from: androidx.lifecycle.h0$a */
    public static class C2864a implements Runnable {

        /* renamed from: b */
        public final C2888t f6503b;

        /* renamed from: c */
        public final Lifecycle.Event f6504c;

        /* renamed from: d */
        public boolean f6505d = false;

        public C2864a(C2888t tVar, Lifecycle.Event event) {
            this.f6503b = tVar;
            this.f6504c = event;
        }

        public final void run() {
            if (!this.f6505d) {
                this.f6503b.mo10837f(this.f6504c);
                this.f6505d = true;
            }
        }
    }

    public C2863h0(C2887s sVar) {
        this.f6500a = new C2888t(sVar, true);
    }

    /* renamed from: a */
    public final void mo10819a(Lifecycle.Event event) {
        C2864a aVar = this.f6502c;
        if (aVar != null) {
            aVar.run();
        }
        C2864a aVar2 = new C2864a(this.f6500a, event);
        this.f6502c = aVar2;
        this.f6501b.postAtFrontOfQueue(aVar2);
    }
}
