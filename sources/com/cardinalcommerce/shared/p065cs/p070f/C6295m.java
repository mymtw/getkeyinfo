package com.cardinalcommerce.shared.p065cs.p070f;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import androidx.preference.C3039b;
import org.json.JSONObject;

/* renamed from: com.cardinalcommerce.shared.cs.f.m */
public final class C6295m {

    /* renamed from: A */
    public char[] f13926A;

    /* renamed from: B */
    public char[] f13927B;

    /* renamed from: C */
    public char[] f13928C;

    /* renamed from: D */
    public char[] f13929D;

    /* renamed from: E */
    public int f13930E;

    /* renamed from: F */
    public int f13931F;

    /* renamed from: G */
    public char[] f13932G;

    /* renamed from: H */
    public int f13933H;

    /* renamed from: I */
    public int f13934I;

    /* renamed from: J */
    public int f13935J;

    /* renamed from: K */
    public char[] f13936K;

    /* renamed from: L */
    public char[] f13937L;

    /* renamed from: M */
    public int f13938M;

    /* renamed from: N */
    public char[] f13939N;

    /* renamed from: O */
    public char[] f13940O;

    /* renamed from: P */
    public char[] f13941P;

    /* renamed from: Q */
    public int f13942Q;

    /* renamed from: R */
    public int f13943R;

    /* renamed from: S */
    public char[] f13944S;

    /* renamed from: T */
    public int f13945T;

    /* renamed from: U */
    public char[] f13946U;

    /* renamed from: V */
    public int f13947V;

    /* renamed from: W */
    public int f13948W;

    /* renamed from: X */
    public char[] f13949X;

    /* renamed from: Y */
    public int f13950Y;

    /* renamed from: Z */
    public char[] f13951Z;

    /* renamed from: a */
    public int f13952a;

    /* renamed from: a0 */
    public char[] f13953a0;

    /* renamed from: b */
    public int f13954b;

    /* renamed from: b0 */
    public int f13955b0;

    /* renamed from: c */
    public int f13956c;

    /* renamed from: c0 */
    public int f13957c0;

    /* renamed from: d */
    public int f13958d;

    /* renamed from: d0 */
    public int f13959d0;

    /* renamed from: e */
    public char[] f13960e;

    /* renamed from: e0 */
    public int f13961e0;

    /* renamed from: f */
    public int f13962f;

    /* renamed from: f0 */
    public int f13963f0;

    /* renamed from: g */
    public char[] f13964g;

    /* renamed from: h */
    public char[] f13965h;

    /* renamed from: i */
    public char[] f13966i;

    /* renamed from: j */
    public char[] f13967j;

    /* renamed from: k */
    public char[] f13968k;

    /* renamed from: l */
    public char[] f13969l;

    /* renamed from: m */
    public char[] f13970m;

    /* renamed from: n */
    public char[] f13971n;

    /* renamed from: o */
    public char[] f13972o;

    /* renamed from: p */
    public char[] f13973p;

    /* renamed from: q */
    public int f13974q;

    /* renamed from: r */
    public int f13975r;

    /* renamed from: s */
    public int f13976s;

    /* renamed from: t */
    public char[] f13977t;

    /* renamed from: u */
    public char[] f13978u;

    /* renamed from: v */
    public char[] f13979v;

    /* renamed from: w */
    public int f13980w;

    /* renamed from: x */
    public char[] f13981x;

    /* renamed from: y */
    public char[] f13982y;

    /* renamed from: z */
    public char[] f13983z;

