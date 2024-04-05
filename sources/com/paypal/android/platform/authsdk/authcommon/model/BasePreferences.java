package com.paypal.android.platform.authsdk.authcommon.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.util.cryptohelper.CryptoHelper;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.util.cryptohelper.ICryptoHelper;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class BasePreferences {
    private static final String CRYPTO_PREF_NAME = "CryptoPref";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String ENCRYPTION_SECURE_KEY_ALIAS = "SecureKeyAlias";
    private static final String ENCRYPTION_SUFFIX_KEY = "Encrypted";
    private static final String KEY_SEPARATOR = "_";
    private static final Object s_lock = new Object();
    private final Context appContext;
    private final SharedPreferences cryptoPreferences;
    private final SharedPreferences.Editor mEditor;
    private final SharedPreferences mPreferences;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BasePreferences(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "preferenceName");
        Context applicationContext = context.getApplicationContext();
        C19383o.m32796f(applicationContext, "context.applicationContext");
        this.appContext = applicationContext;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(str, 0);
        C19383o.m32796f(sharedPreferences, "appContext.getSharedPref…me, Context.MODE_PRIVATE)");
        this.mPreferences = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C19383o.m32796f(edit, "mPreferences.edit()");
        this.mEditor = edit;
        SharedPreferences sharedPreferences2 = applicationContext.getSharedPreferences(CRYPTO_PREF_NAME, 0);
        C19383o.m32796f(sharedPreferences2, "appContext.getSharedPref…ME, Context.MODE_PRIVATE)");
        this.cryptoPreferences = sharedPreferences2;
    }

    public final void addToPreference(String str, String str2) {
        C19383o.m32797g(str, "key");
        this.mEditor.putString(str, str2);
        this.mEditor.commit();
    }

    public final String buildSharedPreferenceKey(String str, String str2) {
        C19383o.m32797g(str, "prefix");
        C19383o.m32797g(str2, "suffix");
        return str + KEY_SEPARATOR + str2;
    }

    public final void clear() {
        this.mPreferences.edit().clear().commit();
    }

    public final String decryptString(String str, String str2) {
        C19383o.m32797g(str, "key");
        if (this.mPreferences.contains(buildSharedPreferenceKey(str, ENCRYPTION_SUFFIX_KEY))) {
            String fromPreference = getFromPreference(buildSharedPreferenceKey(str, ENCRYPTION_SUFFIX_KEY), str2);
            if (fromPreference == null || TextUtils.isEmpty(fromPreference)) {
                return fromPreference;
            }
            ICryptoHelper instance = CryptoHelper.INSTANCE.getInstance(this.cryptoPreferences, this.appContext);
            if (instance == null) {
                return null;
            }
            return instance.decrypt(fromPreference);
        }
        String string = this.mPreferences.getString(str, str2);
        if (string != null) {
            encryptAndAddToPreference(str, string);
        }
        return string;
    }

    public final void encryptAndAddToPreference(String str, String str2) {
        C19383o.m32797g(str, "key");
        C19383o.m32797g(str2, "value");
        TextUtils.isEmpty(str);
        TextUtils.isEmpty(str2);
        ICryptoHelper instance = CryptoHelper.INSTANCE.getInstance(this.cryptoPreferences, this.appContext);
        addToPreference(buildSharedPreferenceKey(str, ENCRYPTION_SUFFIX_KEY), instance == null ? null : instance.encrypt(str2));
        this.mEditor.remove(str);
    }

    public final String getDecryptedString(String str, String str2) {
        C19383o.m32797g(str, "key");
        if (this.mPreferences.contains(buildSharedPreferenceKey(str, ENCRYPTION_SUFFIX_KEY))) {
            return this.mPreferences.getString(buildSharedPreferenceKey(str, ENCRYPTION_SUFFIX_KEY), str2);
        }
        String string = this.mPreferences.getString(str, str2);
        if (string != null) {
            setStringAndEncrypt(str, string);
        }
        return string;
    }

    public final String getFromPreference(String str, String str2) {
        C19383o.m32797g(str, "key");
        return this.mPreferences.getString(str, str2);
    }

    public final String getString(String str, String str2) {
        C19383o.m32797g(str, "key");
        return this.mPreferences.getString(str, str2);
    }

    public final void removeKeyFromPreferences(String str) {
        C19383o.m32797g(str, "key");
        if (this.mPreferences.contains(str)) {
            this.mEditor.remove(str);
        }
        if (this.mPreferences.contains(buildSharedPreferenceKey(str, ENCRYPTION_SUFFIX_KEY))) {
            this.mEditor.remove(buildSharedPreferenceKey(str, ENCRYPTION_SUFFIX_KEY));
        }
    }

    public final String retrieveValueFromPreference(String str, String str2) {
        C19383o.m32797g(str, "key");
        return decryptString(str, str2);
    }

    public final void setString(String str, String str2) {
        C19383o.m32797g(str, "key");
        this.mEditor.putString(str, str2);
        this.mEditor.commit();
    }

    public final void setStringAndEncrypt(String str, String str2) {
        C19383o.m32797g(str, "key");
        this.mEditor.putString(buildSharedPreferenceKey(str, ENCRYPTION_SUFFIX_KEY), str2);
        this.mEditor.remove(str);
        this.mEditor.commit();
    }

    public final void storeValueinPreference(String str, String str2) {
        C19383o.m32797g(str, "key");
        if (str2 == null || TextUtils.isEmpty(str2)) {
            addToPreference(str, str2);
        } else {
            encryptAndAddToPreference(str, str2);
        }
    }
}
