package p319ca;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p486y9.C13885a;
import p486y9.C13890f;

/* renamed from: ca.c */
public class C8562c {

    /* renamed from: a */
    public static final C13890f f18643a = new C13890f(new C13885a());

    /* renamed from: ca.c$a */
    public static final class C8563a {

        /* renamed from: a */
        public final Configuration f18644a;

        /* renamed from: b */
        public final boolean f18645b;

        public C8563a(Configuration configuration, boolean z) {
            this.f18644a = configuration;
            this.f18645b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8563a)) {
                return false;
            }
            C8563a aVar = (C8563a) obj;
            return C19383o.m32792b(this.f18644a, aVar.f18644a) && this.f18645b == aVar.f18645b;
        }

        public final int hashCode() {
            int hashCode = this.f18644a.hashCode() * 31;
            boolean z = this.f18645b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("LocalizedConfigurationWrapper(configuration=");
            h.append(this.f18644a);
            h.append(", isNewConfiguration=");
            return C0391c.m1058d(h, this.f18645b, ')');
        }
    }

    /* renamed from: a */
    public static C8563a m16969a(Context context, Configuration configuration) {
        Locale locale = configuration.getLocales().get(0);
        if (locale == null) {
            locale = Locale.getDefault();
            C19383o.m32796f(locale, "getDefault()");
        }
        Locale a = f18643a.mo46720a(context);
        if (C19457k.m33019W0(locale.toString(), a.toString(), true)) {
            return new C8563a(configuration, false);
        }
        LocaleList localeList = new LocaleList(new Locale[]{a});
        LocaleList.setDefault(localeList);
        Configuration configuration2 = new Configuration(configuration);
        configuration2.setLocale(a);
        configuration2.setLocales(localeList);
        return new C8563a(configuration2, true);
    }

    /* renamed from: b */
    public static Context m16970b(Context context) {
        C19383o.m32797g(context, "baseContext");
        Configuration configuration = context.getResources().getConfiguration();
        C19383o.m32796f(configuration, "baseContext.resources.configuration");
        C8563a a = m16969a(context, configuration);
        if (!a.f18645b) {
            return context;
        }
        Context createConfigurationContext = context.createConfigurationContext(a.f18644a);
        C19383o.m32796f(createConfigurationContext, "{\n            baseContex….configuration)\n        }");
        return createConfigurationContext;
    }

    /* renamed from: c */
    public static Resources m16971c(Context context, Resources resources) {
        C19383o.m32797g(context, "baseContext");
        Configuration configuration = resources.getConfiguration();
        C19383o.m32796f(configuration, "baseResources.configuration");
        C8563a a = m16969a(context, configuration);
        if (!a.f18645b) {
            return resources;
        }
        Resources resources2 = context.createConfigurationContext(a.f18644a).getResources();
        C19383o.m32796f(resources2, "{\n            baseContex…tion).resources\n        }");
        return resources2;
    }
}
