package com.facebook.appevents.p332ml;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.appevents.internal.FileDownloadTask;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.text.C19457k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p318bg.C8551a;
import p318bg.C8553b;
import p318bg.C8555c;
import p318bg.C8556d;
import p318bg.C8559g;
import p345eg.C12701d;
import p345eg.C12702e;
import p365hg.C12869i0;
import p365hg.C12876l;
import p365hg.C12879l0;
import p401mg.C13080a;
import p453tf.C13418j;
import p501zf.C13963a;
import p568fn.C17782b;
import p764pq.C20056h;
import p764pq.C20057i;

/* renamed from: com.facebook.appevents.ml.ModelManager */
public final class ModelManager {

    /* renamed from: a */
    public static final ConcurrentHashMap f27307a = new ConcurrentHashMap();

    /* renamed from: b */
    public static final List<String> f27308b = C17782b.m29865e0("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* renamed from: c */
    public static final List<String> f27309c = C17782b.m29865e0("none", "address", "health");

    /* renamed from: d */
    public static final ModelManager f27310d = new ModelManager();

    /* renamed from: com.facebook.appevents.ml.ModelManager$Task */
    public enum Task {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        public final String toKey() {
            int i = C8555c.f18637a[ordinal()];
            if (i == 1) {
                return "integrity_detect";
            }
            if (i == 2) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final String toUseCase() {
            int i = C8555c.f18638b[ordinal()];
            if (i == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: com.facebook.appevents.ml.ModelManager$a */
    public static final class C12232a {

        /* renamed from: i */
        public static final C12233a f27311i = new C12233a();

        /* renamed from: a */
        public File f27312a;

        /* renamed from: b */
        public C8553b f27313b;

        /* renamed from: c */
        public Runnable f27314c;

        /* renamed from: d */
        public String f27315d;

        /* renamed from: e */
        public String f27316e;

        /* renamed from: f */
        public String f27317f;

        /* renamed from: g */
        public int f27318g;

        /* renamed from: h */
        public float[] f27319h;

        /* renamed from: com.facebook.appevents.ml.ModelManager$a$a */
        public static final class C12233a {
            /* renamed from: a */
            public static C12232a m20080a(JSONObject jSONObject) {
                float[] fArr;
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String string = jSONObject.getString("use_case");
                    String string2 = jSONObject.getString("asset_uri");
                    String optString = jSONObject.optString("rules_uri", (String) null);
                    int i = jSONObject.getInt("version_id");
                    ModelManager modelManager = ModelManager.f27310d;
                    JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
                    Class<ModelManager> cls = ModelManager.class;
                    if (!C13080a.m20762b(cls)) {
                        try {
                            modelManager.getClass();
                            if (!C13080a.m20762b(modelManager) && jSONArray != null) {
                                fArr = new float[jSONArray.length()];
                                int length = jSONArray.length();
                                for (int i2 = 0; i2 < length; i2++) {
                                    try {
                                        String string3 = jSONArray.getString(i2);
                                        C19383o.m32796f(string3, "jsonArray.getString(i)");
                                        fArr[i2] = Float.parseFloat(string3);
                                    } catch (JSONException unused) {
                                    }
                                }
                                C19383o.m32796f(string, "useCase");
                                C19383o.m32796f(string2, "assetUri");
                                return new C12232a(string, string2, optString, i, fArr);
                            }
                        } catch (Throwable th) {
                            C13080a.m20761a(cls, th);
                        }
                    }
                    fArr = null;
                    C19383o.m32796f(string, "useCase");
                    C19383o.m32796f(string2, "assetUri");
                    return new C12232a(string, string2, optString, i, fArr);
                } catch (Exception unused2) {
                    return null;
                }
            }

            /* renamed from: b */
            public static void m20081b(String str, String str2, FileDownloadTask.C12231a aVar) {
                File file = new File(C8559g.m16966a(), str2);
                if (str == null || file.exists()) {
                    aVar.mo39346a(file);
                } else {
                    new FileDownloadTask(str, file, aVar).execute(new String[0]);
                }
            }

            /* renamed from: c */
            public static void m20082c(C12232a aVar, ArrayList arrayList) {
                File[] listFiles;
                String str = aVar.f27315d;
                int i = aVar.f27318g;
                File a = C8559g.m16966a();
                if (!(a == null || (listFiles = a.listFiles()) == null)) {
                    if (!(listFiles.length == 0)) {
                        String str2 = str + "_" + i;
                        for (File file : listFiles) {
                            C19383o.m32796f(file, "f");
                            String name = file.getName();
                            C19383o.m32796f(name, "name");
                            if (C19457k.m33025c1(name, str, false) && !C19457k.m33025c1(name, str2, false)) {
                                file.delete();
                            }
                        }
                    }
                }
                m20081b(aVar.f27316e, aVar.f27315d + "_" + aVar.f27318g, new C12236a(arrayList));
            }
        }

        public C12232a(String str, String str2, String str3, int i, float[] fArr) {
            this.f27315d = str;
            this.f27316e = str2;
            this.f27317f = str3;
            this.f27318g = i;
            this.f27319h = fArr;
        }
    }

    /* renamed from: com.facebook.appevents.ml.ModelManager$b */
    public static final class C12234b implements Runnable {

        /* renamed from: b */
        public static final C12234b f27320b = new C12234b();

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    AtomicBoolean atomicBoolean = C12702e.f27987a;
                    Class<C12702e> cls = C12702e.class;
                    synchronized (cls) {
                        if (!C13080a.m20762b(cls)) {
                            try {
                                C13418j.m21108d().execute(C12701d.f27986b);
                            } catch (Throwable th) {
                                C13080a.m20761a(cls, th);
                            }
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    C13080a.m20761a(this, th2);
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: com.facebook.appevents.ml.ModelManager$c */
    public static final class C12235c implements Runnable {

        /* renamed from: b */
        public static final C12235c f27321b = new C12235c();

        public final void run() {
            Class<C13963a> cls;
            if (!C13080a.m20762b(this)) {
                try {
                    boolean z = C13963a.f30705a;
                    cls = C13963a.class;
                    if (!C13080a.m20762b(cls)) {
                        C13963a.f30705a = true;
                        C13963a.f30706b = C12876l.m20592b("FBSDKFeatureIntegritySample", C13418j.m21107c(), false);
                    }
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m20072a(ModelManager modelManager, JSONObject jSONObject) {
        Class<ModelManager> cls = ModelManager.class;
        if (!C13080a.m20762b(cls)) {
            try {
                modelManager.getClass();
                if (!C13080a.m20762b(modelManager)) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        try {
                            C12232a.C12233a aVar = C12232a.f27311i;
                            JSONObject jSONObject2 = jSONObject.getJSONObject(keys.next());
                            aVar.getClass();
                            C12232a a = C12232a.C12233a.m20080a(jSONObject2);
                            if (a != null) {
                                f27307a.put(a.f27315d, a);
                            }
                        } catch (JSONException unused) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }

    /* renamed from: d */
    public static final File m20073d(Task task) {
        Class<ModelManager> cls = ModelManager.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            C19383o.m32797g(task, "task");
            C12232a aVar = (C12232a) f27307a.get(task.toUseCase());
            if (aVar != null) {
                return aVar.f27312a;
            }
            return null;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: f */
    public static final String[] m20074f(Task task, float[][] fArr, String[] strArr) {
        C8553b bVar;
        String[] strArr2 = strArr;
        Class<ModelManager> cls = ModelManager.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            C19383o.m32797g(task, "task");
            C12232a aVar = (C12232a) f27307a.get(task.toUseCase());
            if (aVar == null || (bVar = aVar.f27313b) == null) {
                return null;
            }
            float[] fArr2 = aVar.f27319h;
            int length = strArr2.length;
            boolean z = false;
            int length2 = fArr[0].length;
            C8551a aVar2 = new C8551a(new int[]{length, length2});
            for (int i = 0; i < length; i++) {
                System.arraycopy(fArr[i], 0, aVar2.f18621b, i * length2, length2);
            }
            C8551a a = bVar.mo21077a(aVar2, strArr2, task.toKey());
            if (a == null || fArr2 == null) {
                return null;
            }
            if (a.f18621b.length == 0) {
                return null;
            }
            if (fArr2.length == 0) {
                z = true;
            }
            if (z) {
                return null;
            }
            int i2 = C8556d.f18639a[task.ordinal()];
            if (i2 == 1) {
                return f27310d.mo39351h(a, fArr2);
            }
            if (i2 == 2) {
                return f27310d.mo39350g(a, fArr2);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        if (kotlin.text.C19459m.m33036e1(r7, "en", false) != false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089 A[Catch:{ all -> 0x006b, all -> 0x00d2 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39347b() {
        /*
            r10 = this;
            boolean r0 = p401mg.C13080a.m20762b(r10)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00d2 }
            r0.<init>()     // Catch:{ all -> 0x00d2 }
            java.util.concurrent.ConcurrentHashMap r1 = f27307a     // Catch:{ all -> 0x00d2 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x00d2 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00d2 }
            r2 = 0
            r3 = 0
            r8 = r2
            r6 = r3
        L_0x001a:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x00d2 }
            if (r4 == 0) goto L_0x00b5
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x00d2 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x00d2 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00d2 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x00d2 }
            com.facebook.appevents.ml.ModelManager$a r4 = (com.facebook.appevents.p332ml.ModelManager.C12232a) r4     // Catch:{ all -> 0x00d2 }
            com.facebook.appevents.ml.ModelManager$Task r7 = com.facebook.appevents.p332ml.ModelManager.Task.MTML_APP_EVENT_PREDICTION     // Catch:{ all -> 0x00d2 }
            java.lang.String r7 = r7.toUseCase()     // Catch:{ all -> 0x00d2 }
            boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r5, r7)     // Catch:{ all -> 0x00d2 }
            if (r7 == 0) goto L_0x0090
            java.lang.String r6 = r4.f27316e     // Catch:{ all -> 0x00d2 }
            int r7 = r4.f27318g     // Catch:{ all -> 0x00d2 }
            int r8 = java.lang.Math.max(r8, r7)     // Catch:{ all -> 0x00d2 }
            com.facebook.internal.FeatureManager$Feature r7 = com.facebook.internal.FeatureManager.Feature.SuggestedEvents     // Catch:{ all -> 0x00d2 }
            boolean r7 = com.facebook.internal.FeatureManager.m20100c(r7)     // Catch:{ all -> 0x00d2 }
            if (r7 == 0) goto L_0x0090
            boolean r7 = p401mg.C13080a.m20762b(r10)     // Catch:{ all -> 0x00d2 }
            if (r7 == 0) goto L_0x0055
            goto L_0x0086
        L_0x0055:
            int r7 = p365hg.C12869i0.f28368a     // Catch:{ all -> 0x006b }
            android.content.Context r7 = p453tf.C13418j.m21106b()     // Catch:{ Exception -> 0x006d }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ Exception -> 0x006d }
            java.lang.String r9 = "FacebookSdk.getApplicationContext().resources"
            kotlin.jvm.internal.C19383o.m32796f(r7, r9)     // Catch:{ Exception -> 0x006d }
            android.content.res.Configuration r7 = r7.getConfiguration()     // Catch:{ Exception -> 0x006d }
            java.util.Locale r7 = r7.locale     // Catch:{ Exception -> 0x006d }
            goto L_0x006e
        L_0x006b:
            r7 = move-exception
            goto L_0x0083
        L_0x006d:
            r7 = r3
        L_0x006e:
            if (r7 == 0) goto L_0x0081
            java.lang.String r7 = r7.getLanguage()     // Catch:{ all -> 0x006b }
            java.lang.String r9 = "locale.language"
            kotlin.jvm.internal.C19383o.m32796f(r7, r9)     // Catch:{ all -> 0x006b }
            java.lang.String r9 = "en"
            boolean r7 = kotlin.text.C19459m.m33036e1(r7, r9, r2)     // Catch:{ all -> 0x006b }
            if (r7 == 0) goto L_0x0086
        L_0x0081:
            r7 = 1
            goto L_0x0087
        L_0x0083:
            p401mg.C13080a.m20761a(r10, r7)     // Catch:{ all -> 0x00d2 }
        L_0x0086:
            r7 = r2
        L_0x0087:
            if (r7 == 0) goto L_0x0090
            com.facebook.appevents.ml.ModelManager$b r7 = com.facebook.appevents.p332ml.ModelManager.C12234b.f27320b     // Catch:{ all -> 0x00d2 }
            r4.f27314c = r7     // Catch:{ all -> 0x00d2 }
            r0.add(r4)     // Catch:{ all -> 0x00d2 }
        L_0x0090:
            com.facebook.appevents.ml.ModelManager$Task r7 = com.facebook.appevents.p332ml.ModelManager.Task.MTML_INTEGRITY_DETECT     // Catch:{ all -> 0x00d2 }
            java.lang.String r7 = r7.toUseCase()     // Catch:{ all -> 0x00d2 }
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r5, r7)     // Catch:{ all -> 0x00d2 }
            if (r5 == 0) goto L_0x001a
            java.lang.String r6 = r4.f27316e     // Catch:{ all -> 0x00d2 }
            int r5 = r4.f27318g     // Catch:{ all -> 0x00d2 }
            int r8 = java.lang.Math.max(r8, r5)     // Catch:{ all -> 0x00d2 }
            com.facebook.internal.FeatureManager$Feature r5 = com.facebook.internal.FeatureManager.Feature.IntelligentIntegrity     // Catch:{ all -> 0x00d2 }
            boolean r5 = com.facebook.internal.FeatureManager.m20100c(r5)     // Catch:{ all -> 0x00d2 }
            if (r5 == 0) goto L_0x001a
            com.facebook.appevents.ml.ModelManager$c r5 = com.facebook.appevents.p332ml.ModelManager.C12235c.f27321b     // Catch:{ all -> 0x00d2 }
            r4.f27314c = r5     // Catch:{ all -> 0x00d2 }
            r0.add(r4)     // Catch:{ all -> 0x00d2 }
            goto L_0x001a
        L_0x00b5:
            if (r6 == 0) goto L_0x00d1
            if (r8 <= 0) goto L_0x00d1
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x00d1
            com.facebook.appevents.ml.ModelManager$a r1 = new com.facebook.appevents.ml.ModelManager$a     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = "MTML"
            r7 = 0
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00d2 }
            com.facebook.appevents.ml.ModelManager$a$a r2 = com.facebook.appevents.p332ml.ModelManager.C12232a.f27311i     // Catch:{ all -> 0x00d2 }
            r2.getClass()     // Catch:{ all -> 0x00d2 }
            com.facebook.appevents.p332ml.ModelManager.C12232a.C12233a.m20082c(r1, r0)     // Catch:{ all -> 0x00d2 }
        L_0x00d1:
            return
        L_0x00d2:
            r0 = move-exception
            p401mg.C13080a.m20761a(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.p332ml.ModelManager.mo39347b():void");
    }

    /* renamed from: c */
    public final JSONObject mo39348c() {
        JSONObject jSONObject;
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            String str = C13418j.f29381a;
            C12879l0.m20603g();
            if (C12869i0.m20546B(C13418j.f29386f)) {
                GraphRequest.C12196c cVar = GraphRequest.f27224o;
                String format = String.format("%s/model_asset", Arrays.copyOf(new Object[]{C13418j.m21107c()}, 1));
                C19383o.m32796f(format, "java.lang.String.format(format, *args)");
                cVar.getClass();
                GraphRequest g = GraphRequest.C12196c.m20007g((AccessToken) null, format, (GraphRequest.C12195b) null);
                g.f27233i = true;
                g.f27228d = bundle;
                jSONObject = g.mo39226c().f27246c;
                if (jSONObject == null) {
                    return null;
                }
            } else {
                GraphRequest.f27224o.getClass();
                GraphRequest g2 = GraphRequest.C12196c.m20007g((AccessToken) null, "app/model_asset", (GraphRequest.C12195b) null);
                g2.f27228d = bundle;
                jSONObject = g2.mo39226c().f27246c;
                if (jSONObject == null) {
                    return null;
                }
            }
            return mo39349e(jSONObject);
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:14|15|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return new org.json.JSONObject();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0060 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo39349e(org.json.JSONObject r13) {
        /*
            r12 = this;
            java.lang.String r0 = "asset_uri"
            java.lang.String r1 = "thresholds"
            java.lang.String r2 = "version_id"
            java.lang.String r3 = "rules_uri"
            java.lang.String r4 = "use_case"
            boolean r5 = p401mg.C13080a.m20762b(r12)
            r6 = 0
            if (r5 == 0) goto L_0x0012
            return r6
        L_0x0012:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0066 }
            r5.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r7 = "data"
            org.json.JSONArray r13 = r13.getJSONArray(r7)     // Catch:{ JSONException -> 0x0060 }
            r7 = 0
            int r8 = r13.length()     // Catch:{ JSONException -> 0x0060 }
        L_0x0022:
            if (r7 >= r8) goto L_0x0065
            org.json.JSONObject r9 = r13.getJSONObject(r7)     // Catch:{ JSONException -> 0x0060 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0060 }
            r10.<init>()     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r11 = r9.getString(r2)     // Catch:{ JSONException -> 0x0060 }
            r10.put(r2, r11)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r11 = r9.getString(r4)     // Catch:{ JSONException -> 0x0060 }
            r10.put(r4, r11)     // Catch:{ JSONException -> 0x0060 }
            org.json.JSONArray r11 = r9.getJSONArray(r1)     // Catch:{ JSONException -> 0x0060 }
            r10.put(r1, r11)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r11 = r9.getString(r0)     // Catch:{ JSONException -> 0x0060 }
            r10.put(r0, r11)     // Catch:{ JSONException -> 0x0060 }
            boolean r11 = r9.has(r3)     // Catch:{ JSONException -> 0x0060 }
            if (r11 == 0) goto L_0x0056
            java.lang.String r11 = r9.getString(r3)     // Catch:{ JSONException -> 0x0060 }
            r10.put(r3, r11)     // Catch:{ JSONException -> 0x0060 }
        L_0x0056:
            java.lang.String r9 = r9.getString(r4)     // Catch:{ JSONException -> 0x0060 }
            r5.put(r9, r10)     // Catch:{ JSONException -> 0x0060 }
            int r7 = r7 + 1
            goto L_0x0022
        L_0x0060:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0066 }
            r5.<init>()     // Catch:{ all -> 0x0066 }
        L_0x0065:
            return r5
        L_0x0066:
            r13 = move-exception
            p401mg.C13080a.m20761a(r12, r13)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.p332ml.ModelManager.mo39349e(org.json.JSONObject):org.json.JSONObject");
    }

    /* renamed from: g */
    public final String[] mo39350g(C8551a aVar, float[] fArr) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            int[] iArr = aVar.f18622c;
            int i = iArr[0];
            int i2 = iArr[1];
            float[] fArr2 = aVar.f18621b;
            if (i2 != fArr.length) {
                return null;
            }
            C20057i D0 = C19388s.m32816D0(0, i);
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(D0));
            C20056h l = D0.iterator();
            while (l.f44419d) {
                int nextInt = l.nextInt();
                String str = "none";
                int length = fArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = i4 + 1;
                    if (fArr2[(nextInt * i2) + i4] >= fArr[i3]) {
                        str = f27309c.get(i4);
                    }
                    i3++;
                    i4 = i5;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    /* renamed from: h */
    public final String[] mo39351h(C8551a aVar, float[] fArr) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            int[] iArr = aVar.f18622c;
            int i = iArr[0];
            int i2 = iArr[1];
            float[] fArr2 = aVar.f18621b;
            if (i2 != fArr.length) {
                return null;
            }
            C20057i D0 = C19388s.m32816D0(0, i);
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(D0));
            C20056h l = D0.iterator();
            while (l.f44419d) {
                int nextInt = l.nextInt();
                String str = "other";
                int length = fArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = i4 + 1;
                    if (fArr2[(nextInt * i2) + i4] >= fArr[i3]) {
                        str = f27308b.get(i4);
                    }
                    i3++;
                    i4 = i5;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }
}
