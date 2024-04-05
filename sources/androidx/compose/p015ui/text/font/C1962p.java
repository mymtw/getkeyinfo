package androidx.compose.p015ui.text.font;

import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.p015ui.text.font.C1974z;
import com.google.android.gms.measurement.internal.C15103u3;
import com.google.android.play.core.appupdate.C15565g;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.android.play.core.internal.C15686c0;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.text.font.p */
public final class C1962p implements C15686c0 {

    /* renamed from: b */
    public final Object f4420b;

    public /* synthetic */ C1962p(C15103u3 u3Var) {
        this.f4420b = u3Var;
    }

    public /* synthetic */ C1962p(Object obj) {
        this.f4420b = obj;
    }

    /* renamed from: a */
    public final C1974z.C1976b mo7582a(C1972x xVar, C1963q qVar, C19857l lVar, C19857l lVar2) {
        Typeface typeface;
        C19383o.m32797g(xVar, "typefaceRequest");
        C19383o.m32797g(qVar, "platformFontLoader");
        C19383o.m32797g(lVar, "onAsyncCompletion");
        C19383o.m32797g(lVar2, "createDefaultTypeface");
        C1952g gVar = xVar.f4429a;
        if (gVar == null ? true : gVar instanceof C1949e) {
            typeface = ((C1967s) this.f4420b).mo17f(xVar.f4430b, xVar.f4431c);
        } else if (gVar instanceof C1960n) {
            typeface = ((C1967s) this.f4420b).mo13b((C1960n) gVar, xVar.f4430b, xVar.f4431c);
        } else if (!(gVar instanceof C1961o)) {
            return null;
        } else {
            ((C1961o) gVar).getClass();
            throw null;
        }
        return new C1974z.C1976b(typeface, true);
    }

    /* renamed from: b */
    public final boolean mo7583b() {
        return TextUtils.isEmpty(((C15103u3) this.f4420b).f33873c) && Log.isLoggable(((C15103u3) this.f4420b).mo52016b().mo52279s(), 3);
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        C15565g gVar = (C15565g) ((C15686c0) this.f4420b).zza();
        C15588c1.m25311V0(gVar);
        return gVar;
    }

    public C1962p() {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            new C0005b
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: CONSTRUCTOR  (r0v3 ? I:a0.b) =  call: a0.b.<init>():void type: CONSTRUCTOR in method: androidx.compose.ui.text.font.p.<init>():void, dex: classes.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v3 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L_0x000f
                a0.b r0 = new a0.b
                r0.<init>()
                goto L_0x0014
            L_0x000f:
                com.google.android.play.core.appupdate.d r0 = new com.google.android.play.core.appupdate.d
                r0.<init>()
            L_0x0014:
                r2.f4420b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.font.C1962p.<init>():void");
        }
    }
