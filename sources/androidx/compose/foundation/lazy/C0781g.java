package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.C0779f;
import androidx.compose.p015ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.p015ui.layout.C1667b;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import p098f0.C6765c;
import p098f0.C6767e;

/* renamed from: androidx.compose.foundation.lazy.g */
public final class C0781g implements C6765c<C1667b>, C1667b {

    /* renamed from: b */
    public final LazyListState f1630b;

    /* renamed from: c */
    public final C0779f f1631c;

    /* renamed from: d */
    public final boolean f1632d;

    /* renamed from: e */
    public final LayoutDirection f1633e;

    /* renamed from: androidx.compose.foundation.lazy.g$a */
    public /* synthetic */ class C0782a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1634a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f1634a = iArr;
        }
    }

    public C0781g(LazyListState lazyListState, C0779f fVar, boolean z, LayoutDirection layoutDirection) {
        C19383o.m32797g(lazyListState, "state");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        this.f1630b = lazyListState;
        this.f1631c = fVar;
        this.f1632d = z;
        this.f1633e = layoutDirection;
    }

    /* renamed from: d */
    public static final boolean m1800d(C0779f.C0780a aVar, C0781g gVar) {
        return aVar.f1629b < gVar.f1630b.mo4226g().mo4243a() - 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r8.f1632d != false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        if (r8.f1632d != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008f, code lost:
        if (r8.f1632d != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r8.f1632d != false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ae, code lost:
        if (r8.f1632d != false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b3, code lost:
        if (r8.f1632d != false) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00eb A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo4250a(p753kq.C19857l r9, int r10) {
        /*
            r8 = this;
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            androidx.compose.foundation.lazy.f r1 = r8.f1631c
            androidx.compose.foundation.lazy.LazyListState r2 = r8.f1630b
            int r2 = r2.mo4224e()
            androidx.compose.foundation.lazy.LazyListState r3 = r8.f1630b
            androidx.compose.foundation.lazy.m r3 = r3.mo4226g()
            java.util.List r3 = r3.mo4244b()
            java.lang.Object r3 = kotlin.collections.C19327t.m32645a1(r3)
            androidx.compose.foundation.lazy.j r3 = (androidx.compose.foundation.lazy.C0827j) r3
            int r3 = r3.getIndex()
            r1.getClass()
            androidx.compose.foundation.lazy.f$a r4 = new androidx.compose.foundation.lazy.f$a
            r4.<init>(r2, r3)
            r.e<androidx.compose.foundation.lazy.f$a> r1 = r1.f1627a
            r1.mo20232c(r4)
            r0.element = r4
            r1 = 0
        L_0x0031:
            java.lang.String r2 = "interval"
            if (r1 != 0) goto L_0x0102
            T r3 = r0.element
            androidx.compose.foundation.lazy.f$a r3 = (androidx.compose.foundation.lazy.C0779f.C0780a) r3
            boolean r3 = r8.mo4251b(r3, r10)
            if (r3 == 0) goto L_0x0102
            T r1 = r0.element
            androidx.compose.foundation.lazy.f$a r1 = (androidx.compose.foundation.lazy.C0779f.C0780a) r1
            int r3 = r1.f1628a
            int r1 = r1.f1629b
            r4 = 0
            r5 = 1
            if (r10 != r5) goto L_0x004d
            r6 = r5
            goto L_0x004e
        L_0x004d:
            r6 = r4
        L_0x004e:
            if (r6 == 0) goto L_0x0052
            goto L_0x00b5
        L_0x0052:
            r6 = 2
            if (r10 != r6) goto L_0x0057
            r7 = r5
            goto L_0x0058
        L_0x0057:
            r7 = r4
        L_0x0058:
            if (r7 == 0) goto L_0x005c
            goto L_0x00b8
        L_0x005c:
            r7 = 5
            if (r10 != r7) goto L_0x0061
            r7 = r5
            goto L_0x0062
        L_0x0061:
            r7 = r4
        L_0x0062:
            if (r7 == 0) goto L_0x0069
            boolean r4 = r8.f1632d
            if (r4 == 0) goto L_0x00b5
            goto L_0x00b8
        L_0x0069:
            r7 = 6
            if (r10 != r7) goto L_0x006e
            r7 = r5
            goto L_0x006f
        L_0x006e:
            r7 = r4
        L_0x006f:
            if (r7 == 0) goto L_0x0076
            boolean r4 = r8.f1632d
            if (r4 == 0) goto L_0x00b8
            goto L_0x00b5
        L_0x0076:
            r7 = 3
            if (r10 != r7) goto L_0x007b
            r7 = r5
            goto L_0x007c
        L_0x007b:
            r7 = r4
        L_0x007c:
            if (r7 == 0) goto L_0x0097
            androidx.compose.ui.unit.LayoutDirection r4 = r8.f1633e
            int[] r7 = androidx.compose.foundation.lazy.C0781g.C0782a.f1634a
            int r4 = r4.ordinal()
            r4 = r7[r4]
            if (r4 == r5) goto L_0x0092
            if (r4 == r6) goto L_0x008d
            goto L_0x00ba
        L_0x008d:
            boolean r4 = r8.f1632d
            if (r4 == 0) goto L_0x00b8
            goto L_0x00b5
        L_0x0092:
            boolean r4 = r8.f1632d
            if (r4 == 0) goto L_0x00b5
            goto L_0x00b8
        L_0x0097:
            r7 = 4
            if (r10 != r7) goto L_0x009b
            r4 = r5
        L_0x009b:
            if (r4 == 0) goto L_0x00f6
            androidx.compose.ui.unit.LayoutDirection r4 = r8.f1633e
            int[] r7 = androidx.compose.foundation.lazy.C0781g.C0782a.f1634a
            int r4 = r4.ordinal()
            r4 = r7[r4]
            if (r4 == r5) goto L_0x00b1
            if (r4 == r6) goto L_0x00ac
            goto L_0x00ba
        L_0x00ac:
            boolean r4 = r8.f1632d
            if (r4 == 0) goto L_0x00b5
            goto L_0x00b8
        L_0x00b1:
            boolean r4 = r8.f1632d
            if (r4 == 0) goto L_0x00b8
        L_0x00b5:
            int r3 = r3 + -1
            goto L_0x00ba
        L_0x00b8:
            int r1 = r1 + 1
        L_0x00ba:
            androidx.compose.foundation.lazy.f r4 = r8.f1631c
            r4.getClass()
            androidx.compose.foundation.lazy.f$a r5 = new androidx.compose.foundation.lazy.f$a
            r5.<init>(r3, r1)
            r.e<androidx.compose.foundation.lazy.f$a> r1 = r4.f1627a
            r1.mo20232c(r5)
            androidx.compose.foundation.lazy.f r1 = r8.f1631c
            T r3 = r0.element
            androidx.compose.foundation.lazy.f$a r3 = (androidx.compose.foundation.lazy.C0779f.C0780a) r3
            r1.getClass()
            kotlin.jvm.internal.C19383o.m32797g(r3, r2)
            r.e<androidx.compose.foundation.lazy.f$a> r1 = r1.f1627a
            r1.mo20241o(r3)
            r0.element = r5
            androidx.compose.foundation.lazy.LazyListState r1 = r8.f1630b
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r1.f1611k
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.layout.j0 r1 = (androidx.compose.p015ui.layout.C1690j0) r1
            if (r1 == 0) goto L_0x00eb
            r1.mo6690b()
        L_0x00eb:
            androidx.compose.foundation.lazy.h r1 = new androidx.compose.foundation.lazy.h
            r1.<init>(r8, r0, r10)
            java.lang.Object r1 = r9.invoke(r1)
            goto L_0x0031
        L_0x00f6:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Lazy list does not support beyond bounds layout for the specified direction"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0102:
            androidx.compose.foundation.lazy.f r9 = r8.f1631c
            T r10 = r0.element
            androidx.compose.foundation.lazy.f$a r10 = (androidx.compose.foundation.lazy.C0779f.C0780a) r10
            r9.getClass()
            kotlin.jvm.internal.C19383o.m32797g(r10, r2)
            r.e<androidx.compose.foundation.lazy.f$a> r9 = r9.f1627a
            r9.mo20241o(r10)
            androidx.compose.foundation.lazy.LazyListState r9 = r8.f1630b
            androidx.compose.runtime.ParcelableSnapshotMutableState r9 = r9.f1611k
            java.lang.Object r9 = r9.getValue()
            androidx.compose.ui.layout.j0 r9 = (androidx.compose.p015ui.layout.C1690j0) r9
            if (r9 == 0) goto L_0x0122
            r9.mo6690b()
        L_0x0122:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.C0781g.mo4250a(kq.l, int):java.lang.Object");
    }

    /* renamed from: b */
    public final boolean mo4251b(C0779f.C0780a aVar, int i) {
        if (!(i == 1)) {
            if (i == 2) {
                return m1800d(aVar, this);
            }
            if (!(i == 5)) {
                if (!(i == 6)) {
                    if (i == 3) {
                        int i2 = C0782a.f1634a[this.f1633e.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            } else if (!this.f1632d) {
                                return m1800d(aVar, this);
                            } else {
                                if (aVar.f1628a <= 0) {
                                    return false;
                                }
                            }
                        } else if (this.f1632d) {
                            return m1800d(aVar, this);
                        } else {
                            if (aVar.f1628a <= 0) {
                                return false;
                            }
                        }
                    } else {
                        if (i == 4) {
                            int i3 = C0782a.f1634a[this.f1633e.ordinal()];
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                } else if (this.f1632d) {
                                    return m1800d(aVar, this);
                                } else {
                                    if (aVar.f1628a <= 0) {
                                        return false;
                                    }
                                }
                            } else if (!this.f1632d) {
                                return m1800d(aVar, this);
                            } else {
                                if (aVar.f1628a <= 0) {
                                    return false;
                                }
                            }
                        } else {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                        }
                    }
                } else if (!this.f1632d) {
                    return m1800d(aVar, this);
                } else {
                    if (aVar.f1628a <= 0) {
                        return false;
                    }
                }
            } else if (this.f1632d) {
                return m1800d(aVar, this);
            } else {
                if (aVar.f1628a <= 0) {
                    return false;
                }
            }
        } else if (aVar.f1628a <= 0) {
            return false;
        }
        return true;
    }

    public final C6767e<C1667b> getKey() {
        return BeyondBoundsLayoutKt.f3696a;
    }

    public final Object getValue() {
        return this;
    }
}
