package com.etsy.android.lib.push.registration;

import android.content.SharedPreferences;
import androidx.room.C3218a0;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.push.settings.NotificationSettings;
import com.etsy.android.lib.user.C8864c;
import com.etsy.android.lib.user.TimeZoneRepository;
import com.etsy.android.lib.util.C8890e0;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p145io.reactivex.BackpressureStrategy;
import p145io.reactivex.internal.operators.completable.CompletableObserveOn;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p145io.reactivex.internal.operators.flowable.FlowableCreate;
import p145io.reactivex.internal.operators.flowable.FlowableRetryWhen;
import p145io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import p145io.reactivex.internal.operators.observable.ObservableRetryWhen;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.internal.operators.single.SingleCreate;
import p145io.reactivex.internal.operators.single.SingleSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8048a;
import p248tp.C8054g;
import p248tp.C8061n;
import p248tp.C8066r;
import p346fa.C12703a;
import p409o9.C13138q;
import p410oa.C13145e;
import p425q9.C13252d;
import p456ua.C13461f;
import p628nj.C18263b;

public final class FCMPushRegistration implements C8837j {

    /* renamed from: a */
    public final C8694h f19396a;

    /* renamed from: b */
    public final C13145e f19397b;

    /* renamed from: c */
    public final C13461f f19398c;

    /* renamed from: d */
    public final C13252d f19399d;

    /* renamed from: e */
    public final C12703a f19400e;

    /* renamed from: f */
    public final C8841n f19401f;

    /* renamed from: g */
    public final C8835h f19402g;

    /* renamed from: h */
    public final NotificationSettings f19403h;

    /* renamed from: i */
    public final TimeZoneRepository f19404i;

    /* renamed from: j */
    public final C8864c f19405j;

    /* renamed from: k */
    public final C8890e0 f19406k;

    /* renamed from: l */
    public boolean f19407l;

    public FCMPushRegistration(C8694h hVar, C13145e eVar, C13461f fVar, C13252d dVar, C12703a aVar, C8841n nVar, C8835h hVar2, NotificationSettings notificationSettings, TimeZoneRepository timeZoneRepository, C8864c cVar, C8890e0 e0Var) {
        C19383o.m32797g(hVar, AnalyticsLogDatabaseHelper.LOG);
        C19383o.m32797g(eVar, "playServices");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(dVar, "authManager");
        C19383o.m32797g(aVar, "grafana");
        C19383o.m32797g(nVar, "tokenUploader");
        C19383o.m32797g(hVar2, "fcmTokenRequest");
        C19383o.m32797g(notificationSettings, "notificationSettings");
        C19383o.m32797g(timeZoneRepository, "timeZoneRepository");
        C19383o.m32797g(cVar, "timestampStorage");
        C19383o.m32797g(e0Var, "time");
        this.f19396a = hVar;
        this.f19397b = eVar;
        this.f19398c = fVar;
        this.f19399d = dVar;
        this.f19400e = aVar;
        this.f19401f = nVar;
        this.f19402g = hVar2;
        this.f19403h = notificationSettings;
        this.f19404i = timeZoneRepository;
        this.f19405j = cVar;
        this.f19406k = e0Var;
    }

    /* renamed from: a */
    public final boolean mo30207a() {
        return this.f19397b.mo45856a();
    }

