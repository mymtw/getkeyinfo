package p683tn;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.oned.C16973b;
import com.google.zxing.oned.C16976e;
import com.google.zxing.oned.C16978g;
import com.google.zxing.oned.C16980i;
import com.google.zxing.oned.C16981j;
import com.google.zxing.oned.C16982k;
import com.google.zxing.oned.C16984m;
import com.google.zxing.oned.C16988q;
import com.google.zxing.oned.Code128Writer;
import java.util.EnumMap;
import kotlin.jvm.internal.C19388s;
import p510ao.C14038a;
import p699vn.C18667b;
import p723yn.C18896a;

/* renamed from: tn.b */
public final class C18562b implements C18567f {

    /* renamed from: tn.b$a */
    public static /* synthetic */ class C18563a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40871a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.zxing.BarcodeFormat[] r0 = com.google.zxing.BarcodeFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40871a = r0
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.EAN_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40871a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.UPC_E     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40871a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.EAN_13     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f40871a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.UPC_A     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f40871a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.QR_CODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f40871a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.CODE_39     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f40871a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.CODE_93     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f40871a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.CODE_128     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f40871a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.ITF     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f40871a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.PDF_417     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f40871a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.CODABAR     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f40871a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.DATA_MATRIX     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f40871a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.AZTEC     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p683tn.C18562b.C18563a.<clinit>():void");
        }
    }

    /* renamed from: f */
    public final C18667b mo4160f(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        C18567f fVar;
        switch (C18563a.f40871a[barcodeFormat.ordinal()]) {
            case 1:
                fVar = new C16981j();
                break;
            case 2:
                fVar = new C16988q();
                break;
            case 3:
                fVar = new C16980i();
                break;
            case 4:
                fVar = new C16984m();
                break;
            case 5:
                fVar = new C14038a();
                break;
            case 6:
                fVar = new C16976e();
                break;
            case 7:
                fVar = new C16978g();
                break;
            case 8:
                fVar = new Code128Writer();
                break;
            case 9:
                fVar = new C16982k();
                break;
            case 10:
                fVar = new C18896a();
                break;
            case 11:
                fVar = new C16973b();
                break;
            case 12:
                new C19388s
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0023: CONSTRUCTOR  (r0v14 ? I:kotlin.jvm.internal.s) =  call: kotlin.jvm.internal.s.<init>():void type: CONSTRUCTOR in method: tn.b.f(java.lang.String, com.google.zxing.BarcodeFormat, java.util.EnumMap):vn.b, dex: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v14 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 34 more
                    */
                /*
                    this = this;
                    int[] r0 = p683tn.C18562b.C18563a.f40871a
                    int r1 = r4.ordinal()
                    r0 = r0[r1]
                    switch(r0) {
                        case 1: goto L_0x0063;
                        case 2: goto L_0x005d;
                        case 3: goto L_0x0057;
                        case 4: goto L_0x0051;
                        case 5: goto L_0x004b;
                        case 6: goto L_0x0045;
                        case 7: goto L_0x003f;
                        case 8: goto L_0x0039;
                        case 9: goto L_0x0033;
                        case 10: goto L_0x002d;
                        case 11: goto L_0x0027;
                        case 12: goto L_0x0021;
                        case 13: goto L_0x001b;
                        default: goto L_0x000b;
                    }
                L_0x000b:
                    java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                    java.lang.String r4 = java.lang.String.valueOf(r4)
                    java.lang.String r5 = "No encoder available for format "
                    java.lang.String r4 = r5.concat(r4)
                    r3.<init>(r4)
                    throw r3
                L_0x001b:
                    androidx.compose.foundation.layout.x r0 = new androidx.compose.foundation.layout.x
                    r0.<init>()
                    goto L_0x0068
                L_0x0021:
                    kotlin.jvm.internal.s r0 = new kotlin.jvm.internal.s
                    r0.<init>()
                    goto L_0x0068
                L_0x0027:
                    com.google.zxing.oned.b r0 = new com.google.zxing.oned.b
                    r0.<init>()
                    goto L_0x0068
                L_0x002d:
                    yn.a r0 = new yn.a
                    r0.<init>()
                    goto L_0x0068
                L_0x0033:
                    com.google.zxing.oned.k r0 = new com.google.zxing.oned.k
                    r0.<init>()
                    goto L_0x0068
                L_0x0039:
                    com.google.zxing.oned.Code128Writer r0 = new com.google.zxing.oned.Code128Writer
                    r0.<init>()
                    goto L_0x0068
                L_0x003f:
                    com.google.zxing.oned.g r0 = new com.google.zxing.oned.g
                    r0.<init>()
                    goto L_0x0068
                L_0x0045:
                    com.google.zxing.oned.e r0 = new com.google.zxing.oned.e
                    r0.<init>()
                    goto L_0x0068
                L_0x004b:
                    ao.a r0 = new ao.a
                    r0.<init>()
                    goto L_0x0068
                L_0x0051:
                    com.google.zxing.oned.m r0 = new com.google.zxing.oned.m
                    r0.<init>()
                    goto L_0x0068
                L_0x0057:
                    com.google.zxing.oned.i r0 = new com.google.zxing.oned.i
                    r0.<init>()
                    goto L_0x0068
                L_0x005d:
                    com.google.zxing.oned.q r0 = new com.google.zxing.oned.q
                    r0.<init>()
                    goto L_0x0068
                L_0x0063:
                    com.google.zxing.oned.j r0 = new com.google.zxing.oned.j
                    r0.<init>()
                L_0x0068:
                    vn.b r3 = r0.mo4160f(r3, r4, r5)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: p683tn.C18562b.mo4160f(java.lang.String, com.google.zxing.BarcodeFormat, java.util.EnumMap):vn.b");
            }
        }
