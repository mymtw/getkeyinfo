package com.etsy.android.p327ui.user.purchases;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import p415of.C13181j;

/* renamed from: com.etsy.android.ui.user.purchases.t */
public interface C11678t {
    Fragment getFragment();

    FragmentActivity getFragmentActivity();

    C13181j getScrollListener();

    void onLoadFailure();

    void setAdapter(PurchaseReceiptAdapter purchaseReceiptAdapter);

    void setLoading(boolean z);

    void setPurchaseListItems(List<? extends C11639e> list, int i);

    void showEmptyView();

    void updateModuleListItem();
}
