package com.paypal.pyplcheckout.utils;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.room.C3221c;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.utils.DialogMaker;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p316be.C8549a;
import p753kq.C19846a;

public final class DialogPresets {
    public static final DialogPresets INSTANCE = new DialogPresets();

    private DialogPresets() {
    }

    /* access modifiers changed from: private */
    /* renamed from: showExitSurveyDialog$lambda-0  reason: not valid java name */
    public static final void m35463showExitSurveyDialog$lambda0(C19846a aVar, DialogMaker dialogMaker) {
        C19383o.m32797g(aVar, "$positiveCallback");
        PLog.decision$default(PEnums.TransitionName.CLICKED_OUTSIDE_DIALOG, PEnums.Outcome.APPROVED, PEnums.EventCode.E144, PEnums.StateName.REVIEW, (String) null, (String) null, dialogMaker.getFeedbackMessage(), (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: showExitSurveyDialog$lambda-1  reason: not valid java name */
    public static final void m35464showExitSurveyDialog$lambda1(DialogMaker dialogMaker) {
        PLog.decision$default(PEnums.TransitionName.CLICKED_OUTSIDE_DIALOG, PEnums.Outcome.CANCELLED, PEnums.EventCode.E144, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
        dialogMaker.dismiss();
    }

    public final void showExitSurveyDialog(Context context, C19846a<C19394m> aVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(aVar, "positiveCallback");
        new DialogMaker.Builder().setTitle(C17165R.string.paypal_checkout_leaving_paypal_headline).setDescription(PYPLCheckoutUtils.Companion.getInstance().getLeavingCheckoutMessage()).setFeedbackRadioButtons(DebugConfigManager.getInstance().shouldShowExitDialogWithRadioButtons()).setPositiveButton(C17165R.string.paypal_checkout_ok, new C8549a(aVar)).setNegativeButton(C17165R.string.paypal_checkout_cancel, new C3221c(5)).build().show((FragmentActivity) context);
    }
}
