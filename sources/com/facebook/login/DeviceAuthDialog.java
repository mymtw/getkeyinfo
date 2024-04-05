package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.login.LoginClient;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p358gg.C12797a;
import p365hg.C12869i0;
import p365hg.C12879l0;
import p401mg.C13080a;
import p453tf.C13418j;

public class DeviceAuthDialog extends DialogFragment {
    private static final String DEVICE_LOGIN_ENDPOINT = "device/login";
    private static final String DEVICE_LOGIN_STATUS_ENDPOINT = "device/login_status";
    private static final int LOGIN_ERROR_SUBCODE_AUTHORIZATION_DECLINED = 1349173;
    private static final int LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING = 1349174;
    private static final int LOGIN_ERROR_SUBCODE_CODE_EXPIRED = 1349152;
    private static final int LOGIN_ERROR_SUBCODE_EXCESSIVE_POLLING = 1349172;
    private static final String REQUEST_STATE_KEY = "request_state";
    /* access modifiers changed from: private */
    public AtomicBoolean completed = new AtomicBoolean();
    private TextView confirmationCode;
    private volatile GraphRequestAsyncTask currentGraphRequestPoll;
    /* access modifiers changed from: private */
    public volatile RequestState currentRequestState;
    private DeviceAuthMethodHandler deviceAuthMethodHandler;
    private TextView instructions;
    /* access modifiers changed from: private */
    public boolean isBeingDestroyed = false;
    /* access modifiers changed from: private */
    public boolean isRetry = false;
    /* access modifiers changed from: private */
    public LoginClient.Request mRequest = null;
    private View progressBar;
    private volatile ScheduledFuture scheduledPoll;

    public static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new C12278a();

        /* renamed from: b */
        public String f27387b;

        /* renamed from: c */
        public String f27388c;

        /* renamed from: d */
        public String f27389d;

        /* renamed from: e */
        public long f27390e;

        /* renamed from: f */
        public long f27391f;

        /* renamed from: com.facebook.login.DeviceAuthDialog$RequestState$a */
        public static class C12278a implements Parcelable.Creator<RequestState> {
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
            parcel.writeString(this.f27387b);
            parcel.writeString(this.f27388c);
            parcel.writeString(this.f27389d);
            parcel.writeLong(this.f27390e);
            parcel.writeLong(this.f27391f);
        }

