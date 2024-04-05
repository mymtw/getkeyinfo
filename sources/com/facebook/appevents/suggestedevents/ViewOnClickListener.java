package com.facebook.appevents.suggestedevents;

import android.view.View;
import com.facebook.appevents.codeless.internal.C12225d;
import com.facebook.appevents.p332ml.ModelManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import org.json.JSONObject;
import p345eg.C12698a;
import p345eg.C12699b;
import p345eg.C12700c;
import p365hg.C12869i0;
import p401mg.C13080a;
import p453tf.C13418j;

public final class ViewOnClickListener implements View.OnClickListener {
    private static final String API_ENDPOINT = "%s/suggested_events";
    public static final C12240a Companion = new C12240a();
    public static final String OTHER_EVENT = "other";
    private static final Set<Integer> viewsAttachedListener = new HashSet();
    private final String activityName;
    private final View.OnClickListener baseListener;
    private final WeakReference<View> hostViewWeakReference;
    private final WeakReference<View> rootViewWeakReference;

    /* renamed from: com.facebook.appevents.suggestedevents.ViewOnClickListener$a */
    public static final class C12240a {
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final void m20089a(com.facebook.appevents.suggestedevents.ViewOnClickListener.C12240a r6, java.lang.String r7, java.lang.String r8, float[] r9) {
            /*
                r6.getClass()
                java.lang.Class<eg.e> r6 = p345eg.C12702e.class
                java.util.concurrent.atomic.AtomicBoolean r0 = p345eg.C12702e.f27987a
                boolean r0 = p401mg.C13080a.m20762b(r6)
                java.lang.String r1 = "event"
                r2 = 0
                if (r0 == 0) goto L_0x0011
                goto L_0x001f
            L_0x0011:
                kotlin.jvm.internal.C19383o.m32797g(r7, r1)     // Catch:{ all -> 0x001b }
                java.util.LinkedHashSet r0 = p345eg.C12702e.f27988b     // Catch:{ all -> 0x001b }
                boolean r0 = r0.contains(r7)     // Catch:{ all -> 0x001b }
                goto L_0x0020
            L_0x001b:
                r0 = move-exception
                p401mg.C13080a.m20761a(r6, r0)
            L_0x001f:
                r0 = r2
            L_0x0020:
                r3 = 0
                if (r0 == 0) goto L_0x0050
                android.content.Context r6 = p453tf.C13418j.m21106b()
                uf.h r9 = new uf.h
                r9.<init>((android.content.Context) r6, (java.lang.String) r3)
                boolean r6 = p401mg.C13080a.m20762b(r9)
                if (r6 == 0) goto L_0x0034
                goto L_0x00cc
            L_0x0034:
                android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x004a }
                r6.<init>()     // Catch:{ all -> 0x004a }
                java.lang.String r0 = "_is_suggested_event"
                java.lang.String r1 = "1"
                r6.putString(r0, r1)     // Catch:{ all -> 0x004a }
                java.lang.String r0 = "_button_text"
                r6.putString(r0, r8)     // Catch:{ all -> 0x004a }
                r9.mo46168d(r6, r7)     // Catch:{ all -> 0x004a }
                goto L_0x00cc
            L_0x004a:
                r6 = move-exception
                p401mg.C13080a.m20761a(r9, r6)
                goto L_0x00cc
            L_0x0050:
                boolean r0 = p401mg.C13080a.m20762b(r6)
                if (r0 == 0) goto L_0x0057
                goto L_0x0065
            L_0x0057:
                kotlin.jvm.internal.C19383o.m32797g(r7, r1)     // Catch:{ all -> 0x0061 }
                java.util.LinkedHashSet r0 = p345eg.C12702e.f27989c     // Catch:{ all -> 0x0061 }
                boolean r6 = r0.contains(r7)     // Catch:{ all -> 0x0061 }
                goto L_0x0066
            L_0x0061:
                r0 = move-exception
                p401mg.C13080a.m20761a(r6, r0)
            L_0x0065:
                r6 = r2
            L_0x0066:
                if (r6 == 0) goto L_0x00cc
                android.os.Bundle r6 = new android.os.Bundle
                r6.<init>()
                java.lang.String r0 = "event_name"
                r6.putString(r0, r7)     // Catch:{ JSONException -> 0x00cc }
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00cc }
                r7.<init>()     // Catch:{ JSONException -> 0x00cc }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00cc }
                r0.<init>()     // Catch:{ JSONException -> 0x00cc }
                int r1 = r9.length     // Catch:{ JSONException -> 0x00cc }
                r4 = r2
            L_0x007e:
                if (r4 >= r1) goto L_0x008d
                r5 = r9[r4]     // Catch:{ JSONException -> 0x00cc }
                r0.append(r5)     // Catch:{ JSONException -> 0x00cc }
                java.lang.String r5 = ","
                r0.append(r5)     // Catch:{ JSONException -> 0x00cc }
                int r4 = r4 + 1
                goto L_0x007e
            L_0x008d:
                java.lang.String r9 = "dense"
                java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x00cc }
                r7.put(r9, r0)     // Catch:{ JSONException -> 0x00cc }
                java.lang.String r9 = "button_text"
                r7.put(r9, r8)     // Catch:{ JSONException -> 0x00cc }
                java.lang.String r8 = "metadata"
                java.lang.String r7 = r7.toString()     // Catch:{ JSONException -> 0x00cc }
                r6.putString(r8, r7)     // Catch:{ JSONException -> 0x00cc }
                com.facebook.GraphRequest$c r7 = com.facebook.GraphRequest.f27224o     // Catch:{ JSONException -> 0x00cc }
                java.util.Locale r8 = java.util.Locale.US     // Catch:{ JSONException -> 0x00cc }
                java.lang.String r9 = "%s/suggested_events"
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ JSONException -> 0x00cc }
                java.lang.String r4 = p453tf.C13418j.m21107c()     // Catch:{ JSONException -> 0x00cc }
                r1[r2] = r4     // Catch:{ JSONException -> 0x00cc }
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ JSONException -> 0x00cc }
                java.lang.String r8 = java.lang.String.format(r8, r9, r0)     // Catch:{ JSONException -> 0x00cc }
                java.lang.String r9 = "java.lang.String.format(locale, format, *args)"
                kotlin.jvm.internal.C19383o.m32796f(r8, r9)     // Catch:{ JSONException -> 0x00cc }
                r7.getClass()     // Catch:{ JSONException -> 0x00cc }
                com.facebook.GraphRequest r7 = com.facebook.GraphRequest.C12196c.m20008h(r3, r8, r3, r3)     // Catch:{ JSONException -> 0x00cc }
                r7.f27228d = r6     // Catch:{ JSONException -> 0x00cc }
                r7.mo39226c()     // Catch:{ JSONException -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.suggestedevents.ViewOnClickListener.C12240a.m20089a(com.facebook.appevents.suggestedevents.ViewOnClickListener$a, java.lang.String, java.lang.String, float[]):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x003d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final boolean m20090b(com.facebook.appevents.suggestedevents.ViewOnClickListener.C12240a r2, java.lang.String r3, java.lang.String r4) {
            /*
                r2.getClass()
                java.util.LinkedHashMap r2 = p345eg.C12699b.f27980a
                java.lang.Class<eg.b> r2 = p345eg.C12699b.class
                boolean r0 = p401mg.C13080a.m20762b(r2)
                if (r0 == 0) goto L_0x000e
                goto L_0x0021
            L_0x000e:
                java.util.LinkedHashMap r0 = p345eg.C12699b.f27980a     // Catch:{ all -> 0x001d }
                boolean r1 = r0.containsKey(r3)     // Catch:{ all -> 0x001d }
                if (r1 == 0) goto L_0x0021
                java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x001d }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x001d }
                goto L_0x0022
            L_0x001d:
                r3 = move-exception
                p401mg.C13080a.m20761a(r2, r3)
            L_0x0021:
                r3 = 0
            L_0x0022:
                if (r3 == 0) goto L_0x003d
                java.lang.String r2 = "other"
                boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r3, r2)
                r0 = 1
                r2 = r2 ^ r0
                if (r2 == 0) goto L_0x003e
                com.facebook.appevents.suggestedevents.a r2 = new com.facebook.appevents.suggestedevents.a
                r2.<init>(r3, r4)
                int r3 = p365hg.C12869i0.f28368a
                java.util.concurrent.Executor r3 = p453tf.C13418j.m21108d()     // Catch:{ Exception -> 0x003e }
                r3.execute(r2)     // Catch:{ Exception -> 0x003e }
                goto L_0x003e
            L_0x003d:
                r0 = 0
            L_0x003e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.suggestedevents.ViewOnClickListener.C12240a.m20090b(com.facebook.appevents.suggestedevents.ViewOnClickListener$a, java.lang.String, java.lang.String):boolean");
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0051 A[ADDED_TO_REGION] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m20091c(android.view.View r5, android.view.View r6, java.lang.String r7) {
            /*
                java.lang.String r0 = "hostView"
                kotlin.jvm.internal.C19383o.m32797g(r5, r0)
                java.lang.String r0 = "rootView"
                kotlin.jvm.internal.C19383o.m32797g(r6, r0)
                java.lang.String r0 = "activityName"
                kotlin.jvm.internal.C19383o.m32797g(r7, r0)
                int r0 = r5.hashCode()
                java.util.Set r1 = com.facebook.appevents.suggestedevents.ViewOnClickListener.access$getViewsAttachedListener$cp()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L_0x007e
                com.facebook.appevents.suggestedevents.ViewOnClickListener r1 = new com.facebook.appevents.suggestedevents.ViewOnClickListener
                r2 = 0
                r1.<init>(r5, r6, r7, r2)
                java.lang.String r6 = com.facebook.appevents.codeless.internal.C12225d.f27287a
                java.lang.Class<com.facebook.appevents.codeless.internal.d> r6 = com.facebook.appevents.codeless.internal.C12225d.class
                boolean r7 = p401mg.C13080a.m20762b(r6)
                if (r7 == 0) goto L_0x0032
                goto L_0x0073
            L_0x0032:
                java.lang.String r7 = "android.view.View"
                java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x004d }
                java.lang.String r3 = "mListenerInfo"
                java.lang.reflect.Field r7 = r7.getDeclaredField(r3)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x004d }
                java.lang.String r3 = "android.view.View$ListenerInfo"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x004e }
                java.lang.String r4 = "mOnClickListener"
                java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x004e }
                goto L_0x004f
            L_0x004b:
                r5 = move-exception
                goto L_0x0070
            L_0x004d:
                r7 = r2
            L_0x004e:
                r3 = r2
            L_0x004f:
                if (r7 == 0) goto L_0x006c
                if (r3 != 0) goto L_0x0054
                goto L_0x006c
            L_0x0054:
                r4 = 1
                r7.setAccessible(r4)     // Catch:{ Exception -> 0x0073, all -> 0x004b }
                r3.setAccessible(r4)     // Catch:{ Exception -> 0x0073, all -> 0x004b }
                r7.setAccessible(r4)     // Catch:{ IllegalAccessException -> 0x0062 }
                java.lang.Object r2 = r7.get(r5)     // Catch:{ IllegalAccessException -> 0x0062 }
            L_0x0062:
                if (r2 != 0) goto L_0x0068
                r5.setOnClickListener(r1)     // Catch:{ Exception -> 0x0073, all -> 0x004b }
                goto L_0x0073
            L_0x0068:
                r3.set(r2, r1)     // Catch:{ Exception -> 0x0073, all -> 0x004b }
                goto L_0x0073
            L_0x006c:
                r5.setOnClickListener(r1)     // Catch:{ Exception -> 0x0073, all -> 0x004b }
                goto L_0x0073
            L_0x0070:
                p401mg.C13080a.m20761a(r6, r5)
            L_0x0073:
                java.util.Set r5 = com.facebook.appevents.suggestedevents.ViewOnClickListener.access$getViewsAttachedListener$cp()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
                r5.add(r6)
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.suggestedevents.ViewOnClickListener.C12240a.m20091c(android.view.View, android.view.View, java.lang.String):void");
        }
    }

    /* renamed from: com.facebook.appevents.suggestedevents.ViewOnClickListener$b */
    public static final class C12241b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ViewOnClickListener f27329b;

        /* renamed from: c */
        public final /* synthetic */ JSONObject f27330c;

        /* renamed from: d */
        public final /* synthetic */ String f27331d;

        /* renamed from: e */
        public final /* synthetic */ String f27332e;

        public C12241b(ViewOnClickListener viewOnClickListener, JSONObject jSONObject, String str, String str2) {
            this.f27329b = viewOnClickListener;
            this.f27330c = jSONObject;
            this.f27331d = str;
            this.f27332e = str2;
        }

        public final void run() {
            String[] f;
            if (!C13080a.m20762b(this)) {
                try {
                    String m = C12869i0.m20574m(C13418j.m21106b());
                    if (m != null) {
                        String lowerCase = m.toLowerCase();
                        C19383o.m32796f(lowerCase, "(this as java.lang.String).toLowerCase()");
                        float[] a = C12698a.m20360a(lowerCase, this.f27330c);
                        String c = C12698a.m20361c(this.f27331d, ViewOnClickListener.access$getActivityName$p(this.f27329b), lowerCase);
                        if (a != null && (f = ModelManager.m20074f(ModelManager.Task.MTML_APP_EVENT_PREDICTION, new float[][]{a}, new String[]{c})) != null) {
                            String str = f[0];
                            C12699b.m20372a(this.f27332e, str);
                            if (!C19383o.m32792b(str, "other")) {
                                C12240a.m20089a(ViewOnClickListener.Companion, str, this.f27331d, a);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                } catch (Exception unused) {
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    public /* synthetic */ ViewOnClickListener(View view, View view2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, view2, str);
    }

    public static final /* synthetic */ String access$getActivityName$p(ViewOnClickListener viewOnClickListener) {
        if (C13080a.m20762b(ViewOnClickListener.class)) {
            return null;
        }
        try {
            return viewOnClickListener.activityName;
        } catch (Throwable th) {
            C13080a.m20761a(ViewOnClickListener.class, th);
            return null;
        }
    }

    public static final /* synthetic */ Set access$getViewsAttachedListener$cp() {
        if (C13080a.m20762b(ViewOnClickListener.class)) {
            return null;
        }
        try {
            return viewsAttachedListener;
        } catch (Throwable th) {
            C13080a.m20761a(ViewOnClickListener.class, th);
            return null;
        }
    }

    public static final void attachListener$facebook_core_release(View view, View view2, String str) {
        if (!C13080a.m20762b(ViewOnClickListener.class)) {
            try {
                Companion.getClass();
                C12240a.m20091c(view, view2, str);
            } catch (Throwable th) {
                C13080a.m20761a(ViewOnClickListener.class, th);
            }
        }
    }

    private final void predictAndProcess(String str, String str2, JSONObject jSONObject) {
        if (!C13080a.m20762b(this)) {
            try {
                C12241b bVar = new C12241b(this, jSONObject, str2, str);
                int i = C12869i0.f28368a;
                try {
                    C13418j.m21108d().execute(bVar);
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    private final void process() {
        if (!C13080a.m20762b(this)) {
            try {
                View view = this.rootViewWeakReference.get();
                View view2 = this.hostViewWeakReference.get();
                if (view != null && view2 != null) {
                    try {
                        String d = C12700c.m20377d(view2);
                        String b = C12699b.m20373b(view2, d);
                        if (b != null && !C12240a.m20090b(Companion, b, d)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("view", C12700c.m20376b(view, view2));
                            jSONObject.put("screenname", this.activityName);
                            predictAndProcess(b, d, jSONObject);
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void onClick(View view) {
        if (!C13080a.m20762b(this)) {
            try {
                C19383o.m32797g(view, "view");
                View.OnClickListener onClickListener = this.baseListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                process();
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    private ViewOnClickListener(View view, View view2, String str) {
        this.baseListener = C12225d.m20057f(view);
        this.rootViewWeakReference = new WeakReference<>(view2);
        this.hostViewWeakReference = new WeakReference<>(view);
        if (str != null) {
            String lowerCase = str.toLowerCase();
            C19383o.m32796f(lowerCase, "(this as java.lang.String).toLowerCase()");
            this.activityName = C19457k.m33023a1(lowerCase, "activity", "", false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
