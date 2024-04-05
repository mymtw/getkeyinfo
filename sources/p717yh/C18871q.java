package p717yh;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import p513bj.C14075p;
import p513bj.C14077r;
import p611lh.C18182r;
import p644ph.C18351j;
import p644ph.C18368v;
import p717yh.C18848e0;

/* renamed from: yh.q */
public final class C18871q implements C18858j {

    /* renamed from: a */
    public final C14077r f41991a;

    /* renamed from: b */
    public final C18182r.C18183a f41992b;

    /* renamed from: c */
    public final String f41993c;

    /* renamed from: d */
    public C18368v f41994d;

    /* renamed from: e */
    public String f41995e;

    /* renamed from: f */
    public int f41996f = 0;

    /* renamed from: g */
    public int f41997g;

    /* renamed from: h */
    public boolean f41998h;

    /* renamed from: i */
    public boolean f41999i;

    /* renamed from: j */
    public long f42000j;

    /* renamed from: k */
    public int f42001k;

    /* renamed from: l */
    public long f42002l;

    public C18871q(String str) {
        C14077r rVar = new C14077r(4);
        this.f41991a = rVar;
        rVar.f30986a[0] = -1;
        this.f41992b = new C18182r.C18183a();
        this.f41993c = str;
    }

    /* renamed from: a */
    public final void mo70281a(C14077r rVar) {
        C14075p.m21696h(this.f41994d);
        while (true) {
            int i = rVar.f30988c;
            int i2 = rVar.f30987b;
            int i3 = i - i2;
            if (i3 > 0) {
                int i4 = this.f41996f;
                if (i4 == 0) {
                    byte[] bArr = rVar.f30986a;
                    while (true) {
                        if (i2 >= i) {
                            rVar.mo46935z(i);
                            break;
                        }
                        byte b = bArr[i2];
                        boolean z = (b & 255) == 255;
                        boolean z2 = this.f41999i && (b & 224) == 224;
                        this.f41999i = z;
                        if (z2) {
                            rVar.mo46935z(i2 + 1);
                            this.f41999i = false;
                            this.f41991a.f30986a[1] = bArr[i2];
                            this.f41997g = 2;
                            this.f41996f = 1;
                            break;
                        }
                        i2++;
                    }
                } else if (i4 == 1) {
                    int min = Math.min(i3, 4 - this.f41997g);
                    rVar.mo46911b(this.f41997g, min, this.f41991a.f30986a);
                    int i5 = this.f41997g + min;
                    this.f41997g = i5;
                    if (i5 >= 4) {
                        this.f41991a.mo46935z(0);
                        if (!this.f41992b.mo69725a(this.f41991a.mo46912c())) {
                            this.f41997g = 0;
                            this.f41996f = 1;
                        } else {
                            C18182r.C18183a aVar = this.f41992b;
                            this.f42001k = aVar.f39795c;
                            if (!this.f41998h) {
                                int i6 = aVar.f39796d;
                                this.f42000j = (((long) aVar.f39799g) * 1000000) / ((long) i6);
                                Format.C14176b bVar = new Format.C14176b();
                                bVar.f31293a = this.f41995e;
                                bVar.f31303k = aVar.f39794b;
                                bVar.f31304l = RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT;
                                bVar.f31316x = aVar.f39797e;
                                bVar.f31317y = i6;
                                bVar.f31295c = this.f41993c;
                                this.f41994d.mo47752a(bVar.mo47144a());
                                this.f41998h = true;
                            }
                            this.f41991a.mo46935z(0);
                            this.f41994d.mo69899d(4, this.f41991a);
                            this.f41996f = 2;
                        }
                    }
                } else if (i4 == 2) {
                    int min2 = Math.min(i3, this.f42001k - this.f41997g);
                    this.f41994d.mo69899d(min2, rVar);
                    int i7 = this.f41997g + min2;
                    this.f41997g = i7;
                    int i8 = this.f42001k;
                    if (i7 >= i8) {
                        this.f41994d.mo47754c(this.f42002l, 1, i8, 0, (C18368v.C18369a) null);
                        this.f42002l += this.f42000j;
                        this.f41997g = 0;
                        this.f41996f = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo70282c() {
        this.f41996f = 0;
        this.f41997g = 0;
        this.f41999i = false;
    }

    /* renamed from: d */
    public final void mo70283d(C18351j jVar, C18848e0.C18852d dVar) {
        dVar.mo70293a();
        dVar.mo70294b();
        this.f41995e = dVar.f41796e;
        dVar.mo70294b();
        this.f41994d = jVar.mo4164r(dVar.f41795d, 1);
    }

    /* renamed from: e */
    public final void mo70284e() {
    }

    /* renamed from: f */
    public final void mo70285f(int i, long j) {
        this.f42002l = j;
    }
}
