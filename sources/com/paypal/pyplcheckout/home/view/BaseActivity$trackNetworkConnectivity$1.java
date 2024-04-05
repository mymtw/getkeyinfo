package com.paypal.pyplcheckout.home.view;

import android.net.ConnectivityManager;
import android.net.Network;
import androidx.appcompat.widget.C0326j;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.utils.NetworkUtils;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BaseActivity$trackNetworkConnectivity$1 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ String $connectionType;

    public BaseActivity$trackNetworkConnectivity$1(String str) {
        this.$connectionType = str;
    }

    public void onAvailable(Network network) {
        C19383o.m32797g(network, "network");
        super.onAvailable(network);
        NetworkUtils networkUtils = NetworkUtils.INSTANCE;
        networkUtils.setNetworkConnected(true);
        networkUtils.setConnectionType(this.$connectionType);
    }

    public void onLost(Network network) {
        C19383o.m32797g(network, "network");
        super.onLost(network);
        NetworkUtils networkUtils = NetworkUtils.INSTANCE;
        networkUtils.setNetworkConnected(false);
        networkUtils.setConnectionType(this.$connectionType);
        PLog.status(PEnums.TransitionName.NETWORK_CONNECTIVITY_LOST, PEnums.Outcome.DISCONNECTED, PEnums.EventCode.E168, PEnums.StateName.NETWORK_CONNECTIVITY, C0326j.m864i("Network connectivity was lost. Connection Type: ", this.$connectionType), new InstrumentationEvent.InstrumentationEventBuilder((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 536870911, (DefaultConstructorMarker) null));
    }
}
