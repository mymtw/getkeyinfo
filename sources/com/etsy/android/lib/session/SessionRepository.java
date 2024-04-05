package com.etsy.android.lib.session;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p346fa.C12703a;
import p418pa.C13198d;
import p456ua.C13461f;

public final class SessionRepository {

    /* renamed from: a */
    public final C13198d f19536a;

    /* renamed from: b */
    public final C8857c f19537b;

    /* renamed from: c */
    public final C8618c f19538c;

    /* renamed from: d */
    public final C13461f f19539d;

    /* renamed from: e */
    public final C8855a f19540e;

    /* renamed from: f */
    public final C12703a f19541f;

    public SessionRepository(C13198d dVar, C8857c cVar, C8618c cVar2, C13461f fVar, C8855a aVar, C12703a aVar2) {
        C19383o.m32797g(dVar, "privacyRepository");
        C19383o.m32797g(cVar, "sessionSettingsEndpoint");
        C19383o.m32797g(cVar2, "configMap");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(aVar, "customerCentricMessagingEligibility");
        C19383o.m32797g(aVar2, "grafana");
        this.f19536a = dVar;
        this.f19537b = cVar;
        this.f19538c = cVar2;
        this.f19539d = fVar;
        this.f19540e = aVar;
        this.f19541f = aVar2;
    }

    /* renamed from: a */
    public final void mo30398a() {
        if (this.f19538c.mo21132b(C8592b.C8595c.f18859c)) {
            SubscribersKt.m32500e(C0391c.m1056b(this.f19539d, C0072d.m199f(this.f19539d, this.f19537b.mo30408a())), new SessionRepository$fetchSessionSettings$1(this), new SessionRepository$fetchSessionSettings$2(this));
        }
    }
}
