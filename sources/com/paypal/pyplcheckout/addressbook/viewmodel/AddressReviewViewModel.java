package com.paypal.pyplcheckout.addressbook.viewmodel;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.LiveData;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.AddressReviewState;
import com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase;
import com.paypal.pyplcheckout.events.SingleLiveEvent;
import com.paypal.pyplcheckout.pojo.NewShippingAddressRequest;
import com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;

public final class AddressReviewViewModel extends C2866i0 {
    /* access modifiers changed from: private */
    public final SingleLiveEvent<AddressReviewState> _addressReviewState;
    private final LiveData<AddressReviewState> addressReviewState;
    /* access modifiers changed from: private */
    public final ValidateAndAddAddressUseCase validateAndAddAddress;

    public AddressReviewViewModel(ValidateAndAddAddressUseCase validateAndAddAddressUseCase) {
        C19383o.m32797g(validateAndAddAddressUseCase, "validateAndAddAddress");
        this.validateAndAddAddress = validateAndAddAddressUseCase;
        SingleLiveEvent<AddressReviewState> singleLiveEvent = new SingleLiveEvent<>();
        this._addressReviewState = singleLiveEvent;
        this.addressReviewState = singleLiveEvent;
    }

    /* access modifiers changed from: private */
    public final AddressReviewState toAddressReviewState(ValidateAndAddAddressUseCase.AddAddressResult addAddressResult) {
        AddressReviewState.ShowError showError;
        if (addAddressResult instanceof ValidateAndAddAddressUseCase.AddAddressResult.AddAddressSuccess) {
            return AddressReviewState.ShowAddressSuccess.INSTANCE;
        }
        if (addAddressResult instanceof ValidateAndAddAddressUseCase.AddAddressResult.Error) {
            showError = new AddressReviewState.ShowError(C17165R.string.paypal_checkout_generic_network_error, ((ValidateAndAddAddressUseCase.AddAddressResult.Error) addAddressResult).getException());
        } else if (addAddressResult instanceof ValidateAndAddAddressUseCase.AddAddressResult.InvalidAddress) {
            showError = new AddressReviewState.ShowError(C17165R.string.paypal_checkout_address_validation_error, new IllegalArgumentException("Invalid address input"));
        } else if (addAddressResult instanceof ValidateAndAddAddressUseCase.AddAddressResult.ShowAddressSuggestion) {
            return AddressReviewState.ShowAddressSuggestion.INSTANCE;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return showError;
    }

    private final PortableShippingAddressRequest toPortableShippingAddressRequest(NewShippingAddressRequest newShippingAddressRequest) {
        String givenName = newShippingAddressRequest.getGivenName();
        String familyName = newShippingAddressRequest.getFamilyName();
        String countryCode = newShippingAddressRequest.getCountryCode();
        if (countryCode == null) {
            countryCode = UserStateKt.US_COUNTRY;
        }
        return new PortableShippingAddressRequest(givenName, familyName, countryCode, (Boolean) null, newShippingAddressRequest.getLine1(), newShippingAddressRequest.getLine2(), (String) null, (String) null, (String) null, newShippingAddressRequest.getCity(), newShippingAddressRequest.getState(), newShippingAddressRequest.getPostalCode());
    }

    public final LiveData<AddressReviewState> getAddressReviewState() {
        return this.addressReviewState;
    }

    public final void validateAndAddAddress(NewShippingAddressRequest newShippingAddressRequest) {
        C19383o.m32797g(newShippingAddressRequest, "newShippingAddressRequest");
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new AddressReviewViewModel$validateAndAddAddress$1(this, toPortableShippingAddressRequest(newShippingAddressRequest), (C19340c<? super AddressReviewViewModel$validateAndAddAddress$1>) null), 3);
    }
}
