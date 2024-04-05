package androidx.datastore.core;

import androidx.datastore.preferences.core.C2496c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19771r;
import kotlinx.coroutines.C19792s;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19665q1;
import kotlinx.coroutines.flow.StateFlowImpl;
import p148j1.C7099a;
import p753kq.C19846a;
import p753kq.C19861p;

public final class SingleProcessDataStore<T> implements C2478e<T> {

    /* renamed from: k */
    public static final LinkedHashSet f5726k = new LinkedHashSet();

    /* renamed from: l */
    public static final Object f5727l = new Object();

    /* renamed from: a */
    public final C19846a<File> f5728a;

    /* renamed from: b */
    public final C2483j<T> f5729b;

    /* renamed from: c */
    public final C2473a<T> f5730c;

    /* renamed from: d */
    public final C19525d0 f5731d;

    /* renamed from: e */
    public final C19665q1 f5732e = new C19665q1(new SingleProcessDataStore$data$1(this, (C19340c<? super SingleProcessDataStore$data$1>) null));

    /* renamed from: f */
    public final String f5733f = ".tmp";

    /* renamed from: g */
    public final C19285c f5734g = C19350d.m32677b(new SingleProcessDataStore$file$2(this));

    /* renamed from: h */
    public final StateFlowImpl f5735h = C19388s.m32862g(C2485l.f5754a);

    /* renamed from: i */
    public List<? extends C19861p<? super C2481h<T>, ? super C19340c<? super C19394m>, ? extends Object>> f5736i;

    /* renamed from: j */
    public final SimpleActor<C2467a<T>> f5737j;

    /* renamed from: androidx.datastore.core.SingleProcessDataStore$a */
    public static abstract class C2467a<T> {

        /* renamed from: androidx.datastore.core.SingleProcessDataStore$a$a */
        public static final class C2468a<T> extends C2467a<T> {

            /* renamed from: a */
            public final C2484k<T> f5738a;

            public C2468a(C2484k<T> kVar) {
                this.f5738a = kVar;
            }
        }

        /* renamed from: androidx.datastore.core.SingleProcessDataStore$a$b */
        public static final class C2469b<T> extends C2467a<T> {

            /* renamed from: a */
            public final C19861p<T, C19340c<? super T>, Object> f5739a;

            /* renamed from: b */
            public final C19771r<T> f5740b;

            /* renamed from: c */
            public final C2484k<T> f5741c;

            /* renamed from: d */
            public final CoroutineContext f5742d;

            public C2469b(C19861p pVar, C19792s sVar, C2484k kVar, CoroutineContext coroutineContext) {
                C19383o.m32797g(coroutineContext, "callerContext");
                this.f5739a = pVar;
                this.f5740b = sVar;
                this.f5741c = kVar;
                this.f5742d = coroutineContext;
            }
        }
    }

    /* renamed from: androidx.datastore.core.SingleProcessDataStore$b */
    public static final class C2470b extends OutputStream {

        /* renamed from: b */
        public final FileOutputStream f5743b;

        public C2470b(FileOutputStream fileOutputStream) {
            this.f5743b = fileOutputStream;
        }

        public final void close() {
        }

        public final void flush() {
            this.f5743b.flush();
        }

        public final void write(int i) {
            this.f5743b.write(i);
        }

        public final void write(byte[] bArr) {
            C19383o.m32797g(bArr, "b");
            this.f5743b.write(bArr);
        }

        public final void write(byte[] bArr, int i, int i2) {
            C19383o.m32797g(bArr, "bytes");
            this.f5743b.write(bArr, i, i2);
        }
    }

