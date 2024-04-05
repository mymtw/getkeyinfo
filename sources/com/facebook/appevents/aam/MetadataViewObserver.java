package com.facebook.appevents.aam;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p312ag.C8527d;
import p401mg.C13080a;

public final class MetadataViewObserver implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public static final C12213a Companion = new C12213a();
    private static final int MAX_TEXT_LENGTH = 100;
    private static final Map<Integer, MetadataViewObserver> observers = new HashMap();
    private final WeakReference<Activity> activityWeakReference;
    private final AtomicBoolean isTracking;
    private final Set<String> processedText;
    private final Handler uiThreadHandler;

    /* renamed from: com.facebook.appevents.aam.MetadataViewObserver$a */
    public static final class C12213a {
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
            if (r4.equals("r5") != false) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
            if (r4.equals("r4") != false) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
            r5 = new kotlin.text.Regex("[^a-z]+").replace((java.lang.CharSequence) r5, "");
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final void m20037a(com.facebook.appevents.aam.MetadataViewObserver.C12213a r2, java.util.HashMap r3, java.lang.String r4, java.lang.String r5) {
            /*
                r2.getClass()
                int r2 = r4.hashCode()
                r0 = 0
                switch(r2) {
                    case 3585: goto L_0x005a;
                    case 3586: goto L_0x0044;
                    case 3587: goto L_0x003b;
                    case 3588: goto L_0x000d;
                    default: goto L_0x000b;
                }
            L_0x000b:
                goto L_0x007f
            L_0x000d:
                java.lang.String r2 = "r6"
                boolean r2 = r4.equals(r2)
                if (r2 == 0) goto L_0x007f
                java.lang.String r2 = "-"
                boolean r1 = kotlin.text.C19459m.m33036e1(r5, r2, r0)
                if (r1 == 0) goto L_0x007f
                kotlin.text.Regex r1 = new kotlin.text.Regex
                r1.<init>((java.lang.String) r2)
                java.util.List r2 = r1.split(r5, r0)
                java.lang.String[] r5 = new java.lang.String[r0]
                java.lang.Object[] r2 = r2.toArray(r5)
                if (r2 == 0) goto L_0x0033
                java.lang.String[] r2 = (java.lang.String[]) r2
                r5 = r2[r0]
                goto L_0x007f
            L_0x0033:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T>"
                r2.<init>(r3)
                throw r2
            L_0x003b:
                java.lang.String r2 = "r5"
                boolean r2 = r4.equals(r2)
                if (r2 == 0) goto L_0x007f
                goto L_0x004c
            L_0x0044:
                java.lang.String r2 = "r4"
                boolean r2 = r4.equals(r2)
                if (r2 == 0) goto L_0x007f
            L_0x004c:
                kotlin.text.Regex r2 = new kotlin.text.Regex
                java.lang.String r0 = "[^a-z]+"
                r2.<init>((java.lang.String) r0)
                java.lang.String r0 = ""
                java.lang.String r5 = r2.replace((java.lang.CharSequence) r5, (java.lang.String) r0)
                goto L_0x007f
            L_0x005a:
                java.lang.String r2 = "r3"
                boolean r2 = r4.equals(r2)
                if (r2 == 0) goto L_0x007f
                java.lang.String r2 = "m"
                boolean r1 = kotlin.text.C19457k.m33025c1(r5, r2, r0)
                if (r1 != 0) goto L_0x007e
                java.lang.String r1 = "b"
                boolean r1 = kotlin.text.C19457k.m33025c1(r5, r1, r0)
                if (r1 != 0) goto L_0x007e
                java.lang.String r1 = "ge"
                boolean r5 = kotlin.text.C19457k.m33025c1(r5, r1, r0)
                if (r5 == 0) goto L_0x007b
                goto L_0x007e
            L_0x007b:
                java.lang.String r5 = "f"
                goto L_0x007f
            L_0x007e:
                r5 = r2
            L_0x007f:
                r3.put(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.aam.MetadataViewObserver.C12213a.m20037a(com.facebook.appevents.aam.MetadataViewObserver$a, java.util.HashMap, java.lang.String, java.lang.String):void");
        }

        /* renamed from: b */
        public static void m20038b(Activity activity) {
            C19383o.m32797g(activity, "activity");
            int hashCode = activity.hashCode();
            Map access$getObservers$cp = MetadataViewObserver.access$getObservers$cp();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = access$getObservers$cp.get(valueOf);
            if (obj == null) {
                obj = new MetadataViewObserver(activity, (DefaultConstructorMarker) null);
                access$getObservers$cp.put(valueOf, obj);
            }
            MetadataViewObserver.access$startTracking((MetadataViewObserver) obj);
        }
    }

    /* renamed from: com.facebook.appevents.aam.MetadataViewObserver$b */
    public static final class C12214b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ MetadataViewObserver f27252b;

        /* renamed from: c */
        public final /* synthetic */ View f27253c;

        public C12214b(MetadataViewObserver metadataViewObserver, View view) {
            this.f27252b = metadataViewObserver;
            this.f27253c = view;
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    View view = this.f27253c;
                    if (view instanceof EditText) {
                        MetadataViewObserver.access$processEditText(this.f27252b, view);
                    }
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    private MetadataViewObserver(Activity activity) {
        this.processedText = new LinkedHashSet();
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.activityWeakReference = new WeakReference<>(activity);
        this.isTracking = new AtomicBoolean(false);
    }

    public static final /* synthetic */ Map access$getObservers$cp() {
        if (C13080a.m20762b(MetadataViewObserver.class)) {
            return null;
        }
        try {
            return observers;
        } catch (Throwable th) {
            C13080a.m20761a(MetadataViewObserver.class, th);
            return null;
        }
    }

    public static final /* synthetic */ void access$processEditText(MetadataViewObserver metadataViewObserver, View view) {
        if (!C13080a.m20762b(MetadataViewObserver.class)) {
            try {
                metadataViewObserver.processEditText(view);
            } catch (Throwable th) {
                C13080a.m20761a(MetadataViewObserver.class, th);
            }
        }
    }

    public static final /* synthetic */ void access$startTracking(MetadataViewObserver metadataViewObserver) {
        if (!C13080a.m20762b(MetadataViewObserver.class)) {
            try {
                metadataViewObserver.startTracking();
            } catch (Throwable th) {
                C13080a.m20761a(MetadataViewObserver.class, th);
            }
        }
    }

    public static final /* synthetic */ void access$stopTracking(MetadataViewObserver metadataViewObserver) {
        if (!C13080a.m20762b(MetadataViewObserver.class)) {
            try {
                metadataViewObserver.stopTracking();
            } catch (Throwable th) {
                C13080a.m20761a(MetadataViewObserver.class, th);
            }
        }
    }

    private final void process(View view) {
        if (!C13080a.m20762b(this)) {
            try {
                runOnUIThread(new C12214b(this, view));
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac A[Catch:{ all -> 0x00a1, all -> 0x00e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ae A[Catch:{ all -> 0x00a1, all -> 0x00e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b1 A[Catch:{ all -> 0x00a1, all -> 0x00e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e5 A[Catch:{ all -> 0x00a1, all -> 0x00e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f1 A[SYNTHETIC, Splitter:B:64:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0104 A[Catch:{ all -> 0x00a1, all -> 0x00e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010f A[Catch:{ all -> 0x00a1, all -> 0x00e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0130 A[Catch:{ all -> 0x00a1, all -> 0x00e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x006a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void processEditText(android.view.View r14) {
        /*
            r13 = this;
            boolean r0 = p401mg.C13080a.m20762b(r13)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            if (r14 == 0) goto L_0x014f
            r0 = r14
            android.widget.EditText r0 = (android.widget.EditText) r0     // Catch:{ all -> 0x00e6 }
            android.text.Editable r0 = r0.getText()     // Catch:{ all -> 0x00e6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x0147
            java.lang.CharSequence r0 = kotlin.text.C19459m.m33035H1(r0)     // Catch:{ all -> 0x00e6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x013f
            java.lang.String r0 = r0.toLowerCase()     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)     // Catch:{ all -> 0x00e6 }
            int r1 = r0.length()     // Catch:{ all -> 0x00e6 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0033
            r1 = r2
            goto L_0x0034
        L_0x0033:
            r1 = r3
        L_0x0034:
            if (r1 != 0) goto L_0x013e
            java.util.Set<java.lang.String> r1 = r13.processedText     // Catch:{ all -> 0x00e6 }
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x00e6 }
            if (r1 != 0) goto L_0x013e
            int r1 = r0.length()     // Catch:{ all -> 0x00e6 }
            r4 = 100
            if (r1 <= r4) goto L_0x0048
            goto L_0x013e
        L_0x0048:
            java.util.Set<java.lang.String> r1 = r13.processedText     // Catch:{ all -> 0x00e6 }
            r1.add(r0)     // Catch:{ all -> 0x00e6 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x00e6 }
            r1.<init>()     // Catch:{ all -> 0x00e6 }
            java.util.ArrayList r4 = p469vf.C13790c.m21339b(r14)     // Catch:{ all -> 0x00e6 }
            vf.d$a r5 = p469vf.C13791d.f30352e     // Catch:{ all -> 0x00e6 }
            r5.getClass()     // Catch:{ all -> 0x00e6 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x00e6 }
            java.util.concurrent.CopyOnWriteArraySet r6 = p469vf.C13791d.m21342a()     // Catch:{ all -> 0x00e6 }
            r5.<init>(r6)     // Catch:{ all -> 0x00e6 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00e6 }
            r6 = 0
            r7 = r6
        L_0x006a:
            boolean r8 = r5.hasNext()     // Catch:{ all -> 0x00e6 }
            if (r8 == 0) goto L_0x013b
            java.lang.Object r8 = r5.next()     // Catch:{ all -> 0x00e6 }
            vf.d r8 = (p469vf.C13791d) r8     // Catch:{ all -> 0x00e6 }
            com.facebook.appevents.aam.MetadataViewObserver$a r9 = Companion     // Catch:{ all -> 0x00e6 }
            java.lang.String r10 = r8.mo46654b()     // Catch:{ all -> 0x00e6 }
            r9.getClass()     // Catch:{ all -> 0x00e6 }
            java.lang.String r9 = "r2"
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r9, r10)     // Catch:{ all -> 0x00e6 }
            if (r9 == 0) goto L_0x0095
            kotlin.text.Regex r9 = new kotlin.text.Regex     // Catch:{ all -> 0x00e6 }
            java.lang.String r10 = "[^\\d.]"
            r9.<init>((java.lang.String) r10)     // Catch:{ all -> 0x00e6 }
            java.lang.String r10 = ""
            java.lang.String r9 = r9.replace((java.lang.CharSequence) r0, (java.lang.String) r10)     // Catch:{ all -> 0x00e6 }
            goto L_0x0096
        L_0x0095:
            r9 = r0
        L_0x0096:
            boolean r10 = p401mg.C13080a.m20762b(r8)     // Catch:{ all -> 0x00e6 }
            if (r10 == 0) goto L_0x009e
        L_0x009c:
            r10 = r6
            goto L_0x00a6
        L_0x009e:
            java.lang.String r10 = r8.f30355c     // Catch:{ all -> 0x00a1 }
            goto L_0x00a6
        L_0x00a1:
            r10 = move-exception
            p401mg.C13080a.m20761a(r8, r10)     // Catch:{ all -> 0x00e6 }
            goto L_0x009c
        L_0x00a6:
            int r10 = r10.length()     // Catch:{ all -> 0x00e6 }
            if (r10 <= 0) goto L_0x00ae
            r10 = r2
            goto L_0x00af
        L_0x00ae:
            r10 = r3
        L_0x00af:
            if (r10 == 0) goto L_0x00e9
            boolean r10 = p401mg.C13080a.m20762b(r8)     // Catch:{ all -> 0x00e6 }
            if (r10 == 0) goto L_0x00b9
        L_0x00b7:
            r10 = r6
            goto L_0x00c1
        L_0x00b9:
            java.lang.String r10 = r8.f30355c     // Catch:{ all -> 0x00bc }
            goto L_0x00c1
        L_0x00bc:
            r10 = move-exception
            p401mg.C13080a.m20761a(r8, r10)     // Catch:{ all -> 0x00e6 }
            goto L_0x00b7
        L_0x00c1:
            java.lang.Class<vf.c> r11 = p469vf.C13790c.class
            boolean r12 = p401mg.C13080a.m20762b(r11)     // Catch:{ all -> 0x00e6 }
            if (r12 == 0) goto L_0x00ca
            goto L_0x00e2
        L_0x00ca:
            java.lang.String r12 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r9, r12)     // Catch:{ all -> 0x00de }
            java.lang.String r12 = "rule"
            kotlin.jvm.internal.C19383o.m32797g(r10, r12)     // Catch:{ all -> 0x00de }
            kotlin.text.Regex r12 = new kotlin.text.Regex     // Catch:{ all -> 0x00de }
            r12.<init>((java.lang.String) r10)     // Catch:{ all -> 0x00de }
            boolean r10 = r12.matches(r9)     // Catch:{ all -> 0x00de }
            goto L_0x00e3
        L_0x00de:
            r10 = move-exception
            p401mg.C13080a.m20761a(r11, r10)     // Catch:{ all -> 0x00e6 }
        L_0x00e2:
            r10 = r3
        L_0x00e3:
            if (r10 != 0) goto L_0x00e9
            goto L_0x006a
        L_0x00e6:
            r14 = move-exception
            goto L_0x0157
        L_0x00e9:
            boolean r10 = p401mg.C13080a.m20762b(r8)     // Catch:{ all -> 0x00e6 }
            if (r10 == 0) goto L_0x00f1
        L_0x00ef:
            r10 = r6
            goto L_0x00fe
        L_0x00f1:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00f9 }
            java.util.List<java.lang.String> r11 = r8.f30353a     // Catch:{ all -> 0x00f9 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f9 }
            goto L_0x00fe
        L_0x00f9:
            r10 = move-exception
            p401mg.C13080a.m20761a(r8, r10)     // Catch:{ all -> 0x00e6 }
            goto L_0x00ef
        L_0x00fe:
            boolean r10 = p469vf.C13790c.m21340d(r4, r10)     // Catch:{ all -> 0x00e6 }
            if (r10 == 0) goto L_0x010f
            com.facebook.appevents.aam.MetadataViewObserver$a r10 = Companion     // Catch:{ all -> 0x00e6 }
            java.lang.String r8 = r8.mo46654b()     // Catch:{ all -> 0x00e6 }
            com.facebook.appevents.aam.MetadataViewObserver.C12213a.m20037a(r10, r1, r8, r9)     // Catch:{ all -> 0x00e6 }
            goto L_0x006a
        L_0x010f:
            if (r7 != 0) goto L_0x0115
            java.util.ArrayList r7 = p469vf.C13790c.m21338a(r14)     // Catch:{ all -> 0x00e6 }
        L_0x0115:
            boolean r10 = p401mg.C13080a.m20762b(r8)     // Catch:{ all -> 0x00e6 }
            if (r10 == 0) goto L_0x011d
        L_0x011b:
            r10 = r6
            goto L_0x012a
        L_0x011d:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0125 }
            java.util.List<java.lang.String> r11 = r8.f30353a     // Catch:{ all -> 0x0125 }
            r10.<init>(r11)     // Catch:{ all -> 0x0125 }
            goto L_0x012a
        L_0x0125:
            r10 = move-exception
            p401mg.C13080a.m20761a(r8, r10)     // Catch:{ all -> 0x00e6 }
            goto L_0x011b
        L_0x012a:
            boolean r10 = p469vf.C13790c.m21340d(r7, r10)     // Catch:{ all -> 0x00e6 }
            if (r10 == 0) goto L_0x006a
            com.facebook.appevents.aam.MetadataViewObserver$a r10 = Companion     // Catch:{ all -> 0x00e6 }
            java.lang.String r8 = r8.mo46654b()     // Catch:{ all -> 0x00e6 }
            com.facebook.appevents.aam.MetadataViewObserver.C12213a.m20037a(r10, r1, r8, r9)     // Catch:{ all -> 0x00e6 }
            goto L_0x006a
        L_0x013b:
            p461uf.C13519m.C13520a.m21292a(r1)     // Catch:{ all -> 0x00e6 }
        L_0x013e:
            return
        L_0x013f:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch:{ all -> 0x00e6 }
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r14.<init>(r0)     // Catch:{ all -> 0x00e6 }
            throw r14     // Catch:{ all -> 0x00e6 }
        L_0x0147:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch:{ all -> 0x00e6 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.CharSequence"
            r14.<init>(r0)     // Catch:{ all -> 0x00e6 }
            throw r14     // Catch:{ all -> 0x00e6 }
        L_0x014f:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch:{ all -> 0x00e6 }
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.EditText"
            r14.<init>(r0)     // Catch:{ all -> 0x00e6 }
            throw r14     // Catch:{ all -> 0x00e6 }
        L_0x0157:
            p401mg.C13080a.m20761a(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.aam.MetadataViewObserver.processEditText(android.view.View):void");
    }

    private final void runOnUIThread(Runnable runnable) {
        if (!C13080a.m20762b(this)) {
            try {
                Thread currentThread = Thread.currentThread();
                Looper mainLooper = Looper.getMainLooper();
                C19383o.m32796f(mainLooper, "Looper.getMainLooper()");
                if (currentThread == mainLooper.getThread()) {
                    runnable.run();
                } else {
                    this.uiThreadHandler.post(runnable);
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    private final void startTracking() {
        View b;
        if (!C13080a.m20762b(this)) {
            try {
                if (!this.isTracking.getAndSet(true) && (b = C8527d.m16931b(this.activityWeakReference.get())) != null) {
                    ViewTreeObserver viewTreeObserver = b.getViewTreeObserver();
                    C19383o.m32796f(viewTreeObserver, "observer");
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalFocusChangeListener(this);
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public static final void startTrackingActivity(Activity activity) {
        if (!C13080a.m20762b(MetadataViewObserver.class)) {
            try {
                Companion.getClass();
                C12213a.m20038b(activity);
            } catch (Throwable th) {
                C13080a.m20761a(MetadataViewObserver.class, th);
            }
        }
    }

    private final void stopTracking() {
        View b;
        if (!C13080a.m20762b(this)) {
            try {
                if (this.isTracking.getAndSet(false) && (b = C8527d.m16931b(this.activityWeakReference.get())) != null) {
                    ViewTreeObserver viewTreeObserver = b.getViewTreeObserver();
                    C19383o.m32796f(viewTreeObserver, "observer");
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnGlobalFocusChangeListener(this);
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public static final void stopTrackingActivity(Activity activity) {
        if (!C13080a.m20762b(MetadataViewObserver.class)) {
            try {
                Companion.getClass();
                C19383o.m32797g(activity, "activity");
                int hashCode = activity.hashCode();
                MetadataViewObserver metadataViewObserver = (MetadataViewObserver) access$getObservers$cp().get(Integer.valueOf(hashCode));
                if (metadataViewObserver != null) {
                    access$getObservers$cp().remove(Integer.valueOf(hashCode));
                    access$stopTracking(metadataViewObserver);
                }
            } catch (Throwable th) {
                C13080a.m20761a(MetadataViewObserver.class, th);
            }
        }
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (!C13080a.m20762b(this)) {
            if (view != null) {
                try {
                    process(view);
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                    return;
                }
            }
            if (view2 != null) {
                process(view2);
            }
        }
    }

    public /* synthetic */ MetadataViewObserver(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }
}
