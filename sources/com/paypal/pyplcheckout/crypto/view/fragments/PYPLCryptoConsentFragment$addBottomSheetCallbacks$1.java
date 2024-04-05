package com.paypal.pyplcheckout.crypto.view.fragments;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17186d;
import kotlin.jvm.internal.C19383o;

public final class PYPLCryptoConsentFragment$addBottomSheetCallbacks$1 extends BottomSheetBehavior.C15221f {
    public final /* synthetic */ PYPLCryptoConsentFragment this$0;

    public PYPLCryptoConsentFragment$addBottomSheetCallbacks$1(PYPLCryptoConsentFragment pYPLCryptoConsentFragment) {
        this.this$0 = pYPLCryptoConsentFragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: onSlide$lambda-0  reason: not valid java name */
    public static final boolean m35246onSlide$lambda0(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() != 0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void onSlide(View view, float f) {
        C19383o.m32797g(view, "bottomSheet");
        view.setOnTouchListener(new C17186d(1));
    }

    public void onStateChanged(View view, int i) {
        C19383o.m32797g(view, "bottomSheet");
        if (i == 1) {
            BottomSheetBehavior access$getCryptoConsentSheetBottomBehavior$p = this.this$0.cryptoConsentSheetBottomBehavior;
            if (access$getCryptoConsentSheetBottomBehavior$p != null) {
                access$getCryptoConsentSheetBottomBehavior$p.setPeekHeight(view.getHeight());
            } else {
                C19383o.m32805o("cryptoConsentSheetBottomBehavior");
                throw null;
            }
        }
    }
}
