package com.paypal.pyplcheckout.addshipping;

import android.content.Context;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import p744gq.C19060c;
import p753kq.C19861p;
import p768rq.C20152a;

@C19060c(mo70540c = "com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel$createCountryList$1", mo70541f = "AddressAutoCompleteViewModel.kt", mo70542l = {259}, mo70543m = "invokeSuspend")
public final class AddressAutoCompleteViewModel$createCountryList$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ AddressAutoCompleteViewModel this$0;

    @C19060c(mo70540c = "com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel$createCountryList$1$1", mo70541f = "AddressAutoCompleteViewModel.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel$createCountryList$1$1 */
    public static final class C171921 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C171921(context, addressAutoCompleteViewModel, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C171921) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00df, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r32) {
            /*
                r31 = this;
                r1 = r31
                java.lang.String r0 = "zipcode"
                java.lang.String r2 = "state"
                java.lang.String r3 = "city"
                kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r4 = r1.label
                if (r4 != 0) goto L_0x0131
                androidx.compose.foundation.layout.C0761x.m1684O0(r32)
                com.paypal.pyplcheckout.common.cache.Cache r4 = com.paypal.pyplcheckout.common.cache.Cache.INSTANCE
                java.util.ArrayList r4 = r4.getCountries()
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L_0x012e
                android.content.Context r4 = r3
                android.content.res.AssetManager r4 = r4.getAssets()
                java.lang.String r5 = "context.assets"
                kotlin.jvm.internal.C19383o.m32796f(r4, r5)
                java.lang.String r5 = "countries.json"
                java.io.InputStream r4 = r4.open(r5)     // Catch:{ IOException -> 0x0103, JSONException -> 0x00e8 }
                com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel r5 = r4     // Catch:{ IOException -> 0x0103, JSONException -> 0x00e8 }
                int r6 = r4.available()     // Catch:{ all -> 0x00df }
                byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00df }
                r4.read(r6)     // Catch:{ all -> 0x00df }
                r4.close()     // Catch:{ all -> 0x00df }
                java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x00df }
                java.nio.charset.Charset r8 = kotlin.text.C19446a.f43373b     // Catch:{ all -> 0x00df }
                r7.<init>(r6, r8)     // Catch:{ all -> 0x00df }
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x00df }
                r6.<init>(r7)     // Catch:{ all -> 0x00df }
                r5.countriesJSONObject = r6     // Catch:{ all -> 0x00df }
                org.json.JSONObject r5 = r5.countriesJSONObject     // Catch:{ all -> 0x00df }
                r6 = 0
                if (r5 != 0) goto L_0x0054
                r5 = r6
                goto L_0x005a
            L_0x0054:
                java.lang.String r7 = "countries"
                org.json.JSONArray r5 = r5.getJSONArray(r7)     // Catch:{ all -> 0x00df }
            L_0x005a:
                if (r5 == 0) goto L_0x00d9
                r7 = 0
                int r8 = r5.length()     // Catch:{ all -> 0x00df }
            L_0x0061:
                if (r7 >= r8) goto L_0x00d9
                int r9 = r7 + 1
                org.json.JSONObject r7 = r5.getJSONObject(r7)     // Catch:{ all -> 0x00df }
                java.lang.String r10 = "id"
                java.lang.Object r10 = r7.get(r10)     // Catch:{ all -> 0x00df }
                java.lang.String r12 = r10.toString()     // Catch:{ all -> 0x00df }
                java.lang.String r10 = "name"
                java.lang.Object r10 = r7.get(r10)     // Catch:{ all -> 0x00df }
                java.lang.String r13 = r10.toString()     // Catch:{ all -> 0x00df }
                java.lang.String r10 = "address1"
                java.lang.Object r10 = r7.get(r10)     // Catch:{ all -> 0x00df }
                java.lang.String r14 = r10.toString()     // Catch:{ all -> 0x00df }
                java.lang.String r10 = "address2"
                java.lang.Object r10 = r7.get(r10)     // Catch:{ all -> 0x00df }
                java.lang.String r15 = r10.toString()     // Catch:{ all -> 0x00df }
                boolean r10 = r7.has(r3)     // Catch:{ all -> 0x00df }
                java.lang.String r11 = ""
                if (r10 == 0) goto L_0x00a4
                java.lang.Object r10 = r7.get(r3)     // Catch:{ all -> 0x00df }
                java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00df }
                r16 = r10
                goto L_0x00a6
            L_0x00a4:
                r16 = r11
            L_0x00a6:
                boolean r10 = r7.has(r2)     // Catch:{ all -> 0x00df }
                if (r10 == 0) goto L_0x00b7
                java.lang.Object r10 = r7.get(r2)     // Catch:{ all -> 0x00df }
                java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00df }
                r17 = r10
                goto L_0x00b9
            L_0x00b7:
                r17 = r11
            L_0x00b9:
                boolean r10 = r7.has(r0)     // Catch:{ all -> 0x00df }
                if (r10 == 0) goto L_0x00ca
                java.lang.Object r7 = r7.get(r0)     // Catch:{ all -> 0x00df }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00df }
                r18 = r7
                goto L_0x00cc
            L_0x00ca:
                r18 = r11
            L_0x00cc:
                com.paypal.pyplcheckout.common.cache.Cache r7 = com.paypal.pyplcheckout.common.cache.Cache.INSTANCE     // Catch:{ all -> 0x00df }
                com.paypal.pyplcheckout.addshipping.model.Country r10 = new com.paypal.pyplcheckout.addshipping.model.Country     // Catch:{ all -> 0x00df }
                r11 = r10
                r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00df }
                r7.cacheCountries(r10)     // Catch:{ all -> 0x00df }
                r7 = r9
                goto L_0x0061
            L_0x00d9:
                kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x00df }
                kotlin.reflect.C19421p.m32917E(r4, r6)     // Catch:{ IOException -> 0x0103, JSONException -> 0x00e8 }
                goto L_0x0123
            L_0x00df:
                r0 = move-exception
                r2 = r0
                throw r2     // Catch:{ all -> 0x00e2 }
            L_0x00e2:
                r0 = move-exception
                r3 = r0
                kotlin.reflect.C19421p.m32917E(r4, r2)     // Catch:{ IOException -> 0x0103, JSONException -> 0x00e8 }
                throw r3     // Catch:{ IOException -> 0x0103, JSONException -> 0x00e8 }
            L_0x00e8:
                r0 = move-exception
                r9 = r0
                com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
                com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r6 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E620
                java.lang.String r8 = r9.getMessage()
                com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r10 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.NATIVE_ADD_SHIPPING
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 1984(0x7c0, float:2.78E-42)
                r17 = 0
                java.lang.String r7 = "Error reading countries.json structure"
                com.paypal.pyplcheckout.common.instrumentation.PLog.error$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                goto L_0x0123
            L_0x0103:
                r0 = move-exception
                r22 = r0
                com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r18 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
                com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r19 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E620
                java.lang.String r21 = r22.getMessage()
                com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r23 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.NATIVE_ADD_SHIPPING
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 1984(0x7c0, float:2.78E-42)
                r30 = 0
                java.lang.String r20 = "Error reading countries.json"
                com.paypal.pyplcheckout.common.instrumentation.PLog.error$default(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            L_0x0123:
                com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel r0 = r4
                androidx.lifecycle.z r0 = r0._countryCacheCompletionFlag
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r0.postValue(r2)
            L_0x012e:
                kotlin.m r0 = kotlin.C19394m.f43287a
                return r0
            L_0x0131:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel$createCountryList$1.C171921.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressAutoCompleteViewModel$createCountryList$1(Context context, AddressAutoCompleteViewModel addressAutoCompleteViewModel, C19340c<? super AddressAutoCompleteViewModel$createCountryList$1> cVar) {
        super(2, cVar);
        this.$context = context;
        this.this$0 = addressAutoCompleteViewModel;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AddressAutoCompleteViewModel$createCountryList$1(this.$context, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((AddressAutoCompleteViewModel$createCountryList$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C20152a aVar = C19760n0.f43720b;
            final Context context = this.$context;
            final AddressAutoCompleteViewModel addressAutoCompleteViewModel = this.this$0;
            C171921 r1 = new C171921((C19340c<? super C171921>) null);
            this.label = 1;
            if (C19697g.m33471i(this, aVar, r1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