    public SingleProcessDataStore(C19846a aVar, List list, C7099a aVar2, C19525d0 d0Var) {
        C2496c cVar = C2496c.f5765a;
        C19383o.m32797g(d0Var, "scope");
        this.f5728a = aVar;
        this.f5729b = cVar;
        this.f5730c = aVar2;
        this.f5731d = d0Var;
        this.f5736i = C19327t.m32660p1(list);
        this.f5737j = new SimpleActor<>(d0Var, new SingleProcessDataStore$actor$1(this), SingleProcessDataStore$actor$2.INSTANCE, new SingleProcessDataStore$actor$3(this, (C19340c<? super SingleProcessDataStore$actor$3>) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m5426b(androidx.datastore.core.SingleProcessDataStore r8, androidx.datastore.core.SingleProcessDataStore.C2467a.C2469b r9, kotlin.coroutines.C19340c r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof androidx.datastore.core.SingleProcessDataStore$handleUpdate$1
            if (r0 == 0) goto L_0x0016
            r0 = r10
            androidx.datastore.core.SingleProcessDataStore$handleUpdate$1 r0 = (androidx.datastore.core.SingleProcessDataStore$handleUpdate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x001b
        L_0x0016:
            androidx.datastore.core.SingleProcessDataStore$handleUpdate$1 r0 = new androidx.datastore.core.SingleProcessDataStore$handleUpdate$1
            r0.<init>(r8, r10)
        L_0x001b:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r5) goto L_0x0045
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.r r8 = (kotlinx.coroutines.C19771r) r8
            java.lang.Object r9 = r0.L$1
            androidx.datastore.core.SingleProcessDataStore r9 = (androidx.datastore.core.SingleProcessDataStore) r9
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore$a$b r2 = (androidx.datastore.core.SingleProcessDataStore.C2467a.C2469b) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)     // Catch:{ all -> 0x004d }
            goto L_0x0090
        L_0x0045:
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.r r8 = (kotlinx.coroutines.C19771r) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)     // Catch:{ all -> 0x004d }
            goto L_0x00a9
        L_0x004d:
            r9 = move-exception
            goto L_0x00c8
        L_0x0050:
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            kotlinx.coroutines.r<T> r10 = r9.f5740b
            kotlinx.coroutines.flow.StateFlowImpl r2 = r8.f5735h     // Catch:{ all -> 0x00c5 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00c5 }
            androidx.datastore.core.k r2 = (androidx.datastore.core.C2484k) r2     // Catch:{ all -> 0x00c5 }
            boolean r6 = r2 instanceof androidx.datastore.core.C2474b     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x0071
            kq.p<T, kotlin.coroutines.c<? super T>, java.lang.Object> r2 = r9.f5739a     // Catch:{ all -> 0x00c5 }
            kotlin.coroutines.CoroutineContext r9 = r9.f5742d     // Catch:{ all -> 0x00c5 }
            r0.L$0 = r10     // Catch:{ all -> 0x00c5 }
            r0.label = r5     // Catch:{ all -> 0x00c5 }
            java.lang.Object r8 = r8.mo9311i(r0, r9, r2)     // Catch:{ all -> 0x00c5 }
            if (r8 != r1) goto L_0x00a6
            goto L_0x00df
        L_0x0071:
            boolean r6 = r2 instanceof androidx.datastore.core.C2482i     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            boolean r5 = r2 instanceof androidx.datastore.core.C2485l     // Catch:{ all -> 0x00c5 }
        L_0x0078:
            if (r5 == 0) goto L_0x00b6
            androidx.datastore.core.k<T> r5 = r9.f5741c     // Catch:{ all -> 0x00c5 }
            if (r2 != r5) goto L_0x00b1
            r0.L$0 = r9     // Catch:{ all -> 0x00c5 }
            r0.L$1 = r8     // Catch:{ all -> 0x00c5 }
            r0.L$2 = r10     // Catch:{ all -> 0x00c5 }
            r0.label = r4     // Catch:{ all -> 0x00c5 }
            java.lang.Object r2 = r8.mo9306e(r0)     // Catch:{ all -> 0x00c5 }
            if (r2 != r1) goto L_0x008d
            goto L_0x00df
        L_0x008d:
            r2 = r9
            r9 = r8
            r8 = r10
        L_0x0090:
            kq.p<T, kotlin.coroutines.c<? super T>, java.lang.Object> r10 = r2.f5739a     // Catch:{ all -> 0x00ae }
            kotlin.coroutines.CoroutineContext r2 = r2.f5742d     // Catch:{ all -> 0x00ae }
            r0.L$0 = r8     // Catch:{ all -> 0x00ae }
            r4 = 0
            r0.L$1 = r4     // Catch:{ all -> 0x00ae }
            r0.L$2 = r4     // Catch:{ all -> 0x00ae }
            r0.label = r3     // Catch:{ all -> 0x00ae }
            java.lang.Object r9 = r9.mo9311i(r0, r2, r10)     // Catch:{ all -> 0x00ae }
            if (r9 != r1) goto L_0x00a4
            goto L_0x00df
        L_0x00a4:
            r10 = r8
            r8 = r9
        L_0x00a6:
            r7 = r10
            r10 = r8
            r8 = r7
        L_0x00a9:
            java.lang.Object r9 = kotlin.Result.m35480constructorimpl(r10)     // Catch:{ all -> 0x004d }
            goto L_0x00d0
        L_0x00ae:
            r9 = move-exception
            r10 = r8
            goto L_0x00c7
        L_0x00b1:
            androidx.datastore.core.i r2 = (androidx.datastore.core.C2482i) r2     // Catch:{ all -> 0x00c5 }
            java.lang.Throwable r8 = r2.f5753a     // Catch:{ all -> 0x00c5 }
            throw r8     // Catch:{ all -> 0x00c5 }
        L_0x00b6:
            boolean r8 = r2 instanceof androidx.datastore.core.C2480g     // Catch:{ all -> 0x00c5 }
            if (r8 == 0) goto L_0x00bf
            androidx.datastore.core.g r2 = (androidx.datastore.core.C2480g) r2     // Catch:{ all -> 0x00c5 }
            java.lang.Throwable r8 = r2.f5752a     // Catch:{ all -> 0x00c5 }
            throw r8     // Catch:{ all -> 0x00c5 }
        L_0x00bf:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00c5 }
            r8.<init>()     // Catch:{ all -> 0x00c5 }
            throw r8     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r8 = move-exception
            r9 = r8
        L_0x00c7:
            r8 = r10
        L_0x00c8:
            kotlin.Result$Failure r9 = androidx.compose.foundation.layout.C0761x.m1673J(r9)
            java.lang.Object r9 = kotlin.Result.m35480constructorimpl(r9)
        L_0x00d0:
            java.lang.Throwable r10 = kotlin.Result.m35483exceptionOrNullimpl(r9)
            if (r10 != 0) goto L_0x00da
            r8.mo72564B(r9)
            goto L_0x00dd
        L_0x00da:
            r8.mo72565x(r10)
        L_0x00dd:
            kotlin.m r1 = kotlin.C19394m.f43287a
        L_0x00df:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.m5426b(androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore$a$b, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public final Object mo9303a(C19861p<? super T, ? super C19340c<? super T>, ? extends Object> pVar, C19340c<? super T> cVar) {
        C19792s sVar = new C19792s((C19699g1) null);
        this.f5737j.mo9300a(new C2467a.C2469b(pVar, sVar, (C2484k) this.f5735h.getValue(), cVar.getContext()));
        return sVar.mo72507I(cVar);
    }

    /* renamed from: c */
    public final File mo9304c() {
        return (File) this.f5734g.getValue();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0108 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo9305d(kotlin.coroutines.C19340c<? super kotlin.C19394m> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInit$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.datastore.core.SingleProcessDataStore$readAndInit$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$readAndInit$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInit$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x007c
            if (r2 == r6) goto L_0x0065
            if (r2 == r4) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            java.lang.Object r1 = r0.L$3
            kotlinx.coroutines.sync.c r1 = (kotlinx.coroutines.sync.C19814c) r1
            java.lang.Object r2 = r0.L$2
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref$BooleanRef) r2
            java.lang.Object r3 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref$ObjectRef) r3
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            goto L_0x010c
        L_0x0040:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0048:
            java.lang.Object r2 = r0.L$5
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r8 = r0.L$4
            androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1 r8 = (androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1) r8
            java.lang.Object r9 = r0.L$3
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref$BooleanRef) r9
            java.lang.Object r10 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.sync.c r11 = (kotlinx.coroutines.sync.C19814c) r11
            java.lang.Object r12 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r12 = (androidx.datastore.core.SingleProcessDataStore) r12
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            goto L_0x00d1
        L_0x0065:
            java.lang.Object r2 = r0.L$3
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r8 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref$ObjectRef) r8
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.sync.c r9 = (kotlinx.coroutines.sync.C19814c) r9
            java.lang.Object r10 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r10 = (androidx.datastore.core.SingleProcessDataStore) r10
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            r11 = r9
            r12 = r10
            r10 = r8
            goto L_0x00bb
        L_0x007c:
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            kotlinx.coroutines.flow.StateFlowImpl r14 = r13.f5735h
            java.lang.Object r14 = r14.getValue()
            androidx.datastore.core.l r2 = androidx.datastore.core.C2485l.f5754a
            boolean r14 = kotlin.jvm.internal.C19383o.m32792b(r14, r2)
            if (r14 != 0) goto L_0x009a
            kotlinx.coroutines.flow.StateFlowImpl r14 = r13.f5735h
            java.lang.Object r14 = r14.getValue()
            boolean r14 = r14 instanceof androidx.datastore.core.C2482i
            if (r14 == 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            r14 = r5
            goto L_0x009b
        L_0x009a:
            r14 = r6
        L_0x009b:
            if (r14 == 0) goto L_0x012d
            kotlinx.coroutines.sync.MutexImpl r14 = p514bk.C14088a.m21779d()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            r0.L$0 = r13
            r0.L$1 = r14
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r6
            java.lang.Object r8 = r13.mo9310h(r0)
            if (r8 != r1) goto L_0x00b7
            return r1
        L_0x00b7:
            r12 = r13
            r11 = r14
            r10 = r2
            r14 = r8
        L_0x00bb:
            r2.element = r14
            kotlin.jvm.internal.Ref$BooleanRef r9 = new kotlin.jvm.internal.Ref$BooleanRef
            r9.<init>()
            androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1 r8 = new androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1
            r8.<init>(r11, r9, r10, r12)
            java.util.List<? extends kq.p<? super androidx.datastore.core.h<T>, ? super kotlin.coroutines.c<? super kotlin.m>, ? extends java.lang.Object>> r14 = r12.f5736i
            if (r14 != 0) goto L_0x00cd
        L_0x00cb:
            r2 = r9
            goto L_0x00f2
        L_0x00cd:
            java.util.Iterator r2 = r14.iterator()
        L_0x00d1:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00cb
            java.lang.Object r14 = r2.next()
            kq.p r14 = (p753kq.C19861p) r14
            r0.L$0 = r12
            r0.L$1 = r11
            r0.L$2 = r10
            r0.L$3 = r9
            r0.L$4 = r8
            r0.L$5 = r2
            r0.label = r4
            java.lang.Object r14 = r14.invoke(r8, r0)
            if (r14 != r1) goto L_0x00d1
            return r1
        L_0x00f2:
            r12.f5736i = r7
            r0.L$0 = r12
            r0.L$1 = r10
            r0.L$2 = r2
            r0.L$3 = r11
            r0.L$4 = r7
            r0.L$5 = r7
            r0.label = r3
            java.lang.Object r14 = r11.mo72641c(r7, r0)
            if (r14 != r1) goto L_0x0109
            return r1
        L_0x0109:
            r3 = r10
            r1 = r11
            r0 = r12
        L_0x010c:
            r2.element = r6     // Catch:{ all -> 0x0128 }
            kotlin.m r14 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0128 }
            r1.mo72642d(r7)
            kotlinx.coroutines.flow.StateFlowImpl r14 = r0.f5735h
            androidx.datastore.core.b r0 = new androidx.datastore.core.b
            T r1 = r3.element
            if (r1 == 0) goto L_0x011f
            int r5 = r1.hashCode()
        L_0x011f:
            r0.<init>(r1, r5)
            r14.setValue(r0)
            kotlin.m r14 = kotlin.C19394m.f43287a
            return r14
        L_0x0128:
            r14 = move-exception
            r1.mo72642d(r7)
            throw r14
        L_0x012d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.mo9305d(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo9306e(kotlin.coroutines.C19340c<? super kotlin.C19394m> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)     // Catch:{ all -> 0x002b }
            goto L_0x0043
        L_0x002b:
            r5 = move-exception
            goto L_0x0048
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            r0.L$0 = r4     // Catch:{ all -> 0x0046 }
            r0.label = r3     // Catch:{ all -> 0x0046 }
            java.lang.Object r5 = r4.mo9305d(r0)     // Catch:{ all -> 0x0046 }
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            kotlin.m r5 = kotlin.C19394m.f43287a
            return r5
        L_0x0046:
            r5 = move-exception
            r0 = r4
        L_0x0048:
            kotlinx.coroutines.flow.StateFlowImpl r0 = r0.f5735h
            androidx.datastore.core.i r1 = new androidx.datastore.core.i
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.mo9306e(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo9307f(kotlin.coroutines.C19340c<? super kotlin.C19394m> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)     // Catch:{ all -> 0x002b }
            goto L_0x004f
        L_0x002b:
            r5 = move-exception
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            r0.L$0 = r4     // Catch:{ all -> 0x0043 }
            r0.label = r3     // Catch:{ all -> 0x0043 }
            java.lang.Object r5 = r4.mo9305d(r0)     // Catch:{ all -> 0x0043 }
            if (r5 != r1) goto L_0x004f
            return r1
        L_0x0043:
            r5 = move-exception
            r0 = r4
        L_0x0045:
            kotlinx.coroutines.flow.StateFlowImpl r0 = r0.f5735h
            androidx.datastore.core.i r1 = new androidx.datastore.core.i
            r1.<init>(r5)
            r0.setValue(r1)
        L_0x004f:
            kotlin.m r5 = kotlin.C19394m.f43287a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.mo9307f(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        kotlin.reflect.C19421p.m32917E(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006b, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:24:0x005e, B:30:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo9308g(kotlin.coroutines.C19340c<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.SingleProcessDataStore$readData$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.datastore.core.SingleProcessDataStore$readData$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$readData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readData$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r1 = r0.L$2
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.L$1
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)     // Catch:{ all -> 0x0033 }
            goto L_0x005e
        L_0x0033:
            r6 = move-exception
            goto L_0x0066
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003d:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x006c }
            java.io.File r6 = r5.mo9304c()     // Catch:{ FileNotFoundException -> 0x006c }
            r2.<init>(r6)     // Catch:{ FileNotFoundException -> 0x006c }
            r6 = 0
            androidx.datastore.core.j<T> r4 = r5.f5729b     // Catch:{ all -> 0x0064 }
            r0.L$0 = r5     // Catch:{ all -> 0x0064 }
            r0.L$1 = r2     // Catch:{ all -> 0x0064 }
            r0.L$2 = r6     // Catch:{ all -> 0x0064 }
            r0.label = r3     // Catch:{ all -> 0x0064 }
            androidx.datastore.preferences.core.MutablePreferences r0 = r4.mo9331b(r2)     // Catch:{ all -> 0x0064 }
            if (r0 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r1 = r6
            r6 = r0
            r0 = r5
        L_0x005e:
            kotlin.reflect.C19421p.m32917E(r2, r1)     // Catch:{ FileNotFoundException -> 0x0062 }
            return r6
        L_0x0062:
            r6 = move-exception
            goto L_0x006e
        L_0x0064:
            r6 = move-exception
            r0 = r5
        L_0x0066:
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r1 = move-exception
            kotlin.reflect.C19421p.m32917E(r2, r6)     // Catch:{ FileNotFoundException -> 0x0062 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0062 }
        L_0x006c:
            r6 = move-exception
            r0 = r5
        L_0x006e:
            java.io.File r1 = r0.mo9304c()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x007f
            androidx.datastore.core.j<T> r6 = r0.f5729b
            androidx.datastore.preferences.core.MutablePreferences r6 = r6.mo9330a()
            return r6
        L_0x007f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.mo9308g(kotlin.coroutines.c):java.lang.Object");
    }

    public final C19597d<T> getData() {
        return this.f5732e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo9310h(kotlin.coroutines.C19340c<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r5) goto L_0x0049
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r1 = r0.L$1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)     // Catch:{ IOException -> 0x0033 }
            goto L_0x0085
        L_0x0033:
            r8 = move-exception
            goto L_0x0088
        L_0x0035:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003d:
            java.lang.Object r2 = r0.L$1
            androidx.datastore.core.CorruptionException r2 = (androidx.datastore.core.CorruptionException) r2
            java.lang.Object r4 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r4 = (androidx.datastore.core.SingleProcessDataStore) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x0077
        L_0x0049:
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)     // Catch:{ CorruptionException -> 0x0051 }
            goto L_0x0061
        L_0x0051:
            r8 = move-exception
            goto L_0x0064
        L_0x0053:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            r0.L$0 = r7     // Catch:{ CorruptionException -> 0x0062 }
            r0.label = r5     // Catch:{ CorruptionException -> 0x0062 }
            java.lang.Object r8 = r7.mo9308g(r0)     // Catch:{ CorruptionException -> 0x0062 }
            if (r8 != r1) goto L_0x0061
            return r1
        L_0x0061:
            return r8
        L_0x0062:
            r8 = move-exception
            r2 = r7
        L_0x0064:
            androidx.datastore.core.a<T> r5 = r2.f5730c
            r0.L$0 = r2
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r4 = r5.mo9325a(r8)
            if (r4 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L_0x0077:
            r0.L$0 = r2     // Catch:{ IOException -> 0x0086 }
            r0.L$1 = r8     // Catch:{ IOException -> 0x0086 }
            r0.label = r3     // Catch:{ IOException -> 0x0086 }
            java.lang.Object r0 = r4.mo9312j(r8, r0)     // Catch:{ IOException -> 0x0086 }
            if (r0 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r1 = r8
        L_0x0085:
            return r1
        L_0x0086:
            r8 = move-exception
            r0 = r2
        L_0x0088:
            p568fn.C17782b.m29886t(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.mo9310h(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo9311i(kotlin.coroutines.C19340c r8, kotlin.coroutines.CoroutineContext r9, p753kq.C19861p r10) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 r0 = (androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 r0 = new androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.lang.Object r9 = r0.L$1
            java.lang.Object r10 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r10 = (androidx.datastore.core.SingleProcessDataStore) r10
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x008a
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            java.lang.Object r9 = r0.L$2
            java.lang.Object r10 = r0.L$1
            androidx.datastore.core.b r10 = (androidx.datastore.core.C2474b) r10
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x006f
        L_0x0047:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            kotlinx.coroutines.flow.StateFlowImpl r8 = r7.f5735h
            java.lang.Object r8 = r8.getValue()
            androidx.datastore.core.b r8 = (androidx.datastore.core.C2474b) r8
            r8.mo9326a()
            T r2 = r8.f5749a
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1 r6 = new androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1
            r6.<init>(r10, r2, r3)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r2
            r0.label = r5
            java.lang.Object r9 = kotlinx.coroutines.C19697g.m33471i(r0, r9, r6)
            if (r9 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r10 = r8
            r8 = r9
            r9 = r2
            r2 = r7
        L_0x006f:
            r10.mo9326a()
            boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r9, r8)
            if (r10 == 0) goto L_0x0079
            goto L_0x009c
        L_0x0079:
            r0.L$0 = r2
            r0.L$1 = r8
            r0.L$2 = r3
            r0.label = r4
            java.lang.Object r9 = r2.mo9312j(r8, r0)
            if (r9 != r1) goto L_0x0088
            return r1
        L_0x0088:
            r9 = r8
            r10 = r2
        L_0x008a:
            kotlinx.coroutines.flow.StateFlowImpl r8 = r10.f5735h
            androidx.datastore.core.b r10 = new androidx.datastore.core.b
            if (r9 == 0) goto L_0x0095
            int r0 = r9.hashCode()
            goto L_0x0096
        L_0x0095:
            r0 = 0
        L_0x0096:
            r10.<init>(r9, r0)
            r8.setValue(r10)
        L_0x009c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.mo9311i(kotlin.coroutines.c, kotlin.coroutines.CoroutineContext, kq.p):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b1 A[SYNTHETIC, Splitter:B:35:0x00b1] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo9312j(T r8, kotlin.coroutines.C19340c<? super kotlin.C19394m> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.SingleProcessDataStore$writeData$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.datastore.core.SingleProcessDataStore$writeData$1 r0 = (androidx.datastore.core.SingleProcessDataStore$writeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$writeData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$writeData$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            java.lang.Object r8 = r0.L$4
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.L$3
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.L$2
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.L$1
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ all -> 0x003b }
            goto L_0x0098
        L_0x003b:
            r8 = move-exception
            goto L_0x00d0
        L_0x003e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0046:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            java.io.File r9 = r7.mo9304c()
            java.io.File r2 = r9.getCanonicalFile()
            java.io.File r2 = r2.getParentFile()
            if (r2 != 0) goto L_0x0058
            goto L_0x0061
        L_0x0058:
            r2.mkdirs()
            boolean r2 = r2.isDirectory()
            if (r2 == 0) goto L_0x00e4
        L_0x0061:
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.mo9304c()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f5733f
            java.lang.String r2 = kotlin.jvm.internal.C19383o.m32802l(r4, r2)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00d9 }
            r2.<init>(r9)     // Catch:{ IOException -> 0x00d9 }
            r4 = 0
            androidx.datastore.core.j<T> r5 = r7.f5729b     // Catch:{ all -> 0x00d2 }
            androidx.datastore.core.SingleProcessDataStore$b r6 = new androidx.datastore.core.SingleProcessDataStore$b     // Catch:{ all -> 0x00d2 }
            r6.<init>(r2)     // Catch:{ all -> 0x00d2 }
            r0.L$0 = r7     // Catch:{ all -> 0x00d2 }
            r0.L$1 = r9     // Catch:{ all -> 0x00d2 }
            r0.L$2 = r2     // Catch:{ all -> 0x00d2 }
            r0.L$3 = r4     // Catch:{ all -> 0x00d2 }
            r0.L$4 = r2     // Catch:{ all -> 0x00d2 }
            r0.label = r3     // Catch:{ all -> 0x00d2 }
            kotlin.m r8 = r5.mo9332c(r8, r6)     // Catch:{ all -> 0x00d2 }
            if (r8 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r4
        L_0x0098:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch:{ all -> 0x003b }
            r8.sync()     // Catch:{ all -> 0x003b }
            kotlin.m r8 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x003b }
            kotlin.reflect.C19421p.m32917E(r2, r1)     // Catch:{ IOException -> 0x00cd }
            java.io.File r8 = r0.mo9304c()     // Catch:{ IOException -> 0x00cd }
            boolean r8 = r3.renameTo(r8)     // Catch:{ IOException -> 0x00cd }
            if (r8 == 0) goto L_0x00b1
            kotlin.m r8 = kotlin.C19394m.f43287a
            return r8
        L_0x00b1:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ IOException -> 0x00cd }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00cd }
            r9.<init>()     // Catch:{ IOException -> 0x00cd }
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch:{ IOException -> 0x00cd }
            r9.append(r3)     // Catch:{ IOException -> 0x00cd }
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch:{ IOException -> 0x00cd }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x00cd }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00cd }
            throw r8     // Catch:{ IOException -> 0x00cd }
        L_0x00cd:
            r8 = move-exception
            r9 = r3
            goto L_0x00da
        L_0x00d0:
            r9 = r3
            goto L_0x00d3
        L_0x00d2:
            r8 = move-exception
        L_0x00d3:
            throw r8     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r0 = move-exception
            kotlin.reflect.C19421p.m32917E(r2, r8)     // Catch:{ IOException -> 0x00d9 }
            throw r0     // Catch:{ IOException -> 0x00d9 }
        L_0x00d9:
            r8 = move-exception
        L_0x00da:
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x00e3
            r9.delete()
        L_0x00e3:
            throw r8
        L_0x00e4:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Unable to create parent directories of "
            java.lang.String r9 = kotlin.jvm.internal.C19383o.m32802l(r9, r0)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.mo9312j(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
