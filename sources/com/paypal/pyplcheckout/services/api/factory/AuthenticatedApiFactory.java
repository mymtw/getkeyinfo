package com.paypal.pyplcheckout.services.api.factory;

import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.addshipping.api.AddressAutoCompleteApi;
import com.paypal.pyplcheckout.addshipping.api.AddressAutoCompletePlaceIdApi;
import com.paypal.pyplcheckout.sca.CompleteStrongCustomerAuthenticationApi;
import com.paypal.pyplcheckout.services.AddShippingApi;
import com.paypal.pyplcheckout.services.api.AddCardApi;
import com.paypal.pyplcheckout.services.api.AddCardThreeDsApi;
import com.paypal.pyplcheckout.services.api.AddShippingAddressApi;
import com.paypal.pyplcheckout.services.api.AddressValidationApi;
import com.paypal.pyplcheckout.services.api.ApproveMemberPaymentApi;
import com.paypal.pyplcheckout.services.api.CryptoCurrencyApi;
import com.paypal.pyplcheckout.services.api.EligibilityApi;
import com.paypal.pyplcheckout.services.api.LsatUpgradeApi;
import com.paypal.pyplcheckout.services.api.ThreeDSAuthenticateApi;
import com.paypal.pyplcheckout.services.api.ThreeDSJwtApi;
import com.paypal.pyplcheckout.services.api.ThreeDSLookUpApi;
import com.paypal.pyplcheckout.services.api.ThreeDSResolveContingencyApi;
import com.paypal.pyplcheckout.services.api.UpdateCurrencyConversionApi;
import com.paypal.pyplcheckout.services.api.UserAndCheckoutApi;
import com.paypal.pyplcheckout.services.api.ValidateAddressApi;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p753kq.C19857l;

