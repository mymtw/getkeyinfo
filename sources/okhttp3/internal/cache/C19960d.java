package okhttp3.internal.cache;

import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.login.LoginFragment;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19941d;
import okhttp3.C19994o;
import okhttp3.C20011u;
import okhttp3.C20018z;

/* renamed from: okhttp3.internal.cache.d */
public final class C19960d {

    /* renamed from: a */
    public final C20011u f44113a;

    /* renamed from: b */
    public final C20018z f44114b;

    /* renamed from: okhttp3.internal.cache.d$a */
    public static final class C19961a {
        /* renamed from: a */
        public static boolean m34139a(C20011u uVar, C20018z zVar) {
            C19383o.m32797g(zVar, ResponseConstants.RESPONSE);
            C19383o.m32797g(uVar, LoginFragment.EXTRA_REQUEST);
            int i = zVar.f44365f;
            if (!(i == 200 || i == 410 || i == 414 || i == 501 || i == 203 || i == 204)) {
                if (i != 307) {
                    if (!(i == 308 || i == 404 || i == 405)) {
                        switch (i) {
                            case NOTICE_VALUE:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (C20018z.m34284b(zVar, "Expires") == null && zVar.mo73004a().f44002c == -1 && !zVar.mo73004a().f44005f && !zVar.mo73004a().f44004e) {
                    return false;
                }
            }
            if (zVar.mo73004a().f44001b) {
                return false;
            }
            C19941d dVar = uVar.f44341a;
            if (dVar == null) {
                C19941d.C19943b bVar = C19941d.f43999o;
                C19994o oVar = uVar.f44344d;
                bVar.getClass();
                dVar = C19941d.C19943b.m34097a(oVar);
                uVar.f44341a = dVar;
            }
            return !dVar.f44001b;
        }
    }

    public C19960d(C20011u uVar, C20018z zVar) {
        this.f44113a = uVar;
        this.f44114b = zVar;
    }
}
