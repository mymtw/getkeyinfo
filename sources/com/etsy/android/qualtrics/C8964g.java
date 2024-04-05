package com.etsy.android.qualtrics;

import androidx.compose.p015ui.text.input.C1993m;
import androidx.lifecycle.C2866i0;
import com.etsy.android.p327ui.favorites.add.C9753b0;
import com.etsy.android.p327ui.favorites.add.FavoriteAndCollectionRepository;
import com.etsy.android.p327ui.favorites.createalist.C9831q;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p456ua.C13461f;
import p456ua.C13462g;
import p740eq.C19011a;
import p772tq.C20203a;

/* renamed from: com.etsy.android.qualtrics.g */
public final class C8964g implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19765a;

    /* renamed from: b */
    public final C19011a f19766b;

    /* renamed from: c */
    public final C19011a f19767c;

    /* renamed from: d */
    public final Object f19768d;

    public /* synthetic */ C8964g(Object obj, C19011a aVar, int i) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f19765a = i;
        this.f19768d = obj;
        this.f19766b = aVar;
        this.f19767c = gVar;
    }

    /* renamed from: a */
    public final C2866i0 mo30566a() {
        switch (this.f19765a) {
            case 1:
                FavoriteAndCollectionRepository favoriteAndCollectionRepository = (FavoriteAndCollectionRepository) this.f19766b.get();
                C13461f fVar = (C13461f) this.f19767c.get();
                ((C19382n) this.f19768d).getClass();
                C19383o.m32797g(favoriteAndCollectionRepository, "repo");
                C19383o.m32797g(fVar, "schedulers");
                return new C9753b0(favoriteAndCollectionRepository, fVar);
            default:
                FavoriteAndCollectionRepository favoriteAndCollectionRepository2 = (FavoriteAndCollectionRepository) this.f19766b.get();
                C13461f fVar2 = (C13461f) this.f19767c.get();
                ((C1993m) this.f19768d).getClass();
                C19383o.m32797g(favoriteAndCollectionRepository2, "favAndCollectionRepo");
                C19383o.m32797g(fVar2, "schedulers");
                return new C9831q(favoriteAndCollectionRepository2, fVar2);
        }
    }

    public final Object get() {
        switch (this.f19765a) {
            case 0:
                C8950b bVar = (C8950b) this.f19766b.get();
                C13461f fVar = (C13461f) this.f19767c.get();
                ((C20203a) this.f19768d).getClass();
                C19383o.m32797g(bVar, "initializationLogic");
                C19383o.m32797g(fVar, "rxSchedulers");
                return new QualtricsWrapper(bVar, fVar);
            case 1:
                return mo30566a();
            default:
                return mo30566a();
        }
    }
}
