package com.etsy.android.qualtrics;

import android.app.AlertDialog;
import android.view.View;
import com.etsy.android.lib.logger.ViewClickAnalyticsLog;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.qualtrics.BOEQualtricsPromptDisplay$Companion$showPrompt$1$showAlertDialog$2 */
public final class C8948x819496f1 extends TrackingOnClickListener {
    public final /* synthetic */ AlertDialog $alertDialog;

    public C8948x819496f1(AlertDialog alertDialog) {
        this.$alertDialog = alertDialog;
    }

    public void onViewClick(View view) {
        C19383o.m32794d(view);
        trackAction(view, ViewClickAnalyticsLog.ViewAction.clicked);
        this.$alertDialog.dismiss();
    }
}
