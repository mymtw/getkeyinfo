package com.etsy.android.p327ui.cart;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.models.apiv3.cart.GooglePayDataContract;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.cart.saveforlater.SaveForLaterFragment;
import com.etsy.android.uikit.view.C11952g;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;
import p425q9.C13265p;

/* renamed from: com.etsy.android.ui.cart.j */
public final class C9314j extends C11952g {

    /* renamed from: k */
    public final FragmentManager f20582k;

    /* renamed from: l */
    public final Activity f20583l;

    /* renamed from: m */
    public final GooglePayDataContract f20584m;

    /* renamed from: n */
    public final EtsyId f20585n;

    /* renamed from: o */
    public final C9332q f20586o;

    /* renamed from: p */
    public int f20587p = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9314j(FragmentManager fragmentManager, FragmentActivity fragmentActivity, C13265p pVar, GooglePayDataContract googlePayDataContract, EtsyId etsyId, C9332q qVar, String str) {
        super(str, fragmentManager);
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(qVar, "cartViewEligibility");
        this.f20582k = fragmentManager;
        this.f20583l = fragmentActivity;
        this.f20584m = googlePayDataContract;
        this.f20585n = etsyId;
        this.f20586o = qVar;
        int i = 1;
        this.f20587p = pVar.mo45960e() ? 2 : i;
    }

    /* renamed from: j */
    public final int mo20184j() {
        return this.f20587p;
    }

    /* renamed from: l */
    public final CharSequence mo20186l(int i) {
        return i != 0 ? i != 1 ? "" : this.f20583l.getString(R.string.tab_saved) : this.f20583l.getString(R.string.tab_cart);
    }

    /* renamed from: v */
    public final long mo10632v(int i) {
        if (i != 0) {
            return i != 1 ? -1 : 1;
        }
        return 0;
    }

    /* renamed from: w */
    public final Fragment mo31711w(int i) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(CartWithSavedFragment.CHECKED_OUT_IS_MSCO, true);
        if (i == 0) {
            MultiShopCartFragment multiShopCartFragment = new MultiShopCartFragment();
            GooglePayDataContract googlePayDataContract = this.f20584m;
            if (googlePayDataContract != null) {
                bundle.putSerializable(CartWithSavedFragment.CHECKED_OUT_CART, googlePayDataContract);
            }
            EtsyId etsyId = this.f20585n;
            if (etsyId != null) {
                bundle.putSerializable(CartWithSavedFragment.LAST_ORDER_ID, etsyId);
            }
            multiShopCartFragment.setArguments(bundle);
            return multiShopCartFragment;
        } else if (i == 1) {
            return this.f20586o.f20606a.mo21132b(C8592b.C8594b.f18856b) ? new SaveForLaterFragment() : new SavedCartItemsFragment();
        } else {
            throw new RuntimeException(C0015b.m88g("unknown cart position: ", i));
        }
    }
}
