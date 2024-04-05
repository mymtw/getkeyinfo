package com.etsy.android.p327ui.favorites.add;

import androidx.lifecycle.C2866i0;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.subjects.C19254a;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.favorites.add.b0 */
public final class C9753b0 extends C2866i0 {

    /* renamed from: b */
    public final FavoriteAndCollectionRepository f21582b;

    /* renamed from: c */
    public final C13461f f21583c;

    /* renamed from: d */
    public C7091a f21584d = new C7091a();

    /* renamed from: e */
    public final C19254a<C9779q> f21585e = new C19254a<>();

    public C9753b0(FavoriteAndCollectionRepository favoriteAndCollectionRepository, C13461f fVar) {
        this.f21582b = favoriteAndCollectionRepository;
        this.f21583c = fVar;
    }

    public final void onCleared() {
        this.f21584d.mo19405d();
        super.onCleared();
    }
}
