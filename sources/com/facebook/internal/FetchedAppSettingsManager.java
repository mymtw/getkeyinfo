package com.facebook.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19383o;
import org.json.JSONException;
import org.json.JSONObject;
import p312ag.C8528e;
import p365hg.C12869i0;
import p365hg.C12876l;
import p365hg.C12879l0;
import p365hg.C12882n;
import p401mg.C13080a;
import p453tf.C13418j;
import p453tf.C13442y;
import p461uf.C13511h;
import p568fn.C17782b;

public final class FetchedAppSettingsManager {

    /* renamed from: a */
    public static final String f27346a = FetchedAppSettingsManager.class.getSimpleName();

    /* renamed from: b */
    public static final List<String> f27347b = C17782b.m29865e0("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting");

    /* renamed from: c */
    public static final ConcurrentHashMap f27348c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final AtomicReference<FetchAppSettingState> f27349d = new AtomicReference<>(FetchAppSettingState.NOT_LOADED);

    /* renamed from: e */
    public static final ConcurrentLinkedQueue<C12257a> f27350e = new ConcurrentLinkedQueue<>();

    /* renamed from: f */
    public static boolean f27351f;

    /* renamed from: g */
    public static final FetchedAppSettingsManager f27352g = new FetchedAppSettingsManager();

    public enum FetchAppSettingState {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* renamed from: com.facebook.internal.FetchedAppSettingsManager$a */
    public interface C12257a {
        /* renamed from: a */
        void mo39393a();

        void onSuccess();
    }

    /* renamed from: com.facebook.internal.FetchedAppSettingsManager$b */
    public static final class C12258b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Context f27353b;

        /* renamed from: c */
        public final /* synthetic */ String f27354c;

        /* renamed from: d */
        public final /* synthetic */ String f27355d;

        public C12258b(Context context, String str, String str2) {
            this.f27353b = context;
            this.f27354c = str;
            this.f27355d = str2;
        }

