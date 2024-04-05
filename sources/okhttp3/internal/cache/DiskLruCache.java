package okhttp3.internal.cache;

import androidx.appcompat.widget.C0326j;
import com.fasterxml.jackson.core.JsonFactory;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import kotlin.text.Regex;
import org.apache.commons.lang3.ClassUtils;
import p003a2.C0023f;
import p735br.C18980c;
import p737cr.C18984c;
import p737cr.C18985d;
import p745gr.C19063a;
import p745gr.C19064b;
import p756lr.C19888c0;
import p756lr.C19896h;
import p756lr.C19906r;
import p756lr.C19912w;

public final class DiskLruCache implements Closeable, Flushable {

    /* renamed from: A */
    public static final String f44063A = "READ";

    /* renamed from: w */
    public static final Regex f44064w = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: x */
    public static final String f44065x = "CLEAN";

    /* renamed from: y */
    public static final String f44066y = "DIRTY";

    /* renamed from: z */
    public static final String f44067z = "REMOVE";

    /* renamed from: b */
    public long f44068b;

    /* renamed from: c */
    public final File f44069c;

    /* renamed from: d */
    public final File f44070d;

    /* renamed from: e */
    public final File f44071e;

    /* renamed from: f */
    public long f44072f;

    /* renamed from: g */
    public C19896h f44073g;

    /* renamed from: h */
    public final LinkedHashMap<String, C19954a> f44074h;

    /* renamed from: i */
    public int f44075i;

    /* renamed from: j */
    public boolean f44076j;

    /* renamed from: k */
    public boolean f44077k;

    /* renamed from: l */
    public boolean f44078l;

    /* renamed from: m */
    public boolean f44079m;

    /* renamed from: n */
    public boolean f44080n;

    /* renamed from: o */
    public boolean f44081o;

    /* renamed from: p */
    public long f44082p;

    /* renamed from: q */
    public final C18984c f44083q;

    /* renamed from: r */
    public final C19963f f44084r;

    /* renamed from: s */
    public final C19064b f44085s;

    /* renamed from: t */
    public final File f44086t;

    /* renamed from: u */
    public final int f44087u = 201105;

    /* renamed from: v */
    public final int f44088v = 2;

    public final class Editor {

        /* renamed from: a */
        public final boolean[] f44089a;

        /* renamed from: b */
        public boolean f44090b;

        /* renamed from: c */
        public final C19954a f44091c;

        public Editor(C19954a aVar) {
            this.f44091c = aVar;
            this.f44089a = aVar.f44096d ? null : new boolean[DiskLruCache.this.f44088v];
        }

