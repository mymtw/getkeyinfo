package com.etsy.android.p327ui.user.addresses;

import com.etsy.android.p327ui.user.addresses.C11445t;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.AddressListPresenter$loadAddresses$2 */
public final class AddressListPresenter$loadAddresses$2 extends Lambda implements C19857l<C11445t, C19394m> {
    public final /* synthetic */ AddressListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressListPresenter$loadAddresses$2(AddressListPresenter addressListPresenter) {
        super(1);
        this.this$0 = addressListPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11445t) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C11445t tVar) {
        C11452u uVar;
        C11452u uVar2;
        boolean z = true;
        if (tVar instanceof C11445t.C11450e) {
            List<AddressItemUI> list = this.this$0.f25097f;
            if (list != null && !list.isEmpty()) {
                z = false;
            }
            if (z && (uVar2 = this.this$0.f25093b) != null) {
                uVar2.showLoader();
            }
        } else if (tVar instanceof C11445t.C11451f) {
            AddressListPresenter addressListPresenter = this.this$0;
            addressListPresenter.f25096e = false;
            List<AddressItemUI> list2 = ((C11445t.C11451f) tVar).f25270a;
            addressListPresenter.f25097f = list2;
            C11452u uVar3 = addressListPresenter.f25093b;
            if (uVar3 != null) {
                uVar3.showAddresses(list2);
            }
        } else if (tVar instanceof C11445t.C11448c) {
            AddressListPresenter addressListPresenter2 = this.this$0;
            addressListPresenter2.f25096e = true;
            C11452u uVar4 = addressListPresenter2.f25093b;
            if (uVar4 != null) {
                uVar4.showEmptyState();
            }
        } else if (tVar instanceof C11445t.C11449d) {
            C11452u uVar5 = this.this$0.f25093b;
            if (uVar5 != null) {
                uVar5.showErrorState();
            }
        } else if (C19383o.m32792b(tVar, C11445t.C11447b.f25267a)) {
            C11452u uVar6 = this.this$0.f25093b;
            if (uVar6 != null) {
                uVar6.onAddressDeleteSuccess();
            }
        } else if ((tVar instanceof C11445t.C11446a) && (uVar = this.this$0.f25093b) != null) {
            uVar.onAddressDeleteFailure(((C11445t.C11446a) tVar).f25266a);
        }
    }
}
