package com.etsy.android.push.onboarding;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0120c;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.network.oauth2.signin.C8774c;
import com.etsy.android.stylekit.views.CollageButton;
import com.etsy.android.uikit.p331ui.core.TrackingDialogFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p019b.C3447d;
import p440s9.C13366a;

public final class PushOptInOnboardingDialogFragment extends TrackingDialogFragment implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final C0120c<String> permissionLauncher;
    public C8946b pushPermissionPrompter;

    public PushOptInOnboardingDialogFragment() {
        C0120c<String> registerForActivityResult = registerForActivityResult(new C3447d(), new C8774c(this, 1));
        C19383o.m32796f(registerForActivityResult, "registerForActivityResul…      dismiss()\n        }");
        this.permissionLauncher = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    public final void handleDecline() {
        getAnalyticsContext().mo21333d("notification_registration_interstitial_dismiss_tapped", (Map<? extends AnalyticsProperty, Object>) null);
        dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: permissionLauncher$lambda-0  reason: not valid java name */
    public static final void m34878permissionLauncher$lambda0(PushOptInOnboardingDialogFragment pushOptInOnboardingDialogFragment, Boolean bool) {
        C19383o.m32797g(pushOptInOnboardingDialogFragment, "this$0");
        C8946b pushPermissionPrompter2 = pushOptInOnboardingDialogFragment.getPushPermissionPrompter();
        C19383o.m32796f(bool, "isGranted");
        if (bool.booleanValue()) {
            pushPermissionPrompter2.f19737b.mo21333d("push_prompt_permission_granted", (Map<? extends AnalyticsProperty, Object>) null);
        } else {
            pushPermissionPrompter2.f19737b.mo21333d("push_prompt_permission_denied", (Map<? extends AnalyticsProperty, Object>) null);
        }
        pushOptInOnboardingDialogFragment.dismiss();
    }

    /* access modifiers changed from: private */
    public final void requestNotificationPermission() {
        if (C19382n.m32706E0()) {
            getAnalyticsContext().mo21333d("notification_registration_interstitial_enable_tapped", (Map<? extends AnalyticsProperty, Object>) null);
            C8946b pushPermissionPrompter2 = getPushPermissionPrompter();
            C0120c<String> cVar = this.permissionLauncher;
            pushPermissionPrompter2.getClass();
            C19383o.m32797g(cVar, "activityResultLauncher");
            cVar.mo1157b("android.permission.POST_NOTIFICATIONS");
            C8945a aVar = pushPermissionPrompter2.f19736a;
            pushPermissionPrompter2.f19738c.getClass();
            aVar.f19734c.mo46761a().edit().putLong("push_onboarding_last_prompt", System.currentTimeMillis()).apply();
            aVar.f19732a.mo30552b();
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C8946b getPushPermissionPrompter() {
        C8946b bVar = this.pushPermissionPrompter;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("pushPermissionPrompter");
        throw null;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C19383o.m32797g(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        getAnalyticsContext().mo21333d("notification_registration_interstitial_cancelled", (Map<? extends AnalyticsProperty, Object>) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, 16973831);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_push_opt_in_onboarding, viewGroup);
        CollageButton collageButton = (CollageButton) inflate.findViewById(R.id.push_opt_in_enable_button);
        CollageButton collageButton2 = (CollageButton) inflate.findViewById(R.id.push_opt_in_opt_out_button);
        C19383o.m32796f(collageButton, "enableButton");
        ViewExtensions.m12866j(collageButton, new PushOptInOnboardingDialogFragment$onCreateView$1(this));
        C19383o.m32796f(collageButton2, "declineButton");
        ViewExtensions.m12866j(collageButton2, new PushOptInOnboardingDialogFragment$onCreateView$2(this));
        getAnalyticsContext().mo21333d("notification_registration_interstitial_viewed", (Map<? extends AnalyticsProperty, Object>) null);
        return inflate;
    }

    public final void setPushPermissionPrompter(C8946b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.pushPermissionPrompter = bVar;
    }
}
