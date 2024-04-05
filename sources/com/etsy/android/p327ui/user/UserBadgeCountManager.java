package com.etsy.android.p327ui.user;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.apiv3.ApiGiftCardBalance;
import com.etsy.android.lib.models.apiv3.GiftCardBalance;
import com.etsy.android.p327ui.C9097a0;
import com.etsy.android.p327ui.search.p330v2.C11027h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.operators.observable.ObservableFlatMapSingle;
import p145io.reactivex.internal.operators.observable.ObservableSampleTimed;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p145io.reactivex.subjects.PublishSubject;
import p248tp.C8066r;
import p425q9.C13265p;
import p456ua.C13461f;
import p491ye.C13921e;
import p634np.C18289a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.UserBadgeCountManager */
public final class UserBadgeCountManager {

    /* renamed from: a */
    public final C18289a<C9097a0> f25037a;

    /* renamed from: b */
    public final C18289a<C13265p> f25038b;

    /* renamed from: c */
    public final C13921e f25039c;

    /* renamed from: d */
    public final C19254a<Integer> f25040d = C19254a.m32516l(0);

    /* renamed from: e */
    public final C19254a<Integer> f25041e = C19254a.m32516l(0);

    /* renamed from: f */
    public final C19254a<Integer> f25042f = C19254a.m32516l(0);

    /* renamed from: g */
    public final C19254a<Integer> f25043g = C19254a.m32516l(0);

    /* renamed from: h */
    public final C19254a<C11355a> f25044h = C19254a.m32516l(C11355a.C11357b.f25047a);

    /* renamed from: i */
    public final PublishSubject<C19394m> f25045i;

    /* renamed from: com.etsy.android.ui.user.UserBadgeCountManager$a */
    public static abstract class C11355a {

        /* renamed from: com.etsy.android.ui.user.UserBadgeCountManager$a$a */
        public static final class C11356a extends C11355a {

            /* renamed from: a */
            public final List<GiftCardBalance> f25046a;

            public C11356a(ArrayList arrayList) {
                this.f25046a = arrayList;
            }
        }

        /* renamed from: com.etsy.android.ui.user.UserBadgeCountManager$a$b */
        public static final class C11357b extends C11355a {

            /* renamed from: a */
            public static final C11357b f25047a = new C11357b();
        }
    }

    public UserBadgeCountManager(C18289a<C9097a0> aVar, C13461f fVar, C18289a<C13265p> aVar2, C13921e eVar) {
        C19383o.m32797g(aVar, "endpoint");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(aVar2, "session");
        C19383o.m32797g(eVar, "tooltipPrefs");
        this.f25037a = aVar;
        this.f25038b = aVar2;
        this.f25039c = eVar;
        C7091a aVar3 = new C7091a();
        PublishSubject<C19394m> publishSubject = new PublishSubject<>();
        this.f25045i = publishSubject;
        aVar3.mo19405d();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C8066r a = C13461f.m21234a();
        if (timeUnit != null) {
            aVar3.mo19403b(SubscribersKt.m32501f(new ObservableFlatMapSingle(new ObservableSampleTimed(publishSubject, timeUnit, a).mo20635e(C13461f.m21235b()), new C11027h(this, 1)), new C19857l<Throwable, C19394m>(LogCatKt.m17045a()) {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C19394m.f43287a;
                }

                public final void invoke(Throwable th) {
                    ((C8694h) this.receiver).error(th);
                }
            }, C113543.INSTANCE, 2));
            return;
        }
        throw new NullPointerException("unit is null");
    }

    /* renamed from: a */
    public final void mo37123a(Map<String, ApiGiftCardBalance> map) {
        if (map != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry next : map.entrySet()) {
                arrayList.add(new GiftCardBalance((String) next.getKey(), ((ApiGiftCardBalance) next.getValue()).getAvailable(), ((ApiGiftCardBalance) next.getValue()).getPending()));
            }
            this.f25044h.onNext(new C11355a.C11356a(arrayList));
            return;
        }
        this.f25044h.onNext(C11355a.C11357b.f25047a);
    }
}
