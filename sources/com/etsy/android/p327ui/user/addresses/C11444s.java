package com.etsy.android.p327ui.user.addresses;

import android.content.DialogInterface;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.s */
public final /* synthetic */ class C11444s implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    public final /* synthetic */ AddressListFragment f25264b;

    /* renamed from: c */
    public final /* synthetic */ RecyclerView.C3084b0 f25265c;

    public /* synthetic */ C11444s(AddressListFragment addressListFragment, RecyclerView.C3084b0 b0Var) {
        this.f25264b = addressListFragment;
        this.f25265c = b0Var;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        AddressListFragment addressListFragment = this.f25264b;
        RecyclerView.C3084b0 b0Var = this.f25265c;
        C19383o.m32797g(addressListFragment, "this$0");
        C19383o.m32797g(b0Var, "$viewHolder");
        C11439o access$getAddressesAdapter$p = addressListFragment.addressesAdapter;
        if (access$getAddressesAdapter$p != null) {
            access$getAddressesAdapter$p.notifyItemChanged(b0Var.getAdapterPosition());
        }
    }
}
