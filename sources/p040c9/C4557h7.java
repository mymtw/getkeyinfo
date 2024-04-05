package p040c9;

import com.etsy.android.lib.push.handler.FirebasePushService;
import com.etsy.android.util.C12043f;
import com.etsy.android.util.C12053l;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p346fa.C12703a;
import p350fe.C12726c;
import p350fe.C12739m;
import p402n9.C13084d;
import p434ra.C13342i;
import p434ra.C13346l;

/* renamed from: c9.h7 */
public final class C4557h7 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10032b;

    public C4557h7(C4579j1 j1Var) {
        this.f10032b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        FirebasePushService firebasePushService = (FirebasePushService) obj;
        firebasePushService.pushRegistration = this.f10032b.mo14407p();
        firebasePushService.log = this.f10032b.f10212b0.get();
        firebasePushService.grafana = (C12703a) this.f10032b.f10308s0.get();
        firebasePushService.notificationRepo = this.f10032b.f10178U2.get();
        firebasePushService.notificationSettings = this.f10032b.f10279m1.get();
        firebasePushService.notificationBuilder = this.f10032b.f10270k4.get();
        C4579j1 j1Var = this.f10032b;
        C4479c cVar = j1Var.f10205a;
        C13342i iVar = new C13342i(j1Var.f10343z0.get());
        cVar.getClass();
        firebasePushService.notificationActionProvider = iVar;
        firebasePushService.styleInstanceProvider = new C13346l();
        C4579j1 j1Var2 = this.f10032b;
        C12043f fVar = j1Var2.f10107G1.get();
        C13084d h = j1Var2.mo14399h();
        C19383o.m32797g(fVar, "appsFlyerActions");
        firebasePushService.pushServiceCallbacks = new C12053l(fVar, h);
        firebasePushService.messageHandler = this.f10032b.mo14399h();
        firebasePushService.deepLinkEligibility = this.f10032b.f10341y3.get();
        firebasePushService.routeGenerator = new C12739m();
        firebasePushService.deepLinkErrorLogger = new C12726c();
    }
}