        public RequestState(Parcel parcel) {
            this.f27387b = parcel.readString();
            this.f27388c = parcel.readString();
            this.f27389d = parcel.readString();
            this.f27390e = parcel.readLong();
            this.f27391f = parcel.readLong();
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$a */
    public class C12279a extends Dialog {
        public C12279a(FragmentActivity fragmentActivity) {
            super(fragmentActivity, R.style.com_facebook_auth_dialog);
        }

        public final void onBackPressed() {
            DeviceAuthDialog.this.onBackButtonPressed();
            super.onBackPressed();
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$b */
    public class C12280b implements GraphRequest.C12195b {
        public C12280b() {
        }

        /* renamed from: a */
        public final void mo39238a(GraphResponse graphResponse) {
            if (!DeviceAuthDialog.this.isBeingDestroyed) {
                FacebookRequestError facebookRequestError = graphResponse.f27247d;
                if (facebookRequestError != null) {
                    DeviceAuthDialog.this.onError(facebookRequestError.getException());
                    return;
                }
                JSONObject jSONObject = graphResponse.f27246c;
                RequestState requestState = new RequestState();
                try {
                    String string = jSONObject.getString("user_code");
                    requestState.f27388c = string;
                    requestState.f27387b = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[]{string});
                    requestState.f27389d = jSONObject.getString(ResponseConstants.CODE);
                    requestState.f27390e = jSONObject.getLong("interval");
                    DeviceAuthDialog.this.setCurrentRequestState(requestState);
                } catch (JSONException e) {
                    DeviceAuthDialog.this.onError(new FacebookException((Throwable) e));
                }
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$c */
    public class C12281c implements View.OnClickListener {
        public C12281c() {
        }

        public final void onClick(View view) {
            if (!C13080a.m20762b(this)) {
                try {
                    DeviceAuthDialog.this.onCancel();
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$d */
    public class C12282d implements Runnable {
        public C12282d() {
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    DeviceAuthDialog.this.poll();
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$e */
    public class C12283e implements GraphRequest.C12195b {
        public C12283e() {
        }

        /* renamed from: a */
        public final void mo39238a(GraphResponse graphResponse) {
            if (!DeviceAuthDialog.this.completed.get()) {
                FacebookRequestError facebookRequestError = graphResponse.f27247d;
                if (facebookRequestError != null) {
                    int subErrorCode = facebookRequestError.getSubErrorCode();
                    if (subErrorCode != DeviceAuthDialog.LOGIN_ERROR_SUBCODE_CODE_EXPIRED) {
                        switch (subErrorCode) {
                            case DeviceAuthDialog.LOGIN_ERROR_SUBCODE_EXCESSIVE_POLLING /*1349172*/:
                            case DeviceAuthDialog.LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING /*1349174*/:
                                DeviceAuthDialog.this.schedulePoll();
                                return;
                            case DeviceAuthDialog.LOGIN_ERROR_SUBCODE_AUTHORIZATION_DECLINED /*1349173*/:
                                DeviceAuthDialog.this.onCancel();
                                return;
                            default:
                                DeviceAuthDialog.this.onError(graphResponse.f27247d.getException());
                                return;
                        }
                    } else {
                        if (DeviceAuthDialog.this.currentRequestState != null) {
                            C12797a.m20437a(DeviceAuthDialog.this.currentRequestState.f27388c);
                        }
                        if (DeviceAuthDialog.this.mRequest != null) {
                            DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
                            deviceAuthDialog.startLogin(deviceAuthDialog.mRequest);
                            return;
                        }
                        DeviceAuthDialog.this.onCancel();
                    }
                } else {
                    try {
                        JSONObject jSONObject = graphResponse.f27246c;
                        DeviceAuthDialog.this.onSuccess(jSONObject.getString(AccessToken.ACCESS_TOKEN_KEY), Long.valueOf(jSONObject.getLong(AccessToken.EXPIRES_IN_KEY)), Long.valueOf(jSONObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
                    } catch (JSONException e) {
                        DeviceAuthDialog.this.onError(new FacebookException((Throwable) e));
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$f */
    public class C12284f implements DialogInterface.OnClickListener {
        public C12284f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            DeviceAuthDialog.this.getDialog().setContentView(DeviceAuthDialog.this.initializeContentView(false));
            DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
            deviceAuthDialog.startLogin(deviceAuthDialog.mRequest);
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$g */
    public class C12285g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ String f27398b;

        /* renamed from: c */
        public final /* synthetic */ C12869i0.C12871b f27399c;

        /* renamed from: d */
        public final /* synthetic */ String f27400d;

        /* renamed from: e */
        public final /* synthetic */ Date f27401e;

        /* renamed from: f */
        public final /* synthetic */ Date f27402f;

        public C12285g(String str, C12869i0.C12871b bVar, String str2, Date date, Date date2) {
            this.f27398b = str;
            this.f27399c = bVar;
            this.f27400d = str2;
            this.f27401e = date;
            this.f27402f = date2;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            DeviceAuthDialog.this.completeLogin(this.f27398b, this.f27399c, this.f27400d, this.f27401e, this.f27402f);
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$h */
    public class C12286h implements GraphRequest.C12195b {

        /* renamed from: a */
        public final /* synthetic */ String f27404a;

        /* renamed from: b */
        public final /* synthetic */ Date f27405b;

        /* renamed from: c */
        public final /* synthetic */ Date f27406c;

        public C12286h(String str, Date date, Date date2) {
            this.f27404a = str;
            this.f27405b = date;
            this.f27406c = date2;
        }

        /* renamed from: a */
        public final void mo39238a(GraphResponse graphResponse) {
            if (!DeviceAuthDialog.this.completed.get()) {
                FacebookRequestError facebookRequestError = graphResponse.f27247d;
                if (facebookRequestError != null) {
                    DeviceAuthDialog.this.onError(facebookRequestError.getException());
                    return;
                }
                try {
                    JSONObject jSONObject = graphResponse.f27246c;
                    String string = jSONObject.getString("id");
                    C12869i0.C12871b u = C12869i0.m20582u(jSONObject);
                    String string2 = jSONObject.getString("name");
                    C12797a.m20437a(DeviceAuthDialog.this.currentRequestState.f27388c);
                    if (!FetchedAppSettingsManager.m20104b(C13418j.m21107c()).f28401e.contains(SmartLoginOption.RequireConfirm) || DeviceAuthDialog.this.isRetry) {
                        DeviceAuthDialog.this.completeLogin(string, u, this.f27404a, this.f27405b, this.f27406c);
                        return;
                    }
                    boolean unused = DeviceAuthDialog.this.isRetry = true;
                    DeviceAuthDialog.this.presentConfirmation(string, u, this.f27404a, string2, this.f27405b, this.f27406c);
                } catch (JSONException e) {
                    DeviceAuthDialog.this.onError(new FacebookException((Throwable) e));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void completeLogin(String str, C12869i0.C12871b bVar, String str2, Date date, Date date2) {
        C12869i0.C12871b bVar2 = bVar;
        DeviceAuthMethodHandler deviceAuthMethodHandler2 = this.deviceAuthMethodHandler;
        String c = C13418j.m21107c();
        List<String> list = bVar2.f28376a;
        List<String> list2 = bVar2.f28377b;
        List<String> list3 = bVar2.f28378c;
        AccessTokenSource accessTokenSource = AccessTokenSource.DEVICE_AUTH;
        deviceAuthMethodHandler2.getClass();
        deviceAuthMethodHandler2.getLoginClient().completeAndValidate(LoginClient.Result.createTokenResult(deviceAuthMethodHandler2.getLoginClient().getPendingRequest(), new AccessToken(str2, c, str, list, list2, list3, accessTokenSource, date, (Date) null, date2)));
        getDialog().dismiss();
    }

    private GraphRequest getPollRequest() {
        Bundle bundle = new Bundle();
        bundle.putString(ResponseConstants.CODE, this.currentRequestState.f27389d);
        return new GraphRequest((AccessToken) null, DEVICE_LOGIN_STATUS_ENDPOINT, bundle, HttpMethod.POST, new C12283e());
    }

    /* access modifiers changed from: private */
    public void onSuccess(String str, Long l, Long l2) {
        Date date;
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date2 = null;
        if (l.longValue() != 0) {
            date = new Date((l.longValue() * 1000) + new Date().getTime());
        } else {
            date = null;
        }
        if (l2.longValue() != 0) {
            date2 = new Date(l2.longValue() * 1000);
        }
        new GraphRequest(new AccessToken(str, C13418j.m21107c(), "0", (Collection<String>) null, (Collection<String>) null, (Collection<String>) null, (AccessTokenSource) null, date, (Date) null, date2), "me", bundle, HttpMethod.GET, new C12286h(str, date, date2)).mo39227d();
    }

    /* access modifiers changed from: private */
    public void poll() {
        this.currentRequestState.f27391f = new Date().getTime();
        this.currentGraphRequestPoll = getPollRequest().mo39227d();
    }

    /* access modifiers changed from: private */
    public void presentConfirmation(String str, C12869i0.C12871b bVar, String str2, String str3, Date date, Date date2) {
        String string = getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
        String string2 = getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
        String string3 = getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
        String format = String.format(string2, new Object[]{str3});
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new C12285g(str, bVar, str2, date, date2)).setPositiveButton(string3, new C12284f());
        builder.create().show();
    }

    /* access modifiers changed from: private */
    public void schedulePoll() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = DeviceAuthMethodHandler.f27408b;
        synchronized (DeviceAuthMethodHandler.class) {
            if (DeviceAuthMethodHandler.f27408b == null) {
                DeviceAuthMethodHandler.f27408b = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = DeviceAuthMethodHandler.f27408b;
        }
        this.scheduledPoll = scheduledThreadPoolExecutor.schedule(new C12282d(), this.currentRequestState.f27390e, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCurrentRequestState(com.facebook.login.DeviceAuthDialog.RequestState r14) {
        /*
            r13 = this;
            java.lang.Class<gg.a> r0 = p358gg.C12797a.class
            r13.currentRequestState = r14
            android.widget.TextView r1 = r13.confirmationCode
            java.lang.String r2 = r14.f27388c
            r1.setText(r2)
            java.lang.String r1 = r14.f27387b
            java.util.HashMap<java.lang.String, android.net.nsd.NsdManager$RegistrationListener> r2 = p358gg.C12797a.f28269a
            boolean r2 = p401mg.C13080a.m20762b(r0)
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0018
            goto L_0x006b
        L_0x0018:
            java.util.EnumMap r2 = new java.util.EnumMap     // Catch:{ all -> 0x0067 }
            java.lang.Class<com.google.zxing.EncodeHintType> r5 = com.google.zxing.EncodeHintType.class
            r2.<init>(r5)     // Catch:{ all -> 0x0067 }
            com.google.zxing.EncodeHintType r5 = com.google.zxing.EncodeHintType.MARGIN     // Catch:{ all -> 0x0067 }
            r6 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0067 }
            r2.put(r5, r6)     // Catch:{ all -> 0x0067 }
            tn.b r5 = new tn.b     // Catch:{ WriterException -> 0x006b }
            r5.<init>()     // Catch:{ WriterException -> 0x006b }
            com.google.zxing.BarcodeFormat r6 = com.google.zxing.BarcodeFormat.QR_CODE     // Catch:{ WriterException -> 0x006b }
            vn.b r1 = r5.mo4160f(r1, r6, r2)     // Catch:{ WriterException -> 0x006b }
            int r12 = r1.f41279c     // Catch:{ WriterException -> 0x006b }
            int r11 = r1.f41278b     // Catch:{ WriterException -> 0x006b }
            int r2 = r12 * r11
            int[] r6 = new int[r2]     // Catch:{ WriterException -> 0x006b }
            r2 = r3
        L_0x003d:
            if (r2 >= r12) goto L_0x0058
            int r5 = r2 * r11
            r7 = r3
        L_0x0042:
            if (r7 >= r11) goto L_0x0055
            int r8 = r5 + r7
            boolean r9 = r1.mo70174a(r7, r2)     // Catch:{ WriterException -> 0x006b }
            if (r9 == 0) goto L_0x004f
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0050
        L_0x004f:
            r9 = -1
        L_0x0050:
            r6[r8] = r9     // Catch:{ WriterException -> 0x006b }
            int r7 = r7 + 1
            goto L_0x0042
        L_0x0055:
            int r2 = r2 + 1
            goto L_0x003d
        L_0x0058:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ WriterException -> 0x006b }
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r11, r12, r1)     // Catch:{ WriterException -> 0x006b }
            r7 = 0
            r9 = 0
            r10 = 0
            r5 = r1
            r8 = r11
            r5.setPixels(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ WriterException -> 0x006c }
            goto L_0x006c
        L_0x0067:
            r1 = move-exception
            p401mg.C13080a.m20761a(r0, r1)
        L_0x006b:
            r1 = r4
        L_0x006c:
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r5 = r13.getResources()
            r2.<init>(r5, r1)
            android.widget.TextView r1 = r13.instructions
            r1.setCompoundDrawablesWithIntrinsicBounds(r4, r2, r4, r4)
            android.widget.TextView r1 = r13.confirmationCode
            r1.setVisibility(r3)
            android.view.View r1 = r13.progressBar
            r2 = 8
            r1.setVisibility(r2)
            boolean r1 = r13.isRetry
            if (r1 != 0) goto L_0x00bb
            java.lang.String r1 = r14.f27388c
            boolean r2 = p401mg.C13080a.m20762b(r0)
            if (r2 == 0) goto L_0x0093
            goto L_0x00a2
        L_0x0093:
            boolean r2 = p358gg.C12797a.m20440d()     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x00a2
            boolean r0 = p358gg.C12797a.m20441e(r1)     // Catch:{ all -> 0x009e }
            goto L_0x00a3
        L_0x009e:
            r1 = move-exception
            p401mg.C13080a.m20761a(r0, r1)
        L_0x00a2:
            r0 = r3
        L_0x00a3:
            if (r0 == 0) goto L_0x00bb
            android.content.Context r0 = r13.getContext()
            uf.h r1 = new uf.h
            r1.<init>((android.content.Context) r0, (java.lang.String) r4)
            java.lang.String r0 = p453tf.C13418j.f29381a
            boolean r0 = p453tf.C13442y.m21140c()
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = "fb_smart_login_service"
            r1.mo46170f(r0, r4)
        L_0x00bb:
            long r0 = r14.f27391f
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00c4
            goto L_0x00db
        L_0x00c4:
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            long r6 = r14.f27391f
            long r0 = r0 - r6
            long r6 = r14.f27390e
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            long r0 = r0 - r6
            int r14 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x00db
            r3 = 1
        L_0x00db:
            if (r3 == 0) goto L_0x00e1
            r13.schedulePoll()
            goto L_0x00e4
        L_0x00e1:
            r13.poll()
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.DeviceAuthDialog.setCurrentRequestState(com.facebook.login.DeviceAuthDialog$RequestState):void");
    }

    public Map<String, String> additionalDeviceInfo() {
        return null;
    }

    public int getLayoutResId(boolean z) {
        return z ? R.layout.com_facebook_smart_device_dialog_fragment : R.layout.com_facebook_device_auth_dialog_fragment;
    }

    public View initializeContentView(boolean z) {
        View inflate = getActivity().getLayoutInflater().inflate(getLayoutResId(z), (ViewGroup) null);
        this.progressBar = inflate.findViewById(R.id.progress_bar);
        this.confirmationCode = (TextView) inflate.findViewById(R.id.confirmation_code);
        ((Button) inflate.findViewById(R.id.cancel_button)).setOnClickListener(new C12281c());
        TextView textView = (TextView) inflate.findViewById(R.id.com_facebook_device_auth_instructions);
        this.instructions = textView;
        textView.setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        return inflate;
    }

    public void onBackButtonPressed() {
    }

    public void onCancel() {
        if (this.completed.compareAndSet(false, true)) {
            if (this.currentRequestState != null) {
                C12797a.m20437a(this.currentRequestState.f27388c);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler2 = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler2 != null) {
                deviceAuthMethodHandler2.getLoginClient().completeAndValidate(LoginClient.Result.createCancelResult(deviceAuthMethodHandler2.getLoginClient().getPendingRequest(), "User canceled log in."));
            }
            getDialog().dismiss();
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        C12279a aVar = new C12279a(getActivity());
        aVar.setContentView(initializeContentView(C12797a.m20440d() && !this.isRetry));
        return aVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.deviceAuthMethodHandler = (DeviceAuthMethodHandler) ((LoginFragment) ((FacebookActivity) getActivity()).getCurrentFragment()).getLoginClient().getCurrentHandler();
        if (!(bundle == null || (requestState = (RequestState) bundle.getParcelable(REQUEST_STATE_KEY)) == null)) {
            setCurrentRequestState(requestState);
        }
        return onCreateView;
    }

    public void onDestroyView() {
        this.isBeingDestroyed = true;
        this.completed.set(true);
        super.onDestroyView();
        if (this.currentGraphRequestPoll != null) {
            this.currentGraphRequestPoll.cancel(true);
        }
        if (this.scheduledPoll != null) {
            this.scheduledPoll.cancel(true);
        }
        this.progressBar = null;
        this.confirmationCode = null;
        this.instructions = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.isBeingDestroyed) {
            onCancel();
        }
    }

    public void onError(FacebookException facebookException) {
        if (this.completed.compareAndSet(false, true)) {
            if (this.currentRequestState != null) {
                C12797a.m20437a(this.currentRequestState.f27388c);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler2 = this.deviceAuthMethodHandler;
            deviceAuthMethodHandler2.getLoginClient().completeAndValidate(LoginClient.Result.createErrorResult(deviceAuthMethodHandler2.getLoginClient().getPendingRequest(), (String) null, facebookException.getMessage()));
            getDialog().dismiss();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.currentRequestState != null) {
            bundle.putParcelable(REQUEST_STATE_KEY, this.currentRequestState);
        }
    }

    public void startLogin(LoginClient.Request request) {
        this.mRequest = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.getPermissions()));
        String deviceRedirectUriString = request.getDeviceRedirectUriString();
        if (deviceRedirectUriString != null) {
            bundle.putString("redirect_uri", deviceRedirectUriString);
        }
        String deviceAuthTargetUserId = request.getDeviceAuthTargetUserId();
        if (deviceAuthTargetUserId != null) {
            bundle.putString("target_user_id", deviceAuthTargetUserId);
        }
        StringBuilder sb = new StringBuilder();
        String str = C12879l0.f28392a;
        sb.append(C13418j.m21107c());
        sb.append("|");
        C12879l0.m20603g();
        String str2 = C13418j.f29386f;
        if (str2 != null) {
            sb.append(str2);
            bundle.putString(AccessToken.ACCESS_TOKEN_KEY, sb.toString());
            bundle.putString("device_info", C12797a.m20439c(additionalDeviceInfo()));
            new GraphRequest((AccessToken) null, DEVICE_LOGIN_ENDPOINT, bundle, HttpMethod.POST, new C12280b()).mo39227d();
            return;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.".toString());
    }
}
