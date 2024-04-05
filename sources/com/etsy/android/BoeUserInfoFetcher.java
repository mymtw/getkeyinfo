package com.etsy.android;

import android.content.Context;
import com.appboy.Constants;
import com.etsy.android.lib.currency.C8637h;
import com.etsy.android.lib.requests.LocaleRepository;
import com.etsy.android.lib.requests.LocaleResult;
import com.etsy.android.lib.selfuser.C8851b;
import com.etsy.android.lib.selfuser.C8852c;
import com.etsy.android.lib.selfuser.SelfUser;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.internal.operators.single.SingleZipArray;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p287xp.C8335c;
import p346fa.C12703a;
import p359ha.C12799a;
import p379k9.C12988b;
import p425q9.C13260k;
import p425q9.C13265p;
import p456ua.C13461f;
import p486y9.C13888d;
import p591im.C17868b;

public final class BoeUserInfoFetcher implements C12988b {

    /* renamed from: a */
    public final C13265p f14089a;

    /* renamed from: b */
    public final Context f14090b;

    /* renamed from: c */
    public final C8637h f14091c;

    /* renamed from: d */
    public final C12703a f14092d;

    /* renamed from: e */
    public final C8851b f14093e;

    /* renamed from: f */
    public final LocaleRepository f14094f;

    /* renamed from: g */
    public final C13461f f14095g;

    /* renamed from: h */
    public final C12799a f14096h;

    /* renamed from: i */
    public final C13888d f14097i;

    /* renamed from: j */
    public ConsumerSingleObserver f14098j;

    /* renamed from: com.etsy.android.BoeUserInfoFetcher$a */
    public static final class C6328a<T1, T2, R> implements C8335c<C8852c, LocaleResult, R> {
        public final R apply(C8852c cVar, LocaleResult localeResult) {
            C19383o.m32798h(cVar, Constants.APPBOY_PUSH_TITLE_KEY);
            C19383o.m32798h(localeResult, "u");
            return new Pair(cVar, localeResult);
        }
    }

    public BoeUserInfoFetcher(C13265p pVar, Context context, C8637h hVar, C12703a aVar, C8851b bVar, LocaleRepository localeRepository, C13461f fVar, C12799a aVar2, C13888d dVar) {
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(context, "appContext");
        C19383o.m32797g(hVar, "userCurrency");
        C19383o.m32797g(aVar, "grafana");
        C19383o.m32797g(bVar, "selfUserRepository");
        C19383o.m32797g(localeRepository, "localeRepository");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(aVar2, "firebaseAnalyticsTracker");
        C19383o.m32797g(dVar, "currentLocale");
        this.f14089a = pVar;
        this.f14090b = context;
        this.f14091c = hVar;
        this.f14092d = aVar;
        this.f14093e = bVar;
        this.f14094f = localeRepository;
        this.f14095g = fVar;
        this.f14096h = aVar2;
        this.f14097i = dVar;
    }

    /* renamed from: a */
    public final void mo18058a() {
        ConsumerSingleObserver consumerSingleObserver = this.f14098j;
        if (consumerSingleObserver != null) {
            consumerSingleObserver.dispose();
        }
        C8071s<SelfUser> a = this.f14093e.f19527a.mo30381a();
        C13260k kVar = new C13260k(3);
        a.getClass();
        SingleZipArray l = C8071s.m16253l(new C19211l(new C19208j(a, kVar), new C17868b(1)), this.f14094f.locale(), new C6328a());
        this.f14095g.getClass();
        this.f14098j = SubscribersKt.m32500e(l.mo20660i(C13461f.m21235b()), new BoeUserInfoFetcher$fetch$2(this), new BoeUserInfoFetcher$fetch$3(this));
    }
}
