package androidx.multidex;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p003a2.C0023f;

/* renamed from: androidx.multidex.a */
public final class C2941a {

    /* renamed from: a */
    public static final HashSet f6655a = new HashSet();

    /* renamed from: b */
    public static final boolean f6656b;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r2 < 1) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    static {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            f6655a = r0
            java.lang.String r0 = "java.vm.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x0042
            java.util.StringTokenizer r1 = new java.util.StringTokenizer
            java.lang.String r2 = "."
            r1.<init>(r0, r2)
            boolean r2 = r1.hasMoreTokens()
            r3 = 0
            if (r2 == 0) goto L_0x0022
            java.lang.String r2 = r1.nextToken()
            goto L_0x0023
        L_0x0022:
            r2 = r3
        L_0x0023:
            boolean r4 = r1.hasMoreTokens()
            if (r4 == 0) goto L_0x002d
            java.lang.String r3 = r1.nextToken()
        L_0x002d:
            if (r2 == 0) goto L_0x0042
            if (r3 == 0) goto L_0x0042
            int r1 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0042 }
            int r2 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0042 }
            r3 = 1
            r4 = 2
            if (r1 > r4) goto L_0x0043
            if (r1 != r4) goto L_0x0042
            if (r2 < r3) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r3 = 0
        L_0x0043:
            java.lang.String r1 = "VM with version "
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0073e.m211k(r1, r0)
            if (r3 == 0) goto L_0x004e
            java.lang.String r1 = " has multidex support"
            goto L_0x0050
        L_0x004e:
            java.lang.String r1 = " does not have multidex support"
        L_0x0050:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MultiDex"
            android.util.Log.i(r1, r0)
            f6656b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.C2941a.<clinit>():void");
    }

    /* renamed from: a */
    public static void m6874a(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder h = C0072d.m201h("Clearing old secondary dex dir (");
            h.append(file.getPath());
            h.append(").");
            Log.i("MultiDex", h.toString());
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder h2 = C0072d.m201h("Failed to list secondary dex dir content (");
                h2.append(file.getPath());
                h2.append(").");
                Log.w("MultiDex", h2.toString());
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder h3 = C0072d.m201h("Trying to delete old file ");
                h3.append(file2.getPath());
                h3.append(" of size ");
                h3.append(file2.length());
                Log.i("MultiDex", h3.toString());
                if (!file2.delete()) {
                    StringBuilder h4 = C0072d.m201h("Failed to delete old file ");
                    h4.append(file2.getPath());
                    Log.w("MultiDex", h4.toString());
                } else {
                    StringBuilder h5 = C0072d.m201h("Deleted old file ");
                    h5.append(file2.getPath());
                    Log.i("MultiDex", h5.toString());
                }
            }
            if (!file.delete()) {
                StringBuilder h6 = C0072d.m201h("Failed to delete secondary dex dir ");
                h6.append(file.getPath());
                Log.w("MultiDex", h6.toString());
                return;
            }
            StringBuilder h7 = C0072d.m201h("Deleted old secondary dex dir ");
            h7.append(file.getPath());
            Log.i("MultiDex", h7.toString());
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00c4 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a A[Catch:{ all -> 0x00a5, RuntimeException -> 0x0061 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c A[SYNTHETIC, Splitter:B:22:0x006c] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m6875b(android.content.Context r7, java.io.File r8, java.io.File r9) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        /*
            java.lang.String r0 = "secondary-dexes"
            java.util.HashSet r1 = f6655a
            monitor-enter(r1)
            boolean r2 = r1.contains(r8)     // Catch:{ all -> 0x00c5 }
            if (r2 == 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x00c5 }
            return
        L_0x000d:
            r1.add(r8)     // Catch:{ all -> 0x00c5 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = "MultiDex"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c5 }
            r4.<init>()     // Catch:{ all -> 0x00c5 }
            java.lang.String r5 = "MultiDex is not guaranteed to work in SDK version "
            r4.append(r5)     // Catch:{ all -> 0x00c5 }
            r4.append(r2)     // Catch:{ all -> 0x00c5 }
            java.lang.String r2 = ": SDK version higher than "
            r4.append(r2)     // Catch:{ all -> 0x00c5 }
            r2 = 20
            r4.append(r2)     // Catch:{ all -> 0x00c5 }
            java.lang.String r2 = " should be backed by "
            r4.append(r2)     // Catch:{ all -> 0x00c5 }
            java.lang.String r2 = "runtime with built-in multidex capabilty but it's not the "
            r4.append(r2)     // Catch:{ all -> 0x00c5 }
            java.lang.String r2 = "case here: java.vm.version=\""
            r4.append(r2)     // Catch:{ all -> 0x00c5 }
            java.lang.String r2 = "java.vm.version"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x00c5 }
            r4.append(r2)     // Catch:{ all -> 0x00c5 }
            java.lang.String r2 = "\""
            r4.append(r2)     // Catch:{ all -> 0x00c5 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x00c5 }
            android.util.Log.w(r3, r2)     // Catch:{ all -> 0x00c5 }
            java.lang.String r2 = "MultiDex"
            r3 = 0
            java.lang.ClassLoader r4 = r7.getClassLoader()     // Catch:{ RuntimeException -> 0x0061 }
            boolean r5 = r4 instanceof dalvik.system.BaseDexClassLoader     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x005b
            goto L_0x0068
        L_0x005b:
            java.lang.String r4 = "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching."
            android.util.Log.e(r2, r4)     // Catch:{ all -> 0x00c5 }
            goto L_0x0067
        L_0x0061:
            r4 = move-exception
            java.lang.String r5 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            android.util.Log.w(r2, r5, r4)     // Catch:{ all -> 0x00c5 }
        L_0x0067:
            r4 = r3
        L_0x0068:
            if (r4 != 0) goto L_0x006c
            monitor-exit(r1)     // Catch:{ all -> 0x00c5 }
            return
        L_0x006c:
            m6874a(r7)     // Catch:{ all -> 0x0070 }
            goto L_0x0078
        L_0x0070:
            r2 = move-exception
            java.lang.String r5 = "MultiDex"
            java.lang.String r6 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r5, r6, r2)     // Catch:{ all -> 0x00c5 }
        L_0x0078:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00c5 }
            java.lang.String r5 = "code_cache"
            r2.<init>(r9, r5)     // Catch:{ all -> 0x00c5 }
            m6878e(r2)     // Catch:{ IOException -> 0x0083 }
            goto L_0x008f
        L_0x0083:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00c5 }
            java.io.File r9 = r7.getFilesDir()     // Catch:{ all -> 0x00c5 }
            r2.<init>(r9, r5)     // Catch:{ all -> 0x00c5 }
            m6878e(r2)     // Catch:{ all -> 0x00c5 }
        L_0x008f:
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x00c5 }
            r9.<init>(r2, r0)     // Catch:{ all -> 0x00c5 }
            m6878e(r9)     // Catch:{ all -> 0x00c5 }
            androidx.multidex.MultiDexExtractor r0 = new androidx.multidex.MultiDexExtractor     // Catch:{ all -> 0x00c5 }
            r0.<init>(r8, r9)     // Catch:{ all -> 0x00c5 }
            r8 = 0
            java.util.ArrayList r8 = r0.mo10933e(r7, r8)     // Catch:{ all -> 0x00a5 }
            m6877d(r9, r4, r8)     // Catch:{ IOException -> 0x00a7 }
            goto L_0x00b7
        L_0x00a5:
            r7 = move-exception
            goto L_0x00c1
        L_0x00a7:
            r8 = move-exception
            java.lang.String r2 = "MultiDex"
            java.lang.String r5 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r2, r5, r8)     // Catch:{ all -> 0x00a5 }
            r8 = 1
            java.util.ArrayList r7 = r0.mo10933e(r7, r8)     // Catch:{ all -> 0x00a5 }
            m6877d(r9, r4, r7)     // Catch:{ all -> 0x00a5 }
        L_0x00b7:
            r0.close()     // Catch:{ IOException -> 0x00bb }
            goto L_0x00bc
        L_0x00bb:
            r3 = move-exception
        L_0x00bc:
            if (r3 != 0) goto L_0x00c0
            monitor-exit(r1)     // Catch:{ all -> 0x00c5 }
            return
        L_0x00c0:
            throw r3     // Catch:{ all -> 0x00c5 }
        L_0x00c1:
            r0.close()     // Catch:{ IOException -> 0x00c4 }
        L_0x00c4:
            throw r7     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c5 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.C2941a.m6875b(android.content.Context, java.io.File, java.io.File):void");
    }

    /* renamed from: c */
    public static Field m6876c(Object obj, String str) throws NoSuchFieldException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder l = C0023f.m111l("Field ", str, " not found in ");
        l.append(obj.getClass());
        throw new NoSuchFieldException(l.toString());
    }

    /* renamed from: d */
    public static void m6877d(File file, ClassLoader classLoader, ArrayList arrayList) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        IOException[] iOExceptionArr;
        if (!arrayList.isEmpty()) {
            Object obj = m6876c(classLoader, "pathList").get(classLoader);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList);
            Class[] clsArr = {ArrayList.class, File.class, ArrayList.class};
            Class cls = obj.getClass();
            while (cls != null) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    Object[] objArr = (Object[]) declaredMethod.invoke(obj, new Object[]{arrayList3, file, arrayList2});
                    Field c = m6876c(obj, "dexElements");
                    Object[] objArr2 = (Object[]) c.get(obj);
                    Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
                    System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
                    System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
                    c.set(obj, objArr3);
                    if (arrayList2.size() > 0) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                        }
                        Field c2 = m6876c(obj, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr2 = (IOException[]) c2.get(obj);
                        if (iOExceptionArr2 == null) {
                            iOExceptionArr = (IOException[]) arrayList2.toArray(new IOException[arrayList2.size()]);
                        } else {
                            IOException[] iOExceptionArr3 = new IOException[(arrayList2.size() + iOExceptionArr2.length)];
                            arrayList2.toArray(iOExceptionArr3);
                            System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList2.size(), iOExceptionArr2.length);
                            iOExceptionArr = iOExceptionArr3;
                        }
                        c2.set(obj, iOExceptionArr);
                        IOException iOException = new IOException("I/O exception during makeDexElement");
                        iOException.initCause((Throwable) arrayList2.get(0));
                        throw iOException;
                    }
                    return;
                } catch (NoSuchMethodException unused) {
                    cls = cls.getSuperclass();
                }
            }
            StringBuilder l = C0023f.m111l("Method ", "makeDexElements", " with parameters ");
            l.append(Arrays.asList(clsArr));
            l.append(" not found in ");
            l.append(obj.getClass());
            throw new NoSuchMethodException(l.toString());
        }
    }

    /* renamed from: e */
    public static void m6878e(File file) throws IOException {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                StringBuilder h = C0072d.m201h("Failed to create dir ");
                h.append(file.getPath());
                h.append(". Parent file is null.");
                Log.e("MultiDex", h.toString());
            } else {
                StringBuilder h2 = C0072d.m201h("Failed to create dir ");
                h2.append(file.getPath());
                h2.append(". parent file is a dir ");
                h2.append(parentFile.isDirectory());
                h2.append(", a file ");
                h2.append(parentFile.isFile());
                h2.append(", exists ");
                h2.append(parentFile.exists());
                h2.append(", readable ");
                h2.append(parentFile.canRead());
                h2.append(", writable ");
                h2.append(parentFile.canWrite());
                Log.e("MultiDex", h2.toString());
            }
            StringBuilder h3 = C0072d.m201h("Failed to create directory ");
            h3.append(file.getPath());
            throw new IOException(h3.toString());
        }
    }
}
