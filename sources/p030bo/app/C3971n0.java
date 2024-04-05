package p030bo.app;

import androidx.appcompat.widget.C0326j;
import com.braze.support.BrazeLogger;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p010a9.C0048b;

/* renamed from: bo.app.n0 */
public final class C3971n0 {

    /* renamed from: o */
    public static final Pattern f8912o = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: p */
    private static final String f8913p = BrazeLogger.m11287i(C3971n0.class);
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final OutputStream f8914q = new C3973b();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final File f8915a;

    /* renamed from: b */
    private final File f8916b;

    /* renamed from: c */
    private final File f8917c;

    /* renamed from: d */
    private final File f8918d;

    /* renamed from: e */
    private final int f8919e;

    /* renamed from: f */
    private long f8920f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final int f8921g;

    /* renamed from: h */
    private long f8922h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Writer f8923i;

    /* renamed from: j */
    private final LinkedHashMap<String, C4207t0> f8924j = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f8925k;

    /* renamed from: l */
    private long f8926l = 0;

    /* renamed from: m */
    public final ThreadPoolExecutor f8927m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: n */
    private final Callable<Void> f8928n = new C3972a();

    /* renamed from: bo.app.n0$a */
    public class C3972a implements Callable<Void> {
        public C3972a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r4 = this;
                bo.app.n0 r0 = p030bo.app.C3971n0.this
                monitor-enter(r0)
                bo.app.n0 r1 = p030bo.app.C3971n0.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f8923i     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                bo.app.n0 r1 = p030bo.app.C3971n0.this     // Catch:{ all -> 0x0028 }
                r1.m9181i()     // Catch:{ all -> 0x0028 }
                bo.app.n0 r1 = p030bo.app.C3971n0.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.m9175e()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                bo.app.n0 r1 = p030bo.app.C3971n0.this     // Catch:{ all -> 0x0028 }
                r1.m9180h()     // Catch:{ all -> 0x0028 }
                bo.app.n0 r1 = p030bo.app.C3971n0.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.f8925k = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3971n0.C3972a.call():java.lang.Void");
        }
    }

    /* renamed from: bo.app.n0$b */
    public class C3973b extends OutputStream {
        public void write(int i) {
        }
    }

    /* renamed from: bo.app.n0$c */
    public final class C3974c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C4207t0 f8930a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean[] f8931b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f8932c;

        /* renamed from: d */
        private boolean f8933d;

        /* renamed from: bo.app.n0$c$a */
        public class C3975a extends FilterOutputStream {
            public /* synthetic */ C3975a(C3974c cVar, OutputStream outputStream, C3972a aVar) {
                this(outputStream);
            }

            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    boolean unused2 = C3974c.this.f8932c = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    boolean unused2 = C3974c.this.f8932c = true;
                }
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    boolean unused2 = C3974c.this.f8932c = true;
                }
            }

            private C3975a(OutputStream outputStream) {
                super(outputStream);
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    boolean unused2 = C3974c.this.f8932c = true;
                }
            }
        }

        public /* synthetic */ C3974c(C3971n0 n0Var, C4207t0 t0Var, C3972a aVar) {
            this(t0Var);
        }

        private C3974c(C4207t0 t0Var) {
            this.f8930a = t0Var;
            this.f8931b = t0Var.f9338c ? null : new boolean[C3971n0.this.f8921g];
        }

        /* renamed from: b */
        public void mo13740b() {
            if (this.f8932c) {
                C3971n0.this.m9165a(this, false);
                C3971n0.this.mo13734d(this.f8930a.f9336a);
            } else {
                C3971n0.this.m9165a(this, true);
            }
            this.f8933d = true;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0026 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.OutputStream mo13738a(int r5) {
            /*
                r4 = this;
                if (r5 < 0) goto L_0x004b
                bo.app.n0 r0 = p030bo.app.C3971n0.this
                int r0 = r0.f8921g
                if (r5 >= r0) goto L_0x004b
                bo.app.n0 r0 = p030bo.app.C3971n0.this
                monitor-enter(r0)
                bo.app.t0 r1 = r4.f8930a     // Catch:{ all -> 0x0048 }
                bo.app.n0$c r2 = r1.f9339d     // Catch:{ all -> 0x0048 }
                if (r2 != r4) goto L_0x0042
                boolean r2 = r1.f9338c     // Catch:{ all -> 0x0048 }
                if (r2 != 0) goto L_0x001c
                boolean[] r2 = r4.f8931b     // Catch:{ all -> 0x0048 }
                r3 = 1
                r2[r5] = r3     // Catch:{ all -> 0x0048 }
            L_0x001c:
                java.io.File r5 = r1.mo14104b((int) r5)     // Catch:{ all -> 0x0048 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0026 }
                r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0026 }
                goto L_0x0034
            L_0x0026:
                bo.app.n0 r1 = p030bo.app.C3971n0.this     // Catch:{ all -> 0x0048 }
                java.io.File r1 = r1.f8915a     // Catch:{ all -> 0x0048 }
                r1.mkdirs()     // Catch:{ all -> 0x0048 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x003c }
                r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x003c }
            L_0x0034:
                bo.app.n0$c$a r5 = new bo.app.n0$c$a     // Catch:{ all -> 0x0048 }
                r2 = 0
                r5.<init>(r4, r1, r2)     // Catch:{ all -> 0x0048 }
                monitor-exit(r0)     // Catch:{ all -> 0x0048 }
                return r5
            L_0x003c:
                java.io.OutputStream r5 = p030bo.app.C3971n0.f8914q     // Catch:{ all -> 0x0048 }
                monitor-exit(r0)     // Catch:{ all -> 0x0048 }
                return r5
            L_0x0042:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0048 }
                r5.<init>()     // Catch:{ all -> 0x0048 }
                throw r5     // Catch:{ all -> 0x0048 }
            L_0x0048:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0048 }
                throw r5
            L_0x004b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expected index "
                java.lang.String r2 = " to be greater than 0 and less than the maximum value count of "
                java.lang.StringBuilder r5 = android.support.p013v4.media.C0069a.m177h(r1, r5, r2)
                bo.app.n0 r1 = p030bo.app.C3971n0.this
                int r1 = r1.f8921g
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3971n0.C3974c.mo13738a(int):java.io.OutputStream");
        }

        /* renamed from: a */
        public void mo13739a() {
            C3971n0.this.m9165a(this, false);
        }
    }

    /* renamed from: bo.app.n0$d */
    public final class C3976d implements Closeable {

        /* renamed from: b */
        private final String f8936b;

        /* renamed from: c */
        private final long f8937c;

        /* renamed from: d */
        private final InputStream[] f8938d;

        /* renamed from: e */
        private final long[] f8939e;

        public /* synthetic */ C3976d(C3971n0 n0Var, String str, long j, InputStream[] inputStreamArr, long[] jArr, C3972a aVar) {
            this(str, j, inputStreamArr, jArr);
        }

        /* renamed from: a */
        public InputStream mo13745a(int i) {
            return this.f8938d[i];
        }

        public void close() {
            for (InputStream a : this.f8938d) {
                C4187s6.m9610a((Closeable) a);
            }
        }

        private C3976d(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f8936b = str;
            this.f8937c = j;
            this.f8938d = inputStreamArr;
            this.f8939e = jArr;
        }
    }

    private C3971n0(File file, int i, int i2, long j) {
        File file2 = file;
        this.f8915a = file2;
        this.f8919e = i;
        this.f8916b = new File(file2, "journal");
        this.f8917c = new File(file2, "journal.tmp");
        this.f8918d = new File(file2, "journal.bkp");
        this.f8921g = i2;
        this.f8920f = j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f8925k = r0 - r9.f8924j.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo13818b() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        m9180h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f8923i = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f8916b, true), p030bo.app.C4187s6.f9298a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9179g() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            bo.app.o5 r1 = new bo.app.o5
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f8916b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p030bo.app.C4187s6.f9298a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo13819c()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo13819c()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo13819c()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo13819c()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo13819c()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f8919e     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f8921g     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo13819c()     // Catch:{ EOFException -> 0x005f }
            r9.m9172c((java.lang.String) r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, bo.app.t0> r2 = r9.f8924j     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f8925k = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo13818b()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.m9180h()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f8916b     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = p030bo.app.C4187s6.f9298a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f8923i = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            p030bo.app.C4187s6.m9610a((java.io.Closeable) r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            p030bo.app.C4187s6.m9610a((java.io.Closeable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3971n0.m9179g():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public synchronized void m9180h() {
        Writer writer = this.f8923i;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8917c), C4187s6.f9298a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f8919e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f8921g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C4207t0 next : this.f8924j.values()) {
                if (next.f9339d != null) {
                    bufferedWriter.write("DIRTY " + next.f9336a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f9336a + next.mo14103a() + 10);
                }
            }
            bufferedWriter.close();
            if (this.f8916b.exists()) {
                m9168a(this.f8916b, this.f8918d, true);
            }
            m9168a(this.f8917c, this.f8916b, false);
            this.f8918d.delete();
            this.f8923i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8916b, true), C4187s6.f9298a));
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return;
        throw th;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m9181i() {
        while (this.f8922h > this.f8920f) {
            mo13734d((String) this.f8924j.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: c */
    private void m9172c(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f8924j.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C4207t0 t0Var = this.f8924j.get(str2);
            if (t0Var == null) {
                t0Var = new C4207t0(str2, this.f8921g, this.f8915a);
                this.f8924j.put(str2, t0Var);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                t0Var.f9338c = true;
                t0Var.f9339d = null;
                t0Var.mo14105b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                t0Var.f9339d = new C3974c(this, t0Var, (C3972a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(C0326j.m864i("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(C0326j.m864i("unexpected journal line: ", str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m9175e() {
        int i = this.f8925k;
        return i >= 2000 && i >= this.f8924j.size();
    }

    /* renamed from: f */
    private void m9177f() {
        m9167a(this.f8917c);
        Iterator<C4207t0> it = this.f8924j.values().iterator();
        while (it.hasNext()) {
            C4207t0 next = it.next();
            int i = 0;
            if (next.f9339d == null) {
                while (i < this.f8921g) {
                    this.f8922h += next.f9337b[i];
                    i++;
                }
            } else {
                next.f9339d = null;
                while (i < this.f8921g) {
                    m9167a(next.mo14101a(i));
                    m9167a(next.mo14104b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r11.f8925k++;
        r11.f8923i.append("READ " + r12 + 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (m9175e() == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r11.f8927m.submit(r11.f8928n);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        return new p030bo.app.C3971n0.C3976d(r11, r12, r0.f9340e, r8, r0.f9337b, (p030bo.app.C3971n0.C3972a) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007e, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0077  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p030bo.app.C3971n0.C3976d mo13731b(java.lang.String r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r11.m9169b()     // Catch:{ all -> 0x007f }
            r11.m9174e((java.lang.String) r12)     // Catch:{ all -> 0x007f }
            java.util.LinkedHashMap<java.lang.String, bo.app.t0> r0 = r11.f8924j     // Catch:{ all -> 0x007f }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x007f }
            bo.app.t0 r0 = (p030bo.app.C4207t0) r0     // Catch:{ all -> 0x007f }
            r1 = 0
            if (r0 != 0) goto L_0x0014
            monitor-exit(r11)
            return r1
        L_0x0014:
            boolean r2 = r0.f9338c     // Catch:{ all -> 0x007f }
            if (r2 != 0) goto L_0x001a
            monitor-exit(r11)
            return r1
        L_0x001a:
            int r2 = r11.f8921g     // Catch:{ all -> 0x007f }
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch:{ all -> 0x007f }
            r2 = 0
            r3 = r2
        L_0x0020:
            int r4 = r11.f8921g     // Catch:{ FileNotFoundException -> 0x006f }
            if (r3 >= r4) goto L_0x0032
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x006f }
            java.io.File r5 = r0.mo14101a((int) r3)     // Catch:{ FileNotFoundException -> 0x006f }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x006f }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x006f }
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0032:
            int r1 = r11.f8925k     // Catch:{ all -> 0x007f }
            int r1 = r1 + 1
            r11.f8925k = r1     // Catch:{ all -> 0x007f }
            java.io.Writer r1 = r11.f8923i     // Catch:{ all -> 0x007f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            r2.<init>()     // Catch:{ all -> 0x007f }
            java.lang.String r3 = "READ "
            r2.append(r3)     // Catch:{ all -> 0x007f }
            r2.append(r12)     // Catch:{ all -> 0x007f }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x007f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x007f }
            r1.append(r2)     // Catch:{ all -> 0x007f }
            boolean r1 = r11.m9175e()     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x0060
            java.util.concurrent.ThreadPoolExecutor r1 = r11.f8927m     // Catch:{ all -> 0x007f }
            java.util.concurrent.Callable<java.lang.Void> r2 = r11.f8928n     // Catch:{ all -> 0x007f }
            r1.submit(r2)     // Catch:{ all -> 0x007f }
        L_0x0060:
            bo.app.n0$d r1 = new bo.app.n0$d     // Catch:{ all -> 0x007f }
            long r6 = r0.f9340e     // Catch:{ all -> 0x007f }
            long[] r9 = r0.f9337b     // Catch:{ all -> 0x007f }
            r10 = 0
            r3 = r1
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r8, r9, r10)     // Catch:{ all -> 0x007f }
            monitor-exit(r11)
            return r1
        L_0x006f:
            int r12 = r11.f8921g     // Catch:{ all -> 0x007f }
            if (r2 >= r12) goto L_0x007d
            r12 = r8[r2]     // Catch:{ all -> 0x007f }
            if (r12 == 0) goto L_0x007d
            p030bo.app.C4187s6.m9610a((java.io.Closeable) r12)     // Catch:{ all -> 0x007f }
            int r2 = r2 + 1
            goto L_0x006f
        L_0x007d:
            monitor-exit(r11)
            return r1
        L_0x007f:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3971n0.mo13731b(java.lang.String):bo.app.n0$d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo13734d(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m9169b()     // Catch:{ all -> 0x008a }
            r7.m9174e((java.lang.String) r8)     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap<java.lang.String, bo.app.t0> r0 = r7.f8924j     // Catch:{ all -> 0x008a }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008a }
            bo.app.t0 r0 = (p030bo.app.C4207t0) r0     // Catch:{ all -> 0x008a }
            r1 = 0
            if (r0 == 0) goto L_0x0088
            bo.app.n0$c r2 = r0.f9339d     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x0017
            goto L_0x0088
        L_0x0017:
            int r2 = r7.f8921g     // Catch:{ all -> 0x008a }
            if (r1 >= r2) goto L_0x0053
            java.io.File r2 = r0.mo14101a((int) r1)     // Catch:{ all -> 0x008a }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r0.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008a }
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008a }
            r8.<init>(r0)     // Catch:{ all -> 0x008a }
            throw r8     // Catch:{ all -> 0x008a }
        L_0x0043:
            long r2 = r7.f8922h     // Catch:{ all -> 0x008a }
            long[] r4 = r0.f9337b     // Catch:{ all -> 0x008a }
            r5 = r4[r1]     // Catch:{ all -> 0x008a }
            long r2 = r2 - r5
            r7.f8922h = r2     // Catch:{ all -> 0x008a }
            r2 = 0
            r4[r1] = r2     // Catch:{ all -> 0x008a }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0053:
            int r0 = r7.f8925k     // Catch:{ all -> 0x008a }
            r1 = 1
            int r0 = r0 + r1
            r7.f8925k = r0     // Catch:{ all -> 0x008a }
            java.io.Writer r0 = r7.f8923i     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r2.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r3 = "REMOVE "
            r2.append(r3)     // Catch:{ all -> 0x008a }
            r2.append(r8)     // Catch:{ all -> 0x008a }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008a }
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap<java.lang.String, bo.app.t0> r0 = r7.f8924j     // Catch:{ all -> 0x008a }
            r0.remove(r8)     // Catch:{ all -> 0x008a }
            boolean r8 = r7.m9175e()     // Catch:{ all -> 0x008a }
            if (r8 == 0) goto L_0x0086
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f8927m     // Catch:{ all -> 0x008a }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f8928n     // Catch:{ all -> 0x008a }
            r8.submit(r0)     // Catch:{ all -> 0x008a }
        L_0x0086:
            monitor-exit(r7)
            return r1
        L_0x0088:
            monitor-exit(r7)
            return r1
        L_0x008a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3971n0.mo13734d(java.lang.String):boolean");
    }

    /* renamed from: e */
    private void m9174e(String str) {
        if (!f8912o.matcher(str).matches()) {
            throw new IllegalArgumentException(C0048b.m163a("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    /* renamed from: a */
    public static C3971n0 m9162a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m9168a(file2, file3, false);
                }
            }
            C3971n0 n0Var = new C3971n0(file, i, i2, j);
            if (n0Var.f8916b.exists()) {
                try {
                    n0Var.m9179g();
                    n0Var.m9177f();
                    return n0Var;
                } catch (IOException e) {
                    String str = f8913p;
                    BrazeLogger.m11292n(str, "DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    n0Var.mo13733d();
                }
            }
            file.mkdirs();
            C3971n0 n0Var2 = new C3971n0(file, i, i2, j);
            n0Var2.m9180h();
            return n0Var2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: b */
    private void m9169b() {
        if (this.f8923i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: d */
    public void mo13733d() {
        mo13732c();
        C4187s6.m9611a(this.f8915a);
    }

    /* renamed from: a */
    private static void m9167a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m9168a(File file, File file2, boolean z) {
        if (z) {
            m9167a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public C3974c mo13730a(String str) {
        return m9161a(str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized p030bo.app.C3971n0.C3974c m9161a(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m9169b()     // Catch:{ all -> 0x0060 }
            r5.m9174e((java.lang.String) r6)     // Catch:{ all -> 0x0060 }
            java.util.LinkedHashMap<java.lang.String, bo.app.t0> r0 = r5.f8924j     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0060 }
            bo.app.t0 r0 = (p030bo.app.C4207t0) r0     // Catch:{ all -> 0x0060 }
            r1 = -1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x0020
            if (r0 == 0) goto L_0x001e
            long r3 = r0.f9340e     // Catch:{ all -> 0x0060 }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0020
        L_0x001e:
            monitor-exit(r5)
            return r2
        L_0x0020:
            if (r0 != 0) goto L_0x0031
            bo.app.t0 r0 = new bo.app.t0     // Catch:{ all -> 0x0060 }
            int r7 = r5.f8921g     // Catch:{ all -> 0x0060 }
            java.io.File r8 = r5.f8915a     // Catch:{ all -> 0x0060 }
            r0.<init>(r6, r7, r8)     // Catch:{ all -> 0x0060 }
            java.util.LinkedHashMap<java.lang.String, bo.app.t0> r7 = r5.f8924j     // Catch:{ all -> 0x0060 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0060 }
            goto L_0x0037
        L_0x0031:
            bo.app.n0$c r7 = r0.f9339d     // Catch:{ all -> 0x0060 }
            if (r7 == 0) goto L_0x0037
            monitor-exit(r5)
            return r2
        L_0x0037:
            bo.app.n0$c r7 = new bo.app.n0$c     // Catch:{ all -> 0x0060 }
            r7.<init>(r5, r0, r2)     // Catch:{ all -> 0x0060 }
            r0.f9339d = r7     // Catch:{ all -> 0x0060 }
            java.io.Writer r8 = r5.f8923i     // Catch:{ all -> 0x0060 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r0.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = "DIRTY "
            r0.append(r1)     // Catch:{ all -> 0x0060 }
            r0.append(r6)     // Catch:{ all -> 0x0060 }
            r6 = 10
            r0.append(r6)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0060 }
            r8.write(r6)     // Catch:{ all -> 0x0060 }
            java.io.Writer r6 = r5.f8923i     // Catch:{ all -> 0x0060 }
            r6.flush()     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return r7
        L_0x0060:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3971n0.m9161a(java.lang.String, long):bo.app.n0$c");
    }

    /* renamed from: c */
    public synchronized void mo13732c() {
        if (this.f8923i != null) {
            Iterator it = new ArrayList(this.f8924j.values()).iterator();
            while (it.hasNext()) {
                C3974c cVar = ((C4207t0) it.next()).f9339d;
                if (cVar != null) {
                    cVar.mo13739a();
                }
            }
            m9181i();
            this.f8923i.close();
            this.f8923i = null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f6, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m9165a(p030bo.app.C3971n0.C3974c r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            bo.app.t0 r0 = r10.f8930a     // Catch:{ all -> 0x00fd }
            bo.app.n0$c r1 = r0.f9339d     // Catch:{ all -> 0x00fd }
            if (r1 != r10) goto L_0x00f7
            r1 = 0
            if (r11 == 0) goto L_0x0049
            boolean r2 = r0.f9338c     // Catch:{ all -> 0x00fd }
            if (r2 != 0) goto L_0x0049
            r2 = r1
        L_0x0011:
            int r3 = r9.f8921g     // Catch:{ all -> 0x00fd }
            if (r2 >= r3) goto L_0x0049
            boolean[] r3 = r10.f8931b     // Catch:{ all -> 0x00fd }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fd }
            if (r3 == 0) goto L_0x002f
            java.io.File r3 = r0.mo14104b((int) r2)     // Catch:{ all -> 0x00fd }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00fd }
            if (r3 != 0) goto L_0x002c
            r10.mo13739a()     // Catch:{ all -> 0x00fd }
            monitor-exit(r9)
            return
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x002f:
            r10.mo13739a()     // Catch:{ all -> 0x00fd }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r11.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00fd }
            r11.append(r2)     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fd }
            r10.<init>(r11)     // Catch:{ all -> 0x00fd }
            throw r10     // Catch:{ all -> 0x00fd }
        L_0x0049:
            int r10 = r9.f8921g     // Catch:{ all -> 0x00fd }
            if (r1 >= r10) goto L_0x0079
            java.io.File r10 = r0.mo14104b((int) r1)     // Catch:{ all -> 0x00fd }
            if (r11 == 0) goto L_0x0073
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00fd }
            if (r2 == 0) goto L_0x0076
            java.io.File r2 = r0.mo14101a((int) r1)     // Catch:{ all -> 0x00fd }
            r10.renameTo(r2)     // Catch:{ all -> 0x00fd }
            long[] r10 = r0.f9337b     // Catch:{ all -> 0x00fd }
            r3 = r10[r1]     // Catch:{ all -> 0x00fd }
            long r5 = r2.length()     // Catch:{ all -> 0x00fd }
            long[] r10 = r0.f9337b     // Catch:{ all -> 0x00fd }
            r10[r1] = r5     // Catch:{ all -> 0x00fd }
            long r7 = r9.f8922h     // Catch:{ all -> 0x00fd }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f8922h = r7     // Catch:{ all -> 0x00fd }
            goto L_0x0076
        L_0x0073:
            m9167a((java.io.File) r10)     // Catch:{ all -> 0x00fd }
        L_0x0076:
            int r1 = r1 + 1
            goto L_0x0049
        L_0x0079:
            int r10 = r9.f8925k     // Catch:{ all -> 0x00fd }
            r1 = 1
            int r10 = r10 + r1
            r9.f8925k = r10     // Catch:{ all -> 0x00fd }
            r10 = 0
            r0.f9339d = r10     // Catch:{ all -> 0x00fd }
            boolean r10 = r0.f9338c     // Catch:{ all -> 0x00fd }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00b9
            r0.f9338c = r1     // Catch:{ all -> 0x00fd }
            java.io.Writer r10 = r9.f8923i     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r1.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r3 = "CLEAN "
            r1.append(r3)     // Catch:{ all -> 0x00fd }
            java.lang.String r3 = r0.f9336a     // Catch:{ all -> 0x00fd }
            r1.append(r3)     // Catch:{ all -> 0x00fd }
            java.lang.String r3 = r0.mo14103a()     // Catch:{ all -> 0x00fd }
            r1.append(r3)     // Catch:{ all -> 0x00fd }
            r1.append(r2)     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fd }
            r10.write(r1)     // Catch:{ all -> 0x00fd }
            if (r11 == 0) goto L_0x00db
            long r10 = r9.f8926l     // Catch:{ all -> 0x00fd }
            r1 = 1
            long r1 = r1 + r10
            r9.f8926l = r1     // Catch:{ all -> 0x00fd }
            r0.f9340e = r10     // Catch:{ all -> 0x00fd }
            goto L_0x00db
        L_0x00b9:
            java.util.LinkedHashMap<java.lang.String, bo.app.t0> r10 = r9.f8924j     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = r0.f9336a     // Catch:{ all -> 0x00fd }
            r10.remove(r11)     // Catch:{ all -> 0x00fd }
            java.io.Writer r10 = r9.f8923i     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r11.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = "REMOVE "
            r11.append(r1)     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = r0.f9336a     // Catch:{ all -> 0x00fd }
            r11.append(r0)     // Catch:{ all -> 0x00fd }
            r11.append(r2)     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fd }
            r10.write(r11)     // Catch:{ all -> 0x00fd }
        L_0x00db:
            java.io.Writer r10 = r9.f8923i     // Catch:{ all -> 0x00fd }
            r10.flush()     // Catch:{ all -> 0x00fd }
            long r10 = r9.f8922h     // Catch:{ all -> 0x00fd }
            long r0 = r9.f8920f     // Catch:{ all -> 0x00fd }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00ee
            boolean r10 = r9.m9175e()     // Catch:{ all -> 0x00fd }
            if (r10 == 0) goto L_0x00f5
        L_0x00ee:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f8927m     // Catch:{ all -> 0x00fd }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f8928n     // Catch:{ all -> 0x00fd }
            r10.submit(r11)     // Catch:{ all -> 0x00fd }
        L_0x00f5:
            monitor-exit(r9)
            return
        L_0x00f7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fd }
            r10.<init>()     // Catch:{ all -> 0x00fd }
            throw r10     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3971n0.m9165a(bo.app.n0$c, boolean):void");
    }
}
