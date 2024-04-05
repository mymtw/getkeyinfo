package p632nn;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.installations.C16563d;
import com.google.firebase.remoteconfig.internal.C16688a;
import com.google.firebase.remoteconfig.internal.C16690b;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p549dk.C17573c;
import p575gm.C17793c;
import p583hm.C17829b;
import p605kk.C18126j;
import p607km.C18144a;
import p641on.C18325d;
import p641on.C18330h;
import p641on.C18331i;
import p722ym.C18895a;

@KeepForSdk
/* renamed from: nn.g */
public final class C18281g {

    /* renamed from: j */
    public static final Clock f40122j = DefaultClock.getInstance();

    /* renamed from: k */
    public static final Random f40123k = new Random();

    /* renamed from: a */
    public final HashMap f40124a;

    /* renamed from: b */
    public final Context f40125b;

    /* renamed from: c */
    public final ExecutorService f40126c;

    /* renamed from: d */
    public final C17793c f40127d;

    /* renamed from: e */
    public final C16563d f40128e;

    /* renamed from: f */
    public final C17829b f40129f;

    /* renamed from: g */
    public final C18895a<C18144a> f40130g;

    /* renamed from: h */
    public final String f40131h;

    /* renamed from: i */
    public HashMap f40132i;

    public C18281g() {
        throw null;
    }

