package com.bugsnag.android;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

public final class ConnectivityApi24 implements C5935y {

    /* renamed from: b */
    public final ConnectivityTrackerCallback f12107b;

    /* renamed from: c */
    public final ConnectivityManager f12108c;

    public static final class ConnectivityTrackerCallback extends ConnectivityManager.NetworkCallback {

        /* renamed from: cb */
        private final C19861p<Boolean, String, C19394m> f12109cb;
        private final AtomicBoolean receivedFirstCallback = new AtomicBoolean(false);

        public ConnectivityTrackerCallback(C19861p<? super Boolean, ? super String, C19394m> pVar) {
            this.f12109cb = pVar;
        }

        private final void invokeNetworkCallback(boolean z) {
            C19861p<Boolean, String, C19394m> pVar;
            if (this.receivedFirstCallback.getAndSet(true) && (pVar = this.f12109cb) != null) {
                C19394m invoke = pVar.invoke(Boolean.valueOf(z), "unknown");
            }
        }

        public void onAvailable(Network network) {
            C19383o.m32798h(network, "network");
            super.onAvailable(network);
            invokeNetworkCallback(true);
        }

        public void onUnavailable() {
            super.onUnavailable();
            invokeNetworkCallback(false);
        }
    }

    public ConnectivityApi24(ConnectivityManager connectivityManager, C5810n nVar) {
        C19383o.m32798h(connectivityManager, "cm");
        this.f12108c = connectivityManager;
        this.f12107b = new ConnectivityTrackerCallback(nVar);
    }

    /* renamed from: b */
    public final void mo1127b() {
        this.f12108c.registerDefaultNetworkCallback(this.f12107b);
    }

    /* renamed from: d */
    public final boolean mo1129d() {
        return this.f12108c.getActiveNetwork() != null;
    }

    /* renamed from: f */
    public final String mo1131f() {
        Network activeNetwork = this.f12108c.getActiveNetwork();
        NetworkCapabilities networkCapabilities = activeNetwork != null ? this.f12108c.getNetworkCapabilities(activeNetwork) : null;
        return networkCapabilities == null ? "none" : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(3) ? "ethernet" : networkCapabilities.hasTransport(0) ? "cellular" : "unknown";
    }
}
