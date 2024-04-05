package p334da;

import com.etsy.android.config.flags.C6381j;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.p327ui.user.help.C11529b;
import com.etsy.android.p327ui.user.help.C11530c;
import com.google.android.play.core.assetpacks.C15588c1;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import p040c9.C4591k;
import p366ia.C12920a;
import p456ua.C13461f;
import p456ua.C13462g;
import p740eq.C19011a;

/* renamed from: da.e */
public final class C12635e implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f27865a = 1;

    /* renamed from: b */
    public final C19011a f27866b;

    /* renamed from: c */
    public final C19011a f27867c;

    /* renamed from: d */
    public final Object f27868d;

    public C12635e(C15588c1 c1Var, C6381j jVar) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f27868d = c1Var;
        this.f27866b = jVar;
        this.f27867c = gVar;
    }

    public final Object get() {
        switch (this.f27865a) {
            case 0:
                return new C12633d((C12639h) this.f27866b.get(), (C12920a) this.f27867c.get(), (C8618c) ((C19011a) this.f27868d).get());
            default:
                C11529b bVar = (C11529b) this.f27866b.get();
                C13461f fVar = (C13461f) this.f27867c.get();
                ((C15588c1) this.f27868d).getClass();
                C19383o.m32797g(bVar, "helpPhoneNumbersRepository");
                C19383o.m32797g(fVar, "rxSchedulers");
                return new C11530c(bVar, fVar);
        }
    }

    public C12635e(C19011a aVar, C19011a aVar2, C4591k kVar) {
        this.f27866b = aVar;
        this.f27867c = aVar2;
        this.f27868d = kVar;
    }
}
