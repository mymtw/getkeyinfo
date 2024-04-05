package com.paypal.pyplcheckout.p539ab.elmo;

import com.paypal.pyplcheckout.p539ab.experiment.Experiment;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.paypal.pyplcheckout.ab.elmo.ElmoAbExperiment */
public enum ElmoAbExperiment implements Experiment {
    BACKGROUND_SCRIM(NOT_IMPLEMENTED),
    CONTINUE_CART_EXPERIMENT(NOT_IMPLEMENTED),
    FALLBACK_TO_CCT_EXPERIMENT(NOT_IMPLEMENTED),
    ADD_SHIPPING_EXPERIMENT("Android_Add_Shipping_Experiment_3p"),
    NATIVE_ADD_CARD_EXPERIMENT("Android_Native_Add_Card_Experiment_3p"),
    RTM_LOADER_SPINNER(NOT_IMPLEMENTED),
    NETWORK_CALL_RETRY(NOT_IMPLEMENTED),
    NXO_3P_PAY_WITH_CRYPTO("XO_Mobile_Sdk_Pay_with_Crypto_Android_3p"),
    NXO_1P_PAY_WITH_CRYPTO(NOT_IMPLEMENTED),
    NXO_3P_SDK_ELIGIBILITY("XO_Mobile_Sdk_Eligibility_Android_3p"),
    ANDROID_OVER_CAPTURE_TEXT("Android_NXO_Over_Capture_Text"),
    NATIVE_OTP_AUTHENTICATION("XO_Mobile_Sdk_Otp_Flow_Android"),
    NATIVE_ADDRESS_VALIDATION("xo_mobile_address_correction_Android");
    
    public static final Companion Companion = null;
    public static final String ELMO_RESOURCE = "nxo_3p_android";
    public static final String NOT_IMPLEMENTED = "NOT_IMPLEMENTED";
    private final String experimentName;

    /* renamed from: com.paypal.pyplcheckout.ab.elmo.ElmoAbExperiment$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private ElmoAbExperiment(String str) {
        this.experimentName = str;
    }

    public String experimentName() {
        return this.experimentName;
    }

    public final String getExperimentName() {
        return this.experimentName;
    }
}
