package com.paypal.pyplcheckout.network;

import android.net.ConnectivityManager;
import android.net.Network;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.NetworkEventTypes;
import com.paypal.pyplcheckout.events.Success;
import kotlin.jvm.internal.C19383o;

public final class ConnectivityHandler$networkCallback$1 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ ConnectivityHandler this$0;

    public ConnectivityHandler$networkCallback$1(ConnectivityHandler connectivityHandler) {
        this.this$0 = connectivityHandler;
    }

    public void onAvailable(Network network) {
        C19383o.m32797g(network, "network");
        super.onAvailable(network);
        String access$getTAG$p = this.this$0.TAG;
        C19383o.m32796f(access$getTAG$p, "TAG");
        PLog.m28728dR(access$getTAG$p, "network available");
        if (!this.this$0.isNetworkAvailable()) {
            this.this$0.isNetworkAvailable = true;
            this.this$0.getEvents().fire(NetworkEventTypes.NETWORK_AVAILABILITY, new Success(Boolean.TRUE));
        }
    }

    public void onLost(Network network) {
        C19383o.m32797g(network, "network");
        super.onLost(network);
        String access$getTAG$p = this.this$0.TAG;
        C19383o.m32796f(access$getTAG$p, "TAG");
        PLog.m28728dR(access$getTAG$p, "network lost");
        if (this.this$0.isNetworkAvailable()) {
            this.this$0.isNetworkAvailable = false;
            this.this$0.getEvents().fire(NetworkEventTypes.NETWORK_AVAILABILITY, new Success(Boolean.FALSE));
        }
    }
}
