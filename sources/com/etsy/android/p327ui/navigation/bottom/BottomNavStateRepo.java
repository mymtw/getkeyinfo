package com.etsy.android.p327ui.navigation.bottom;

import android.content.Context;
import com.etsy.android.R;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cart.CartBadgeCountRepo;
import com.etsy.android.p327ui.navigation.bottom.C10684f;
import com.etsy.android.p327ui.user.UserBadgeCountManager;
import com.etsy.android.p327ui.user.inappnotifications.C11541a0;
import com.etsy.android.p327ui.you.C11800a;
import com.etsy.android.push.C8938a;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p425q9.C13265p;
import p434ra.C13341h;
import p568fn.C17782b;

/* renamed from: com.etsy.android.ui.navigation.bottom.BottomNavStateRepo */
public final class BottomNavStateRepo {

    /* renamed from: a */
    public final C13265p f23534a;

    /* renamed from: b */
    public final UserBadgeCountManager f23535b;

    /* renamed from: c */
    public final CartBadgeCountRepo f23536c;

    /* renamed from: d */
    public final C8938a f23537d;

    /* renamed from: e */
    public final Context f23538e;

    /* renamed from: f */
    public final C11541a0 f23539f;

    /* renamed from: g */
    public final C13341h f23540g;

    /* renamed from: h */
    public C7091a f23541h = new C7091a();

    /* renamed from: i */
    public C7091a f23542i = new C7091a();

    /* renamed from: j */
    public final C10690g f23543j;

    /* renamed from: k */
    public final C19254a<C10690g> f23544k;

    /* renamed from: l */
    public final C19254a<C10682d> f23545l;

    public BottomNavStateRepo(C13265p pVar, UserBadgeCountManager userBadgeCountManager, CartBadgeCountRepo cartBadgeCountRepo, C8938a aVar, Context context, C11541a0 a0Var, C13341h hVar) {
        C10690g gVar;
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(userBadgeCountManager, "userBadgeCountManager");
        C19383o.m32797g(cartBadgeCountRepo, "cartBadgeCountRepo");
        C19383o.m32797g(aVar, "conversationPushNotificationWatcher");
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(a0Var, "updatesNativeEligibility");
        C19383o.m32797g(hVar, "notificationManager");
        this.f23534a = pVar;
        this.f23535b = userBadgeCountManager;
        this.f23536c = cartBadgeCountRepo;
        this.f23537d = aVar;
        this.f23538e = context;
        this.f23539f = a0Var;
        this.f23540g = hVar;
        if (a0Var.mo37551a()) {
            gVar = new C10690g(R.menu.bottom_nav_merged_updates_n_favs, C17782b.m29865e0(C10684f.C10687c.f23568f, C10684f.C10686b.f23567f, C10684f.C10689e.f23570f, C10684f.C10685a.f23566f));
        } else {
            gVar = new C10690g(R.menu.bottom_navigation, C17782b.m29865e0(C10684f.C10687c.f23568f, C10684f.C10686b.f23567f, C10684f.C10688d.f23569f, C10684f.C10689e.f23570f, C10684f.C10685a.f23566f));
        }
        this.f23543j = gVar;
        this.f23544k = C19254a.m32516l(gVar);
        this.f23545l = new C19254a<>();
    }

    /* renamed from: b */
    public static C11800a m18605b(int i, int i2) {
        return i == 0 ? i2 > 0 ? C11800a.C11802b.f26279a : C11800a.C11804d.f26281a : new C11800a.C11801a(i);
    }

    /* renamed from: a */
    public final void mo34415a(int i, boolean z) {
        if (i != -1) {
            C10690g m = this.f23544k.mo71420m();
            if (m == null) {
                m = this.f23543j;
            }
            C19383o.m32796f(m, "subject.value ?: initialState");
            int i2 = m.f23572b;
            List<C10684f> list = m.f23573c;
            boolean z2 = m.f23575e;
            C19383o.m32797g(list, ResponseConstants.ITEMS);
            this.f23544k.onNext(new C10690g(i, i2, list, z, z2));
        }
    }

    /* renamed from: c */
    public final void mo34416c() {
        this.f23535b.f25045i.onNext(C19394m.f43287a);
    }

    /* renamed from: d */
    public final void mo34417d() {
        this.f23542i.mo19405d();
        this.f23542i = new C7091a();
        LambdaObserver f = SubscribersKt.m32501f(this.f23534a.mo45957b(), new BottomNavStateRepo$subscribeToSignIn$1(LogCatKt.m17045a()), new BottomNavStateRepo$subscribeToSignIn$2(this), 2);
        C7091a aVar = this.f23542i;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(f);
    }
}
