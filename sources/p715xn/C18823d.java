package p715xn;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;
import p683tn.C18561a;

/* renamed from: xn.d */
public final class C18823d {

    /* renamed from: a */
    public final String f41673a;

    /* renamed from: b */
    public SymbolShapeHint f41674b;

    /* renamed from: c */
    public C18561a f41675c;

    /* renamed from: d */
    public C18561a f41676d;

    /* renamed from: e */
    public final StringBuilder f41677e;

    /* renamed from: f */
    public int f41678f;

    /* renamed from: g */
    public int f41679g;

    /* renamed from: h */
    public C18825f f41680h;

    /* renamed from: i */
    public int f41681i;

    public C18823d(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i = 0;
        while (i < length) {
            char c = (char) (bytes[i] & 255);
            if (c != '?' || str.charAt(i) == '?') {
                sb.append(c);
                i++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f41673a = sb.toString();
        this.f41674b = SymbolShapeHint.FORCE_NONE;
        this.f41677e = new StringBuilder(str.length());
        this.f41679g = -1;
    }

    /* renamed from: a */
    public final int mo70268a() {
        return this.f41677e.length();
    }

    /* renamed from: b */
    public final char mo70269b() {
        return this.f41673a.charAt(this.f41678f);
    }

    /* renamed from: c */
    public final boolean mo70270c() {
        return this.f41678f < this.f41673a.length() - this.f41681i;
    }

    /* renamed from: d */
    public final void mo70271d(int i) {
        C18825f fVar = this.f41680h;
        if (fVar == null || i > fVar.f41688b) {
            this.f41680h = C18825f.m31810f(i, this.f41674b, this.f41675c, this.f41676d);
        }
    }

    /* renamed from: e */
    public final void mo70272e(char c) {
        this.f41677e.append(c);
    }
}
