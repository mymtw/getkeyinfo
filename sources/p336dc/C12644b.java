package p336dc;

import com.etsy.android.lib.session.C8855a;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p350fe.C12741o;
import p425q9.C13265p;
import p740eq.C19011a;

/* renamed from: dc.b */
public final class C12644b implements C17555d<C12643a> {

    /* renamed from: a */
    public final C19011a<C12741o> f27888a;

    /* renamed from: b */
    public final C19011a<C13265p> f27889b;

    /* renamed from: c */
    public final C19011a<C8855a> f27890c;

    public C12644b(C19011a aVar, C17553b bVar, C19011a aVar2) {
        this.f27888a = aVar;
        this.f27889b = bVar;
        this.f27890c = aVar2;
    }

    public final Object get() {
        return new C12643a(this.f27888a.get(), this.f27889b.get(), this.f27890c.get());
    }
}
