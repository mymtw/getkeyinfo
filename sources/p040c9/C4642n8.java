package p040c9;

import com.etsy.android.device.LocaleReceiver;
import dagger.android.C17550a;
import p486y9.C13885a;

/* renamed from: c9.n8 */
public final class C4642n8 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10444b;

    public C4642n8(C4579j1 j1Var) {
        this.f10444b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        LocaleReceiver localeReceiver = (LocaleReceiver) obj;
        localeReceiver.localeSubject = this.f10444b.f10313t0.get();
        this.f10444b.f10327w.getClass();
        localeReceiver.systemProvider = new C13885a();
    }
}
