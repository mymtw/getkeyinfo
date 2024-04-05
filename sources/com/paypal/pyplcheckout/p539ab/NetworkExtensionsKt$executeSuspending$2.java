package com.paypal.pyplcheckout.p539ab;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import okhttp3.C19944e;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.ab.NetworkExtensionsKt$executeSuspending$2", mo70541f = "NetworkExtensions.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.pyplcheckout.ab.NetworkExtensionsKt$executeSuspending$2 */
public final class NetworkExtensionsKt$executeSuspending$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super T>, Object> {
    public final /* synthetic */ C19944e $call;
    public final /* synthetic */ Class<T> $klass;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetworkExtensionsKt$executeSuspending$2(C19944e eVar, Class<T> cls, C19340c<? super NetworkExtensionsKt$executeSuspending$2> cVar) {
        super(2, cVar);
        this.$call = eVar;
        this.$klass = cls;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new NetworkExtensionsKt$executeSuspending$2(this.$call, this.$klass, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super T> cVar) {
        return ((NetworkExtensionsKt$executeSuspending$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: okhttp3.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: okhttp3.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: okhttp3.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c4 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c5 A[Catch:{ all -> 0x00cb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r1.label
            if (r0 != 0) goto L_0x00d3
            androidx.compose.foundation.layout.C0761x.m1684O0(r18)
            r2 = 0
            okhttp3.e r0 = r1.$call     // Catch:{ all -> 0x0084 }
            okhttp3.z r3 = r0.mo72859e()     // Catch:{ all -> 0x0084 }
            boolean r0 = r3.mo73006d()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x0039
            com.google.gson.i r0 = new com.google.gson.i     // Catch:{ all -> 0x0081 }
            r0.<init>()     // Catch:{ all -> 0x0081 }
            java.io.StringReader r4 = new java.io.StringReader     // Catch:{ all -> 0x0081 }
            okhttp3.a0 r5 = r3.f44368i     // Catch:{ all -> 0x0081 }
            if (r5 != 0) goto L_0x0024
            goto L_0x0028
        L_0x0024:
            java.lang.String r2 = r5.mo72844g()     // Catch:{ all -> 0x0081 }
        L_0x0028:
            if (r2 != 0) goto L_0x002c
            java.lang.String r2 = ""
        L_0x002c:
            r4.<init>(r2)     // Catch:{ all -> 0x0081 }
            java.lang.Class<T> r2 = r1.$klass     // Catch:{ all -> 0x0081 }
            java.lang.Object r0 = r0.mo59457d(r4, r2)     // Catch:{ all -> 0x0081 }
            r3.close()
            return r0
        L_0x0039:
            int r0 = r3.f44365f     // Catch:{ all -> 0x0081 }
            r3.close()     // Catch:{ all -> 0x0081 }
            com.paypal.pyplcheckout.common.instrumentation.PLog r2 = com.paypal.pyplcheckout.common.instrumentation.PLog.INSTANCE     // Catch:{ all -> 0x0081 }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r9 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.NETWORK_EXECUTE_SUSPENDING     // Catch:{ all -> 0x0081 }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.INFO     // Catch:{ all -> 0x0081 }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E168     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r2.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r6 = "network call failed. Got http code: "
            r2.append(r6)     // Catch:{ all -> 0x0081 }
            r2.append(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x0081 }
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 2008(0x7d8, float:2.814E-42)
            r16 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.error$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0081 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r4.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = "Network Error: "
            r4.append(r5)     // Catch:{ all -> 0x0081 }
            r4.append(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = " "
            r4.append(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0081 }
            r2.<init>(r0)     // Catch:{ all -> 0x0081 }
            throw r2     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            r2 = r3
            goto L_0x0085
        L_0x0084:
            r0 = move-exception
        L_0x0085:
            com.paypal.pyplcheckout.common.instrumentation.PLog r3 = com.paypal.pyplcheckout.common.instrumentation.PLog.INSTANCE     // Catch:{ all -> 0x00cb }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r9 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.NETWORK_EXECUTE_SUSPENDING     // Catch:{ all -> 0x00cb }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.INFO     // Catch:{ all -> 0x00cb }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E168     // Catch:{ all -> 0x00cb }
            java.lang.Class r3 = r0.getClass()     // Catch:{ all -> 0x00cb }
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ all -> 0x00cb }
            java.lang.String r6 = r0.getMessage()     // Catch:{ all -> 0x00cb }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cb }
            r7.<init>()     // Catch:{ all -> 0x00cb }
            java.lang.String r8 = "network call failed. "
            r7.append(r8)     // Catch:{ all -> 0x00cb }
            r7.append(r3)     // Catch:{ all -> 0x00cb }
            java.lang.String r3 = ": "
            r7.append(r3)     // Catch:{ all -> 0x00cb }
            r7.append(r6)     // Catch:{ all -> 0x00cb }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x00cb }
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 2008(0x7d8, float:2.814E-42)
            r16 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.error$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00cb }
            boolean r3 = r0 instanceof java.io.IOException     // Catch:{ all -> 0x00cb }
            if (r3 == 0) goto L_0x00c5
            throw r0     // Catch:{ all -> 0x00cb }
        L_0x00c5:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x00cb }
            r3.<init>(r0)     // Catch:{ all -> 0x00cb }
            throw r3     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r0 = move-exception
            if (r2 != 0) goto L_0x00cf
            goto L_0x00d2
        L_0x00cf:
            r2.close()
        L_0x00d2:
            throw r0
        L_0x00d3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.p539ab.NetworkExtensionsKt$executeSuspending$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
