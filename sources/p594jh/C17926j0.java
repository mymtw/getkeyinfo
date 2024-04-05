package p594jh;

import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import p513bj.C14083w;
import p594jh.C17904d1;

/* renamed from: jh.j0 */
public final class C17926j0 implements C17904d1.C17905a {

    /* renamed from: a */
    public final /* synthetic */ C17931k0 f39017a;

    public C17926j0(C17931k0 k0Var) {
        this.f39017a = k0Var;
    }

    /* renamed from: a */
    public final void mo69370a() {
        ((C14083w) this.f39017a.f39058h).mo46950c(2);
    }

    /* renamed from: b */
    public final void mo69371b(long j) {
        if (j >= NetworkRetryInterceptor.DEFAULT_RETRY_DELAY) {
            this.f39017a.f39044H = true;
        }
    }
}
