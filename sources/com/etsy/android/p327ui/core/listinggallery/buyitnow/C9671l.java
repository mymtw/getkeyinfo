package com.etsy.android.p327ui.core.listinggallery.buyitnow;

import android.content.DialogInterface;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.l */
public final class C9671l {

    /* renamed from: a */
    public final C0005b f21430a;

    /* renamed from: b */
    public CollageBottomSheet f21431b;

    public C9671l(C0005b bVar) {
        C19383o.m32797g(bVar, "listingValidator");
        this.f21430a = bVar;
    }

    /* renamed from: a */
    public final void mo32390a() {
        CollageBottomSheet collageBottomSheet = this.f21431b;
        if (collageBottomSheet != null) {
            collageBottomSheet.setOnCancelListener((DialogInterface.OnCancelListener) null);
            collageBottomSheet.setOnDismissListener((DialogInterface.OnDismissListener) null);
            collageBottomSheet.setOnShowListener((DialogInterface.OnShowListener) null);
            if (collageBottomSheet.isShowing()) {
                collageBottomSheet.dismiss();
            }
        }
        this.f21431b = null;
    }

    /* renamed from: b */
    public final void mo32391b(CollageTextInput collageTextInput, boolean z, int i, C19857l<? super String, C19394m> lVar) {
        String text = collageTextInput.getText();
        this.f21430a.getClass();
        boolean z2 = false;
        int length = text != null ? text.length() : 0;
        boolean z3 = length == 0;
        boolean z4 = length > i;
        if ((!z || (!z3 && !z4)) && (z || !z4)) {
            lVar.invoke(text);
            mo32390a();
            return;
        }
        if (collageTextInput.getText().length() == 0) {
            z2 = true;
        }
        if (z2) {
            collageTextInput.setErrorText(collageTextInput.getResources().getString(R.string.listing_personalization_required));
        } else {
            collageTextInput.setErrorText(collageTextInput.getResources().getString(R.string.listing_personalization_length_error));
        }
    }
}
