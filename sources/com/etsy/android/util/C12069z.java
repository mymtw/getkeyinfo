package com.etsy.android.util;

import android.content.Context;
import android.content.Intent;
import androidx.core.widget.C2399d;
import com.appboy.p043ui.C4950e;
import com.etsy.android.checkout.C6336c;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.apiv3.ApiGiftCardBalance;
import com.etsy.android.lib.network.C8809t;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.lib.push.registration.C8837j;
import com.etsy.android.lib.util.NotificationType;
import com.etsy.android.p327ui.conversation.details.C9477c;
import com.etsy.android.p327ui.home.tabs.HomePagerFragment;
import com.etsy.android.p327ui.user.UserBadgeCountManager;
import java.util.Map;
import java.util.Objects;
import p028b9.C3505a;
import p028b9.C3506b;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.observers.EmptyCompletableObserver;
import p145io.reactivex.internal.operators.completable.C19092e;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p145io.reactivex.internal.operators.observable.C19146a0;
import p145io.reactivex.internal.operators.observable.C19158e;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.subjects.C19254a;
import p418pa.C13197c;
import p425q9.C13265p;
import p425q9.C13271u;
import p434ra.C13341h;
import p434ra.C13343j;
import p456ua.C13461f;
import p496za.C13943a;

/* renamed from: com.etsy.android.util.z */
public final class C12069z implements C13271u, C13265p.C13266a {

    /* renamed from: k */
    public static boolean f26913k = true;

    /* renamed from: a */
    public final C8837j f26914a;

    /* renamed from: b */
    public final C13341h f26915b;

    /* renamed from: c */
    public final Connectivity f26916c;

    /* renamed from: d */
    public final C13461f f26917d;

    /* renamed from: e */
    public final UserBadgeCountManager f26918e;

    /* renamed from: f */
    public final C9477c f26919f;

    /* renamed from: g */
    public final C7091a f26920g = new C7091a();

    /* renamed from: h */
    public final C8694h f26921h;

    /* renamed from: i */
    public final C8809t f26922i;

    /* renamed from: j */
    public final C13943a f26923j;

    public C12069z(C8837j jVar, C13341h hVar, Connectivity connectivity, C13461f fVar, UserBadgeCountManager userBadgeCountManager, C9477c cVar, C8809t tVar, C13943a aVar, C8694h hVar2) {
        this.f26914a = jVar;
        this.f26915b = hVar;
        this.f26916c = connectivity;
        this.f26917d = fVar;
        this.f26918e = userBadgeCountManager;
        this.f26919f = cVar;
        this.f26922i = tVar;
        this.f26923j = aVar;
        this.f26921h = hVar2;
    }

    /* renamed from: a */
    public final void mo18530a(Context context, boolean z) {
        C7091a aVar = this.f26920g;
        C19254a<Boolean> aVar2 = this.f26916c.f19165g;
        this.f26917d.getClass();
        ObservableSubscribeOn i = aVar2.mo20639i(C13461f.m21235b());
        this.f26917d.getClass();
        aVar.mo19403b(new C19158e(new C19158e(new C19146a0(i.mo20635e(C13461f.m21235b())), new C13197c(this, 4), Functions.f28539c), Functions.f28540d, new C12068y(this)).mo20637g(new C6336c(this, 7)));
    }

    /* renamed from: b */
    public final void mo38937b(Context context) {
        C19092e eVar = new C19092e(new C4950e(context, 1));
        EtsyApplication.get().getRxSchedulers().getClass();
        new CompletableSubscribeOn(eVar, C13461f.m21235b()).mo20608c(new C3506b(0), new C3505a());
        context.getSharedPreferences("convo_prefs", 0).edit().clear().apply();
        C9477c cVar = this.f26919f;
        Objects.requireNonNull(cVar);
        C19092e eVar2 = new C19092e(new C2399d(cVar, 5));
        this.f26917d.getClass();
        new CompletableSubscribeOn(eVar2, C13461f.m21235b()).mo20607a(new EmptyCompletableObserver());
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        launchIntentForPackage.putExtra("HOME_RESET", true);
        launchIntentForPackage.putExtra("FORCED_SIGNOUT", false);
        launchIntentForPackage.addFlags(67108864);
        if (f26913k) {
            launchIntentForPackage.setPackage((String) null);
        }
        context.startActivity(launchIntentForPackage);
        this.f26915b.mo46036a();
        for (NotificationType a : NotificationType.values()) {
            C13343j.m20997a(a).mo46034h();
        }
        UserBadgeCountManager userBadgeCountManager = this.f26918e;
        userBadgeCountManager.f25041e.onNext(0);
        userBadgeCountManager.f25042f.onNext(0);
        userBadgeCountManager.f25043g.onNext(0);
        userBadgeCountManager.mo37123a((Map<String, ApiGiftCardBalance>) null);
        this.f26922i.clear();
        this.f26923j.mo46761a().edit().putBoolean(HomePagerFragment.ONBOARDING_SIGN_IN_MODE_ENABLED, true).apply();
        context.getSharedPreferences("EtsyUserPrefs", 0).edit().remove("show3x3viewTry2").apply();
    }

    /* renamed from: c */
    public final void mo38938c() {
        this.f26914a.mo30210d();
    }
}
