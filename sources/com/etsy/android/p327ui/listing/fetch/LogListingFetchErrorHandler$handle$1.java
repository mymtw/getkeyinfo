package com.etsy.android.p327ui.listing.fetch;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.listing.fetch.LogListingFetchErrorHandler$handle$1 */
final class LogListingFetchErrorHandler$handle$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C10149k this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LogListingFetchErrorHandler$handle$1(C10149k kVar) {
        super(0);
        this.this$0 = kVar;
    }

    public final void invoke() {
        this.this$0.f22324d.mo45474a("ListingFragmentApiError");
        ConnectivityManager connectivityManager = this.this$0.f22323c.f19159a;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null ? networkCapabilities.hasTransport(4) : false) {
            this.this$0.f22324d.mo45474a("ListingFragmentApiError.UserOnVpn");
        }
    }
}
