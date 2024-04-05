package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C2870k0;
import androidx.savedstate.C3265b;
import androidx.savedstate.C3269d;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.lifecycle.g0 */
public final class C2861g0 extends C2870k0.C2873c {

    /* renamed from: f */
    public static final Class<?>[] f6489f;

    /* renamed from: g */
    public static final Class<?>[] f6490g;

    /* renamed from: a */
    public final Application f6491a;

    /* renamed from: b */
    public final C2870k0.C2874d f6492b;

    /* renamed from: c */
    public final Bundle f6493c;

    /* renamed from: d */
    public final Lifecycle f6494d;

    /* renamed from: e */
    public final C3265b f6495e;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Class<?>[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.lifecycle.f0> r0 = androidx.lifecycle.C2858f0.class
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r0
            f6489f = r1
            java.lang.Class[] r1 = new java.lang.Class[r2]
            r1[r3] = r0
            f6490g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C2861g0.<clinit>():void");
    }

    @SuppressLint({"LambdaLast"})
    public C2861g0(Application application, C3269d dVar, Bundle bundle) {
        C2870k0.C2874d dVar2;
        this.f6495e = dVar.getSavedStateRegistry();
        this.f6494d = dVar.getLifecycle();
        this.f6493c = bundle;
        this.f6491a = application;
        if (application != null) {
            if (C2870k0.C2871a.f6512b == null) {
                C2870k0.C2871a.f6512b = new C2870k0.C2871a(application);
            }
            dVar2 = C2870k0.C2871a.f6512b;
            C19383o.m32794d(dVar2);
        } else {
            dVar2 = C2870k0.C2874d.getInstance();
        }
        this.f6492b = dVar2;
    }

