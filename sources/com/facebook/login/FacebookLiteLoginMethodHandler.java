package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.login.LoginClient;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import p365hg.C12851e0;
import p401mg.C13080a;

public final class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<FacebookLiteLoginMethodHandler> CREATOR = new FacebookLiteLoginMethodHandler$Companion$CREATOR$1();
    public static final C12288a Companion = new C12288a();
    private final String nameForLogging = "fb_lite_login";

    /* renamed from: com.facebook.login.FacebookLiteLoginMethodHandler$a */
    public static final class C12288a {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacebookLiteLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        C19383o.m32797g(loginClient, "loginClient");
    }

    public int describeContents() {
        return 0;
    }

    public String getNameForLogging() {
        return this.nameForLogging;
    }

    public int tryAuthorize(LoginClient.Request request) {
        String str;
        String str2;
        Intent intent;
        Class<C12851e0> cls;
        C19383o.m32797g(request, LoginFragment.EXTRA_REQUEST);
        String e2e = LoginClient.getE2E();
        FragmentActivity activity = getLoginClient().getActivity();
        C19383o.m32796f(activity, "loginClient.activity");
        String applicationId = request.getApplicationId();
        C19383o.m32796f(applicationId, "request.applicationId");
        Set<String> permissions = request.getPermissions();
        C19383o.m32796f(permissions, "request.permissions");
        C19383o.m32796f(e2e, "e2e");
        request.isRerequest();
        boolean hasPublishPermission = request.hasPublishPermission();
        DefaultAudience defaultAudience = request.getDefaultAudience();
        C19383o.m32796f(defaultAudience, "request.defaultAudience");
        String authId = request.getAuthId();
        C19383o.m32796f(authId, "request.authId");
        String clientState = getClientState(authId);
        String authType = request.getAuthType();
        C19383o.m32796f(authType, "request.authType");
        String messengerPageId = request.getMessengerPageId();
        boolean resetMessengerState = request.getResetMessengerState();
        boolean isFamilyLogin = request.isFamilyLogin();
        boolean shouldSkipAccountDeduplication = request.shouldSkipAccountDeduplication();
        String str3 = C12851e0.f28342a;
        Class<C12851e0> cls2 = C12851e0.class;
        if (C13080a.m20762b(cls2)) {
            str2 = "e2e";
            str = e2e;
        } else {
            try {
                C19383o.m32797g(clientState, "clientState");
                cls = cls2;
                str2 = "e2e";
                str = e2e;
            } catch (Throwable th) {
                th = th;
                cls = cls2;
                str2 = "e2e";
                str = e2e;
                C13080a.m20761a(cls, th);
                intent = null;
                addLoggingExtra(str2, str);
                return tryIntent(intent, LoginClient.getLoginRequestCode()) ? 1 : 0;
            }
            try {
                intent = C12851e0.m20513n(activity, C12851e0.f28346e.mo45630c(new C12851e0.C12853b(), applicationId, permissions, e2e, hasPublishPermission, defaultAudience, clientState, authType, false, messengerPageId, resetMessengerState, LoginTargetApp.FACEBOOK, isFamilyLogin, shouldSkipAccountDeduplication, ""));
            } catch (Throwable th2) {
                th = th2;
                C13080a.m20761a(cls, th);
                intent = null;
                addLoggingExtra(str2, str);
                return tryIntent(intent, LoginClient.getLoginRequestCode()) ? 1 : 0;
            }
            addLoggingExtra(str2, str);
            return tryIntent(intent, LoginClient.getLoginRequestCode()) ? 1 : 0;
        }
        intent = null;
        addLoggingExtra(str2, str);
        return tryIntent(intent, LoginClient.getLoginRequestCode()) ? 1 : 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "dest");
        super.writeToParcel(parcel, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacebookLiteLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C19383o.m32797g(parcel, "source");
    }
}
