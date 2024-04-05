package com.paypal.pyplcheckout.p539ab.elmo;

import com.paypal.pyplcheckout.p539ab.experiment.Treatment;

/* renamed from: com.paypal.pyplcheckout.ab.elmo.ElmoTreatment */
public enum ElmoTreatment implements Treatment {
    SCRIM_TREATMENT_CTRL(ElmoAbExperiment.NOT_IMPLEMENTED),
    SCRIM_TREATMENT_OPACITY_BLACK_TRMT(ElmoAbExperiment.NOT_IMPLEMENTED),
    SCRIM_TREATMENT_BLUE_SWIRL_TRMT(ElmoAbExperiment.NOT_IMPLEMENTED),
    CONTINUE_CART_EXPERIMENT_CTRL(ElmoAbExperiment.NOT_IMPLEMENTED),
    CONTINUE_CART_EXPERIMENT_TRMT(ElmoAbExperiment.NOT_IMPLEMENTED),
    ADD_SHIPPING_EXPERIMENT_CTRL("Ctrl_Android_Add_Shipping_Experiment_3p"),
    ADD_SHIPPING_EXPERIMENT_TRMT("Trmt_Android_Add_Shipping_Experiment_3p"),
    NATIVE_ADD_CARD_EXPERIMENT_CTRL("Ctrl_Android_Native_Add_Card_Experiment_3p"),
    NATIVE_ADD_CARD_EXPERIMENT_TRMT("Trmt_Android_Native_Add_Card_Experiment_3p"),
    RTM_LOADER_SPINNER_CTRL(ElmoAbExperiment.NOT_IMPLEMENTED),
    RTM_LOADER_SPINNER_TRMT(ElmoAbExperiment.NOT_IMPLEMENTED),
    FALLBACK_TO_CCT_EXPERIMENT_CTRL(ElmoAbExperiment.NOT_IMPLEMENTED),
    FALLBACK_TO_CCT_EXPERIMENT_TRMT(ElmoAbExperiment.NOT_IMPLEMENTED),
    NXO_1P_PAY_WITH_CRYPTO_CTRL("NOT_IMPLEMENTED_CTRL"),
    NXO_1P_PAY_WITH_CRYPTO_TRMT("NOT_IMPLEMENTED_TRMT"),
    NXO_3P_PAY_WITH_CRYPTO_CTRL("Ctrl_XO_Mobile_Sdk_Pay_with_Crypto_Android_3p"),
    NXO_3P_PAY_WITH_CRYPTO_TRMT("Trmt_XO_Mobile_Sdk_Pay_with_Crypto_Android_3p"),
    NXO_3P_SDK_ELIGIBILITY_CTRL("Ctrl_XO_Mobile_Sdk_Eligibility_Android_3p"),
    NXO_3P_SDK_ELIGIBILITY_TRMT("Trmt_XO_Mobile_Sdk_Eligibility_Android_3p"),
    ANDROID_OVER_CAPTURE_TEXT_CTRL("Ctrl_Android_NXO_Over_Capture_Text"),
    ANDROID_OVER_CAPTURE_TEXT_TRMT("Trmt_Android_NXO_Over_Capture_Text"),
    NATIVE_OTP_AUTHENTICATION_CTRL("Ctrl_XO_Mobile_Sdk_Otp_Flow_Android"),
    NATIVE_OTP_AUTHENTICATION_TRMT("Trmt_XO_Mobile_Sdk_Otp_Flow_Android"),
    NATIVE_ADDRESS_VALIDATION_CTRL("Ctrl_xo_mobile_address_correction_Android"),
    NATIVE_ADDRESS_VALIDATION_TRMT("Trmt_xo_mobile_address_correction_Android");
    
    private final String treatmentName;

    private ElmoTreatment(String str) {
        this.treatmentName = str;
    }

    public final String getTreatmentName() {
        return this.treatmentName;
    }

    public String treatmentName() {
        return this.treatmentName;
    }
}
