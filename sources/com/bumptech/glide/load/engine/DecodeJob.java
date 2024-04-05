package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import androidx.activity.C0114h;
import androidx.compose.runtime.C1339j1;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5968d;
import com.bumptech.glide.load.data.C5970e;
import com.bumptech.glide.load.engine.C6020g;
import com.bumptech.glide.load.engine.C6030k;
import com.bumptech.glide.load.engine.C6037l;
import com.bumptech.glide.load.resource.bitmap.C6088l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p036c5.C4421h;
import p077d1.C6620d;
import p080d5.C6652a;
import p080d5.C6660d;
import p150j4.C7109b;
import p150j4.C7111d;
import p150j4.C7114e;
import p150j4.C7116g;

public final class DecodeJob<R> implements C6020g.C6021a, Runnable, Comparable<DecodeJob<?>>, C6652a.C6656d {

    /* renamed from: A */
    public Object f12799A;

    /* renamed from: B */
    public DataSource f12800B;

    /* renamed from: C */
    public C5968d<?> f12801C;

    /* renamed from: D */
    public volatile C6020g f12802D;

    /* renamed from: E */
    public volatile boolean f12803E;

    /* renamed from: F */
    public volatile boolean f12804F;

    /* renamed from: G */
    public boolean f12805G;

    /* renamed from: b */
    public final C6022h<R> f12806b = new C6022h<>();

    /* renamed from: c */
    public final ArrayList f12807c = new ArrayList();

    /* renamed from: d */
    public final C6660d.C6661a f12808d = new C6660d.C6661a();

    /* renamed from: e */
    public final C5989e f12809e;

    /* renamed from: f */
    public final C6620d<DecodeJob<?>> f12810f;

    /* renamed from: g */
    public final C5988d<?> f12811g = new C5988d<>();

    /* renamed from: h */
    public final C5990f f12812h = new C5990f();

    /* renamed from: i */
    public GlideContext f12813i;

    /* renamed from: j */
    public C7109b f12814j;

    /* renamed from: k */
    public Priority f12815k;

    /* renamed from: l */
    public C6044n f12816l;

    /* renamed from: m */
    public int f12817m;

    /* renamed from: n */
    public int f12818n;

    /* renamed from: o */
    public C6024j f12819o;

    /* renamed from: p */
    public C7114e f12820p;

    /* renamed from: q */
    public C5986b<R> f12821q;

    /* renamed from: r */
    public int f12822r;

    /* renamed from: s */
    public Stage f12823s;

    /* renamed from: t */
    public RunReason f12824t;

    /* renamed from: u */
    public long f12825u;

    /* renamed from: v */
    public boolean f12826v;

    /* renamed from: w */
    public Object f12827w;

    /* renamed from: x */
    public Thread f12828x;

    /* renamed from: y */
    public C7109b f12829y;

    /* renamed from: z */
    public C7109b f12830z;

    public enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$a */
    public static /* synthetic */ class C5985a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12831a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f12832b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f12833c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                com.bumptech.glide.load.EncodeStrategy[] r0 = com.bumptech.glide.load.EncodeStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12833c = r0
                r1 = 1
                com.bumptech.glide.load.EncodeStrategy r2 = com.bumptech.glide.load.EncodeStrategy.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f12833c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.load.EncodeStrategy r3 = com.bumptech.glide.load.EncodeStrategy.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.bumptech.glide.load.engine.DecodeJob$Stage[] r2 = com.bumptech.glide.load.engine.DecodeJob.Stage.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f12832b = r2
                com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f12832b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f12832b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f12832b     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f12832b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                com.bumptech.glide.load.engine.DecodeJob$RunReason[] r3 = com.bumptech.glide.load.engine.DecodeJob.RunReason.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f12831a = r3
                com.bumptech.glide.load.engine.DecodeJob$RunReason r4 = com.bumptech.glide.load.engine.DecodeJob.RunReason.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f12831a     // Catch:{ NoSuchFieldError -> 0x0074 }
                com.bumptech.glide.load.engine.DecodeJob$RunReason r3 = com.bumptech.glide.load.engine.DecodeJob.RunReason.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f12831a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.bumptech.glide.load.engine.DecodeJob$RunReason r1 = com.bumptech.glide.load.engine.DecodeJob.RunReason.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.C5985a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$b */
    public interface C5986b<R> {
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$c */
    public final class C5987c<Z> {

