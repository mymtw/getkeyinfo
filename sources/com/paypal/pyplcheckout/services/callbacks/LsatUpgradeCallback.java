package com.paypal.pyplcheckout.services.callbacks;

import android.os.Handler;
import androidx.appcompat.widget.C0326j;
import com.google.gson.C16708i;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.pojo.LsatData;
import com.paypal.pyplcheckout.pojo.LsatError;
import com.paypal.pyplcheckout.pojo.LsatResponse;
import com.paypal.pyplcheckout.services.InternalCorrelationIds;
import java.io.StringReader;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p753kq.C19857l;

public final class LsatUpgradeCallback extends BaseCallback {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "LsatUpgradeCallback";
    private final C19857l<Boolean, C19394m> lsatUpgradeComplete;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ LsatUpgradeCallback get$default(Companion companion, C19857l lVar, int i, Object obj) {
            if ((i & 1) != 0) {
                lVar = null;
            }
            return companion.get(lVar);
        }

        public final LsatUpgradeCallback get(C19857l<? super Boolean, C19394m> lVar) {
            return new LsatUpgradeCallback(lVar);
        }
    }

    public LsatUpgradeCallback() {
        this((C19857l) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LsatUpgradeCallback(C19857l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : lVar);
    }

    public static final LsatUpgradeCallback get(C19857l<? super Boolean, C19394m> lVar) {
        return Companion.get(lVar);
    }

    private final void lsatFailProtocol(String str) {
        PLog.decision$default(PEnums.TransitionName.NATIVE_XO_POST_LSAT_UPGRADE_REQUEST, PEnums.Outcome.FAILURE, PEnums.EventCode.E111, PEnums.StateName.REVIEW, (String) null, (String) null, str, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1968, (Object) null);
        SdkComponent.Companion.getInstance().getRepository().setLsatTokenUpgraded(false);
        C19857l<Boolean, C19394m> lVar = this.lsatUpgradeComplete;
        if (lVar != null) {
            lVar.invoke(Boolean.FALSE);
        }
    }

    public void onApiError(Exception exc) {
        C19383o.m32797g(exc, "exception");
        String message = exc.getMessage();
        if (message == null) {
            message = "unknown LSAT error";
        }
        lsatFailProtocol(message);
    }

    public void onApiSuccess(String str) {
        String str2 = str;
        C19383o.m32797g(str2, "result");
        try {
            LsatResponse lsatResponse = (LsatResponse) new C16708i().mo59457d(new StringReader(str2), LsatResponse.class);
            LsatData data = lsatResponse.getData();
            boolean z = false;
            if (data == null ? false : C19383o.m32792b(data.isTokenUpgraded(), Boolean.TRUE)) {
                PLog.decision$default(PEnums.TransitionName.NATIVE_XO_POST_LSAT_UPGRADE_REQUEST, PEnums.Outcome.SUCCEEDED, PEnums.EventCode.E211, PEnums.StateName.REVIEW, (String) null, (String) null, str, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1968, (Object) null);
                SdkComponent.Companion companion = SdkComponent.Companion;
                companion.getInstance().getRepository().setLsatTokenUpgraded(true);
                companion.getInstance().getRepository().setStage(PEnums.Stage.LSAT_UPGRADED);
                C19857l<Boolean, C19394m> lVar = this.lsatUpgradeComplete;
                if (lVar != null) {
                    lVar.invoke(Boolean.TRUE);
                    return;
                }
                return;
            }
            String str3 = "API failed to upgrade LSAT - ";
            List<LsatError> errors = lsatResponse.getErrors();
            if (errors == null || errors.isEmpty()) {
                z = true;
            }
            if (!z) {
                List<LsatError> errors2 = lsatResponse.getErrors();
                if (errors2 != null) {
                    for (LsatError lsatError : errors2) {
                        if (lsatError.getMessage() != null) {
                            str3 = str3 + lsatError.getMessage() + ";";
                        }
                    }
                }
            }
            lsatFailProtocol(str3);
        } catch (Exception e) {
            lsatFailProtocol(C0326j.m864i("failed to read the LSAT API result ", e.getMessage()));
        }
    }

    public InternalCorrelationIds onSaveCorrelationId(String str, InternalCorrelationIds internalCorrelationIds) {
        C19383o.m32797g(str, "correlationId");
        C19383o.m32797g(internalCorrelationIds, "internalCorrelationIds");
        return InternalCorrelationIds.copy$default(internalCorrelationIds, (String) null, (String) null, (String) null, str, (String) null, (String) null, (String) null, 119, (Object) null);
    }

    public LsatUpgradeCallback(C19857l<? super Boolean, C19394m> lVar) {
        super((Handler) null, 1, (DefaultConstructorMarker) null);
        this.lsatUpgradeComplete = lVar;
    }
}
