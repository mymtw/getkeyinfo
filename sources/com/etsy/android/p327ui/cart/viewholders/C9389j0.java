package com.etsy.android.p327ui.cart.viewholders;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.p327ui.cart.clicklisteners.C9292o;
import com.etsy.android.p327ui.estimateddelivery.EstimatedDeliveryDateLegaleseVariantDialogFragment;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.viewholders.j0 */
public final /* synthetic */ class C9389j0 implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C9391k0 f20793b;

    /* renamed from: c */
    public final /* synthetic */ boolean f20794c;

    public /* synthetic */ C9389j0(C9391k0 k0Var, boolean z) {
        this.f20793b = k0Var;
        this.f20794c = z;
    }

    public final void onClick(View view) {
        FragmentActivity requireActivity;
        FragmentManager supportFragmentManager;
        C9391k0 k0Var = this.f20793b;
        boolean z = this.f20794c;
        C19383o.m32797g(k0Var, "this$0");
        C9292o oVar = k0Var.f20802c;
        oVar.getClass();
        EstimatedDeliveryDateLegaleseVariantDialogFragment estimatedDeliveryDateLegaleseVariantDialogFragment = new EstimatedDeliveryDateLegaleseVariantDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(EstimatedDeliveryDateLegaleseVariantDialogFragment.SHOW_UPGRADED_SHIPPING, z);
        estimatedDeliveryDateLegaleseVariantDialogFragment.setArguments(bundle);
        Fragment a = oVar.mo45889a();
        if (a != null && (requireActivity = a.requireActivity()) != null && (supportFragmentManager = requireActivity.getSupportFragmentManager()) != null) {
            estimatedDeliveryDateLegaleseVariantDialogFragment.show(supportFragmentManager, "Bottom sheet dialog");
        }
    }
}
