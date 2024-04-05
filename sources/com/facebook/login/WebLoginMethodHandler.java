package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.login.LoginClient;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.Scopes;
import java.util.Locale;
import java.util.Set;
import p365hg.C12869i0;
import p453tf.C13418j;
import p453tf.C13442y;

abstract class WebLoginMethodHandler extends LoginMethodHandler {
    private static final String WEB_VIEW_AUTH_HANDLER_STORE = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";
    private static final String WEB_VIEW_AUTH_HANDLER_TOKEN_KEY = "TOKEN";
    private String e2e;
    public AccessTokenSource tokenSource;

    public WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    private String loadCookieToken() {
        return getLoginClient().getActivity().getSharedPreferences(WEB_VIEW_AUTH_HANDLER_STORE, 0).getString(WEB_VIEW_AUTH_HANDLER_TOKEN_KEY, "");
    }

    private void saveCookieToken(String str) {
        getLoginClient().getActivity().getSharedPreferences(WEB_VIEW_AUTH_HANDLER_STORE, 0).edit().putString(WEB_VIEW_AUTH_HANDLER_TOKEN_KEY, str).apply();
    }

    public Bundle addExtraParameters(Bundle bundle, LoginClient.Request request) {
        bundle.putString("redirect_uri", getRedirectUrl());
        if (request.isInstagramLogin()) {
            bundle.putString("app_id", request.getApplicationId());
        } else {
            bundle.putString("client_id", request.getApplicationId());
        }
        getLoginClient();
        bundle.putString("e2e", LoginClient.getE2E());
        if (request.isInstagramLogin()) {
            bundle.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else if (request.getPermissions().contains(Scopes.OPEN_ID)) {
            bundle.putString("response_type", "id_token,token,signed_request,graph_domain");
            bundle.putString("nonce", request.getNonce());
        } else {
            bundle.putString("response_type", "token,signed_request,graph_domain");
        }
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", request.getAuthType());
        bundle.putString("login_behavior", request.getLoginBehavior().name());
        Locale locale = Locale.ROOT;
        String str = C13418j.f29381a;
        bundle.putString("sdk", String.format(locale, "android-%s", new Object[]{"12.3.0"}));
        if (getSSODevice() != null) {
            bundle.putString("sso", getSSODevice());
        }
        boolean z = C13418j.f29395o;
        String str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        bundle.putString("cct_prefetching", z ? str2 : "0");
        if (request.isFamilyLogin()) {
            bundle.putString("fx_app", request.getLoginTargetApp().toString());
        }
        if (request.shouldSkipAccountDeduplication()) {
            bundle.putString("skip_dedupe", "true");
        }
        if (request.getMessengerPageId() != null) {
            bundle.putString("messenger_page_id", request.getMessengerPageId());
            if (!request.getResetMessengerState()) {
                str2 = "0";
            }
            bundle.putString("reset_messenger_state", str2);
        }
        return bundle;
    }

    public Bundle getParameters(LoginClient.Request request) {
        Bundle bundle = new Bundle();
        Set<String> permissions = request.getPermissions();
        int i = C12869i0.f28368a;
        if (!(permissions == null || permissions.isEmpty())) {
            String join = TextUtils.join(",", request.getPermissions());
            bundle.putString("scope", join);
            addLoggingExtra("scope", join);
        }
        bundle.putString("default_audience", request.getDefaultAudience().getNativeProtocolAudience());
        bundle.putString("state", getClientState(request.getAuthId()));
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        String token = currentAccessToken != null ? currentAccessToken.getToken() : null;
        String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        if (token == null || !token.equals(loadCookieToken())) {
            C12869i0.m20565d(getLoginClient().getActivity());
            addLoggingExtra(AccessToken.ACCESS_TOKEN_KEY, "0");
        } else {
            bundle.putString(AccessToken.ACCESS_TOKEN_KEY, token);
            addLoggingExtra(AccessToken.ACCESS_TOKEN_KEY, str);
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        String str2 = C13418j.f29381a;
        if (!C13442y.m21140c()) {
            str = "0";
        }
        bundle.putString("ies", str);
        return bundle;
    }

    public String getRedirectUrl() {
        StringBuilder h = C0072d.m201h("fb");
        h.append(C13418j.m21107c());
        h.append("://authorize/");
        return h.toString();
    }

    public String getSSODevice() {
        return null;
    }

    public abstract AccessTokenSource getTokenSource();

    public void onComplete(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        LoginClient.Result result;
        String str;
        LoginClient loginClient = getLoginClient();
        this.e2e = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.e2e = bundle.getString("e2e");
            }
            try {
                AccessToken createAccessTokenFromWebBundle = LoginMethodHandler.createAccessTokenFromWebBundle(request.getPermissions(), bundle, getTokenSource(), request.getApplicationId());
                result = LoginClient.Result.createCompositeTokenResult(loginClient.getPendingRequest(), createAccessTokenFromWebBundle, LoginMethodHandler.createAuthenticationTokenFromWebBundle(bundle, request.getNonce()));
                CookieSyncManager.createInstance(loginClient.getActivity()).sync();
                if (createAccessTokenFromWebBundle != null) {
                    saveCookieToken(createAccessTokenFromWebBundle.getToken());
                }
            } catch (FacebookException e) {
                result = LoginClient.Result.createErrorResult(loginClient.getPendingRequest(), (String) null, e.getMessage());
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            result = LoginClient.Result.createCancelResult(loginClient.getPendingRequest(), "User canceled log in.");
        } else {
            this.e2e = null;
            String message = facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError requestError = ((FacebookServiceException) facebookException).getRequestError();
                str = String.format(Locale.ROOT, "%d", new Object[]{Integer.valueOf(requestError.getErrorCode())});
                message = requestError.toString();
            } else {
                str = null;
            }
            result = LoginClient.Result.createErrorResult(loginClient.getPendingRequest(), (String) null, message, str);
        }
        if (!C12869i0.m20546B(this.e2e)) {
            logWebLoginCompleted(this.e2e);
        }
        loginClient.completeAndValidate(result);
    }

    public WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
