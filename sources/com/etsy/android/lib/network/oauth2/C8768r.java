package com.etsy.android.lib.network.oauth2;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.network.oauth2.signin.C8776e;
import com.etsy.android.lib.network.oauth2.signin.C8781i;
import com.etsy.android.lib.network.oauth2.signin.C8784l;
import com.etsy.android.lib.push.registration.C8828a;
import com.etsy.android.lib.push.registration.C8838k;
import com.etsy.android.lib.push.registration.C8841n;
import dagger.internal.C17555d;
import p346fa.C12703a;
import p409o9.C13138q;
import p456ua.C13461f;
import p456ua.C13462g;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.network.oauth2.r */
public final class C8768r implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19286a;

    /* renamed from: b */
    public final C19011a f19287b;

    /* renamed from: c */
    public final C19011a f19288c;

    /* renamed from: d */
    public final C19011a f19289d;

    /* renamed from: e */
    public final C19011a f19290e;

    /* renamed from: f */
    public final C19011a f19291f;

    /* renamed from: g */
    public final C19011a f19292g;

    public /* synthetic */ C8768r(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, C19011a aVar5, int i) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f19286a = i;
        this.f19287b = aVar;
        this.f19288c = aVar2;
        this.f19289d = aVar3;
        this.f19290e = aVar4;
        this.f19291f = aVar5;
        this.f19292g = gVar;
    }

    public final Object get() {
        switch (this.f19286a) {
            case 0:
                return new C8767q((C8776e) this.f19287b.get(), (C8784l) this.f19288c.get(), (C8781i) this.f19289d.get(), (C8759i) this.f19290e.get(), (C8744a) this.f19291f.get(), (C13461f) this.f19292g.get());
            default:
                return new C8841n((C8828a) this.f19287b.get(), (C8838k) this.f19288c.get(), (C12703a) this.f19289d.get(), (C8694h) this.f19290e.get(), (C13138q) this.f19291f.get(), (C13461f) this.f19292g.get());
        }
    }
}
