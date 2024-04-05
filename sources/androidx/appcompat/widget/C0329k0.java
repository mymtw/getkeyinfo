package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.k0 */
public final class C0329k0 {

    /* renamed from: a */
    public int f825a = 0;

    /* renamed from: b */
    public int f826b = 0;

    /* renamed from: c */
    public int f827c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f828d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f829e = 0;

    /* renamed from: f */
    public int f830f = 0;

    /* renamed from: g */
    public boolean f831g = false;

    /* renamed from: h */
    public boolean f832h = false;

    /* renamed from: a */
    public final void mo3075a(int i, int i2) {
        this.f827c = i;
        this.f828d = i2;
        this.f832h = true;
        if (this.f831g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f825a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f826b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f825a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f826b = i2;
        }
    }
}
