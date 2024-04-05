package com.bugsnag.android;

import android.support.p013v4.media.C0072d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bugsnag.android.c1 */
public abstract class C5726c1 {

    /* renamed from: a */
    public final File f12175a;

    /* renamed from: b */
    public final int f12176b;

    /* renamed from: c */
    public final Comparator<File> f12177c;

    /* renamed from: d */
    public final ReentrantLock f12178d = new ReentrantLock();

    /* renamed from: e */
    public final ConcurrentSkipListSet f12179e = new ConcurrentSkipListSet();

    /* renamed from: f */
    public final C5816o1 f12180f;

    /* renamed from: g */
    public final C5727a f12181g;

    /* renamed from: com.bugsnag.android.c1$a */
    public interface C5727a {
        /* renamed from: a */
        void mo16496a(Exception exc, File file, String str);
    }

    public C5726c1(File file, int i, Comparator comparator, C5816o1 o1Var, C5744f1 f1Var) {
        this.f12176b = i;
        this.f12177c = comparator;
        this.f12180f = o1Var;
        this.f12181g = f1Var;
        this.f12175a = file;
        mo16494f(file);
    }

    /* renamed from: a */
    public final void mo16489a(Collection<File> collection) {
        this.f12178d.lock();
        if (collection != null) {
            try {
                this.f12179e.removeAll(collection);
            } catch (Throwable th) {
                this.f12178d.unlock();
                throw th;
            }
        }
        this.f12178d.unlock();
    }

    /* renamed from: b */
    public final void mo16490b(Collection<File> collection) {
        this.f12178d.lock();
        if (collection != null) {
            try {
                this.f12179e.removeAll(collection);
                for (File next : collection) {
                    if (!next.delete()) {
                        next.deleteOnExit();
                    }
                }
            } catch (Throwable th) {
                this.f12178d.unlock();
                throw th;
            }
        }
        this.f12178d.unlock();
    }

