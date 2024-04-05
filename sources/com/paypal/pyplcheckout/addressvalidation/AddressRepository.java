package com.paypal.pyplcheckout.addressvalidation;

import com.paypal.pyplcheckout.addressvalidation.response.Address;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.pojo.AddressValidation;
import com.paypal.pyplcheckout.pojo.Error;
import com.paypal.pyplcheckout.pojo.NewShippingAddressRequest;
import com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.services.api.AddShippingAddressApi;
import com.paypal.pyplcheckout.services.api.LocaleMetadataApi;
import com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory;
import com.paypal.pyplcheckout.services.callbacks.AddShippingAddressCallback;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AddressRepository {
    private AddressValidation addressValidation;
    private PortableShippingAddressRequest enteredAddress;
    private final Events events;
    private Pair<String, Address> localeMetadataAddress;
    private final LocaleMetadataApi localeMetadataApi;
    private final Repository repository;

    public static abstract class ValidateResult {

        public static final class Error extends ValidateResult {
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

        public static final class Success extends ValidateResult {
            private final AddressValidation addressValidation;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Success(AddressValidation addressValidation2) {
                super((DefaultConstructorMarker) null);
                C19383o.m32797g(addressValidation2, "addressValidation");
                this.addressValidation = addressValidation2;
            }

            public static /* synthetic */ Success copy$default(Success success, AddressValidation addressValidation2, int i, Object obj) {
                if ((i & 1) != 0) {
                    addressValidation2 = success.addressValidation;
                }
                return success.copy(addressValidation2);
            }

            public final AddressValidation component1() {
                return this.addressValidation;
            }

            public final Success copy(AddressValidation addressValidation2) {
                C19383o.m32797g(addressValidation2, "addressValidation");
                return new Success(addressValidation2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && C19383o.m32792b(this.addressValidation, ((Success) obj).addressValidation);
            }

            public final AddressValidation getAddressValidation() {
                return this.addressValidation;
            }

            public int hashCode() {
                return this.addressValidation.hashCode();
            }

            public String toString() {
                AddressValidation addressValidation2 = this.addressValidation;
                return "Success(addressValidation=" + addressValidation2 + ")";
            }
        }

        private ValidateResult() {
        }

        public /* synthetic */ ValidateResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AddressRepository(Events events2, Repository repository2, LocaleMetadataApi localeMetadataApi2) {
        C19383o.m32797g(events2, "events");
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(localeMetadataApi2, "localeMetadataApi");
        this.events = events2;
        this.repository = repository2;
        this.localeMetadataApi = localeMetadataApi2;
    }

    private final void addressFailProtocol(String str, List<Error> list) {
        this.events.fire(PayPalEventTypes.NEW_SHIPPING_ADDRESS_RESULT, new com.paypal.pyplcheckout.events.Error(list));
        PLog.decision$default(PEnums.TransitionName.ADD_SHIPPING_ADDRESS_API, PEnums.Outcome.FAILED, PEnums.EventCode.E531, PEnums.StateName.SHIPPING, (String) null, (String) null, str, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1968, (Object) null);
    }

    public static /* synthetic */ void addressFailProtocol$default(AddressRepository addressRepository, String str, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        addressRepository.addressFailProtocol(str, list);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object performLocaleMetadataCall(java.lang.String r5, kotlin.coroutines.C19340c<? super com.paypal.pyplcheckout.addressvalidation.response.Address> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.paypal.pyplcheckout.addressvalidation.AddressRepository$performLocaleMetadataCall$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.paypal.pyplcheckout.addressvalidation.AddressRepository$performLocaleMetadataCall$1 r0 = (com.paypal.pyplcheckout.addressvalidation.AddressRepository$performLocaleMetadataCall$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.pyplcheckout.addressvalidation.AddressRepository$performLocaleMetadataCall$1 r0 = new com.paypal.pyplcheckout.addressvalidation.AddressRepository$performLocaleMetadataCall$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            com.paypal.pyplcheckout.addressvalidation.AddressRepository r0 = (com.paypal.pyplcheckout.addressvalidation.AddressRepository) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x004f
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            com.paypal.pyplcheckout.addressvalidation.request.LocaleMetadataRequest r6 = new com.paypal.pyplcheckout.addressvalidation.request.LocaleMetadataRequest
            r6.<init>(r5)
            com.paypal.pyplcheckout.services.api.LocaleMetadataApi r2 = r4.localeMetadataApi
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r2.execute(r6, r0)
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r0 = r4
        L_0x004f:
            com.paypal.pyplcheckout.addressvalidation.response.LocaleMetadataResponse r6 = (com.paypal.pyplcheckout.addressvalidation.response.LocaleMetadataResponse) r6
            com.paypal.pyplcheckout.addressvalidation.response.LocaleMetadataData r1 = r6.getData()
            com.paypal.pyplcheckout.addressvalidation.response.LocaleMetadata r1 = r1.getLocaleMetadata()
            com.paypal.pyplcheckout.addressvalidation.response.Address r1 = r1.getAddress()
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r5, r1)
            r0.localeMetadataAddress = r2
            com.paypal.pyplcheckout.addressvalidation.response.LocaleMetadataData r5 = r6.getData()
            com.paypal.pyplcheckout.addressvalidation.response.LocaleMetadata r5 = r5.getLocaleMetadata()
            com.paypal.pyplcheckout.addressvalidation.response.Address r5 = r5.getAddress()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addressvalidation.AddressRepository.performLocaleMetadataCall(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public final void addNewShippingAddress(NewShippingAddressRequest newShippingAddressRequest) {
        C19383o.m32797g(newShippingAddressRequest, "newShippingAddressRequest");
        AddShippingAddressApi create = AuthenticatedApiFactory.Companion.getAddShippingAddressApiFactory().create();
        create.setShippingAddressRequest(newShippingAddressRequest);
        create.enqueueRequest(AddShippingAddressCallback.Companion.get());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object addShippingAddress(com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest r21, kotlin.coroutines.C19340c<? super com.paypal.pyplcheckout.utils.Result<java.util.List<com.paypal.pyplcheckout.pojo.ShippingAddress>>> r22) throws java.lang.Exception {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof com.paypal.pyplcheckout.addressvalidation.AddressRepository$addShippingAddress$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.paypal.pyplcheckout.addressvalidation.AddressRepository$addShippingAddress$1 r2 = (com.paypal.pyplcheckout.addressvalidation.AddressRepository$addShippingAddress$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.paypal.pyplcheckout.addressvalidation.AddressRepository$addShippingAddress$1 r2 = new com.paypal.pyplcheckout.addressvalidation.AddressRepository$addShippingAddress$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x0037
            if (r4 != r5) goto L_0x002f
            java.lang.Object r2 = r2.L$0
            com.paypal.pyplcheckout.addressvalidation.AddressRepository r2 = (com.paypal.pyplcheckout.addressvalidation.AddressRepository) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            goto L_0x0054
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory$Companion r1 = com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory.Companion
            com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory r1 = r1.getAddShippingApiFactory()
            java.lang.Object r1 = r1.create()
            com.paypal.pyplcheckout.services.AddShippingApi r1 = (com.paypal.pyplcheckout.services.AddShippingApi) r1
            r2.L$0 = r0
            r2.label = r5
            r4 = r21
            java.lang.Object r1 = r1.addShipping(r4, r2)
            if (r1 != r3) goto L_0x0053
            return r3
        L_0x0053:
            r2 = r0
        L_0x0054:
            com.paypal.pyplcheckout.pojo.AddShippingAddressResponse r1 = (com.paypal.pyplcheckout.pojo.AddShippingAddressResponse) r1
            java.util.List r3 = r1.getErrors()
            if (r3 == 0) goto L_0x0064
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r5 = 0
        L_0x0064:
            if (r5 == 0) goto L_0x00b9
            com.paypal.pyplcheckout.services.Repository r3 = r2.repository
            com.paypal.pyplcheckout.pojo.EmbeddedCheckoutSession r4 = r1.getData()
            r5 = 0
            if (r4 != 0) goto L_0x0071
            r4 = r5
            goto L_0x0075
        L_0x0071:
            com.paypal.pyplcheckout.pojo.CheckoutSession r4 = r4.getCheckoutSession()
        L_0x0075:
            r3.setCheckoutSession(r4)
            com.paypal.pyplcheckout.pojo.EmbeddedCheckoutSession r1 = r1.getData()
            if (r1 != 0) goto L_0x0080
        L_0x007e:
            r1 = r5
            goto L_0x008b
        L_0x0080:
            com.paypal.pyplcheckout.pojo.CheckoutSession r1 = r1.getCheckoutSession()
            if (r1 != 0) goto L_0x0087
            goto L_0x007e
        L_0x0087:
            java.util.List r1 = r1.getShippingAddresses()
        L_0x008b:
            com.paypal.pyplcheckout.events.Events r3 = r2.events
            com.paypal.pyplcheckout.events.PayPalEventTypes r4 = com.paypal.pyplcheckout.events.PayPalEventTypes.NEW_SHIPPING_ADDRESS_RESULT
            com.paypal.pyplcheckout.events.Success r6 = new com.paypal.pyplcheckout.events.Success
            r6.<init>(r1)
            r3.fire(r4, r6)
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.ADD_SHIPPING_ADDRESS_API
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r8 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SUCCEEDED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r9 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E210
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r10 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.SHIPPING
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 2032(0x7f0, float:2.847E-42)
            r19 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.decision$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.enteredAddress = r5
            r2.addressValidation = r5
            com.paypal.pyplcheckout.utils.Result$Success r2 = new com.paypal.pyplcheckout.utils.Result$Success
            r2.<init>(r1)
            goto L_0x00fb
        L_0x00b9:
            java.util.List r3 = r1.getErrors()
            java.lang.Object r3 = kotlin.collections.C19327t.m32640V0(r3)
            com.paypal.pyplcheckout.pojo.Error r3 = (com.paypal.pyplcheckout.pojo.Error) r3
            java.lang.String r4 = "errors with submitted address"
            if (r3 != 0) goto L_0x00c8
            goto L_0x00d0
        L_0x00c8:
            java.lang.String r3 = r3.getMessage()
            if (r3 != 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r4 = r3
        L_0x00d0:
            java.util.List r3 = r1.getErrors()
            r2.addressFailProtocol(r4, r3)
            java.util.List r3 = r1.getErrors()
            boolean r3 = com.paypal.pyplcheckout.pojo.ErrorKt.containsContingencies(r3)
            if (r3 == 0) goto L_0x00f1
            com.paypal.pyplcheckout.events.Events r2 = r2.events
            com.paypal.pyplcheckout.events.ExtendedPayPalEventTypes r3 = com.paypal.pyplcheckout.events.ExtendedPayPalEventTypes.CONTINGENCY_ERROR
            com.paypal.pyplcheckout.events.Error r5 = new com.paypal.pyplcheckout.events.Error
            java.util.List r1 = r1.getErrors()
            r5.<init>(r1)
            r2.fire(r3, r5)
        L_0x00f1:
            com.paypal.pyplcheckout.utils.Result$Error r2 = new com.paypal.pyplcheckout.utils.Result$Error
            com.paypal.pyplcheckout.services.ApiErrorException r1 = new com.paypal.pyplcheckout.services.ApiErrorException
            r1.<init>(r4)
            r2.<init>(r1)
        L_0x00fb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addressvalidation.AddressRepository.addShippingAddress(com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest, kotlin.coroutines.c):java.lang.Object");
    }

    public final AddressValidation getAddressValidation() {
        return this.addressValidation;
    }

    public final PortableShippingAddressRequest getEnteredAddress() {
        return this.enteredAddress;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getLocaleMetaData(java.lang.String r6, kotlin.coroutines.C19340c<? super com.paypal.pyplcheckout.addressvalidation.response.Address> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.paypal.pyplcheckout.addressvalidation.AddressRepository$getLocaleMetaData$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.paypal.pyplcheckout.addressvalidation.AddressRepository$getLocaleMetaData$1 r0 = (com.paypal.pyplcheckout.addressvalidation.AddressRepository$getLocaleMetaData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.pyplcheckout.addressvalidation.AddressRepository$getLocaleMetaData$1 r0 = new com.paypal.pyplcheckout.addressvalidation.AddressRepository$getLocaleMetaData$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            goto L_0x0046
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            goto L_0x0061
        L_0x0036:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            kotlin.Pair<java.lang.String, com.paypal.pyplcheckout.addressvalidation.response.Address> r7 = r5.localeMetadataAddress
            if (r7 != 0) goto L_0x0047
            r0.label = r3
            java.lang.Object r7 = r5.performLocaleMetadataCall(r6, r0)
            if (r7 != r1) goto L_0x0046
            return r1
        L_0x0046:
            return r7
        L_0x0047:
            java.lang.Object r2 = r7.getFirst()
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r2, r6)
            if (r2 == 0) goto L_0x0058
            java.lang.Object r6 = r7.getSecond()
            com.paypal.pyplcheckout.addressvalidation.response.Address r6 = (com.paypal.pyplcheckout.addressvalidation.response.Address) r6
            goto L_0x0064
        L_0x0058:
            r0.label = r4
            java.lang.Object r7 = r5.performLocaleMetadataCall(r6, r0)
            if (r7 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r6 = r7
            com.paypal.pyplcheckout.addressvalidation.response.Address r6 = (com.paypal.pyplcheckout.addressvalidation.response.Address) r6
        L_0x0064:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addressvalidation.AddressRepository.getLocaleMetaData(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059 A[Catch:{ Exception -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b A[Catch:{ Exception -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063 A[Catch:{ Exception -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095 A[Catch:{ Exception -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object validateAddress(com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest r5, kotlin.coroutines.C19340c<? super com.paypal.pyplcheckout.addressvalidation.AddressRepository.ValidateResult> r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.paypal.pyplcheckout.addressvalidation.AddressRepository$validateAddress$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.paypal.pyplcheckout.addressvalidation.AddressRepository$validateAddress$1 r0 = (com.paypal.pyplcheckout.addressvalidation.AddressRepository$validateAddress$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.pyplcheckout.addressvalidation.AddressRepository$validateAddress$1 r0 = new com.paypal.pyplcheckout.addressvalidation.AddressRepository$validateAddress$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.L$0
            com.paypal.pyplcheckout.addressvalidation.AddressRepository r5 = (com.paypal.pyplcheckout.addressvalidation.AddressRepository) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x0050
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            r4.enteredAddress = r5
            com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory$Companion r6 = com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory.Companion     // Catch:{ Exception -> 0x00a8 }
            com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory r6 = r6.getAddressValidationApiFactory()     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r6 = r6.create()     // Catch:{ Exception -> 0x00a8 }
            com.paypal.pyplcheckout.services.api.AddressValidationApi r6 = (com.paypal.pyplcheckout.services.api.AddressValidationApi) r6     // Catch:{ Exception -> 0x00a8 }
            r0.L$0 = r4     // Catch:{ Exception -> 0x00a8 }
            r0.label = r3     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r6 = r6.validateAddress(r5, r0)     // Catch:{ Exception -> 0x00a8 }
            if (r6 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r5 = r4
        L_0x0050:
            com.paypal.pyplcheckout.pojo.AddressValidationResponse r6 = (com.paypal.pyplcheckout.pojo.AddressValidationResponse) r6     // Catch:{ Exception -> 0x00a8 }
            java.util.List r0 = r6.getErrors()     // Catch:{ Exception -> 0x00a8 }
            r1 = 0
            if (r0 != 0) goto L_0x005b
            r0 = r1
            goto L_0x0061
        L_0x005b:
            java.lang.Object r0 = kotlin.collections.C19327t.m32640V0(r0)     // Catch:{ Exception -> 0x00a8 }
            com.paypal.pyplcheckout.pojo.Error r0 = (com.paypal.pyplcheckout.pojo.Error) r0     // Catch:{ Exception -> 0x00a8 }
        L_0x0061:
            if (r0 != 0) goto L_0x0095
            com.paypal.pyplcheckout.pojo.AddressValidationData r0 = r6.getData()     // Catch:{ Exception -> 0x00a8 }
            if (r0 != 0) goto L_0x006a
            goto L_0x006e
        L_0x006a:
            com.paypal.pyplcheckout.pojo.AddressValidation r1 = r0.getAddressValidation()     // Catch:{ Exception -> 0x00a8 }
        L_0x006e:
            if (r1 == 0) goto L_0x0088
            com.paypal.pyplcheckout.pojo.AddressValidationData r0 = r6.getData()     // Catch:{ Exception -> 0x00a8 }
            com.paypal.pyplcheckout.pojo.AddressValidation r0 = r0.getAddressValidation()     // Catch:{ Exception -> 0x00a8 }
            r5.addressValidation = r0     // Catch:{ Exception -> 0x00a8 }
            com.paypal.pyplcheckout.addressvalidation.AddressRepository$ValidateResult$Success r5 = new com.paypal.pyplcheckout.addressvalidation.AddressRepository$ValidateResult$Success     // Catch:{ Exception -> 0x00a8 }
            com.paypal.pyplcheckout.pojo.AddressValidationData r6 = r6.getData()     // Catch:{ Exception -> 0x00a8 }
            com.paypal.pyplcheckout.pojo.AddressValidation r6 = r6.getAddressValidation()     // Catch:{ Exception -> 0x00a8 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x0094
        L_0x0088:
            com.paypal.pyplcheckout.addressvalidation.AddressRepository$ValidateResult$Error r5 = new com.paypal.pyplcheckout.addressvalidation.AddressRepository$ValidateResult$Error     // Catch:{ Exception -> 0x00a8 }
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r0 = "address validation data is null"
            r6.<init>(r0)     // Catch:{ Exception -> 0x00a8 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00a8 }
        L_0x0094:
            return r5
        L_0x0095:
            com.paypal.pyplcheckout.addressvalidation.AddressRepository$ValidateResult$Error r5 = new com.paypal.pyplcheckout.addressvalidation.AddressRepository$ValidateResult$Error     // Catch:{ Exception -> 0x00a8 }
            com.paypal.pyplcheckout.services.ApiErrorException r6 = new com.paypal.pyplcheckout.services.ApiErrorException     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x00a8 }
            if (r0 != 0) goto L_0x00a1
            java.lang.String r0 = "address validation api error"
        L_0x00a1:
            r6.<init>(r0)     // Catch:{ Exception -> 0x00a8 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00a8 }
            return r5
        L_0x00a8:
            r5 = move-exception
            com.paypal.pyplcheckout.addressvalidation.AddressRepository$ValidateResult$Error r6 = new com.paypal.pyplcheckout.addressvalidation.AddressRepository$ValidateResult$Error
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addressvalidation.AddressRepository.validateAddress(com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest, kotlin.coroutines.c):java.lang.Object");
    }
}
