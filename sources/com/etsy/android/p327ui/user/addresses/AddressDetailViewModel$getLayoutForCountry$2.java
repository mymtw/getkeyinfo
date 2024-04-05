package com.etsy.android.p327ui.user.addresses;

import androidx.lifecycle.C2895z;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.user.addresses.AddressDetailViewModel;
import com.etsy.android.p327ui.user.addresses.C11463z;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$getLayoutForCountry$2 */
public final class AddressDetailViewModel$getLayoutForCountry$2 extends Lambda implements C19857l<C11463z.C11469f, C19394m> {
    public final /* synthetic */ String $countryName;
    public final /* synthetic */ Boolean $hideDefaultAddressToggle;
    public final /* synthetic */ AddressDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressDetailViewModel$getLayoutForCountry$2(AddressDetailViewModel addressDetailViewModel, String str, Boolean bool) {
        super(1);
        this.this$0 = addressDetailViewModel;
        this.$countryName = str;
        this.$hideDefaultAddressToggle = bool;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11463z.C11469f) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C11463z.C11469f fVar) {
        C19383o.m32797g(fVar, ResponseConstants.LAYOUT);
        AddressDetailViewModel addressDetailViewModel = this.this$0;
        C2895z<AddressDetailViewModel.C11361a> zVar = addressDetailViewModel.f25054f;
        int i = addressDetailViewModel.f25056h;
        String str = this.$countryName;
        AddressItemUI addressItemUI = addressDetailViewModel.f25058j;
        AddressDetailsLayoutResponse addressDetailsLayoutResponse = fVar.f25316a;
        Boolean bool = this.$hideDefaultAddressToggle;
        zVar.postValue(new AddressDetailViewModel.C11361a.C11370i(i, addressDetailsLayoutResponse, addressItemUI, str, bool != null ? bool.booleanValue() : false));
    }
}
