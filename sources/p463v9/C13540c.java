package p463v9;

import android.app.Application;
import android.content.Context;
import com.etsy.android.p327ui.home.etsylens.C9970a;
import com.etsy.android.p327ui.user.circles.C11507b;
import com.etsy.android.p327ui.user.circles.CirclesRepository;
import dagger.internal.C17555d;
import p346fa.C12703a;
import p425q9.C13265p;
import p740eq.C19011a;

/* renamed from: v9.c */
public final class C13540c implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f29609a;

    /* renamed from: b */
    public final C19011a f29610b;

    /* renamed from: c */
    public final C19011a f29611c;

    public /* synthetic */ C13540c(C19011a aVar, C19011a aVar2, int i) {
        this.f29609a = i;
        this.f29610b = aVar;
        this.f29611c = aVar2;
    }

    public final Object get() {
        switch (this.f29609a) {
            case 0:
                return new C13537b((Context) this.f29610b.get(), (C13542e) this.f29611c.get());
            case 1:
                return new C9970a((Application) this.f29610b.get(), (C12703a) this.f29611c.get());
            default:
                return new CirclesRepository((C11507b) this.f29610b.get(), (C13265p) this.f29611c.get());
        }
    }
}
