package androidx.compose.p015ui.platform;

import android.view.ViewGroup;

/* renamed from: androidx.compose.ui.platform.w1 */
public final class C1886w1 {

    /* renamed from: a */
    public static final ViewGroup.LayoutParams f4166a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: androidx.compose.ui.platform.WrappedComposition} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.C1320f m4161a(androidx.compose.p015ui.platform.AbstractComposeView r7, androidx.compose.runtime.C1324g r8, androidx.compose.runtime.internal.ComposableLambdaImpl r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = androidx.compose.p015ui.platform.C1848l0.f4104a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L_0x0045
            r0 = -1
            r4 = 6
            kotlinx.coroutines.channels.AbstractChannel r0 = p568fn.C17782b.m29872l(r0, r3, r4)
            kotlin.c<kotlin.coroutines.CoroutineContext> r4 = androidx.compose.p015ui.platform.AndroidUiDispatcher.f3999m
            java.lang.Object r4 = r4.getValue()
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            kotlinx.coroutines.internal.f r4 = kotlinx.coroutines.C19697g.m33463a(r4)
            androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1 r5 = new androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1
            r5.<init>(r0, r3)
            r6 = 3
            kotlinx.coroutines.C19697g.m33468f(r4, r3, r3, r5, r6)
            androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2 r4 = new androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
            r4.<init>(r0)
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.f2989c
            monitor-enter(r0)
            java.util.ArrayList r5 = androidx.compose.runtime.snapshots.SnapshotKt.f2994h     // Catch:{ all -> 0x0042 }
            r5.add(r4)     // Catch:{ all -> 0x0042 }
            monitor-exit(r0)
            androidx.compose.runtime.snapshots.SnapshotKt.m2902a()
            goto L_0x0045
        L_0x0042:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L_0x0045:
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L_0x0056
            android.view.View r0 = r7.getChildAt(r1)
            boolean r4 = r0 instanceof androidx.compose.p015ui.platform.AndroidComposeView
            if (r4 == 0) goto L_0x0059
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.p015ui.platform.AndroidComposeView) r0
            goto L_0x005a
        L_0x0056:
            r7.removeAllViews()
        L_0x0059:
            r0 = r3
        L_0x005a:
            if (r0 != 0) goto L_0x0073
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r4 = r7.getContext()
            java.lang.String r5 = "context"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)
            r0.<init>(r4)
            android.view.View r4 = r0.getView()
            android.view.ViewGroup$LayoutParams r5 = f4166a
            r7.addView((android.view.View) r4, (android.view.ViewGroup.LayoutParams) r5)
        L_0x0073:
            int r7 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r7 < r4) goto L_0x0087
            androidx.compose.ui.platform.v1 r7 = androidx.compose.p015ui.platform.C1883v1.f4163a
            java.util.Map r7 = r7.mo7286a(r0)
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x0087
            r1 = r2
        L_0x0087:
            if (r1 == 0) goto L_0x00b0
            r7 = 2131428708(0x7f0b0564, float:1.8479068E38)
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r0.setTag(r7, r1)
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r7 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.Class<androidx.compose.ui.platform.InspectableValueKt> r7 = androidx.compose.p015ui.platform.InspectableValueKt.class
            java.lang.String r1 = "b"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r1)     // Catch:{ Exception -> 0x00a9 }
            r7.setAccessible(r2)     // Catch:{ Exception -> 0x00a9 }
            r7.setBoolean(r3, r2)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00b0
        L_0x00a9:
            java.lang.String r7 = "Wrapper"
            java.lang.String r1 = "Could not access isDebugInspectorInfoEnabled. Please set explicitly."
            android.util.Log.w(r7, r1)
        L_0x00b0:
            androidx.compose.ui.node.v r7 = new androidx.compose.ui.node.v
            androidx.compose.ui.node.LayoutNode r1 = r0.getRoot()
            r7.<init>(r1)
            androidx.compose.runtime.i r7 = androidx.compose.runtime.C1337j.m2819a(r7, r8)
            android.view.View r8 = r0.getView()
            r1 = 2131430655(0x7f0b0cff, float:1.8483017E38)
            java.lang.Object r8 = r8.getTag(r1)
            boolean r2 = r8 instanceof androidx.compose.p015ui.platform.WrappedComposition
            if (r2 == 0) goto L_0x00cf
            r3 = r8
            androidx.compose.ui.platform.WrappedComposition r3 = (androidx.compose.p015ui.platform.WrappedComposition) r3
        L_0x00cf:
            if (r3 != 0) goto L_0x00dd
            androidx.compose.ui.platform.WrappedComposition r3 = new androidx.compose.ui.platform.WrappedComposition
            r3.<init>(r0, r7)
            android.view.View r7 = r0.getView()
            r7.setTag(r1, r3)
        L_0x00dd:
            r3.mo5795f(r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.C1886w1.m4161a(androidx.compose.ui.platform.AbstractComposeView, androidx.compose.runtime.g, androidx.compose.runtime.internal.ComposableLambdaImpl):androidx.compose.runtime.f");
    }
}
