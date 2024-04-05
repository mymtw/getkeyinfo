package com.etsy.android.p327ui.user.help;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import java.util.List;
import kotlin.C19394m;
import p145io.reactivex.disposables.C7091a;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.user.help.c */
public final class C11530c extends C2866i0 {

    /* renamed from: b */
    public final C11529b f25433b;

    /* renamed from: c */
    public final C13461f f25434c;

    /* renamed from: d */
    public final C2895z<C19394m> f25435d = new C2895z<>();

    /* renamed from: e */
    public final C2895z<List<PhoneRegion>> f25436e = new C2895z<>();

    /* renamed from: f */
    public final C7091a f25437f = new C7091a();

    public C11530c(C11529b bVar, C13461f fVar) {
        this.f25433b = bVar;
        this.f25434c = fVar;
    }

    public final void onCleared() {
        this.f25437f.mo19405d();
    }
}
