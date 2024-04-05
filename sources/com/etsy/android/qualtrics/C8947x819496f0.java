package com.etsy.android.qualtrics;

import android.app.AlertDialog;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.logger.ViewClickAnalyticsLog;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.EtsyWebKey;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p356ge.C12788a;

/* renamed from: com.etsy.android.qualtrics.BOEQualtricsPromptDisplay$Companion$showPrompt$1$showAlertDialog$1 */
public final class C8947x819496f0 extends TrackingOnClickListener {
    public final /* synthetic */ AlertDialog $alertDialog;
    public final /* synthetic */ C8949a $clickListener;
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ String $url;
    public final /* synthetic */ BOEQualtricsPromptDisplay$Companion$showPrompt$1 this$0;

    public C8947x819496f0(C8949a aVar, String str, FragmentActivity fragmentActivity, BOEQualtricsPromptDisplay$Companion$showPrompt$1 bOEQualtricsPromptDisplay$Companion$showPrompt$1, AlertDialog alertDialog) {
        this.$clickListener = aVar;
        this.$url = str;
        this.$fragmentActivity = fragmentActivity;
        this.this$0 = bOEQualtricsPromptDisplay$Companion$showPrompt$1;
        this.$alertDialog = alertDialog;
    }

    public void onViewClick(View view) {
        C19383o.m32794d(view);
        trackAction(view, ViewClickAnalyticsLog.ViewAction.clicked);
        C8949a aVar = this.$clickListener;
        String str = this.$url;
        FragmentActivity fragmentActivity = this.$fragmentActivity;
        aVar.getClass();
        C19383o.m32797g(str, "url");
        C19383o.m32797g(fragmentActivity, "fragmentActivity");
        C12788a.m20424c(fragmentActivity, new EtsyWebKey(C19421p.m32935c0(fragmentActivity), 12, str, (String) null, 8, (DefaultConstructorMarker) null));
        this.this$0.f19739b = false;
        this.$alertDialog.dismiss();
    }
}
