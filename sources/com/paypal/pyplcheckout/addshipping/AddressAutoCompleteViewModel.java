package com.paypal.pyplcheckout.addshipping;

import android.content.Context;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import androidx.lifecycle.LiveData;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.login.LoginFragment;
import com.google.gson.C16708i;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompletePlaceIdRequest;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompletePlaceIdResponse;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompleteRequest;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompleteResponse;
import com.paypal.pyplcheckout.addshipping.model.Country;
import com.paypal.pyplcheckout.common.cache.Cache;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.Error;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p539ab.AbManager;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoAbExperiment;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoTreatment;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentRequest;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentResponse;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.pojo.ValidateAddressError;
import com.paypal.pyplcheckout.pojo.ValidateAddressQueryParams;
import com.paypal.pyplcheckout.services.Repository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.CoroutineStart;
import org.json.JSONObject;

public final class AddressAutoCompleteViewModel extends C2866i0 {
    private C2895z<List<Country>> _autoCompleteAddShippingCountriesResponse = new C2895z<>();
    /* access modifiers changed from: private */
    public C2895z<AddressAutoCompletePlaceIdResponse> _autoCompleteAddShippingPlaceIdResponse = new C2895z<>();
    /* access modifiers changed from: private */
    public C2895z<Pair<String, AddressAutoCompleteResponse>> _autoCompleteAddShippingResponse = new C2895z<>();
    /* access modifiers changed from: private */
    public C2895z<Boolean> _countryCacheCompletionFlag = new C2895z<>();
    private final AbManager abManager;
    private C19699g1 autoCompleteAddShippingPlaceIdResponseJob;
    private C19699g1 autoCompleteAddShippingResponseJob;
    /* access modifiers changed from: private */
    public JSONObject countriesJSONObject;
    private final DebugConfigManager debugConfigManager;
    /* access modifiers changed from: private */
    public final Events events;
    /* access modifiers changed from: private */
    public final C16708i gson;
    /* access modifiers changed from: private */
    public final Repository repository;
    private final EventListener validateAddressRequestedListener;
    private C19699g1 validateAddressResponseJob;

    public static abstract class AddressAutoCompleteBanner {
        private final String text;

        public static final class Error extends AddressAutoCompleteBanner {
            private final String text;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Error(String str) {
                super(str, (DefaultConstructorMarker) null);
                C19383o.m32797g(str, "text");
                this.text = str;
            }

            public String getText() {
                return this.text;
            }
        }

        public static final class Success extends AddressAutoCompleteBanner {
            private final String text;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Success(String str) {
                super(str, (DefaultConstructorMarker) null);
                C19383o.m32797g(str, "text");
                this.text = str;
            }

            public String getText() {
                return this.text;
            }
        }

        private AddressAutoCompleteBanner(String str) {
            this.text = str;
        }

        public /* synthetic */ AddressAutoCompleteBanner(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public String getText() {
            return this.text;
        }
    }

    public AddressAutoCompleteViewModel(Repository repository2, AbManager abManager2, Events events2, C16708i iVar, DebugConfigManager debugConfigManager2) {
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(abManager2, "abManager");
        C19383o.m32797g(events2, "events");
        C19383o.m32797g(iVar, "gson");
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        this.repository = repository2;
        this.abManager = abManager2;
        this.events = events2;
        this.gson = iVar;
        this.debugConfigManager = debugConfigManager2;
        C17193a aVar = new C17193a(this, 0);
        this.validateAddressRequestedListener = aVar;
        events2.listen(PayPalEventTypes.VALIDATE_ADDRESS_API_REQUESTED, aVar);
    }

    /* access modifiers changed from: private */
    public final void handleValidateAddressFailure(String str, List<ValidateAddressError> list, IOException iOException) {
        PLog pLog = PLog.INSTANCE;
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E633, str == null ? "validate address api error" : str, (String) null, iOException, PEnums.TransitionName.VALIDATE_ADDRESS_RESPONSE, PEnums.StateName.READY, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1928, (Object) null);
        this.events.fire(PayPalEventTypes.VALIDATE_ADDRESS_API_FINISHED, new Error(list));
    }

