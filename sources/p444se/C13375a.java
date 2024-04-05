package p444se;

import android.net.Uri;
import com.appboy.Constants;
import kotlin.jvm.internal.C19383o;
import p478x9.C13860g;

/* renamed from: se.a */
public final class C13375a {

    /* renamed from: a */
    public final C13860g f29300a;

    public C13375a(C13860g gVar) {
        C19383o.m32797g(gVar, "deepLinkHostChecker");
        this.f29300a = gVar;
    }

    /* renamed from: a */
    public final boolean mo46057a(Uri uri, String str) {
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        if (!C19383o.m32792b(str, "external_url")) {
            return false;
        }
        String host = uri.getHost();
        return host != null ? this.f29300a.mo46684a(host) : false;
    }
}
