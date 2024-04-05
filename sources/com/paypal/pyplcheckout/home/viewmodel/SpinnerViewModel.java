package com.paypal.pyplcheckout.home.viewmodel;

import androidx.lifecycle.C2895z;
import androidx.lifecycle.LiveData;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.home.viewmodel.SpinnerState;
import com.paypal.pyplcheckout.threeds.ThreeDSSource;
import com.paypal.pyplcheckout.threeds.ThreeDSState;
import com.paypal.pyplcheckout.threeds.usecase.ThreeDSUseCase;
import com.paypal.pyplcheckout.viewmodels.BaseViewModel;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;

public final class SpinnerViewModel extends BaseViewModel {
    /* access modifiers changed from: private */
    public final C2895z<SpinnerState> _spinnerState = new C2895z<>();
    private final C19285c spinnerState$delegate = C19350d.m32677b(new SpinnerViewModel$spinnerState$2(this));
    /* access modifiers changed from: private */
    public final ThreeDSUseCase threeDSUseCase;

    public SpinnerViewModel(ThreeDSUseCase threeDSUseCase2) {
        C19383o.m32797g(threeDSUseCase2, "threeDSUseCase");
        this.threeDSUseCase = threeDSUseCase2;
    }

    /* access modifiers changed from: private */
    public final SpinnerState mapThreeDSState(ThreeDSState threeDSState) {
        SpinnerState spinnerState;
        boolean z = true;
        if (threeDSState instanceof ThreeDSState.Error ? true : C19383o.m32792b(threeDSState, ThreeDSState.None.INSTANCE)) {
            return SpinnerState.Hide.INSTANCE;
        }
        if (threeDSState instanceof ThreeDSState.Finished) {
            if (threeDSState.getSource() == ThreeDSSource.ADD_CARD) {
                spinnerState = SpinnerState.Hide.INSTANCE;
            } else {
                spinnerState = this._spinnerState.getValue();
                if (spinnerState == null) {
                    spinnerState = SpinnerState.Hide.INSTANCE;
                }
            }
            C19383o.m32796f(spinnerState, "{\n                if (th…          }\n            }");
            return spinnerState;
        }
        if (!(threeDSState instanceof ThreeDSState.Loading)) {
            z = threeDSState instanceof ThreeDSState.Started;
        }
        return z ? new SpinnerState.Show(C17165R.string.paypal_checkout_3ds_loading) : SpinnerState.Hide.INSTANCE;
    }

    public final LiveData<SpinnerState> getSpinnerState() {
        return (LiveData) this.spinnerState$delegate.getValue();
    }
}
