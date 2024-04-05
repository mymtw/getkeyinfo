package com.paypal.pyplcheckout.threeds.usecase;

import android.app.Activity;
import androidx.appcompat.widget.C0326j;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17183a;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus;
import com.paypal.pyplcheckout.events.model.ContingencyType;
import com.paypal.pyplcheckout.home.view.customviews.C17248l;
import com.paypal.pyplcheckout.pojo.FundingInstrument;
import com.paypal.pyplcheckout.pojo.FundingOption;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow;
import com.paypal.pyplcheckout.threeds.ThreeDSSource;
import com.paypal.pyplcheckout.threeds.ThreeDSState;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19656n1;
import kotlinx.coroutines.flow.C19689x1;

public final class ThreeDSUseCase {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "ThreeDSUseCase";
    private final EventListener contingencyEventListener = new C17248l(this, 3);
    /* access modifiers changed from: private */
    public final Events events;
    private final Repository repository;
    private final C19525d0 scope;
    private final EventListener threeDSCompleteListener = new C17183a(this, 4);
    private final ThreeDSDecisionFlow threeDSDecisionFlow;
    private final C19285c threeDSState$delegate = C19350d.m32677b(ThreeDSUseCase$threeDSState$2.INSTANCE);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ContingencyType.values().length];
            iArr[ContingencyType.THREE_DS_V1_CONTINGENCY.ordinal()] = 1;
            iArr[ContingencyType.THREE_DS_V2_CONTINGENCY.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ContingencyProcessingStatus.values().length];
            iArr2[ContingencyProcessingStatus.THREE_DS_JWT_1_STARTED.ordinal()] = 1;
            iArr2[ContingencyProcessingStatus.THREE_DS_SUBMIT_CLICKED.ordinal()] = 2;
            iArr2[ContingencyProcessingStatus.THREE_DS_JWT_1_FAILED.ordinal()] = 3;
            iArr2[ContingencyProcessingStatus.THREE_DS_JWT_2_FAILED.ordinal()] = 4;
            iArr2[ContingencyProcessingStatus.THREE_DS_LOOK_UP_FAILED.ordinal()] = 5;
            iArr2[ContingencyProcessingStatus.THREE_DS_AUTHENTICATE_FAILED.ordinal()] = 6;
            iArr2[ContingencyProcessingStatus.THREE_DS_UNKNOWN_FAILURE.ordinal()] = 7;
            iArr2[ContingencyProcessingStatus.THREE_DS_CANCEL_CLICKED.ordinal()] = 8;
            iArr2[ContingencyProcessingStatus.THREE_DS_RESOLVE_FAILED.ordinal()] = 9;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ThreeDSUseCase(Events events2, C19525d0 d0Var, ThreeDSDecisionFlow threeDSDecisionFlow2, Repository repository2) {
        C19383o.m32797g(events2, "events");
        C19383o.m32797g(d0Var, "scope");
        C19383o.m32797g(threeDSDecisionFlow2, "threeDSDecisionFlow");
        C19383o.m32797g(repository2, "repository");
        this.events = events2;
        this.scope = d0Var;
        this.threeDSDecisionFlow = threeDSDecisionFlow2;
        this.repository = repository2;
    }

    /* access modifiers changed from: private */
    /* renamed from: contingencyEventListener$lambda-2  reason: not valid java name */
    public static final void m35443contingencyEventListener$lambda2(ThreeDSUseCase threeDSUseCase, EventType eventType, ResultData resultData) {
        C19383o.m32797g(threeDSUseCase, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        C19697g.m33468f(threeDSUseCase.scope, (CoroutineContext) null, (CoroutineStart) null, new ThreeDSUseCase$contingencyEventListener$1$1(resultData, threeDSUseCase, (C19340c<? super ThreeDSUseCase$contingencyEventListener$1$1>) null), 3);
    }

    private final void emitGenericError(ThreeDSSource threeDSSource, Exception exc) {
        getThreeDSState().mo72331a(new ThreeDSState.Error(threeDSSource));
        this.events.fire(PayPalEventTypes.CONTINGENCY_EVENT, new Success(new ContingencyEventsModel(ContingencyType.THREE_DS_V2_CONTINGENCY, ContingencyProcessingStatus.THREE_DS_UNKNOWN_FAILURE, exc, exc == null ? null : exc.getMessage(), (ThreeDSSource) null, 16, (DefaultConstructorMarker) null)));
    }

    private final String getSelectedFundingInstrumentId() {
        FundingInstrument fundingInstrument;
        FundingOption selectedFundingOption = this.repository.getSelectedFundingOption();
        if (selectedFundingOption == null || (fundingInstrument = selectedFundingOption.getFundingInstrument()) == null) {
            return null;
        }
        return fundingInstrument.getId();
    }

    /* access modifiers changed from: private */
    public final C19656n1<ThreeDSState> getThreeDSState() {
        return (C19656n1) this.threeDSState$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void handleContingencyEvent(ContingencyEventsModel contingencyEventsModel) {
        ContingencyType contingencyType = contingencyEventsModel.getContingencyType();
        ContingencyProcessingStatus contingencyProcessingStatus = contingencyEventsModel.getContingencyProcessingStatus();
        int i = WhenMappings.$EnumSwitchMapping$0[contingencyType.ordinal()];
        if (i == 1 || i == 2) {
            switch (WhenMappings.$EnumSwitchMapping$1[contingencyProcessingStatus.ordinal()]) {
                case 1:
                case 2:
                    C19697g.m33468f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new ThreeDSUseCase$handleContingencyEvent$1(this, (C19340c<? super ThreeDSUseCase$handleContingencyEvent$1>) null), 3);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    C19697g.m33468f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new ThreeDSUseCase$handleContingencyEvent$2(this, (C19340c<? super ThreeDSUseCase$handleContingencyEvent$2>) null), 3);
                    return;
                default:
                    String str = TAG;
                    C19383o.m32796f(str, "TAG");
                    PLog.i$default(str, "ContingencyProcessingStatus of type " + contingencyProcessingStatus + " not handled", 0, 4, (Object) null);
                    return;
            }
        } else {
            String str2 = TAG;
            C19383o.m32796f(str2, "TAG");
            PLog.i$default(str2, "ContingencyType of type " + contingencyType + " not handled", 0, 4, (Object) null);
        }
    }

    private final boolean isDuplicatedContingency() {
        String selectedFundingInstrumentId = getSelectedFundingInstrumentId();
        if (selectedFundingInstrumentId == null) {
            return false;
        }
        return this.repository.isContingencyCardIdCleared(selectedFundingInstrumentId);
    }

    private final void listenToEvents() {
        this.events.listen(PayPalEventTypes.CLEARED_THREE_DS_CONTINGENCIES, this.threeDSCompleteListener);
        this.events.listen(PayPalEventTypes.CONTINGENCY_EVENT, this.contingencyEventListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: threeDSCompleteListener$lambda-1  reason: not valid java name */
    public static final void m35444threeDSCompleteListener$lambda1(ThreeDSUseCase threeDSUseCase, EventType eventType, ResultData resultData) {
        String selectedFundingInstrumentId;
        C19383o.m32797g(threeDSUseCase, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        if (threeDSUseCase.getThreeDSState().getValue().getSource() == ThreeDSSource.CTA && (selectedFundingInstrumentId = threeDSUseCase.getSelectedFundingInstrumentId()) != null) {
            threeDSUseCase.repository.addContingencyClearedCardId(selectedFundingInstrumentId);
        }
        C19697g.m33468f(threeDSUseCase.scope, (CoroutineContext) null, (CoroutineStart) null, new ThreeDSUseCase$threeDSCompleteListener$1$2(threeDSUseCase, (C19340c<? super ThreeDSUseCase$threeDSCompleteListener$1$2>) null), 3);
    }

    public final C19689x1<ThreeDSState> invoke() {
        listenToEvents();
        return getThreeDSState();
    }

    public final C19689x1<ThreeDSState> launch3DS(Activity activity, ThreeDSSource threeDSSource) {
        C19383o.m32797g(activity, "activity");
        C19383o.m32797g(threeDSSource, "source");
        listenToEvents();
        if (isDuplicatedContingency()) {
            emitGenericError(threeDSSource, new DuplicatedContingencyException(C0326j.m864i("Got duplicated contingency: ", getSelectedFundingInstrumentId())));
            return getThreeDSState();
        }
        getThreeDSState().mo72331a(new ThreeDSState.Started(threeDSSource));
        this.threeDSDecisionFlow.startThreeDsFlow(activity, threeDSSource, new ThreeDSUseCase$launch3DS$1(this));
        return getThreeDSState();
    }
}
