package p564fj;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Api;
import p588ij.C17844c;

/* renamed from: fj.a */
public final class C17737a {

    /* renamed from: a */
    public static final Api<GoogleSignInOptions> f38568a;

    /* renamed from: b */
    public static final C17844c f38569b = new C17844c();

    @Deprecated
    /* renamed from: fj.a$a */
    public static class C17738a implements Api.ApiOptions.Optional {

        /* renamed from: b */
        public final boolean f38570b;

        @Deprecated
        /* renamed from: fj.a$a$a */
        public static class C17739a {

            /* renamed from: a */
            public Boolean f38571a = Boolean.FALSE;
        }

        static {
            new C17738a(new C17739a());
        }

        public C17738a(C17739a aVar) {
            this.f38570b = aVar.f38571a.booleanValue();
        }
    }

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        Api.ClientKey clientKey2 = new Api.ClientKey();
        C17743e eVar = new C17743e();
        C17744f fVar = new C17744f();
        Api<C17741c> api = C17740b.f38572a;
        new Api("Auth.CREDENTIALS_API", eVar, clientKey);
        f38568a = new Api<>("Auth.GOOGLE_SIGN_IN_API", fVar, clientKey2);
    }
}
