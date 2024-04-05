package com.etsy.android.p327ui.user.privacy;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.util.NotificationLite;
import p340ea.C12673n;
import p418pa.C13198d;
import p418pa.C13203e;
import p456ua.C13461f;
import p772tq.C20203a;

/* renamed from: com.etsy.android.ui.user.privacy.b */
public final class C11622b extends C2866i0 {

    /* renamed from: b */
    public final C13198d f25724b;

    /* renamed from: c */
    public final C13461f f25725c;

    /* renamed from: d */
    public final C12673n f25726d;

    /* renamed from: e */
    public final C7091a f25727e;

    /* renamed from: f */
    public final C2895z<C13203e> f25728f = new C2895z<>();

    /* renamed from: g */
    public final C20203a f25729g = new C20203a();

    public C11622b(C13198d dVar, C13461f fVar, C12673n nVar) {
        C19383o.m32797g(dVar, "privacyRepository");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(nVar, "elkLogger");
        this.f25724b = dVar;
        this.f25725c = fVar;
        this.f25726d = nVar;
        C7091a aVar = new C7091a();
        this.f25727e = aVar;
        Object obj = dVar.f29034d.f43101b.get();
        if (!(obj != null && !NotificationLite.isComplete(obj) && !NotificationLite.isError(obj))) {
            dVar.mo45907a(aVar);
        }
    }

    public final void onCleared() {
        super.onCleared();
        this.f25727e.mo19405d();
    }
}
