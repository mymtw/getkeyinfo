package p040c9;

import com.etsy.android.lib.push.registration.FCMPushRegistration;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p425q9.C13265p;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: c9.o */
public final class C4646o implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f10449a;

    /* renamed from: b */
    public final C4479c f10450b;

    /* renamed from: c */
    public final C19011a f10451c;

    public /* synthetic */ C4646o(C4479c cVar, C17553b bVar, int i) {
        this.f10449a = i;
        this.f10450b = cVar;
        this.f10451c = bVar;
    }

    public final Object get() {
        switch (this.f10449a) {
            case 0:
                this.f10450b.getClass();
                Boolean valueOf = Boolean.valueOf(((C13265p) this.f10451c.get()).mo45960e());
                C17782b.m29841G(valueOf);
                return valueOf;
            default:
                C4479c cVar = this.f10450b;
                FCMPushRegistration fCMPushRegistration = (FCMPushRegistration) this.f10451c.get();
                cVar.getClass();
                C17782b.m29841G(fCMPushRegistration);
                return fCMPushRegistration;
        }
    }
}
