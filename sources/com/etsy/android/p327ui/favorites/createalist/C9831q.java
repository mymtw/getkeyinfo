package com.etsy.android.p327ui.favorites.createalist;

import androidx.lifecycle.C2866i0;
import com.etsy.android.p327ui.favorites.add.FavoriteAndCollectionRepository;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.subjects.C19254a;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.favorites.createalist.q */
public final class C9831q extends C2866i0 {

    /* renamed from: b */
    public final FavoriteAndCollectionRepository f21727b;

    /* renamed from: c */
    public final C13461f f21728c;

    /* renamed from: d */
    public C7091a f21729d = new C7091a();

    /* renamed from: e */
    public final C19254a<C9827p> f21730e = new C19254a<>();

    public C9831q(FavoriteAndCollectionRepository favoriteAndCollectionRepository, C13461f fVar) {
        this.f21727b = favoriteAndCollectionRepository;
        this.f21728c = fVar;
    }

    public final void onCleared() {
        this.f21729d.mo19405d();
        super.onCleared();
    }
}
