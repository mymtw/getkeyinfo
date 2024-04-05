package p250u0;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: u0.b */
public final class C8080b {

    /* renamed from: a */
    public static final Class<?> f17594a;

    /* renamed from: b */
    public static final Field f17595b;

    /* renamed from: c */
    public static final Field f17596c;

    /* renamed from: d */
    public static final Method f17597d;

    /* renamed from: e */
    public static final Method f17598e;

    /* renamed from: f */
    public static final Method f17599f;

    /* renamed from: g */
    public static final Handler f17600g = new Handler(Looper.getMainLooper());

    /* renamed from: u0.b$a */
    public class C8081a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C8083c f17601b;

        /* renamed from: c */
        public final /* synthetic */ Object f17602c;

        public C8081a(C8083c cVar, Object obj) {
            this.f17601b = cVar;
            this.f17602c = obj;
        }

        public final void run() {
            this.f17601b.f17605b = this.f17602c;
        }
    }

    /* renamed from: u0.b$b */
    public class C8082b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Application f17603b;

        /* renamed from: c */
        public final /* synthetic */ C8083c f17604c;

        public C8082b(Application application, C8083c cVar) {
            this.f17603b = application;
            this.f17604c = cVar;
        }

        public final void run() {
            this.f17603b.unregisterActivityLifecycleCallbacks(this.f17604c);
        }
    }

    /* renamed from: u0.b$c */
    public static final class C8083c implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b */
        public Object f17605b;

        /* renamed from: c */
        public Activity f17606c;

        /* renamed from: d */
        public final int f17607d;

        /* renamed from: e */
        public boolean f17608e = false;

        /* renamed from: f */
        public boolean f17609f = false;

        /* renamed from: g */
        public boolean f17610g = false;

        public C8083c(Activity activity) {
            this.f17606c = activity;
            this.f17607d = activity.hashCode();
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
            if (this.f17606c == activity) {
                this.f17606c = null;
                this.f17609f = true;
            }
        }

        public final void onActivityPaused(Activity activity) {
            if (this.f17609f && !this.f17610g && !this.f17608e) {
                Object obj = this.f17605b;
                int i = this.f17607d;
                boolean z = false;
                try {
                    Object obj2 = C8080b.f17596c.get(activity);
                    if (obj2 == obj) {
                        if (activity.hashCode() == i) {
                            C8080b.f17600g.postAtFrontOfQueue(new C8084c(C8080b.f17595b.get(activity), obj2));
                            z = true;
                        }
                    }
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while fetching field values", th);
                }
                if (z) {
                    this.f17610g = true;
                    this.f17605b = null;
                }
            }
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
            if (this.f17606c == activity) {
                this.f17608e = true;
            }
        }

        public final void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b A[SYNTHETIC, Splitter:B:23:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007f  */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            f17600g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            f17594a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch:{ all -> 0x0023 }
            r3.setAccessible(r2)     // Catch:{ all -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r3 = r1
        L_0x0024:
            f17595b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch:{ all -> 0x0030 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            f17596c = r0
            java.lang.Class<?> r0 = f17594a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r0 != 0) goto L_0x003d
            goto L_0x0053
        L_0x003d:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x0053 }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x0053 }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0053 }
            r7[r2] = r8     // Catch:{ all -> 0x0053 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch:{ all -> 0x0053 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x0053 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0053 }
            goto L_0x0054
        L_0x0053:
            r0 = r1
        L_0x0054:
            f17597d = r0
            java.lang.Class<?> r0 = f17594a
            if (r0 != 0) goto L_0x005b
            goto L_0x006d
        L_0x005b:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x006d }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x006d }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x006d }
            r7[r2] = r8     // Catch:{ all -> 0x006d }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x006d }
            r0.setAccessible(r2)     // Catch:{ all -> 0x006d }
            goto L_0x006e
        L_0x006d:
            r0 = r1
        L_0x006e:
            f17598e = r0
            java.lang.Class<?> r0 = f17594a
            int r4 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r4 == r7) goto L_0x007f
            r7 = 27
            if (r4 != r7) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r4 = r6
            goto L_0x0080
        L_0x007f:
            r4 = r2
        L_0x0080:
            if (r4 == 0) goto L_0x00b9
            if (r0 != 0) goto L_0x0085
            goto L_0x00b9
        L_0x0085:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ all -> 0x00b9 }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x00b9 }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r2] = r6     // Catch:{ all -> 0x00b9 }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch:{ all -> 0x00b9 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00b9 }
            r7[r3] = r5     // Catch:{ all -> 0x00b9 }
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b9 }
            r7[r3] = r5     // Catch:{ all -> 0x00b9 }
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00b9 }
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00b9 }
            r3 = 7
            r7[r3] = r5     // Catch:{ all -> 0x00b9 }
            r3 = 8
            r7[r3] = r5     // Catch:{ all -> 0x00b9 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x00b9 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x00b9 }
            r1 = r0
        L_0x00b9:
            f17599f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p250u0.C8080b.<clinit>():void");
    }

    /* renamed from: a */
    public static boolean m16264a(Activity activity) {
        Object obj;
        Application application;
        C8083c cVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            activity.recreate();
            return true;
        }
        if ((i == 26 || i == 27) && f17599f == null) {
            return false;
        }
        if (f17598e == null && f17597d == null) {
            return false;
        }
        try {
            Object obj2 = f17596c.get(activity);
            if (obj2 == null || (obj = f17595b.get(activity)) == null) {
                return false;
            }
            application = activity.getApplication();
            cVar = new C8083c(activity);
            application.registerActivityLifecycleCallbacks(cVar);
            Handler handler = f17600g;
            handler.post(new C8081a(cVar, obj2));
            if (i == 26 || i == 27) {
                Method method = f17599f;
                Boolean bool = Boolean.FALSE;
                method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
            } else {
                activity.recreate();
            }
            handler.post(new C8082b(application, cVar));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
