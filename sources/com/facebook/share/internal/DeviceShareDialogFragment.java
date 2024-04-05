package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.net.nsd.NsdManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p358gg.C12797a;
import p365hg.C12869i0;
import p365hg.C12879l0;
import p401mg.C13080a;
import p453tf.C13418j;

@Deprecated
public class DeviceShareDialogFragment extends DialogFragment {
    private static final String DEVICE_SHARE_ENDPOINT = "device/share";
    private static final String EXTRA_ERROR = "error";
    private static final String REQUEST_STATE_KEY = "request_state";
    public static final String TAG = "DeviceShareDialogFragment";
    private static ScheduledThreadPoolExecutor backgroundExecutor;
    private volatile ScheduledFuture codeExpiredFuture;
    private TextView confirmationCode;
    private volatile RequestState currentRequestState;
    /* access modifiers changed from: private */
    public Dialog dialog;
    private ProgressBar progressBar;
    private ShareContent shareContent;

    public static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new C12338a();

        /* renamed from: b */
        public String f27497b;

        /* renamed from: c */
        public long f27498c;

        /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$RequestState$a */
        public static class C12338a implements Parcelable.Creator<RequestState> {
            public final Object createFromParcel(Parcel parcel) {
                return new RequestState(parcel);
            }

            public final Object[] newArray(int i) {
                return new RequestState[i];
            }
        }

