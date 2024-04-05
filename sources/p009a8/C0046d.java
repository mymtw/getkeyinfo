package p009a8;

/* renamed from: a8.d */
public final class C0046d extends C0045c {

    /* renamed from: x */
    public String f127x;

    public C0046d(int i) {
        super(i);
    }

    /* renamed from: j */
    public final void mo81j() {
        int i = this.f112f + 1;
        this.f112f = i;
        this.f107a = i >= this.f126w ? 26 : this.f127x.charAt(i);
    }

    /* renamed from: k */
    public final void mo82k() {
        int i = this.f112f + 1;
        this.f112f = i;
        this.f107a = i >= this.f126w ? 26 : this.f127x.charAt(i);
    }

    /* renamed from: n */
    public final void mo87n(int i, int i2) {
        while (i < i2 - 1 && Character.isWhitespace(this.f127x.charAt(i))) {
            i++;
        }
        while (true) {
            int i3 = i2 - 1;
            if (i3 <= i || !Character.isWhitespace(this.f127x.charAt(i3))) {
                this.f111e = this.f127x.substring(i, i2);
            } else {
                i2 = i3;
            }
        }
        this.f111e = this.f127x.substring(i, i2);
    }
}
