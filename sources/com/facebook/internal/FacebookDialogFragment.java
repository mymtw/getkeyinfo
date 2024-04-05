package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import androidx.compose.animation.C0388a;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.internal.FacebookWebFallbackDialog;
import com.facebook.internal.WebDialog;
import com.facebook.login.LoginTargetApp;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p365hg.C12851e0;
import p365hg.C12869i0;
import p365hg.C12879l0;
import p453tf.C13418j;

public final class FacebookDialogFragment extends DialogFragment {
    public static final C12249a Companion = new C12249a();
    public static final String TAG = "FacebookDialogFragment";
    private Dialog innerDialog;

    /* renamed from: com.facebook.internal.FacebookDialogFragment$a */
    public static final class C12249a {
    }

    /* renamed from: com.facebook.internal.FacebookDialogFragment$b */
    public static final class C12250b implements WebDialog.C12268e {

        /* renamed from: a */
        public final /* synthetic */ FacebookDialogFragment f27341a;

        public C12250b(FacebookDialogFragment facebookDialogFragment) {
            this.f27341a = facebookDialogFragment;
        }

        /* renamed from: a */
        public final void mo39379a(Bundle bundle, FacebookException facebookException) {
            this.f27341a.onCompleteWebDialog(bundle, facebookException);
        }
    }

    /* renamed from: com.facebook.internal.FacebookDialogFragment$c */
    public static final class C12251c implements WebDialog.C12268e {

        /* renamed from: a */
        public final /* synthetic */ FacebookDialogFragment f27342a;

        public C12251c(FacebookDialogFragment facebookDialogFragment) {
            this.f27342a = facebookDialogFragment;
        }

        /* renamed from: a */
        public final void mo39379a(Bundle bundle, FacebookException facebookException) {
            this.f27342a.onCompleteWebFallbackDialog(bundle);
        }
    }

    /* access modifiers changed from: private */
    public final void onCompleteWebDialog(Bundle bundle, FacebookException facebookException) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            C19383o.m32796f(intent, "fragmentActivity.intent");
            activity.setResult(facebookException == null ? -1 : 0, C12851e0.m20506e(intent, bundle, facebookException));
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    public final void onCompleteWebFallbackDialog(Bundle bundle) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtras(bundle);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    public final Dialog getInnerDialog() {
        return this.innerDialog;
    }

    public final void initDialog$facebook_common_release() {
        FragmentActivity activity;
        WebDialog webDialog;
        String str;
        if (this.innerDialog == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            C19383o.m32796f(intent, "intent");
            Bundle j = C12851e0.m20509j(intent);
            String str2 = null;
            if (!(j != null ? j.getBoolean("is_fallback", false) : false)) {
                String string = j != null ? j.getString(ResponseConstants.ACTION) : null;
                Bundle bundle = j != null ? j.getBundle(ResponseConstants.PARAMS) : null;
                if (C12869i0.m20546B(string)) {
                    C12869i0.m20551G(TAG, "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                } else if (string != null) {
                    AccessToken.Companion.getClass();
                    AccessToken d = AccessToken.C12174c.m19981d();
                    if (!AccessToken.C12174c.m19983f()) {
                        int i = C12869i0.f28368a;
                        C12879l0.m20601e(activity, ResponseConstants.CONTEXT);
                        str = C13418j.m21107c();
                    } else {
                        str = null;
                    }
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    C12250b bVar = new C12250b(this);
                    if (d != null) {
                        bundle.putString("app_id", d.getApplicationId());
                        if (d != null) {
                            str2 = d.getToken();
                        }
                        bundle.putString(AccessToken.ACCESS_TOKEN_KEY, str2);
                    } else {
                        bundle.putString("app_id", str);
                    }
                    WebDialog.Companion.getClass();
                    WebDialog.C12265b.m20112a(activity);
                    webDialog = new WebDialog(activity, string, bundle, 0, LoginTargetApp.FACEBOOK, bVar, (DefaultConstructorMarker) null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                String string2 = j != null ? j.getString("url") : null;
                if (C12869i0.m20546B(string2)) {
                    C12869i0.m20551G(TAG, "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                String e = C0388a.m1049e(new Object[]{C13418j.m21107c()}, 1, "fb%s://bridge/", "java.lang.String.format(format, *args)");
                FacebookWebFallbackDialog.C12253a aVar = FacebookWebFallbackDialog.Companion;
                if (string2 != null) {
                    aVar.getClass();
                    WebDialog.Companion.getClass();
                    WebDialog.C12265b.m20112a(activity);
                    webDialog = new FacebookWebFallbackDialog(activity, string2, e, (DefaultConstructorMarker) null);
                    webDialog.setOnCompleteListener(new C12251c(this));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            this.innerDialog = webDialog;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C19383o.m32797g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if ((this.innerDialog instanceof WebDialog) && isResumed()) {
            Dialog dialog = this.innerDialog;
            if (dialog != null) {
                ((WebDialog) dialog).resize();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initDialog$facebook_common_release();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.innerDialog;
        if (dialog == null) {
            onCompleteWebDialog((Bundle) null, (FacebookException) null);
            setShowsDialog(false);
            Dialog onCreateDialog = super.onCreateDialog(bundle);
            C19383o.m32796f(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
            return onCreateDialog;
        } else if (dialog != null) {
            return dialog;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
        }
    }

    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage((Message) null);
        }
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        Dialog dialog = this.innerDialog;
        if (!(dialog instanceof WebDialog)) {
            return;
        }
        if (dialog != null) {
            ((WebDialog) dialog).resize();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
    }

    public final void setInnerDialog(Dialog dialog) {
        this.innerDialog = dialog;
    }
}
