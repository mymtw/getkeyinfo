package p030bo.app;

import android.net.Uri;
import com.appboy.Constants;
import java.net.URL;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.s4 */
public final class C4179s4 {

    /* renamed from: a */
    private final String f9277a;

    /* renamed from: b */
    private final Uri f9278b;

    /* renamed from: c */
    private final URL f9279c;

    public C4179s4(Uri uri) {
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        this.f9278b = uri;
        String uri2 = uri.toString();
        C19383o.m32796f(uri2, "uri.toString()");
        this.f9277a = uri2;
        this.f9279c = new URL(uri2);
    }

    /* renamed from: a */
    public final Uri mo14060a() {
        return this.f9278b;
    }

    /* renamed from: b */
    public final URL mo14061b() {
        return this.f9279c;
    }

    public String toString() {
        return this.f9277a;
    }

    public C4179s4(String str) {
        C19383o.m32797g(str, "urlString");
        Uri parse = Uri.parse(str);
        C19383o.m32796f(parse, "parse(urlString)");
        this.f9278b = parse;
        this.f9277a = str;
        this.f9279c = new URL(str);
    }
}
