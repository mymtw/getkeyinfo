package com.etsy.android.p327ui.user.language;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.lifecycle.C2866i0;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p001a0.C0005b;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.subjects.C19254a;
import p359ha.C12799a;
import p456ua.C13461f;
import p486y9.C13888d;

/* renamed from: com.etsy.android.ui.user.language.g */
public final class C11605g extends C2866i0 {

    /* renamed from: b */
    public final Application f25694b;

    /* renamed from: c */
    public final C11603e f25695c;

    /* renamed from: d */
    public final C13888d f25696d;

    /* renamed from: e */
    public final C13461f f25697e;

    /* renamed from: f */
    public final C12799a f25698f;

    /* renamed from: g */
    public final C19254a<C11597d> f25699g = new C19254a<>();

    /* renamed from: h */
    public final C7091a f25700h = new C7091a();

    /* renamed from: i */
    public List<C11609i> f25701i = EmptyList.INSTANCE;

    public C11605g(Application application, C11603e eVar, C13888d dVar, C13461f fVar, C12799a aVar) {
        C19383o.m32797g(application, "application");
        C19383o.m32797g(eVar, "languageRepository");
        C19383o.m32797g(dVar, "currentLocale");
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(aVar, "firebaseAnalyticsTracker");
        this.f25694b = application;
        this.f25695c = eVar;
        this.f25696d = dVar;
        this.f25697e = fVar;
        this.f25698f = aVar;
    }

    /* renamed from: b */
    public final boolean mo37638b(String str) {
        return C19457k.m33019W0(str, this.f25696d.mo46718b().getLanguage(), true) || C19457k.m33019W0(str, this.f25696d.mo46717a(), true);
    }

    /* renamed from: c */
    public final boolean mo37639c() {
        Application application = this.f25694b;
        C19383o.m32797g(application, ResponseConstants.CONTEXT);
        SharedPreferences sharedPreferences = C0005b.f9g;
        if (sharedPreferences == null) {
            sharedPreferences = application.getSharedPreferences("EtsyUserPrefs", 0);
            C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…ODE_PRIVATE\n            )");
            C0005b.f9g = sharedPreferences;
        }
        return sharedPreferences.getBoolean("match_device_locale", false);
    }

    public final void onCleared() {
        super.onCleared();
        this.f25700h.mo19405d();
    }
}
