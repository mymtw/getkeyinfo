package com.paypal.pyplcheckout.viewmodels;

import androidx.lifecycle.C2895z;
import androidx.lifecycle.LiveData;
import com.paypal.checkout.config.CheckoutConfig;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.domain.usecase.GetMerchantConfigUseCase;
import com.paypal.pyplcheckout.state.data.model.CheckoutState;
import com.paypal.pyplcheckout.state.usecase.GetCheckoutStateUseCase;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CancelViewModel extends BaseViewModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "CancelViewModel";
    private C2895z<State> _viewState;
    private final GetCheckoutStateUseCase getCheckoutStateUseCase;
    private final GetMerchantConfigUseCase getMerchantConfigUseCase;
    private final boolean is1p;
    private final LiveData<State> viewState;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static abstract class State {

        public static final class CloseSDK extends State {
            private final String fromClass;
            private final String fromMessage;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public CloseSDK(String str, String str2) {
                super((DefaultConstructorMarker) null);
                C19383o.m32797g(str, "fromClass");
                C19383o.m32797g(str2, "fromMessage");
                this.fromClass = str;
                this.fromMessage = str2;
            }

            public final String getFromClass() {
                return this.fromClass;
            }

            public final String getFromMessage() {
                return this.fromMessage;
            }
        }

        public static final class Initial extends State {
            public static final Initial INSTANCE = new Initial();

            private Initial() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class ShowCancelDialog extends State {
            private final String fromClass;
            private final String fromMessage;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public ShowCancelDialog(String str, String str2) {
                super((DefaultConstructorMarker) null);
                C19383o.m32797g(str, "fromClass");
                C19383o.m32797g(str2, "fromMessage");
                this.fromClass = str;
                this.fromMessage = str2;
            }

            public final String getFromClass() {
                return this.fromClass;
            }

            public final String getFromMessage() {
                return this.fromMessage;
            }
        }

        private State() {
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CancelViewModel(GetMerchantConfigUseCase getMerchantConfigUseCase2, GetCheckoutStateUseCase getCheckoutStateUseCase2, boolean z) {
        C19383o.m32797g(getMerchantConfigUseCase2, "getMerchantConfigUseCase");
        C19383o.m32797g(getCheckoutStateUseCase2, "getCheckoutStateUseCase");
        this.getMerchantConfigUseCase = getMerchantConfigUseCase2;
        this.getCheckoutStateUseCase = getCheckoutStateUseCase2;
        this.is1p = z;
        C2895z<State> zVar = new C2895z<>(State.Initial.INSTANCE);
        this._viewState = zVar;
        this.viewState = zVar;
    }

    public final void cancelAction(String str, String str2) {
        C19383o.m32797g(str, "fromClass");
        C19383o.m32797g(str2, "fromMessage");
        if (this.is1p) {
            handle1PCancelAction(str, str2);
        } else {
            handle3PCancelAction(str, str2);
        }
    }

    public final LiveData<State> getViewState() {
        return this.viewState;
    }

    public final void handle1PCancelAction(String str, String str2) {
        C19383o.m32797g(str, "fromClass");
        C19383o.m32797g(str2, "fromMessage");
        CheckoutState value = this.getCheckoutStateUseCase.invoke().getValue();
        boolean z = true;
        if (value instanceof CheckoutState.PreReview ? true : value instanceof CheckoutState.PostReview) {
            this._viewState.postValue(new State.ShowCancelDialog(str, str2));
            return;
        }
        if (!(value instanceof CheckoutState.PreApprove)) {
            z = value instanceof CheckoutState.PostApprove;
        }
        if (z) {
            this._viewState.postValue(State.Initial.INSTANCE);
        }
    }

    public final void handle3PCancelAction(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        C19383o.m32797g(str3, "fromClass");
        C19383o.m32797g(str4, "fromMessage");
        Object r3 = this.getMerchantConfigUseCase.m35250invoked1pmJ48();
        C19394m mVar = null;
        CheckoutConfig checkoutConfig = (CheckoutConfig) (Result.m35485isFailureimpl(r3) ? null : r3);
        if (checkoutConfig != null) {
            this._viewState.postValue(checkoutConfig.getUiConfig().getShowExitSurveyDialog() ? new State.ShowCancelDialog(str3, str4) : new State.CloseSDK(str3, str4));
            mVar = C19394m.f43287a;
        }
        if (mVar == null) {
            PLog.error$default(PEnums.ErrorType.WARNING, PEnums.EventCode.E642, "Error getting merchant config", (String) null, Result.m35483exceptionOrNullimpl(r3), PEnums.TransitionName.USER_CANCELED_CHECKOUT, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1992, (Object) null);
            this._viewState.postValue(new State.ShowCancelDialog(str3, str4));
        }
    }
}
