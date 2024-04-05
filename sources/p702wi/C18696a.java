package p702wi;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.common.base.C15781b;
import java.util.List;
import p513bj.C14049b0;
import p513bj.C14077r;
import p636oi.C18296a;
import p636oi.C18298b;
import p636oi.C18300d;

/* renamed from: wi.a */
public final class C18696a extends C18298b {

    /* renamed from: m */
    public final C14077r f41443m = new C14077r();

    /* renamed from: n */
    public final boolean f41444n;

    /* renamed from: o */
    public final int f41445o;

    /* renamed from: p */
    public final int f41446p;

    /* renamed from: q */
    public final String f41447q;

    /* renamed from: r */
    public final float f41448r;

    /* renamed from: s */
    public final int f41449s;

    public C18696a(List<byte[]> list) {
        String str = "sans-serif";
        boolean z = true;
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f41445o = bArr[24];
            this.f41446p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f41447q = "Serif".equals(C14049b0.m21641n(43, bArr.length - 43, bArr)) ? "serif" : str;
            int i = bArr[25] * 20;
            this.f41449s = i;
            z = (bArr[0] & 32) == 0 ? false : z;
            this.f41444n = z;
            if (z) {
                this.f41448r = C14049b0.m21635h(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i), 0.0f, 0.95f);
            } else {
                this.f41448r = 0.85f;
            }
        } else {
            this.f41445o = 0;
            this.f41446p = -1;
            this.f41447q = str;
            this.f41444n = false;
            this.f41448r = 0.85f;
            this.f41449s = -1;
        }
    }

    /* renamed from: h */
    public static void m31546h(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = true;
            boolean z2 = (i & 1) != 0;
            boolean z3 = (i & 2) != 0;
            if (z2) {
                if (z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z = false;
            }
            if (z) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z && !z2 && !z3) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* renamed from: g */
    public final C18300d mo69840g(int i, boolean z, byte[] bArr) throws SubtitleDecoderException {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        this.f41443m.mo46933x(i, bArr);
        C14077r rVar = this.f41443m;
        int i6 = 1;
        int i7 = 0;
        int i8 = 2;
        if (rVar.f30988c - rVar.f30987b >= 2) {
            int u = rVar.mo46930u();
            int i9 = 8;
            if (u == 0) {
                str = "";
            } else {
                int i10 = rVar.f30988c;
                int i11 = rVar.f30987b;
                if (i10 - i11 >= 2) {
                    byte[] bArr2 = rVar.f30986a;
                    char c = (char) ((bArr2[i11 + 1] & 255) | ((bArr2[i11] & 255) << 8));
                    if (c == 65279 || c == 65534) {
                        str = rVar.mo46923n(u, C15781b.f35564e);
                    }
                }
                str = rVar.mo46923n(u, C15781b.f35562c);
            }
            if (str.isEmpty()) {
                return C18697b.f41450c;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            m31546h(spannableStringBuilder, this.f41445o, 0, 0, spannableStringBuilder.length(), 16711680);
            int i12 = this.f41446p;
            int length = spannableStringBuilder.length();
            if (i12 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan((i12 >>> 8) | ((i12 & 255) << 24)), 0, length, 16711713);
            }
            String str2 = this.f41447q;
            int length2 = spannableStringBuilder.length();
            if (str2 != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length2, 16711713);
            }
            float f = this.f41448r;
            while (true) {
                C14077r rVar2 = this.f41443m;
                int i13 = rVar2.f30988c;
                int i14 = rVar2.f30987b;
                if (i13 - i14 >= i9) {
                    int c2 = rVar2.mo46912c();
                    int c3 = this.f41443m.mo46912c();
                    if (c3 == 1937013100) {
                        C14077r rVar3 = this.f41443m;
                        if ((rVar3.f30988c - rVar3.f30987b >= i8 ? i6 : i7) != 0) {
                            int u2 = rVar3.mo46930u();
                            int i15 = i7;
                            while (i15 < u2) {
                                C14077r rVar4 = this.f41443m;
                                if ((rVar4.f30988c - rVar4.f30987b >= 12 ? i6 : i7) != 0) {
                                    int u3 = rVar4.mo46930u();
                                    int u4 = rVar4.mo46930u();
                                    rVar4.mo46909A(i8);
                                    int p = rVar4.mo46925p();
                                    rVar4.mo46909A(i6);
                                    int c4 = rVar4.mo46912c();
                                    if (u4 > spannableStringBuilder.length()) {
                                        int length3 = spannableStringBuilder.length();
                                        i3 = c4;
                                        StringBuilder sb = new StringBuilder(68);
                                        sb.append("Truncating styl end (");
                                        sb.append(u4);
                                        sb.append(") to cueText.length() (");
                                        sb.append(length3);
                                        sb.append(").");
                                        Log.w("Tx3gDecoder", sb.toString());
                                        u4 = spannableStringBuilder.length();
                                    } else {
                                        i3 = c4;
                                    }
                                    int i16 = u4;
                                    if (u3 >= i16) {
                                        StringBuilder sb2 = new StringBuilder(60);
                                        sb2.append("Ignoring styl with start (");
                                        sb2.append(u3);
                                        sb2.append(") >= end (");
                                        sb2.append(i16);
                                        sb2.append(").");
                                        Log.w("Tx3gDecoder", sb2.toString());
                                        i5 = i15;
                                        i4 = u2;
                                    } else {
                                        int i17 = i3;
                                        int i18 = u3;
                                        i5 = i15;
                                        i4 = u2;
                                        m31546h(spannableStringBuilder, p, this.f41445o, u3, i16, 0);
                                        if (i17 != this.f41446p) {
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i17 & 255) << 24) | (i17 >>> 8)), i18, i16, 33);
                                        }
                                    }
                                    i15 = i5 + 1;
                                    u2 = i4;
                                    i6 = 1;
                                    i7 = 0;
                                    i8 = 2;
                                } else {
                                    throw new SubtitleDecoderException("Unexpected subtitle format.");
                                }
                            }
                            i2 = i8;
                        } else {
                            throw new SubtitleDecoderException("Unexpected subtitle format.");
                        }
                    } else if (c3 != 1952608120 || !this.f41444n) {
                        i2 = 2;
                    } else {
                        C14077r rVar5 = this.f41443m;
                        i2 = 2;
                        if (rVar5.f30988c - rVar5.f30987b >= 2) {
                            f = C14049b0.m21635h(((float) rVar5.mo46930u()) / ((float) this.f41449s), 0.0f, 0.95f);
                        } else {
                            throw new SubtitleDecoderException("Unexpected subtitle format.");
                        }
                    }
                    this.f41443m.mo46935z(i14 + c2);
                    i8 = i2;
                    i6 = 1;
                    i7 = 0;
                    i9 = 8;
                } else {
                    C18296a.C18297a aVar = new C18296a.C18297a();
                    aVar.f40164a = spannableStringBuilder;
                    aVar.f40168e = f;
                    aVar.f40169f = 0;
                    aVar.f40170g = 0;
                    return new C18697b(aVar.mo69838a());
                }
            }
        } else {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }
}
