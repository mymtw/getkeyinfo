package p487ya;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8919r;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;

/* renamed from: ya.a */
public final class C13895a {
    /* renamed from: a */
    public static File m21418a(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return C8919r.m17357b(context, str);
    }

    /* renamed from: b */
    public static String m21419b(String str, String str2) {
        C19383o.m32797g(str2, "extension");
        String d = C8919r.m17359d(str, str2);
        C19383o.m32796f(d, "getNewFilename(prefix, extension)");
        return d;
    }

    /* renamed from: c */
    public static boolean m21420c(String str) {
        try {
            String str2 = null;
            if (str != null) {
                Locale locale = Locale.ROOT;
                C19383o.m32796f(locale, "ROOT");
                str2 = str.toLowerCase(locale);
                C19383o.m32796f(str2, "this as java.lang.String).toLowerCase(locale)");
            }
            URL url = new URL(str2);
            String path = url.getPath();
            C19383o.m32796f(path, "u.path");
            if (!C19457k.m33018V0(path, ".jpg")) {
                String path2 = url.getPath();
                C19383o.m32796f(path2, "u.path");
                if (!C19457k.m33018V0(path2, ".jpeg")) {
                    String path3 = url.getPath();
                    C19383o.m32796f(path3, "u.path");
                    if (!C19457k.m33018V0(path3, ".png")) {
                        String path4 = url.getPath();
                        C19383o.m32796f(path4, "u.path");
                        return C19457k.m33018V0(path4, ".webp");
                    }
                }
            }
        } catch (MalformedURLException unused) {
        }
    }
}
