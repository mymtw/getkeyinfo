package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.C0628a;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import p288y.C8343c;
import p753kq.C19862q;

public final class DragLogic {

    /* renamed from: a */
    public final C19862q<C19525d0, C8343c, C19340c<? super C19394m>, Object> f1326a;

    /* renamed from: b */
    public final C19862q<C19525d0, Float, C19340c<? super C19394m>, Object> f1327b;

    /* renamed from: c */
    public final C1338j0<C0628a.C0630b> f1328c;

    /* renamed from: d */
    public final C0640j f1329d;

    public DragLogic(C19862q<? super C19525d0, ? super C8343c, ? super C19340c<? super C19394m>, ? extends Object> qVar, C19862q<? super C19525d0, ? super Float, ? super C19340c<? super C19394m>, ? extends Object> qVar2, C1338j0<C0628a.C0630b> j0Var, C0640j jVar) {
        C19383o.m32797g(qVar, "onDragStarted");
        C19383o.m32797g(qVar2, "onDragStopped");
        C19383o.m32797g(j0Var, "dragStartInteraction");
        this.f1326a = qVar;
        this.f1327b = qVar2;
        this.f1328c = j0Var;
        this.f1329d = jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3764a(kotlinx.coroutines.C19525d0 r8, kotlin.coroutines.C19340c<? super kotlin.C19394m> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.DragLogic$processDragCancel$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.foundation.gestures.DragLogic$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DragLogic$processDragCancel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragLogic$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragCancel$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            goto L_0x007f
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.d0 r8 = (kotlinx.coroutines.C19525d0) r8
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            goto L_0x0063
        L_0x003f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            androidx.compose.runtime.j0<androidx.compose.foundation.interaction.a$b> r9 = r7.f1328c
            java.lang.Object r9 = r9.getValue()
            androidx.compose.foundation.interaction.a$b r9 = (androidx.compose.foundation.interaction.C0628a.C0630b) r9
            if (r9 == 0) goto L_0x0069
            androidx.compose.foundation.interaction.j r2 = r7.f1329d
            if (r2 == 0) goto L_0x0062
            androidx.compose.foundation.interaction.a$a r6 = new androidx.compose.foundation.interaction.a$a
            r6.<init>(r9)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r2.mo3870a(r6, r0)
            if (r9 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r2 = r7
        L_0x0063:
            androidx.compose.runtime.j0<androidx.compose.foundation.interaction.a$b> r9 = r2.f1328c
            r9.setValue(r5)
            goto L_0x006a
        L_0x0069:
            r2 = r7
        L_0x006a:
            kq.q<kotlinx.coroutines.d0, java.lang.Float, kotlin.coroutines.c<? super kotlin.m>, java.lang.Object> r9 = r2.f1327b
            r2 = 0
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r2)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = r9.invoke(r8, r4, r0)
            if (r8 != r1) goto L_0x007f
            return r1
        L_0x007f:
            kotlin.m r8 = kotlin.C19394m.f43287a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.mo3764a(kotlinx.coroutines.d0, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3765b(kotlinx.coroutines.C19525d0 r9, androidx.compose.foundation.gestures.C0601c.C0604c r10, kotlin.coroutines.C19340c<? super kotlin.C19394m> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.DragLogic$processDragStart$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.foundation.gestures.DragLogic$processDragStart$1 r0 = (androidx.compose.foundation.gestures.DragLogic$processDragStart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragLogic$processDragStart$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragStart$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005d
            if (r2 == r5) goto L_0x004a
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x00c3
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            java.lang.Object r9 = r0.L$3
            androidx.compose.foundation.interaction.a$b r9 = (androidx.compose.foundation.interaction.C0628a.C0630b) r9
            java.lang.Object r10 = r0.L$2
            androidx.compose.foundation.gestures.c$c r10 = (androidx.compose.foundation.gestures.C0601c.C0604c) r10
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.d0 r2 = (kotlinx.coroutines.C19525d0) r2
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r4 = (androidx.compose.foundation.gestures.DragLogic) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x00a0
        L_0x004a:
            java.lang.Object r9 = r0.L$2
            androidx.compose.foundation.gestures.c$c r9 = (androidx.compose.foundation.gestures.C0601c.C0604c) r9
            java.lang.Object r10 = r0.L$1
            kotlinx.coroutines.d0 r10 = (kotlinx.coroutines.C19525d0) r10
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x0083
        L_0x005d:
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            androidx.compose.runtime.j0<androidx.compose.foundation.interaction.a$b> r11 = r8.f1328c
            java.lang.Object r11 = r11.getValue()
            androidx.compose.foundation.interaction.a$b r11 = (androidx.compose.foundation.interaction.C0628a.C0630b) r11
            if (r11 == 0) goto L_0x0082
            androidx.compose.foundation.interaction.j r2 = r8.f1329d
            if (r2 == 0) goto L_0x0082
            androidx.compose.foundation.interaction.a$a r6 = new androidx.compose.foundation.interaction.a$a
            r6.<init>(r11)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r5
            java.lang.Object r11 = r2.mo3870a(r6, r0)
            if (r11 != r1) goto L_0x0082
            return r1
        L_0x0082:
            r2 = r8
        L_0x0083:
            androidx.compose.foundation.interaction.a$b r11 = new androidx.compose.foundation.interaction.a$b
            r11.<init>()
            androidx.compose.foundation.interaction.j r5 = r2.f1329d
            if (r5 == 0) goto L_0x00a3
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r11
            r0.label = r4
            java.lang.Object r4 = r5.mo3870a(r11, r0)
            if (r4 != r1) goto L_0x009d
            return r1
        L_0x009d:
            r4 = r2
            r2 = r9
            r9 = r11
        L_0x00a0:
            r11 = r9
            r9 = r2
            r2 = r4
        L_0x00a3:
            androidx.compose.runtime.j0<androidx.compose.foundation.interaction.a$b> r4 = r2.f1328c
            r4.setValue(r11)
            kq.q<kotlinx.coroutines.d0, y.c, kotlin.coroutines.c<? super kotlin.m>, java.lang.Object> r11 = r2.f1326a
            long r4 = r10.f1357a
            y.c r10 = new y.c
            r10.<init>(r4)
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r3
            java.lang.Object r9 = r11.invoke(r9, r10, r0)
            if (r9 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            kotlin.m r9 = kotlin.C19394m.f43287a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.mo3765b(kotlinx.coroutines.d0, androidx.compose.foundation.gestures.c$c, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3766c(kotlinx.coroutines.C19525d0 r9, androidx.compose.foundation.gestures.C0601c.C0605d r10, kotlin.coroutines.C19340c<? super kotlin.C19394m> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.DragLogic$processDragStop$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.foundation.gestures.DragLogic$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DragLogic$processDragStop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragLogic$processDragStop$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragStop$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0046
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x008b
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0033:
            java.lang.Object r9 = r0.L$2
            androidx.compose.foundation.gestures.c$d r9 = (androidx.compose.foundation.gestures.C0601c.C0605d) r9
            java.lang.Object r10 = r0.L$1
            kotlinx.coroutines.d0 r10 = (kotlinx.coroutines.C19525d0) r10
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x006c
        L_0x0046:
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            androidx.compose.runtime.j0<androidx.compose.foundation.interaction.a$b> r11 = r8.f1328c
            java.lang.Object r11 = r11.getValue()
            androidx.compose.foundation.interaction.a$b r11 = (androidx.compose.foundation.interaction.C0628a.C0630b) r11
            if (r11 == 0) goto L_0x0072
            androidx.compose.foundation.interaction.j r2 = r8.f1329d
            if (r2 == 0) goto L_0x006b
            androidx.compose.foundation.interaction.a$c r6 = new androidx.compose.foundation.interaction.a$c
            r6.<init>(r11)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r4
            java.lang.Object r11 = r2.mo3870a(r6, r0)
            if (r11 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r2 = r8
        L_0x006c:
            androidx.compose.runtime.j0<androidx.compose.foundation.interaction.a$b> r11 = r2.f1328c
            r11.setValue(r5)
            goto L_0x0073
        L_0x0072:
            r2 = r8
        L_0x0073:
            kq.q<kotlinx.coroutines.d0, java.lang.Float, kotlin.coroutines.c<? super kotlin.m>, java.lang.Object> r11 = r2.f1327b
            float r10 = r10.f1358a
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r10)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r9 = r11.invoke(r9, r2, r0)
            if (r9 != r1) goto L_0x008b
            return r1
        L_0x008b:
            kotlin.m r9 = kotlin.C19394m.f43287a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.mo3766c(kotlinx.coroutines.d0, androidx.compose.foundation.gestures.c$d, kotlin.coroutines.c):java.lang.Object");
    }
}
