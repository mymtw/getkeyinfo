package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

public final /* synthetic */ class FlowKt__ReduceKt {

    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$a */
    public static final class C19558a implements C19600e<T> {

        /* renamed from: b */
        public final /* synthetic */ Ref$ObjectRef f43536b;

        public C19558a(Ref$ObjectRef ref$ObjectRef) {
            this.f43536b = ref$ObjectRef;
        }

        public final Object emit(T t, C19340c<? super C19394m> cVar) {
            this.f43536b.element = t;
            throw new AbortFlowException(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m33371a(kotlinx.coroutines.flow.C19597d<? extends T> r4, kotlin.coroutines.C19340c<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.flow.FlowKt__ReduceKt$a r4 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C19558a) r4
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)     // Catch:{ AbortFlowException -> 0x002f }
            goto L_0x0063
        L_0x002f:
            r5 = move-exception
            goto L_0x005d
        L_0x0031:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0039:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlinx.coroutines.internal.t r2 = p772tq.C20203a.f44778h
            r5.element = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$a r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$a
            r2.<init>(r5)
            r0.L$0 = r5     // Catch:{ AbortFlowException -> 0x0059 }
            r0.L$1 = r2     // Catch:{ AbortFlowException -> 0x0059 }
            r0.label = r3     // Catch:{ AbortFlowException -> 0x0059 }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ AbortFlowException -> 0x0059 }
            if (r4 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r0 = r5
            goto L_0x0063
        L_0x0059:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L_0x005d:
            kotlinx.coroutines.flow.e r1 = r5.getOwner()
            if (r1 != r4) goto L_0x0072
        L_0x0063:
            T r4 = r0.element
            kotlinx.coroutines.internal.t r5 = p772tq.C20203a.f44778h
            if (r4 == r5) goto L_0x006a
            return r4
        L_0x006a:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        L_0x0072:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.m33371a(kotlinx.coroutines.flow.d, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m33372b(kotlinx.coroutines.flow.C19597d<? extends T> r5, p753kq.C19861p<? super T, ? super kotlin.coroutines.C19340c<? super java.lang.Boolean>, ? extends java.lang.Object> r6, kotlin.coroutines.C19340c<? super T> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r5 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.L$0
            kq.p r0 = (p753kq.C19861p) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)     // Catch:{ AbortFlowException -> 0x0033 }
            goto L_0x006c
        L_0x0033:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r0
            r0 = r4
            goto L_0x0064
        L_0x0039:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0041:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlinx.coroutines.internal.t r2 = p772tq.C20203a.f44778h
            r7.element = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2
            r2.<init>(r6, r7)
            r0.L$0 = r6     // Catch:{ AbortFlowException -> 0x0061 }
            r0.L$1 = r7     // Catch:{ AbortFlowException -> 0x0061 }
            r0.L$2 = r2     // Catch:{ AbortFlowException -> 0x0061 }
            r0.label = r3     // Catch:{ AbortFlowException -> 0x0061 }
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch:{ AbortFlowException -> 0x0061 }
            if (r5 != r1) goto L_0x006a
            return r1
        L_0x0061:
            r5 = move-exception
            r0 = r5
            r5 = r2
        L_0x0064:
            kotlinx.coroutines.flow.e r1 = r0.getOwner()
            if (r1 != r5) goto L_0x007f
        L_0x006a:
            r0 = r6
            r6 = r7
        L_0x006c:
            T r5 = r6.element
            kotlinx.coroutines.internal.t r6 = p772tq.C20203a.f44778h
            if (r5 == r6) goto L_0x0073
            return r5
        L_0x0073:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element matching the predicate "
            java.lang.String r6 = kotlin.jvm.internal.C19383o.m32802l(r0, r6)
            r5.<init>(r6)
            throw r5
        L_0x007f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.m33372b(kotlinx.coroutines.flow.d, kq.p, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33373c(kotlin.coroutines.C19340c r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r2) goto L_0x0031
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.flow.o0 r1 = (kotlinx.coroutines.flow.C19658o0) r1
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)     // Catch:{ AbortFlowException -> 0x002f }
            goto L_0x0058
        L_0x002f:
            r5 = move-exception
            goto L_0x0052
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0039:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlinx.coroutines.flow.o0 r1 = new kotlinx.coroutines.flow.o0
            r1.<init>(r5)
            r0.L$0 = r5     // Catch:{ AbortFlowException -> 0x004e }
            r0.L$1 = r1     // Catch:{ AbortFlowException -> 0x004e }
            r0.label = r2     // Catch:{ AbortFlowException -> 0x004e }
            r5 = 0
            throw r5
        L_0x004e:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
        L_0x0052:
            kotlinx.coroutines.flow.e r2 = r5.getOwner()
            if (r2 != r1) goto L_0x005b
        L_0x0058:
            T r5 = r0.element
            return r5
        L_0x005b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.m33373c(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33374d(kotlin.coroutines.C19340c r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r2) goto L_0x0031
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) r1
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)     // Catch:{ AbortFlowException -> 0x002f }
            goto L_0x0058
        L_0x002f:
            r5 = move-exception
            goto L_0x0052
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0039:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2
            r1.<init>(r5)
            r0.L$0 = r5     // Catch:{ AbortFlowException -> 0x004e }
            r0.L$1 = r1     // Catch:{ AbortFlowException -> 0x004e }
            r0.label = r2     // Catch:{ AbortFlowException -> 0x004e }
            r5 = 0
            throw r5
        L_0x004e:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
        L_0x0052:
            kotlinx.coroutines.flow.e r2 = r5.getOwner()
            if (r2 != r1) goto L_0x005b
        L_0x0058:
            T r5 = r0.element
            return r5
        L_0x005b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.m33374d(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33375e(kotlin.coroutines.C19340c r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1
            if (r0 == 0) goto L_0x0013
            r0 = r4
            kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 != r2) goto L_0x0039
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)
            T r4 = r0.element
            kotlinx.coroutines.internal.t r0 = p772tq.C20203a.f44778h
            if (r4 == r0) goto L_0x0031
            return r4
        L_0x0031:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r0 = "Expected at least one element"
            r4.<init>(r0)
            throw r4
        L_0x0039:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x0041:
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            kotlinx.coroutines.internal.t r1 = p772tq.C20203a.f44778h
            r4.element = r1
            r0.L$0 = r4
            r0.label = r2
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.m33375e(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33376f(kotlin.coroutines.C19340c r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r4
            kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)
            T r4 = r0.element
            return r4
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x0035:
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            r0.L$0 = r4
            r0.label = r2
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.m33376f(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33377g(kotlin.coroutines.C19340c r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1
            if (r0 == 0) goto L_0x0013
            r0 = r4
            kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 != r2) goto L_0x0039
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)
            T r4 = r0.element
            kotlinx.coroutines.internal.t r0 = p772tq.C20203a.f44778h
            if (r4 == r0) goto L_0x0031
            return r4
        L_0x0031:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r0 = "Empty flow can't be reduced"
            r4.<init>(r0)
            throw r4
        L_0x0039:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x0041:
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            kotlinx.coroutines.internal.t r1 = p772tq.C20203a.f44778h
            r4.element = r1
            r0.L$0 = r4
            r0.label = r2
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.m33377g(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33378h(kotlin.coroutines.C19340c r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1
            if (r0 == 0) goto L_0x0013
            r0 = r4
            kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 != r2) goto L_0x0039
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)
            T r4 = r0.element
            kotlinx.coroutines.internal.t r0 = p772tq.C20203a.f44778h
            if (r4 == r0) goto L_0x0031
            return r4
        L_0x0031:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r0 = "Flow is empty"
            r4.<init>(r0)
            throw r4
        L_0x0039:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x0041:
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            kotlinx.coroutines.internal.t r1 = p772tq.C20203a.f44778h
            r4.element = r1
            r0.L$0 = r4
            r0.label = r2
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.m33378h(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33379i(kotlin.coroutines.C19340c r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.flow.r0 r1 = (kotlinx.coroutines.flow.C19667r0) r1
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)     // Catch:{ AbortFlowException -> 0x0030 }
            goto L_0x005c
        L_0x0030:
            r5 = move-exception
            goto L_0x0056
        L_0x0032:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlinx.coroutines.internal.t r1 = p772tq.C20203a.f44778h
            r5.element = r1
            kotlinx.coroutines.flow.r0 r1 = new kotlinx.coroutines.flow.r0
            r1.<init>(r5)
            r0.L$0 = r5     // Catch:{ AbortFlowException -> 0x0052 }
            r0.L$1 = r1     // Catch:{ AbortFlowException -> 0x0052 }
            r0.label = r2     // Catch:{ AbortFlowException -> 0x0052 }
            throw r3
        L_0x0052:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
        L_0x0056:
            kotlinx.coroutines.flow.e r2 = r5.getOwner()
            if (r2 != r1) goto L_0x0065
        L_0x005c:
            T r5 = r0.element
            kotlinx.coroutines.internal.t r0 = p772tq.C20203a.f44778h
            if (r5 != r0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r3 = r5
        L_0x0064:
            return r3
        L_0x0065:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.m33379i(kotlin.coroutines.c):java.lang.Object");
    }
}
