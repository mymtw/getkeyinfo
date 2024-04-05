package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0070b;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.LoginFragment;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p365hg.C12869i0;
import p365hg.C12879l0;
import p401mg.C13080a;
import p453tf.C13418j;

public class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new C12296a();
    public C12297b backgroundProcessingListener;
    public boolean checkedInternetPermission;
    public int currentHandler;
    public Map<String, String> extraData;
    public Fragment fragment;
    public LoginMethodHandler[] handlersToTry;
    public Map<String, String> loggingExtras;
    private C12310d loginLogger;
    private int numActivitiesReturned;
    private int numTotalIntentsFired;
    public C12298c onCompletedListener;
    public Request pendingRequest;

    public static class Request implements Parcelable {
        public static final Parcelable.Creator<Request> CREATOR = new C12294a();
        private final String applicationId;
        private String authId;
        private String authType;
        private final DefaultAudience defaultAudience;
        private String deviceAuthTargetUserId;
        private String deviceRedirectUriString;
        private boolean isFamilyLogin;
        private boolean isRerequest;
        private final LoginBehavior loginBehavior;
        private String messengerPageId;
        private String nonce;
        private Set<String> permissions;
        private boolean resetMessengerState;
        private boolean shouldSkipAccountDeduplication;
        private final LoginTargetApp targetApp;

        /* renamed from: com.facebook.login.LoginClient$Request$a */
        public static class C12294a implements Parcelable.Creator<Request> {
            public final Object createFromParcel(Parcel parcel) {
                return new Request(parcel, (C12296a) null);
            }

            public final Object[] newArray(int i) {
                return new Request[i];
            }
        }

        public /* synthetic */ Request(Parcel parcel, C12296a aVar) {
            this(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public String getApplicationId() {
            return this.applicationId;
        }

        public String getAuthId() {
            return this.authId;
        }

        public String getAuthType() {
            return this.authType;
        }

        public DefaultAudience getDefaultAudience() {
            return this.defaultAudience;
        }

        public String getDeviceAuthTargetUserId() {
            return this.deviceAuthTargetUserId;
        }

        public String getDeviceRedirectUriString() {
            return this.deviceRedirectUriString;
        }

        public LoginBehavior getLoginBehavior() {
            return this.loginBehavior;
        }

        public LoginTargetApp getLoginTargetApp() {
            return this.targetApp;
        }

        public String getMessengerPageId() {
            return this.messengerPageId;
        }

        public String getNonce() {
            return this.nonce;
        }

        public Set<String> getPermissions() {
            return this.permissions;
        }

        public boolean getResetMessengerState() {
            return this.resetMessengerState;
        }

        public boolean hasPublishPermission() {
            for (String c : this.permissions) {
                if (C12311e.m20140c(c)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isFamilyLogin() {
            return this.isFamilyLogin;
        }

        public boolean isInstagramLogin() {
            return this.targetApp == LoginTargetApp.INSTAGRAM;
        }

        public boolean isRerequest() {
            return this.isRerequest;
        }

        public void setAuthId(String str) {
            this.authId = str;
        }

        public void setAuthType(String str) {
            this.authType = str;
        }

        public void setDeviceAuthTargetUserId(String str) {
            this.deviceAuthTargetUserId = str;
        }

        public void setDeviceRedirectUriString(String str) {
            this.deviceRedirectUriString = str;
        }

        public void setFamilyLogin(boolean z) {
            this.isFamilyLogin = z;
        }

        public void setMessengerPageId(String str) {
            this.messengerPageId = str;
        }

        public void setPermissions(Set<String> set) {
            C12879l0.m20601e(set, "permissions");
            this.permissions = set;
        }

        public void setRerequest(boolean z) {
            this.isRerequest = z;
        }

        public void setResetMessengerState(boolean z) {
            this.resetMessengerState = z;
        }

        public void setShouldSkipAccountDeduplication(boolean z) {
            this.shouldSkipAccountDeduplication = z;
        }

        public boolean shouldSkipAccountDeduplication() {
            return this.shouldSkipAccountDeduplication;
        }

        public void writeToParcel(Parcel parcel, int i) {
            LoginBehavior loginBehavior2 = this.loginBehavior;
            String str = null;
            parcel.writeString(loginBehavior2 != null ? loginBehavior2.name() : null);
            parcel.writeStringList(new ArrayList(this.permissions));
            DefaultAudience defaultAudience2 = this.defaultAudience;
            parcel.writeString(defaultAudience2 != null ? defaultAudience2.name() : null);
            parcel.writeString(this.applicationId);
            parcel.writeString(this.authId);
            parcel.writeByte(this.isRerequest ? (byte) 1 : 0);
            parcel.writeString(this.deviceRedirectUriString);
            parcel.writeString(this.authType);
            parcel.writeString(this.deviceAuthTargetUserId);
            parcel.writeString(this.messengerPageId);
            parcel.writeByte(this.resetMessengerState ? (byte) 1 : 0);
            LoginTargetApp loginTargetApp = this.targetApp;
            if (loginTargetApp != null) {
                str = loginTargetApp.name();
            }
            parcel.writeString(str);
            parcel.writeByte(this.isFamilyLogin ? (byte) 1 : 0);
            parcel.writeByte(this.shouldSkipAccountDeduplication ? (byte) 1 : 0);
            parcel.writeString(this.nonce);
        }

        public Request(LoginBehavior loginBehavior2, Set<String> set, DefaultAudience defaultAudience2, String str, String str2, String str3) {
            this(loginBehavior2, set, defaultAudience2, str, str2, str3, LoginTargetApp.FACEBOOK);
        }

        public Request(LoginBehavior loginBehavior2, Set<String> set, DefaultAudience defaultAudience2, String str, String str2, String str3, LoginTargetApp loginTargetApp) {
            this(loginBehavior2, set, defaultAudience2, str, str2, str3, loginTargetApp, (String) null);
        }

        public Request(LoginBehavior loginBehavior2, Set<String> set, DefaultAudience defaultAudience2, String str, String str2, String str3, LoginTargetApp loginTargetApp, String str4) {
            this.isRerequest = false;
            this.isFamilyLogin = false;
            this.shouldSkipAccountDeduplication = false;
            this.loginBehavior = loginBehavior2;
            this.permissions = set == null ? new HashSet<>() : set;
            this.defaultAudience = defaultAudience2;
            this.authType = str;
            this.applicationId = str2;
            this.authId = str3;
            this.targetApp = loginTargetApp;
            if (C12869i0.m20546B(str4)) {
                this.nonce = UUID.randomUUID().toString();
            } else {
                this.nonce = str4;
            }
        }

        private Request(Parcel parcel) {
            boolean z = false;
            this.isRerequest = false;
            this.isFamilyLogin = false;
            this.shouldSkipAccountDeduplication = false;
            String readString = parcel.readString();
            LoginTargetApp loginTargetApp = null;
            this.loginBehavior = readString != null ? LoginBehavior.valueOf(readString) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.permissions = new HashSet(arrayList);
            String readString2 = parcel.readString();
            this.defaultAudience = readString2 != null ? DefaultAudience.valueOf(readString2) : null;
            this.applicationId = parcel.readString();
            this.authId = parcel.readString();
            this.isRerequest = parcel.readByte() != 0;
            this.deviceRedirectUriString = parcel.readString();
            this.authType = parcel.readString();
            this.deviceAuthTargetUserId = parcel.readString();
            this.messengerPageId = parcel.readString();
            this.resetMessengerState = parcel.readByte() != 0;
            String readString3 = parcel.readString();
            this.targetApp = readString3 != null ? LoginTargetApp.valueOf(readString3) : loginTargetApp;
            this.isFamilyLogin = parcel.readByte() != 0;
            this.shouldSkipAccountDeduplication = parcel.readByte() != 0 ? true : z;
            this.nonce = parcel.readString();
        }
    }

    public static class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new C12295a();
        public final AuthenticationToken authenticationToken;
        public final Code code;
        public final String errorCode;
        public final String errorMessage;
        public Map<String, String> extraData;
        public Map<String, String> loggingExtras;
        public final Request request;
        public final AccessToken token;

        public enum Code {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            
            private final String loggingValue;

            private Code(String str) {
                this.loggingValue = str;
            }

            public String getLoggingValue() {
                return this.loggingValue;
            }
        }

        /* renamed from: com.facebook.login.LoginClient$Result$a */
        public static class C12295a implements Parcelable.Creator<Result> {
            public final Object createFromParcel(Parcel parcel) {
                return new Result(parcel, (C12296a) null);
            }

            public final Object[] newArray(int i) {
                return new Result[i];
            }
        }

        public /* synthetic */ Result(Parcel parcel, C12296a aVar) {
            this(parcel);
        }

        public static Result createCancelResult(Request request2, String str) {
            return new Result(request2, Code.CANCEL, (AccessToken) null, str, (String) null);
        }

        public static Result createCompositeTokenResult(Request request2, AccessToken accessToken, AuthenticationToken authenticationToken2) {
            return new Result(request2, Code.SUCCESS, accessToken, authenticationToken2, (String) null, (String) null);
        }

        public static Result createErrorResult(Request request2, String str, String str2) {
            return createErrorResult(request2, str, str2, (String) null);
        }

        public static Result createTokenResult(Request request2, AccessToken accessToken) {
            return new Result(request2, Code.SUCCESS, accessToken, (String) null, (String) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.code.name());
            parcel.writeParcelable(this.token, i);
            parcel.writeParcelable(this.authenticationToken, i);
            parcel.writeString(this.errorMessage);
            parcel.writeString(this.errorCode);
            parcel.writeParcelable(this.request, i);
            C12869i0.m20561Q(parcel, this.loggingExtras);
            C12869i0.m20561Q(parcel, this.extraData);
        }

        public Result(Request request2, Code code2, AccessToken accessToken, String str, String str2) {
            this(request2, code2, accessToken, (AuthenticationToken) null, str, str2);
        }

        public static Result createErrorResult(Request request2, String str, String str2, String str3) {
            String[] strArr = {str, str2};
            int i = C12869i0.f28368a;
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                String str4 = strArr[i2];
                if (str4 != null) {
                    arrayList.add(str4);
                }
            }
            return new Result(request2, Code.ERROR, (AccessToken) null, TextUtils.join(": ", arrayList), str3);
        }

        public Result(Request request2, Code code2, AccessToken accessToken, AuthenticationToken authenticationToken2, String str, String str2) {
            C12879l0.m20601e(code2, ResponseConstants.CODE);
            this.request = request2;
            this.token = accessToken;
            this.authenticationToken = authenticationToken2;
            this.errorMessage = str;
            this.code = code2;
            this.errorCode = str2;
        }

        private Result(Parcel parcel) {
            this.code = Code.valueOf(parcel.readString());
            this.token = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.authenticationToken = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.errorMessage = parcel.readString();
            this.errorCode = parcel.readString();
            this.request = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.loggingExtras = C12869i0.m20558N(parcel);
            this.extraData = C12869i0.m20558N(parcel);
        }
    }

    /* renamed from: com.facebook.login.LoginClient$a */
    public static class C12296a implements Parcelable.Creator<LoginClient> {
        public final Object createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }

        public final Object[] newArray(int i) {
            return new LoginClient[i];
        }
    }

    /* renamed from: com.facebook.login.LoginClient$b */
    public interface C12297b {
    }

    /* renamed from: com.facebook.login.LoginClient$c */
    public interface C12298c {
    }

    public LoginClient(Fragment fragment2) {
        this.currentHandler = -1;
        this.numActivitiesReturned = 0;
        this.numTotalIntentsFired = 0;
        this.fragment = fragment2;
    }

    private void addLoggingExtra(String str, String str2, boolean z) {
        if (this.loggingExtras == null) {
            this.loggingExtras = new HashMap();
        }
        if (this.loggingExtras.containsKey(str) && z) {
            str2 = C0070b.m184f(new StringBuilder(), this.loggingExtras.get(str), ",", str2);
        }
        this.loggingExtras.put(str, str2);
    }

    private void completeWithFailure() {
        complete(Result.createErrorResult(this.pendingRequest, "Login attempt failed.", (String) null));
    }

    public static String getE2E() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r2.equals(r3.pendingRequest.getApplicationId()) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.login.C12310d getLogger() {
        /*
            r3 = this;
            com.facebook.login.d r0 = r3.loginLogger
            if (r0 == 0) goto L_0x0022
            r0.getClass()
            boolean r1 = p401mg.C13080a.m20762b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000f
            goto L_0x0016
        L_0x000f:
            java.lang.String r2 = r0.f27434b     // Catch:{ all -> 0x0012 }
            goto L_0x0016
        L_0x0012:
            r1 = move-exception
            p401mg.C13080a.m20761a(r0, r1)
        L_0x0016:
            com.facebook.login.LoginClient$Request r0 = r3.pendingRequest
            java.lang.String r0 = r0.getApplicationId()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0033
        L_0x0022:
            com.facebook.login.d r0 = new com.facebook.login.d
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            com.facebook.login.LoginClient$Request r2 = r3.pendingRequest
            java.lang.String r2 = r2.getApplicationId()
            r0.<init>(r1, r2)
            r3.loginLogger = r0
        L_0x0033:
            com.facebook.login.d r0 = r3.loginLogger
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.getLogger():com.facebook.login.d");
    }

    public static int getLoginRequestCode() {
        return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
    }

    private void logAuthorizationMethodComplete(String str, Result result, Map<String, String> map) {
        logAuthorizationMethodComplete(str, result.code.getLoggingValue(), result.errorMessage, result.errorCode, map);
    }

    private void notifyOnCompleteListener(Result result) {
        C12298c cVar = this.onCompletedListener;
        if (cVar != null) {
            LoginFragment.this.onLoginClientCompleted(result);
        }
    }

    public void addExtraData(String str, String str2, boolean z) {
        if (this.extraData == null) {
            this.extraData = new HashMap();
        }
        if (this.extraData.containsKey(str) && z) {
            str2 = C0070b.m184f(new StringBuilder(), this.extraData.get(str), ",", str2);
        }
        this.extraData.put(str, str2);
    }

    public void authorize(Request request) {
        if (request != null) {
            if (this.pendingRequest != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            } else if (!AccessToken.isCurrentAccessTokenActive() || checkInternetPermission()) {
                this.pendingRequest = request;
                this.handlersToTry = getHandlersToTry(request);
                tryNextHandler();
            }
        }
    }

    public void cancelCurrentHandler() {
        if (this.currentHandler >= 0) {
            getCurrentHandler().cancel();
        }
    }

    public boolean checkInternetPermission() {
        if (this.checkedInternetPermission) {
            return true;
        }
        if (checkPermission("android.permission.INTERNET") != 0) {
            FragmentActivity activity = getActivity();
            complete(Result.createErrorResult(this.pendingRequest, activity.getString(R.string.com_facebook_internet_permission_error_title), activity.getString(R.string.com_facebook_internet_permission_error_message)));
            return false;
        }
        this.checkedInternetPermission = true;
        return true;
    }

    public int checkPermission(String str) {
        return getActivity().checkCallingOrSelfPermission(str);
    }

    public void complete(Result result) {
        LoginMethodHandler currentHandler2 = getCurrentHandler();
        if (currentHandler2 != null) {
            logAuthorizationMethodComplete(currentHandler2.getNameForLogging(), result, currentHandler2.getMethodLoggingExtras());
        }
        Map<String, String> map = this.loggingExtras;
        if (map != null) {
            result.loggingExtras = map;
        }
        Map<String, String> map2 = this.extraData;
        if (map2 != null) {
            result.extraData = map2;
        }
        this.handlersToTry = null;
        this.currentHandler = -1;
        this.pendingRequest = null;
        this.loggingExtras = null;
        this.numActivitiesReturned = 0;
        this.numTotalIntentsFired = 0;
        notifyOnCompleteListener(result);
    }

    public void completeAndValidate(Result result) {
        if (result.token == null || !AccessToken.isCurrentAccessTokenActive()) {
            complete(result);
        } else {
            validateSameFbidAndFinish(result);
        }
    }

    public int describeContents() {
        return 0;
    }

    public FragmentActivity getActivity() {
        return this.fragment.getActivity();
    }

    public C12297b getBackgroundProcessingListener() {
        return this.backgroundProcessingListener;
    }

    public LoginMethodHandler getCurrentHandler() {
        int i = this.currentHandler;
        if (i >= 0) {
            return this.handlersToTry[i];
        }
        return null;
    }

    public Fragment getFragment() {
        return this.fragment;
    }

    public LoginMethodHandler[] getHandlersToTry(Request request) {
        ArrayList arrayList = new ArrayList();
        LoginBehavior loginBehavior = request.getLoginBehavior();
        if (!request.isInstagramLogin()) {
            if (loginBehavior.allowsGetTokenAuth()) {
                arrayList.add(new GetTokenLoginMethodHandler(this));
            }
            if (!C13418j.f29397q && loginBehavior.allowsKatanaAuth()) {
                arrayList.add(new KatanaProxyLoginMethodHandler(this));
            }
            if (!C13418j.f29397q && loginBehavior.allowsFacebookLiteAuth()) {
                arrayList.add(new FacebookLiteLoginMethodHandler(this));
            }
        } else if (!C13418j.f29397q && loginBehavior.allowsInstagramAppAuth()) {
            arrayList.add(new InstagramAppLoginMethodHandler(this));
        }
        if (loginBehavior.allowsCustomTabAuth()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (loginBehavior.allowsWebViewAuth()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (!request.isInstagramLogin() && loginBehavior.allowsDeviceAuth()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        LoginMethodHandler[] loginMethodHandlerArr = new LoginMethodHandler[arrayList.size()];
        arrayList.toArray(loginMethodHandlerArr);
        return loginMethodHandlerArr;
    }

    public boolean getInProgress() {
        return this.pendingRequest != null && this.currentHandler >= 0;
    }

    public C12298c getOnCompletedListener() {
        return this.onCompletedListener;
    }

    public Request getPendingRequest() {
        return this.pendingRequest;
    }

    public void notifyBackgroundProcessingStart() {
        C12297b bVar = this.backgroundProcessingListener;
        if (bVar != null) {
            ((LoginFragment.C12300b) bVar).f27415a.setVisibility(0);
        }
    }

    public void notifyBackgroundProcessingStop() {
        C12297b bVar = this.backgroundProcessingListener;
        if (bVar != null) {
            ((LoginFragment.C12300b) bVar).f27415a.setVisibility(8);
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        this.numActivitiesReturned++;
        if (this.pendingRequest != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false)) {
                tryNextHandler();
                return false;
            } else if (!getCurrentHandler().shouldKeepTrackOfMultipleIntents() || intent != null || this.numActivitiesReturned >= this.numTotalIntentsFired) {
                return getCurrentHandler().onActivityResult(i, i2, intent);
            }
        }
        return false;
    }

    public void setBackgroundProcessingListener(C12297b bVar) {
        this.backgroundProcessingListener = bVar;
    }

    public void setFragment(Fragment fragment2) {
        if (this.fragment == null) {
            this.fragment = fragment2;
            return;
        }
        throw new FacebookException("Can't set fragment once it is already set.");
    }

    public void setOnCompletedListener(C12298c cVar) {
        this.onCompletedListener = cVar;
    }

    public void startOrContinueAuth(Request request) {
        if (!getInProgress()) {
            authorize(request);
        }
    }

    public boolean tryCurrentHandler() {
        LoginMethodHandler currentHandler2 = getCurrentHandler();
        if (!currentHandler2.needsInternetPermission() || checkInternetPermission()) {
            int tryAuthorize = currentHandler2.tryAuthorize(this.pendingRequest);
            this.numActivitiesReturned = 0;
            if (tryAuthorize > 0) {
                C12310d logger = getLogger();
                String authId = this.pendingRequest.getAuthId();
                String nameForLogging = currentHandler2.getNameForLogging();
                String str = this.pendingRequest.isFamilyLogin() ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start";
                logger.getClass();
                if (!C13080a.m20762b(logger)) {
                    try {
                        Bundle b = C12310d.m20137b(authId);
                        b.putString("3_method", nameForLogging);
                        logger.f27433a.mo46174a(b, str);
                    } catch (Throwable th) {
                        C13080a.m20761a(logger, th);
                    }
                }
                this.numTotalIntentsFired = tryAuthorize;
            } else {
                C12310d logger2 = getLogger();
                String authId2 = this.pendingRequest.getAuthId();
                String nameForLogging2 = currentHandler2.getNameForLogging();
                String str2 = this.pendingRequest.isFamilyLogin() ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried";
                logger2.getClass();
                if (!C13080a.m20762b(logger2)) {
                    try {
                        Bundle b2 = C12310d.m20137b(authId2);
                        b2.putString("3_method", nameForLogging2);
                        logger2.f27433a.mo46174a(b2, str2);
                    } catch (Throwable th2) {
                        C13080a.m20761a(logger2, th2);
                    }
                }
                addLoggingExtra("not_tried", currentHandler2.getNameForLogging(), true);
            }
            return tryAuthorize > 0;
        }
        addLoggingExtra("no_internet_permission", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false);
        return false;
    }

    public void tryNextHandler() {
        int i;
        if (this.currentHandler >= 0) {
            logAuthorizationMethodComplete(getCurrentHandler().getNameForLogging(), "skipped", (String) null, (String) null, getCurrentHandler().getMethodLoggingExtras());
        }
        do {
            LoginMethodHandler[] loginMethodHandlerArr = this.handlersToTry;
            if (loginMethodHandlerArr != null && (i = this.currentHandler) < loginMethodHandlerArr.length - 1) {
                this.currentHandler = i + 1;
            } else if (this.pendingRequest != null) {
                completeWithFailure();
                return;
            } else {
                return;
            }
        } while (!tryCurrentHandler());
    }

    public void validateSameFbidAndFinish(Result result) {
        Result result2;
        if (result.token != null) {
            AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
            AccessToken accessToken = result.token;
            if (!(currentAccessToken == null || accessToken == null)) {
                try {
                    if (currentAccessToken.getUserId().equals(accessToken.getUserId())) {
                        result2 = Result.createCompositeTokenResult(this.pendingRequest, result.token, result.authenticationToken);
                        complete(result2);
                        return;
                    }
                } catch (Exception e) {
                    complete(Result.createErrorResult(this.pendingRequest, "Caught exception", e.getMessage()));
                    return;
                }
            }
            result2 = Result.createErrorResult(this.pendingRequest, "User logged in as different Facebook user.", (String) null);
            complete(result2);
            return;
        }
        throw new FacebookException("Can't validate without a token");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.handlersToTry, i);
        parcel.writeInt(this.currentHandler);
        parcel.writeParcelable(this.pendingRequest, i);
        C12869i0.m20561Q(parcel, this.loggingExtras);
        C12869i0.m20561Q(parcel, this.extraData);
    }

    private void logAuthorizationMethodComplete(String str, String str2, String str3, String str4, Map<String, String> map) {
        String str5 = "fb_mobile_login_method_complete";
        if (this.pendingRequest == null) {
            getLogger().mo39614a(str5, str);
            return;
        }
        C12310d logger = getLogger();
        String authId = this.pendingRequest.getAuthId();
        if (this.pendingRequest.isFamilyLogin()) {
            str5 = "foa_mobile_login_method_complete";
        }
        logger.getClass();
        if (!C13080a.m20762b(logger)) {
            try {
                Bundle b = C12310d.m20137b(authId);
                if (str2 != null) {
                    b.putString("2_result", str2);
                }
                if (str3 != null) {
                    b.putString("5_error_message", str3);
                }
                if (str4 != null) {
                    b.putString("4_error_code", str4);
                }
                if (map != null && !map.isEmpty()) {
                    b.putString("6_extras", new JSONObject(map).toString());
                }
                b.putString("3_method", str);
                logger.f27433a.mo46174a(b, str5);
            } catch (Throwable th) {
                C13080a.m20761a(logger, th);
            }
        }
    }

    public LoginClient(Parcel parcel) {
        this.currentHandler = -1;
        this.numActivitiesReturned = 0;
        this.numTotalIntentsFired = 0;
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.handlersToTry = new LoginMethodHandler[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            LoginMethodHandler[] loginMethodHandlerArr = this.handlersToTry;
            LoginMethodHandler loginMethodHandler = (LoginMethodHandler) readParcelableArray[i];
            loginMethodHandlerArr[i] = loginMethodHandler;
            loginMethodHandler.setLoginClient(this);
        }
        this.currentHandler = parcel.readInt();
        this.pendingRequest = (Request) parcel.readParcelable(Request.class.getClassLoader());
        this.loggingExtras = C12869i0.m20558N(parcel);
        this.extraData = C12869i0.m20558N(parcel);
    }
}
