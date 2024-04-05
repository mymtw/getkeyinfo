package com.paypal.pyplcheckout.p539ab.elmo;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.ab.elmo.Elmo$setup$1", mo70541f = "Elmo.kt", mo70542l = {40}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.pyplcheckout.ab.elmo.Elmo$setup$1 */
public final class Elmo$setup$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ String $countryCode;
    public final /* synthetic */ String $uuid;
    public int label;
    public final /* synthetic */ Elmo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Elmo$setup$1(Elmo elmo, String str, String str2, C19340c<? super Elmo$setup$1> cVar) {
        super(2, cVar);
        this.this$0 = elmo;
        this.$uuid = str;
        this.$countryCode = str2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new Elmo$setup$1(this.this$0, this.$uuid, this.$countryCode, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((Elmo$setup$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x009d A[Catch:{ all -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e A[Catch:{ all -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c0 A[Catch:{ all -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c1 A[Catch:{ all -> 0x00f2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r1.label
            r3 = 1
            if (r2 == 0) goto L_0x0019
            if (r2 != r3) goto L_0x0011
            androidx.compose.foundation.layout.C0761x.m1684O0(r19)     // Catch:{ all -> 0x00f2 }
            r2 = r19
            goto L_0x0035
        L_0x0011:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0019:
            androidx.compose.foundation.layout.C0761x.m1684O0(r19)
            com.paypal.pyplcheckout.ab.elmo.Elmo r2 = r1.this$0     // Catch:{ all -> 0x00f2 }
            com.paypal.pyplcheckout.ab.elmo.ElmoApi r2 = r2.elmoApi     // Catch:{ all -> 0x00f2 }
            java.lang.String r4 = r1.$uuid     // Catch:{ all -> 0x00f2 }
            com.paypal.pyplcheckout.ab.elmo.Elmo r5 = r1.this$0     // Catch:{ all -> 0x00f2 }
            java.lang.String r5 = r5.resource     // Catch:{ all -> 0x00f2 }
            java.lang.String r6 = r1.$countryCode     // Catch:{ all -> 0x00f2 }
            r1.label = r3     // Catch:{ all -> 0x00f2 }
            java.lang.Object r2 = r2.getExperiments(r4, r5, r6, r1)     // Catch:{ all -> 0x00f2 }
            if (r2 != r0) goto L_0x0035
            return r0
        L_0x0035:
            com.paypal.pyplcheckout.ab.elmo.ElmoResponse r2 = (com.paypal.pyplcheckout.p539ab.elmo.ElmoResponse) r2     // Catch:{ all -> 0x00f2 }
            com.paypal.pyplcheckout.ab.elmo.Elmo r0 = r1.this$0     // Catch:{ all -> 0x00f2 }
            com.paypal.pyplcheckout.ab.elmo.ElmoData r3 = r2.getData()     // Catch:{ all -> 0x00f2 }
            r4 = 0
            if (r3 != 0) goto L_0x0041
            goto L_0x004e
        L_0x0041:
            com.paypal.pyplcheckout.ab.elmo.ElmoExperiment r3 = r3.getElmoExperiment()     // Catch:{ all -> 0x00f2 }
            if (r3 != 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            java.util.List r3 = r3.getTreatments()     // Catch:{ all -> 0x00f2 }
            if (r3 != 0) goto L_0x0050
        L_0x004e:
            r6 = r4
            goto L_0x0094
        L_0x0050:
            int r5 = kotlin.collections.C19322o.m32624F0(r3)     // Catch:{ all -> 0x00f2 }
            int r5 = kotlin.reflect.C19421p.m32930T(r5)     // Catch:{ all -> 0x00f2 }
            r6 = 16
            if (r5 >= r6) goto L_0x005d
            r5 = r6
        L_0x005d:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00f2 }
            r6.<init>(r5)     // Catch:{ all -> 0x00f2 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00f2 }
        L_0x0066:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00f2 }
            if (r5 == 0) goto L_0x0094
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00f2 }
            com.paypal.pyplcheckout.ab.elmo.Treatment r5 = (com.paypal.pyplcheckout.p539ab.elmo.Treatment) r5     // Catch:{ all -> 0x00f2 }
            java.lang.String r7 = r5.getExperimentName()     // Catch:{ all -> 0x00f2 }
            com.paypal.pyplcheckout.ab.experiment.ElmoDataResponse r8 = new com.paypal.pyplcheckout.ab.experiment.ElmoDataResponse     // Catch:{ all -> 0x00f2 }
            java.lang.String r9 = r5.getTreatmentName()     // Catch:{ all -> 0x00f2 }
            java.util.Map r5 = r5.getFactors()     // Catch:{ all -> 0x00f2 }
            r8.<init>(r9, r5)     // Catch:{ all -> 0x00f2 }
            kotlin.Pair r5 = new kotlin.Pair     // Catch:{ all -> 0x00f2 }
            r5.<init>(r7, r8)     // Catch:{ all -> 0x00f2 }
            java.lang.Object r7 = r5.getFirst()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r5 = r5.getSecond()     // Catch:{ all -> 0x00f2 }
            r6.put(r7, r5)     // Catch:{ all -> 0x00f2 }
            goto L_0x0066
        L_0x0094:
            r0.setCache(r6)     // Catch:{ all -> 0x00f2 }
            com.paypal.pyplcheckout.ab.elmo.ElmoData r0 = r2.getData()     // Catch:{ all -> 0x00f2 }
            if (r0 != 0) goto L_0x009e
            goto L_0x00ab
        L_0x009e:
            com.paypal.pyplcheckout.ab.elmo.ElmoExperiment r0 = r0.getElmoExperiment()     // Catch:{ all -> 0x00f2 }
            if (r0 != 0) goto L_0x00a5
            goto L_0x00ab
        L_0x00a5:
            java.util.List r5 = r0.getTreatments()     // Catch:{ all -> 0x00f2 }
            if (r5 != 0) goto L_0x00ad
        L_0x00ab:
            r12 = r4
            goto L_0x00ba
        L_0x00ad:
            java.lang.String r6 = ", "
            r7 = 0
            r8 = 0
            com.paypal.pyplcheckout.ab.elmo.Elmo$setup$1$experimentIds$1 r9 = com.paypal.pyplcheckout.p539ab.elmo.Elmo$setup$1$experimentIds$1.INSTANCE     // Catch:{ all -> 0x00f2 }
            r10 = 30
            java.lang.String r0 = kotlin.collections.C19327t.m32644Z0(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00f2 }
            r12 = r0
        L_0x00ba:
            com.paypal.pyplcheckout.ab.elmo.ElmoData r0 = r2.getData()     // Catch:{ all -> 0x00f2 }
            if (r0 != 0) goto L_0x00c1
            goto L_0x00ce
        L_0x00c1:
            com.paypal.pyplcheckout.ab.elmo.ElmoExperiment r0 = r0.getElmoExperiment()     // Catch:{ all -> 0x00f2 }
            if (r0 != 0) goto L_0x00c8
            goto L_0x00ce
        L_0x00c8:
            java.util.List r5 = r0.getTreatments()     // Catch:{ all -> 0x00f2 }
            if (r5 != 0) goto L_0x00d0
        L_0x00ce:
            r13 = r4
            goto L_0x00dd
        L_0x00d0:
            java.lang.String r6 = ", "
            r7 = 0
            r8 = 0
            com.paypal.pyplcheckout.ab.elmo.Elmo$setup$1$treatmentIds$1 r9 = com.paypal.pyplcheckout.p539ab.elmo.Elmo$setup$1$treatmentIds$1.INSTANCE     // Catch:{ all -> 0x00f2 }
            r10 = 30
            java.lang.String r4 = kotlin.collections.C19327t.m32644Z0(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00f2 }
            goto L_0x00ce
        L_0x00dd:
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.ELMO_PROCESS_CHECK     // Catch:{ all -> 0x00f2 }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r6 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SUCCESS     // Catch:{ all -> 0x00f2 }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E222     // Catch:{ all -> 0x00f2 }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r8 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.AB     // Catch:{ all -> 0x00f2 }
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            r16 = 1536(0x600, float:2.152E-42)
            r17 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.decision$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00f2 }
            goto L_0x0118
        L_0x00f2:
            r0 = move-exception
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r2 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.WARNING
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E168
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r5 = ": "
            java.lang.String r4 = p010a9.C0048b.m163a(r4, r5, r0)
            r5 = 0
            r6 = 0
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.ELMO_PROCESS_CHECK
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 2008(0x7d8, float:2.814E-42)
            r14 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.error$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0118:
            kotlin.m r0 = kotlin.C19394m.f43287a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.p539ab.elmo.Elmo$setup$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
