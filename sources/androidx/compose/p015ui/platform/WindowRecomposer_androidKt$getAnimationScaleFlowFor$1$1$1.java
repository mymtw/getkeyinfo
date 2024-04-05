package androidx.compose.p015ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C19499d;
import kotlinx.coroutines.flow.C19600e;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", mo70541f = "WindowRecomposer.android.kt", mo70542l = {116, 122}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 */
final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements C19861p<C19600e<? super Float>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Uri $animationScaleUri;
    public final /* synthetic */ Context $applicationContext;
    public final /* synthetic */ C19499d<C19394m> $channel;
    public final /* synthetic */ C1807x23580bd9 $contentObserver;
    public final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, C1807x23580bd9 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1, C19499d<C19394m> dVar, Context context, C19340c<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> cVar) {
        super(2, cVar);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1;
        this.$channel = dVar;
        this.$applicationContext = context;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, cVar);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.L$0 = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    public final Object invoke(C19600e<? super Float> eVar, C19340c<? super C19394m> cVar) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(eVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: kotlinx.coroutines.flow.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064 A[Catch:{ all -> 0x0096 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0030
            if (r1 == r2) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r4 = r9.L$0
            kotlinx.coroutines.flow.e r4 = (kotlinx.coroutines.flow.C19600e) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)     // Catch:{ all -> 0x009d }
            goto L_0x0048
        L_0x0018:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0020:
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r4 = r9.L$0
            kotlinx.coroutines.flow.e r4 = (kotlinx.coroutines.flow.C19600e) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)     // Catch:{ all -> 0x009d }
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r9
            goto L_0x005c
        L_0x0030:
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            java.lang.Object r10 = r9.L$0
            r4 = r10
            kotlinx.coroutines.flow.e r4 = (kotlinx.coroutines.flow.C19600e) r4
            android.content.ContentResolver r10 = r9.$resolver
            android.net.Uri r1 = r9.$animationScaleUri
            r5 = 0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r6 = r9.$contentObserver
            r10.registerContentObserver(r1, r5, r6)
            kotlinx.coroutines.channels.d<kotlin.m> r10 = r9.$channel     // Catch:{ all -> 0x009d }
            kotlinx.coroutines.channels.f r1 = r10.iterator()     // Catch:{ all -> 0x009d }
        L_0x0048:
            r10 = r9
        L_0x0049:
            r10.L$0 = r4     // Catch:{ all -> 0x0098 }
            r10.L$1 = r1     // Catch:{ all -> 0x0098 }
            r10.label = r2     // Catch:{ all -> 0x0098 }
            java.lang.Object r5 = r1.mo72148a(r10)     // Catch:{ all -> 0x0098 }
            if (r5 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r8 = r0
            r0 = r10
            r10 = r5
            r5 = r4
            r4 = r1
            r1 = r8
        L_0x005c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0096 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0096 }
            if (r10 == 0) goto L_0x008c
            r4.next()     // Catch:{ all -> 0x0096 }
            android.content.Context r10 = r0.$applicationContext     // Catch:{ all -> 0x0096 }
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch:{ all -> 0x0096 }
            java.lang.String r6 = "animator_duration_scale"
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch:{ all -> 0x0096 }
            java.lang.Float r6 = new java.lang.Float     // Catch:{ all -> 0x0096 }
            r6.<init>(r10)     // Catch:{ all -> 0x0096 }
            r0.L$0 = r5     // Catch:{ all -> 0x0096 }
            r0.L$1 = r4     // Catch:{ all -> 0x0096 }
            r0.label = r3     // Catch:{ all -> 0x0096 }
            java.lang.Object r10 = r5.emit(r6, r0)     // Catch:{ all -> 0x0096 }
            if (r10 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r10 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            goto L_0x0049
        L_0x008c:
            android.content.ContentResolver r10 = r0.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r0 = r0.$contentObserver
            r10.unregisterContentObserver(r0)
            kotlin.m r10 = kotlin.C19394m.f43287a
            return r10
        L_0x0096:
            r10 = move-exception
            goto L_0x009f
        L_0x0098:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto L_0x009f
        L_0x009d:
            r10 = move-exception
            r0 = r9
        L_0x009f:
            android.content.ContentResolver r1 = r0.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r0 = r0.$contentObserver
            r1.unregisterContentObserver(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
