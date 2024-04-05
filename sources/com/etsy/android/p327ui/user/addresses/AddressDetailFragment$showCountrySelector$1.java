package com.etsy.android.p327ui.user.addresses;

import android.os.Bundle;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.user.addresses.AddressDetailFragment$showCountrySelector$1 */
public final class AddressDetailFragment$showCountrySelector$1 extends Lambda implements C19861p<String, Bundle, C19394m> {
    public final /* synthetic */ AddressDetailFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressDetailFragment$showCountrySelector$1(AddressDetailFragment addressDetailFragment) {
        super(2);
        this.this$0 = addressDetailFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (Bundle) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(String str, Bundle bundle) {
        C19383o.m32797g(str, "requestKey");
        C19383o.m32797g(bundle, "bundle");
        if (C19383o.m32792b(str, "REQUEST_COUNTRY_SELECTED")) {
            int i = bundle.getInt("KEY_SELECTED_COUNTRY_ID", 0);
            String string = bundle.getString("KEY_SELECTED_COUNTRY_NAME", "");
            AddressDetailViewModel viewModel = this.this$0.getViewModel();
            C11425l lVar = viewModel.f25055g;
            lVar.f25199b = "";
            lVar.f25200c = "";
            lVar.f25201d = "";
            lVar.f25202e = "";
            lVar.f25203f = "";
            lVar.f25204g = "";
            lVar.f25205h = 0;
            lVar.f25206i = "";
            lVar.f25207j = Boolean.FALSE;
            viewModel.f25058j = null;
            viewModel.f25055g.f25205h = Integer.valueOf(i);
            viewModel.mo37150b(Integer.valueOf(i), string, viewModel.f25059k);
        }
    }
}
