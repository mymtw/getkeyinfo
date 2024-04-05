package com.paypal.pyplcheckout.flavorfirebasedb;

import com.paypal.pyplcheckout.common.firebase.firebasemodels.FirebaseRequestModel;
import com.paypal.pyplcheckout.common.firebase.firebasemodels.GetPropsRequest;
import com.paypal.pyplcheckout.pojo.ShippingData;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class RealTimeDB {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RealTimeDB getInstance(String str) {
            return getInstance();
        }

        public final void setAccessToken(String str) {
        }

        public final RealTimeDB getInstance() {
            return new RealTimeDB();
        }
    }

    public static final RealTimeDB getInstance() {
        return Companion.getInstance();
    }

    public static final void setAccessToken(String str) {
        Companion.setAccessToken(str);
    }

    public final void clearAllResponseTimers() {
    }

    public final GetPropsRequest getShippingCallbackRequest(ShippingData shippingData) {
        return null;
    }

    public final void sendRequest(FirebaseRequestModel firebaseRequestModel) {
        C19383o.m32797g(firebaseRequestModel, "message");
    }

    public final void sendResponse(FirebaseRequestModel firebaseRequestModel) {
        C19383o.m32797g(firebaseRequestModel, "message");
    }

    public final void signOutCurrentSession() {
    }
}
