package com.etsy.android.p327ui.dialog;

import android.os.Bundle;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.SingleListingCheckout;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.dialog.c */
public final class C9727c {

    /* renamed from: a */
    public final TrackingBaseFragment f21528a;

    /* renamed from: b */
    public final Bundle f21529b;

    /* renamed from: c */
    public final C19846a<C19394m> f21530c;

    /* renamed from: d */
    public final String f21531d;

    /* renamed from: e */
    public final SingleListingCheckout f21532e;

    public C9727c(TrackingBaseFragment trackingBaseFragment, Bundle bundle, C19846a<C19394m> aVar) {
        C19383o.m32797g(trackingBaseFragment, "fragment");
        this.f21528a = trackingBaseFragment;
        this.f21529b = bundle;
        this.f21530c = aVar;
        String string = bundle.getString("listing_id");
        if (string != null) {
            this.f21531d = string;
            SingleListingCheckout singleListingCheckout = (SingleListingCheckout) bundle.getParcelable(ResponseConstants.SINGLE_LISTING_CHECKOUT);
            if (singleListingCheckout != null) {
                this.f21532e = singleListingCheckout;
                return;
            }
            throw new IllegalStateException("Listing ID is null. Listing must have an ID for checkout.");
        }
        throw new IllegalStateException("Listing ID is null. Listing must have an ID for checkout.");
    }
}
