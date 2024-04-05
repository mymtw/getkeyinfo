package p519ci;

import androidx.preference.C3039b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import com.google.common.base.C15781b;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p512bi.C14044c;
import p513bj.C14076q;

/* renamed from: ci.a */
public final class C14143a extends C3039b {
    /* renamed from: n0 */
    public final Metadata mo11184n0(C14044c cVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        C14076q qVar = new C14076q(byteBuffer.limit(), byteBuffer.array());
        qVar.mo46907n(12);
        int d = (qVar.mo46897d() + qVar.mo46901h(12)) - 4;
        qVar.mo46907n(44);
        qVar.mo46908o(qVar.mo46901h(12));
        qVar.mo46907n(16);
        ArrayList arrayList = new ArrayList();
        while (qVar.mo46897d() < d) {
            qVar.mo46907n(48);
            int h = qVar.mo46901h(8);
            qVar.mo46907n(4);
            int d2 = qVar.mo46897d() + qVar.mo46901h(12);
            String str = null;
            String str2 = null;
            while (qVar.mo46897d() < d2) {
                int h2 = qVar.mo46901h(8);
                int h3 = qVar.mo46901h(8);
                int d3 = qVar.mo46897d() + h3;
                if (h2 == 2) {
                    int h4 = qVar.mo46901h(16);
                    qVar.mo46907n(8);
                    if (h4 != 3) {
                    }
                    while (qVar.mo46897d() < d3) {
                        int h5 = qVar.mo46901h(8);
                        Charset charset = C15781b.f35560a;
                        byte[] bArr = new byte[h5];
                        qVar.mo46903j(h5, bArr);
                        str = new String(bArr, charset);
                        int h6 = qVar.mo46901h(8);
                        for (int i = 0; i < h6; i++) {
                            qVar.mo46908o(qVar.mo46901h(8));
                        }
                    }
                } else if (h2 == 21) {
                    Charset charset2 = C15781b.f35560a;
                    byte[] bArr2 = new byte[h3];
                    qVar.mo46903j(h3, bArr2);
                    str2 = new String(bArr2, charset2);
                }
                qVar.mo46905l(d3 * 8);
            }
            qVar.mo46905l(d2 * 8);
            if (!(str == null || str2 == null)) {
                arrayList.add(new AppInfoTable(h, str2.length() != 0 ? str.concat(str2) : new String(str)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }
}
