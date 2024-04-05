package p710xi;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import p513bj.C14049b0;
import p513bj.C14077r;
import p636oi.C18296a;
import p636oi.C18298b;
import p636oi.C18300d;
import p710xi.C18777g;

/* renamed from: xi.b */
public final class C18772b extends C18298b {

    /* renamed from: m */
    public final C14077r f41603m = new C14077r();

    /* renamed from: g */
    public final C18300d mo69840g(int i, boolean z, byte[] bArr) throws SubtitleDecoderException {
        C18296a aVar;
        this.f41603m.mo46933x(i, bArr);
        ArrayList arrayList = new ArrayList();
        while (true) {
            C14077r rVar = this.f41603m;
            int i2 = rVar.f30988c - rVar.f30987b;
            if (i2 <= 0) {
                return new C18773c(arrayList);
            }
            if (i2 >= 8) {
                int c = rVar.mo46912c();
                if (this.f41603m.mo46912c() == 1987343459) {
                    C14077r rVar2 = this.f41603m;
                    int i3 = c - 8;
                    CharSequence charSequence = null;
                    C18296a.C18297a aVar2 = null;
                    while (i3 > 0) {
                        if (i3 >= 8) {
                            int c2 = rVar2.mo46912c();
                            int c3 = rVar2.mo46912c();
                            int i4 = c2 - 8;
                            String n = C14049b0.m21641n(rVar2.f30987b, i4, rVar2.f30986a);
                            rVar2.mo46909A(i4);
                            i3 = (i3 - 8) - i4;
                            if (c3 == 1937011815) {
                                C18777g.C18781d dVar = new C18777g.C18781d();
                                C18777g.m31685e(n, dVar);
                                aVar2 = dVar.mo70259a();
                            } else if (c3 == 1885436268) {
                                charSequence = C18777g.m31686f((String) null, n.trim(), Collections.emptyList());
                            }
                        } else {
                            throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
                        }
                    }
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    if (aVar2 != null) {
                        aVar2.f40164a = charSequence;
                        aVar = aVar2.mo69838a();
                    } else {
                        Pattern pattern = C18777g.f41624a;
                        C18777g.C18781d dVar2 = new C18777g.C18781d();
                        dVar2.f41639c = charSequence;
                        aVar = dVar2.mo70259a().mo69838a();
                    }
                    arrayList.add(aVar);
                } else {
                    this.f41603m.mo46909A(c - 8);
                }
            } else {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
    }
}
