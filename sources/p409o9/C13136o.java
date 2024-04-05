package p409o9;

import android.content.Context;
import androidx.activity.C0114h;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.logger.C8674c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.util.C8890e0;
import dagger.internal.C17553b;
import dagger.internal.C17554c;
import dagger.internal.C17555d;
import java.util.Random;
import kotlin.jvm.internal.C19383o;
import p340ea.C12673n;
import p346fa.C12703a;
import p456ua.C13461f;
import p456ua.C13462g;
import p740eq.C19011a;

/* renamed from: o9.o */
public final class C13136o implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f28887a = 1;

    /* renamed from: b */
    public final C19011a f28888b;

    /* renamed from: c */
    public final C19011a f28889c;

    /* renamed from: d */
    public final C19011a f28890d;

    /* renamed from: e */
    public final C19011a f28891e;

    /* renamed from: f */
    public final C19011a f28892f;

    /* renamed from: g */
    public final Object f28893g;

    public C13136o(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, C19011a aVar5) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f28888b = aVar;
        this.f28889c = aVar2;
        this.f28890d = aVar3;
        this.f28891e = aVar4;
        this.f28892f = aVar5;
        this.f28893g = gVar;
    }

    public final Object get() {
        switch (this.f28887a) {
            case 0:
                return new C8591a((Context) this.f28888b.get(), (C13135n) this.f28889c.get(), (C13138q) this.f28890d.get(), (C8674c) this.f28891e.get(), C17554c.m29426a(this.f28892f), (C13461f) ((C19011a) this.f28893g).get());
            default:
                EtsyApplication etsyApplication = (EtsyApplication) this.f28888b.get();
                C8890e0 e0Var = (C8890e0) this.f28889c.get();
                C8591a aVar = (C8591a) this.f28890d.get();
                C12673n nVar = (C12673n) this.f28891e.get();
                C8694h hVar = (C8694h) this.f28892f.get();
                ((C0114h) this.f28893g).getClass();
                C19383o.m32797g(etsyApplication, "application");
                C19383o.m32797g(e0Var, "time");
                C19383o.m32797g(aVar, "config");
                C19383o.m32797g(nVar, "elkLogger");
                C19383o.m32797g(hVar, "logCat");
                return new C12703a(etsyApplication, e0Var, aVar, nVar, hVar, new Random());
        }
    }

    public C13136o(C0114h hVar, C19011a aVar, C19011a aVar2, C17553b bVar, C19011a aVar3, C19011a aVar4) {
        this.f28893g = hVar;
        this.f28888b = aVar;
        this.f28889c = aVar2;
        this.f28890d = bVar;
        this.f28891e = aVar3;
        this.f28892f = aVar4;
    }
}
