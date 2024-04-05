package com.google.gson.internal;

import com.google.gson.C16797k;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.SortedSet;
import kotlin.reflect.C19421p;
import p667rn.C18500b;
import p675sn.C18541a;

/* renamed from: com.google.gson.internal.b */
public final class C16727b {

    /* renamed from: a */
    public final Map<Type, C16797k<?>> f36990a;

    /* renamed from: b */
    public final C18500b f36991b = C18500b.f40739a;

    /* renamed from: com.google.gson.internal.b$a */
    public class C16728a implements C16790g<T> {

        /* renamed from: b */
        public final /* synthetic */ C16797k f36992b;

        public C16728a(C16797k kVar, Type type) {
            this.f36992b = kVar;
        }

        /* renamed from: i */
        public final T mo1134i() {
            return this.f36992b.createInstance();
        }
    }

    /* renamed from: com.google.gson.internal.b$b */
    public class C16729b implements C16790g<T> {

        /* renamed from: b */
        public final /* synthetic */ C16797k f36993b;

        public C16729b(C16797k kVar, Type type) {
            this.f36993b = kVar;
        }

        /* renamed from: i */
        public final T mo1134i() {
            return this.f36993b.createInstance();
        }
    }

    public C16727b(Map<Type, C16797k<?>> map) {
        this.f36990a = map;
    }

    /* renamed from: a */
    public final <T> C16790g<T> mo59573a(C18541a<T> aVar) {
        C16786c cVar;
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        C16797k kVar = this.f36990a.get(type);
        if (kVar != null) {
            return new C16728a(kVar, type);
        }
        C16797k kVar2 = this.f36990a.get(rawType);
        if (kVar2 != null) {
            return new C16729b(kVar2, type);
        }
        C16787d dVar = null;
        try {
            Constructor<? super T> declaredConstructor = rawType.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f36991b.mo70008a(declaredConstructor);
            }
            cVar = new C16786c(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            if (SortedSet.class.isAssignableFrom(rawType)) {
                new C19421p
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0057: CONSTRUCTOR  (r1v35 ? I:kotlin.reflect.p) =  call: kotlin.reflect.p.<init>():void type: CONSTRUCTOR in method: com.google.gson.internal.b.a(sn.a):com.google.gson.internal.g<T>, dex: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v35 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 51 more
                    */
                /*
                    this = this;
                    java.lang.reflect.Type r0 = r6.getType()
                    java.lang.Class r6 = r6.getRawType()
                    java.util.Map<java.lang.reflect.Type, com.google.gson.k<?>> r1 = r5.f36990a
                    java.lang.Object r1 = r1.get(r0)
                    com.google.gson.k r1 = (com.google.gson.C16797k) r1
                    if (r1 == 0) goto L_0x0018
                    com.google.gson.internal.b$a r6 = new com.google.gson.internal.b$a
                    r6.<init>(r1, r0)
                    return r6
                L_0x0018:
                    java.util.Map<java.lang.reflect.Type, com.google.gson.k<?>> r1 = r5.f36990a
                    java.lang.Object r1 = r1.get(r6)
                    com.google.gson.k r1 = (com.google.gson.C16797k) r1
                    if (r1 == 0) goto L_0x0028
                    com.google.gson.internal.b$b r6 = new com.google.gson.internal.b$b
                    r6.<init>(r1, r0)
                    return r6
                L_0x0028:
                    r1 = 0
                    r2 = 0
                    java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0041 }
                    java.lang.reflect.Constructor r3 = r6.getDeclaredConstructor(r3)     // Catch:{ NoSuchMethodException -> 0x0041 }
                    boolean r4 = r3.isAccessible()     // Catch:{ NoSuchMethodException -> 0x0041 }
                    if (r4 != 0) goto L_0x003b
                    rn.b r4 = r5.f36991b     // Catch:{ NoSuchMethodException -> 0x0041 }
                    r4.mo70008a(r3)     // Catch:{ NoSuchMethodException -> 0x0041 }
                L_0x003b:
                    com.google.gson.internal.c r4 = new com.google.gson.internal.c     // Catch:{ NoSuchMethodException -> 0x0041 }
                    r4.<init>(r3)     // Catch:{ NoSuchMethodException -> 0x0041 }
                    goto L_0x0042
                L_0x0041:
                    r4 = r1
                L_0x0042:
                    if (r4 == 0) goto L_0x0045
                    return r4
                L_0x0045:
                    java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
                    boolean r3 = r3.isAssignableFrom(r6)
                    if (r3 == 0) goto L_0x008e
                    java.lang.Class<java.util.SortedSet> r1 = java.util.SortedSet.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x005c
                    kotlin.reflect.p r1 = new kotlin.reflect.p
                    r1.<init>()
                    goto L_0x00e8
                L_0x005c:
                    java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x006b
                    com.google.gson.internal.d r1 = new com.google.gson.internal.d
                    r1.<init>(r0)
                    goto L_0x00e8
                L_0x006b:
                    java.lang.Class<java.util.Set> r1 = java.util.Set.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x007a
                    com.google.android.play.core.appupdate.d r1 = new com.google.android.play.core.appupdate.d
                    r1.<init>()
                    goto L_0x00e8
                L_0x007a:
                    java.lang.Class<java.util.Queue> r1 = java.util.Queue.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x0088
                    androidx.compose.foundation.layout.x r1 = new androidx.compose.foundation.layout.x
                    r1.<init>()
                    goto L_0x00e8
                L_0x0088:
                    androidx.activity.h r1 = new androidx.activity.h
                    r1.<init>()
                    goto L_0x00e8
                L_0x008e:
                    java.lang.Class<java.util.Map> r3 = java.util.Map.class
                    boolean r3 = r3.isAssignableFrom(r6)
                    if (r3 == 0) goto L_0x00e8
                    java.lang.Class<java.util.concurrent.ConcurrentNavigableMap> r1 = java.util.concurrent.ConcurrentNavigableMap.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x00a4
                    tq.a r1 = new tq.a
                    r1.<init>()
                    goto L_0x00e8
                L_0x00a4:
                    java.lang.Class<java.util.concurrent.ConcurrentMap> r1 = java.util.concurrent.ConcurrentMap.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x00b2
                    bk.a r1 = new bk.a
                    r1.<init>()
                    goto L_0x00e8
                L_0x00b2:
                    java.lang.Class<java.util.SortedMap> r1 = java.util.SortedMap.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x00c0
                    kotlinx.coroutines.e0 r1 = new kotlinx.coroutines.e0
                    r1.<init>()
                    goto L_0x00e8
                L_0x00c0:
                    boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
                    if (r1 == 0) goto L_0x00e3
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r3 = r0
                    java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
                    java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
                    r2 = r3[r2]
                    sn.a r2 = p675sn.C18541a.get((java.lang.reflect.Type) r2)
                    java.lang.Class r2 = r2.getRawType()
                    boolean r1 = r1.isAssignableFrom(r2)
                    if (r1 != 0) goto L_0x00e3
                    com.google.android.play.core.assetpacks.c1 r1 = new com.google.android.play.core.assetpacks.c1
                    r1.<init>()
                    goto L_0x00e8
                L_0x00e3:
                    nj.b r1 = new nj.b
                    r1.<init>()
                L_0x00e8:
                    if (r1 == 0) goto L_0x00eb
                    return r1
                L_0x00eb:
                    com.google.gson.internal.a r1 = new com.google.gson.internal.a
                    r1.<init>(r6, r0)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C16727b.mo59573a(sn.a):com.google.gson.internal.g");
            }

            public final String toString() {
                return this.f36990a.toString();
            }
        }
