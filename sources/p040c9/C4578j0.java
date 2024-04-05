package p040c9;

import com.etsy.android.config.flags.C6381j;
import com.etsy.android.p327ui.user.addresses.AddressListFragment;
import com.etsy.android.p327ui.user.addresses.AddressListPresenter;
import com.etsy.android.p327ui.user.addresses.C11461x;
import dagger.android.C17550a;
import p456ua.C13461f;

/* renamed from: c9.j0 */
public final class C4578j0 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10073b;

    /* renamed from: c */
    public C11461x f10074c;

    public C4578j0(C4579j1 j1Var) {
        this.f10073b = j1Var;
        this.f10074c = new C11461x(new C4493d(new C6381j(j1Var.f10091D0, 6), 10), j1Var.f10298q0, j1Var.f10308s0);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        AddressListFragment addressListFragment = (AddressListFragment) obj;
        addressListFragment.presenter = new AddressListPresenter(new C13461f());
        addressListFragment.configMap = this.f10073b.mo14404m();
        addressListFragment.viewModelProvider = this.f10074c;
    }
}
