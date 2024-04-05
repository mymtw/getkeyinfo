package androidx.compose.p015ui.tooling;

import androidx.compose.p015ui.tooling.data.C2060c;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$findDesignInfoProviders$1$1 */
public final class ComposeViewAdapter$findDesignInfoProviders$1$1 extends Lambda implements C19857l<C2060c, Boolean> {
    public final /* synthetic */ ComposeViewAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeViewAdapter$findDesignInfoProviders$1$1(ComposeViewAdapter composeViewAdapter) {
        super(1);
        this.this$0 = composeViewAdapter;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0064 A[EDGE_INSN: B:34:0x0064->B:31:0x0064 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean invoke(androidx.compose.p015ui.tooling.data.C2060c r7) {
        /*
            r6 = this;
            java.lang.String r0 = "group"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            java.util.Collection<androidx.compose.ui.tooling.data.c> r7 = r7.f4659g
            androidx.compose.ui.tooling.ComposeViewAdapter r0 = r6.this$0
            boolean r1 = r7 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0017
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L_0x0017
        L_0x0015:
            r2 = r3
            goto L_0x0064
        L_0x0017:
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0015
            java.lang.Object r1 = r7.next()
            androidx.compose.ui.tooling.data.c r1 = (androidx.compose.p015ui.tooling.data.C2060c) r1
            java.lang.String r4 = r1.f4654b
            java.lang.String r5 = "remember"
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r5)
            if (r4 == 0) goto L_0x0061
            java.util.Collection<java.lang.Object> r1 = r1.f4658f
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L_0x003f
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x003f
        L_0x003d:
            r1 = r3
            goto L_0x005d
        L_0x003f:
            java.util.Iterator r1 = r1.iterator()
        L_0x0043:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r1.next()
            if (r4 == 0) goto L_0x0054
            java.lang.reflect.Method r4 = r0.getDesignInfoMethodOrNull(r4)
            goto L_0x0055
        L_0x0054:
            r4 = 0
        L_0x0055:
            if (r4 == 0) goto L_0x0059
            r4 = r2
            goto L_0x005a
        L_0x0059:
            r4 = r3
        L_0x005a:
            if (r4 == 0) goto L_0x0043
            r1 = r2
        L_0x005d:
            if (r1 == 0) goto L_0x0061
            r1 = r2
            goto L_0x0062
        L_0x0061:
            r1 = r3
        L_0x0062:
            if (r1 == 0) goto L_0x001b
        L_0x0064:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.tooling.ComposeViewAdapter$findDesignInfoProviders$1$1.invoke(androidx.compose.ui.tooling.data.c):java.lang.Boolean");
    }
}
