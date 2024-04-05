package p486y9;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import p001a0.C0005b;
import p568fn.C17782b;

/* renamed from: y9.f */
public final class C13890f {

    /* renamed from: b */
    public static final List<String> f30557b = C17782b.m29865e0("GB", "CA", "AU", "IE", "IN", "NZ", "PK", "SG", "ZA");

    /* renamed from: c */
    public static final List<String> f30558c = C17782b.m29865e0("en", "fr", "de", "nl", "it", "es", "ja", "pl", "ru", "pt");

    /* renamed from: a */
    public final C13894i f30559a;

    public C13890f(C13894i iVar) {
        this.f30559a = iVar;
    }

    /* renamed from: b */
    public static Locale m21415b(Locale locale) {
        if (f30557b.contains(locale.getCountry())) {
            Locale locale2 = Locale.UK;
            C19383o.m32796f(locale2, "{\n            Locale.UK\n        }");
            return locale2;
        }
        Locale locale3 = Locale.US;
        C19383o.m32796f(locale3, "{\n            Locale.US\n        }");
        return locale3;
    }

    /* renamed from: a */
    public final Locale mo46720a(Context context) {
        Locale locale;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        if (C0005b.m38f0(context).getBoolean("match_device_locale", false)) {
            locale = this.f30559a.mo46712a();
        } else {
            String string = C0005b.m38f0(context).getString("preferred_language", (String) null);
            locale = string != null ? Locale.forLanguageTag(string) : null;
            if (locale == null) {
                locale = Locale.getDefault();
            }
        }
        String language = locale.getLanguage();
        C19383o.m32796f(language, "appLocale.language");
        String language2 = Locale.ENGLISH.getLanguage();
        C19383o.m32796f(language2, "ENGLISH.language");
        if (C19459m.m33036e1(language, language2, false) && !C19383o.m32792b(locale.getCountry(), Locale.US.getCountry()) && !C19383o.m32792b(locale.getCountry(), Locale.UK.getCountry())) {
            locale = m21415b(locale);
        }
        if (!f30558c.contains(locale.getLanguage())) {
            locale = Locale.US;
        }
        C19383o.m32796f(locale, "appLocale");
        return locale;
    }
}
