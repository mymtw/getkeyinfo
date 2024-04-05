package com.facebook.internal;

import androidx.core.internal.view.SupportMenu;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;
import p365hg.C12868i;
import p365hg.C12872j;
import p365hg.C12874k;
import p365hg.C12876l;
import p453tf.C13418j;

public final class FeatureManager {

    /* renamed from: a */
    public static final HashMap f27344a = new HashMap();

    /* renamed from: b */
    public static final FeatureManager f27345b = new FeatureManager();

    public enum Feature {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        ServiceUpdateCompliance(196864),
        Login(16777216),
        ChromeCustomTabsPrefetching(16842752),
        IgnoreAppSwitchToLoggedOut(16908288),
        BypassAppSwitch(16973824),
        Share(33554432),
        Places(50331648);
        
        public static final C12255a Companion = null;
        /* access modifiers changed from: private */
        public final int code;

        /* renamed from: com.facebook.internal.FeatureManager$Feature$a */
        public static final class C12255a {
            /* renamed from: a */
            public static Feature m20101a(int i) {
                for (Feature feature : Feature.values()) {
                    if (feature.code == i) {
                        return feature;
                    }
                }
                return Feature.Unknown;
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new C12255a();
        }

        private Feature(int i) {
            this.code = i;
        }

        public final Feature getParent() {
            int i = this.code;
            if ((i & 255) > 0) {
                Companion.getClass();
                return C12255a.m20101a(i & -256);
            } else if ((65280 & i) > 0) {
                C12255a aVar = Companion;
                int i2 = i & SupportMenu.CATEGORY_MASK;
                aVar.getClass();
                return C12255a.m20101a(i2);
            } else if ((16711680 & i) > 0) {
                Companion.getClass();
                return C12255a.m20101a(i & -16777216);
            } else {
                Companion.getClass();
                return C12255a.m20101a(0);
            }
        }

        public final String toKey() {
            return "FBSDKFeature" + this;
        }

        public String toString() {
            switch (C12868i.f28367a[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "PrivacyProtection";
                case 13:
                    return "SuggestedEvents";
                case 14:
                    return "IntelligentIntegrity";
                case 15:
                    return "ModelRequest";
                case 16:
                    return "EventDeactivation";
                case 17:
                    return "OnDeviceEventProcessing";
                case 18:
                    return "OnDevicePostInstallEventProcessing";
                case 19:
                    return "IAPLogging";
                case 20:
                    return "IAPLoggingLib2";
                case 21:
                    return "Monitoring";
                case 22:
                    return "ServiceUpdateCompliance";
                case 23:
                    return "LoginKit";
                case 24:
                    return "ChromeCustomTabsPrefetching";
                case 25:
                    return "IgnoreAppSwitchToLoggedOut";
                case 26:
                    return "BypassAppSwitch";
                case 27:
                    return "ShareKit";
                case 28:
                    return "PlacesKit";
                default:
                    return "unknown";
            }
        }
    }

    /* renamed from: com.facebook.internal.FeatureManager$a */
    public interface C12256a {
        /* renamed from: n */
        void mo20n(boolean z);
    }

    /* renamed from: a */
    public static final void m20098a(C12256a aVar, Feature feature) {
        C19383o.m32797g(feature, "feature");
        C12876l.m20593c(new C12874k(aVar, feature));
    }

    /* renamed from: b */
    public static boolean m20099b(Feature feature) {
        boolean z;
        switch (C12872j.f28379a[feature.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                z = false;
                break;
            default:
                z = true;
                break;
        }
        return C12876l.m20592b(feature.toKey(), C13418j.m21107c(), z);
    }

    /* renamed from: c */
    public static final boolean m20100c(Feature feature) {
        C19383o.m32797g(feature, "feature");
        if (Feature.Unknown == feature) {
            return false;
        }
        if (Feature.Core == feature) {
            return true;
        }
        String string = C13418j.m21106b().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(feature.toKey(), (String) null);
        if (string != null && C19383o.m32792b(string, "12.3.0")) {
            return false;
        }
        Feature parent = feature.getParent();
        return parent == feature ? m20099b(feature) : m20100c(parent) && m20099b(feature);
    }
}
