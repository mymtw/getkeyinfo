package com.etsy.android.lib.push.settings;

import android.app.NotificationManager;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8694h;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p040c9.C4591k;
import p340ea.C12673n;
import p346fa.C12703a;
import p409o9.C13138q;
import p456ua.C13461f;
import p456ua.C13462g;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.push.settings.d */
public final class C8849d implements C17555d<NotificationSettings> {

    /* renamed from: a */
    public final C19011a<C8694h> f19468a;

    /* renamed from: b */
    public final C19011a<C12673n> f19469b;

    /* renamed from: c */
    public final C19011a<NotificationManager> f19470c;

    /* renamed from: d */
    public final C19011a<C13461f> f19471d;

    /* renamed from: e */
    public final C19011a<C13138q> f19472e;

    /* renamed from: f */
    public final C19011a<C8844a> f19473f;

    /* renamed from: g */
    public final C19011a<C12703a> f19474g;

    /* renamed from: h */
    public final C19011a<C8618c> f19475h;

    public C8849d(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, C19011a aVar5, C17553b bVar, C4591k kVar) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f19468a = aVar;
        this.f19469b = aVar2;
        this.f19470c = aVar3;
        this.f19471d = gVar;
        this.f19472e = aVar4;
        this.f19473f = aVar5;
        this.f19474g = bVar;
        this.f19475h = kVar;
    }

    public final Object get() {
        return new NotificationSettings(this.f19468a.get(), this.f19469b.get(), this.f19470c.get(), this.f19471d.get(), this.f19472e.get(), this.f19473f.get(), this.f19474g.get(), this.f19475h.get());
    }
}
