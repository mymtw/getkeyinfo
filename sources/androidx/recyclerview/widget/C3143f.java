package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.f */
public final class C3143f implements C3202x {

    /* renamed from: a */
    public final C3202x f7223a;

    /* renamed from: b */
    public int f7224b = 0;

    /* renamed from: c */
    public int f7225c = -1;

    /* renamed from: d */
    public int f7226d = -1;

    /* renamed from: e */
    public Object f7227e = null;

    public C3143f(C3202x xVar) {
        this.f7223a = xVar;
    }

    /* renamed from: a */
    public final void mo11816a(int i, int i2) {
        int i3;
        if (this.f7224b == 1 && i >= (i3 = this.f7225c)) {
            int i4 = this.f7226d;
            if (i <= i3 + i4) {
                this.f7226d = i4 + i2;
                this.f7225c = Math.min(i, i3);
                return;
            }
        }
        mo11840e();
        this.f7225c = i;
        this.f7226d = i2;
        this.f7224b = 1;
    }

    /* renamed from: b */
    public final void mo11817b(int i, int i2) {
        int i3;
        if (this.f7224b != 2 || (i3 = this.f7225c) < i || i3 > i + i2) {
            mo11840e();
            this.f7225c = i;
            this.f7226d = i2;
            this.f7224b = 2;
            return;
        }
        this.f7226d += i2;
        this.f7225c = i;
    }

    /* renamed from: c */
    public final void mo11818c(int i, int i2, Object obj) {
        int i3;
        if (this.f7224b == 3) {
            int i4 = this.f7225c;
            int i5 = this.f7226d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f7227e == obj) {
                this.f7225c = Math.min(i, i4);
                this.f7226d = Math.max(i5 + i4, i3) - this.f7225c;
                return;
            }
        }
        mo11840e();
        this.f7225c = i;
        this.f7226d = i2;
        this.f7227e = obj;
        this.f7224b = 3;
    }

    /* renamed from: d */
    public final void mo11819d(int i, int i2) {
        mo11840e();
        this.f7223a.mo11819d(i, i2);
    }

    /* renamed from: e */
    public final void mo11840e() {
        int i = this.f7224b;
        if (i != 0) {
            if (i == 1) {
                this.f7223a.mo11816a(this.f7225c, this.f7226d);
            } else if (i == 2) {
                this.f7223a.mo11817b(this.f7225c, this.f7226d);
            } else if (i == 3) {
                this.f7223a.mo11818c(this.f7225c, this.f7226d, this.f7227e);
            }
            this.f7227e = null;
            this.f7224b = 0;
        }
    }
}
