package com.etsy.android.p327ui.cart.bottomsheets.applycoupon;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.bottomsheets.applycoupon.b */
public final /* synthetic */ class C9257b implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ int f20443a;

    /* renamed from: b */
    public final /* synthetic */ KeyEvent.Callback f20444b;

    public /* synthetic */ C9257b(KeyEvent.Callback callback, int i) {
        this.f20443a = i;
        this.f20444b = callback;
    }

    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f20443a) {
            case 0:
                ApplyCouponBottomSheetFragment.m34922onCreateDialog$lambda1((BottomSheetDialog) this.f20444b, dialogInterface);
                return;
            default:
                CollageTextInput collageTextInput = (CollageTextInput) this.f20444b;
                C19383o.m32797g(collageTextInput, "$inputView");
                collageTextInput.requestFocus();
                return;
        }
    }
}
