package p412oc;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import p486y9.C13888d;

/* renamed from: oc.a */
public final class C13149a {

    /* renamed from: a */
    public final C8618c f28919a;

    /* renamed from: b */
    public final C13888d f28920b;

    public C13149a(C8618c cVar, C13888d dVar) {
        C19383o.m32797g(dVar, "currentLocale");
        this.f28919a = cVar;
        this.f28920b = dVar;
    }

    /* renamed from: a */
    public final boolean mo45857a() {
        return this.f28919a.mo21132b(C8592b.C8598f.f18880j) && C19383o.m32792b(Locale.ENGLISH.getLanguage(), this.f28920b.mo46718b().getLanguage());
    }
}