    /* renamed from: c */
    public final void mo16491c() {
        File[] listFiles;
        if (mo16494f(this.f12175a) && (listFiles = this.f12175a.listFiles()) != null) {
            ArrayList arrayList = new ArrayList(Arrays.asList(listFiles));
            if (arrayList.size() >= this.f12176b) {
                Collections.sort(arrayList, this.f12177c);
                int i = 0;
                while (i < arrayList.size() && arrayList.size() >= this.f12176b) {
                    File file = (File) arrayList.get(i);
                    if (!this.f12179e.contains(file)) {
                        C5816o1 o1Var = this.f12180f;
                        StringBuilder h = C0072d.m201h("Discarding oldest error as stored error limit reached: '");
                        h.append(file.getPath());
                        h.append('\'');
                        o1Var.mo16608h(h.toString());
                        mo16490b(Collections.singleton(file));
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: d */
    public final ArrayList mo16492d() {
        File[] listFiles;
        this.f12178d.lock();
        try {
            ArrayList arrayList = new ArrayList();
            if (mo16494f(this.f12175a) && (listFiles = this.f12175a.listFiles()) != null) {
                for (File file : listFiles) {
                    if (file.length() == 0) {
                        if (!file.delete()) {
                            file.deleteOnExit();
                        }
                    } else if (file.isFile() && !this.f12179e.contains(file)) {
                        arrayList.add(file);
                    }
                }
            }
            this.f12179e.addAll(arrayList);
            return arrayList;
        } finally {
            this.f12178d.unlock();
        }
    }

    /* renamed from: e */
    public abstract String mo16493e(Object obj);

    /* renamed from: f */
    public final boolean mo16494f(File file) {
        try {
            file.mkdirs();
            return true;
        } catch (Exception e) {
            this.f12180f.mo16603c("Could not prepare file storage directory", e);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c A[Catch:{ Exception -> 0x008d, all -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0089 A[Catch:{ Exception -> 0x008d, all -> 0x006d }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16495g(com.bugsnag.android.C5748g1.C5749a r7) {
        /*
            r6 = this;
            java.io.File r0 = r6.f12175a
            boolean r0 = r6.mo16494f(r0)
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            int r0 = r6.f12176b
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            r6.mo16491c()
            java.io.File r0 = new java.io.File
            java.io.File r1 = r6.f12175a
            java.lang.String r2 = r6.mo16493e(r7)
            r0.<init>(r1, r2)
            java.lang.String r0 = r0.getAbsolutePath()
            java.util.concurrent.locks.ReentrantLock r1 = r6.f12178d
            r1.lock()
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0071, Exception -> 0x006f }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0071, Exception -> 0x006f }
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ FileNotFoundException -> 0x0071, Exception -> 0x006f }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ FileNotFoundException -> 0x0071, Exception -> 0x006f }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r2, r5)     // Catch:{ FileNotFoundException -> 0x0071, Exception -> 0x006f }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0071, Exception -> 0x006f }
            com.bugsnag.android.g1 r2 = new com.bugsnag.android.g1     // Catch:{ FileNotFoundException -> 0x0071, Exception -> 0x006f }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0071, Exception -> 0x006f }
            r1 = 0
            r2.mo16516M(r7, r1)     // Catch:{ FileNotFoundException -> 0x006a, Exception -> 0x0067, all -> 0x0064 }
            com.bugsnag.android.o1 r7 = r6.f12180f     // Catch:{ FileNotFoundException -> 0x006a, Exception -> 0x0067, all -> 0x0064 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x006a, Exception -> 0x0067, all -> 0x0064 }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x006a, Exception -> 0x0067, all -> 0x0064 }
            java.lang.String r3 = "Saved unsent payload to disk: '"
            r1.append(r3)     // Catch:{ FileNotFoundException -> 0x006a, Exception -> 0x0067, all -> 0x0064 }
            r1.append(r0)     // Catch:{ FileNotFoundException -> 0x006a, Exception -> 0x0067, all -> 0x0064 }
            r3 = 39
            r1.append(r3)     // Catch:{ FileNotFoundException -> 0x006a, Exception -> 0x0067, all -> 0x0064 }
            java.lang.String r1 = r1.toString()     // Catch:{ FileNotFoundException -> 0x006a, Exception -> 0x0067, all -> 0x0064 }
            r7.mo16606f(r1)     // Catch:{ FileNotFoundException -> 0x006a, Exception -> 0x0067, all -> 0x0064 }
            p001a0.C0005b.m25S(r2)
        L_0x005e:
            java.util.concurrent.locks.ReentrantLock r7 = r6.f12178d
            r7.unlock()
            return
        L_0x0064:
            r7 = move-exception
            r1 = r2
            goto L_0x009f
        L_0x0067:
            r7 = move-exception
            r1 = r2
            goto L_0x0073
        L_0x006a:
            r7 = move-exception
            r1 = r2
            goto L_0x0094
        L_0x006d:
            r7 = move-exception
            goto L_0x009f
        L_0x006f:
            r7 = move-exception
            goto L_0x0073
        L_0x0071:
            r7 = move-exception
            goto L_0x0094
        L_0x0073:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x006d }
            r2.<init>(r0)     // Catch:{ all -> 0x006d }
            com.bugsnag.android.c1$a r0 = r6.f12181g     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x0081
            java.lang.String r3 = "Crash report serialization"
            r0.mo16496a(r7, r2, r3)     // Catch:{ all -> 0x006d }
        L_0x0081:
            com.bugsnag.android.o1 r7 = r6.f12180f     // Catch:{ all -> 0x006d }
            boolean r0 = r2.delete()     // Catch:{ Exception -> 0x008d }
            if (r0 != 0) goto L_0x009b
            r2.deleteOnExit()     // Catch:{ Exception -> 0x008d }
            goto L_0x009b
        L_0x008d:
            r0 = move-exception
            java.lang.String r2 = "Failed to delete file"
            r7.mo16602b(r2, r0)     // Catch:{ all -> 0x006d }
            goto L_0x009b
        L_0x0094:
            com.bugsnag.android.o1 r0 = r6.f12180f     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "Ignoring FileNotFoundException - unable to create file"
            r0.mo16602b(r2, r7)     // Catch:{ all -> 0x006d }
        L_0x009b:
            p001a0.C0005b.m25S(r1)
            goto L_0x005e
        L_0x009f:
            p001a0.C0005b.m25S(r1)
            java.util.concurrent.locks.ReentrantLock r0 = r6.f12178d
            r0.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C5726c1.mo16495g(com.bugsnag.android.g1$a):void");
    }
}
