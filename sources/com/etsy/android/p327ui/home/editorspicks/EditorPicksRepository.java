package com.etsy.android.p327ui.home.editorspicks;

import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.editorspicks.EditorPicksRepository */
public final class EditorPicksRepository {

    /* renamed from: a */
    public final C9924a f21876a;

    public EditorPicksRepository(C9924a aVar) {
        C19383o.m32797g(aVar, "editorPicksEndpoint");
        this.f21876a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053 A[Catch:{ Exception -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0055 A[Catch:{ Exception -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005f A[Catch:{ Exception -> 0x007d }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068 A[Catch:{ Exception -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33070a(com.etsy.android.p327ui.home.editorspicks.C9925b r8, kotlin.coroutines.C19340c<? super com.etsy.android.p327ui.home.editorspicks.C9926c> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.etsy.android.p327ui.home.editorspicks.EditorPicksRepository$getEditorPicksModules$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.etsy.android.ui.home.editorspicks.EditorPicksRepository$getEditorPicksModules$1 r0 = (com.etsy.android.p327ui.home.editorspicks.EditorPicksRepository$getEditorPicksModules$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.etsy.android.ui.home.editorspicks.EditorPicksRepository$getEditorPicksModules$1 r0 = new com.etsy.android.ui.home.editorspicks.EditorPicksRepository$getEditorPicksModules$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r4) goto L_0x0028
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ Exception -> 0x007d }
            goto L_0x0060
        L_0x0028:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0030:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            com.etsy.android.ui.home.editorspicks.a r9 = r7.f21876a     // Catch:{ Exception -> 0x007d }
            java.lang.String r2 = r8.f21880a     // Catch:{ Exception -> 0x007d }
            java.lang.Boolean r5 = r8.f21881b     // Catch:{ Exception -> 0x007d }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x007d }
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r5, r6)     // Catch:{ Exception -> 0x007d }
            if (r5 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r6 = r3
        L_0x0043:
            java.lang.String r5 = r8.f21882c     // Catch:{ Exception -> 0x007d }
            if (r5 == 0) goto L_0x0050
            int r5 = r5.length()     // Catch:{ Exception -> 0x007d }
            if (r5 != 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r5 = 0
            goto L_0x0051
        L_0x0050:
            r5 = r4
        L_0x0051:
            if (r5 == 0) goto L_0x0055
            r8 = r3
            goto L_0x0057
        L_0x0055:
            java.lang.String r8 = r8.f21882c     // Catch:{ Exception -> 0x007d }
        L_0x0057:
            r0.label = r4     // Catch:{ Exception -> 0x007d }
            java.lang.Object r9 = r9.mo33098a(r2, r6, r8, r0)     // Catch:{ Exception -> 0x007d }
            if (r9 != r1) goto L_0x0060
            return r1
        L_0x0060:
            retrofit2.v r9 = (retrofit2.C20145v) r9     // Catch:{ Exception -> 0x007d }
            T r8 = r9.f44615b     // Catch:{ Exception -> 0x007d }
            okhttp3.a0 r8 = (okhttp3.C19928a0) r8     // Catch:{ Exception -> 0x007d }
            if (r8 == 0) goto L_0x0072
            byte[] r8 = r8.mo72841a()     // Catch:{ Exception -> 0x007d }
            java.lang.Class<com.etsy.android.lib.models.finds.FindsPage> r9 = com.etsy.android.lib.models.finds.FindsPage.class
            java.lang.Object r3 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r8, r9)     // Catch:{ Exception -> 0x007d }
        L_0x0072:
            kotlin.jvm.internal.C19383o.m32794d(r3)     // Catch:{ Exception -> 0x007d }
            com.etsy.android.lib.models.finds.FindsPage r3 = (com.etsy.android.lib.models.finds.FindsPage) r3     // Catch:{ Exception -> 0x007d }
            com.etsy.android.ui.home.editorspicks.c$b r8 = new com.etsy.android.ui.home.editorspicks.c$b     // Catch:{ Exception -> 0x007d }
            r8.<init>(r3)     // Catch:{ Exception -> 0x007d }
            goto L_0x0084
        L_0x007d:
            r8 = move-exception
            com.etsy.android.ui.home.editorspicks.c$a r9 = new com.etsy.android.ui.home.editorspicks.c$a
            r9.<init>(r8)
            r8 = r9
        L_0x0084:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.home.editorspicks.EditorPicksRepository.mo33070a(com.etsy.android.ui.home.editorspicks.b, kotlin.coroutines.c):java.lang.Object");
    }
}