        public RequestState() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f27497b);
            parcel.writeLong(this.f27498c);
        }

        public RequestState(Parcel parcel) {
            this.f27497b = parcel.readString();
            this.f27498c = parcel.readLong();
        }
    }

    /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$a */
    public class C12339a implements View.OnClickListener {
        public C12339a() {
        }

        public final void onClick(View view) {
            if (!C13080a.m20762b(this)) {
                try {
                    DeviceShareDialogFragment.this.dialog.dismiss();
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$b */
    public class C12340b implements GraphRequest.C12195b {
        public C12340b() {
        }

        /* renamed from: a */
        public final void mo39238a(GraphResponse graphResponse) {
            FacebookRequestError facebookRequestError = graphResponse.f27247d;
            if (facebookRequestError != null) {
                DeviceShareDialogFragment.this.finishActivityWithError(facebookRequestError);
                return;
            }
            JSONObject jSONObject = graphResponse.f27246c;
            RequestState requestState = new RequestState();
            try {
                requestState.f27497b = jSONObject.getString("user_code");
                requestState.f27498c = jSONObject.getLong(AccessToken.EXPIRES_IN_KEY);
                DeviceShareDialogFragment.this.setCurrentRequestState(requestState);
            } catch (JSONException unused) {
                DeviceShareDialogFragment.this.finishActivityWithError(new FacebookRequestError(0, "", "Malformed server response"));
            }
        }
    }

    /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$c */
    public class C12341c implements Runnable {
        public C12341c() {
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    DeviceShareDialogFragment.this.dialog.dismiss();
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    private void detach() {
        if (isAdded()) {
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.getClass();
            C2740a aVar = new C2740a(fragmentManager);
            aVar.mo10490n(this);
            aVar.mo10483d();
        }
    }

    private void finishActivity(int i, Intent intent) {
        if (this.currentRequestState != null) {
            C12797a.m20437a(this.currentRequestState.f27497b);
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra("error");
        if (facebookRequestError != null) {
            Toast.makeText(getContext(), facebookRequestError.getErrorMessage(), 0).show();
        }
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            activity.setResult(i, intent);
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    public void finishActivityWithError(FacebookRequestError facebookRequestError) {
        detach();
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        finishActivity(-1, intent);
    }

    private static synchronized ScheduledThreadPoolExecutor getBackgroundExecutor() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceShareDialogFragment.class) {
            if (backgroundExecutor == null) {
                backgroundExecutor = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = backgroundExecutor;
        }
        return scheduledThreadPoolExecutor;
    }

    private Bundle getGraphParametersForShareContent() {
        ShareContent shareContent2 = this.shareContent;
        String str = null;
        if (shareContent2 == null) {
            return null;
        }
        if (shareContent2 instanceof ShareLinkContent) {
            ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent2;
            Bundle bundle = new Bundle();
            ShareHashtag shareHashtag = shareLinkContent.getShareHashtag();
            if (shareHashtag != null) {
                str = shareHashtag.getHashtag();
            }
            C12869i0.m20556L("hashtag", bundle, str);
            Uri contentUrl = shareLinkContent.getContentUrl();
            if (contentUrl != null) {
                C12869i0.m20556L("href", bundle, contentUrl.toString());
            }
            C12869i0.m20556L("quote", bundle, shareLinkContent.getQuote());
            return bundle;
        } else if (!(shareContent2 instanceof ShareOpenGraphContent)) {
            return null;
        } else {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent2;
            Bundle bundle2 = new Bundle();
            ShareHashtag shareHashtag2 = shareOpenGraphContent.getShareHashtag();
            C12869i0.m20556L("hashtag", bundle2, shareHashtag2 != null ? shareHashtag2.getHashtag() : null);
            ShareOpenGraphAction action = shareOpenGraphContent.getAction();
            C12869i0.m20556L("action_type", bundle2, action != null ? action.getActionType() : null);
            try {
                JSONObject f = C12378m.m20218f(C12378m.m20219g(shareOpenGraphContent), false);
                if (f != null) {
                    str = f.toString();
                }
                C12869i0.m20556L("action_properties", bundle2, str);
                return bundle2;
            } catch (JSONException e) {
                throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", (Throwable) e);
            }
        }
    }

    /* access modifiers changed from: private */
    public void setCurrentRequestState(RequestState requestState) {
        this.currentRequestState = requestState;
        this.confirmationCode.setText(requestState.f27497b);
        this.confirmationCode.setVisibility(0);
        this.progressBar.setVisibility(8);
        this.codeExpiredFuture = getBackgroundExecutor().schedule(new C12341c(), requestState.f27498c, TimeUnit.SECONDS);
    }

    private void startShare() {
        Bundle graphParametersForShareContent = getGraphParametersForShareContent();
        if (graphParametersForShareContent == null || graphParametersForShareContent.size() == 0) {
            finishActivityWithError(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        StringBuilder sb = new StringBuilder();
        String str = C12879l0.f28392a;
        sb.append(C13418j.m21107c());
        sb.append("|");
        C12879l0.m20603g();
        String str2 = C13418j.f29386f;
        if (str2 != null) {
            sb.append(str2);
            graphParametersForShareContent.putString(AccessToken.ACCESS_TOKEN_KEY, sb.toString());
            HashMap<String, NsdManager.RegistrationListener> hashMap = C12797a.f28269a;
            Class<C12797a> cls = C12797a.class;
            String str3 = null;
            if (!C13080a.m20762b(cls)) {
                try {
                    str3 = C12797a.m20439c((Map<String, String>) null);
                } catch (Throwable th) {
                    C13080a.m20761a(cls, th);
                }
            }
            graphParametersForShareContent.putString("device_info", str3);
            new GraphRequest((AccessToken) null, DEVICE_SHARE_ENDPOINT, graphParametersForShareContent, HttpMethod.POST, new C12340b()).mo39227d();
            return;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.".toString());
    }

    public Dialog onCreateDialog(Bundle bundle) {
        this.dialog = new Dialog(getActivity(), R.style.com_facebook_auth_dialog);
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        this.progressBar = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        this.confirmationCode = (TextView) inflate.findViewById(R.id.confirmation_code);
        ((Button) inflate.findViewById(R.id.cancel_button)).setOnClickListener(new C12339a());
        ((TextView) inflate.findViewById(R.id.com_facebook_device_auth_instructions)).setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        this.dialog.setContentView(inflate);
        startShare();
        return this.dialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (!(bundle == null || (requestState = (RequestState) bundle.getParcelable(REQUEST_STATE_KEY)) == null)) {
            setCurrentRequestState(requestState);
        }
        return onCreateView;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.codeExpiredFuture != null) {
            this.codeExpiredFuture.cancel(true);
        }
        finishActivity(-1, new Intent());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.currentRequestState != null) {
            bundle.putParcelable(REQUEST_STATE_KEY, this.currentRequestState);
        }
    }

    public void setShareContent(ShareContent shareContent2) {
        this.shareContent = shareContent2;
    }
}
