package p040c9;

import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.cart.C9420x;
import com.etsy.android.p327ui.cart.C9421y;
import com.etsy.android.p327ui.cart.bottomsheets.applycoupon.ApplyCouponBottomSheetFragment;
import com.etsy.android.p327ui.cart.bottomsheets.applycoupon.C9260e;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p456ua.C13461f;

/* renamed from: c9.n1 */
public final class C4635n1 implements C17550a {

    /* renamed from: b */
    public final C1993m f10433b;

    /* renamed from: c */
    public final C4579j1 f10434c;

    public C4635n1(C4579j1 j1Var, C1993m mVar) {
        this.f10434c = j1Var;
        this.f10433b = mVar;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        C13461f fVar = new C13461f();
        C1993m mVar = this.f10433b;
        C8731g gVar = (C8731g) this.f10434c.f10091D0.get();
        mVar.getClass();
        C19383o.m32797g(gVar, "configuredV3MoshiRetrofit");
        Object b = gVar.f19177a.mo74387b(C9421y.class);
        C19383o.m32796f(b, "configuredV3MoshiRetrofi…uestEndpoint::class.java)");
        ((ApplyCouponBottomSheetFragment) obj).viewModel = new C9260e(fVar, new C9420x(this.f10434c.f10204Z3.get(), (C9421y) b, this.f10434c.f10260j0.get(), this.f10434c.f10146O0.get()), this.f10434c.f10131L0.get());
    }
}
