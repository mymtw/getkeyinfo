package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies;

import androidx.activity.C0114h;
import com.etsy.android.lib.models.Country;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10554d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p309ad.C8505b;
import p309ad.C8508d;
import p309ad.C8509e;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.CalculateShippingWorkflow$showCountrySheet$1$adapter$1 */
final class CalculateShippingWorkflow$showCountrySheet$1$adapter$1 extends Lambda implements C19857l<Country, C19394m> {
    public final /* synthetic */ C10554d this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalculateShippingWorkflow$showCountrySheet$1$adapter$1(C10554d dVar) {
        super(1);
        this.this$0 = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Country) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Country country) {
        C0114h hVar;
        C10554d.C10557c cVar;
        C19383o.m32797g(country, "it");
        C10554d dVar = this.this$0;
        C10554d.C10557c cVar2 = dVar.f23140b;
        if (cVar2 instanceof C10554d.C10557c.C10560c) {
            C8505b bVar = dVar.f23139a;
            ((C10554d.C10557c.C10560c) cVar2).getClass();
            C19383o.m32797g(bVar, "postalCodeHelperFactory");
            C8509e b = C8505b.m16924b(country.getIsoCountryCode());
            C8508d a = C8505b.m16923a(country.getIsoCountryCode());
            String isoCountryCode = country.getIsoCountryCode();
            C19383o.m32797g(isoCountryCode, "countryCode");
            if (C19383o.m32792b(isoCountryCode, "CA")) {
                new C0114h
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003d: CONSTRUCTOR  (r3v4 ? I:androidx.activity.h) =  call: androidx.activity.h.<init>():void type: CONSTRUCTOR in method: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.CalculateShippingWorkflow$showCountrySheet$1$adapter$1.invoke(com.etsy.android.lib.models.Country):void, dex: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v4 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 41 more
                    */
                /*
                    this = this;
                    java.lang.String r0 = "it"
                    kotlin.jvm.internal.C19383o.m32797g(r6, r0)
                    com.etsy.android.ui.listing.ui.panels.shippingandpolicies.d r0 = r5.this$0
                    com.etsy.android.ui.listing.ui.panels.shippingandpolicies.d$c r1 = r0.f23140b
                    boolean r2 = r1 instanceof com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10554d.C10557c.C10560c
                    if (r2 == 0) goto L_0x0055
                    com.etsy.android.ui.listing.ui.panels.shippingandpolicies.d$c$c r1 = (com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10554d.C10557c.C10560c) r1
                    ad.b r2 = r0.f23139a
                    r1.getClass()
                    java.lang.String r1 = "postalCodeHelperFactory"
                    kotlin.jvm.internal.C19383o.m32797g(r2, r1)
                    java.lang.String r1 = r6.getIsoCountryCode()
                    ad.e r1 = p309ad.C8505b.m16924b(r1)
                    java.lang.String r2 = r6.getIsoCountryCode()
                    ad.d r2 = p309ad.C8505b.m16923a(r2)
                    java.lang.String r3 = r6.getIsoCountryCode()
                    java.lang.String r4 = "countryCode"
                    kotlin.jvm.internal.C19383o.m32797g(r3, r4)
                    java.lang.String r4 = "CA"
                    boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)
                    r4 = 0
                    if (r3 == 0) goto L_0x0041
                    androidx.activity.h r3 = new androidx.activity.h
                    r3.<init>()
                    goto L_0x0042
                L_0x0041:
                    r3 = r4
                L_0x0042:
                    if (r1 == 0) goto L_0x004c
                    if (r2 == 0) goto L_0x004c
                    com.etsy.android.ui.listing.ui.panels.shippingandpolicies.d$c$a r4 = new com.etsy.android.ui.listing.ui.panels.shippingandpolicies.d$c$a
                    r4.<init>(r6, r1, r2, r3)
                    goto L_0x0052
                L_0x004c:
                    com.etsy.android.ui.listing.ui.panels.shippingandpolicies.d$c$d r1 = new com.etsy.android.ui.listing.ui.panels.shippingandpolicies.d$c$d
                    r1.<init>(r6, r4)
                    r4 = r1
                L_0x0052:
                    r0.mo34147c(r4)
                L_0x0055:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.CalculateShippingWorkflow$showCountrySheet$1$adapter$1.invoke(com.etsy.android.lib.models.Country):void");
            }
        }