    @SuppressLint({"HardwareIds"})
    public C6295m(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        this.f13952a = Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", -1);
        this.f13954b = Settings.System.getInt(context.getContentResolver(), "bluetooth_discoverability", 0);
        this.f13956c = Settings.System.getInt(context.getContentResolver(), "bluetooth_discoverability_timeout", 0);
        this.f13958d = Settings.System.getInt(context.getContentResolver(), "date_format", 0);
        this.f13982y = C3039b.m7190y(Settings.System.getString(context.getContentResolver(), "dtmf_tone_type"));
        this.f13960e = C3039b.m7190y(Settings.System.getString(context.getContentResolver(), "dtmf_tone"));
        this.f13962f = Settings.System.getInt(context.getContentResolver(), "end_button_behavior", 0);
        this.f13964g = C3039b.m7190y(Settings.System.getString(context.getContentResolver(), "font_scale"));
        this.f13965h = C3039b.m7190y(Settings.System.getString(context.getContentResolver(), "haptic_feedback_enabled"));
        this.f13966i = C3039b.m7190y(Settings.System.getString(context.getContentResolver(), "mode_ringer_streams_affected"));
        this.f13967j = C3039b.m7190y(Settings.System.getString(context.getContentResolver(), "notification_sound"));
        this.f13968k = C3039b.m7190y(Settings.System.getString(context.getContentResolver(), "mute_streams_affected"));
        this.f13969l = C3039b.m7190y(Settings.System.getString(context.getContentResolver(), "ringtone"));
        this.f13970m = C3039b.m7190y(Settings.System.getString(context.getContentResolver(), "screen_brightness"));
        this.f13971n = C3039b.m7190y(Settings.System.getString(context.getContentResolver(), "screen_brightness_mode"));
        this.f13972o = C3039b.m7190y(Settings.System.getString(context.getContentResolver(), "screen_off_timeout"));
        this.f13973p = C3039b.m7190y(Settings.System.getString(context.getContentResolver(), "sound_effects_enabled"));
        this.f13974q = Settings.System.getInt(context.getContentResolver(), "auto_caps", 0);
        this.f13975r = Settings.System.getInt(context.getContentResolver(), "auto_punctuate", -1);
        this.f13976s = Settings.System.getInt(context.getContentResolver(), "auto_replace", 0);
        this.f13977t = C3039b.m7190y(Settings.System.getString(context.getContentResolver(), "show_password"));
        this.f13978u = C3039b.m7190y(Settings.System.getString(context.getContentResolver(), "time_12_24"));
        this.f13979v = C3039b.m7190y(Settings.System.getString(context.getContentResolver(), "user_rotation"));
        this.f13980w = Settings.System.getInt(context.getContentResolver(), "vibrate_on", 0);
        this.f13981x = C3039b.m7190y(Settings.System.getString(context.getContentResolver(), "vibrate_when_ringing"));
        this.f13936K = C3039b.m7190y(Settings.Global.getString(contentResolver, "adb_enabled"));
        this.f13937L = C3039b.m7190y(Settings.Global.getString(contentResolver, "airplane_mode_radios"));
        this.f13938M = Settings.Global.getInt(contentResolver, "always_finish_activities", 0);
        this.f13950Y = Settings.Global.getInt(contentResolver, "animator_duration_scale", 1);
        this.f13939N = C3039b.m7190y(Settings.Global.getString(contentResolver, "auto_time"));
        this.f13940O = C3039b.m7190y(Settings.Global.getString(contentResolver, "auto_time_zone"));
        this.f13941P = C3039b.m7190y(Settings.Global.getString(contentResolver, "development_settings_enabled"));
        this.f13942Q = Settings.Global.getInt(contentResolver, "http_proxy", 0);
        this.f13943R = Settings.Global.getInt(contentResolver, "network_preference", 0);
        this.f13944S = C3039b.m7190y(Settings.Global.getString(contentResolver, "stay_on_while_plugged_in"));
        this.f13945T = Settings.Global.getInt(contentResolver, "transition_animation_scale", 0);
        this.f13946U = C3039b.m7190y(Settings.Global.getString(contentResolver, "usb_mass_storage_enabled"));
        this.f13947V = Settings.Global.getInt(contentResolver, "use_google_mail", 0);
        this.f13948W = Settings.Global.getInt(contentResolver, "wait_for_debugger", 0);
        this.f13949X = C3039b.m7190y(Settings.Global.getString(contentResolver, "wifi_networks_available_notification_on"));
        this.f13983z = C3039b.m7190y(Settings.Secure.getString(contentResolver, "accessibility_enabled"));
        this.f13926A = C3039b.m7190y(Settings.Secure.getString(contentResolver, "speak_password"));
        this.f13927B = C3039b.m7190y(Settings.Secure.getString(contentResolver, "allowed_geolocation_origins"));
        this.f13928C = C3039b.m7190y(Settings.Secure.getString(contentResolver, "android_id"));
        this.f13929D = C3039b.m7190y(Settings.Secure.getString(contentResolver, "default_input_method"));
        this.f13931F = Settings.Secure.getInt(contentResolver, "enabled_input_methods", 0);
        this.f13930E = Settings.Secure.getInt(contentResolver, "input_method_selector_visibility", 0);
        this.f13932G = C3039b.m7190y(Settings.Secure.getString(contentResolver, "install_non_market_apps"));
        this.f13963f0 = Settings.Secure.getInt(contentResolver, "location_mode", 0);
        this.f13961e0 = Settings.Secure.getInt(contentResolver, "accessibility_display_inversion_enabled", 0);
        this.f13959d0 = Settings.Secure.getInt(contentResolver, "enabled_accessibility_services", 0);
        this.f13957c0 = Settings.Secure.getInt(contentResolver, "skip_first_use_hints", 0);
        this.f13955b0 = Settings.Secure.getInt(contentResolver, "tts_default_pitch", 0);
        this.f13933H = Settings.Secure.getInt(contentResolver, "tts_default_rate", 0);
        this.f13934I = Settings.Secure.getInt(contentResolver, "tts_default_synth", 0);
        this.f13935J = Settings.Secure.getInt(contentResolver, "tts_enabled_plugins", 0);
        this.f13951Z = C3039b.m7190y(Settings.Global.getString(contentResolver, "data_roaming"));
        this.f13953a0 = C3039b.m7190y(Settings.Secure.getString(contentResolver, "device_provisioned"));
    }

