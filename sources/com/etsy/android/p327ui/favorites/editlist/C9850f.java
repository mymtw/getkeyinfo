package com.etsy.android.p327ui.favorites.editlist;

import androidx.lifecycle.C2866i0;
import com.etsy.android.lib.network.oauth2.signin.C8782j;
import com.etsy.android.p327ui.favorites.C9852g;
import com.etsy.android.p327ui.favorites.C9901z;
import com.etsy.android.p327ui.util.C11786n;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p084d9.C6672b;
import p456ua.C13461f;
import p456ua.C13462g;
import p470w9.C13795c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.favorites.editlist.f */
public final class C9850f implements C17555d<C2866i0> {

    /* renamed from: a */
    public final C19382n f21751a;

    /* renamed from: b */
    public final C19011a<C9852g> f21752b;

    /* renamed from: c */
    public final C19011a<C13461f> f21753c;

    /* renamed from: d */
    public final C19011a<C9901z> f21754d;

    /* renamed from: e */
    public final C19011a<C11786n> f21755e;

    public C9850f(C19382n nVar, C6672b bVar, C13795c cVar, C8782j jVar) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f21751a = nVar;
        this.f21752b = bVar;
        this.f21753c = gVar;
        this.f21754d = cVar;
        this.f21755e = jVar;
    }

    public final Object get() {
        C19382n nVar = this.f21751a;
        C9852g gVar = this.f21752b.get();
        C13461f fVar = this.f21753c.get();
        C9901z zVar = this.f21754d.get();
        C11786n nVar2 = this.f21755e.get();
        nVar.getClass();
        C19383o.m32797g(gVar, "deleteCollectionRepository");
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(zVar, "updateCollectionsRepository");
        C19383o.m32797g(nVar2, "resourceProvider");
        return new EditCollectionViewModel(fVar, gVar, zVar, nVar2);
    }
}
