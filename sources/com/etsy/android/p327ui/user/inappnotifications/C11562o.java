package com.etsy.android.p327ui.user.inappnotifications;

import androidx.lifecycle.C2842a;
import androidx.lifecycle.C2895z;
import com.etsy.android.BOEApplication;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.p327ui.favorites.C9859l;
import com.etsy.android.p327ui.util.C11780h;
import p145io.reactivex.disposables.C7091a;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.user.inappnotifications.o */
public final class C11562o extends C2842a {

    /* renamed from: b */
    public final C8672b f25608b;

    /* renamed from: c */
    public final C13461f f25609c;

    /* renamed from: d */
    public final C11554h f25610d;

    /* renamed from: e */
    public final C11780h f25611e;

    /* renamed from: f */
    public final C9859l f25612f;

    /* renamed from: g */
    public C7091a f25613g = new C7091a();

    /* renamed from: h */
    public final C2895z<C11544b0> f25614h = new C2895z<>();

    public C11562o(BOEApplication bOEApplication, C8672b bVar, C13461f fVar, C11554h hVar, C11780h hVar2, C11541a0 a0Var, C9859l lVar) {
        super(bOEApplication);
        this.f25608b = bVar;
        this.f25609c = fVar;
        this.f25610d = hVar;
        this.f25611e = hVar2;
        this.f25612f = lVar;
    }

    public final void onCleared() {
        super.onCleared();
        this.f25613g.mo19405d();
    }
}