        /* renamed from: a */
        public final void mo72894a() throws IOException {
            synchronized (DiskLruCache.this) {
                if (!this.f44090b) {
                    if (C19383o.m32792b(this.f44091c.f44098f, this)) {
                        DiskLruCache.this.mo72881b(this, false);
                    }
                    this.f44090b = true;
                    C19394m mVar = C19394m.f43287a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        /* renamed from: b */
        public final void mo72895b() throws IOException {
            synchronized (DiskLruCache.this) {
                if (!this.f44090b) {
                    if (C19383o.m32792b(this.f44091c.f44098f, this)) {
                        DiskLruCache.this.mo72881b(this, true);
                    }
                    this.f44090b = true;
                    C19394m mVar = C19394m.f43287a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        /* renamed from: c */
        public final void mo72896c() {
            if (C19383o.m32792b(this.f44091c.f44098f, this)) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (diskLruCache.f44077k) {
                    diskLruCache.mo72881b(this, false);
                } else {
                    this.f44091c.f44097e = true;
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:21|22|23|24) */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r5 = new p756lr.C19892e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
            return r5;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0046 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p756lr.C19882a0 mo72897d(int r5) {
            /*
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = okhttp3.internal.cache.DiskLruCache.this
                monitor-enter(r0)
                boolean r1 = r4.f44090b     // Catch:{ all -> 0x0059 }
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x004d
                okhttp3.internal.cache.DiskLruCache$a r1 = r4.f44091c     // Catch:{ all -> 0x0059 }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.f44098f     // Catch:{ all -> 0x0059 }
                boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r4)     // Catch:{ all -> 0x0059 }
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x001b
                lr.e r5 = new lr.e     // Catch:{ all -> 0x0059 }
                r5.<init>()     // Catch:{ all -> 0x0059 }
                monitor-exit(r0)
                return r5
            L_0x001b:
                okhttp3.internal.cache.DiskLruCache$a r1 = r4.f44091c     // Catch:{ all -> 0x0059 }
                boolean r1 = r1.f44096d     // Catch:{ all -> 0x0059 }
                if (r1 != 0) goto L_0x0028
                boolean[] r1 = r4.f44089a     // Catch:{ all -> 0x0059 }
                kotlin.jvm.internal.C19383o.m32794d(r1)     // Catch:{ all -> 0x0059 }
                r1[r5] = r2     // Catch:{ all -> 0x0059 }
            L_0x0028:
                okhttp3.internal.cache.DiskLruCache$a r1 = r4.f44091c     // Catch:{ all -> 0x0059 }
                java.util.ArrayList r1 = r1.f44095c     // Catch:{ all -> 0x0059 }
                java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0059 }
                java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x0059 }
                okhttp3.internal.cache.DiskLruCache r2 = okhttp3.internal.cache.DiskLruCache.this     // Catch:{ FileNotFoundException -> 0x0046 }
                gr.b r2 = r2.f44085s     // Catch:{ FileNotFoundException -> 0x0046 }
                lr.u r1 = r2.mo70550f(r1)     // Catch:{ FileNotFoundException -> 0x0046 }
                okhttp3.internal.cache.g r2 = new okhttp3.internal.cache.g     // Catch:{ all -> 0x0059 }
                okhttp3.internal.cache.DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 r3 = new okhttp3.internal.cache.DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1     // Catch:{ all -> 0x0059 }
                r3.<init>(r4, r5)     // Catch:{ all -> 0x0059 }
                r2.<init>(r1, r3)     // Catch:{ all -> 0x0059 }
                monitor-exit(r0)
                return r2
            L_0x0046:
                lr.e r5 = new lr.e     // Catch:{ all -> 0x0059 }
                r5.<init>()     // Catch:{ all -> 0x0059 }
                monitor-exit(r0)
                return r5
            L_0x004d:
                java.lang.String r5 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0059 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0059 }
                r1.<init>(r5)     // Catch:{ all -> 0x0059 }
                throw r1     // Catch:{ all -> 0x0059 }
            L_0x0059:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.mo72897d(int):lr.a0");
        }
    }

    /* renamed from: okhttp3.internal.cache.DiskLruCache$a */
    public final class C19954a {

        /* renamed from: a */
        public final long[] f44093a;

        /* renamed from: b */
        public final ArrayList f44094b = new ArrayList();

        /* renamed from: c */
        public final ArrayList f44095c = new ArrayList();

        /* renamed from: d */
        public boolean f44096d;

        /* renamed from: e */
        public boolean f44097e;

        /* renamed from: f */
        public Editor f44098f;

        /* renamed from: g */
        public int f44099g;

        /* renamed from: h */
        public long f44100h;

        /* renamed from: i */
        public final String f44101i;

        /* renamed from: j */
        public final /* synthetic */ DiskLruCache f44102j;

        public C19954a(DiskLruCache diskLruCache, String str) {
            C19383o.m32797g(str, "key");
            this.f44102j = diskLruCache;
            this.f44101i = str;
            this.f44093a = new long[diskLruCache.f44088v];
            StringBuilder sb = new StringBuilder(str);
            sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
            int length = sb.length();
            int i = diskLruCache.f44088v;
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.f44094b.add(new File(diskLruCache.f44086t, sb.toString()));
                sb.append(".tmp");
                this.f44095c.add(new File(diskLruCache.f44086t, sb.toString()));
                sb.setLength(length);
            }
        }

        /* renamed from: a */
        public final C19955b mo72898a() {
            DiskLruCache diskLruCache = this.f44102j;
            byte[] bArr = C18980c.f42301a;
            if (!this.f44096d) {
                return null;
            }
            if (!diskLruCache.f44077k && (this.f44098f != null || this.f44097e)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f44093a.clone();
            try {
                int i = this.f44102j.f44088v;
                for (int i2 = 0; i2 < i; i2++) {
                    C19888c0 e = this.f44102j.f44085s.mo70549e((File) this.f44094b.get(i2));
                    if (!this.f44102j.f44077k) {
                        this.f44099g++;
                        e = new C19962e(this, e, e);
                    }
                    arrayList.add(e);
                }
                return new C19955b(this.f44102j, this.f44101i, this.f44100h, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C18980c.m32099c((C19888c0) it.next());
                }
                try {
                    this.f44102j.mo72892n(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }
    }

    /* renamed from: okhttp3.internal.cache.DiskLruCache$b */
    public final class C19955b implements Closeable {

        /* renamed from: b */
        public final String f44103b;

        /* renamed from: c */
        public final long f44104c;

        /* renamed from: d */
        public final List<C19888c0> f44105d;

        /* renamed from: e */
        public final /* synthetic */ DiskLruCache f44106e;

        public C19955b(DiskLruCache diskLruCache, String str, long j, ArrayList arrayList, long[] jArr) {
            C19383o.m32797g(str, "key");
            C19383o.m32797g(jArr, "lengths");
            this.f44106e = diskLruCache;
            this.f44103b = str;
            this.f44104c = j;
            this.f44105d = arrayList;
        }

        public final void close() {
            for (C19888c0 c : this.f44105d) {
                C18980c.m32099c(c);
            }
        }
    }

    public DiskLruCache(File file, long j, C18985d dVar) {
        C19063a aVar = C19064b.f42561a;
        C19383o.m32797g(dVar, "taskRunner");
        this.f44085s = aVar;
        this.f44086t = file;
        this.f44068b = j;
        boolean z = false;
        this.f44074h = new LinkedHashMap<>(0, 0.75f, true);
        this.f44083q = dVar.mo70430f();
        this.f44084r = new C19963f(this, C0023f.m110k(new StringBuilder(), C18980c.f42307g, " Cache"));
        if (j > 0 ? true : z) {
            this.f44069c = new File(file, "journal");
            this.f44070d = new File(file, "journal.tmp");
            this.f44071e = new File(file, "journal.bkp");
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    /* renamed from: t */
    public static void m34117t(String str) {
        if (!f44064w.matches(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + JsonFactory.DEFAULT_QUOTE_CHAR).toString());
        }
    }

    /* renamed from: a */
    public final synchronized void mo72880a() {
        if (!(!this.f44079m)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011f, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo72881b(okhttp3.internal.cache.DiskLruCache.Editor r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "editor"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)     // Catch:{ all -> 0x012c }
            okhttp3.internal.cache.DiskLruCache$a r0 = r10.f44091c     // Catch:{ all -> 0x012c }
            okhttp3.internal.cache.DiskLruCache$Editor r1 = r0.f44098f     // Catch:{ all -> 0x012c }
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r10)     // Catch:{ all -> 0x012c }
            if (r1 == 0) goto L_0x0120
            r1 = 0
            if (r11 == 0) goto L_0x0057
            boolean r2 = r0.f44096d     // Catch:{ all -> 0x012c }
            if (r2 != 0) goto L_0x0057
            int r2 = r9.f44088v     // Catch:{ all -> 0x012c }
            r3 = r1
        L_0x001a:
            if (r3 >= r2) goto L_0x0057
            boolean[] r4 = r10.f44089a     // Catch:{ all -> 0x012c }
            kotlin.jvm.internal.C19383o.m32794d(r4)     // Catch:{ all -> 0x012c }
            boolean r4 = r4[r3]     // Catch:{ all -> 0x012c }
            if (r4 == 0) goto L_0x003d
            gr.b r4 = r9.f44085s     // Catch:{ all -> 0x012c }
            java.util.ArrayList r5 = r0.f44095c     // Catch:{ all -> 0x012c }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x012c }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x012c }
            boolean r4 = r4.mo70546b(r5)     // Catch:{ all -> 0x012c }
            if (r4 != 0) goto L_0x003a
            r10.mo72894a()     // Catch:{ all -> 0x012c }
            monitor-exit(r9)
            return
        L_0x003a:
            int r3 = r3 + 1
            goto L_0x001a
        L_0x003d:
            r10.mo72894a()     // Catch:{ all -> 0x012c }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x012c }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r11.<init>()     // Catch:{ all -> 0x012c }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x012c }
            r11.append(r3)     // Catch:{ all -> 0x012c }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x012c }
            r10.<init>(r11)     // Catch:{ all -> 0x012c }
            throw r10     // Catch:{ all -> 0x012c }
        L_0x0057:
            int r10 = r9.f44088v     // Catch:{ all -> 0x012c }
            r2 = r1
        L_0x005a:
            if (r2 >= r10) goto L_0x009c
            java.util.ArrayList r3 = r0.f44095c     // Catch:{ all -> 0x012c }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x012c }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x012c }
            if (r11 == 0) goto L_0x0094
            boolean r4 = r0.f44097e     // Catch:{ all -> 0x012c }
            if (r4 != 0) goto L_0x0094
            gr.b r4 = r9.f44085s     // Catch:{ all -> 0x012c }
            boolean r4 = r4.mo70546b(r3)     // Catch:{ all -> 0x012c }
            if (r4 == 0) goto L_0x0099
            java.util.ArrayList r4 = r0.f44094b     // Catch:{ all -> 0x012c }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x012c }
            java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x012c }
            gr.b r5 = r9.f44085s     // Catch:{ all -> 0x012c }
            r5.mo70551g(r3, r4)     // Catch:{ all -> 0x012c }
            long[] r3 = r0.f44093a     // Catch:{ all -> 0x012c }
            r5 = r3[r2]     // Catch:{ all -> 0x012c }
            gr.b r3 = r9.f44085s     // Catch:{ all -> 0x012c }
            long r3 = r3.mo70548d(r4)     // Catch:{ all -> 0x012c }
            long[] r7 = r0.f44093a     // Catch:{ all -> 0x012c }
            r7[r2] = r3     // Catch:{ all -> 0x012c }
            long r7 = r9.f44072f     // Catch:{ all -> 0x012c }
            long r7 = r7 - r5
            long r7 = r7 + r3
            r9.f44072f = r7     // Catch:{ all -> 0x012c }
            goto L_0x0099
        L_0x0094:
            gr.b r4 = r9.f44085s     // Catch:{ all -> 0x012c }
            r4.mo70552h(r3)     // Catch:{ all -> 0x012c }
        L_0x0099:
            int r2 = r2 + 1
            goto L_0x005a
        L_0x009c:
            r10 = 0
            r0.f44098f = r10     // Catch:{ all -> 0x012c }
            boolean r10 = r0.f44097e     // Catch:{ all -> 0x012c }
            if (r10 == 0) goto L_0x00a8
            r9.mo72892n(r0)     // Catch:{ all -> 0x012c }
            monitor-exit(r9)
            return
        L_0x00a8:
            int r10 = r9.f44075i     // Catch:{ all -> 0x012c }
            r2 = 1
            int r10 = r10 + r2
            r9.f44075i = r10     // Catch:{ all -> 0x012c }
            lr.h r10 = r9.f44073g     // Catch:{ all -> 0x012c }
            kotlin.jvm.internal.C19383o.m32794d(r10)     // Catch:{ all -> 0x012c }
            boolean r3 = r0.f44096d     // Catch:{ all -> 0x012c }
            r4 = 10
            r5 = 32
            if (r3 != 0) goto L_0x00d7
            if (r11 == 0) goto L_0x00be
            goto L_0x00d7
        L_0x00be:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$a> r11 = r9.f44074h     // Catch:{ all -> 0x012c }
            java.lang.String r1 = r0.f44101i     // Catch:{ all -> 0x012c }
            r11.remove(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r11 = f44067z     // Catch:{ all -> 0x012c }
            lr.h r11 = r10.mo72716H(r11)     // Catch:{ all -> 0x012c }
            r11.writeByte(r5)     // Catch:{ all -> 0x012c }
            java.lang.String r11 = r0.f44101i     // Catch:{ all -> 0x012c }
            r10.mo72716H(r11)     // Catch:{ all -> 0x012c }
            r10.writeByte(r4)     // Catch:{ all -> 0x012c }
            goto L_0x0106
        L_0x00d7:
            r0.f44096d = r2     // Catch:{ all -> 0x012c }
            java.lang.String r2 = f44065x     // Catch:{ all -> 0x012c }
            lr.h r2 = r10.mo72716H(r2)     // Catch:{ all -> 0x012c }
            r2.writeByte(r5)     // Catch:{ all -> 0x012c }
            java.lang.String r2 = r0.f44101i     // Catch:{ all -> 0x012c }
            r10.mo72716H(r2)     // Catch:{ all -> 0x012c }
            long[] r2 = r0.f44093a     // Catch:{ all -> 0x012c }
            int r3 = r2.length     // Catch:{ all -> 0x012c }
        L_0x00ea:
            if (r1 >= r3) goto L_0x00f8
            r6 = r2[r1]     // Catch:{ all -> 0x012c }
            lr.h r8 = r10.writeByte(r5)     // Catch:{ all -> 0x012c }
            r8.mo72724V(r6)     // Catch:{ all -> 0x012c }
            int r1 = r1 + 1
            goto L_0x00ea
        L_0x00f8:
            r10.writeByte(r4)     // Catch:{ all -> 0x012c }
            if (r11 == 0) goto L_0x0106
            long r1 = r9.f44082p     // Catch:{ all -> 0x012c }
            r3 = 1
            long r3 = r3 + r1
            r9.f44082p = r3     // Catch:{ all -> 0x012c }
            r0.f44100h = r1     // Catch:{ all -> 0x012c }
        L_0x0106:
            r10.flush()     // Catch:{ all -> 0x012c }
            long r10 = r9.f44072f     // Catch:{ all -> 0x012c }
            long r0 = r9.f44068b     // Catch:{ all -> 0x012c }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x0117
            boolean r10 = r9.mo72887g()     // Catch:{ all -> 0x012c }
            if (r10 == 0) goto L_0x011e
        L_0x0117:
            cr.c r10 = r9.f44083q     // Catch:{ all -> 0x012c }
            okhttp3.internal.cache.f r11 = r9.f44084r     // Catch:{ all -> 0x012c }
            r10.mo70422c(r11, 0)     // Catch:{ all -> 0x012c }
        L_0x011e:
            monitor-exit(r9)
            return
        L_0x0120:
            java.lang.String r10 = "Check failed."
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x012c }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x012c }
            r11.<init>(r10)     // Catch:{ all -> 0x012c }
            throw r11     // Catch:{ all -> 0x012c }
        L_0x012c:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.mo72881b(okhttp3.internal.cache.DiskLruCache$Editor, boolean):void");
    }

    public final synchronized void close() throws IOException {
        if (this.f44078l) {
            if (!this.f44079m) {
                Collection<C19954a> values = this.f44074h.values();
                C19383o.m32796f(values, "lruEntries.values");
                Object[] array = values.toArray(new C19954a[0]);
                if (array != null) {
                    for (C19954a aVar : (C19954a[]) array) {
                        Editor editor = aVar.f44098f;
                        if (!(editor == null || editor == null)) {
                            editor.mo72896c();
                        }
                    }
                    mo72893r();
                    C19896h hVar = this.f44073g;
                    C19383o.m32794d(hVar);
                    hVar.close();
                    this.f44073g = null;
                    this.f44079m = true;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        this.f44079m = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Editor mo72883d(long r6, java.lang.String r8) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)     // Catch:{ all -> 0x0084 }
            r5.mo72885f()     // Catch:{ all -> 0x0084 }
            r5.mo72880a()     // Catch:{ all -> 0x0084 }
            m34117t(r8)     // Catch:{ all -> 0x0084 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$a> r0 = r5.f44074h     // Catch:{ all -> 0x0084 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0084 }
            okhttp3.internal.cache.DiskLruCache$a r0 = (okhttp3.internal.cache.DiskLruCache.C19954a) r0     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x0028
            if (r0 == 0) goto L_0x0026
            long r3 = r0.f44100h     // Catch:{ all -> 0x0084 }
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0028
        L_0x0026:
            monitor-exit(r5)
            return r2
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            okhttp3.internal.cache.DiskLruCache$Editor r6 = r0.f44098f     // Catch:{ all -> 0x0084 }
            goto L_0x002e
        L_0x002d:
            r6 = r2
        L_0x002e:
            if (r6 == 0) goto L_0x0032
            monitor-exit(r5)
            return r2
        L_0x0032:
            if (r0 == 0) goto L_0x003a
            int r6 = r0.f44099g     // Catch:{ all -> 0x0084 }
            if (r6 == 0) goto L_0x003a
            monitor-exit(r5)
            return r2
        L_0x003a:
            boolean r6 = r5.f44080n     // Catch:{ all -> 0x0084 }
            if (r6 != 0) goto L_0x007b
            boolean r6 = r5.f44081o     // Catch:{ all -> 0x0084 }
            if (r6 == 0) goto L_0x0043
            goto L_0x007b
        L_0x0043:
            lr.h r6 = r5.f44073g     // Catch:{ all -> 0x0084 }
            kotlin.jvm.internal.C19383o.m32794d(r6)     // Catch:{ all -> 0x0084 }
            java.lang.String r7 = f44066y     // Catch:{ all -> 0x0084 }
            lr.h r7 = r6.mo72716H(r7)     // Catch:{ all -> 0x0084 }
            r1 = 32
            lr.h r7 = r7.writeByte(r1)     // Catch:{ all -> 0x0084 }
            lr.h r7 = r7.mo72716H(r8)     // Catch:{ all -> 0x0084 }
            r1 = 10
            r7.writeByte(r1)     // Catch:{ all -> 0x0084 }
            r6.flush()     // Catch:{ all -> 0x0084 }
            boolean r6 = r5.f44076j     // Catch:{ all -> 0x0084 }
            if (r6 == 0) goto L_0x0066
            monitor-exit(r5)
            return r2
        L_0x0066:
            if (r0 != 0) goto L_0x0072
            okhttp3.internal.cache.DiskLruCache$a r0 = new okhttp3.internal.cache.DiskLruCache$a     // Catch:{ all -> 0x0084 }
            r0.<init>(r5, r8)     // Catch:{ all -> 0x0084 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$a> r6 = r5.f44074h     // Catch:{ all -> 0x0084 }
            r6.put(r8, r0)     // Catch:{ all -> 0x0084 }
        L_0x0072:
            okhttp3.internal.cache.DiskLruCache$Editor r6 = new okhttp3.internal.cache.DiskLruCache$Editor     // Catch:{ all -> 0x0084 }
            r6.<init>(r0)     // Catch:{ all -> 0x0084 }
            r0.f44098f = r6     // Catch:{ all -> 0x0084 }
            monitor-exit(r5)
            return r6
        L_0x007b:
            cr.c r6 = r5.f44083q     // Catch:{ all -> 0x0084 }
            okhttp3.internal.cache.f r7 = r5.f44084r     // Catch:{ all -> 0x0084 }
            r6.mo70422c(r7, 0)     // Catch:{ all -> 0x0084 }
            monitor-exit(r5)
            return r2
        L_0x0084:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.mo72883d(long, java.lang.String):okhttp3.internal.cache.DiskLruCache$Editor");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        return r0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.C19955b mo72884e(java.lang.String r4) throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)     // Catch:{ all -> 0x0053 }
            r3.mo72885f()     // Catch:{ all -> 0x0053 }
            r3.mo72880a()     // Catch:{ all -> 0x0053 }
            m34117t(r4)     // Catch:{ all -> 0x0053 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$a> r0 = r3.f44074h     // Catch:{ all -> 0x0053 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0053 }
            okhttp3.internal.cache.DiskLruCache$a r0 = (okhttp3.internal.cache.DiskLruCache.C19954a) r0     // Catch:{ all -> 0x0053 }
            r1 = 0
            if (r0 == 0) goto L_0x0051
            okhttp3.internal.cache.DiskLruCache$b r0 = r0.mo72898a()     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x004f
            int r1 = r3.f44075i     // Catch:{ all -> 0x0053 }
            int r1 = r1 + 1
            r3.f44075i = r1     // Catch:{ all -> 0x0053 }
            lr.h r1 = r3.f44073g     // Catch:{ all -> 0x0053 }
            kotlin.jvm.internal.C19383o.m32794d(r1)     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = f44063A     // Catch:{ all -> 0x0053 }
            lr.h r1 = r1.mo72716H(r2)     // Catch:{ all -> 0x0053 }
            r2 = 32
            lr.h r1 = r1.writeByte(r2)     // Catch:{ all -> 0x0053 }
            lr.h r4 = r1.mo72716H(r4)     // Catch:{ all -> 0x0053 }
            r1 = 10
            r4.writeByte(r1)     // Catch:{ all -> 0x0053 }
            boolean r4 = r3.mo72887g()     // Catch:{ all -> 0x0053 }
            if (r4 == 0) goto L_0x004d
            cr.c r4 = r3.f44083q     // Catch:{ all -> 0x0053 }
            okhttp3.internal.cache.f r1 = r3.f44084r     // Catch:{ all -> 0x0053 }
            r4.mo70422c(r1, 0)     // Catch:{ all -> 0x0053 }
        L_0x004d:
            monitor-exit(r3)
            return r0
        L_0x004f:
            monitor-exit(r3)
            return r1
        L_0x0051:
            monitor-exit(r3)
            return r1
        L_0x0053:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.mo72884e(java.lang.String):okhttp3.internal.cache.DiskLruCache$b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r6 = kotlin.C19394m.f43287a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        kotlin.reflect.C19421p.m32917E(r2, (java.lang.Throwable) null);
        r0.mo70552h(r1);
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        kotlin.reflect.C19421p.m32917E(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bc, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004d */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo72885f() throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            byte[] r0 = p735br.C18980c.f42301a     // Catch:{ all -> 0x00bd }
            boolean r0 = r7.f44078l     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r7)
            return
        L_0x0009:
            gr.b r0 = r7.f44085s     // Catch:{ all -> 0x00bd }
            java.io.File r1 = r7.f44071e     // Catch:{ all -> 0x00bd }
            boolean r0 = r0.mo70546b(r1)     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x002e
            gr.b r0 = r7.f44085s     // Catch:{ all -> 0x00bd }
            java.io.File r1 = r7.f44069c     // Catch:{ all -> 0x00bd }
            boolean r0 = r0.mo70546b(r1)     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0025
            gr.b r0 = r7.f44085s     // Catch:{ all -> 0x00bd }
            java.io.File r1 = r7.f44071e     // Catch:{ all -> 0x00bd }
            r0.mo70552h(r1)     // Catch:{ all -> 0x00bd }
            goto L_0x002e
        L_0x0025:
            gr.b r0 = r7.f44085s     // Catch:{ all -> 0x00bd }
            java.io.File r1 = r7.f44071e     // Catch:{ all -> 0x00bd }
            java.io.File r2 = r7.f44069c     // Catch:{ all -> 0x00bd }
            r0.mo70551g(r1, r2)     // Catch:{ all -> 0x00bd }
        L_0x002e:
            gr.b r0 = r7.f44085s     // Catch:{ all -> 0x00bd }
            java.io.File r1 = r7.f44071e     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = "$this$isCivilized"
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = "file"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)     // Catch:{ all -> 0x00bd }
            lr.u r2 = r0.mo70550f(r1)     // Catch:{ all -> 0x00bd }
            r3 = 0
            r4 = 0
            r5 = 1
            r0.mo70552h(r1)     // Catch:{ IOException -> 0x004d }
            kotlin.reflect.C19421p.m32917E(r2, r3)     // Catch:{ all -> 0x00bd }
            r0 = r5
            goto L_0x0056
        L_0x004b:
            r0 = move-exception
            goto L_0x00b7
        L_0x004d:
            kotlin.m r6 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x004b }
            kotlin.reflect.C19421p.m32917E(r2, r3)     // Catch:{ all -> 0x00bd }
            r0.mo70552h(r1)     // Catch:{ all -> 0x00bd }
            r0 = r4
        L_0x0056:
            r7.f44077k = r0     // Catch:{ all -> 0x00bd }
            gr.b r0 = r7.f44085s     // Catch:{ all -> 0x00bd }
            java.io.File r1 = r7.f44069c     // Catch:{ all -> 0x00bd }
            boolean r0 = r0.mo70546b(r1)     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00b0
            r7.mo72889i()     // Catch:{ IOException -> 0x006c }
            r7.mo72888h()     // Catch:{ IOException -> 0x006c }
            r7.f44078l = r5     // Catch:{ IOException -> 0x006c }
            monitor-exit(r7)
            return
        L_0x006c:
            r0 = move-exception
            hr.h$a r1 = p747hr.C19084h.f42595c     // Catch:{ all -> 0x00bd }
            r1.getClass()     // Catch:{ all -> 0x00bd }
            hr.h r1 = p747hr.C19084h.f42593a     // Catch:{ all -> 0x00bd }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r2.<init>()     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = "DiskLruCache "
            r2.append(r3)     // Catch:{ all -> 0x00bd }
            java.io.File r3 = r7.f44086t     // Catch:{ all -> 0x00bd }
            r2.append(r3)     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = " is corrupt: "
            r2.append(r3)     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x00bd }
            r2.append(r3)     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = ", removing"
            r2.append(r3)     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00bd }
            r3 = 5
            r1.getClass()     // Catch:{ all -> 0x00bd }
            p747hr.C19084h.m32344i(r3, r2, r0)     // Catch:{ all -> 0x00bd }
            r7.close()     // Catch:{ all -> 0x00ac }
            gr.b r0 = r7.f44085s     // Catch:{ all -> 0x00ac }
            java.io.File r1 = r7.f44086t     // Catch:{ all -> 0x00ac }
            r0.mo70545a(r1)     // Catch:{ all -> 0x00ac }
            r7.f44079m = r4     // Catch:{ all -> 0x00bd }
            goto L_0x00b0
        L_0x00ac:
            r0 = move-exception
            r7.f44079m = r4     // Catch:{ all -> 0x00bd }
            throw r0     // Catch:{ all -> 0x00bd }
        L_0x00b0:
            r7.mo72891k()     // Catch:{ all -> 0x00bd }
            r7.f44078l = r5     // Catch:{ all -> 0x00bd }
            monitor-exit(r7)
            return
        L_0x00b7:
            throw r0     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r1 = move-exception
            kotlin.reflect.C19421p.m32917E(r2, r0)     // Catch:{ all -> 0x00bd }
            throw r1     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.mo72885f():void");
    }

    public final synchronized void flush() throws IOException {
        if (this.f44078l) {
            mo72880a();
            mo72893r();
            C19896h hVar = this.f44073g;
            C19383o.m32794d(hVar);
            hVar.flush();
        }
    }

    /* renamed from: g */
    public final boolean mo72887g() {
        int i = this.f44075i;
        return i >= 2000 && i >= this.f44074h.size();
    }

    /* renamed from: h */
    public final void mo72888h() throws IOException {
        this.f44085s.mo70552h(this.f44070d);
        Iterator<C19954a> it = this.f44074h.values().iterator();
        while (it.hasNext()) {
            C19954a next = it.next();
            C19383o.m32796f(next, "i.next()");
            C19954a aVar = next;
            int i = 0;
            if (aVar.f44098f == null) {
                int i2 = this.f44088v;
                while (i < i2) {
                    this.f44072f += aVar.f44093a[i];
                    i++;
                }
            } else {
                aVar.f44098f = null;
                int i3 = this.f44088v;
                while (i < i3) {
                    this.f44085s.mo70552h((File) aVar.f44094b.get(i));
                    this.f44085s.mo70552h((File) aVar.f44095c.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:18|19|(1:21)(1:22)|23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r9.f44075i = r7 - r9.f44074h.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (r1.mo72733e0() == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        mo72891k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r9.f44073g = p756lr.C19906r.m33997a(new okhttp3.internal.cache.C19964g(r9.f44085s.mo70547c(r9.f44069c), new okhttp3.internal.cache.DiskLruCache$newJournalWriter$faultHidingSink$1(r9)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008f, code lost:
        r0 = kotlin.C19394m.f43287a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0091, code lost:
        kotlin.reflect.C19421p.m32917E(r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c7, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c8, code lost:
        kotlin.reflect.C19421p.m32917E(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cb, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0064 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0064=Splitter:B:18:0x0064, B:27:0x0098=Splitter:B:27:0x0098} */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72889i() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            gr.b r1 = r9.f44085s
            java.io.File r2 = r9.f44069c
            lr.q r1 = r1.mo70549e(r2)
            lr.x r1 = p756lr.C19906r.m33998b(r1)
            java.lang.String r2 = r1.mo72719L()     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = r1.mo72719L()     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = r1.mo72719L()     // Catch:{ all -> 0x0096 }
            java.lang.String r5 = r1.mo72719L()     // Catch:{ all -> 0x0096 }
            java.lang.String r6 = r1.mo72719L()     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r7, r2)     // Catch:{ all -> 0x0096 }
            r8 = 1
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0098
            java.lang.String r7 = "1"
            boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r7, r3)     // Catch:{ all -> 0x0096 }
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0098
            int r7 = r9.f44087u     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0096 }
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r7, r4)     // Catch:{ all -> 0x0096 }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0098
            int r4 = r9.f44088v     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0096 }
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r5)     // Catch:{ all -> 0x0096 }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0098
            int r4 = r6.length()     // Catch:{ all -> 0x0096 }
            r7 = 0
            if (r4 <= 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r8 = r7
        L_0x0058:
            if (r8 != 0) goto L_0x0098
        L_0x005a:
            java.lang.String r0 = r1.mo72719L()     // Catch:{ EOFException -> 0x0064 }
            r9.mo72890j(r0)     // Catch:{ EOFException -> 0x0064 }
            int r7 = r7 + 1
            goto L_0x005a
        L_0x0064:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$a> r0 = r9.f44074h     // Catch:{ all -> 0x0096 }
            int r0 = r0.size()     // Catch:{ all -> 0x0096 }
            int r7 = r7 - r0
            r9.f44075i = r7     // Catch:{ all -> 0x0096 }
            boolean r0 = r1.mo72733e0()     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x0077
            r9.mo72891k()     // Catch:{ all -> 0x0096 }
            goto L_0x008f
        L_0x0077:
            gr.b r0 = r9.f44085s     // Catch:{ all -> 0x0096 }
            java.io.File r2 = r9.f44069c     // Catch:{ all -> 0x0096 }
            lr.u r0 = r0.mo70547c(r2)     // Catch:{ all -> 0x0096 }
            okhttp3.internal.cache.g r2 = new okhttp3.internal.cache.g     // Catch:{ all -> 0x0096 }
            okhttp3.internal.cache.DiskLruCache$newJournalWriter$faultHidingSink$1 r3 = new okhttp3.internal.cache.DiskLruCache$newJournalWriter$faultHidingSink$1     // Catch:{ all -> 0x0096 }
            r3.<init>(r9)     // Catch:{ all -> 0x0096 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0096 }
            lr.w r0 = p756lr.C19906r.m33997a(r2)     // Catch:{ all -> 0x0096 }
            r9.f44073g = r0     // Catch:{ all -> 0x0096 }
        L_0x008f:
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0096 }
            r0 = 0
            kotlin.reflect.C19421p.m32917E(r1, r0)
            return
        L_0x0096:
            r0 = move-exception
            goto L_0x00c6
        L_0x0098:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0096 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r7.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x0096 }
            r7.append(r2)     // Catch:{ all -> 0x0096 }
            r7.append(r0)     // Catch:{ all -> 0x0096 }
            r7.append(r3)     // Catch:{ all -> 0x0096 }
            r7.append(r0)     // Catch:{ all -> 0x0096 }
            r7.append(r5)     // Catch:{ all -> 0x0096 }
            r7.append(r0)     // Catch:{ all -> 0x0096 }
            r7.append(r6)     // Catch:{ all -> 0x0096 }
            r0 = 93
            r7.append(r0)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0096 }
            r4.<init>(r0)     // Catch:{ all -> 0x0096 }
            throw r4     // Catch:{ all -> 0x0096 }
        L_0x00c6:
            throw r0     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r2 = move-exception
            kotlin.reflect.C19421p.m32917E(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.mo72889i():void");
    }

    /* renamed from: j */
    public final void mo72890j(String str) throws IOException {
        String str2;
        int k1 = C19459m.m33042k1(str, ' ', 0, false, 6);
        if (k1 != -1) {
            int i = k1 + 1;
            int k12 = C19459m.m33042k1(str, ' ', i, false, 4);
            if (k12 == -1) {
                str2 = str.substring(i);
                C19383o.m32796f(str2, "(this as java.lang.String).substring(startIndex)");
                String str3 = f44067z;
                if (k1 == str3.length() && C19457k.m33025c1(str, str3, false)) {
                    this.f44074h.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, k12);
                C19383o.m32796f(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            C19954a aVar = this.f44074h.get(str2);
            if (aVar == null) {
                aVar = new C19954a(this, str2);
                this.f44074h.put(str2, aVar);
            }
            if (k12 != -1) {
                String str4 = f44065x;
                if (k1 == str4.length() && C19457k.m33025c1(str, str4, false)) {
                    String substring = str.substring(k12 + 1);
                    C19383o.m32796f(substring, "(this as java.lang.String).substring(startIndex)");
                    List x1 = C19459m.m33055x1(substring, new char[]{' '}, 0, 6);
                    aVar.f44096d = true;
                    aVar.f44098f = null;
                    if (x1.size() == aVar.f44102j.f44088v) {
                        try {
                            int size = x1.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                aVar.f44093a[i2] = Long.parseLong((String) x1.get(i2));
                            }
                            return;
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + x1);
                        }
                    } else {
                        throw new IOException("unexpected journal line: " + x1);
                    }
                }
            }
            if (k12 == -1) {
                String str5 = f44066y;
                if (k1 == str5.length() && C19457k.m33025c1(str, str5, false)) {
                    aVar.f44098f = new Editor(aVar);
                    return;
                }
            }
            if (k12 == -1) {
                String str6 = f44063A;
                if (k1 == str6.length() && C19457k.m33025c1(str, str6, false)) {
                    return;
                }
            }
            throw new IOException(C0326j.m864i("unexpected journal line: ", str));
        }
        throw new IOException(C0326j.m864i("unexpected journal line: ", str));
    }

    /* renamed from: k */
    public final synchronized void mo72891k() throws IOException {
        C19896h hVar = this.f44073g;
        if (hVar != null) {
            hVar.close();
        }
        C19912w a = C19906r.m33997a(this.f44085s.mo70550f(this.f44070d));
        try {
            a.mo72716H("libcore.io.DiskLruCache");
            a.writeByte(10);
            a.mo72716H(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            a.writeByte(10);
            a.mo72724V((long) this.f44087u);
            a.writeByte(10);
            a.mo72724V((long) this.f44088v);
            a.writeByte(10);
            a.writeByte(10);
            Iterator<C19954a> it = this.f44074h.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C19954a next = it.next();
                if (next.f44098f != null) {
                    a.mo72716H(f44066y);
                    a.writeByte(32);
                    a.mo72716H(next.f44101i);
                    a.writeByte(10);
                } else {
                    a.mo72716H(f44065x);
                    a.writeByte(32);
                    a.mo72716H(next.f44101i);
                    for (long V : next.f44093a) {
                        a.writeByte(32);
                        a.mo72724V(V);
                    }
                    a.writeByte(10);
                }
            }
            C19394m mVar = C19394m.f43287a;
            C19421p.m32917E(a, (Throwable) null);
            if (this.f44085s.mo70546b(this.f44069c)) {
                this.f44085s.mo70551g(this.f44069c, this.f44071e);
            }
            this.f44085s.mo70551g(this.f44070d, this.f44069c);
            this.f44085s.mo70552h(this.f44071e);
            this.f44073g = C19906r.m33997a(new C19964g(this.f44085s.mo70547c(this.f44069c), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
            this.f44076j = false;
            this.f44081o = false;
        } catch (Throwable th) {
            C19421p.m32917E(a, th);
            throw th;
        }
    }

    /* renamed from: n */
    public final void mo72892n(C19954a aVar) throws IOException {
        C19896h hVar;
        C19383o.m32797g(aVar, "entry");
        if (!this.f44077k) {
            if (aVar.f44099g > 0 && (hVar = this.f44073g) != null) {
                hVar.mo72716H(f44066y);
                hVar.writeByte(32);
                hVar.mo72716H(aVar.f44101i);
                hVar.writeByte(10);
                hVar.flush();
            }
            if (aVar.f44099g > 0 || aVar.f44098f != null) {
                aVar.f44097e = true;
                return;
            }
        }
        Editor editor = aVar.f44098f;
        if (editor != null) {
            editor.mo72896c();
        }
        int i = this.f44088v;
        for (int i2 = 0; i2 < i; i2++) {
            this.f44085s.mo70552h((File) aVar.f44094b.get(i2));
            long j = this.f44072f;
            long[] jArr = aVar.f44093a;
            this.f44072f = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.f44075i++;
        C19896h hVar2 = this.f44073g;
        if (hVar2 != null) {
            hVar2.mo72716H(f44067z);
            hVar2.writeByte(32);
            hVar2.mo72716H(aVar.f44101i);
            hVar2.writeByte(10);
        }
        this.f44074h.remove(aVar.f44101i);
        if (mo72887g()) {
            this.f44083q.mo70422c(this.f44084r, 0);
        }
    }

    /* renamed from: r */
    public final void mo72893r() throws IOException {
        boolean z;
        do {
            z = false;
            if (this.f44072f > this.f44068b) {
                Iterator<C19954a> it = this.f44074h.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C19954a next = it.next();
                    if (!next.f44097e) {
                        mo72892n(next);
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                this.f44080n = false;
                return;
            }
        } while (z);
    }
}
