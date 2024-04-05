package com.paypal.pyplcheckout.utils;

import android.app.Activity;
import android.support.p013v4.media.C0069a;
import com.facebook.login.LoginFragment;
import com.google.gson.C16708i;
import com.paypal.pyplcheckout.common.firebase.firebasemodels.GetPropsRequest;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.flavorfirebasedb.RealTimeDB;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData;
import com.paypal.pyplcheckout.pojo.firebase.FirebaseProperties;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;

public final class ErrorUtils {
    public static final ErrorUtils INSTANCE = new ErrorUtils();

    private ErrorUtils() {
    }

    public static final void sendOnErrorMessageToFireBase(RealTimeDB realTimeDB, String str, String str2, FirebaseMessageData firebaseMessageData, String str3, PEnums.EventCode eventCode) {
        C19383o.m32797g(str, "uniqueMessageId");
        C19383o.m32797g(str2, "uniqueRequestId");
        C19383o.m32797g(eventCode, "eventCode");
        GetPropsRequest getPropsRequest = new GetPropsRequest("", str, str2);
        if (firebaseMessageData != null) {
            getPropsRequest.setJsonMessage(INSTANCE.getOnErrorMessageToFireBase(firebaseMessageData, str3 == null ? "" : str3, str, str2));
        }
        if (realTimeDB != null) {
            realTimeDB.sendRequest(getPropsRequest);
        }
        PYPLCheckoutUtils.showDebugErrorDialog$default(PYPLCheckoutUtils.Companion.getInstance(), (Activity) null, eventCode, str3 == null ? "" : str3, 1, (Object) null);
    }

    public static /* synthetic */ void sendOnErrorMessageToFireBase$default(RealTimeDB realTimeDB, String str, String str2, FirebaseMessageData firebaseMessageData, String str3, PEnums.EventCode eventCode, int i, Object obj) {
        if ((i & 1) != 0) {
            realTimeDB = RealTimeDB.Companion.getInstance();
        }
        RealTimeDB realTimeDB2 = realTimeDB;
        if ((i & 2) != 0) {
            str = C0069a.m174e("randomUUID().toString()");
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = C0069a.m174e("randomUUID().toString()");
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            firebaseMessageData = null;
        }
        sendOnErrorMessageToFireBase(realTimeDB2, str4, str5, firebaseMessageData, str3, eventCode);
    }

    public final String getOnErrorMessageToFireBase(FirebaseMessageData firebaseMessageData, String str, String str2, String str3) {
        C0048b.m167f(str, "errorMessage", str2, "uniqueMessageId", str3, "uniqueRequestId");
        if (firebaseMessageData != null) {
            firebaseMessageData.setMessage(str);
        }
        String j = new C16708i().mo59463j(new FirebaseProperties((String) null, (String) null, VersionUtils.INSTANCE.getSdkVersion(), LoginFragment.EXTRA_REQUEST, DebugConfigManager.getInstance().getFirebaseSessionId(), str2, str3, "onError", (String) null, firebaseMessageData, 259, (DefaultConstructorMarker) null));
        C19383o.m32796f(j, "Gson().toJson(firebaseProps)");
        return j;
    }
}
