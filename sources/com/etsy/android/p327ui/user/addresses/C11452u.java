package com.etsy.android.p327ui.user.addresses;

import com.etsy.android.lib.models.Country;
import java.util.List;

/* renamed from: com.etsy.android.ui.user.addresses.u */
public interface C11452u {
    void onAddNewAddress(Country country, boolean z);

    void onAddressDeleteFailure(Throwable th);

    void onAddressDeleteSuccess();

    void setAdapter(C11439o oVar);

    void showAddresses(List<AddressItemUI> list);

    void showEmptyState();

    void showErrorState();

    void showLoader();
}