    public static /* synthetic */ void handleValidateAddressFailure$default(AddressAutoCompleteViewModel addressAutoCompleteViewModel, String str, List list, IOException iOException, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            iOException = null;
        }
        addressAutoCompleteViewModel.handleValidateAddressFailure(str, list, iOException);
    }

    /* access modifiers changed from: private */
    public final void instrumentError(IOException iOException) {
        PLog pLog = PLog.INSTANCE;
        PEnums.ErrorType errorType = PEnums.ErrorType.FATAL;
        PEnums.EventCode eventCode = PEnums.EventCode.E620;
        String message = iOException.getMessage();
        if (message == null) {
            message = "add shipping io error";
        }
        IOException iOException2 = iOException;
        PLog.error$default(errorType, eventCode, message, (String) null, iOException2, PEnums.TransitionName.NATIVE_ADD_SHIPPING, PEnums.StateName.ADD_SHIPPING, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1928, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: validateAddressRequestedListener$lambda-1  reason: not valid java name */
    public static final void m35197validateAddressRequestedListener$lambda1(AddressAutoCompleteViewModel addressAutoCompleteViewModel, EventType eventType, ResultData resultData) {
        C19383o.m32797g(addressAutoCompleteViewModel, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        ValidateAddressQueryParams validateAddressQueryParams = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        if (data instanceof ValidateAddressQueryParams) {
            validateAddressQueryParams = (ValidateAddressQueryParams) data;
        }
        if (validateAddressQueryParams != null) {
            addressAutoCompleteViewModel.validateAddress(validateAddressQueryParams);
        }
    }

    public final void createCountryList(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new AddressAutoCompleteViewModel$createCountryList$1(context, this, (C19340c<? super AddressAutoCompleteViewModel$createCountryList$1>) null), 3);
    }

    public final void fetchAddShippingCountriesResponse(String str) {
        C19383o.m32797g(str, "text");
        C2895z<List<Country>> zVar = this._autoCompleteAddShippingCountriesResponse;
        ArrayList<Country> countries = Cache.INSTANCE.getCountries();
        ArrayList arrayList = new ArrayList();
        for (T next : countries) {
            if (C19457k.m33025c1(((Country) next).getName(), str, true)) {
                arrayList.add(next);
            }
        }
        zVar.postValue(arrayList);
    }

    public final void fetchAddShippingPlaceIdResponse(AddressAutoCompletePlaceIdRequest addressAutoCompletePlaceIdRequest) {
        C19383o.m32797g(addressAutoCompletePlaceIdRequest, LoginFragment.EXTRA_REQUEST);
        C19699g1 g1Var = this.autoCompleteAddShippingPlaceIdResponseJob;
        if (g1Var != null) {
            g1Var.mo72134a((CancellationException) null);
        }
        this.autoCompleteAddShippingPlaceIdResponseJob = C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new AddressAutoCompleteViewModel$fetchAddShippingPlaceIdResponse$1(this, addressAutoCompletePlaceIdRequest, (C19340c<? super AddressAutoCompleteViewModel$fetchAddShippingPlaceIdResponse$1>) null), 3);
    }

    public final void fetchAddShippingResponse(AddressAutoCompleteRequest addressAutoCompleteRequest) {
        C19383o.m32797g(addressAutoCompleteRequest, LoginFragment.EXTRA_REQUEST);
        C19699g1 g1Var = this.autoCompleteAddShippingResponseJob;
        if (g1Var != null) {
            g1Var.mo72134a((CancellationException) null);
        }
        this.autoCompleteAddShippingResponseJob = C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new AddressAutoCompleteViewModel$fetchAddShippingResponse$1(this, addressAutoCompleteRequest, (C19340c<? super AddressAutoCompleteViewModel$fetchAddShippingResponse$1>) null), 3);
    }

    public final LiveData<List<Country>> getAutoCompleteAddShippingCountriesResponse() {
        return this._autoCompleteAddShippingCountriesResponse;
    }

    public final LiveData<AddressAutoCompletePlaceIdResponse> getAutoCompleteAddShippingPlaceIdResponse() {
        return this._autoCompleteAddShippingPlaceIdResponse;
    }

    public final LiveData<Pair<String, AddressAutoCompleteResponse>> getAutoCompleteAddShippingResponse() {
        return this._autoCompleteAddShippingResponse;
    }

    public final LiveData<Boolean> getCountryCacheCompletionFlag() {
        return this._countryCacheCompletionFlag;
    }

    public final int getCountryPositionOnList(String str, ArrayList<Country> arrayList) {
        C19383o.m32797g(str, "countryId");
        C19383o.m32797g(arrayList, ResponseConstants.COUNTRIES);
        for (T next : arrayList) {
            if (C19457k.m33019W0(((Country) next).getCode(), str, true)) {
                return arrayList.indexOf(next);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final String getFirstName() {
        User user = this.repository.getUser();
        String firstName = user == null ? null : user.getFirstName();
        if (firstName == null || firstName.length() == 0) {
            PLog pLog = PLog.INSTANCE;
            PLog.error$default(PEnums.ErrorType.INFO, PEnums.EventCode.E620, "Add shipping first name is null", (String) null, (Throwable) null, PEnums.TransitionName.NATIVE_ADD_SHIPPING, PEnums.StateName.ADD_SHIPPING, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1944, (Object) null);
        }
        return firstName == null ? "" : firstName;
    }

    public final String getLastName() {
        User user = this.repository.getUser();
        String lastName = user == null ? null : user.getLastName();
        if (lastName == null || lastName.length() == 0) {
            PLog pLog = PLog.INSTANCE;
            PLog.error$default(PEnums.ErrorType.INFO, PEnums.EventCode.E620, "Add shipping last name is null", (String) null, (Throwable) null, PEnums.TransitionName.NATIVE_ADD_SHIPPING, PEnums.StateName.ADD_SHIPPING, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1944, (Object) null);
        }
        return lastName == null ? "" : lastName;
    }

    public final String getStringResource(String str) {
        C19383o.m32797g(str, "key");
        Cache cache = Cache.INSTANCE;
        return cache.getCountryfield().containsKey(str) ? cache.getCountryfield().get(str) : str;
    }

    public final boolean isAddShippingFeatureEnabled() {
        ExperimentResponse treatment = this.abManager.getTreatment(new ExperimentRequest(ElmoAbExperiment.ADD_SHIPPING_EXPERIMENT, (String) null, 2, (DefaultConstructorMarker) null));
        if (treatment instanceof ExperimentResponse.Success) {
            return C19383o.m32792b(((ExperimentResponse.Success) treatment).getResponse().getTreatmentName(), ElmoTreatment.ADD_SHIPPING_EXPERIMENT_TRMT.getTreatmentName());
        }
        boolean z = treatment instanceof ExperimentResponse.Disable;
        return false;
    }

    public void onCleared() {
        this.events.removeListener(PayPalEventTypes.VALIDATE_ADDRESS_API_REQUESTED, this.validateAddressRequestedListener);
        super.onCleared();
    }

    public final void resetValues() {
        this._autoCompleteAddShippingResponse = new C2895z<>();
        this._autoCompleteAddShippingCountriesResponse = new C2895z<>();
        this._autoCompleteAddShippingPlaceIdResponse = new C2895z<>();
        this._countryCacheCompletionFlag = new C2895z<>();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0063, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        kotlin.reflect.C19421p.m32917E(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setCountryFields(android.content.Context r14) {
        /*
            r13 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            android.content.res.AssetManager r14 = r14.getAssets()
            java.lang.String r0 = "context.assets"
            kotlin.jvm.internal.C19383o.m32796f(r14, r0)
            java.lang.String r0 = "country_fields.json"
            java.io.InputStream r14 = r14.open(r0)     // Catch:{ IOException -> 0x0082, JSONException -> 0x0068 }
            r0 = 0
            int r1 = r14.available()     // Catch:{ all -> 0x0061 }
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x0061 }
            r14.read(r1)     // Catch:{ all -> 0x0061 }
            r14.close()     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0061 }
            java.nio.charset.Charset r3 = kotlin.text.C19446a.f43373b     // Catch:{ all -> 0x0061 }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0061 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0061 }
            r1.<init>(r2)     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = "fields"
            org.json.JSONArray r1 = r1.getJSONArray(r2)     // Catch:{ all -> 0x0061 }
            r2 = 0
            int r3 = r1.length()     // Catch:{ all -> 0x0061 }
        L_0x0038:
            if (r2 >= r3) goto L_0x005b
            int r4 = r2 + 1
            org.json.JSONObject r2 = r1.getJSONObject(r2)     // Catch:{ all -> 0x0061 }
            java.lang.String r5 = "text"
            java.lang.Object r5 = r2.get(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = "resource"
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0061 }
            com.paypal.pyplcheckout.common.cache.Cache r6 = com.paypal.pyplcheckout.common.cache.Cache.INSTANCE     // Catch:{ all -> 0x0061 }
            r6.cacheCountryfield(r5, r2)     // Catch:{ all -> 0x0061 }
            r2 = r4
            goto L_0x0038
        L_0x005b:
            kotlin.m r1 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0061 }
            kotlin.reflect.C19421p.m32917E(r14, r0)     // Catch:{ IOException -> 0x0082, JSONException -> 0x0068 }
            goto L_0x009b
        L_0x0061:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r1 = move-exception
            kotlin.reflect.C19421p.m32917E(r14, r0)     // Catch:{ IOException -> 0x0082, JSONException -> 0x0068 }
            throw r1     // Catch:{ IOException -> 0x0082, JSONException -> 0x0068 }
        L_0x0068:
            r14 = move-exception
            r4 = r14
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r0 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r1 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E620
            java.lang.String r3 = r4.getMessage()
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.NATIVE_ADD_SHIPPING
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1984(0x7c0, float:2.78E-42)
            r12 = 0
            java.lang.String r2 = "Error reading countries.json structure"
            com.paypal.pyplcheckout.common.instrumentation.PLog.error$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x009b
        L_0x0082:
            r14 = move-exception
            r4 = r14
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r0 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r1 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E620
            java.lang.String r3 = r4.getMessage()
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.NATIVE_ADD_SHIPPING
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1984(0x7c0, float:2.78E-42)
            r12 = 0
            java.lang.String r2 = "Error reading countries.json"
            com.paypal.pyplcheckout.common.instrumentation.PLog.error$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel.setCountryFields(android.content.Context):void");
    }

    public final void validateAddress(ValidateAddressQueryParams validateAddressQueryParams) {
        C19383o.m32797g(validateAddressQueryParams, LoginFragment.EXTRA_REQUEST);
        C19699g1 g1Var = this.validateAddressResponseJob;
        if (g1Var != null) {
            g1Var.mo72134a((CancellationException) null);
        }
        this.validateAddressResponseJob = C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new AddressAutoCompleteViewModel$validateAddress$1(this, validateAddressQueryParams, (C19340c<? super AddressAutoCompleteViewModel$validateAddress$1>) null), 3);
    }
}
