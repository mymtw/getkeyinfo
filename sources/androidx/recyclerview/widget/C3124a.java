package androidx.recyclerview.widget;

import android.support.p013v4.media.C0071c;
import androidx.recyclerview.widget.C3203y;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p077d1.C6621e;

/* renamed from: androidx.recyclerview.widget.a */
public final class C3124a implements C3203y.C3204a {

    /* renamed from: a */
    public C6621e f7180a = new C6621e(30);

    /* renamed from: b */
    public final ArrayList<C3126b> f7181b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<C3126b> f7182c = new ArrayList<>();

    /* renamed from: d */
    public final C3125a f7183d;

    /* renamed from: e */
    public final C3203y f7184e;

    /* renamed from: f */
    public int f7185f = 0;

    /* renamed from: androidx.recyclerview.widget.a$a */
    public interface C3125a {
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    public static final class C3126b {

        /* renamed from: a */
        public int f7186a;

        /* renamed from: b */
        public int f7187b;

        /* renamed from: c */
        public Object f7188c;

        /* renamed from: d */
        public int f7189d;

        public C3126b(Object obj, int i, int i2, int i3) {
            this.f7186a = i;
            this.f7187b = i2;
            this.f7189d = i3;
            this.f7188c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3126b)) {
                return false;
            }
            C3126b bVar = (C3126b) obj;
            int i = this.f7186a;
            if (i != bVar.f7186a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f7189d - this.f7187b) == 1 && this.f7189d == bVar.f7187b && this.f7187b == bVar.f7189d) {
                return true;
            }
            if (this.f7189d != bVar.f7189d || this.f7187b != bVar.f7187b) {
                return false;
            }
            Object obj2 = this.f7188c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f7188c)) {
                    return false;
                }
            } else if (bVar.f7188c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f7186a * 31) + this.f7187b) * 31) + this.f7189d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f7186a;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f7187b);
            sb.append("c:");
            sb.append(this.f7189d);
            sb.append(",p:");
            return C0071c.m192d(sb, this.f7188c, "]");
        }
    }

    public C3124a(RecyclerView.C3088f fVar) {
        this.f7183d = fVar;
        this.f7184e = new C3203y(this);
    }

    /* renamed from: a */
    public final boolean mo11786a(int i) {
        int size = this.f7182c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3126b bVar = this.f7182c.get(i2);
            int i3 = bVar.f7186a;
            if (i3 == 8) {
                if (mo11791f(bVar.f7189d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f7187b;
                int i5 = bVar.f7189d + i4;
                while (i4 < i5) {
                    if (mo11791f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo11787b() {
        int size = this.f7182c.size();
        for (int i = 0; i < size; i++) {
            ((RecyclerView.C3088f) this.f7183d).mo11615a(this.f7182c.get(i));
        }
        mo11797l(this.f7182c);
        this.f7185f = 0;
    }

    /* renamed from: c */
    public final void mo11788c() {
        mo11787b();
        int size = this.f7181b.size();
        for (int i = 0; i < size; i++) {
            C3126b bVar = this.f7181b.get(i);
            int i2 = bVar.f7186a;
            if (i2 == 1) {
                ((RecyclerView.C3088f) this.f7183d).mo11615a(bVar);
                RecyclerView.C3088f fVar = (RecyclerView.C3088f) this.f7183d;
                RecyclerView.this.offsetPositionRecordsForInsert(bVar.f7187b, bVar.f7189d);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            } else if (i2 == 2) {
                ((RecyclerView.C3088f) this.f7183d).mo11615a(bVar);
                C3125a aVar = this.f7183d;
                int i3 = bVar.f7187b;
                int i4 = bVar.f7189d;
                RecyclerView.C3088f fVar2 = (RecyclerView.C3088f) aVar;
                RecyclerView.this.offsetPositionRecordsForRemove(i3, i4, true);
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mItemsAddedOrRemoved = true;
                recyclerView.mState.f7124c += i4;
            } else if (i2 == 4) {
                ((RecyclerView.C3088f) this.f7183d).mo11615a(bVar);
                RecyclerView.C3088f fVar3 = (RecyclerView.C3088f) this.f7183d;
                RecyclerView.this.viewRangeUpdate(bVar.f7187b, bVar.f7189d, bVar.f7188c);
                RecyclerView.this.mItemsChanged = true;
            } else if (i2 == 8) {
                ((RecyclerView.C3088f) this.f7183d).mo11615a(bVar);
                RecyclerView.C3088f fVar4 = (RecyclerView.C3088f) this.f7183d;
                RecyclerView.this.offsetPositionRecordsForMove(bVar.f7187b, bVar.f7189d);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }
        }
        mo11797l(this.f7181b);
        this.f7185f = 0;
    }

    /* renamed from: d */
    public final void mo11789d(C3126b bVar) {
        int i;
        int i2 = bVar.f7186a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m = mo11798m(bVar.f7187b, i2);
        int i3 = bVar.f7187b;
        int i4 = bVar.f7186a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f7189d; i6++) {
            int m2 = mo11798m((i * i6) + bVar.f7187b, bVar.f7186a);
            int i7 = bVar.f7186a;
            if (i7 == 2 ? m2 == m : i7 == 4 && m2 == m + 1) {
                i5++;
            } else {
                C3126b h = mo11793h(bVar.f7188c, i7, m, i5);
                mo11790e(h, i3);
                h.f7188c = null;
                this.f7180a.mo18806a(h);
                if (bVar.f7186a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                m = m2;
            }
        }
        Object obj = bVar.f7188c;
        bVar.f7188c = null;
        this.f7180a.mo18806a(bVar);
        if (i5 > 0) {
            C3126b h2 = mo11793h(obj, bVar.f7186a, m, i5);
            mo11790e(h2, i3);
            h2.f7188c = null;
            this.f7180a.mo18806a(h2);
        }
    }

    /* renamed from: e */
    public final void mo11790e(C3126b bVar, int i) {
        ((RecyclerView.C3088f) this.f7183d).mo11615a(bVar);
        int i2 = bVar.f7186a;
        if (i2 == 2) {
            C3125a aVar = this.f7183d;
            int i3 = bVar.f7189d;
            RecyclerView.C3088f fVar = (RecyclerView.C3088f) aVar;
            RecyclerView.this.offsetPositionRecordsForRemove(i, i3, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f7124c += i3;
        } else if (i2 == 4) {
            RecyclerView.C3088f fVar2 = (RecyclerView.C3088f) this.f7183d;
            RecyclerView.this.viewRangeUpdate(i, bVar.f7189d, bVar.f7188c);
            RecyclerView.this.mItemsChanged = true;
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: f */
    public final int mo11791f(int i, int i2) {
        int size = this.f7182c.size();
        while (i2 < size) {
            C3126b bVar = this.f7182c.get(i2);
            int i3 = bVar.f7186a;
            if (i3 == 8) {
                int i4 = bVar.f7187b;
                if (i4 == i) {
                    i = bVar.f7189d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f7189d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f7187b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f7189d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f7189d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: g */
    public final boolean mo11792g() {
        return this.f7181b.size() > 0;
    }

    /* renamed from: h */
    public final C3126b mo11793h(Object obj, int i, int i2, int i3) {
        C3126b bVar = (C3126b) this.f7180a.mo18807b();
        if (bVar == null) {
            return new C3126b(obj, i, i2, i3);
        }
        bVar.f7186a = i;
        bVar.f7187b = i2;
        bVar.f7189d = i3;
        bVar.f7188c = obj;
        return bVar;
    }

    /* renamed from: i */
    public final void mo11794i(C3126b bVar) {
        this.f7182c.add(bVar);
        int i = bVar.f7186a;
        if (i == 1) {
            C3125a aVar = this.f7183d;
            RecyclerView.C3088f fVar = (RecyclerView.C3088f) aVar;
            RecyclerView.this.offsetPositionRecordsForInsert(bVar.f7187b, bVar.f7189d);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        } else if (i == 2) {
            C3125a aVar2 = this.f7183d;
            RecyclerView.C3088f fVar2 = (RecyclerView.C3088f) aVar2;
            RecyclerView.this.offsetPositionRecordsForRemove(bVar.f7187b, bVar.f7189d, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        } else if (i == 4) {
            C3125a aVar3 = this.f7183d;
            RecyclerView.C3088f fVar3 = (RecyclerView.C3088f) aVar3;
            RecyclerView.this.viewRangeUpdate(bVar.f7187b, bVar.f7189d, bVar.f7188c);
            RecyclerView.this.mItemsChanged = true;
        } else if (i == 8) {
            C3125a aVar4 = this.f7183d;
            RecyclerView.C3088f fVar4 = (RecyclerView.C3088f) aVar4;
            RecyclerView.this.offsetPositionRecordsForMove(bVar.f7187b, bVar.f7189d);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:182:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013f  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11795j() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.y r1 = r0.f7184e
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r0.f7181b
            r1.getClass()
        L_0x0009:
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0010:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0026
            java.lang.Object r9 = r2.get(r3)
            androidx.recyclerview.widget.a$b r9 = (androidx.recyclerview.widget.C3124a.C3126b) r9
            int r9 = r9.f7186a
            if (r9 != r7) goto L_0x0022
            if (r6 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0022:
            r6 = r4
        L_0x0023:
            int r3 = r3 + -1
            goto L_0x0010
        L_0x0026:
            r3 = r8
        L_0x0027:
            r6 = 4
            r9 = 2
            r10 = 0
            if (r3 == r8) goto L_0x01df
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            androidx.recyclerview.widget.a$b r11 = (androidx.recyclerview.widget.C3124a.C3126b) r11
            java.lang.Object r12 = r2.get(r7)
            androidx.recyclerview.widget.a$b r12 = (androidx.recyclerview.widget.C3124a.C3126b) r12
            int r13 = r12.f7186a
            if (r13 == r4) goto L_0x01b5
            if (r13 == r9) goto L_0x00b1
            if (r13 == r6) goto L_0x0043
            goto L_0x0009
        L_0x0043:
            int r5 = r11.f7189d
            int r8 = r12.f7187b
            if (r5 >= r8) goto L_0x004e
            int r8 = r8 + -1
            r12.f7187b = r8
            goto L_0x0064
        L_0x004e:
            int r9 = r12.f7189d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0064
            int r9 = r9 + -1
            r12.f7189d = r9
            androidx.recyclerview.widget.y$a r5 = r1.f7452a
            int r8 = r11.f7187b
            java.lang.Object r9 = r12.f7188c
            androidx.recyclerview.widget.a r5 = (androidx.recyclerview.widget.C3124a) r5
            androidx.recyclerview.widget.a$b r4 = r5.mo11793h(r9, r6, r8, r4)
            goto L_0x0065
        L_0x0064:
            r4 = r10
        L_0x0065:
            int r5 = r11.f7187b
            int r8 = r12.f7187b
            if (r5 > r8) goto L_0x0070
            int r8 = r8 + 1
            r12.f7187b = r8
            goto L_0x0088
        L_0x0070:
            int r9 = r12.f7189d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0088
            int r8 = r8 - r5
            androidx.recyclerview.widget.y$a r9 = r1.f7452a
            int r5 = r5 + 1
            java.lang.Object r13 = r12.f7188c
            androidx.recyclerview.widget.a r9 = (androidx.recyclerview.widget.C3124a) r9
            androidx.recyclerview.widget.a$b r5 = r9.mo11793h(r13, r6, r5, r8)
            int r6 = r12.f7189d
            int r6 = r6 - r8
            r12.f7189d = r6
            goto L_0x0089
        L_0x0088:
            r5 = r10
        L_0x0089:
            r2.set(r7, r11)
            int r6 = r12.f7189d
            if (r6 <= 0) goto L_0x0094
            r2.set(r3, r12)
            goto L_0x00a5
        L_0x0094:
            r2.remove(r3)
            androidx.recyclerview.widget.y$a r6 = r1.f7452a
            androidx.recyclerview.widget.a r6 = (androidx.recyclerview.widget.C3124a) r6
            r6.getClass()
            r12.f7188c = r10
            d1.e r6 = r6.f7180a
            r6.mo18806a(r12)
        L_0x00a5:
            if (r4 == 0) goto L_0x00aa
            r2.add(r3, r4)
        L_0x00aa:
            if (r5 == 0) goto L_0x0009
            r2.add(r3, r5)
            goto L_0x0009
        L_0x00b1:
            int r6 = r11.f7187b
            int r8 = r11.f7189d
            if (r6 >= r8) goto L_0x00c6
            int r13 = r12.f7187b
            if (r13 != r6) goto L_0x00c4
            int r13 = r12.f7189d
            int r6 = r8 - r6
            if (r13 != r6) goto L_0x00c4
            r5 = r4
            r6 = 0
            goto L_0x00d6
        L_0x00c4:
            r5 = 0
            goto L_0x00d2
        L_0x00c6:
            int r13 = r12.f7187b
            int r14 = r8 + 1
            if (r13 != r14) goto L_0x00d4
            int r13 = r12.f7189d
            int r6 = r6 - r8
            if (r13 != r6) goto L_0x00d4
            r5 = r4
        L_0x00d2:
            r6 = r5
            goto L_0x00d6
        L_0x00d4:
            r6 = r4
            r5 = 0
        L_0x00d6:
            int r13 = r12.f7187b
            if (r8 >= r13) goto L_0x00df
            int r13 = r13 + -1
            r12.f7187b = r13
            goto L_0x0103
        L_0x00df:
            int r14 = r12.f7189d
            int r13 = r13 + r14
            if (r8 >= r13) goto L_0x0103
            int r14 = r14 + -1
            r12.f7189d = r14
            r11.f7186a = r9
            r11.f7189d = r4
            int r3 = r12.f7189d
            if (r3 != 0) goto L_0x0009
            r2.remove(r7)
            androidx.recyclerview.widget.y$a r3 = r1.f7452a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.C3124a) r3
            r3.getClass()
            r12.f7188c = r10
            d1.e r3 = r3.f7180a
            r3.mo18806a(r12)
            goto L_0x0009
        L_0x0103:
            int r4 = r11.f7187b
            int r8 = r12.f7187b
            if (r4 > r8) goto L_0x010e
            int r8 = r8 + 1
            r12.f7187b = r8
            goto L_0x0126
        L_0x010e:
            int r13 = r12.f7189d
            int r8 = r8 + r13
            if (r4 >= r8) goto L_0x0126
            int r8 = r8 - r4
            androidx.recyclerview.widget.y$a r13 = r1.f7452a
            int r4 = r4 + 1
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.C3124a) r13
            androidx.recyclerview.widget.a$b r4 = r13.mo11793h(r10, r9, r4, r8)
            int r8 = r11.f7187b
            int r9 = r12.f7187b
            int r8 = r8 - r9
            r12.f7189d = r8
            goto L_0x0127
        L_0x0126:
            r4 = r10
        L_0x0127:
            if (r5 == 0) goto L_0x013f
            r2.set(r3, r12)
            r2.remove(r7)
            androidx.recyclerview.widget.y$a r3 = r1.f7452a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.C3124a) r3
            r3.getClass()
            r11.f7188c = r10
            d1.e r3 = r3.f7180a
            r3.mo18806a(r11)
            goto L_0x0009
        L_0x013f:
            if (r6 == 0) goto L_0x0170
            if (r4 == 0) goto L_0x0159
            int r5 = r11.f7187b
            int r6 = r4.f7187b
            if (r5 <= r6) goto L_0x014e
            int r6 = r4.f7189d
            int r5 = r5 - r6
            r11.f7187b = r5
        L_0x014e:
            int r5 = r11.f7189d
            int r6 = r4.f7187b
            if (r5 <= r6) goto L_0x0159
            int r6 = r4.f7189d
            int r5 = r5 - r6
            r11.f7189d = r5
        L_0x0159:
            int r5 = r11.f7187b
            int r6 = r12.f7187b
            if (r5 <= r6) goto L_0x0164
            int r6 = r12.f7189d
            int r5 = r5 - r6
            r11.f7187b = r5
        L_0x0164:
            int r5 = r11.f7189d
            int r6 = r12.f7187b
            if (r5 <= r6) goto L_0x019e
            int r6 = r12.f7189d
            int r5 = r5 - r6
            r11.f7189d = r5
            goto L_0x019e
        L_0x0170:
            if (r4 == 0) goto L_0x0188
            int r5 = r11.f7187b
            int r6 = r4.f7187b
            if (r5 < r6) goto L_0x017d
            int r6 = r4.f7189d
            int r5 = r5 - r6
            r11.f7187b = r5
        L_0x017d:
            int r5 = r11.f7189d
            int r6 = r4.f7187b
            if (r5 < r6) goto L_0x0188
            int r6 = r4.f7189d
            int r5 = r5 - r6
            r11.f7189d = r5
        L_0x0188:
            int r5 = r11.f7187b
            int r6 = r12.f7187b
            if (r5 < r6) goto L_0x0193
            int r6 = r12.f7189d
            int r5 = r5 - r6
            r11.f7187b = r5
        L_0x0193:
            int r5 = r11.f7189d
            int r6 = r12.f7187b
            if (r5 < r6) goto L_0x019e
            int r6 = r12.f7189d
            int r5 = r5 - r6
            r11.f7189d = r5
        L_0x019e:
            r2.set(r3, r12)
            int r5 = r11.f7187b
            int r6 = r11.f7189d
            if (r5 == r6) goto L_0x01ab
            r2.set(r7, r11)
            goto L_0x01ae
        L_0x01ab:
            r2.remove(r7)
        L_0x01ae:
            if (r4 == 0) goto L_0x0009
            r2.add(r3, r4)
            goto L_0x0009
        L_0x01b5:
            int r4 = r11.f7189d
            int r6 = r12.f7187b
            if (r4 >= r6) goto L_0x01bd
            r5 = r8
            goto L_0x01be
        L_0x01bd:
            r5 = 0
        L_0x01be:
            int r8 = r11.f7187b
            if (r8 >= r6) goto L_0x01c4
            int r5 = r5 + 1
        L_0x01c4:
            if (r6 > r8) goto L_0x01cb
            int r6 = r12.f7189d
            int r8 = r8 + r6
            r11.f7187b = r8
        L_0x01cb:
            int r6 = r12.f7187b
            if (r6 > r4) goto L_0x01d4
            int r8 = r12.f7189d
            int r4 = r4 + r8
            r11.f7189d = r4
        L_0x01d4:
            int r6 = r6 + r5
            r12.f7187b = r6
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0009
        L_0x01df:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f7181b
            int r1 = r1.size()
            r2 = 0
        L_0x01e6:
            if (r2 >= r1) goto L_0x02e7
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f7181b
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.C3124a.C3126b) r3
            int r11 = r3.f7186a
            if (r11 == r4) goto L_0x02dd
            if (r11 == r9) goto L_0x0270
            if (r11 == r6) goto L_0x0201
            if (r11 == r7) goto L_0x01fc
            goto L_0x02e0
        L_0x01fc:
            r0.mo11794i(r3)
            goto L_0x02e0
        L_0x0201:
            int r11 = r3.f7187b
            int r12 = r3.f7189d
            int r12 = r12 + r11
            r15 = r8
            r13 = r11
            r14 = 0
        L_0x0209:
            if (r11 >= r12) goto L_0x0253
            androidx.recyclerview.widget.a$a r5 = r0.f7183d
            androidx.recyclerview.widget.RecyclerView$f r5 = (androidx.recyclerview.widget.RecyclerView.C3088f) r5
            androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$b0 r7 = r7.findViewHolderForPosition(r11, r4)
            if (r7 != 0) goto L_0x0219
        L_0x0217:
            r7 = r10
            goto L_0x0226
        L_0x0219:
            androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.g r5 = r5.mChildHelper
            android.view.View r8 = r7.itemView
            boolean r5 = r5.mo11855k(r8)
            if (r5 == 0) goto L_0x0226
            goto L_0x0217
        L_0x0226:
            if (r7 != 0) goto L_0x023e
            boolean r5 = r0.mo11786a(r11)
            if (r5 == 0) goto L_0x022f
            goto L_0x023e
        L_0x022f:
            if (r15 != r4) goto L_0x023c
            java.lang.Object r5 = r3.f7188c
            androidx.recyclerview.widget.a$b r5 = r0.mo11793h(r5, r6, r13, r14)
            r0.mo11794i(r5)
            r13 = r11
            r14 = 0
        L_0x023c:
            r15 = 0
            goto L_0x024c
        L_0x023e:
            if (r15 != 0) goto L_0x024b
            java.lang.Object r5 = r3.f7188c
            androidx.recyclerview.widget.a$b r5 = r0.mo11793h(r5, r6, r13, r14)
            r0.mo11789d(r5)
            r13 = r11
            r14 = 0
        L_0x024b:
            r15 = r4
        L_0x024c:
            int r14 = r14 + r4
            int r11 = r11 + 1
            r7 = 8
            r8 = -1
            goto L_0x0209
        L_0x0253:
            int r5 = r3.f7189d
            if (r14 == r5) goto L_0x0264
            java.lang.Object r5 = r3.f7188c
            r3.f7188c = r10
            d1.e r7 = r0.f7180a
            r7.mo18806a(r3)
            androidx.recyclerview.widget.a$b r3 = r0.mo11793h(r5, r6, r13, r14)
        L_0x0264:
            if (r15 != 0) goto L_0x026b
            r0.mo11789d(r3)
            goto L_0x02e0
        L_0x026b:
            r0.mo11794i(r3)
            goto L_0x02e0
        L_0x0270:
            int r5 = r3.f7187b
            int r7 = r3.f7189d
            int r7 = r7 + r5
            r8 = r5
            r11 = 0
            r12 = -1
        L_0x0278:
            if (r8 >= r7) goto L_0x02c4
            androidx.recyclerview.widget.a$a r13 = r0.f7183d
            androidx.recyclerview.widget.RecyclerView$f r13 = (androidx.recyclerview.widget.RecyclerView.C3088f) r13
            androidx.recyclerview.widget.RecyclerView r14 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$b0 r14 = r14.findViewHolderForPosition(r8, r4)
            if (r14 != 0) goto L_0x0288
        L_0x0286:
            r14 = r10
            goto L_0x0295
        L_0x0288:
            androidx.recyclerview.widget.RecyclerView r13 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.g r13 = r13.mChildHelper
            android.view.View r15 = r14.itemView
            boolean r13 = r13.mo11855k(r15)
            if (r13 == 0) goto L_0x0295
            goto L_0x0286
        L_0x0295:
            if (r14 != 0) goto L_0x02ac
            boolean r13 = r0.mo11786a(r8)
            if (r13 == 0) goto L_0x029e
            goto L_0x02ac
        L_0x029e:
            if (r12 != r4) goto L_0x02a9
            androidx.recyclerview.widget.a$b r12 = r0.mo11793h(r10, r9, r5, r11)
            r0.mo11794i(r12)
            r12 = r4
            goto L_0x02aa
        L_0x02a9:
            r12 = 0
        L_0x02aa:
            r13 = 0
            goto L_0x02b9
        L_0x02ac:
            if (r12 != 0) goto L_0x02b7
            androidx.recyclerview.widget.a$b r12 = r0.mo11793h(r10, r9, r5, r11)
            r0.mo11789d(r12)
            r12 = r4
            goto L_0x02b8
        L_0x02b7:
            r12 = 0
        L_0x02b8:
            r13 = r4
        L_0x02b9:
            if (r12 == 0) goto L_0x02bf
            int r8 = r8 - r11
            int r7 = r7 - r11
            r11 = r4
            goto L_0x02c1
        L_0x02bf:
            int r11 = r11 + 1
        L_0x02c1:
            int r8 = r8 + r4
            r12 = r13
            goto L_0x0278
        L_0x02c4:
            int r7 = r3.f7189d
            if (r11 == r7) goto L_0x02d3
            r3.f7188c = r10
            d1.e r7 = r0.f7180a
            r7.mo18806a(r3)
            androidx.recyclerview.widget.a$b r3 = r0.mo11793h(r10, r9, r5, r11)
        L_0x02d3:
            if (r12 != 0) goto L_0x02d9
            r0.mo11789d(r3)
            goto L_0x02e0
        L_0x02d9:
            r0.mo11794i(r3)
            goto L_0x02e0
        L_0x02dd:
            r0.mo11794i(r3)
        L_0x02e0:
            int r2 = r2 + 1
            r7 = 8
            r8 = -1
            goto L_0x01e6
        L_0x02e7:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f7181b
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C3124a.mo11795j():void");
    }

    /* renamed from: k */
    public final void mo11796k(C3126b bVar) {
        bVar.f7188c = null;
        this.f7180a.mo18806a(bVar);
    }

    /* renamed from: l */
    public final void mo11797l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mo11796k((C3126b) arrayList.get(i));
        }
        arrayList.clear();
    }

    /* renamed from: m */
    public final int mo11798m(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f7182c.size() - 1; size >= 0; size--) {
            C3126b bVar = this.f7182c.get(size);
            int i5 = bVar.f7186a;
            if (i5 == 8) {
                int i6 = bVar.f7187b;
                int i7 = bVar.f7189d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.f7187b = i6 + 1;
                            bVar.f7189d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.f7187b = i6 - 1;
                            bVar.f7189d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.f7189d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.f7189d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f7187b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.f7187b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.f7187b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.f7189d;
                    } else if (i5 == 2) {
                        i += bVar.f7189d;
                    }
                } else if (i2 == 1) {
                    bVar.f7187b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.f7187b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f7182c.size() - 1; size2 >= 0; size2--) {
            C3126b bVar2 = this.f7182c.get(size2);
            if (bVar2.f7186a == 8) {
                int i9 = bVar2.f7189d;
                if (i9 == bVar2.f7187b || i9 < 0) {
                    this.f7182c.remove(size2);
                    mo11796k(bVar2);
                }
            } else if (bVar2.f7189d <= 0) {
                this.f7182c.remove(size2);
                mo11796k(bVar2);
            }
        }
        return i;
    }
}
