package com.etsy.android.p327ui.favorites.createalist;

import androidx.lifecycle.C2866i0;
import com.etsy.android.p327ui.util.C11780h;
import java.util.ArrayList;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.subjects.C19254a;
import p425q9.C13265p;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.favorites.createalist.g */
public final class C9815g extends C2866i0 {

    /* renamed from: b */
    public final C11780h f21704b;

    /* renamed from: c */
    public final C13461f f21705c;

    /* renamed from: d */
    public final C13265p f21706d;

    /* renamed from: e */
    public int f21707e;

    /* renamed from: f */
    public final ArrayList f21708f = new ArrayList();

    /* renamed from: g */
    public final C19254a<C9810f> f21709g = new C19254a<>();

    /* renamed from: h */
    public C7091a f21710h = new C7091a();

    /* renamed from: i */
    public boolean f21711i;

    public C9815g(C13265p pVar, C13461f fVar, C11780h hVar) {
        this.f21704b = hVar;
        this.f21705c = fVar;
        this.f21706d = pVar;
    }

    public final void onCleared() {
        this.f21709g.onComplete();
        this.f21710h.mo19405d();
        this.f21708f.clear();
        super.onCleared();
    }
}
