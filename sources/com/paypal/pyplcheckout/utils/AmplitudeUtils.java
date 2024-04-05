package com.paypal.pyplcheckout.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C19383o;
import p253u3.C8134a;
import p253u3.C8139f;

public final class AmplitudeUtils {
    private final String TAG = "AmplitudeUtils";
    private final Context context;
    private final boolean is1p;
    private final boolean isDebug;
    private final SharedPreferences sharedPrefs;

    public AmplitudeUtils(Context context2, boolean z, boolean z2) {
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this.context = context2;
        this.is1p = z;
        this.isDebug = z2;
        SharedPreferences sharedPreferences = context2.getSharedPreferences("AmplitudeUtils", 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…AG, Context.MODE_PRIVATE)");
        this.sharedPrefs = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(AmplitudeUtilsKt.AMP_P_3P, context2.getResources().getString(C17165R.string.paypal_amplitude_prod_3p_key));
        edit.putString(AmplitudeUtilsKt.AMP_D_3P, context2.getResources().getString(C17165R.string.paypal_amplitude_dev_3p_key));
        edit.putString(AmplitudeUtilsKt.AMP_P_1P, context2.getResources().getString(C17165R.string.paypal_amplitude_prod_1p_key));
        edit.putString(AmplitudeUtilsKt.AMP_D_1P, context2.getResources().getString(C17165R.string.paypal_amplitude_dev_1p_key));
        edit.apply();
    }

    private final String decodeString(String str) {
        byte[] decode = Base64.decode(String.valueOf(this.sharedPrefs.getString(str, "")), 0);
        C19383o.m32796f(decode, "decode(sharedPrefs.getSt…String(), Base64.DEFAULT)");
        Charset defaultCharset = Charset.defaultCharset();
        C19383o.m32796f(defaultCharset, "defaultCharset()");
        return new String(decode, defaultCharset);
    }

    public final C8139f getClient() {
        return C8134a.m16364a((String) null);
    }

    public final String returnKeyByEnv() {
        boolean z = this.is1p;
        return (!z || !this.isDebug) ? (!z || this.isDebug) ? (z || !this.isDebug) ? decodeString(AmplitudeUtilsKt.AMP_P_3P) : decodeString(AmplitudeUtilsKt.AMP_D_3P) : decodeString(AmplitudeUtilsKt.AMP_P_1P) : decodeString(AmplitudeUtilsKt.AMP_D_1P);
    }
}