        /* renamed from: a */
        public final DataSource f12834a;

        public C5987c(DataSource dataSource) {
            this.f12834a = dataSource;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$d */
    public static class C5988d<Z> {

        /* renamed from: a */
        public C7109b f12836a;

        /* renamed from: b */
        public C7116g<Z> f12837b;

        /* renamed from: c */
        public C6049r<Z> f12838c;
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$e */
    public interface C5989e {
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$f */
    public static class C5990f {

        /* renamed from: a */
        public boolean f12839a;

        /* renamed from: b */
        public boolean f12840b;

        /* renamed from: c */
        public boolean f12841c;

        /* renamed from: a */
        public final boolean mo16888a() {
            return (this.f12841c || this.f12840b) && this.f12839a;
        }
    }

    public DecodeJob(C5989e eVar, C6652a.C6655c cVar) {
        this.f12809e = eVar;
        this.f12810f = cVar;
    }

    /* renamed from: a */
    public final <Data> C6051s<R> mo16871a(C5968d<?> dVar, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            dVar.mo16851b();
            return null;
        }
        try {
            int i = C4421h.f9699b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            C6051s<R> h = mo16877h(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                h.toString();
                C4421h.m10119a(elapsedRealtimeNanos);
                Objects.toString(this.f12816l);
                Thread.currentThread().getName();
            }
            return h;
        } finally {
            dVar.mo16851b();
        }
    }

    /* renamed from: c */
    public final C6660d.C6661a mo16872c() {
        return this.f12808d;
    }

    public final int compareTo(Object obj) {
        DecodeJob decodeJob = (DecodeJob) obj;
        int ordinal = this.f12815k.ordinal() - decodeJob.f12815k.ordinal();
        return ordinal == 0 ? this.f12822r - decodeJob.f12822r : ordinal;
    }

    /* renamed from: e */
    public final void mo16874e(C7109b bVar, Object obj, C5968d<?> dVar, DataSource dataSource, C7109b bVar2) {
        this.f12829y = bVar;
        this.f12799A = obj;
        this.f12801C = dVar;
        this.f12800B = dataSource;
        this.f12830z = bVar2;
        boolean z = false;
        if (bVar != this.f12806b.mo16956a().get(0)) {
            z = true;
        }
        this.f12805G = z;
        if (Thread.currentThread() != this.f12828x) {
            this.f12824t = RunReason.DECODE_DATA;
            C6037l lVar = (C6037l) this.f12821q;
            (lVar.f12971o ? lVar.f12966j : lVar.f12972p ? lVar.f12967k : lVar.f12965i).execute(this);
            return;
        }
        mo16878i();
    }

    /* renamed from: f */
    public final void mo16875f() {
        this.f12824t = RunReason.SWITCH_TO_SOURCE_SERVICE;
        C6037l lVar = (C6037l) this.f12821q;
        (lVar.f12971o ? lVar.f12966j : lVar.f12972p ? lVar.f12967k : lVar.f12965i).execute(this);
    }

    /* renamed from: g */
    public final void mo16876g(C7109b bVar, Exception exc, C5968d<?> dVar, DataSource dataSource) {
        dVar.mo16851b();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exc);
        glideException.setLoggingDetails(bVar, dataSource, dVar.mo16848a());
        this.f12807c.add(glideException);
        if (Thread.currentThread() != this.f12828x) {
            this.f12824t = RunReason.SWITCH_TO_SOURCE_SERVICE;
            C6037l lVar = (C6037l) this.f12821q;
            (lVar.f12971o ? lVar.f12966j : lVar.f12972p ? lVar.f12967k : lVar.f12965i).execute(this);
            return;
        }
        mo16884o();
    }

    /* renamed from: h */
    public final <Data> C6051s<R> mo16877h(Data data, DataSource dataSource) throws GlideException {
        C6048q<Data, ?, R> c = this.f12806b.mo16958c(data.getClass());
        C7114e eVar = this.f12820p;
        boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f12806b.f12922r;
        C7111d dVar = C6088l.f13089i;
        Boolean bool = (Boolean) eVar.mo19443c(dVar);
        if (bool == null || (bool.booleanValue() && !z)) {
            eVar = new C7114e();
            eVar.f15820b.mo14352i(this.f12820p.f15820b);
            eVar.f15820b.put(dVar, Boolean.valueOf(z));
        }
        C7114e eVar2 = eVar;
        C5970e f = this.f12813i.getRegistry().mo16766f(data);
        try {
            return c.mo16997a(this.f12817m, this.f12818n, eVar2, f, new C5987c(dataSource));
        } finally {
            f.mo16843b();
        }
    }

    /* renamed from: i */
    public final void mo16878i() {
        C6051s<R> sVar;
        C5988d<?> dVar;
        boolean a;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f12825u;
            Objects.toString(this.f12799A);
            Objects.toString(this.f12829y);
            Objects.toString(this.f12801C);
            C4421h.m10119a(j);
            Objects.toString(this.f12816l);
            Thread.currentThread().getName();
        }
        C6049r rVar = null;
        try {
            sVar = mo16871a(this.f12801C, this.f12799A, this.f12800B);
        } catch (GlideException e) {
            e.setLoggingDetails(this.f12830z, this.f12800B);
            this.f12807c.add(e);
            sVar = null;
        }
        if (sVar != null) {
            DataSource dataSource = this.f12800B;
            boolean z = this.f12805G;
            if (sVar instanceof C6047p) {
                ((C6047p) sVar).mo16996c();
            }
            boolean z2 = false;
            if (this.f12811g.f12838c != null) {
                rVar = (C6049r) C6049r.f13009f.mo18807b();
                C0114h.m281L(rVar);
                rVar.f13013e = false;
                rVar.f13012d = true;
                rVar.f13011c = sVar;
                sVar = rVar;
            }
            mo16881l(sVar, dataSource, z);
            this.f12823s = Stage.ENCODE;
            try {
                dVar = this.f12811g;
                if (dVar.f12838c != null) {
                    z2 = true;
                }
                if (z2) {
                    C5989e eVar = this.f12809e;
                    C7114e eVar2 = this.f12820p;
                    dVar.getClass();
                    ((C6030k.C6035c) eVar).mo16975a().mo19515b(dVar.f12836a, new C6019f(dVar.f12837b, dVar.f12838c, eVar2));
                    dVar.f12838c.mo16999e();
                }
                if (rVar != null) {
                    rVar.mo16999e();
                }
                C5990f fVar = this.f12812h;
                synchronized (fVar) {
                    fVar.f12840b = true;
                    a = fVar.mo16888a();
                }
                if (a) {
                    mo16883n();
                }
            } catch (Throwable th) {
                if (rVar != null) {
                    rVar.mo16999e();
                }
                throw th;
            }
        } else {
            mo16884o();
        }
    }