    /* renamed from: b */
    public final void mo30208b(String str) {
        C19383o.m32797g(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        mo30212f(str);
    }

    /* renamed from: c */
    public final void mo30209c() {
        if (this.f19399d.f29107a != null) {
            long j = this.f19405j.f19584a.getLong("last-token-reg-success", 0);
            if (j > 0) {
                this.f19406k.getClass();
                long j2 = (long) 60;
                if (System.currentTimeMillis() - j < ((long) 24) * ((long) 1000) * j2 * j2) {
                    this.f19400e.mo45475b("notification_token.ignoring_register_call_less_than_24h", 0.1d);
                    return;
                }
            }
            NotificationSettings notificationSettings = this.f19403h;
            notificationSettings.getClass();
            SingleCreate singleCreate = new SingleCreate(new C3218a0(notificationSettings, 2));
            this.f19398c.getClass();
            SingleSubscribeOn i = singleCreate.mo20660i(C13461f.m21235b());
            this.f19398c.getClass();
            SubscribersKt.m32500e(i.mo20657f(C13461f.m21235b()), new FCMPushRegistration$registerForMessaging$1(this), new FCMPushRegistration$registerForMessaging$2(this));
        } else {
            this.f19396a.mo21312f("Not registering for push: not signed in");
        }
        this.f19404i.mo30428a();
    }

    /* renamed from: d */
    public final void mo30210d() {
        SharedPreferences sharedPreferences = this.f19405j.f19584a;
        C19383o.m32796f(sharedPreferences, "preferences");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C19383o.m32796f(edit, "editor");
        edit.remove("last-token-reg-success");
        edit.apply();
        C8841n nVar = this.f19401f;
        nVar.f19447b.mo45475b("notification_token.attempting_to_delete_token_with_etsy_apiV3", 0.1d);
        C8828a aVar = nVar.f19446a;
        String str = nVar.f19449d.f28895a;
        C19383o.m32796f(str, "installInfo.uuid");
        C8048a b = aVar.mo30229b(str);
        this.f19398c.getClass();
        C8066r b2 = C13461f.m21235b();
        b.getClass();
        CompletableSubscribeOn completableSubscribeOn = new CompletableSubscribeOn(b, b2);
        this.f19398c.getClass();
        SubscribersKt.m32499d(new CompletableObserveOn(completableSubscribeOn, C13461f.m21236c()), new FCMPushRegistration$unregisterWithEtsy$1(this), new FCMPushRegistration$unregisterWithEtsy$2(this));
    }

    /* renamed from: e */
    public final boolean mo30211e() {
        return this.f19407l;
    }

    /* renamed from: f */
    public final void mo30212f(String str) {
        if (!(this.f19399d.f29107a != null)) {
            this.f19396a.mo21312f("Not registering for push: not signed in");
        } else if (!C19457k.m33020X0(str)) {
            C8841n nVar = this.f19401f;
            nVar.getClass();
            C8828a aVar = nVar.f19446a;
            String str2 = nVar.f19449d.f28897c;
            int parseInt = Integer.parseInt(BuildTarget.getAudience().isInternal() ? "2" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            C13138q qVar = nVar.f19449d;
            String str3 = qVar.f28895a;
            String str4 = qVar.f28896b;
            C19383o.m32796f(str2, "packageName");
            C19383o.m32796f(str3, "uuid");
            C19383o.m32796f(str4, ResponseConstants.VERSION);
            C8061n<TokenRegistrationResult> a = aVar.mo30228a(str, "android", parseInt, str2, str3, str4, true);
            C8839l lVar = new C8839l(nVar, 0);
            a.getClass();
            ObservableRetryWhen observableRetryWhen = new ObservableRetryWhen(a, lVar);
            this.f19398c.getClass();
            ObservableSubscribeOn i = observableRetryWhen.mo20639i(C13461f.m21235b());
            this.f19398c.getClass();
            SubscribersKt.m32501f(i.mo20635e(C13461f.m21236c()), new FCMPushRegistration$registerWithEtsy$1(this), new FCMPushRegistration$registerWithEtsy$2(this), 2);
        } else {
            this.f19396a.mo21306a("Attempted to register for Etsy notifications with empty ID");
            this.f19400e.mo45474a("notification_token.attempted_empty_token_upload");
        }
    }

    /* renamed from: g */
    public final void mo30213g(String str) {
        boolean c0 = C18263b.m30837c0(str);
        C8835h hVar = this.f19402g;
        long d = (long) hVar.f19430a.f19441a.mo21134d(C8592b.C8605m.f18908b);
        int d2 = hVar.f19430a.f19441a.mo21134d(C8592b.C8605m.f18907a);
        C8831d dVar = hVar.f19431b;
        dVar.getClass();
        C8830c cVar = new C8830c(c0, dVar);
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.BUFFER;
        int i = C8054g.f17572b;
        if (backpressureStrategy != null) {
            FlowableRetryWhen flowableRetryWhen = new FlowableRetryWhen(new FlowableCreate(cVar, backpressureStrategy), new C8833f(hVar, d2, d));
            this.f19398c.getClass();
            FlowableSubscribeOn flowableSubscribeOn = new FlowableSubscribeOn(flowableRetryWhen, C13461f.m21235b(), !(flowableRetryWhen instanceof FlowableCreate));
            this.f19398c.getClass();
            SubscribersKt.m32502g(flowableSubscribeOn.mo20617a(C13461f.m21236c()), new FCMPushRegistration$retrieveFcmTokenInBackground$1(this), new FCMPushRegistration$retrieveFcmTokenInBackground$2(str, this));
            return;
        }
        throw new NullPointerException("mode is null");
    }
}
