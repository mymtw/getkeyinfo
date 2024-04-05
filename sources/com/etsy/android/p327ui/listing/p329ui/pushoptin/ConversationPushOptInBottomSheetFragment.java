package com.etsy.android.p327ui.listing.p329ui.pushoptin;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p356ge.C12790b;
import p370ie.C12950j;

/* renamed from: com.etsy.android.ui.listing.ui.pushoptin.ConversationPushOptInBottomSheetFragment */
public final class ConversationPushOptInBottomSheetFragment extends TrackingBottomSheetDialogFragment {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    /* access modifiers changed from: private */
    public boolean userDismissed = true;

    /* access modifiers changed from: private */
    public final void toNotificationSettings() {
        Context context = getContext();
        if (context != null) {
            C8703p analyticsContext = getAnalyticsContext();
            if (analyticsContext != null) {
                analyticsContext.mo21333d("push_opt_in_redirect_to_settings", C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.PUSH_OPT_IN_DISPLAY_LOCATION, "convos")));
            }
            String packageName = context.getPackageName();
            C19383o.m32796f(packageName, "it.packageName");
            C12790b.m20431c(this, new C12950j(packageName, context.getApplicationInfo().uid));
            dismiss();
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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_convo_push_opt_in, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.opt_in_get_notified);
        C19383o.m32796f(button, "getNotifiedButton");
        ViewExtensions.m12866j(button, new ConversationPushOptInBottomSheetFragment$onCreateView$1(this));
        Button button2 = (Button) inflate.findViewById(R.id.opt_in_no_thanks);
        C19383o.m32796f(button2, "dismissButton");
        ViewExtensions.m12866j(button2, new ConversationPushOptInBottomSheetFragment$onCreateView$2(this));
        return inflate;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C8703p analyticsContext;
        C19383o.m32797g(dialogInterface, "dialog");
        if (this.userDismissed && (analyticsContext = getAnalyticsContext()) != null) {
            analyticsContext.mo21333d("push_opt_in_sheet_dismissed", C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.PUSH_OPT_IN_DISPLAY_LOCATION, "convos")));
        }
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("from_screen")) == null) {
            str = "";
        }
        C8703p analyticsContext = getAnalyticsContext();
        if (analyticsContext != null) {
            analyticsContext.mo21333d("display_push_opt_in_prompt", C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.PUSH_OPT_IN_DISPLAY_LOCATION, "convos"), new Pair(PredefinedAnalyticsProperty.CONTEXT, str)));
        }
    }
}