    /* renamed from: j */
    public final C6020g mo16879j() {
        int i = C5985a.f12832b[this.f12823s.ordinal()];
        if (i == 1) {
            return new C6052t(this.f12806b, this);
        }
        if (i == 2) {
            C6022h<R> hVar = this.f12806b;
            return new C6017d(hVar.mo16956a(), hVar, this);
        } else if (i == 3) {
            return new C6057x(this.f12806b, this);
        } else {
            if (i == 4) {
                return null;
            }
            StringBuilder h = C0072d.m201h("Unrecognized stage: ");
            h.append(this.f12823s);
            throw new IllegalStateException(h.toString());
        }
    }

    /* renamed from: k */
    public final Stage mo16880k(Stage stage) {
        int i = C5985a.f12832b[stage.ordinal()];
        if (i == 1) {
            return this.f12819o.mo16965a() ? Stage.DATA_CACHE : mo16880k(Stage.DATA_CACHE);
        }
        if (i == 2) {
            return this.f12826v ? Stage.FINISHED : Stage.SOURCE;
        }
        if (i == 3 || i == 4) {
            return Stage.FINISHED;
        }
        if (i == 5) {
            return this.f12819o.mo16966b() ? Stage.RESOURCE_CACHE : mo16880k(Stage.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + stage);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        r1 = (com.bumptech.glide.load.engine.C6030k) r0.f12963g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r9 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r9.f12999b == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        r1.f12939h.mo16951a(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        r9 = r1.f12932a;
        r9.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r0.f12973q == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        r9 = r9.f2933c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        r9 = r9.f2932b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        r9 = (java.util.Map) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r0.equals(r9.get(r8)) == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        r9.remove(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        r8 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        if (r8.hasNext() == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        r9 = (com.bumptech.glide.load.engine.C6037l.C6041d) r8.next();
        r9.f12988b.execute(new com.bumptech.glide.load.engine.C6037l.C6039b(r0, r9.f12987a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        r0.mo16978d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16881l(com.bumptech.glide.load.engine.C6051s<R> r8, com.bumptech.glide.load.DataSource r9, boolean r10) {
        /*
            r7 = this;
            r7.mo16886q()
            com.bumptech.glide.load.engine.DecodeJob$b<R> r0 = r7.f12821q
            com.bumptech.glide.load.engine.l r0 = (com.bumptech.glide.load.engine.C6037l) r0
            monitor-enter(r0)
            r0.f12974r = r8     // Catch:{ all -> 0x00c9 }
            r0.f12975s = r9     // Catch:{ all -> 0x00c9 }
            r0.f12982z = r10     // Catch:{ all -> 0x00c9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            monitor-enter(r0)
            d5.d$a r8 = r0.f12959c     // Catch:{ all -> 0x00c6 }
            r8.mo18831a()     // Catch:{ all -> 0x00c6 }
            boolean r8 = r0.f12981y     // Catch:{ all -> 0x00c6 }
            if (r8 == 0) goto L_0x0024
            com.bumptech.glide.load.engine.s<?> r8 = r0.f12974r     // Catch:{ all -> 0x00c6 }
            r8.mo16990b()     // Catch:{ all -> 0x00c6 }
            r0.mo16981g()     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            goto L_0x00b2
        L_0x0024:
            com.bumptech.glide.load.engine.l$e r8 = r0.f12958b     // Catch:{ all -> 0x00c6 }
            java.util.List<com.bumptech.glide.load.engine.l$d> r8 = r8.f12989b     // Catch:{ all -> 0x00c6 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x00c6 }
            if (r8 != 0) goto L_0x00be
            boolean r8 = r0.f12976t     // Catch:{ all -> 0x00c6 }
            if (r8 != 0) goto L_0x00b6
            com.bumptech.glide.load.engine.l$c r8 = r0.f12962f     // Catch:{ all -> 0x00c6 }
            com.bumptech.glide.load.engine.s<?> r2 = r0.f12974r     // Catch:{ all -> 0x00c6 }
            boolean r3 = r0.f12970n     // Catch:{ all -> 0x00c6 }
            j4.b r5 = r0.f12969m     // Catch:{ all -> 0x00c6 }
            com.bumptech.glide.load.engine.o$a r6 = r0.f12960d     // Catch:{ all -> 0x00c6 }
            r8.getClass()     // Catch:{ all -> 0x00c6 }
            com.bumptech.glide.load.engine.o r8 = new com.bumptech.glide.load.engine.o     // Catch:{ all -> 0x00c6 }
            r4 = 1
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00c6 }
            r0.f12979w = r8     // Catch:{ all -> 0x00c6 }
            r8 = 1
            r0.f12976t = r8     // Catch:{ all -> 0x00c6 }
            com.bumptech.glide.load.engine.l$e r9 = r0.f12958b     // Catch:{ all -> 0x00c6 }
            r9.getClass()     // Catch:{ all -> 0x00c6 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00c6 }
            java.util.List<com.bumptech.glide.load.engine.l$d> r9 = r9.f12989b     // Catch:{ all -> 0x00c6 }
            r10.<init>(r9)     // Catch:{ all -> 0x00c6 }
            int r9 = r10.size()     // Catch:{ all -> 0x00c6 }
            int r9 = r9 + r8
            r0.mo16979e(r9)     // Catch:{ all -> 0x00c6 }
            j4.b r8 = r0.f12969m     // Catch:{ all -> 0x00c6 }
            com.bumptech.glide.load.engine.o<?> r9 = r0.f12979w     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            com.bumptech.glide.load.engine.m r1 = r0.f12963g
            com.bumptech.glide.load.engine.k r1 = (com.bumptech.glide.load.engine.C6030k) r1
            monitor-enter(r1)
            if (r9 == 0) goto L_0x0074
            boolean r2 = r9.f12999b     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0074
            com.bumptech.glide.load.engine.c r2 = r1.f12939h     // Catch:{ all -> 0x00b3 }
            r2.mo16951a(r8, r9)     // Catch:{ all -> 0x00b3 }
        L_0x0074:
            androidx.compose.runtime.j1 r9 = r1.f12932a     // Catch:{ all -> 0x00b3 }
            r9.getClass()     // Catch:{ all -> 0x00b3 }
            boolean r2 = r0.f12973q     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0080
            java.lang.Object r9 = r9.f2933c     // Catch:{ all -> 0x00b3 }
            goto L_0x0082
        L_0x0080:
            java.lang.Object r9 = r9.f2932b     // Catch:{ all -> 0x00b3 }
        L_0x0082:
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x00b3 }
            java.lang.Object r2 = r9.get(r8)     // Catch:{ all -> 0x00b3 }
            boolean r2 = r0.equals(r2)     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0091
            r9.remove(r8)     // Catch:{ all -> 0x00b3 }
        L_0x0091:
            monitor-exit(r1)
            java.util.Iterator r8 = r10.iterator()
        L_0x0096:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00af
            java.lang.Object r9 = r8.next()
            com.bumptech.glide.load.engine.l$d r9 = (com.bumptech.glide.load.engine.C6037l.C6041d) r9
            java.util.concurrent.Executor r10 = r9.f12988b
            com.bumptech.glide.load.engine.l$b r1 = new com.bumptech.glide.load.engine.l$b
            com.bumptech.glide.request.h r9 = r9.f12987a
            r1.<init>(r9)
            r10.execute(r1)
            goto L_0x0096
        L_0x00af:
            r0.mo16978d()
        L_0x00b2:
            return
        L_0x00b3:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        L_0x00b6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c6 }
            java.lang.String r9 = "Already have resource"
            r8.<init>(r9)     // Catch:{ all -> 0x00c6 }
            throw r8     // Catch:{ all -> 0x00c6 }
        L_0x00be:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c6 }
            java.lang.String r9 = "Received a resource without any callbacks to notify"
            r8.<init>(r9)     // Catch:{ all -> 0x00c6 }
            throw r8     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            throw r8
        L_0x00c9:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.mo16881l(com.bumptech.glide.load.engine.s, com.bumptech.glide.load.DataSource, boolean):void");
    }

    /* renamed from: m */
    public final void mo16882m() {
        boolean a;
        mo16886q();
        GlideException glideException = new GlideException("Failed to load resource", (List<Throwable>) new ArrayList(this.f12807c));
        C6037l lVar = (C6037l) this.f12821q;
        synchronized (lVar) {
            lVar.f12977u = glideException;
        }
        synchronized (lVar) {
            lVar.f12959c.mo18831a();
            if (lVar.f12981y) {
                lVar.mo16981g();
            } else if (lVar.f12958b.f12989b.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!lVar.f12978v) {
                lVar.f12978v = true;
                C7109b bVar = lVar.f12969m;
                C6037l.C6042e eVar = lVar.f12958b;
                eVar.getClass();
                ArrayList<C6037l.C6041d> arrayList = new ArrayList<>(eVar.f12989b);
                lVar.mo16979e(arrayList.size() + 1);
                C6030k kVar = (C6030k) lVar.f12963g;
                synchronized (kVar) {
                    C1339j1 j1Var = kVar.f12932a;
                    j1Var.getClass();
                    Map map = (Map) (lVar.f12973q ? j1Var.f2933c : j1Var.f2932b);
                    if (lVar.equals(map.get(bVar))) {
                        map.remove(bVar);
                    }
                }
                for (C6037l.C6041d dVar : arrayList) {
                    dVar.f12988b.execute(new C6037l.C6038a(dVar.f12987a));
                }
                lVar.mo16978d();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
        C5990f fVar = this.f12812h;
        synchronized (fVar) {
            fVar.f12841c = true;
            a = fVar.mo16888a();
        }
        if (a) {
            mo16883n();
        }
    }

    /* renamed from: n */
    public final void mo16883n() {
        C5990f fVar = this.f12812h;
        synchronized (fVar) {
            fVar.f12840b = false;
            fVar.f12839a = false;
            fVar.f12841c = false;
        }
        C5988d<?> dVar = this.f12811g;
        dVar.f12836a = null;
        dVar.f12837b = null;
        dVar.f12838c = null;
        C6022h<R> hVar = this.f12806b;
        hVar.f12907c = null;
        hVar.f12908d = null;
        hVar.f12918n = null;
        hVar.f12911g = null;
        hVar.f12915k = null;
        hVar.f12913i = null;
        hVar.f12919o = null;
        hVar.f12914j = null;
        hVar.f12920p = null;
        hVar.f12905a.clear();
        hVar.f12916l = false;
        hVar.f12906b.clear();
        hVar.f12917m = false;
        this.f12803E = false;
        this.f12813i = null;
        this.f12814j = null;
        this.f12820p = null;
        this.f12815k = null;
        this.f12816l = null;
        this.f12821q = null;
        this.f12823s = null;
        this.f12802D = null;
        this.f12828x = null;
        this.f12829y = null;
        this.f12799A = null;
        this.f12800B = null;
        this.f12801C = null;
        this.f12825u = 0;
        this.f12804F = false;
        this.f12827w = null;
        this.f12807c.clear();
        this.f12810f.mo18806a(this);
    }

    /* renamed from: o */
    public final void mo16884o() {
        this.f12828x = Thread.currentThread();
        int i = C4421h.f9699b;
        this.f12825u = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.f12804F && this.f12802D != null && !(z = this.f12802D.mo16953a())) {
            this.f12823s = mo16880k(this.f12823s);
            this.f12802D = mo16879j();
            if (this.f12823s == Stage.SOURCE) {
                mo16875f();
                return;
            }
        }
        if ((this.f12823s == Stage.FINISHED || this.f12804F) && !z) {
            mo16882m();
        }
    }

    /* renamed from: p */
    public final void mo16885p() {
        int i = C5985a.f12831a[this.f12824t.ordinal()];
        if (i == 1) {
            this.f12823s = mo16880k(Stage.INITIALIZE);
            this.f12802D = mo16879j();
            mo16884o();
        } else if (i == 2) {
            mo16884o();
        } else if (i == 3) {
            mo16878i();
        } else {
            StringBuilder h = C0072d.m201h("Unrecognized run reason: ");
            h.append(this.f12824t);
            throw new IllegalStateException(h.toString());
        }
    }

    /* renamed from: q */
    public final void mo16886q() {
        Throwable th;
        this.f12808d.mo18831a();
        if (this.f12803E) {
            if (this.f12807c.isEmpty()) {
                th = null;
            } else {
                ArrayList arrayList = this.f12807c;
                th = (Throwable) arrayList.get(arrayList.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f12803E = true;
    }

    public final void run() {
        C5968d<?> dVar = this.f12801C;
        try {
            if (this.f12804F) {
                mo16882m();
                if (dVar != null) {
                    dVar.mo16851b();
                    return;
                }
                return;
            }
            mo16885p();
            if (dVar != null) {
                dVar.mo16851b();
            }
        } catch (CallbackException e) {
            throw e;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.mo16851b();
            }
            throw th;
        }
    }
}
