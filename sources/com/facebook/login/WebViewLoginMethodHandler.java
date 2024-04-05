package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.WebDialog;
import com.facebook.login.LoginClient;
import p365hg.C12869i0;

class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new C12305b();

    /* renamed from: b */
    public WebDialog f27416b;

    /* renamed from: c */
    public String f27417c;

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$a */
    public class C12304a implements WebDialog.C12268e {

        /* renamed from: a */
        public final /* synthetic */ LoginClient.Request f27418a;

        public C12304a(LoginClient.Request request) {
            this.f27418a = request;
        }

        /* renamed from: a */
        public final void mo39379a(Bundle bundle, FacebookException facebookException) {
            WebViewLoginMethodHandler.this.mo39608a(this.f27418a, bundle, facebookException);
        }
    }

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$b */
    public static class C12305b implements Parcelable.Creator<WebViewLoginMethodHandler> {
        public final Object createFromParcel(Parcel parcel) {
            return new WebViewLoginMethodHandler(parcel);
        }

        public final Object[] newArray(int i) {
            return new WebViewLoginMethodHandler[i];
        }
    }

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$c */
    public static class C12306c extends WebDialog.C12264a {

        /* renamed from: e */
        public String f27420e;

        /* renamed from: f */
        public String f27421f;

        /* renamed from: g */
        public String f27422g = "fbconnect://success";

        /* renamed from: h */
        public LoginBehavior f27423h = LoginBehavior.NATIVE_WITH_FALLBACK;

        /* renamed from: i */
        public LoginTargetApp f27424i = LoginTargetApp.FACEBOOK;

        /* renamed from: j */
        public boolean f27425j = false;

        /* renamed from: k */
        public boolean f27426k = false;

        public C12306c(FragmentActivity fragmentActivity, String str, Bundle bundle) {
            super(fragmentActivity, str, bundle, 0);
        }

        /* renamed from: a */
        public final WebDialog mo39612a() {
            Bundle bundle = this.f27361d;
            bundle.putString("redirect_uri", this.f27422g);
            bundle.putString("client_id", this.f27359b);
            bundle.putString("e2e", this.f27420e);
            bundle.putString("response_type", this.f27424i == LoginTargetApp.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
            bundle.putString("return_scopes", "true");
            bundle.putString("auth_type", this.f27421f);
            bundle.putString("login_behavior", this.f27423h.name());
            if (this.f27425j) {
                bundle.putString("fx_app", this.f27424i.toString());
            }
            if (this.f27426k) {
                bundle.putString("skip_dedupe", "true");
            }
            return WebDialog.newInstance(this.f27358a, CustomTabLoginMethodHandler.OAUTH_DIALOG, bundle, 0, this.f27424i, this.f27360c);
        }
    }

    public WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: a */
    public final void mo39608a(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        super.onComplete(request, bundle, facebookException);
    }

    public final void cancel() {
        WebDialog webDialog = this.f27416b;
        if (webDialog != null) {
            webDialog.cancel();
            this.f27416b = null;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String getNameForLogging() {
        return "web_view";
    }

    public final AccessTokenSource getTokenSource() {
        return AccessTokenSource.WEB_VIEW;
    }

    public final boolean needsInternetPermission() {
        return true;
    }

    public final int tryAuthorize(LoginClient.Request request) {
        Bundle parameters = getParameters(request);
        C12304a aVar = new C12304a(request);
        String e2e = LoginClient.getE2E();
        this.f27417c = e2e;
        addLoggingExtra("e2e", e2e);
        FragmentActivity activity = getLoginClient().getActivity();
        boolean y = C12869i0.m20586y(activity);
        C12306c cVar = new C12306c(activity, request.getApplicationId(), parameters);
        cVar.f27420e = this.f27417c;
        cVar.f27422g = y ? "fbconnect://chrome_os_success" : "fbconnect://success";
        cVar.f27421f = request.getAuthType();
        cVar.f27423h = request.getLoginBehavior();
        cVar.f27424i = request.getLoginTargetApp();
        cVar.f27425j = request.isFamilyLogin();
        cVar.f27426k = request.shouldSkipAccountDeduplication();
        cVar.f27360c = aVar;
        this.f27416b = cVar.mo39612a();
        FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
        facebookDialogFragment.setRetainInstance(true);
        facebookDialogFragment.setInnerDialog(this.f27416b);
        facebookDialogFragment.show(activity.getSupportFragmentManager(), FacebookDialogFragment.TAG);
        return 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f27417c);
    }

    public WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f27417c = parcel.readString();
    }
}