public final class AuthenticatedApiFactory<T> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<AddCardApi> addCardApiFactory;
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<AddCardThreeDsApi> addCardThreeDsApiFactory;
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<AddShippingAddressApi> addShippingAddressApiFactory;
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<AddShippingApi> addShippingApiFactory;
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<AddressAutoCompleteApi> addressAutoCompleteApiFactory;
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<AddressAutoCompletePlaceIdApi> addressAutoCompletePlaceIdApiFactory;
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<AddressValidationApi> addressValidationApiFactory;
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<ApproveMemberPaymentApi> approveMemberPaymentApiFactory;
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<CompleteStrongCustomerAuthenticationApi> completeStrongCustomerAuthenticationApiFactory;
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<CryptoCurrencyApi> cryptocurrencyApiFactory;
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<EligibilityApi> eligibilityApiFactory;
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<LsatUpgradeApi> lsatUpgradeApiFactory;
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<ThreeDSAuthenticateApi> threeDSAuthenticateApiFactory;
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<ThreeDSJwtApi> threeDSJwtApiFactory;
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<ThreeDSLookUpApi> threeDSLookUpApiFactory;
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<ThreeDSResolveContingencyApi> threeDSResolveContingencyApiFactory;
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<UpdateCurrencyConversionApi> updateCurrencyConversionApiFactory;
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<UserAndCheckoutApi> userAndCheckoutApiFactory;
    /* access modifiers changed from: private */
    public static AuthenticatedApiFactory<ValidateAddressApi> validateAddressApiFactory;
    private final String accessToken;
    private final C19857l<String, T> apiCreation;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getAddCardApiFactory$annotations() {
        }

        public static /* synthetic */ void getAddCardThreeDsApiFactory$annotations() {
        }

        public static /* synthetic */ void getAddShippingAddressApiFactory$annotations() {
        }

        public static /* synthetic */ void getAddShippingApiFactory$annotations() {
        }

        public static /* synthetic */ void getAddressAutoCompleteApiFactory$annotations() {
        }

        public static /* synthetic */ void getAddressAutoCompletePlaceIdApiFactory$annotations() {
        }

        public static /* synthetic */ void getAddressValidationApiFactory$annotations() {
        }

        public static /* synthetic */ void getApproveMemberPaymentApiFactory$annotations() {
        }

        public static /* synthetic */ void getCompleteStrongCustomerAuthenticationApiFactory$annotations() {
        }

        public static /* synthetic */ void getCryptocurrencyApiFactory$annotations() {
        }

        public static /* synthetic */ void getEligibilityApiFactory$annotations() {
        }

        public static /* synthetic */ void getLsatUpgradeApiFactory$annotations() {
        }

        public static /* synthetic */ void getThreeDSAuthenticateApiFactory$annotations() {
        }

        public static /* synthetic */ void getThreeDSJwtApiFactory$annotations() {
        }

        public static /* synthetic */ void getThreeDSLookUpApiFactory$annotations() {
        }

        public static /* synthetic */ void getThreeDSResolveContingencyApiFactory$annotations() {
        }

        public static /* synthetic */ void getUpdateCurrencyConversionApiFactory$annotations() {
        }

        public static /* synthetic */ void getUserAndCheckoutApiFactory$annotations() {
        }

        public static /* synthetic */ void getValidateAddressApiFactory$annotations() {
        }

        public final AuthenticatedApiFactory<AddCardApi> getAddCardApiFactory() {
            AuthenticatedApiFactory<AddCardApi> access$getAddCardApiFactory$cp = AuthenticatedApiFactory.addCardApiFactory;
            if (access$getAddCardApiFactory$cp != null) {
                return access$getAddCardApiFactory$cp;
            }
            C19383o.m32805o("addCardApiFactory");
            throw null;
        }

        public final AuthenticatedApiFactory<AddCardThreeDsApi> getAddCardThreeDsApiFactory() {
            AuthenticatedApiFactory<AddCardThreeDsApi> access$getAddCardThreeDsApiFactory$cp = AuthenticatedApiFactory.addCardThreeDsApiFactory;
            if (access$getAddCardThreeDsApiFactory$cp != null) {
                return access$getAddCardThreeDsApiFactory$cp;
            }
            C19383o.m32805o("addCardThreeDsApiFactory");
            throw null;
        }

        public final AuthenticatedApiFactory<AddShippingAddressApi> getAddShippingAddressApiFactory() {
            AuthenticatedApiFactory<AddShippingAddressApi> access$getAddShippingAddressApiFactory$cp = AuthenticatedApiFactory.addShippingAddressApiFactory;
            if (access$getAddShippingAddressApiFactory$cp != null) {
                return access$getAddShippingAddressApiFactory$cp;
            }
            C19383o.m32805o("addShippingAddressApiFactory");
            throw null;
        }

        public final AuthenticatedApiFactory<AddShippingApi> getAddShippingApiFactory() {
            AuthenticatedApiFactory<AddShippingApi> access$getAddShippingApiFactory$cp = AuthenticatedApiFactory.addShippingApiFactory;
            if (access$getAddShippingApiFactory$cp != null) {
                return access$getAddShippingApiFactory$cp;
            }
            C19383o.m32805o("addShippingApiFactory");
            throw null;
        }

        public final AuthenticatedApiFactory<AddressAutoCompleteApi> getAddressAutoCompleteApiFactory() {
            AuthenticatedApiFactory<AddressAutoCompleteApi> access$getAddressAutoCompleteApiFactory$cp = AuthenticatedApiFactory.addressAutoCompleteApiFactory;
            if (access$getAddressAutoCompleteApiFactory$cp != null) {
                return access$getAddressAutoCompleteApiFactory$cp;
            }
            C19383o.m32805o("addressAutoCompleteApiFactory");
            throw null;
        }

        public final AuthenticatedApiFactory<AddressAutoCompletePlaceIdApi> getAddressAutoCompletePlaceIdApiFactory() {
            AuthenticatedApiFactory<AddressAutoCompletePlaceIdApi> access$getAddressAutoCompletePlaceIdApiFactory$cp = AuthenticatedApiFactory.addressAutoCompletePlaceIdApiFactory;
            if (access$getAddressAutoCompletePlaceIdApiFactory$cp != null) {
                return access$getAddressAutoCompletePlaceIdApiFactory$cp;
            }
            C19383o.m32805o("addressAutoCompletePlaceIdApiFactory");
            throw null;
        }

        public final AuthenticatedApiFactory<AddressValidationApi> getAddressValidationApiFactory() {
            AuthenticatedApiFactory<AddressValidationApi> access$getAddressValidationApiFactory$cp = AuthenticatedApiFactory.addressValidationApiFactory;
            if (access$getAddressValidationApiFactory$cp != null) {
                return access$getAddressValidationApiFactory$cp;
            }
            C19383o.m32805o("addressValidationApiFactory");
            throw null;
        }

        public final AuthenticatedApiFactory<ApproveMemberPaymentApi> getApproveMemberPaymentApiFactory() {
            AuthenticatedApiFactory<ApproveMemberPaymentApi> access$getApproveMemberPaymentApiFactory$cp = AuthenticatedApiFactory.approveMemberPaymentApiFactory;
            if (access$getApproveMemberPaymentApiFactory$cp != null) {
                return access$getApproveMemberPaymentApiFactory$cp;
            }
            C19383o.m32805o("approveMemberPaymentApiFactory");
            throw null;
        }

        public final AuthenticatedApiFactory<CompleteStrongCustomerAuthenticationApi> getCompleteStrongCustomerAuthenticationApiFactory() {
            AuthenticatedApiFactory<CompleteStrongCustomerAuthenticationApi> access$getCompleteStrongCustomerAuthenticationApiFactory$cp = AuthenticatedApiFactory.completeStrongCustomerAuthenticationApiFactory;
            if (access$getCompleteStrongCustomerAuthenticationApiFactory$cp != null) {
                return access$getCompleteStrongCustomerAuthenticationApiFactory$cp;
            }
            C19383o.m32805o("completeStrongCustomerAuthenticationApiFactory");
            throw null;
        }

        public final AuthenticatedApiFactory<CryptoCurrencyApi> getCryptocurrencyApiFactory() {
            AuthenticatedApiFactory<CryptoCurrencyApi> access$getCryptocurrencyApiFactory$cp = AuthenticatedApiFactory.cryptocurrencyApiFactory;
            if (access$getCryptocurrencyApiFactory$cp != null) {
                return access$getCryptocurrencyApiFactory$cp;
            }
            C19383o.m32805o("cryptocurrencyApiFactory");
            throw null;
        }

        public final AuthenticatedApiFactory<EligibilityApi> getEligibilityApiFactory() {
            AuthenticatedApiFactory<EligibilityApi> access$getEligibilityApiFactory$cp = AuthenticatedApiFactory.eligibilityApiFactory;
            if (access$getEligibilityApiFactory$cp != null) {
                return access$getEligibilityApiFactory$cp;
            }
            C19383o.m32805o("eligibilityApiFactory");
            throw null;
        }

        public final AuthenticatedApiFactory<LsatUpgradeApi> getLsatUpgradeApiFactory() {
            AuthenticatedApiFactory<LsatUpgradeApi> access$getLsatUpgradeApiFactory$cp = AuthenticatedApiFactory.lsatUpgradeApiFactory;
            if (access$getLsatUpgradeApiFactory$cp != null) {
                return access$getLsatUpgradeApiFactory$cp;
            }
            C19383o.m32805o("lsatUpgradeApiFactory");
            throw null;
        }

        public final AuthenticatedApiFactory<ThreeDSAuthenticateApi> getThreeDSAuthenticateApiFactory() {
            AuthenticatedApiFactory<ThreeDSAuthenticateApi> access$getThreeDSAuthenticateApiFactory$cp = AuthenticatedApiFactory.threeDSAuthenticateApiFactory;
            if (access$getThreeDSAuthenticateApiFactory$cp != null) {
                return access$getThreeDSAuthenticateApiFactory$cp;
            }
            C19383o.m32805o("threeDSAuthenticateApiFactory");
            throw null;
        }

        public final AuthenticatedApiFactory<ThreeDSJwtApi> getThreeDSJwtApiFactory() {
            AuthenticatedApiFactory<ThreeDSJwtApi> access$getThreeDSJwtApiFactory$cp = AuthenticatedApiFactory.threeDSJwtApiFactory;
            if (access$getThreeDSJwtApiFactory$cp != null) {
                return access$getThreeDSJwtApiFactory$cp;
            }
            C19383o.m32805o("threeDSJwtApiFactory");
            throw null;
        }

        public final AuthenticatedApiFactory<ThreeDSLookUpApi> getThreeDSLookUpApiFactory() {
            AuthenticatedApiFactory<ThreeDSLookUpApi> access$getThreeDSLookUpApiFactory$cp = AuthenticatedApiFactory.threeDSLookUpApiFactory;
            if (access$getThreeDSLookUpApiFactory$cp != null) {
                return access$getThreeDSLookUpApiFactory$cp;
            }
            C19383o.m32805o("threeDSLookUpApiFactory");
            throw null;
        }

        public final AuthenticatedApiFactory<ThreeDSResolveContingencyApi> getThreeDSResolveContingencyApiFactory() {
            AuthenticatedApiFactory<ThreeDSResolveContingencyApi> access$getThreeDSResolveContingencyApiFactory$cp = AuthenticatedApiFactory.threeDSResolveContingencyApiFactory;
            if (access$getThreeDSResolveContingencyApiFactory$cp != null) {
                return access$getThreeDSResolveContingencyApiFactory$cp;
            }
            C19383o.m32805o("threeDSResolveContingencyApiFactory");
            throw null;
        }

        public final AuthenticatedApiFactory<UpdateCurrencyConversionApi> getUpdateCurrencyConversionApiFactory() {
            AuthenticatedApiFactory<UpdateCurrencyConversionApi> access$getUpdateCurrencyConversionApiFactory$cp = AuthenticatedApiFactory.updateCurrencyConversionApiFactory;
            if (access$getUpdateCurrencyConversionApiFactory$cp != null) {
                return access$getUpdateCurrencyConversionApiFactory$cp;
            }
            C19383o.m32805o("updateCurrencyConversionApiFactory");
            throw null;
        }

        public final AuthenticatedApiFactory<UserAndCheckoutApi> getUserAndCheckoutApiFactory() {
            AuthenticatedApiFactory<UserAndCheckoutApi> access$getUserAndCheckoutApiFactory$cp = AuthenticatedApiFactory.userAndCheckoutApiFactory;
            if (access$getUserAndCheckoutApiFactory$cp != null) {
                return access$getUserAndCheckoutApiFactory$cp;
            }
            C19383o.m32805o("userAndCheckoutApiFactory");
            throw null;
        }

        public final AuthenticatedApiFactory<ValidateAddressApi> getValidateAddressApiFactory() {
            AuthenticatedApiFactory<ValidateAddressApi> access$getValidateAddressApiFactory$cp = AuthenticatedApiFactory.validateAddressApiFactory;
            if (access$getValidateAddressApiFactory$cp != null) {
                return access$getValidateAddressApiFactory$cp;
            }
            C19383o.m32805o("validateAddressApiFactory");
            throw null;
        }

        public final void initializeFactories(String str) {
            C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
            AuthenticatedApiFactory.lsatUpgradeApiFactory = new AuthenticatedApiFactory(str, AuthenticatedApiFactory$Companion$initializeFactories$1.INSTANCE);
            AuthenticatedApiFactory.eligibilityApiFactory = new AuthenticatedApiFactory(str, AuthenticatedApiFactory$Companion$initializeFactories$2.INSTANCE);
            AuthenticatedApiFactory.approveMemberPaymentApiFactory = new AuthenticatedApiFactory(str, AuthenticatedApiFactory$Companion$initializeFactories$3.INSTANCE);
            AuthenticatedApiFactory.userAndCheckoutApiFactory = new AuthenticatedApiFactory(str, AuthenticatedApiFactory$Companion$initializeFactories$4.INSTANCE);
            AuthenticatedApiFactory.cryptocurrencyApiFactory = new AuthenticatedApiFactory(str, AuthenticatedApiFactory$Companion$initializeFactories$5.INSTANCE);
            AuthenticatedApiFactory.updateCurrencyConversionApiFactory = new AuthenticatedApiFactory(str, AuthenticatedApiFactory$Companion$initializeFactories$6.INSTANCE);
            AuthenticatedApiFactory.addShippingAddressApiFactory = new AuthenticatedApiFactory(str, AuthenticatedApiFactory$Companion$initializeFactories$7.INSTANCE);
            AuthenticatedApiFactory.completeStrongCustomerAuthenticationApiFactory = new AuthenticatedApiFactory(str, new AuthenticatedApiFactory$Companion$initializeFactories$8(str));
            AuthenticatedApiFactory.threeDSJwtApiFactory = new AuthenticatedApiFactory(str, AuthenticatedApiFactory$Companion$initializeFactories$9.INSTANCE);
            AuthenticatedApiFactory.threeDSLookUpApiFactory = new AuthenticatedApiFactory(str, AuthenticatedApiFactory$Companion$initializeFactories$10.INSTANCE);
            AuthenticatedApiFactory.threeDSResolveContingencyApiFactory = new AuthenticatedApiFactory(str, new AuthenticatedApiFactory$Companion$initializeFactories$11(str));
            AuthenticatedApiFactory.threeDSAuthenticateApiFactory = new AuthenticatedApiFactory(str, new AuthenticatedApiFactory$Companion$initializeFactories$12(str));
            AuthenticatedApiFactory.addCardApiFactory = new AuthenticatedApiFactory(str, new AuthenticatedApiFactory$Companion$initializeFactories$13(str));
            AuthenticatedApiFactory.validateAddressApiFactory = new AuthenticatedApiFactory(str, AuthenticatedApiFactory$Companion$initializeFactories$14.INSTANCE);
            AuthenticatedApiFactory.addressAutoCompleteApiFactory = new AuthenticatedApiFactory(str, new AuthenticatedApiFactory$Companion$initializeFactories$15(str));
            AuthenticatedApiFactory.addressAutoCompletePlaceIdApiFactory = new AuthenticatedApiFactory(str, new AuthenticatedApiFactory$Companion$initializeFactories$16(str));
            AuthenticatedApiFactory.addCardThreeDsApiFactory = new AuthenticatedApiFactory(str, new AuthenticatedApiFactory$Companion$initializeFactories$17(str));
            AuthenticatedApiFactory.addressValidationApiFactory = new AuthenticatedApiFactory(str, new AuthenticatedApiFactory$Companion$initializeFactories$18(str));
            AuthenticatedApiFactory.addShippingApiFactory = new AuthenticatedApiFactory(str, new AuthenticatedApiFactory$Companion$initializeFactories$19(str));
        }
    }

    public AuthenticatedApiFactory(String str, C19857l<? super String, ? extends T> lVar) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        C19383o.m32797g(lVar, "apiCreation");
        this.accessToken = str;
        this.apiCreation = lVar;
    }

    public static final AuthenticatedApiFactory<AddCardApi> getAddCardApiFactory() {
        return Companion.getAddCardApiFactory();
    }

    public static final AuthenticatedApiFactory<AddCardThreeDsApi> getAddCardThreeDsApiFactory() {
        return Companion.getAddCardThreeDsApiFactory();
    }

    public static final AuthenticatedApiFactory<AddShippingAddressApi> getAddShippingAddressApiFactory() {
        return Companion.getAddShippingAddressApiFactory();
    }

    public static final AuthenticatedApiFactory<AddShippingApi> getAddShippingApiFactory() {
        return Companion.getAddShippingApiFactory();
    }

    public static final AuthenticatedApiFactory<AddressAutoCompleteApi> getAddressAutoCompleteApiFactory() {
        return Companion.getAddressAutoCompleteApiFactory();
    }

    public static final AuthenticatedApiFactory<AddressAutoCompletePlaceIdApi> getAddressAutoCompletePlaceIdApiFactory() {
        return Companion.getAddressAutoCompletePlaceIdApiFactory();
    }

    public static final AuthenticatedApiFactory<AddressValidationApi> getAddressValidationApiFactory() {
        return Companion.getAddressValidationApiFactory();
    }

    public static final AuthenticatedApiFactory<ApproveMemberPaymentApi> getApproveMemberPaymentApiFactory() {
        return Companion.getApproveMemberPaymentApiFactory();
    }

    public static final AuthenticatedApiFactory<CompleteStrongCustomerAuthenticationApi> getCompleteStrongCustomerAuthenticationApiFactory() {
        return Companion.getCompleteStrongCustomerAuthenticationApiFactory();
    }

    public static final AuthenticatedApiFactory<CryptoCurrencyApi> getCryptocurrencyApiFactory() {
        return Companion.getCryptocurrencyApiFactory();
    }

    public static final AuthenticatedApiFactory<EligibilityApi> getEligibilityApiFactory() {
        return Companion.getEligibilityApiFactory();
    }

    public static final AuthenticatedApiFactory<LsatUpgradeApi> getLsatUpgradeApiFactory() {
        return Companion.getLsatUpgradeApiFactory();
    }

    public static final AuthenticatedApiFactory<ThreeDSAuthenticateApi> getThreeDSAuthenticateApiFactory() {
        return Companion.getThreeDSAuthenticateApiFactory();
    }

    public static final AuthenticatedApiFactory<ThreeDSJwtApi> getThreeDSJwtApiFactory() {
        return Companion.getThreeDSJwtApiFactory();
    }

    public static final AuthenticatedApiFactory<ThreeDSLookUpApi> getThreeDSLookUpApiFactory() {
        return Companion.getThreeDSLookUpApiFactory();
    }

    public static final AuthenticatedApiFactory<ThreeDSResolveContingencyApi> getThreeDSResolveContingencyApiFactory() {
        return Companion.getThreeDSResolveContingencyApiFactory();
    }

    public static final AuthenticatedApiFactory<UpdateCurrencyConversionApi> getUpdateCurrencyConversionApiFactory() {
        return Companion.getUpdateCurrencyConversionApiFactory();
    }

    public static final AuthenticatedApiFactory<UserAndCheckoutApi> getUserAndCheckoutApiFactory() {
        return Companion.getUserAndCheckoutApiFactory();
    }

    public static final AuthenticatedApiFactory<ValidateAddressApi> getValidateAddressApiFactory() {
        return Companion.getValidateAddressApiFactory();
    }

    public static final void initializeFactories(String str) {
        Companion.initializeFactories(str);
    }

    public final T create() {
        return this.apiCreation.invoke(this.accessToken);
    }
}
