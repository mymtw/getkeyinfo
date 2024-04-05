package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* renamed from: com.appsflyer.internal.an */
final class C5005an {
    private final C5007b valueOf = new C5007b() {
        public final Class<?> valueOf(String str) throws ClassNotFoundException {
            return Class.forName(str);
        }
    };

    /* renamed from: com.appsflyer.internal.an$b */
    public interface C5007b {
        Class<?> valueOf(String str) throws ClassNotFoundException;
    }

    /* renamed from: com.appsflyer.internal.an$e */
    public enum C5008e {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        SEGMENT("android_segment", "com.segment.analytics.android.integrations.appsflyer.AppsflyerIntegration"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime"),
        CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");
        
        /* access modifiers changed from: private */
        public final String onInstallConversionFailureNative;
        /* access modifiers changed from: private */
        public final String onResponseNative;

        private C5008e(String str, String str2) {
            this.onInstallConversionFailureNative = str;
            this.onResponseNative = str2;
        }
    }

    private boolean AFKeystoreWrapper(String str) {
        try {
            this.valueOf.valueOf(str);
            StringBuilder sb = new StringBuilder("Class: ");
            sb.append(str);
            sb.append(" is found.");
            AFLogger.AFKeystoreWrapper(sb.toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper(th.getMessage(), th);
            return false;
        }
    }

    public final String AFInAppEventParameterName() {
        for (C5008e eVar : C5008e.values()) {
            if (AFKeystoreWrapper(eVar.onResponseNative)) {
                return eVar.onInstallConversionFailureNative;
            }
        }
        return C5008e.DEFAULT.onInstallConversionFailureNative;
    }
}
