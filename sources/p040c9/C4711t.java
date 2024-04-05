package p040c9;

import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.network.oauth2.signin.C8782j;
import com.etsy.android.p327ui.util.C11786n;
import dagger.internal.C17555d;
import p414oe.C13164c;
import p740eq.C19011a;

/* renamed from: c9.t */
public final class C4711t implements C17555d<C13164c> {

    /* renamed from: a */
    public final C4479c f10649a;

    /* renamed from: b */
    public final C19011a<C8630b> f10650b;

    /* renamed from: c */
    public final C19011a<C8629a> f10651c;

    /* renamed from: d */
    public final C19011a<C11786n> f10652d;

    public C4711t(C4479c cVar, C19011a aVar, C19011a aVar2, C8782j jVar) {
        this.f10649a = cVar;
        this.f10650b = aVar;
        this.f10651c = aVar2;
        this.f10652d = jVar;
    }

    public final Object get() {
        this.f10649a.getClass();
        return new C13164c(this.f10650b.get(), this.f10651c.get(), this.f10652d.get());
    }
}
