package com.paypal.pyplcheckout.addressbook.view.fragments;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;

public final class PYPLAddressBookFragment$bottomSheetCallback$1 extends BottomSheetBehavior.C15221f {
    public final /* synthetic */ PYPLAddressBookFragment this$0;

    public PYPLAddressBookFragment$bottomSheetCallback$1(PYPLAddressBookFragment pYPLAddressBookFragment) {
        this.this$0 = pYPLAddressBookFragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: onSlide$lambda-0  reason: not valid java name */
    public static final boolean m35185onSlide$lambda0(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() != 0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void onSlide(View view, float f) {
        C19383o.m32797g(view, "bottomSheet");
        view.setOnTouchListener(new C17184b());
    }

    public void onStateChanged(View view, int i) {
        C19383o.m32797g(view, "bottomSheet");
        switch (i) {
            case 1:
                BottomSheetBehavior access$getAddressBookBottomSheetBehavior$p = this.this$0.addressBookBottomSheetBehavior;
                if (access$getAddressBookBottomSheetBehavior$p != null) {
                    access$getAddressBookBottomSheetBehavior$p.setPeekHeight(view.getHeight());
                }
                PLog.i$default(PYPLAddressBookFragment.TAG, "AddressSheetCallback: AddressBookBottomSheetBehavior.STATE_DRAGGING", 0, 4, (Object) null);
                return;
            case 2:
                PLog.i$default(PYPLAddressBookFragment.TAG, "AddressSheetCallback: AddressBookBottomSheetBehavior.STATE_SETTLING", 0, 4, (Object) null);
                return;
            case 3:
                PLog.i$default(PYPLAddressBookFragment.TAG, "AddressSheetCallback: AddressBookBottomSheetBehavior.STATE_EXPANDED", 0, 4, (Object) null);
                return;
            case 4:
                PLog.i$default(PYPLAddressBookFragment.TAG, "AddressSheetCallback: AddressBookBottomSheetBehavior.STATE_COLLAPSED", 0, 4, (Object) null);
                return;
            case 5:
                PLog.i$default(PYPLAddressBookFragment.TAG, "AddressSheetCallback: AddressBookBottomSheetBehavior.STATE_HIDDEN", 0, 4, (Object) null);
                return;
            case 6:
                PLog.i$default(PYPLAddressBookFragment.TAG, "AddressSheetCallback: AddressBookBottomSheetBehavior.STATE_HALF_EXPANDED", 0, 4, (Object) null);
                return;
            default:
                PLog.i$default(PYPLAddressBookFragment.TAG, C0015b.m88g("AddressSheetCallback: AddressBookBottomSheetBehavior.STATE_#", i), 0, 4, (Object) null);
                return;
        }
    }
}
