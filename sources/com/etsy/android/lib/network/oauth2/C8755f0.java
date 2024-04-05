package com.etsy.android.lib.network.oauth2;

import com.facebook.login.LoginFragment;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19446a;
import okhttp3.C19928a0;
import okhttp3.C19932b0;
import okhttp3.C20000q;
import okhttp3.C20002r;
import okhttp3.C20011u;
import okhttp3.C20018z;
import okhttp3.Protocol;
import p346fa.C12703a;
import p425q9.C13272v;
import p634np.C18289a;
import p739dr.C19006f;
import p756lr.C19893f;
import p756lr.C19897i;

/* renamed from: com.etsy.android.lib.network.oauth2.f0 */
public final class C8755f0 implements C20000q {

    /* renamed from: b */
    public final C18289a<C13272v> f19249b;

    /* renamed from: c */
    public final C12703a f19250c;

    /* renamed from: d */
    public final JsonAdapter<OAuth2ErrorResponse> f19251d = new C17414y(new C17414y.C17415a()).mo68556a(OAuth2ErrorResponse.class);

    public C8755f0(C18289a<C13272v> aVar, C12703a aVar2) {
        C19383o.m32797g(aVar, "signOutCoordinator");
        C19383o.m32797g(aVar2, "grafana");
        this.f19249b = aVar;
        this.f19250c = aVar2;
    }

    /* renamed from: a */
    public static C20018z m17166a(C20011u uVar, String str, String str2) {
        C20018z.C20019a aVar = new C20018z.C20019a();
        C19383o.m32797g(uVar, LoginFragment.EXTRA_REQUEST);
        aVar.f44375a = uVar;
        Protocol protocol = Protocol.HTTP_2;
        C19383o.m32797g(protocol, "protocol");
        aVar.f44376b = protocol;
        aVar.f44377c = 999;
        aVar.f44378d = str;
        C19928a0.f43959c.getClass();
        C19383o.m32797g(str2, "$this$toResponseBody");
        Charset charset = C19446a.f43373b;
        C19893f fVar = new C19893f();
        C19383o.m32797g(charset, "charset");
        fVar.mo72713E0(str2, 0, str2.length(), charset);
        aVar.f44381g = new C19932b0((C20002r) null, fVar.f43876c, fVar);
        return aVar.mo73008a();
    }

    public final C20018z intercept(C20000q.C20001a aVar) {
        C20011u uVar = ((C19006f) aVar).f42351f;
        try {
            C20018z a = ((C19006f) aVar).mo70453a(uVar);
            C19932b0 R = C19382n.m32730R(a);
            int i = a.f44365f;
            OAuth2ErrorResponse oAuth2ErrorResponse = null;
            if (i == 400) {
                if (R != null) {
                    C19897i iVar = R.f43966d;
                    if (iVar != null) {
                        oAuth2ErrorResponse = this.f19251d.fromJson(iVar);
                    }
                }
                if (oAuth2ErrorResponse != null && C19383o.m32792b(oAuth2ErrorResponse.f19200a, "invalid_grant")) {
                    this.f19250c.mo45475b("TokenRevokedInterceptor.InvalidGrant", 0.01d);
                    this.f19249b.get().mo45956a();
                }
            } else if (i == 401) {
                if (R != null) {
                    C19897i iVar2 = R.f43966d;
                    if (iVar2 != null) {
                        oAuth2ErrorResponse = this.f19251d.fromJson(iVar2);
                    }
                }
                if (oAuth2ErrorResponse == null) {
                    return a;
                }
                if (C19383o.m32792b(oAuth2ErrorResponse.f19200a, "Unrecognized Access Token") || C19383o.m32792b(oAuth2ErrorResponse.f19200a, "invalid_token")) {
                    this.f19250c.mo45475b("TokenRevokedInterceptor.InvalidOrUnrecognizedToken", 0.01d);
                    this.f19249b.get().mo45956a();
                }
            }
            return a;
        } catch (SocketTimeoutException e) {
            return m17166a(uVar, "Timeout - Please check your internet connection", e.toString());
        } catch (UnknownHostException e2) {
            return m17166a(uVar, "Unable to make a connection. Please check your internet", e2.toString());
        }
    }
}
