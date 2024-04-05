package androidx.compose.p015ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.C2887s;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", mo70541f = "WindowRecomposer.android.kt", mo70542l = {391}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 */
public final class C1804x149b840a extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C2887s $lifecycleOwner;
    public final /* synthetic */ Recomposer $recomposer;
    public final /* synthetic */ C1802xff837ba9 $self;
    public final /* synthetic */ Ref$ObjectRef<C1868r0> $systemDurationScaleSettingConsumer;
    public final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1804x149b840a(Ref$ObjectRef<C1868r0> ref$ObjectRef, Recomposer recomposer, C2887s sVar, C1802xff837ba9 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, C19340c<? super C1804x149b840a> cVar) {
        super(2, cVar);
        this.$systemDurationScaleSettingConsumer = ref$ObjectRef;
        this.$recomposer = recomposer;
        this.$lifecycleOwner = sVar;
        this.$self = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.$this_createLifecycleAwareWindowRecomposer = view;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        C1804x149b840a windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new C1804x149b840a(this.$systemDurationScaleSettingConsumer, this.$recomposer, this.$lifecycleOwner, this.$self, this.$this_createLifecycleAwareWindowRecomposer, cVar);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.L$0 = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((C1804x149b840a) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r3) goto L_0x0015
            java.lang.Object r0 = r8.L$0
            kotlinx.coroutines.g1 r0 = (kotlinx.coroutines.C19699g1) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ all -> 0x0012 }
            goto L_0x006c
        L_0x0012:
            r9 = move-exception
            goto L_0x0086
        L_0x0015:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001d:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.d0 r9 = (kotlinx.coroutines.C19525d0) r9
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.platform.r0> r1 = r8.$systemDurationScaleSettingConsumer     // Catch:{ all -> 0x0084 }
            T r1 = r1.element     // Catch:{ all -> 0x0084 }
            androidx.compose.ui.platform.r0 r1 = (androidx.compose.p015ui.platform.C1868r0) r1     // Catch:{ all -> 0x0084 }
            if (r1 == 0) goto L_0x005d
            android.view.View r4 = r8.$this_createLifecycleAwareWindowRecomposer     // Catch:{ all -> 0x0084 }
            android.content.Context r4 = r4.getContext()     // Catch:{ all -> 0x0084 }
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ all -> 0x0084 }
            java.lang.String r5 = "context.applicationContext"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)     // Catch:{ all -> 0x0084 }
            kotlinx.coroutines.flow.x1 r4 = androidx.compose.p015ui.platform.C1877t1.m4117a(r4)     // Catch:{ all -> 0x0084 }
            java.lang.Object r5 = r4.getValue()     // Catch:{ all -> 0x0084 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x0084 }
            float r5 = r5.floatValue()     // Catch:{ all -> 0x0084 }
            androidx.compose.runtime.ParcelableSnapshotMutableState r6 = r1.f4130b     // Catch:{ all -> 0x0084 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ all -> 0x0084 }
            r6.setValue(r5)     // Catch:{ all -> 0x0084 }
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 r5 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1     // Catch:{ all -> 0x0084 }
            r5.<init>(r4, r1, r2)     // Catch:{ all -> 0x0084 }
            r1 = 3
            kotlinx.coroutines.w1 r9 = kotlinx.coroutines.C19697g.m33468f(r9, r2, r2, r5, r1)     // Catch:{ all -> 0x0084 }
            goto L_0x005e
        L_0x005d:
            r9 = r2
        L_0x005e:
            androidx.compose.runtime.Recomposer r1 = r8.$recomposer     // Catch:{ all -> 0x007f }
            r8.L$0 = r9     // Catch:{ all -> 0x007f }
            r8.label = r3     // Catch:{ all -> 0x007f }
            java.lang.Object r1 = r1.mo5574E(r8)     // Catch:{ all -> 0x007f }
            if (r1 != r0) goto L_0x006b
            return r0
        L_0x006b:
            r0 = r9
        L_0x006c:
            if (r0 == 0) goto L_0x0071
            r0.mo72134a(r2)
        L_0x0071:
            androidx.lifecycle.s r9 = r8.$lifecycleOwner
            androidx.lifecycle.Lifecycle r9 = r9.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r8.$self
            r9.mo10735c(r0)
            kotlin.m r9 = kotlin.C19394m.f43287a
            return r9
        L_0x007f:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L_0x0086
        L_0x0084:
            r9 = move-exception
            r0 = r2
        L_0x0086:
            if (r0 == 0) goto L_0x008b
            r0.mo72134a(r2)
        L_0x008b:
            androidx.lifecycle.s r0 = r8.$lifecycleOwner
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r1 = r8.$self
            r0.mo10735c(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.C1804x149b840a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