        public final void run() {
            SharedPreferences sharedPreferences;
            C12882n nVar;
            JSONObject jSONObject;
            if (!C13080a.m20762b(this)) {
                try {
                    sharedPreferences = this.f27353b.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                    nVar = null;
                    String string = sharedPreferences.getString(this.f27354c, (String) null);
                    if (!C12869i0.m20546B(string)) {
                        if (string != null) {
                            jSONObject = new JSONObject(string);
                            if (jSONObject != null) {
                                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f27352g;
                                String str = this.f27355d;
                                fetchedAppSettingsManager.getClass();
                                nVar = FetchedAppSettingsManager.m20106d(str, jSONObject);
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                    }
                } catch (JSONException e) {
                    C12869i0.m20550F("FacebookSDK", e);
                    jSONObject = null;
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                    return;
                }
                FetchedAppSettingsManager fetchedAppSettingsManager2 = FetchedAppSettingsManager.f27352g;
                String str2 = this.f27355d;
                fetchedAppSettingsManager2.getClass();
                JSONObject a = FetchedAppSettingsManager.m20103a(str2);
                FetchedAppSettingsManager.m20106d(this.f27355d, a);
                sharedPreferences.edit().putString(this.f27354c, a.toString()).apply();
                if (nVar != null) {
                    String str3 = nVar.f28408l;
                    if (!FetchedAppSettingsManager.f27351f && str3 != null && str3.length() > 0) {
                        FetchedAppSettingsManager.f27351f = true;
                        Log.w(FetchedAppSettingsManager.f27346a, str3);
                    }
                }
                C12876l.m20596f(this.f27355d);
                String str4 = C8528e.f18570a;
                Context b = C13418j.m21106b();
                String c = C13418j.m21107c();
                boolean c2 = C13442y.m21140c();
                C12879l0.m20601e(b, ResponseConstants.CONTEXT);
                if (c2) {
                    if (b instanceof Application) {
                        C13511h.f29567i.getClass();
                        C13511h.C13512a.m21284b((Application) b, c);
                    } else {
                        Log.w(C8528e.f18570a, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
                    }
                }
                FetchedAppSettingsManager.f27349d.set(FetchedAppSettingsManager.f27348c.containsKey(this.f27355d) ? FetchAppSettingState.SUCCESS : FetchAppSettingState.ERROR);
                fetchedAppSettingsManager2.mo39392e();
            }
        }
    }

    /* renamed from: com.facebook.internal.FetchedAppSettingsManager$c */
    public static final class C12259c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C12257a f27356b;

        public C12259c(C12257a aVar) {
            this.f27356b = aVar;
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    this.f27356b.mo39393a();
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: com.facebook.internal.FetchedAppSettingsManager$d */
    public static final class C12260d implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C12257a f27357b;

        public C12260d(C12257a aVar, C12882n nVar) {
            this.f27357b = aVar;
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    this.f27357b.onSuccess();
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m20103a(String str) {
        GraphRequest graphRequest;
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f27347b);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        String str2 = C13418j.f29381a;
        C12879l0.m20603g();
        if (C12869i0.m20546B(C13418j.f29386f)) {
            GraphRequest.f27224o.getClass();
            graphRequest = GraphRequest.C12196c.m20007g((AccessToken) null, str, (GraphRequest.C12195b) null);
            graphRequest.f27234j = true;
            graphRequest.f27233i = true;
            graphRequest.f27228d = bundle;
        } else {
            GraphRequest.f27224o.getClass();
            graphRequest = GraphRequest.C12196c.m20007g((AccessToken) null, "app", (GraphRequest.C12195b) null);
            graphRequest.f27234j = true;
            graphRequest.f27228d = bundle;
        }
        JSONObject jSONObject = graphRequest.mo39226c().f27244a;
        return jSONObject != null ? jSONObject : new JSONObject();
    }

    /* renamed from: b */
    public static final C12882n m20104b(String str) {
        return (C12882n) f27348c.get(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m20105c() {
        /*
            android.content.Context r0 = p453tf.C13418j.m21106b()
            java.lang.String r1 = p453tf.C13418j.m21107c()
            boolean r2 = p365hg.C12869i0.m20546B(r1)
            if (r2 == 0) goto L_0x001b
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState> r0 = f27349d
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r1 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.ERROR
            r0.set(r1)
            com.facebook.internal.FetchedAppSettingsManager r0 = f27352g
            r0.mo39392e()
            return
        L_0x001b:
            java.util.concurrent.ConcurrentHashMap r2 = f27348c
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L_0x0030
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState> r0 = f27349d
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r1 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.SUCCESS
            r0.set(r1)
            com.facebook.internal.FetchedAppSettingsManager r0 = f27352g
            r0.mo39392e()
            return
        L_0x0030:
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState> r2 = f27349d
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r3 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.NOT_LOADED
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r4 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.LOADING
        L_0x0036:
            boolean r5 = r2.compareAndSet(r3, r4)
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0040
            r2 = r7
            goto L_0x0047
        L_0x0040:
            java.lang.Object r5 = r2.get()
            if (r5 == r3) goto L_0x0036
            r2 = r6
        L_0x0047:
            if (r2 != 0) goto L_0x0063
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState> r2 = f27349d
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r3 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.ERROR
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r4 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.LOADING
        L_0x004f:
            boolean r5 = r2.compareAndSet(r3, r4)
            if (r5 == 0) goto L_0x0057
            r2 = r7
            goto L_0x005e
        L_0x0057:
            java.lang.Object r5 = r2.get()
            if (r5 == r3) goto L_0x004f
            r2 = r6
        L_0x005e:
            if (r2 == 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r2 = r6
            goto L_0x0064
        L_0x0063:
            r2 = r7
        L_0x0064:
            if (r2 != 0) goto L_0x006c
            com.facebook.internal.FetchedAppSettingsManager r0 = f27352g
            r0.mo39392e()
            return
        L_0x006c:
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r6] = r1
            java.lang.String r3 = "com.facebook.internal.APP_SETTINGS.%s"
            java.lang.String r4 = "java.lang.String.format(format, *args)"
            java.lang.String r2 = androidx.compose.animation.C0388a.m1049e(r2, r7, r3, r4)
            java.util.concurrent.Executor r3 = p453tf.C13418j.m21108d()
            com.facebook.internal.FetchedAppSettingsManager$b r4 = new com.facebook.internal.FetchedAppSettingsManager$b
            r4.<init>(r0, r2, r1)
            r3.execute(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FetchedAppSettingsManager.m20105c():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c7 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p365hg.C12882n m20106d(java.lang.String r34, org.json.JSONObject r35) {
        /*
            r1 = r34
            r2 = r35
            java.lang.String r0 = "applicationId"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            java.lang.String r0 = "android_sdk_error_categories"
            org.json.JSONArray r0 = r2.optJSONArray(r0)
            hg.f$a r3 = p365hg.C12861f.f28351h
            r3.getClass()
            r3 = 1
            java.lang.String r6 = "name"
            if (r0 != 0) goto L_0x001e
            r0 = r3
            r3 = 0
            r4 = 0
            goto L_0x0089
        L_0x001e:
            int r7 = r0.length()
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0029:
            if (r8 >= r7) goto L_0x0081
            org.json.JSONObject r9 = r0.optJSONObject(r8)
            if (r9 == 0) goto L_0x0077
            java.lang.String r4 = r9.optString(r6)
            if (r4 == 0) goto L_0x0077
            java.lang.String r5 = "other"
            boolean r5 = kotlin.text.C19457k.m33019W0(r4, r5, r3)
            java.lang.String r3 = "recovery_message"
            if (r5 == 0) goto L_0x004f
            r5 = 0
            java.lang.String r13 = r9.optString(r3, r5)
            java.util.HashMap r10 = p365hg.C12861f.C12862a.m20538c(r9)
            r18 = r0
            r4 = r5
            r0 = 1
            goto L_0x007b
        L_0x004f:
            java.lang.String r5 = "transient"
            r18 = r0
            r0 = 1
            boolean r5 = kotlin.text.C19457k.m33019W0(r4, r5, r0)
            if (r5 == 0) goto L_0x0065
            r5 = 0
            java.lang.String r14 = r9.optString(r3, r5)
            java.util.HashMap r11 = p365hg.C12861f.C12862a.m20538c(r9)
            r4 = r5
            goto L_0x007b
        L_0x0065:
            java.lang.String r5 = "login_recoverable"
            boolean r4 = kotlin.text.C19457k.m33019W0(r4, r5, r0)
            if (r4 == 0) goto L_0x007a
            r4 = 0
            java.lang.String r15 = r9.optString(r3, r4)
            java.util.HashMap r12 = p365hg.C12861f.C12862a.m20538c(r9)
            goto L_0x007b
        L_0x0077:
            r18 = r0
            r0 = r3
        L_0x007a:
            r4 = 0
        L_0x007b:
            int r8 = r8 + 1
            r3 = r0
            r0 = r18
            goto L_0x0029
        L_0x0081:
            r0 = r3
            r4 = 0
            hg.f r3 = new hg.f
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)
        L_0x0089:
            if (r3 == 0) goto L_0x008c
            goto L_0x0092
        L_0x008c:
            hg.f$a r3 = p365hg.C12861f.f28351h
            hg.f r3 = r3.mo45639a()
        L_0x0092:
            r24 = r3
            java.lang.String r3 = "app_events_feature_bitmask"
            r5 = 0
            int r3 = r2.optInt(r3, r5)
            r5 = r3 & 8
            if (r5 == 0) goto L_0x00a2
            r23 = r0
            goto L_0x00a4
        L_0x00a2:
            r23 = 0
        L_0x00a4:
            r5 = r3 & 16
            if (r5 == 0) goto L_0x00ab
            r27 = r0
            goto L_0x00ad
        L_0x00ab:
            r27 = 0
        L_0x00ad:
            r3 = r3 & 32
            if (r3 == 0) goto L_0x00b4
            r28 = r0
            goto L_0x00b6
        L_0x00b4:
            r28 = 0
        L_0x00b6:
            java.lang.String r0 = "auto_event_mapping_android"
            org.json.JSONArray r29 = r2.optJSONArray(r0)
            hg.n r3 = new hg.n
            java.lang.String r0 = "supports_implicit_sdk_logging"
            r5 = 0
            boolean r17 = r2.optBoolean(r0, r5)
            java.lang.String r0 = "gdpv4_nux_content"
            java.lang.String r7 = ""
            java.lang.String r7 = r2.optString(r0, r7)
            java.lang.String r0 = "settingsJSON.optString(A…_SETTING_NUX_CONTENT, \"\")"
            kotlin.jvm.internal.C19383o.m32796f(r7, r0)
            java.lang.String r0 = "gdpv4_nux_enabled"
            boolean r19 = r2.optBoolean(r0, r5)
            r0 = 60
            java.lang.String r5 = "app_events_session_timeout"
            int r20 = r2.optInt(r5, r0)
            com.facebook.internal.SmartLoginOption$a r0 = com.facebook.internal.SmartLoginOption.Companion
            java.lang.String r5 = "seamless_login"
            long r8 = r2.optLong(r5)
            r0.getClass()
            java.util.EnumSet r21 = com.facebook.internal.SmartLoginOption.C12263a.m20111a(r8)
            java.lang.String r0 = "android_dialog_configs"
            org.json.JSONObject r0 = r2.optJSONObject(r0)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            if (r0 == 0) goto L_0x01ce
            java.lang.String r8 = "data"
            org.json.JSONArray r8 = r0.optJSONArray(r8)
            if (r8 == 0) goto L_0x01ce
            int r9 = r8.length()
            r10 = 0
        L_0x0109:
            if (r10 >= r9) goto L_0x01ce
            hg.n$a$a r0 = p365hg.C12882n.C12883a.f28412c
            org.json.JSONObject r11 = r8.optJSONObject(r10)
            java.lang.String r12 = "dialogConfigData.optJSONObject(i)"
            kotlin.jvm.internal.C19383o.m32796f(r11, r12)
            r0.getClass()
            java.lang.String r0 = r11.optString(r6)
            boolean r12 = p365hg.C12869i0.m20546B(r0)
            if (r12 == 0) goto L_0x0127
        L_0x0123:
            r18 = r6
            goto L_0x01ad
        L_0x0127:
            java.lang.String r12 = "dialogNameWithFeature"
            kotlin.jvm.internal.C19383o.m32796f(r0, r12)
            java.lang.String r12 = "|"
            java.lang.String[] r12 = new java.lang.String[]{r12}
            r13 = 6
            r14 = 0
            java.util.List r0 = kotlin.text.C19459m.m33056y1(r0, r12, r14, r13)
            int r12 = r0.size()
            r13 = 2
            if (r12 == r13) goto L_0x0140
            goto L_0x0123
        L_0x0140:
            java.lang.Object r12 = kotlin.collections.C19327t.m32638T0(r0)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r0 = kotlin.collections.C19327t.m32645a1(r0)
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            boolean r0 = p365hg.C12869i0.m20546B(r12)
            if (r0 != 0) goto L_0x0123
            boolean r0 = p365hg.C12869i0.m20546B(r13)
            if (r0 == 0) goto L_0x015a
            goto L_0x0123
        L_0x015a:
            java.lang.String r0 = "url"
            java.lang.String r0 = r11.optString(r0)
            boolean r15 = p365hg.C12869i0.m20546B(r0)
            if (r15 != 0) goto L_0x0169
            android.net.Uri.parse(r0)
        L_0x0169:
            java.lang.String r0 = "versions"
            org.json.JSONArray r11 = r11.optJSONArray(r0)
            if (r11 == 0) goto L_0x01a5
            int r15 = r11.length()
            int[] r4 = new int[r15]
        L_0x0177:
            if (r14 >= r15) goto L_0x01a5
            r18 = r6
            r6 = -1
            int r0 = r11.optInt(r14, r6)
            if (r0 != r6) goto L_0x019e
            java.lang.String r6 = r11.optString(r14)
            boolean r25 = p365hg.C12869i0.m20546B(r6)
            if (r25 != 0) goto L_0x019e
            java.lang.String r0 = "versionString"
            kotlin.jvm.internal.C19383o.m32796f(r6, r0)     // Catch:{ NumberFormatException -> 0x0196 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0196 }
            goto L_0x019d
        L_0x0196:
            r0 = move-exception
            java.lang.String r6 = "FacebookSDK"
            p365hg.C12869i0.m20550F(r6, r0)
            r6 = -1
        L_0x019d:
            r0 = r6
        L_0x019e:
            r4[r14] = r0
            int r14 = r14 + 1
            r6 = r18
            goto L_0x0177
        L_0x01a5:
            r18 = r6
            hg.n$a r0 = new hg.n$a
            r0.<init>(r12, r13)
            goto L_0x01ae
        L_0x01ad:
            r0 = 0
        L_0x01ae:
            if (r0 == 0) goto L_0x01c7
            java.lang.String r4 = r0.f28413a
            java.lang.Object r6 = r5.get(r4)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 != 0) goto L_0x01c2
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r5.put(r4, r6)
        L_0x01c2:
            java.lang.String r4 = r0.f28414b
            r6.put(r4, r0)
        L_0x01c7:
            int r10 = r10 + 1
            r6 = r18
            r4 = 0
            goto L_0x0109
        L_0x01ce:
            java.lang.String r0 = "smart_login_bookmark_icon_url"
            java.lang.String r0 = r2.optString(r0)
            r25 = r0
            java.lang.String r4 = "settingsJSON.optString(S…_LOGIN_BOOKMARK_ICON_URL)"
            kotlin.jvm.internal.C19383o.m32796f(r0, r4)
            java.lang.String r0 = "smart_login_menu_icon_url"
            java.lang.String r0 = r2.optString(r0)
            r26 = r0
            java.lang.String r4 = "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)"
            kotlin.jvm.internal.C19383o.m32796f(r0, r4)
            java.lang.String r0 = "sdk_update_message"
            java.lang.String r0 = r2.optString(r0)
            r30 = r0
            java.lang.String r4 = "settingsJSON.optString(SDK_UPDATE_MESSAGE)"
            kotlin.jvm.internal.C19383o.m32796f(r0, r4)
            java.lang.String r0 = "aam_rules"
            java.lang.String r31 = r2.optString(r0)
            java.lang.String r0 = "suggested_events_setting"
            java.lang.String r32 = r2.optString(r0)
            java.lang.String r0 = "restrictive_data_filter_params"
            java.lang.String r33 = r2.optString(r0)
            r16 = r3
            r18 = r7
            r22 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            java.util.concurrent.ConcurrentHashMap r0 = f27348c
            r0.put(r1, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FetchedAppSettingsManager.m20106d(java.lang.String, org.json.JSONObject):hg.n");
    }

    /* renamed from: f */
    public static final C12882n m20107f(String str, boolean z) {
        C19383o.m32797g(str, "applicationId");
        if (!z) {
            ConcurrentHashMap concurrentHashMap = f27348c;
            if (concurrentHashMap.containsKey(str)) {
                return (C12882n) concurrentHashMap.get(str);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = f27352g;
        fetchedAppSettingsManager.getClass();
        C12882n d = m20106d(str, m20103a(str));
        if (C19383o.m32792b(str, C13418j.m21107c())) {
            f27349d.set(FetchAppSettingState.SUCCESS);
            fetchedAppSettingsManager.mo39392e();
        }
        return d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo39392e() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState> r0 = f27349d     // Catch:{ all -> 0x005f }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x005f }
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r0 = (com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState) r0     // Catch:{ all -> 0x005f }
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r1 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.NOT_LOADED     // Catch:{ all -> 0x005f }
            if (r1 == r0) goto L_0x005d
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r1 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.LOADING     // Catch:{ all -> 0x005f }
            if (r1 != r0) goto L_0x0012
            goto L_0x005d
        L_0x0012:
            java.lang.String r1 = p453tf.C13418j.m21107c()     // Catch:{ all -> 0x005f }
            java.util.concurrent.ConcurrentHashMap r2 = f27348c     // Catch:{ all -> 0x005f }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x005f }
            hg.n r1 = (p365hg.C12882n) r1     // Catch:{ all -> 0x005f }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x005f }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x005f }
            r2.<init>(r3)     // Catch:{ all -> 0x005f }
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r3 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.ERROR     // Catch:{ all -> 0x005f }
            if (r3 != r0) goto L_0x0044
        L_0x002b:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.FetchedAppSettingsManager$a> r0 = f27350e     // Catch:{ all -> 0x005f }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x005f }
            if (r1 != 0) goto L_0x0042
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x005f }
            com.facebook.internal.FetchedAppSettingsManager$a r0 = (com.facebook.internal.FetchedAppSettingsManager.C12257a) r0     // Catch:{ all -> 0x005f }
            com.facebook.internal.FetchedAppSettingsManager$c r1 = new com.facebook.internal.FetchedAppSettingsManager$c     // Catch:{ all -> 0x005f }
            r1.<init>(r0)     // Catch:{ all -> 0x005f }
            r2.post(r1)     // Catch:{ all -> 0x005f }
            goto L_0x002b
        L_0x0042:
            monitor-exit(r4)
            return
        L_0x0044:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.FetchedAppSettingsManager$a> r0 = f27350e     // Catch:{ all -> 0x005f }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x005f }
            if (r3 != 0) goto L_0x005b
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x005f }
            com.facebook.internal.FetchedAppSettingsManager$a r0 = (com.facebook.internal.FetchedAppSettingsManager.C12257a) r0     // Catch:{ all -> 0x005f }
            com.facebook.internal.FetchedAppSettingsManager$d r3 = new com.facebook.internal.FetchedAppSettingsManager$d     // Catch:{ all -> 0x005f }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x005f }
            r2.post(r3)     // Catch:{ all -> 0x005f }
            goto L_0x0044
        L_0x005b:
            monitor-exit(r4)
            return
        L_0x005d:
            monitor-exit(r4)
            return
        L_0x005f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FetchedAppSettingsManager.mo39392e():void");
    }
}
