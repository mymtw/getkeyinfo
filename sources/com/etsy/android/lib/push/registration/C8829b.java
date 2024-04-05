package com.etsy.android.lib.push.registration;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.push.settings.NotificationSettings;
import com.etsy.android.lib.user.C8864c;
import com.etsy.android.lib.user.TimeZoneRepository;
import com.etsy.android.lib.util.C8890e0;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p346fa.C12703a;
import p410oa.C13145e;
import p410oa.C13146f;
import p425q9.C13252d;
import p456ua.C13461f;
import p456ua.C13462g;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.push.registration.b */
public final class C8829b implements C17555d<FCMPushRegistration> {

    /* renamed from: a */
    public final C19011a<C8694h> f19409a;

    /* renamed from: b */
    public final C19011a<C13145e> f19410b;

    /* renamed from: c */
    public final C19011a<C13461f> f19411c;

    /* renamed from: d */
    public final C19011a<C13252d> f19412d;

    /* renamed from: e */
    public final C19011a<C12703a> f19413e;

    /* renamed from: f */
    public final C19011a<C8841n> f19414f;

    /* renamed from: g */
    public final C19011a<C8835h> f19415g;

    /* renamed from: h */
    public final C19011a<NotificationSettings> f19416h;

    /* renamed from: i */
    public final C19011a<TimeZoneRepository> f19417i;

    /* renamed from: j */
    public final C19011a<C8864c> f19418j;

    /* renamed from: k */
    public final C19011a<C8890e0> f19419k;

    public C8829b(C19011a aVar, C13146f fVar, C19011a aVar2, C17553b bVar, C19011a aVar3, C19011a aVar4, C19011a aVar5, C19011a aVar6, C19011a aVar7, C19011a aVar8) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f19409a = aVar;
        this.f19410b = fVar;
        this.f19411c = gVar;
        this.f19412d = aVar2;
        this.f19413e = bVar;
        this.f19414f = aVar3;
        this.f19415g = aVar4;
        this.f19416h = aVar5;
        this.f19417i = aVar6;
        this.f19418j = aVar7;
        this.f19419k = aVar8;
    }

    public final Object get() {
        return new FCMPushRegistration(this.f19409a.get(), this.f19410b.get(), this.f19411c.get(), this.f19412d.get(), this.f19413e.get(), this.f19414f.get(), this.f19415g.get(), this.f19416h.get(), this.f19417i.get(), this.f19418j.get(), this.f19419k.get());
    }
}
