package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.google.android.gms.common.Scopes;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import org.json.JSONException;
import org.json.JSONObject;
import p365hg.C12869i0;

public final class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new GetTokenLoginMethodHandler$Companion$CREATOR$1();
    public static final C12289a Companion = new C12289a();
    private GetTokenClient getTokenClient;
    private final String nameForLogging = "get_token";

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$a */
    public static final class C12289a {
    }

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$b */
    public static final class C12290b implements C12869i0.C12870a {

        /* renamed from: a */
        public final /* synthetic */ GetTokenLoginMethodHandler f27409a;

        /* renamed from: b */
        public final /* synthetic */ Bundle f27410b;

        /* renamed from: c */
        public final /* synthetic */ LoginClient.Request f27411c;

        public C12290b(GetTokenLoginMethodHandler getTokenLoginMethodHandler, Bundle bundle, LoginClient.Request request) {
            this.f27409a = getTokenLoginMethodHandler;
            this.f27410b = bundle;
            this.f27411c = request;
        }

        /* renamed from: a */
        public final void mo39272a(JSONObject jSONObject) {
            try {
                this.f27410b.putString("com.facebook.platform.extra.USER_ID", jSONObject != null ? jSONObject.getString("id") : null);
                this.f27409a.onComplete(this.f27411c, this.f27410b);
            } catch (JSONException e) {
                this.f27409a.getLoginClient().complete(LoginClient.Result.createErrorResult(this.f27409a.getLoginClient().getPendingRequest(), "Caught exception", e.getMessage()));
            }
        }

        /* renamed from: b */
        public final void mo39273b(FacebookException facebookException) {
            this.f27409a.getLoginClient().complete(LoginClient.Result.createErrorResult(this.f27409a.getLoginClient().getPendingRequest(), "Caught exception", facebookException != null ? facebookException.getMessage() : null));
        }
    }

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$c */
    public static final class C12291c implements PlatformServiceClient.C12262a {

        /* renamed from: a */
        public final /* synthetic */ GetTokenLoginMethodHandler f27412a;

        /* renamed from: b */
        public final /* synthetic */ LoginClient.Request f27413b;

        public C12291c(GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
            this.f27412a = getTokenLoginMethodHandler;
            this.f27413b = request;
        }

        /* renamed from: a */
        public final void mo39408a(Bundle bundle) {
            this.f27412a.getTokenCompleted(this.f27413b, bundle);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        C19383o.m32797g(loginClient, "loginClient");
    }

    public void cancel() {
        GetTokenClient getTokenClient2 = this.getTokenClient;
        if (getTokenClient2 != null) {
            getTokenClient2.cancel();
            getTokenClient2.setCompletedListener((PlatformServiceClient.C12262a) null);
            this.getTokenClient = null;
        }
    }

    public final void complete(LoginClient.Request request, Bundle bundle) {
        C19383o.m32797g(request, LoginFragment.EXTRA_REQUEST);
        C19383o.m32797g(bundle, "result");
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string == null || string.length() == 0) {
            getLoginClient().notifyBackgroundProcessingStart();
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            if (string2 != null) {
                C12869i0.m20578q(new C12290b(this, bundle, request), string2);
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        onComplete(request, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public String getNameForLogging() {
        return this.nameForLogging;
    }

    public final void getTokenCompleted(LoginClient.Request request, Bundle bundle) {
        C19383o.m32797g(request, LoginFragment.EXTRA_REQUEST);
        GetTokenClient getTokenClient2 = this.getTokenClient;
        if (getTokenClient2 != null) {
            getTokenClient2.setCompletedListener((PlatformServiceClient.C12262a) null);
        }
        this.getTokenClient = null;
        getLoginClient().notifyBackgroundProcessingStop();
        if (bundle != null) {
            List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            if (stringArrayList == null) {
                stringArrayList = EmptyList.INSTANCE;
            }
            Set<String> permissions = request.getPermissions();
            if (permissions == null) {
                permissions = EmptySet.INSTANCE;
            }
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (permissions.contains(Scopes.OPEN_ID)) {
                if (string == null || string.length() == 0) {
                    getLoginClient().tryNextHandler();
                    return;
                }
            }
            if (stringArrayList.containsAll(permissions)) {
                complete(request, bundle);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : permissions) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                addLoggingExtra("new_permissions", TextUtils.join(",", hashSet));
            }
            request.setPermissions(hashSet);
        }
        getLoginClient().tryNextHandler();
    }

    public final void onComplete(LoginClient.Request request, Bundle bundle) {
        LoginClient.Result result;
        C19383o.m32797g(request, LoginFragment.EXTRA_REQUEST);
        C19383o.m32797g(bundle, "result");
        try {
            LoginMethodHandler.C12301a aVar = LoginMethodHandler.Companion;
            AccessTokenSource accessTokenSource = AccessTokenSource.FACEBOOK_APPLICATION_SERVICE;
            String applicationId = request.getApplicationId();
            C19383o.m32796f(applicationId, "request.applicationId");
            aVar.getClass();
            result = LoginClient.Result.createCompositeTokenResult(request, LoginMethodHandler.C12301a.m20131a(bundle, accessTokenSource, applicationId), LoginMethodHandler.C12301a.m20132b(bundle, request.getNonce()));
        } catch (FacebookException e) {
            result = LoginClient.Result.createErrorResult(getLoginClient().getPendingRequest(), (String) null, e.getMessage());
        }
        getLoginClient().completeAndValidate(result);
    }

    public int tryAuthorize(LoginClient.Request request) {
        C19383o.m32797g(request, LoginFragment.EXTRA_REQUEST);
        FragmentActivity activity = getLoginClient().getActivity();
        C19383o.m32796f(activity, "loginClient.activity");
        GetTokenClient getTokenClient2 = new GetTokenClient(activity, request);
        this.getTokenClient = getTokenClient2;
        if (!getTokenClient2.start()) {
            return 0;
        }
        getLoginClient().notifyBackgroundProcessingStart();
        C12291c cVar = new C12291c(this, request);
        GetTokenClient getTokenClient3 = this.getTokenClient;
        if (getTokenClient3 == null) {
            return 1;
        }
        getTokenClient3.setCompletedListener(cVar);
        return 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C19383o.m32797g(parcel, "source");
    }
}
