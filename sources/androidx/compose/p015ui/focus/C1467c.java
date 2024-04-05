package androidx.compose.p015ui.focus;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p098f0.C6764b;
import p098f0.C6765c;
import p098f0.C6766d;
import p098f0.C6767e;
import p219r.C7734e;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.focus.c */
public final class C1467c implements C6765c<C1467c>, C6764b {

    /* renamed from: b */
    public final C19857l<C1481o, C19394m> f3174b;

    /* renamed from: c */
    public C1467c f3175c;

    /* renamed from: d */
    public final C7734e<C1467c> f3176d = new C7734e<>(new C1467c[16]);

    /* renamed from: e */
    public final C7734e<FocusModifier> f3177e = new C7734e<>(new FocusModifier[16]);

    /* renamed from: androidx.compose.ui.focus.c$a */
    public /* synthetic */ class C1468a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3178a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            iArr[FocusStateImpl.Captured.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f3178a = iArr;
        }
    }

    public C1467c(C19857l<? super C1481o, C19394m> lVar) {
        C19383o.m32797g(lVar, "onFocusEvent");
        this.f3174b = lVar;
    }

    /* renamed from: M */
    public final void mo3622M(C6766d dVar) {
        C19383o.m32797g(dVar, "scope");
        C6767e<C1467c> eVar = FocusEventModifierKt.f3145a;
        C1467c cVar = (C1467c) dVar.mo6818a(eVar);
        if (!C19383o.m32792b(cVar, this.f3175c)) {
            C1467c cVar2 = this.f3175c;
            if (cVar2 != null) {
                cVar2.f3176d.mo20241o(this);
                cVar2.mo6211g(this.f3177e);
            }
            this.f3175c = cVar;
            if (cVar != null) {
                cVar.f3176d.mo20232c(this);
                cVar.mo6208b(this.f3177e);
            }
        }
        this.f3175c = (C1467c) dVar.mo6818a(eVar);
    }

    /* renamed from: a */
    public final void mo6207a(FocusModifier focusModifier) {
        C19383o.m32797g(focusModifier, "focusModifier");
        this.f3177e.mo20232c(focusModifier);
        C1467c cVar = this.f3175c;
        if (cVar != null) {
            cVar.mo6207a(focusModifier);
        }
    }

    /* renamed from: b */
    public final void mo6208b(C7734e<FocusModifier> eVar) {
        C7734e<FocusModifier> eVar2 = this.f3177e;
        eVar2.mo20233e(eVar2.f17157d, eVar);
        C1467c cVar = this.f3175c;
        if (cVar != null) {
            cVar.mo6208b(eVar);
        }
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [java.lang.Boolean] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.Boolean] */
    /* JADX WARNING: type inference failed for: r3v8, types: [java.lang.Boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r3 = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r4 = r5;
        r3 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6209d() {
        /*
            r8 = this;
            r.e<androidx.compose.ui.focus.FocusModifier> r0 = r8.f3177e
            int r1 = r0.f17157d
            if (r1 == 0) goto L_0x0052
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L_0x0049
            r3 = 0
            if (r1 <= 0) goto L_0x0034
            T[] r0 = r0.f17155b
            r4 = r3
        L_0x0010:
            r5 = r0[r2]
            androidx.compose.ui.focus.FocusModifier r5 = (androidx.compose.p015ui.focus.FocusModifier) r5
            androidx.compose.ui.focus.FocusStateImpl r6 = r5.f3153e
            int[] r7 = androidx.compose.p015ui.focus.C1467c.C1468a.f3178a
            int r6 = r6.ordinal()
            r6 = r7[r6]
            switch(r6) {
                case 1: goto L_0x002a;
                case 2: goto L_0x002a;
                case 3: goto L_0x002a;
                case 4: goto L_0x002a;
                case 5: goto L_0x0025;
                case 6: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x002d
        L_0x0022:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            goto L_0x002d
        L_0x0025:
            if (r3 != 0) goto L_0x002d
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x002d
        L_0x002a:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4 = r5
        L_0x002d:
            int r2 = r2 + 1
            if (r2 < r1) goto L_0x0010
            r0 = r3
            r3 = r4
            goto L_0x0035
        L_0x0034:
            r0 = r3
        L_0x0035:
            if (r3 == 0) goto L_0x003b
            androidx.compose.ui.focus.FocusStateImpl r1 = r3.f3153e
            if (r1 != 0) goto L_0x0054
        L_0x003b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r1)
            if (r0 == 0) goto L_0x0046
            androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p015ui.focus.FocusStateImpl.Deactivated
            goto L_0x0054
        L_0x0046:
            androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p015ui.focus.FocusStateImpl.Inactive
            goto L_0x0054
        L_0x0049:
            T[] r0 = r0.f17155b
            r0 = r0[r2]
            androidx.compose.ui.focus.FocusModifier r0 = (androidx.compose.p015ui.focus.FocusModifier) r0
            androidx.compose.ui.focus.FocusStateImpl r1 = r0.f3153e
            goto L_0x0054
        L_0x0052:
            androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p015ui.focus.FocusStateImpl.Inactive
        L_0x0054:
            kq.l<androidx.compose.ui.focus.o, kotlin.m> r0 = r8.f3174b
            r0.invoke(r1)
            androidx.compose.ui.focus.c r0 = r8.f3175c
            if (r0 == 0) goto L_0x0060
            r0.mo6209d()
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.focus.C1467c.mo6209d():void");
    }

    /* renamed from: e */
    public final void mo6210e(FocusModifier focusModifier) {
        C19383o.m32797g(focusModifier, "focusModifier");
        this.f3177e.mo20241o(focusModifier);
        C1467c cVar = this.f3175c;
        if (cVar != null) {
            cVar.mo6210e(focusModifier);
        }
    }

    /* renamed from: g */
    public final void mo6211g(C7734e<FocusModifier> eVar) {
        this.f3177e.mo20242p(eVar);
        C1467c cVar = this.f3175c;
        if (cVar != null) {
            cVar.mo6211g(eVar);
        }
    }

    public final C6767e<C1467c> getKey() {
        return FocusEventModifierKt.f3145a;
    }

    public final Object getValue() {
        return this;
    }
}
