package com.paypal.pyplcheckout.addressbook.usecase;

import com.paypal.pyplcheckout.addressvalidation.ValidateAddressUseCase;
import com.paypal.pyplcheckout.p539ab.AbManager;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoAbExperiment;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoTreatment;
import com.paypal.pyplcheckout.p539ab.experiment.DataResponse;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentRequest;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentResponse;
import com.paypal.pyplcheckout.p539ab.featureflag.Feature;
import com.paypal.pyplcheckout.p539ab.featureflag.FeatureFlagManager;
import com.paypal.pyplcheckout.p539ab.featureflag.FeatureResponse;
import com.paypal.pyplcheckout.pojo.AddressValidation;
import com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ValidateAndAddAddressUseCase {
    private final AbManager abManager;
    private final AddShippingUseCase addShipping;
    private final ValidateAddressUseCase validateAddress;

    public static abstract class AddAddressResult {

        public static final class AddAddressSuccess extends AddAddressResult {
            public static final AddAddressSuccess INSTANCE = new AddAddressSuccess();

            private AddAddressSuccess() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class Error extends AddAddressResult {
            private final Exception exception;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Error(Exception exc) {
                super((DefaultConstructorMarker) null);
                C19383o.m32797g(exc, "exception");
                this.exception = exc;
            }

            public static /* synthetic */ Error copy$default(Error error, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = error.exception;
                }
                return error.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final Error copy(Exception exc) {
                C19383o.m32797g(exc, "exception");
                return new Error(exc);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && C19383o.m32792b(this.exception, ((Error) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                Exception exc = this.exception;
                return "Error(exception=" + exc + ")";
            }
        }

        public static final class InvalidAddress extends AddAddressResult {
            public static final InvalidAddress INSTANCE = new InvalidAddress();

            private InvalidAddress() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class ShowAddressSuggestion extends AddAddressResult {
            private final AddressValidation addressValidation;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public ShowAddressSuggestion(AddressValidation addressValidation2) {
                super((DefaultConstructorMarker) null);
                C19383o.m32797g(addressValidation2, "addressValidation");
                this.addressValidation = addressValidation2;
            }

            public static /* synthetic */ ShowAddressSuggestion copy$default(ShowAddressSuggestion showAddressSuggestion, AddressValidation addressValidation2, int i, Object obj) {
                if ((i & 1) != 0) {
                    addressValidation2 = showAddressSuggestion.addressValidation;
                }
                return showAddressSuggestion.copy(addressValidation2);
            }

            public final AddressValidation component1() {
                return this.addressValidation;
            }

            public final ShowAddressSuggestion copy(AddressValidation addressValidation2) {
                C19383o.m32797g(addressValidation2, "addressValidation");
                return new ShowAddressSuggestion(addressValidation2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowAddressSuggestion) && C19383o.m32792b(this.addressValidation, ((ShowAddressSuggestion) obj).addressValidation);
            }

            public final AddressValidation getAddressValidation() {
                return this.addressValidation;
            }

            public int hashCode() {
                return this.addressValidation.hashCode();
            }

            public String toString() {
                AddressValidation addressValidation2 = this.addressValidation;
                return "ShowAddressSuggestion(addressValidation=" + addressValidation2 + ")";
            }
        }

        private AddAddressResult() {
        }

        public /* synthetic */ AddAddressResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ValidateAndAddAddressUseCase(AddShippingUseCase addShippingUseCase, ValidateAddressUseCase validateAddressUseCase, AbManager abManager2) {
        C19383o.m32797g(addShippingUseCase, "addShipping");
        C19383o.m32797g(validateAddressUseCase, "validateAddress");
        C19383o.m32797g(abManager2, "abManager");
        this.addShipping = addShippingUseCase;
        this.validateAddress = validateAddressUseCase;
        this.abManager = abManager2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object addShippingAddress(com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest r5, kotlin.coroutines.C19340c<? super com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase.AddAddressResult> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase$addShippingAddress$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase$addShippingAddress$1 r0 = (com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase$addShippingAddress$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase$addShippingAddress$1 r0 = new com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase$addShippingAddress$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x003d
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            com.paypal.pyplcheckout.addressbook.usecase.AddShippingUseCase r6 = r4.addShipping
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L_0x003d
            return r1
        L_0x003d:
            com.paypal.pyplcheckout.utils.Result r6 = (com.paypal.pyplcheckout.utils.Result) r6
            boolean r5 = r6 instanceof com.paypal.pyplcheckout.utils.Result.Success
            if (r5 == 0) goto L_0x0046
            com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase$AddAddressResult$AddAddressSuccess r5 = com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase.AddAddressResult.AddAddressSuccess.INSTANCE
            goto L_0x0056
        L_0x0046:
            boolean r5 = r6 instanceof com.paypal.pyplcheckout.utils.Result.Error
            if (r5 == 0) goto L_0x0057
            com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase$AddAddressResult$Error r5 = new com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase$AddAddressResult$Error
            com.paypal.pyplcheckout.services.ApiErrorException r6 = new com.paypal.pyplcheckout.services.ApiErrorException
            java.lang.String r0 = "add shipping api error"
            r6.<init>(r0)
            r5.<init>(r6)
        L_0x0056:
            return r5
        L_0x0057:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase.addShippingAddress(com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object handleAddressValidation(PortableShippingAddressRequest portableShippingAddressRequest, AddressValidation addressValidation, C19340c<? super AddAddressResult> cVar) {
        Boolean isValidAddress = addressValidation.isValidAddress();
        if (isValidAddress == null) {
            return new AddAddressResult.Error(new IllegalArgumentException("isValid is null"));
        }
        boolean booleanValue = isValidAddress.booleanValue();
        Boolean isReformatted = addressValidation.isReformatted();
        if (isReformatted == null) {
            return new AddAddressResult.Error(new IllegalArgumentException("isReformatted is null"));
        }
        return !booleanValue ? AddAddressResult.InvalidAddress.INSTANCE : !isReformatted.booleanValue() ? addShippingAddress(portableShippingAddressRequest, cVar) : new AddAddressResult.ShowAddressSuggestion(addressValidation);
    }

    private final boolean isAddressValidationOn() {
        DataResponse response;
        String str = null;
        FeatureResponse isEnabled$default = FeatureFlagManager.isEnabled$default(Feature.ADDRESS_SUGGESTION, false, 2, (Object) null);
        if (C19383o.m32792b(isEnabled$default, FeatureResponse.Disabled.INSTANCE)) {
            return false;
        }
        if (C19383o.m32792b(isEnabled$default, FeatureResponse.EnableOverride.INSTANCE)) {
            return true;
        }
        if (C19383o.m32792b(isEnabled$default, FeatureResponse.Enabled.INSTANCE)) {
            ExperimentResponse treatment = this.abManager.getTreatment(new ExperimentRequest(ElmoAbExperiment.NATIVE_ADDRESS_VALIDATION, (String) null, 2, (DefaultConstructorMarker) null));
            ExperimentResponse.Success success = treatment instanceof ExperimentResponse.Success ? (ExperimentResponse.Success) treatment : null;
            if (!(success == null || (response = success.getResponse()) == null)) {
                str = response.getTreatmentName();
            }
            return C19383o.m32792b(str, ElmoTreatment.NATIVE_ADDRESS_VALIDATION_TRMT.getTreatmentName());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest r7, kotlin.coroutines.C19340c<? super com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase.AddAddressResult> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase$invoke$1 r0 = (com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase$invoke$1 r0 = new com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase$invoke$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r5) goto L_0x0039
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x0099
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x0078
        L_0x0039:
            java.lang.Object r7 = r0.L$1
            com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest r7 = (com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest) r7
            java.lang.Object r2 = r0.L$0
            com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase r2 = (com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x005e
        L_0x0045:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            boolean r8 = r6.isAddressValidationOn()
            if (r8 == 0) goto L_0x0090
            com.paypal.pyplcheckout.addressvalidation.ValidateAddressUseCase r8 = r6.validateAddress
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r2 = r6
        L_0x005e:
            com.paypal.pyplcheckout.addressvalidation.AddressRepository$ValidateResult r8 = (com.paypal.pyplcheckout.addressvalidation.AddressRepository.ValidateResult) r8
            boolean r3 = r8 instanceof com.paypal.pyplcheckout.addressvalidation.AddressRepository.ValidateResult.Success
            if (r3 == 0) goto L_0x0079
            com.paypal.pyplcheckout.addressvalidation.AddressRepository$ValidateResult$Success r8 = (com.paypal.pyplcheckout.addressvalidation.AddressRepository.ValidateResult.Success) r8
            com.paypal.pyplcheckout.pojo.AddressValidation r8 = r8.getAddressValidation()
            r3 = 0
            r0.L$0 = r3
            r0.L$1 = r3
            r0.label = r4
            java.lang.Object r8 = r2.handleAddressValidation(r7, r8, r0)
            if (r8 != r1) goto L_0x0078
            return r1
        L_0x0078:
            return r8
        L_0x0079:
            boolean r7 = r8 instanceof com.paypal.pyplcheckout.addressvalidation.AddressRepository.ValidateResult.Error
            if (r7 == 0) goto L_0x008a
            com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase$AddAddressResult$Error r7 = new com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase$AddAddressResult$Error
            com.paypal.pyplcheckout.services.ApiErrorException r8 = new com.paypal.pyplcheckout.services.ApiErrorException
            java.lang.String r0 = "address validation api error"
            r8.<init>(r0)
            r7.<init>(r8)
            return r7
        L_0x008a:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x0090:
            r0.label = r3
            java.lang.Object r8 = r6.addShippingAddress(r7, r0)
            if (r8 != r1) goto L_0x0099
            return r1
        L_0x0099:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase.invoke(com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest, kotlin.coroutines.c):java.lang.Object");
    }
}
