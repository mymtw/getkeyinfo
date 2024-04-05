package p581hk;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;

/* renamed from: hk.c */
public final class C17823c {

    /* renamed from: a */
    public static final C17822b f38729a;

    /* renamed from: b */
    public static final Api<C17821a> f38730b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        Api.ClientKey clientKey2 = new Api.ClientKey();
        C17822b bVar = new C17822b();
        f38729a = bVar;
        C17825e eVar = new C17825e();
        new Scope(Scopes.PROFILE);
        new Scope("email");
        f38730b = new Api<>("SignIn.API", bVar, clientKey);
        new Api("SignIn.INTERNAL_API", eVar, clientKey2);
    }
}