    /* renamed from: a */
    public final JSONObject mo17845a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("AccelerometerRotation", Integer.valueOf(this.f13952a));
        jSONObject.putOpt("BluetoothDiscoverability", Integer.valueOf(this.f13954b));
        jSONObject.putOpt("BluetoothDiscoverabilityTimeout", Integer.valueOf(this.f13956c));
        jSONObject.putOpt("DateFormat", String.valueOf(this.f13958d));
        jSONObject.putOpt("DtmfToneWhenDialing", C3039b.m7142L(this.f13960e));
        jSONObject.putOpt("EndButtonBehavior", String.valueOf(this.f13962f));
        jSONObject.putOpt("FontScale", C3039b.m7142L(this.f13964g));
        jSONObject.putOpt("HapticFeedbackEnabled", C3039b.m7142L(this.f13965h));
        jSONObject.putOpt("ModeRingerStreamsAffected", C3039b.m7142L(this.f13966i));
        jSONObject.putOpt("NotificationSound", C3039b.m7142L(this.f13967j));
        jSONObject.putOpt("MuteStreamsAffected", C3039b.m7142L(this.f13968k));
        jSONObject.putOpt("Ringtone", C3039b.m7142L(this.f13969l));
        jSONObject.putOpt("ScreenBrightness", C3039b.m7142L(this.f13970m));
        jSONObject.putOpt("ScreenBrightnessMode", C3039b.m7142L(this.f13971n));
        jSONObject.putOpt("ScreenOffTimeout", C3039b.m7142L(this.f13972o));
        jSONObject.putOpt("SoundEffectsEnabled", C3039b.m7142L(this.f13973p));
        jSONObject.putOpt("TextAutoCaps", String.valueOf(this.f13974q));
        jSONObject.putOpt("TextAutoPunctuate", Integer.valueOf(this.f13975r));
        jSONObject.putOpt("TextAutoReplace", String.valueOf(this.f13976s));
        jSONObject.putOpt("TextShowPassword", C3039b.m7142L(this.f13977t));
        jSONObject.putOpt("Time1224", C3039b.m7142L(this.f13978u));
        jSONObject.putOpt("UserRotation", C3039b.m7142L(this.f13979v));
        jSONObject.putOpt("VibrateOn", String.valueOf(this.f13980w));
        jSONObject.putOpt("VibrateWhenRinging", C3039b.m7142L(this.f13981x));
        jSONObject.putOpt("DtmfToneTypeWhenDialing", C3039b.m7142L(this.f13982y));
        jSONObject.putOpt("AccessibilityEnabled", C3039b.m7142L(this.f13983z));
        jSONObject.putOpt("AccessibilitySpeakPassword", C3039b.m7142L(this.f13926A));
        jSONObject.putOpt("AllowedGeolocationOrigins", C3039b.m7142L(this.f13927B));
        jSONObject.putOpt("AndroidId", C3039b.m7142L(this.f13928C));
        jSONObject.putOpt("DefaultInputMethod", C3039b.m7142L(this.f13929D));
        jSONObject.putOpt("InputMethodSelectorVisibility", String.valueOf(this.f13930E));
        jSONObject.putOpt("EnabledInputMethods", String.valueOf(this.f13931F));
        jSONObject.putOpt("InstallNonMarketApps", C3039b.m7142L(this.f13932G));
        jSONObject.putOpt("TtsDefaultRate", String.valueOf(this.f13933H));
        jSONObject.putOpt("TtsDefaultSynth", String.valueOf(this.f13934I));
        jSONObject.putOpt("TtsEnabledPlugins", String.valueOf(this.f13935J));
        jSONObject.putOpt("AdbEnabled", C3039b.m7142L(this.f13936K));
        jSONObject.putOpt("AirplaneModeRadios", C3039b.m7142L(this.f13937L));
        jSONObject.putOpt("AlwaysFinishActivities", String.valueOf(this.f13938M));
        jSONObject.putOpt("AutoTime", C3039b.m7142L(this.f13939N));
        jSONObject.putOpt("AutoTimeZone", C3039b.m7142L(this.f13940O));
        jSONObject.putOpt("DevelopmentSettingsEnabled", C3039b.m7142L(this.f13941P));
        jSONObject.putOpt("HttpProxy", String.valueOf(this.f13942Q));
        jSONObject.putOpt("NetworkPreference", String.valueOf(this.f13943R));
        jSONObject.putOpt("StayOnWhilePluggedIn", C3039b.m7142L(this.f13944S));
        jSONObject.putOpt("TransitionAnimationScale", Integer.valueOf(this.f13945T));
        jSONObject.putOpt("UsbMassStorageEnabled", C3039b.m7142L(this.f13946U));
        jSONObject.putOpt("UseGoogleMail", String.valueOf(this.f13947V));
        jSONObject.putOpt("WaitForDebugger", String.valueOf(this.f13948W));
        jSONObject.putOpt("WifiNetworksAvailableNotificationOn", C3039b.m7142L(this.f13949X));
        jSONObject.putOpt("AnimatorDurationScale", String.valueOf(this.f13950Y));
        jSONObject.putOpt("DataRoaming", C3039b.m7142L(this.f13951Z));
        jSONObject.putOpt("DeviceProvisioned", C3039b.m7142L(this.f13953a0));
        jSONObject.putOpt("TtsDefaultPitch", String.valueOf(this.f13955b0));
        jSONObject.putOpt("SysPropSettingVersion", C3039b.m7142L((char[]) null));
        jSONObject.putOpt("SkipFirstUseHints", String.valueOf(this.f13957c0));
        jSONObject.putOpt("EnabledAccessibilityServices", String.valueOf(this.f13959d0));
        jSONObject.putOpt("AccessibilityDisplayInversionEnabled", String.valueOf(this.f13961e0));
        jSONObject.putOpt("LocationMode", String.valueOf(this.f13963f0));
        return jSONObject;
    }
}