    public C18281g(Context context, C17793c cVar, C16563d dVar, C17829b bVar, C18895a<C18144a> aVar) {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f40124a = new HashMap();
        this.f40132i = new HashMap();
        this.f40125b = context;
        this.f40126c = newCachedThreadPool;
        this.f40127d = cVar;
        this.f40128e = dVar;
        this.f40129f = bVar;
        this.f40130g = aVar;
        cVar.mo69021a();
        this.f40131h = cVar.f38674c.f38685b;
        C18126j.m30615c(newCachedThreadPool, new C18279e(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p632nn.C18276b mo69830a(p575gm.C17793c r14, java.lang.String r15, com.google.firebase.installations.C16563d r16, p583hm.C17829b r17, java.util.concurrent.ExecutorService r18, p641on.C18325d r19, p641on.C18325d r20, p641on.C18325d r21, com.google.firebase.remoteconfig.internal.C16688a r22, p641on.C18330h r23, com.google.firebase.remoteconfig.internal.C16690b r24) {
        /*
            r13 = this;
            r1 = r13
            r0 = r15
            monitor-enter(r13)
            java.util.HashMap r2 = r1.f40124a     // Catch:{ all -> 0x0059 }
            boolean r2 = r2.containsKey(r15)     // Catch:{ all -> 0x0059 }
            if (r2 != 0) goto L_0x004f
            nn.b r2 = new nn.b     // Catch:{ all -> 0x0059 }
            java.lang.String r3 = "firebase"
            boolean r3 = r15.equals(r3)     // Catch:{ all -> 0x0059 }
            if (r3 == 0) goto L_0x0025
            r14.mo69021a()     // Catch:{ all -> 0x0059 }
            r3 = r14
            java.lang.String r3 = r3.f38673b     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = "[DEFAULT]"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0059 }
            if (r3 == 0) goto L_0x0025
            r3 = 1
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            if (r3 == 0) goto L_0x002b
            r5 = r17
            goto L_0x002d
        L_0x002b:
            r3 = 0
            r5 = r3
        L_0x002d:
            r3 = r2
            r4 = r16
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0059 }
            r20.mo69860b()     // Catch:{ all -> 0x0059 }
            r21.mo69860b()     // Catch:{ all -> 0x0059 }
            r19.mo69860b()     // Catch:{ all -> 0x0059 }
            java.util.HashMap r3 = r1.f40124a     // Catch:{ all -> 0x0059 }
            r3.put(r15, r2)     // Catch:{ all -> 0x0059 }
        L_0x004f:
            java.util.HashMap r2 = r1.f40124a     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r2.get(r15)     // Catch:{ all -> 0x0059 }
            nn.b r0 = (p632nn.C18276b) r0     // Catch:{ all -> 0x0059 }
            monitor-exit(r13)
            return r0
        L_0x0059:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p632nn.C18281g.mo69830a(gm.c, java.lang.String, com.google.firebase.installations.d, hm.b, java.util.concurrent.ExecutorService, on.d, on.d, on.d, com.google.firebase.remoteconfig.internal.a, on.h, com.google.firebase.remoteconfig.internal.b):nn.b");
    }

    @KeepForSdk
    /* renamed from: b */
    public final synchronized C18276b mo69831b(String str) {
        C18325d c;
        C18325d c2;
        C18325d c3;
        C16690b bVar;
        C18330h hVar;
        c = mo69832c(str, "fetch");
        c2 = mo69832c(str, "activate");
        c3 = mo69832c(str, "defaults");
        bVar = new C16690b(this.f40125b.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", this.f40131h, str, "settings"}), 0));
        hVar = new C18330h(this.f40126c, c2, c3);
        C17793c cVar = this.f40127d;
        C18895a<C18144a> aVar = this.f40130g;
        cVar.mo69021a();
        C17573c cVar2 = (!cVar.f38673b.equals("[DEFAULT]") || !str.equals("firebase")) ? null : new C17573c((C18895a) aVar);
        if (cVar2 != null) {
            C18278d dVar = new C18278d(cVar2);
            synchronized (hVar.f40245a) {
                hVar.f40245a.add(dVar);
            }
        }
        return mo69830a(this.f40127d, str, this.f40128e, this.f40129f, this.f40126c, c, c2, c3, mo69833d(str, c, bVar), hVar, bVar);
    }

    /* renamed from: c */
    public final C18325d mo69832c(String str, String str2) {
        C18331i iVar;
        C18325d dVar;
        String format = String.format("%s_%s_%s_%s.json", new Object[]{"frc", this.f40131h, str, str2});
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        Context context = this.f40125b;
        HashMap hashMap = C18331i.f40249c;
        synchronized (C18331i.class) {
            HashMap hashMap2 = C18331i.f40249c;
            if (!hashMap2.containsKey(format)) {
                hashMap2.put(format, new C18331i(context, format));
            }
            iVar = (C18331i) hashMap2.get(format);
        }
        HashMap hashMap3 = C18325d.f40225d;
        synchronized (C18325d.class) {
            String str3 = iVar.f40251b;
            HashMap hashMap4 = C18325d.f40225d;
            if (!hashMap4.containsKey(str3)) {
                hashMap4.put(str3, new C18325d(newCachedThreadPool, iVar));
            }
            dVar = (C18325d) hashMap4.get(str3);
        }
        return dVar;
    }

    /* renamed from: d */
    public final synchronized C16688a mo69833d(String str, C18325d dVar, C16690b bVar) {
        C18895a<C18144a> aVar;
        C16688a aVar2;
        C16690b bVar2 = bVar;
        synchronized (this) {
            C16563d dVar2 = this.f40128e;
            C17793c cVar = this.f40127d;
            cVar.mo69021a();
            if (cVar.f38673b.equals("[DEFAULT]")) {
                aVar = this.f40130g;
            } else {
                new C18280f
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: CONSTRUCTOR  (r2v8 ? I:nn.f) =  call: nn.f.<init>():void type: CONSTRUCTOR in method: nn.g.d(java.lang.String, on.d, com.google.firebase.remoteconfig.internal.b):com.google.firebase.remoteconfig.internal.a, dex: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:260)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v8 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 41 more
                    */
                /*
                    this = this;
                    r1 = r23
                    r0 = r26
                    monitor-enter(r23)
                    com.google.firebase.remoteconfig.internal.a r12 = new com.google.firebase.remoteconfig.internal.a     // Catch:{ all -> 0x006a }
                    com.google.firebase.installations.d r3 = r1.f40128e     // Catch:{ all -> 0x006a }
                    gm.c r2 = r1.f40127d     // Catch:{ all -> 0x006a }
                    r2.mo69021a()     // Catch:{ all -> 0x006a }
                    java.lang.String r2 = r2.f38673b     // Catch:{ all -> 0x006a }
                    java.lang.String r4 = "[DEFAULT]"
                    boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x006a }
                    if (r2 == 0) goto L_0x001b
                    ym.a<km.a> r2 = r1.f40130g     // Catch:{ all -> 0x006a }
                    goto L_0x0020
                L_0x001b:
                    nn.f r2 = new nn.f     // Catch:{ all -> 0x006a }
                    r2.<init>()     // Catch:{ all -> 0x006a }
                L_0x0020:
                    r4 = r2
                    java.util.concurrent.ExecutorService r5 = r1.f40126c     // Catch:{ all -> 0x006a }
                    com.google.android.gms.common.util.Clock r6 = f40122j     // Catch:{ all -> 0x006a }
                    java.util.Random r7 = f40123k     // Catch:{ all -> 0x006a }
                    gm.c r2 = r1.f40127d     // Catch:{ all -> 0x006a }
                    r2.mo69021a()     // Catch:{ all -> 0x006a }
                    gm.e r2 = r2.f38674c     // Catch:{ all -> 0x006a }
                    java.lang.String r2 = r2.f38684a     // Catch:{ all -> 0x006a }
                    gm.c r8 = r1.f40127d     // Catch:{ all -> 0x006a }
                    r8.mo69021a()     // Catch:{ all -> 0x006a }
                    gm.e r8 = r8.f38674c     // Catch:{ all -> 0x006a }
                    java.lang.String r15 = r8.f38685b     // Catch:{ all -> 0x006a }
                    com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient r9 = new com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient     // Catch:{ all -> 0x006a }
                    android.content.Context r14 = r1.f40125b     // Catch:{ all -> 0x006a }
                    android.content.SharedPreferences r8 = r0.f36915a     // Catch:{ all -> 0x006a }
                    java.lang.String r10 = "fetch_timeout_in_seconds"
                    r11 = r6
                    r22 = r7
                    r6 = 60
                    long r18 = r8.getLong(r10, r6)     // Catch:{ all -> 0x006a }
                    android.content.SharedPreferences r8 = r0.f36915a     // Catch:{ all -> 0x006a }
                    java.lang.String r10 = "fetch_timeout_in_seconds"
                    long r20 = r8.getLong(r10, r6)     // Catch:{ all -> 0x006a }
                    r13 = r9
                    r16 = r2
                    r17 = r24
                    r13.<init>(r14, r15, r16, r17, r18, r20)     // Catch:{ all -> 0x006a }
                    java.util.HashMap r13 = r1.f40132i     // Catch:{ all -> 0x006a }
                    r2 = r12
                    r6 = r11
                    r7 = r22
                    r8 = r25
                    r10 = r26
                    r11 = r13
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x006a }
                    monitor-exit(r23)
                    return r12
                L_0x006a:
                    r0 = move-exception
                    monitor-exit(r23)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p632nn.C18281g.mo69833d(java.lang.String, on.d, com.google.firebase.remoteconfig.internal.b):com.google.firebase.remoteconfig.internal.a");
            }
        }
