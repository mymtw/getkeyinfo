package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import com.paypal.openid.AuthorizationException;
import p365hg.C12865g0;
import p365hg.C12869i0;

public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    private void completeLogin(LoginClient.Result result) {
        if (result != null) {
            getLoginClient().completeAndValidate(result);
        } else {
            getLoginClient().tryNextHandler();
        }
    }

    public String getError(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error");
        return string == null ? bundle.getString("error_type") : string;
    }

    public String getErrorMessage(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString(ResponseConstants.ERROR_MESSAGE);
        return string == null ? bundle.getString(AuthorizationException.PARAM_ERROR_DESCRIPTION) : string;
    }

    public AccessTokenSource getTokenSource() {
        return AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }

    public void handleResultCancel(LoginClient.Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String error = getError(extras);
        String obj = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
        if (C12865g0.f28362c.equals(obj)) {
            completeLogin(LoginClient.Result.createErrorResult(request, error, getErrorMessage(extras), obj));
        }
        completeLogin(LoginClient.Result.createCancelResult(request, error));
    }

    public void handleResultError(LoginClient.Request request, String str, String str2, String str3) {
        if (str != null && str.equals("logged_out")) {
            CustomTabLoginMethodHandler.calledThroughLoggedOutAppSwitch = true;
            completeLogin((LoginClient.Result) null);
        } else if (C12865g0.f28360a.contains(str)) {
            completeLogin((LoginClient.Result) null);
        } else if (C12865g0.f28361b.contains(str)) {
            completeLogin(LoginClient.Result.createCancelResult(request, (String) null));
        } else {
            completeLogin(LoginClient.Result.createErrorResult(request, str, str2, str3));
        }
    }

    public void handleResultOk(LoginClient.Request request, Bundle bundle) {
        try {
            completeLogin(LoginClient.Result.createCompositeTokenResult(request, LoginMethodHandler.createAccessTokenFromWebBundle(request.getPermissions(), bundle, getTokenSource(), request.getApplicationId()), LoginMethodHandler.createAuthenticationTokenFromWebBundle(bundle, request.getNonce())));
        } catch (FacebookException e) {
            completeLogin(LoginClient.Result.createErrorResult(request, (String) null, e.getMessage()));
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        LoginClient.Request pendingRequest = getLoginClient().getPendingRequest();
        if (intent == null) {
            completeLogin(LoginClient.Result.createCancelResult(pendingRequest, "Operation canceled"));
        } else if (i2 == 0) {
            handleResultCancel(pendingRequest, intent);
        } else {
            String str = null;
            if (i2 != -1) {
                completeLogin(LoginClient.Result.createErrorResult(pendingRequest, "Unexpected resultCode from authorization.", (String) null));
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    completeLogin(LoginClient.Result.createErrorResult(pendingRequest, "Unexpected null from returned authorization data.", (String) null));
                    return true;
                }
                String error = getError(extras);
                if (extras.get("error_code") != null) {
                    str = extras.get("error_code").toString();
                }
                String errorMessage = getErrorMessage(extras);
                String string = extras.getString("e2e");
                if (!C12869i0.m20546B(string)) {
                    logWebLoginCompleted(string);
                }
                if (error == null && str == null && errorMessage == null) {
                    handleResultOk(pendingRequest, extras);
                } else {
                    handleResultError(pendingRequest, error, errorMessage, str);
                }
            }
        }
        return true;
    }

    public abstract int tryAuthorize(LoginClient.Request request);

    public boolean tryIntent(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            getLoginClient().getFragment().startActivityForResult(intent, i);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
