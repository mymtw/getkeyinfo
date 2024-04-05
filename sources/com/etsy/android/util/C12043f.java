package com.etsy.android.util;

import android.app.Application;
import com.appsflyer.AppsFlyerLib;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.push.settings.C8848c;
import com.etsy.android.shophome.C8998i;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.operators.completable.CompletableCreate;
import p145io.reactivex.internal.operators.completable.CompletableObserveOn;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p145io.reactivex.internal.operators.observable.C19179q;
import p145io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import p145io.reactivex.internal.operators.observable.ObservableFlatMapSingle;
import p248tp.C8048a;
import p248tp.C8061n;
import p248tp.C8066r;
import p277w8.C8264b;
import p277w8.C8265c;
import p277w8.C8266d;
import p306z8.C8480g;
import p346fa.C12703a;
import p402n9.C13096p;
import p409o9.C13138q;
import p425q9.C13250b;
import p425q9.C13265p;
import p426qa.C13276b;
import p456ua.C13461f;
import p504ai.C13983i;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.util.f */
public final class C12043f implements C13276b, C12049i, C12050j {

    /* renamed from: a */
    public final C8694h f26843a;

    /* renamed from: b */
    public final C12703a f26844b;

    /* renamed from: c */
    public final Application f26845c;

    /* renamed from: d */
    public final C8618c f26846d;

    /* renamed from: e */
    public final C8061n<Boolean> f26847e;

    /* renamed from: f */
    public final C12066w f26848f;

    /* renamed from: g */
    public final C13461f f26849g;

    /* renamed from: h */
    public final C13265p f26850h;

    /* renamed from: i */
    public final C13138q f26851i;

    /* renamed from: j */
    public final AtomicBoolean f26852j = new AtomicBoolean(false);

    /* renamed from: k */
    public final AtomicBoolean f26853k = new AtomicBoolean(false);

    /* renamed from: l */
    public final AtomicBoolean f26854l = new AtomicBoolean(false);

    public C12043f(Application application, C8618c cVar, C13138q qVar, C13265p pVar, C8694h hVar, C12703a aVar, C13461f fVar, C12066w wVar, C8061n nVar) {
        this.f26843a = hVar;
        this.f26844b = aVar;
        this.f26845c = application;
        this.f26846d = cVar;
        this.f26847e = nVar;
        this.f26848f = wVar;
        this.f26849g = fVar;
        this.f26850h = pVar;
        this.f26851i = qVar;
    }

    /* renamed from: d */
    public static AppsFlyerLib m19857d() {
        AppsFlyerLib instance = AppsFlyerLib.getInstance();
        C19383o.m32796f(instance, "getInstance()");
        return instance;
    }

    /* renamed from: a */
    public final void mo38928a(String str) {
        C19383o.m32797g(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        try {
            if (mo38931e()) {
                m19857d().updateServerUninstallToken(this.f26845c, str);
                return;
            }
            this.f26844b.mo45474a("appsflyer.fcmtoken_afnotsetup");
            C8694h hVar = this.f26843a;
            hVar.mo21310e("Token " + str + " not registered for uninstall. AppsFlyer is not setup");
        } catch (Exception e) {
            this.f26844b.mo45474a("appsflyer.fcmtoken_exception");
            this.f26843a.error(e);
        }
    }

    /* renamed from: b */
    public final void mo38929b(C12045h hVar, C19846a<C19394m> aVar, C19857l<? super Throwable, C19394m> lVar) {
        C19383o.m32797g(aVar, "onSuccess");
        C19383o.m32797g(lVar, "onError");
        if (!this.f26846d.mo21132b(C8592b.f18789f0)) {
            C8694h hVar2 = this.f26843a;
            hVar2.mo21310e("Event " + hVar + " not logged. Config BOE_APPSFLYER_EVENT_TRACKING_ENABLED is not enabled");
        } else if (!mo38932f() || (!m19857d().isStopped())) {
            CompletableCreate completableCreate = new CompletableCreate(new C12040c(this, hVar));
            this.f26849g.getClass();
            CompletableSubscribeOn completableSubscribeOn = new CompletableSubscribeOn(completableCreate, C13461f.m21234a());
            this.f26849g.getClass();
            new CompletableObserveOn(completableSubscribeOn, C13461f.m21236c()).mo20608c(new C8266d(lVar, 7), new C8265c(aVar, 1));
        } else {
            C8694h hVar3 = this.f26843a;
            hVar3.mo21310e("Event " + hVar + " not logged. Privacy settings are disabling AppsFlyer.");
        }
    }

    /* renamed from: c */
    public final void mo38930c() {
        if (this.f26854l.getAndSet(true)) {
            this.f26843a.mo21310e("AppsFlyer observer has already been initialized");
            return;
        }
        ObservableFlatMapCompletableCompletable observableFlatMapCompletableCompletable = new ObservableFlatMapCompletableCompletable(new ObservableFlatMapSingle(C8061n.m16234b(this.f26847e, new C19179q(this.f26850h.f29152r.mo45909c(), new C13250b(7)), new C13983i()), new C8848c(this, 5)), new C8998i(this, 5));
        this.f26849g.getClass();
        new CompletableObserveOn(observableFlatMapCompletableCompletable, C13461f.m21236c()).mo20608c(new C8264b(this, 9), new C13096p(2));
    }

    /* renamed from: e */
    public final boolean mo38931e() {
        return this.f26846d.mo21132b(C8592b.f18786e0) && mo38932f();
    }

    /* renamed from: f */
    public final boolean mo38932f() {
        return !this.f26852j.get() && this.f26853k.get();
    }

    /* renamed from: g */
    public final void mo38933g(String str, String str2, boolean z) {
        if (str != null) {
            C8048a a = this.f26848f.mo38936a(str, str2, z);
            this.f26849g.getClass();
            C8066r b = C13461f.m21235b();
            a.getClass();
            new CompletableSubscribeOn(a, b).mo20608c(new C8480g(this, 7), new C12041d(this, str));
        }
    }

    /* renamed from: h */
    public final void mo38934h(String str, Map<String, String> map) {
        C19383o.m32797g(str, "eventName");
        if (!this.f26846d.mo21132b(C8592b.f18789f0)) {
            C8694h hVar = this.f26843a;
            hVar.mo21310e("Event " + str + " not logged. Config BOE_APPSFLYER_EVENT_TRACKING_ENABLED is not enabled");
        } else if (!mo38932f() || (!m19857d().isStopped())) {
            try {
                if (mo38931e()) {
                    m19857d().logEvent(this.f26845c, str, map);
                    return;
                }
                this.f26844b.mo45474a("appsflyer.trackevent_afnotsetup");
                C8694h hVar2 = this.f26843a;
                hVar2.mo21310e("Event " + str + " not logged. AppsFlyer is not setup");
            } catch (Exception e) {
                this.f26843a.error(e);
                this.f26844b.mo45474a("appsflyer.trackevent_failure");
                throw e;
            }
        } else {
            C8694h hVar3 = this.f26843a;
            hVar3.mo21310e("Event " + str + " not logged. Privacy settings are disabling AppsFlyer.");
        }
    }
}