    /* renamed from: a */
    public final void mo10816a(C2866i0 i0Var) {
        C3265b bVar = this.f6495e;
        Lifecycle lifecycle = this.f6494d;
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) i0Var.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.f6453c) {
            savedStateHandleController.mo10796a(lifecycle, bVar);
            SavedStateHandleController.m6784b(lifecycle, bVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.lifecycle.C2866i0 mo10817b(java.lang.Class r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Class<androidx.lifecycle.a> r0 = androidx.lifecycle.C2842a.class
            boolean r0 = r0.isAssignableFrom(r12)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0029
            android.app.Application r3 = r11.f6491a
            if (r3 == 0) goto L_0x0029
            java.lang.Class<?>[] r3 = f6489f
            java.lang.reflect.Constructor[] r4 = r12.getConstructors()
            int r5 = r4.length
            r6 = r2
        L_0x0016:
            if (r6 >= r5) goto L_0x0043
            r7 = r4[r6]
            java.lang.Class[] r8 = r7.getParameterTypes()
            boolean r8 = java.util.Arrays.equals(r3, r8)
            if (r8 == 0) goto L_0x0026
        L_0x0024:
            r1 = r7
            goto L_0x0043
        L_0x0026:
            int r6 = r6 + 1
            goto L_0x0016
        L_0x0029:
            java.lang.Class<?>[] r3 = f6490g
            java.lang.reflect.Constructor[] r4 = r12.getConstructors()
            int r5 = r4.length
            r6 = r2
        L_0x0031:
            if (r6 >= r5) goto L_0x0043
            r7 = r4[r6]
            java.lang.Class[] r8 = r7.getParameterTypes()
            boolean r8 = java.util.Arrays.equals(r3, r8)
            if (r8 == 0) goto L_0x0040
            goto L_0x0024
        L_0x0040:
            int r6 = r6 + 1
            goto L_0x0031
        L_0x0043:
            if (r1 != 0) goto L_0x004c
            androidx.lifecycle.k0$d r13 = r11.f6492b
            androidx.lifecycle.i0 r12 = r13.create(r12)
            return r12
        L_0x004c:
            androidx.savedstate.b r3 = r11.f6495e
            androidx.lifecycle.Lifecycle r4 = r11.f6494d
            android.os.Bundle r5 = r11.f6493c
            android.os.Bundle r6 = r3.mo12060a(r13)
            java.lang.Class[] r7 = androidx.lifecycle.C2858f0.f6481e
            if (r6 != 0) goto L_0x0089
            if (r5 != 0) goto L_0x0062
            androidx.lifecycle.f0 r5 = new androidx.lifecycle.f0
            r5.<init>()
            goto L_0x00c4
        L_0x0062:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Set r7 = r5.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x006f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0083
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r5.get(r8)
            r6.put(r8, r9)
            goto L_0x006f
        L_0x0083:
            androidx.lifecycle.f0 r5 = new androidx.lifecycle.f0
            r5.<init>(r6)
            goto L_0x00c4
        L_0x0089:
            java.lang.String r5 = "keys"
            java.util.ArrayList r5 = r6.getParcelableArrayList(r5)
            java.lang.String r7 = "values"
            java.util.ArrayList r6 = r6.getParcelableArrayList(r7)
            if (r5 == 0) goto L_0x0145
            if (r6 == 0) goto L_0x0145
            int r7 = r5.size()
            int r8 = r6.size()
            if (r7 != r8) goto L_0x0145
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r8 = r2
        L_0x00a9:
            int r9 = r5.size()
            if (r8 >= r9) goto L_0x00bf
            java.lang.Object r9 = r5.get(r8)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r6.get(r8)
            r7.put(r9, r10)
            int r8 = r8 + 1
            goto L_0x00a9
        L_0x00bf:
            androidx.lifecycle.f0 r5 = new androidx.lifecycle.f0
            r5.<init>(r7)
        L_0x00c4:
            androidx.lifecycle.SavedStateHandleController r6 = new androidx.lifecycle.SavedStateHandleController
            r6.<init>(r13, r5)
            r6.mo10796a(r4, r3)
            androidx.lifecycle.SavedStateHandleController.m6784b(r4, r3)
            r13 = 1
            if (r0 == 0) goto L_0x00e4
            android.app.Application r0 = r11.f6491a     // Catch:{ IllegalAccessException -> 0x012d, InstantiationException -> 0x0110, InvocationTargetException -> 0x00f4 }
            if (r0 == 0) goto L_0x00e4
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x012d, InstantiationException -> 0x0110, InvocationTargetException -> 0x00f4 }
            r3[r2] = r0     // Catch:{ IllegalAccessException -> 0x012d, InstantiationException -> 0x0110, InvocationTargetException -> 0x00f4 }
            r3[r13] = r5     // Catch:{ IllegalAccessException -> 0x012d, InstantiationException -> 0x0110, InvocationTargetException -> 0x00f4 }
            java.lang.Object r13 = r1.newInstance(r3)     // Catch:{ IllegalAccessException -> 0x012d, InstantiationException -> 0x0110, InvocationTargetException -> 0x00f4 }
            androidx.lifecycle.i0 r13 = (androidx.lifecycle.C2866i0) r13     // Catch:{ IllegalAccessException -> 0x012d, InstantiationException -> 0x0110, InvocationTargetException -> 0x00f4 }
            goto L_0x00ee
        L_0x00e4:
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ IllegalAccessException -> 0x012d, InstantiationException -> 0x0110, InvocationTargetException -> 0x00f4 }
            r13[r2] = r5     // Catch:{ IllegalAccessException -> 0x012d, InstantiationException -> 0x0110, InvocationTargetException -> 0x00f4 }
            java.lang.Object r13 = r1.newInstance(r13)     // Catch:{ IllegalAccessException -> 0x012d, InstantiationException -> 0x0110, InvocationTargetException -> 0x00f4 }
            androidx.lifecycle.i0 r13 = (androidx.lifecycle.C2866i0) r13     // Catch:{ IllegalAccessException -> 0x012d, InstantiationException -> 0x0110, InvocationTargetException -> 0x00f4 }
        L_0x00ee:
            java.lang.String r0 = "androidx.lifecycle.savedstate.vm.tag"
            r13.setTagIfAbsent(r0, r6)     // Catch:{ IllegalAccessException -> 0x012d, InstantiationException -> 0x0110, InvocationTargetException -> 0x00f4 }
            return r13
        L_0x00f4:
            r13 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "An exception happened in constructor of "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            java.lang.Throwable r13 = r13.getCause()
            r0.<init>(r12, r13)
            throw r0
        L_0x0110:
            r13 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "A "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = " cannot be instantiated."
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12, r13)
            throw r0
        L_0x012d:
            r13 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to access "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12, r13)
            throw r0
        L_0x0145:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Invalid bundle passed as restored state"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C2861g0.mo10817b(java.lang.Class, java.lang.String):androidx.lifecycle.i0");
    }

    public final <T extends C2866i0> T create(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo10817b(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
