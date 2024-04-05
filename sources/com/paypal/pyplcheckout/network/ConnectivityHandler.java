package com.paypal.pyplcheckout.network;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.NetworkEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.p543di.AndroidSDKVersionProvider;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;

@SuppressLint({"NewApi"})
public final class ConnectivityHandler {
    /* access modifiers changed from: private */
    public final String TAG = "ConnectivityHandler";
    private Context context;
    private Events events;
    /* access modifiers changed from: private */
    public boolean isNetworkAvailable;
    private final ConnectivityHandler$networkCallback$1 networkCallback;

    public ConnectivityHandler(Context context2, Events events2, AndroidSDKVersionProvider androidSDKVersionProvider) {
        Context context3 = context2;
        Events events3 = events2;
        C19383o.m32797g(context3, ResponseConstants.CONTEXT);
        C19383o.m32797g(events3, "events");
        C19383o.m32797g(androidSDKVersionProvider, "buildVersionProvider");
        this.context = context3;
        this.events = events3;
        ConnectivityHandler$networkCallback$1 connectivityHandler$networkCallback$1 = new ConnectivityHandler$networkCallback$1(this);
        this.networkCallback = connectivityHandler$networkCallback$1;
        this.events.register((EventType) NetworkEventTypes.NETWORK_AVAILABILITY);
        ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService(ConnectivityManager.class);
        try {
            if (androidSDKVersionProvider.getVersion() < 24) {
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                builder.addTransportType(0);
                builder.addTransportType(1);
                builder.addTransportType(4);
                NetworkRequest build = builder.build();
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(build, connectivityHandler$networkCallback$1);
                }
            } else if (connectivityManager != null) {
                connectivityManager.registerDefaultNetworkCallback(connectivityHandler$networkCallback$1);
            }
        } catch (Exception e) {
            Exception exc = e;
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E634, C0015b.m90i("Encountered an ", exc.getClass().getCanonicalName(), " with message: ", exc.getMessage()), (String) null, exc, PEnums.TransitionName.FUNDING_ELIGIBILITY_EXECUTED, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1992, (Object) null);
            String str = this.TAG;
            C19383o.m32796f(str, "TAG");
            PLog.m28728dR(str, "Exception while registering callbacks");
            this.events.fire(NetworkEventTypes.NETWORK_AVAILABILITY, new Success(Boolean.TRUE));
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final Events getEvents() {
        return this.events;
    }

    public final boolean isNetworkAvailable() {
        return this.isNetworkAvailable;
    }

    public final void setContext(Context context2) {
        C19383o.m32797g(context2, "<set-?>");
        this.context = context2;
    }

    public final void setEvents(Events events2) {
        C19383o.m32797g(events2, "<set-?>");
        this.events = events2;
    }
}
