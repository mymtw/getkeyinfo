package p350fe;

import android.content.Context;
import android.net.Uri;
import com.appboy.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p478x9.C13860g;
import p478x9.C13861h;

/* renamed from: fe.o */
public final class C12741o {

    /* renamed from: a */
    public final C13861h f28147a;

    /* renamed from: b */
    public final C13860g f28148b;

    /* renamed from: c */
    public final C12742p f28149c;

    public C12741o(C13861h hVar, C13860g gVar, C12742p pVar) {
        C19383o.m32797g(hVar, "deepLinkSchemeChecker");
        C19383o.m32797g(gVar, "deepLinkHostChecker");
        C19383o.m32797g(pVar, "uriResolver");
        this.f28147a = hVar;
        this.f28148b = gVar;
        this.f28149c = pVar;
    }

    /* renamed from: c */
    public static HashMap m20403c(Uri uri) {
        HashMap hashMap = new HashMap();
        if (uri != null) {
            for (String next : uri.getQueryParameterNames()) {
                String queryParameter = uri.getQueryParameter(next);
                if (queryParameter == null) {
                    queryParameter = "";
                }
                hashMap.put(next, queryParameter);
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    public static String m20404d(Uri uri, String str) {
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        return uri.getQueryParameter(str);
    }

    /* renamed from: a */
    public final boolean mo45508a(Context context, Uri uri) {
        if (this.f28147a.mo46686a(uri.getScheme())) {
            return true;
        }
        if (this.f28147a.mo46687b(uri.getScheme())) {
            String host = uri.getHost();
            if (host == null) {
                host = "";
            }
            if (this.f28148b.mo46684a(host) || this.f28148b.mo46685b(host)) {
                this.f28149c.getClass();
                return C12742p.m20408a(context, uri);
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo45509b(Uri uri, String str) {
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        C19383o.m32797g(str, "segmentName");
        List<String> pathSegments = uri.getPathSegments();
        C19383o.m32796f(pathSegments, "uri.pathSegments");
        ArrayList q1 = C19327t.m32661q1(pathSegments);
        if (this.f28147a.mo46686a(uri.getScheme())) {
            q1.add(0, uri.getHost());
        }
        return q1.contains(str);
    }

    /* renamed from: e */
    public final String mo45510e(Uri uri, String str) {
        int i;
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        C19383o.m32797g(str, "name");
        List<String> pathSegments = uri.getPathSegments();
        C19383o.m32796f(pathSegments, "uri.pathSegments");
        ArrayList q1 = C19327t.m32661q1(pathSegments);
        int i2 = 0;
        if (this.f28147a.mo46686a(uri.getScheme())) {
            q1.add(0, uri.getHost());
        }
        Iterator it = q1.iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            Locale locale = Locale.ROOT;
            String lowerCase = ((String) it.next()).toLowerCase(locale);
            C19383o.m32796f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String lowerCase2 = str.toLowerCase(locale);
            C19383o.m32796f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (C19383o.m32792b(lowerCase, lowerCase2)) {
                break;
            }
            i2++;
        }
        int size = q1.size();
        if (i2 == -1 || (i = i2 + 1) >= size) {
            return null;
        }
        return (String) q1.get(i);
    }
}
