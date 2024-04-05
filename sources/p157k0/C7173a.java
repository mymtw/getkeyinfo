package p157k0;

import java.util.Locale;
import kotlin.jvm.internal.C19383o;

/* renamed from: k0.a */
public final class C7173a implements C7177d {

    /* renamed from: a */
    public final Locale f15949a;

    public C7173a(Locale locale) {
        this.f15949a = locale;
    }

    /* renamed from: a */
    public final String mo19464a() {
        String languageTag = this.f15949a.toLanguageTag();
        C19383o.m32796f(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }
}
