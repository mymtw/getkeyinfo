package com.paypal.pyplcheckout.addressbook.view;

import com.paypal.pyplcheckout.pojo.AddressValidation;
import com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest;
import com.paypal.pyplcheckout.pojo.ShippingAddress;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class AddressRecommendationViewState {

    public static final class ShowErrorState extends AddressRecommendationViewState {
        public static final ShowErrorState INSTANCE = new ShowErrorState();

        private ShowErrorState() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class ShowInitialRecommendationState extends AddressRecommendationViewState {
        private final PortableShippingAddressRequest originalAddress;
        private final AddressValidation reformattedAddress;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ShowInitialRecommendationState(PortableShippingAddressRequest portableShippingAddressRequest, AddressValidation addressValidation) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(portableShippingAddressRequest, "originalAddress");
            C19383o.m32797g(addressValidation, "reformattedAddress");
            this.originalAddress = portableShippingAddressRequest;
            this.reformattedAddress = addressValidation;
        }

        public static /* synthetic */ ShowInitialRecommendationState copy$default(ShowInitialRecommendationState showInitialRecommendationState, PortableShippingAddressRequest portableShippingAddressRequest, AddressValidation addressValidation, int i, Object obj) {
            if ((i & 1) != 0) {
                portableShippingAddressRequest = showInitialRecommendationState.originalAddress;
            }
            if ((i & 2) != 0) {
                addressValidation = showInitialRecommendationState.reformattedAddress;
            }
            return showInitialRecommendationState.copy(portableShippingAddressRequest, addressValidation);
        }

        public final PortableShippingAddressRequest component1() {
            return this.originalAddress;
        }

        public final AddressValidation component2() {
            return this.reformattedAddress;
        }

        public final ShowInitialRecommendationState copy(PortableShippingAddressRequest portableShippingAddressRequest, AddressValidation addressValidation) {
            C19383o.m32797g(portableShippingAddressRequest, "originalAddress");
            C19383o.m32797g(addressValidation, "reformattedAddress");
            return new ShowInitialRecommendationState(portableShippingAddressRequest, addressValidation);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowInitialRecommendationState)) {
                return false;
            }
            ShowInitialRecommendationState showInitialRecommendationState = (ShowInitialRecommendationState) obj;
            return C19383o.m32792b(this.originalAddress, showInitialRecommendationState.originalAddress) && C19383o.m32792b(this.reformattedAddress, showInitialRecommendationState.reformattedAddress);
        }

        public final PortableShippingAddressRequest getOriginalAddress() {
            return this.originalAddress;
        }

        public final AddressValidation getReformattedAddress() {
            return this.reformattedAddress;
        }

        public int hashCode() {
            return this.reformattedAddress.hashCode() + (this.originalAddress.hashCode() * 31);
        }

        public String toString() {
            PortableShippingAddressRequest portableShippingAddressRequest = this.originalAddress;
            AddressValidation addressValidation = this.reformattedAddress;
            return "ShowInitialRecommendationState(originalAddress=" + portableShippingAddressRequest + ", reformattedAddress=" + addressValidation + ")";
        }
    }

    public static final class ShowLoadingState extends AddressRecommendationViewState {
        public static final ShowLoadingState INSTANCE = new ShowLoadingState();

        private ShowLoadingState() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class ShowSuccessfulAddAddressState extends AddressRecommendationViewState {
        private final List<ShippingAddress> updatedShippingAddressList;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ShowSuccessfulAddAddressState(List<ShippingAddress> list) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(list, "updatedShippingAddressList");
            this.updatedShippingAddressList = list;
        }

        public static /* synthetic */ ShowSuccessfulAddAddressState copy$default(ShowSuccessfulAddAddressState showSuccessfulAddAddressState, List<ShippingAddress> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = showSuccessfulAddAddressState.updatedShippingAddressList;
            }
            return showSuccessfulAddAddressState.copy(list);
        }

        public final List<ShippingAddress> component1() {
            return this.updatedShippingAddressList;
        }

        public final ShowSuccessfulAddAddressState copy(List<ShippingAddress> list) {
            C19383o.m32797g(list, "updatedShippingAddressList");
            return new ShowSuccessfulAddAddressState(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowSuccessfulAddAddressState) && C19383o.m32792b(this.updatedShippingAddressList, ((ShowSuccessfulAddAddressState) obj).updatedShippingAddressList);
        }

        public final List<ShippingAddress> getUpdatedShippingAddressList() {
            return this.updatedShippingAddressList;
        }

        public int hashCode() {
            return this.updatedShippingAddressList.hashCode();
        }

        public String toString() {
            List<ShippingAddress> list = this.updatedShippingAddressList;
            return "ShowSuccessfulAddAddressState(updatedShippingAddressList=" + list + ")";
        }
    }

    private AddressRecommendationViewState() {
    }

    public /* synthetic */ AddressRecommendationViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
