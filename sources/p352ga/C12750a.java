package p352ga;

import androidx.activity.C0114h;
import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.perf.C8705b;
import com.etsy.android.lib.network.oauth2.signin.C8782j;
import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.p327ui.search.filters.refactor.C10836m;
import com.etsy.android.p327ui.search.filters.refactor.C10857u;
import com.etsy.android.p327ui.util.C11786n;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import p340ea.C12658b;
import p340ea.C12673n;
import p391le.C13016a;
import p391le.C13018b;
import p409o9.C13138q;
import p456ua.C13461f;
import p456ua.C13462g;
import p486y9.C13888d;
import p740eq.C19011a;

/* renamed from: ga.a */
public final class C12750a implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f28194a = 0;

    /* renamed from: b */
    public final C19011a f28195b;

    /* renamed from: c */
    public final C19011a f28196c;

    /* renamed from: d */
    public final C19011a f28197d;

    /* renamed from: e */
    public final C19011a f28198e;

    /* renamed from: f */
    public final C19011a f28199f;

    /* renamed from: g */
    public final Object f28200g;

    public C12750a(C0114h hVar, C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f28200g = hVar;
        this.f28195b = gVar;
        this.f28196c = aVar;
        this.f28197d = aVar2;
        this.f28198e = aVar3;
        this.f28199f = aVar4;
    }

    public final Object get() {
        switch (this.f28194a) {
            case 0:
                C13461f fVar = (C13461f) this.f28195b.get();
                C12658b bVar = (C12658b) this.f28196c.get();
                C13138q qVar = (C13138q) this.f28197d.get();
                C8890e0 e0Var = (C8890e0) this.f28198e.get();
                C8694h hVar = (C8694h) this.f28199f.get();
                ((C0114h) this.f28200g).getClass();
                C19383o.m32797g(fVar, "schedulers");
                C19383o.m32797g(bVar, "logDao");
                C19383o.m32797g(qVar, "installInfo");
                C19383o.m32797g(e0Var, "systemTime");
                C19383o.m32797g(hVar, "logCat");
                return new C12673n(fVar, bVar, qVar, e0Var, hVar);
            default:
                return new C10857u((C11786n) this.f28195b.get(), (C8630b) this.f28196c.get(), (C8629a) this.f28197d.get(), (C13888d) this.f28198e.get(), (C13016a) this.f28199f.get(), (C10836m) ((C19011a) this.f28200g).get());
        }
    }

    public C12750a(C8782j jVar, C19011a aVar, C19011a aVar2, C19011a aVar3, C8705b bVar) {
        C13018b bVar2 = C13018b.C13019a.f28673a;
        this.f28195b = jVar;
        this.f28196c = aVar;
        this.f28197d = aVar2;
        this.f28198e = aVar3;
        this.f28199f = bVar2;
        this.f28200g = bVar;
    }
}
