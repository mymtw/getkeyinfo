package p425q9;

import android.content.Context;
import com.etsy.android.lib.currency.FormatterOverrides;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.util.C8890e0;
import dagger.internal.C17555d;
import p340ea.C12673n;
import p366ia.C12920a;
import p486y9.C13886b;
import p740eq.C19011a;

/* renamed from: q9.r */
public final class C13268r implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f29161a;

    /* renamed from: b */
    public final C19011a f29162b;

    /* renamed from: c */
    public final C19011a f29163c;

    /* renamed from: d */
    public final C19011a f29164d;

    public /* synthetic */ C13268r(C19011a aVar, C19011a aVar2, C19011a aVar3, int i) {
        this.f29161a = i;
        this.f29162b = aVar;
        this.f29163c = aVar2;
        this.f29164d = aVar3;
    }

    public final Object get() {
        switch (this.f29161a) {
            case 0:
                return new C13267q((Context) this.f29162b.get(), (C8890e0) this.f29163c.get(), (C12920a) this.f29164d.get());
            default:
                return new FormatterOverrides((C8694h) this.f29162b.get(), (C13886b) this.f29163c.get(), (C12673n) this.f29164d.get());
        }
    }
}
