package p040c9;

import com.etsy.android.lib.push.handler.BrazeReceiver;
import dagger.android.C17550a;
import p346fa.C12703a;

/* renamed from: c9.x4 */
public final class C4768x4 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10749b;

    public C4768x4(C4579j1 j1Var) {
        this.f10749b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        BrazeReceiver brazeReceiver = (BrazeReceiver) obj;
        brazeReceiver.logcat = this.f10749b.f10212b0.get();
        brazeReceiver.etsyConfigMap = this.f10749b.mo14404m();
        brazeReceiver.grafana = (C12703a) this.f10749b.f10308s0.get();
    }
}
