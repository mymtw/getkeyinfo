package p613lk;

import android.accounts.Account;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* renamed from: lk.c */
public final class C18193c {

    /* renamed from: a */
    public static final Api<C18194a> f39838a = new Api<>("Wallet.API", new C18198f(), new Api.ClientKey());

    /* renamed from: lk.c$a */
    public static final class C18194a implements Api.ApiOptions.HasAccountOptions {

        /* renamed from: b */
        public final int f39839b;

        /* renamed from: c */
        public final boolean f39840c;

        /* renamed from: lk.c$a$a */
        public static final class C18195a {

            /* renamed from: a */
            public int f39841a = 3;
        }

        public C18194a() {
            this(new C18195a());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C18194a)) {
                return false;
            }
            C18194a aVar = (C18194a) obj;
            return Objects.equal(Integer.valueOf(this.f39839b), Integer.valueOf(aVar.f39839b)) && Objects.equal(0, 0) && Objects.equal((Object) null, (Object) null) && Objects.equal(Boolean.valueOf(this.f39840c), Boolean.valueOf(aVar.f39840c));
        }

        public final Account getAccount() {
            return null;
        }

        public final int hashCode() {
            return Objects.hashCode(Integer.valueOf(this.f39839b), 0, null, Boolean.valueOf(this.f39840c));
        }

        public C18194a(C18195a aVar) {
            this.f39839b = aVar.f39841a;
            this.f39840c = true;
        }
    }
}
