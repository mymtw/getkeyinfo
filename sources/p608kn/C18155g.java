package p608kn;

import com.google.firebase.perf.p530v1.C16653b;
import com.google.firebase.perf.util.Timer;
import com.paypal.pyplcheckout.services.callbacks.UpdateOrderCallback;

/* renamed from: kn.g */
public final /* synthetic */ class C18155g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f39645b;

    /* renamed from: c */
    public final /* synthetic */ Object f39646c;

    /* renamed from: d */
    public final /* synthetic */ Object f39647d;

    public /* synthetic */ C18155g(int i, Object obj, Object obj2) {
        this.f39645b = i;
        this.f39646c = obj;
        this.f39647d = obj2;
    }

    public final void run() {
        switch (this.f39645b) {
            case 0:
                C18156h hVar = (C18156h) this.f39646c;
                C16653b b = hVar.mo69702b((Timer) this.f39647d);
                if (b != null) {
                    hVar.f39650b.add(b);
                    return;
                }
                return;
            default:
                UpdateOrderCallback.m35430onApiSuccess$lambda0((UpdateOrderCallback) this.f39646c, (String) this.f39647d);
                return;
        }
    }
}
