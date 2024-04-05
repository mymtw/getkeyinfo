package kotlinx.coroutines.flow;

import com.google.android.gms.common.api.Api;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.C19736t;

/* renamed from: kotlinx.coroutines.flow.v */
public final /* synthetic */ class C19680v {

    /* renamed from: a */
    public static final C19736t f43629a = new C19736t("NO_VALUE");

    /* renamed from: a */
    public static C19671s1 m33452a(int i, int i2, BufferOverflow bufferOverflow, int i3) {
        boolean z = false;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if (i >= 0) {
            if (i2 >= 0) {
                if (i > 0 || i2 > 0 || bufferOverflow == BufferOverflow.SUSPEND) {
                    z = true;
                }
                if (z) {
                    int i4 = i2 + i;
                    if (i4 < 0) {
                        i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    }
                    return new C19671s1(i, i4, bufferOverflow);
                }
                throw new IllegalArgumentException(C19383o.m32802l(bufferOverflow, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ").toString());
            }
            throw new IllegalArgumentException(C19383o.m32802l(Integer.valueOf(i2), "extraBufferCapacity cannot be negative, but was ").toString());
        }
        throw new IllegalArgumentException(C19383o.m32802l(Integer.valueOf(i), "replay cannot be negative, but was ").toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33453b(kotlin.coroutines.C19340c r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.flow.FlowKt__CountKt$count$1
            if (r0 == 0) goto L_0x0013
            r0 = r4
            kotlinx.coroutines.flow.FlowKt__CountKt$count$1 r0 = (kotlinx.coroutines.flow.FlowKt__CountKt$count$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__CountKt$count$1 r0 = new kotlinx.coroutines.flow.FlowKt__CountKt$count$1
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.Ref$IntRef r0 = (kotlin.jvm.internal.Ref$IntRef) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)
            int r4 = r0.element
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r4)
            return r0
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x003a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)
            kotlin.jvm.internal.Ref$IntRef r4 = new kotlin.jvm.internal.Ref$IntRef
            r4.<init>()
            r0.L$0 = r4
            r0.label = r2
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C19680v.m33453b(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33454c(kotlin.coroutines.C19340c r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.flow.FlowKt__CountKt$count$3
            if (r0 == 0) goto L_0x0013
            r0 = r4
            kotlinx.coroutines.flow.FlowKt__CountKt$count$3 r0 = (kotlinx.coroutines.flow.FlowKt__CountKt$count$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__CountKt$count$3 r0 = new kotlinx.coroutines.flow.FlowKt__CountKt$count$3
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.Ref$IntRef r0 = (kotlin.jvm.internal.Ref$IntRef) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)
            int r4 = r0.element
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r4)
            return r0
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x003a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)
            kotlin.jvm.internal.Ref$IntRef r4 = new kotlin.jvm.internal.Ref$IntRef
            r4.<init>()
            r0.L$0 = r4
            r0.label = r2
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C19680v.m33454c(kotlin.coroutines.c):java.lang.Object");
    }
}
