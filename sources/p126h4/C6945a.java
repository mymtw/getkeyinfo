package p126h4;

import android.annotation.TargetApi;
import android.os.StrictMode;
import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.ClassUtils;

/* renamed from: h4.a */
public final class C6945a implements Closeable {

    /* renamed from: b */
    public final File f15392b;

    /* renamed from: c */
    public final File f15393c;

    /* renamed from: d */
    public final File f15394d;

    /* renamed from: e */
    public final File f15395e;

    /* renamed from: f */
    public final int f15396f;

    /* renamed from: g */
    public long f15397g;

    /* renamed from: h */
    public final int f15398h;

    /* renamed from: i */
    public long f15399i = 0;

    /* renamed from: j */
    public BufferedWriter f15400j;

    /* renamed from: k */
    public final LinkedHashMap<String, C6949d> f15401k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l */
    public int f15402l;

    /* renamed from: m */
    public long f15403m = 0;

    /* renamed from: n */
    public final ThreadPoolExecutor f15404n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C6947b());

    /* renamed from: o */
    public final C6946a f15405o = new C6946a();

    /* renamed from: h4.a$a */
    public class C6946a implements Callable<Void> {
        public C6946a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object call() throws java.lang.Exception {
            /*
                r3 = this;
                h4.a r0 = p126h4.C6945a.this
                monitor-enter(r0)
                h4.a r1 = p126h4.C6945a.this     // Catch:{ all -> 0x0023 }
                java.io.BufferedWriter r2 = r1.f15400j     // Catch:{ all -> 0x0023 }
                if (r2 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                goto L_0x0021
            L_0x000b:
                r1.mo19106u()     // Catch:{ all -> 0x0023 }
                h4.a r1 = p126h4.C6945a.this     // Catch:{ all -> 0x0023 }
                boolean r1 = r1.mo19101h()     // Catch:{ all -> 0x0023 }
                if (r1 == 0) goto L_0x0020
                h4.a r1 = p126h4.C6945a.this     // Catch:{ all -> 0x0023 }
                r1.mo19105r()     // Catch:{ all -> 0x0023 }
                h4.a r1 = p126h4.C6945a.this     // Catch:{ all -> 0x0023 }
                r2 = 0
                r1.f15402l = r2     // Catch:{ all -> 0x0023 }
            L_0x0020:
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            L_0x0021:
                r0 = 0
                return r0
            L_0x0023:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p126h4.C6945a.C6946a.call():java.lang.Object");
        }
    }

    /* renamed from: h4.a$b */
    public static final class C6947b implements ThreadFactory {
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: h4.a$c */
    public final class C6948c {

        /* renamed from: a */
        public final C6949d f15407a;

        /* renamed from: b */
        public final boolean[] f15408b;

        /* renamed from: c */
        public boolean f15409c;

        public C6948c(C6949d dVar) {
            this.f15407a = dVar;
            this.f15408b = dVar.f15415e ? null : new boolean[C6945a.this.f15398h];
        }

        /* renamed from: a */
        public final void mo19109a() throws IOException {
            C6945a.m13471a(C6945a.this, this, false);
        }

        /* renamed from: b */
        public final File mo19110b() throws IOException {
            File file;
            synchronized (C6945a.this) {
                C6949d dVar = this.f15407a;
                if (dVar.f15416f == this) {
                    if (!dVar.f15415e) {
                        this.f15408b[0] = true;
                    }
                    file = dVar.f15414d[0];
                    C6945a.this.f15392b.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    /* renamed from: h4.a$d */
    public final class C6949d {

        /* renamed from: a */
        public final String f15411a;

        /* renamed from: b */
        public final long[] f15412b;

        /* renamed from: c */
        public File[] f15413c;

        /* renamed from: d */
        public File[] f15414d;

        /* renamed from: e */
        public boolean f15415e;

        /* renamed from: f */
        public C6948c f15416f;

        public C6949d(String str) {
            this.f15411a = str;
            int i = C6945a.this.f15398h;
            this.f15412b = new long[i];
            this.f15413c = new File[i];
            this.f15414d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
            int length = sb.length();
            for (int i2 = 0; i2 < C6945a.this.f15398h; i2++) {
                sb.append(i2);
                this.f15413c[i2] = new File(C6945a.this.f15392b, sb.toString());
                sb.append(".tmp");
                this.f15414d[i2] = new File(C6945a.this.f15392b, sb.toString());
                sb.setLength(length);
            }
        }

        /* renamed from: a */
        public final String mo19111a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f15412b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }
    }

    /* renamed from: h4.a$e */
    public final class C6950e {

        /* renamed from: a */
        public final File[] f15418a;

        public C6950e(File[] fileArr) {
            this.f15418a = fileArr;
        }
    }

    public C6945a(File file, long j) {
        File file2 = file;
        this.f15392b = file2;
        this.f15396f = 1;
        this.f15393c = new File(file2, "journal");
        this.f15394d = new File(file2, "journal.tmp");
        this.f15395e = new File(file2, "journal.bkp");
        this.f15398h = 1;
        this.f15397g = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13471a(p126h4.C6945a r9, p126h4.C6945a.C6948c r10, boolean r11) throws java.io.IOException {
        /*
            monitor-enter(r9)
            h4.a$d r0 = r10.f15407a     // Catch:{ all -> 0x00f9 }
            h4.a$c r1 = r0.f15416f     // Catch:{ all -> 0x00f9 }
            if (r1 != r10) goto L_0x00f3
            r1 = 0
            if (r11 == 0) goto L_0x0046
            boolean r2 = r0.f15415e     // Catch:{ all -> 0x00f9 }
            if (r2 != 0) goto L_0x0046
            r2 = r1
        L_0x000f:
            int r3 = r9.f15398h     // Catch:{ all -> 0x00f9 }
            if (r2 >= r3) goto L_0x0046
            boolean[] r3 = r10.f15408b     // Catch:{ all -> 0x00f9 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f9 }
            if (r3 == 0) goto L_0x002c
            java.io.File[] r3 = r0.f15414d     // Catch:{ all -> 0x00f9 }
            r3 = r3[r2]     // Catch:{ all -> 0x00f9 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00f9 }
            if (r3 != 0) goto L_0x0029
            r10.mo19109a()     // Catch:{ all -> 0x00f9 }
            monitor-exit(r9)
            goto L_0x00f2
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002c:
            r10.mo19109a()     // Catch:{ all -> 0x00f9 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f9 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            r11.<init>()     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00f9 }
            r11.append(r2)     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f9 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f9 }
            throw r10     // Catch:{ all -> 0x00f9 }
        L_0x0046:
            int r10 = r9.f15398h     // Catch:{ all -> 0x00f9 }
            if (r1 >= r10) goto L_0x0076
            java.io.File[] r10 = r0.f15414d     // Catch:{ all -> 0x00f9 }
            r10 = r10[r1]     // Catch:{ all -> 0x00f9 }
            if (r11 == 0) goto L_0x0070
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00f9 }
            if (r2 == 0) goto L_0x0073
            java.io.File[] r2 = r0.f15413c     // Catch:{ all -> 0x00f9 }
            r2 = r2[r1]     // Catch:{ all -> 0x00f9 }
            r10.renameTo(r2)     // Catch:{ all -> 0x00f9 }
            long[] r10 = r0.f15412b     // Catch:{ all -> 0x00f9 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f9 }
            long r5 = r2.length()     // Catch:{ all -> 0x00f9 }
            long[] r10 = r0.f15412b     // Catch:{ all -> 0x00f9 }
            r10[r1] = r5     // Catch:{ all -> 0x00f9 }
            long r7 = r9.f15399i     // Catch:{ all -> 0x00f9 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f15399i = r7     // Catch:{ all -> 0x00f9 }
            goto L_0x0073
        L_0x0070:
            m13473d(r10)     // Catch:{ all -> 0x00f9 }
        L_0x0073:
            int r1 = r1 + 1
            goto L_0x0046
        L_0x0076:
            int r10 = r9.f15402l     // Catch:{ all -> 0x00f9 }
            r1 = 1
            int r10 = r10 + r1
            r9.f15402l = r10     // Catch:{ all -> 0x00f9 }
            r10 = 0
            r0.f15416f = r10     // Catch:{ all -> 0x00f9 }
            boolean r10 = r0.f15415e     // Catch:{ all -> 0x00f9 }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00b8
            r0.f15415e = r1     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f15400j     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f15400j     // Catch:{ all -> 0x00f9 }
            r10.append(r3)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f15400j     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = r0.f15411a     // Catch:{ all -> 0x00f9 }
            r10.append(r1)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f15400j     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = r0.mo19111a()     // Catch:{ all -> 0x00f9 }
            r10.append(r1)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f15400j     // Catch:{ all -> 0x00f9 }
            r10.append(r2)     // Catch:{ all -> 0x00f9 }
            if (r11 == 0) goto L_0x00d7
            long r10 = r9.f15403m     // Catch:{ all -> 0x00f9 }
            r1 = 1
            long r10 = r10 + r1
            r9.f15403m = r10     // Catch:{ all -> 0x00f9 }
            r0.getClass()     // Catch:{ all -> 0x00f9 }
            goto L_0x00d7
        L_0x00b8:
            java.util.LinkedHashMap<java.lang.String, h4.a$d> r10 = r9.f15401k     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r0.f15411a     // Catch:{ all -> 0x00f9 }
            r10.remove(r11)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f15400j     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f15400j     // Catch:{ all -> 0x00f9 }
            r10.append(r3)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f15400j     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r0.f15411a     // Catch:{ all -> 0x00f9 }
            r10.append(r11)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f15400j     // Catch:{ all -> 0x00f9 }
            r10.append(r2)     // Catch:{ all -> 0x00f9 }
        L_0x00d7:
            java.io.BufferedWriter r10 = r9.f15400j     // Catch:{ all -> 0x00f9 }
            m13474f(r10)     // Catch:{ all -> 0x00f9 }
            long r10 = r9.f15399i     // Catch:{ all -> 0x00f9 }
            long r0 = r9.f15397g     // Catch:{ all -> 0x00f9 }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00ea
            boolean r10 = r9.mo19101h()     // Catch:{ all -> 0x00f9 }
            if (r10 == 0) goto L_0x00f1
        L_0x00ea:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f15404n     // Catch:{ all -> 0x00f9 }
            h4.a$a r11 = r9.f15405o     // Catch:{ all -> 0x00f9 }
            r10.submit(r11)     // Catch:{ all -> 0x00f9 }
        L_0x00f1:
            monitor-exit(r9)
        L_0x00f2:
            return
        L_0x00f3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f9 }
            r10.<init>()     // Catch:{ all -> 0x00f9 }
            throw r10     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p126h4.C6945a.m13471a(h4.a, h4.a$c, boolean):void");
    }

    @TargetApi(26)
    /* renamed from: b */
    public static void m13472b(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: d */
    public static void m13473d(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    /* renamed from: f */
    public static void m13474f(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: i */
    public static C6945a m13475i(File file, long j) throws IOException {
        if (j > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m13476t(file2, file3, false);
                }
            }
            C6945a aVar = new C6945a(file, j);
            if (aVar.f15393c.exists()) {
                try {
                    aVar.mo19103k();
                    aVar.mo19102j();
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    aVar.close();
                    C6953c.m13489a(aVar.f15392b);
                }
            }
            file.mkdirs();
            C6945a aVar2 = new C6945a(file, j);
            aVar2.mo19105r();
            return aVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: t */
    public static void m13476t(File file, File file2, boolean z) throws IOException {
        if (z) {
            m13473d(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final synchronized void close() throws IOException {
        if (this.f15400j != null) {
            Iterator it = new ArrayList(this.f15401k.values()).iterator();
            while (it.hasNext()) {
                C6948c cVar = ((C6949d) it.next()).f15416f;
                if (cVar != null) {
                    cVar.mo19109a();
                }
            }
            mo19106u();
            m13472b(this.f15400j);
            this.f15400j = null;
        }
    }

    /* renamed from: e */
    public final C6948c mo19099e(String str) throws IOException {
        C6948c cVar;
        synchronized (this) {
            if (this.f15400j != null) {
                C6949d dVar = this.f15401k.get(str);
                cVar = null;
                if (dVar == null) {
                    dVar = new C6949d(str);
                    this.f15401k.put(str, dVar);
                } else if (dVar.f15416f != null) {
                }
                cVar = new C6948c(dVar);
                dVar.f15416f = cVar;
                this.f15400j.append("DIRTY");
                this.f15400j.append(' ');
                this.f15400j.append(str);
                this.f15400j.append(10);
                m13474f(this.f15400j);
            } else {
                throw new IllegalStateException("cache is closed");
            }
        }
        return cVar;
    }

    /* renamed from: g */
    public final synchronized C6950e mo19100g(String str) throws IOException {
        if (this.f15400j != null) {
            C6949d dVar = this.f15401k.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.f15415e) {
                return null;
            }
            for (File exists : dVar.f15413c) {
                if (!exists.exists()) {
                    return null;
                }
            }
            this.f15402l++;
            this.f15400j.append("READ");
            this.f15400j.append(' ');
            this.f15400j.append(str);
            this.f15400j.append(10);
            if (mo19101h()) {
                this.f15404n.submit(this.f15405o);
            }
            return new C6950e(dVar.f15413c);
        }
        throw new IllegalStateException("cache is closed");
    }

    /* renamed from: h */
    public final boolean mo19101h() {
        int i = this.f15402l;
        return i >= 2000 && i >= this.f15401k.size();
    }

    /* renamed from: j */
    public final void mo19102j() throws IOException {
        m13473d(this.f15394d);
        Iterator<C6949d> it = this.f15401k.values().iterator();
        while (it.hasNext()) {
            C6949d next = it.next();
            int i = 0;
            if (next.f15416f == null) {
                while (i < this.f15398h) {
                    this.f15399i += next.f15412b[i];
                    i++;
                }
            } else {
                next.f15416f = null;
                while (i < this.f15398h) {
                    m13473d(next.f15413c[i]);
                    m13473d(next.f15414d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|(1:19)|(1:21)(1:22)|23|24|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f15402l = r2 - r9.f15401k.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r1.f15423f == -1) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r0 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        mo19105r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r9.f15400j = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f15393c, true), p126h4.C6953c.f15425a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0060 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0060=Splitter:B:16:0x0060, B:29:0x0093=Splitter:B:29:0x0093} */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19103k() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            h4.b r1 = new h4.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f15393c
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p126h4.C6953c.f15425a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo19112a()     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = r1.mo19112a()     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = r1.mo19112a()     // Catch:{ all -> 0x0091 }
            java.lang.String r5 = r1.mo19112a()     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = r1.mo19112a()     // Catch:{ all -> 0x0091 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x0091 }
            if (r7 == 0) goto L_0x0093
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x0091 }
            if (r7 == 0) goto L_0x0093
            int r7 = r9.f15396f     // Catch:{ all -> 0x0091 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0091 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0093
            int r4 = r9.f15398h     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x0091 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0093
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0093
            r0 = 0
            r2 = r0
        L_0x0056:
            java.lang.String r3 = r1.mo19112a()     // Catch:{ EOFException -> 0x0060 }
            r9.mo19104n(r3)     // Catch:{ EOFException -> 0x0060 }
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0060:
            java.util.LinkedHashMap<java.lang.String, h4.a$d> r3 = r9.f15401k     // Catch:{ all -> 0x0091 }
            int r3 = r3.size()     // Catch:{ all -> 0x0091 }
            int r2 = r2 - r3
            r9.f15402l = r2     // Catch:{ all -> 0x0091 }
            int r2 = r1.f15423f     // Catch:{ all -> 0x0091 }
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0070
            r0 = r4
        L_0x0070:
            if (r0 == 0) goto L_0x0076
            r9.mo19105r()     // Catch:{ all -> 0x0091 }
            goto L_0x008b
        L_0x0076:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0091 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0091 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0091 }
            java.io.File r5 = r9.f15393c     // Catch:{ all -> 0x0091 }
            r3.<init>(r5, r4)     // Catch:{ all -> 0x0091 }
            java.nio.charset.Charset r4 = p126h4.C6953c.f15425a     // Catch:{ all -> 0x0091 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0091 }
            r0.<init>(r2)     // Catch:{ all -> 0x0091 }
            r9.f15400j = r0     // Catch:{ all -> 0x0091 }
        L_0x008b:
            r1.close()     // Catch:{ RuntimeException -> 0x008f, Exception -> 0x008e }
        L_0x008e:
            return
        L_0x008f:
            r0 = move-exception
            throw r0
        L_0x0091:
            r0 = move-exception
            goto L_0x00c1
        L_0x0093:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0091 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r7.<init>()     // Catch:{ all -> 0x0091 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x0091 }
            r7.append(r2)     // Catch:{ all -> 0x0091 }
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            r7.append(r3)     // Catch:{ all -> 0x0091 }
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            r7.append(r5)     // Catch:{ all -> 0x0091 }
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            r7.append(r6)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0091 }
            r4.<init>(r0)     // Catch:{ all -> 0x0091 }
            throw r4     // Catch:{ all -> 0x0091 }
        L_0x00c1:
            r1.close()     // Catch:{ RuntimeException -> 0x00c5, Exception -> 0x00c4 }
        L_0x00c4:
            throw r0
        L_0x00c5:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p126h4.C6945a.mo19103k():void");
    }

    /* renamed from: n */
    public final void mo19104n(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f15401k.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C6949d dVar = this.f15401k.get(str2);
            if (dVar == null) {
                dVar = new C6949d(str2);
                this.f15401k.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f15415e = true;
                dVar.f15416f = null;
                if (split.length == C6945a.this.f15398h) {
                    int i2 = 0;
                    while (i2 < split.length) {
                        try {
                            dVar.f15412b[i2] = Long.parseLong(split[i2]);
                            i2++;
                        } catch (NumberFormatException unused) {
                            StringBuilder h = C0072d.m201h("unexpected journal line: ");
                            h.append(Arrays.toString(split));
                            throw new IOException(h.toString());
                        }
                    }
                    return;
                }
                StringBuilder h2 = C0072d.m201h("unexpected journal line: ");
                h2.append(Arrays.toString(split));
                throw new IOException(h2.toString());
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f15416f = new C6948c(dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(C0326j.m864i("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(C0326j.m864i("unexpected journal line: ", str));
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: r */
    public final synchronized void mo19105r() throws IOException {
        BufferedWriter bufferedWriter = this.f15400j;
        if (bufferedWriter != null) {
            m13472b(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f15394d), C6953c.f15425a));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f15396f));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f15398h));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (C6949d next : this.f15401k.values()) {
                if (next.f15416f != null) {
                    bufferedWriter2.write("DIRTY " + next.f15411a + 10);
                } else {
                    bufferedWriter2.write("CLEAN " + next.f15411a + next.mo19111a() + 10);
                }
            }
            m13472b(bufferedWriter2);
            if (this.f15393c.exists()) {
                m13476t(this.f15393c, this.f15395e, true);
            }
            m13476t(this.f15394d, this.f15393c, false);
            this.f15395e.delete();
            this.f15400j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f15393c, true), C6953c.f15425a));
        } catch (Throwable th) {
            m13472b(bufferedWriter2);
            throw th;
        }
    }

    /* renamed from: u */
    public final void mo19106u() throws IOException {
        while (this.f15399i > this.f15397g) {
            String str = (String) this.f15401k.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.f15400j != null) {
                    C6949d dVar = this.f15401k.get(str);
                    if (dVar != null) {
                        if (dVar.f15416f == null) {
                            for (int i = 0; i < this.f15398h; i++) {
                                File file = dVar.f15413c[i];
                                if (file.exists()) {
                                    if (!file.delete()) {
                                        throw new IOException("failed to delete " + file);
                                    }
                                }
                                long j = this.f15399i;
                                long[] jArr = dVar.f15412b;
                                this.f15399i = j - jArr[i];
                                jArr[i] = 0;
                            }
                            this.f15402l++;
                            this.f15400j.append("REMOVE");
                            this.f15400j.append(' ');
                            this.f15400j.append(str);
                            this.f15400j.append(10);
                            this.f15401k.remove(str);
                            if (mo19101h()) {
                                this.f15404n.submit(this.f15405o);
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }
}
