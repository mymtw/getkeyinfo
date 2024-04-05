package com.paypal.pyplcheckout.addressbook.view;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import androidx.lifecycle.LiveData;
import com.paypal.pyplcheckout.addressbook.usecase.AddShippingUseCase;
import com.paypal.pyplcheckout.addressbook.usecase.RetrieveInputAddressUseCase;
import com.paypal.pyplcheckout.addressbook.usecase.RetrieveValidatedAddressUseCase;
import com.paypal.pyplcheckout.addressbook.view.AddressRecommendationViewState;
import com.paypal.pyplcheckout.pojo.AddressValidation;
import com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;

public final class AddressRecommendationViewModel extends C2866i0 {
    /* access modifiers changed from: private */
    public final C2895z<AddressRecommendationViewState> _addressRecommendationViewState;
    /* access modifiers changed from: private */
    public final AddShippingUseCase addShippingUseCase;
    private final LiveData<AddressRecommendationViewState> addressRecommendationViewState;
    private final RetrieveInputAddressUseCase retrieveInputAddressUseCase;
    private final RetrieveValidatedAddressUseCase retrieveValidatedAddressUseCase;

    public AddressRecommendationViewModel(RetrieveInputAddressUseCase retrieveInputAddressUseCase2, RetrieveValidatedAddressUseCase retrieveValidatedAddressUseCase2, AddShippingUseCase addShippingUseCase2) {
        PortableShippingAddressRequest invoke;
        C19383o.m32797g(retrieveInputAddressUseCase2, "retrieveInputAddressUseCase");
        C19383o.m32797g(retrieveValidatedAddressUseCase2, "retrieveValidatedAddressUseCase");
        C19383o.m32797g(addShippingUseCase2, "addShippingUseCase");
        this.retrieveInputAddressUseCase = retrieveInputAddressUseCase2;
        this.retrieveValidatedAddressUseCase = retrieveValidatedAddressUseCase2;
        this.addShippingUseCase = addShippingUseCase2;
        AddressValidation invoke2 = retrieveValidatedAddressUseCase2.invoke();
        AddressRecommendationViewState.ShowInitialRecommendationState showInitialRecommendationState = null;
        if (!(invoke2 == null || (invoke = retrieveInputAddressUseCase2.invoke()) == null)) {
            showInitialRecommendationState = new AddressRecommendationViewState.ShowInitialRecommendationState(invoke, invoke2);
        }
        C2895z<AddressRecommendationViewState> zVar = new C2895z<>(showInitialRecommendationState);
        this._addressRecommendationViewState = zVar;
        this.addressRecommendationViewState = zVar;
    }

    public final void addShippingAddress(PortableShippingAddressRequest portableShippingAddressRequest) {
        C19383o.m32797g(portableShippingAddressRequest, "portableShippingAddressRequest");
        this._addressRecommendationViewState.postValue(AddressRecommendationViewState.ShowLoadingState.INSTANCE);
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new AddressRecommendationViewModel$addShippingAddress$1(this, portableShippingAddressRequest, (C19340c<? super AddressRecommendationViewModel$addShippingAddress$1>) null), 3);
    }

    public final LiveData<AddressRecommendationViewState> getAddressRecommendationViewState() {
        return this.addressRecommendationViewState;
    }
}
