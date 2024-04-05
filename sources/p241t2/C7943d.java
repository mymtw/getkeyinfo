package p241t2;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import p517bn.C14113f;
import p760nr.C19921a;

/* renamed from: t2.d */
public final class C7943d {

    /* renamed from: t2.d$a */
    public static class C7944a {

        /* renamed from: a */
        public static final C7949h f17414a = new C7949h(C7945b.f17415a.getWebkitToCompatConverter());
    }

    /* renamed from: t2.d$b */
    public static class C7945b {

        /* renamed from: a */
        public static final C7946e f17415a;

        static {
            C7947f fVar;
            try {
                fVar = new C7947f((WebViewProviderFactoryBoundaryInterface) C19921a.m34065a(WebViewProviderFactoryBoundaryInterface.class, C7943d.m15909a()));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            } catch (ClassNotFoundException unused) {
                new C14113f
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: CONSTRUCTOR  (r1v3 ? I:bn.f) =  call: bn.f.<init>():void type: CONSTRUCTOR in method: t2.d.b.<clinit>():void, dex: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:363)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:322)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v3 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 50 more
                    */
                /*
                    java.lang.reflect.InvocationHandler r0 = p241t2.C7943d.m15909a()     // Catch:{ IllegalAccessException -> 0x0028, InvocationTargetException -> 0x0021, ClassNotFoundException -> 0x0019, NoSuchMethodException -> 0x0012 }
                    t2.f r1 = new t2.f
                    java.lang.Class<org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface> r2 = org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface.class
                    java.lang.Object r0 = p760nr.C19921a.m34065a(r2, r0)
                    org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface) r0
                    r1.<init>(r0)
                    goto L_0x001e
                L_0x0012:
                    r0 = move-exception
                    java.lang.RuntimeException r1 = new java.lang.RuntimeException
                    r1.<init>(r0)
                    throw r1
                L_0x0019:
                    bn.f r1 = new bn.f
                    r1.<init>()
                L_0x001e:
                    f17415a = r1
                    return
                L_0x0021:
                    r0 = move-exception
                    java.lang.RuntimeException r1 = new java.lang.RuntimeException
                    r1.<init>(r0)
                    throw r1
                L_0x0028:
                    r0 = move-exception
                    java.lang.RuntimeException r1 = new java.lang.RuntimeException
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: p241t2.C7943d.C7945b.<clinit>():void");
            }
        }

        /* renamed from: a */
        public static InvocationHandler m15909a() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
            ClassLoader classLoader;
            if (Build.VERSION.SDK_INT >= 28) {
                classLoader = WebView.getWebViewClassLoader();
            } else {
                try {
                    Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
                    declaredMethod.setAccessible(true);
                    classLoader = declaredMethod.invoke((Object) null, new Object[0]).getClass().getClassLoader();
                } catch (NoSuchMethodException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                }
            }
            return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke((Object) null, new Object[0]);
        }
    }
