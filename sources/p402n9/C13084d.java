package p402n9;

import android.app.Application;
import com.braze.C5416d;
import com.braze.push.BrazeFirebaseMessagingService;
import com.etsy.android.lib.logger.LogCatKt;
import com.google.firebase.messaging.RemoteMessage;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import p248tp.C8061n;
import p346fa.C12703a;
import p426qa.C13275a;
import p426qa.C13276b;
import p456ua.C13461f;

/* renamed from: n9.d */
public final class C13084d implements C13276b, C13275a {

    /* renamed from: a */
    public final C8061n<C5416d> f28763a;

    /* renamed from: b */
    public final C12703a f28764b;

    /* renamed from: c */
    public final Application f28765c;

    /* renamed from: d */
    public final boolean f28766d;

    /* renamed from: e */
    public final C13461f f28767e;

    public C13084d(C19172m mVar, C12703a aVar, Application application, boolean z, C13461f fVar) {
        C19383o.m32797g(aVar, "grafana");
        C19383o.m32797g(application, "application");
        this.f28763a = mVar;
        this.f28764b = aVar;
        this.f28765c = application;
        this.f28766d = z;
        this.f28767e = fVar;
    }

    /* renamed from: a */
    public final void mo38928a(String str) {
        C19383o.m32797g(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        if (this.f28766d) {
            C8061n<C5416d> nVar = this.f28763a;
            C13081a aVar = new C13081a(str, 0, this);
            nVar.getClass();
            new ObservableFlatMapCompletableCompletable(nVar, aVar).mo20608c(new C13083c(this, 0), new C13082b(str));
        }
    }

    /* renamed from: b */
    public final boolean mo45824b(RemoteMessage remoteMessage) {
        C19383o.m32797g(remoteMessage, "message");
        BrazeFirebaseMessagingService.Companion.getClass();
        return this.f28766d && BrazeFirebaseMessagingService.Companion.m11193b(remoteMessage);
    }

    /* renamed from: c */
    public final boolean mo45825c(RemoteMessage remoteMessage) {
        C19383o.m32797g(remoteMessage, "message");
        if (this.f28766d) {
            return BrazeFirebaseMessagingService.Companion.mo16048a(this.f28765c, remoteMessage);
        }
        LogCatKt.m17045a().mo21310e("Braze: Token not pushed. Braze is disabled");
        return false;
    }
}
