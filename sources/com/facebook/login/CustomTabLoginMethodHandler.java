package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessTokenSource;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.login.LoginClient;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.math.BigInteger;
import java.util.Random;
import kotlin.jvm.internal.C19383o;
import org.json.JSONException;
import org.json.JSONObject;
import p365hg.C12847d;
import p365hg.C12850e;
import p365hg.C12869i0;
import p453tf.C13418j;

public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    private static final int API_EC_DIALOG_CANCEL = 4201;
    private static final int CHALLENGE_LENGTH = 20;
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new C12276a();
    private static final int CUSTOM_TAB_REQUEST_CODE = 1;
    public static final String OAUTH_DIALOG = "oauth";
    public static boolean calledThroughLoggedOutAppSwitch = false;
    private String currentPackage;
    private String expectedChallenge;
    private String validRedirectURI = "";

    /* renamed from: com.facebook.login.CustomTabLoginMethodHandler$a */
    public static class C12276a implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new CustomTabLoginMethodHandler(parcel);
        }

        public final Object[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
        }
    }

    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        int i = C12869i0.f28368a;
        String bigInteger = new BigInteger(100, new Random()).toString(32);
        C19383o.m32796f(bigInteger, "BigInteger(length * 5, r).toString(32)");
        this.expectedChallenge = bigInteger;
        calledThroughLoggedOutAppSwitch = false;
        this.validRedirectURI = C12850e.m20503c(getDeveloperDefinedRedirectURI());
    }

    private String getChromePackage() {
        String str = this.currentPackage;
        if (str != null) {
            return str;
        }
        String a = C12850e.m20501a();
        this.currentPackage = a;
        return a;
    }

    private String getDeveloperDefinedRedirectURI() {
        return super.getRedirectUrl();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onCustomTabComplete(java.lang.String r7, com.facebook.login.LoginClient.Request r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00bb
            java.lang.String r0 = "fbconnect://cct."
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = super.getRedirectUrl()
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x00bb
        L_0x0014:
            android.net.Uri r7 = android.net.Uri.parse(r7)
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = p365hg.C12869i0.m20554J(r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = p365hg.C12869i0.m20554J(r7)
            r0.putAll(r7)
            boolean r7 = r6.validateChallengeParam(r0)
            r1 = 0
            if (r7 != 0) goto L_0x003d
            com.facebook.FacebookException r7 = new com.facebook.FacebookException
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>((java.lang.String) r0)
            super.onComplete(r8, r1, r7)
            return
        L_0x003d:
            java.lang.String r7 = "error"
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L_0x004b
            java.lang.String r7 = "error_type"
            java.lang.String r7 = r0.getString(r7)
        L_0x004b:
            java.lang.String r2 = "error_msg"
            java.lang.String r2 = r0.getString(r2)
            if (r2 != 0) goto L_0x0059
            java.lang.String r2 = "error_message"
            java.lang.String r2 = r0.getString(r2)
        L_0x0059:
            if (r2 != 0) goto L_0x0061
            java.lang.String r2 = "error_description"
            java.lang.String r2 = r0.getString(r2)
        L_0x0061:
            java.lang.String r3 = "error_code"
            java.lang.String r3 = r0.getString(r3)
            boolean r4 = p365hg.C12869i0.m20546B(r3)
            r5 = -1
            if (r4 != 0) goto L_0x0073
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0073 }
            goto L_0x0074
        L_0x0073:
            r3 = r5
        L_0x0074:
            boolean r4 = p365hg.C12869i0.m20546B(r7)
            if (r4 == 0) goto L_0x0086
            boolean r4 = p365hg.C12869i0.m20546B(r2)
            if (r4 == 0) goto L_0x0086
            if (r3 != r5) goto L_0x0086
            super.onComplete(r8, r0, r1)
            goto L_0x00bb
        L_0x0086:
            if (r7 == 0) goto L_0x00a1
            java.lang.String r0 = "access_denied"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00a1
        L_0x0098:
            com.facebook.FacebookOperationCanceledException r7 = new com.facebook.FacebookOperationCanceledException
            r7.<init>()
            super.onComplete(r8, r1, r7)
            goto L_0x00bb
        L_0x00a1:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r3 != r0) goto L_0x00ae
            com.facebook.FacebookOperationCanceledException r7 = new com.facebook.FacebookOperationCanceledException
            r7.<init>()
            super.onComplete(r8, r1, r7)
            goto L_0x00bb
        L_0x00ae:
            com.facebook.FacebookRequestError r0 = new com.facebook.FacebookRequestError
            r0.<init>(r3, r7, r2)
            com.facebook.FacebookServiceException r7 = new com.facebook.FacebookServiceException
            r7.<init>(r0, r2)
            super.onComplete(r8, r1, r7)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.onCustomTabComplete(java.lang.String, com.facebook.login.LoginClient$Request):void");
    }

    private boolean validateChallengeParam(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.expectedChallenge);
        } catch (JSONException unused) {
            return false;
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getNameForLogging() {
        return "custom_tab";
    }

    public String getRedirectUrl() {
        return this.validRedirectURI;
    }

    public String getSSODevice() {
        return "chrome_custom_tab";
    }

    public AccessTokenSource getTokenSource() {
        return AccessTokenSource.CHROME_CUSTOM_TAB;
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false)) {
            return super.onActivityResult(i, i2, intent);
        }
        if (i != 1) {
            return super.onActivityResult(i, i2, intent);
        }
        LoginClient.Request pendingRequest = getLoginClient().getPendingRequest();
        String str = null;
        if (i2 == -1) {
            if (intent != null) {
                str = intent.getStringExtra(CustomTabMainActivity.EXTRA_URL);
            }
            onCustomTabComplete(str, pendingRequest);
            return true;
        }
        super.onComplete(pendingRequest, (Bundle) null, new FacebookOperationCanceledException());
        return false;
    }

    public void putChallengeParam(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.expectedChallenge);
    }

    public int tryAuthorize(LoginClient.Request request) {
        LoginClient loginClient = getLoginClient();
        if (getRedirectUrl().isEmpty()) {
            return 0;
        }
        Bundle addExtraParameters = addExtraParameters(getParameters(request), request);
        if (calledThroughLoggedOutAppSwitch) {
            addExtraParameters.putString("cct_over_app_switch", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (C13418j.f29395o) {
            if (request.isInstagramLogin()) {
                CustomTabPrefetchHelper.mayLaunchUrl(C12847d.m20499a(addExtraParameters, OAUTH_DIALOG));
            } else {
                CustomTabPrefetchHelper.mayLaunchUrl(C12847d.m20499a(addExtraParameters, OAUTH_DIALOG));
            }
        }
        Intent intent = new Intent(loginClient.getActivity(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.EXTRA_ACTION, OAUTH_DIALOG);
        intent.putExtra(CustomTabMainActivity.EXTRA_PARAMS, addExtraParameters);
        intent.putExtra(CustomTabMainActivity.EXTRA_CHROME_PACKAGE, getChromePackage());
        intent.putExtra(CustomTabMainActivity.EXTRA_TARGET_APP, request.getLoginTargetApp().toString());
        loginClient.getFragment().startActivityForResult(intent, 1);
        return 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.expectedChallenge);
    }

    public CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.expectedChallenge = parcel.readString();
    }
}
