package com.paypal.pyplcheckout.threeds;

import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.text.input.C1993m;
import com.cardinalcommerce.cardinalmobilesdk.p045a.p046a.C6132d;
import com.cardinalcommerce.cardinalmobilesdk.p045a.p047c.C6137c;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.threeds.ThreeDsException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.C19343e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import p092e5.C6718a;
import p103f5.C6787b;
import p103f5.C6789d;
import p139i5.C6993a;
import p160k5.C7196a;

public final class ThreeDsDecisionFlowInfo implements IThreeDsDecisionFlow {
    private final void initialize(String str, C7196a aVar) {
        C6789d dVar;
        C6718a.m13109a().getClass();
        C6787b bVar = C6718a.f14812c;
        bVar.getClass();
        C6787b.f14935m.mo19175a("CardinalInit", "Init started", (String) null);
        if (aVar != null) {
            bVar.f14939b = aVar;
            C6132d dVar2 = C6787b.f14934l;
            C6132d dVar3 = C6132d.InitStarted;
            if (C1993m.f4511z[dVar2.mo17206a()][dVar3.mo17206a()]) {
                if (str == null || str.isEmpty()) {
                    C6993a aVar2 = C6787b.f14935m;
                    aVar2.getClass();
                    aVar2.mo19177d(String.valueOf(10202), "Invalid JWT String.", (String) null);
                    dVar = new C6789d(10202);
                } else {
                    bVar.f14941d = str;
                    try {
                        C6137c cVar = new C6137c(bVar, str, C6787b.f14933k);
                        if (C6787b.f14934l == dVar3) {
                            C6787b.f14935m.mo19175a("CardinalInit", "Previous centinel API init task cancelled", (String) null);
                            cVar.cancel(true);
                        }
                        cVar.execute(new Void[0]);
                        C6787b.f14934l = dVar3;
                        return;
                    } catch (JSONException e) {
                        C6993a aVar3 = C6787b.f14935m;
                        StringBuilder h = C0072d.m201h("Cardinal Init Error");
                        h.append(e.getLocalizedMessage());
                        String sb = h.toString();
                        aVar3.getClass();
                        aVar3.mo19177d(String.valueOf(10205), sb, (String) null);
                        dVar = new C6789d(10205);
                    }
                }
                bVar.mo18931i(dVar);
                return;
            }
            C6993a aVar4 = C6787b.f14935m;
            StringBuilder h2 = C0072d.m201h("Error: Current State, Next state  :");
            h2.append(C6787b.f14934l);
            h2.append(", ");
            h2.append(dVar3);
            String sb2 = h2.toString();
            aVar4.getClass();
            aVar4.mo19177d(String.valueOf(10201), sb2, (String) null);
            bVar.mo18931i(new C6789d(10201));
            return;
        }
        C6993a aVar5 = C6787b.f14935m;
        aVar5.getClass();
        aVar5.mo19177d(String.valueOf(10203), "Invalid Receiver or Interface.", (String) null);
        throw new InvalidInputException("InvalidInputException", new Throwable("Null CardinalInitService received on init"));
    }

    /* access modifiers changed from: private */
    public final Exception threeDSFailure(ValidateResponseAlias validateResponseAlias) {
        PEnums.ErrorType errorType = PEnums.ErrorType.FATAL;
        PEnums.EventCode eventCode = PEnums.EventCode.E612;
        PEnums.TransitionName transitionName = PEnums.TransitionName.THREE_DS_CARDINAL_STEP_UP_FINISHED;
        String actionCode = validateResponseAlias.getActionCode();
        String errorDescription = validateResponseAlias.getErrorDescription();
        int errorNumber = validateResponseAlias.getErrorNumber();
        return new ThreeDsException.ThreeDSCardinalStepUpFailure(new ThreeDsExceptionData(errorType, eventCode, transitionName, (Exception) null, actionCode + ", " + errorDescription + ", " + errorNumber, (String) null, "3ds 2.0 step up failure", 40, (DefaultConstructorMarker) null));
    }

    public Object init(String str, C19340c<? super String> cVar) {
        C19343e eVar = new C19343e(C19388s.m32873m0(cVar));
        initialize(str, new ThreeDsDecisionFlowInfo$init$2$1(eVar, this));
        Object a = eVar.mo71808a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a;
    }
}
