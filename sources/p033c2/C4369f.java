package p033c2;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.slice.Slice;
import androidx.slice.SliceProvider;
import androidx.slice.SliceSpec;
import java.util.ArrayList;
import kotlinx.coroutines.C19543e0;
import p022b2.C3469a;
import p022b2.C3471c;
import p022b2.C3472d;
import p078d2.C6623a;
import p514bk.C14088a;

/* renamed from: c2.f */
public abstract class C4369f {

    /* renamed from: a */
    public final Slice.C3273a f9621a;

    /* renamed from: b */
    public ArrayList f9622b;

    public C4369f(Context context, Uri uri) {
        ArrayList arrayList;
        C6623a aVar;
        C3469a aVar2;
        this.f9621a = new Slice.C3273a(uri);
        if (SliceProvider.getCurrentSpecs() != null) {
            arrayList = new ArrayList(SliceProvider.getCurrentSpecs());
        } else {
            arrayList = new ArrayList((Build.VERSION.SDK_INT >= 28 ? new C3472d(context) : new C3471c(context)).mo12985b(uri));
        }
        this.f9622b = arrayList;
        C4363b bVar = (C4363b) this;
        if (bVar.mo14303a(C14088a.f31023d)) {
            Slice.C3273a aVar3 = bVar.f9621a;
            if (SliceProvider.getClock() != null) {
                aVar2 = SliceProvider.getClock();
            } else {
                new C19543e0
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0053: CONSTRUCTOR  (r1v2 ? I:kotlinx.coroutines.e0) =  call: kotlinx.coroutines.e0.<init>():void type: CONSTRUCTOR in method: c2.f.<init>(android.content.Context, android.net.Uri):void, dex: classes.dex
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
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v2 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 39 more
                    */
                /*
                    this = this;
                    r2.<init>()
                    androidx.slice.Slice$a r0 = new androidx.slice.Slice$a
                    r0.<init>((android.net.Uri) r4)
                    r2.f9621a = r0
                    java.util.Set r0 = androidx.slice.SliceProvider.getCurrentSpecs()
                    if (r0 == 0) goto L_0x001a
                    java.util.ArrayList r3 = new java.util.ArrayList
                    java.util.Set r4 = androidx.slice.SliceProvider.getCurrentSpecs()
                    r3.<init>(r4)
                    goto L_0x0035
                L_0x001a:
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r1 = 28
                    if (r0 < r1) goto L_0x0026
                    b2.d r0 = new b2.d
                    r0.<init>(r3)
                    goto L_0x002b
                L_0x0026:
                    b2.c r0 = new b2.c
                    r0.<init>(r3)
                L_0x002b:
                    o.d r3 = r0.mo12985b(r4)
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r4.<init>(r3)
                    r3 = r4
                L_0x0035:
                    r2.f9622b = r3
                    r3 = r2
                    c2.b r3 = (p033c2.C4363b) r3
                    androidx.slice.SliceSpec r4 = p514bk.C14088a.f31023d
                    boolean r4 = r3.mo14303a(r4)
                    if (r4 == 0) goto L_0x005a
                    d2.c r4 = new d2.c
                    androidx.slice.Slice$a r0 = r3.f9621a
                    b2.a r1 = androidx.slice.SliceProvider.getClock()
                    if (r1 == 0) goto L_0x0051
                    b2.a r1 = androidx.slice.SliceProvider.getClock()
                    goto L_0x0056
                L_0x0051:
                    kotlinx.coroutines.e0 r1 = new kotlinx.coroutines.e0
                    r1.<init>()
                L_0x0056:
                    r4.<init>(r0, r1)
                    goto L_0x006b
                L_0x005a:
                    androidx.slice.SliceSpec r4 = p514bk.C14088a.f31022c
                    boolean r4 = r3.mo14303a(r4)
                    if (r4 == 0) goto L_0x006a
                    d2.b r4 = new d2.b
                    androidx.slice.Slice$a r0 = r3.f9621a
                    r4.<init>(r0)
                    goto L_0x006b
                L_0x006a:
                    r4 = 0
                L_0x006b:
                    if (r4 == 0) goto L_0x0070
                    r3.f9602d = r4
                    return
                L_0x0070:
                    java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                    java.lang.String r4 = "No valid specs found"
                    r3.<init>(r4)
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: p033c2.C4369f.<init>(android.content.Context, android.net.Uri):void");
            }

            /* renamed from: a */
            public final boolean mo14303a(SliceSpec sliceSpec) {
                int size = this.f9622b.size();
                for (int i = 0; i < size; i++) {
                    SliceSpec sliceSpec2 = (SliceSpec) this.f9622b.get(i);
                    if (sliceSpec2.f7618a.equals(sliceSpec.f7618a) && sliceSpec2.f7619b >= sliceSpec.f7619b) {
                        return true;
                    }
                }
                return false;
            }
        }
