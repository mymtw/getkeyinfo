package p402n9;

import android.app.Application;
import com.etsy.android.lib.useraction.C8869d;
import com.etsy.android.lib.useraction.UserActionBus;
import com.etsy.android.p327ui.user.language.C11603e;
import com.etsy.android.p327ui.user.language.C11605g;
import dagger.internal.C17555d;
import p248tp.C8061n;
import p346fa.C12703a;
import p359ha.C12799a;
import p425q9.C13265p;
import p456ua.C13461f;
import p486y9.C13888d;
import p740eq.C19011a;

/* renamed from: n9.r */
public final class C13098r implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f28799a;

    /* renamed from: b */
    public final C19011a f28800b;

    /* renamed from: c */
    public final C19011a f28801c;

    /* renamed from: d */
    public final C19011a f28802d;

    /* renamed from: e */
    public final C19011a f28803e;

    /* renamed from: f */
    public final C19011a f28804f;

    public /* synthetic */ C13098r(C19011a aVar, C19011a aVar2, C19011a aVar3, C17555d dVar, C19011a aVar4, int i) {
        this.f28799a = i;
        this.f28800b = aVar;
        this.f28801c = aVar2;
        this.f28802d = aVar3;
        this.f28803e = dVar;
        this.f28804f = aVar4;
    }

    public final Object get() {
        switch (this.f28799a) {
            case 0:
                return new C13097q((C8061n) this.f28800b.get(), (C12703a) this.f28801c.get(), (C8061n) this.f28802d.get(), (C13265p) this.f28803e.get(), (C13461f) this.f28804f.get());
            case 1:
                return new UserActionBus((C8869d) this.f28800b.get(), (String) this.f28801c.get(), ((Boolean) this.f28802d.get()).booleanValue(), (C13461f) this.f28803e.get(), (C12703a) this.f28804f.get());
            default:
                return new C11605g((Application) this.f28800b.get(), (C11603e) this.f28801c.get(), (C13888d) this.f28802d.get(), (C13461f) this.f28803e.get(), (C12799a) this.f28804f.get());
        }
    }
}
