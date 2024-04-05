package p486y9;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;

/* renamed from: y9.d */
public final class C13888d {

    /* renamed from: a */
    public final Context f30555a;

    /* renamed from: b */
    public final C13890f f30556b;

    public C13888d(Context context, C13890f fVar) {
        this.f30555a = context;
        this.f30556b = fVar;
    }

    /* renamed from: a */
    public final String mo46717a() {
        C13890f fVar = this.f30556b;
        Context context = this.f30555a;
        fVar.getClass();
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Locale a = fVar.mo46720a(context);
        if (C19383o.m32792b(a, Locale.US) || C19383o.m32792b(a, Locale.UK)) {
            String languageTag = a.toLanguageTag();
            C19383o.m32796f(languageTag, "{\n            appLocale.toLanguageTag()\n        }");
            return languageTag;
        }
        String language = a.getLanguage();
        C19383o.m32796f(language, "{\n            appLocale.language\n        }");
        return language;
    }

    /* renamed from: b */
    public final Locale mo46718b() {
        return this.f30556b.mo46720a(this.f30555a);
    }

    /* renamed from: c */
    public final Locale mo46719c() {
        return this.f30556b.f30559a.mo46712a();
    }
}
