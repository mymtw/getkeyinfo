package p196o3;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p149j3.C7100a;
import p167l3.C7241g;
import p206p3.C7658d;

/* renamed from: o3.b0 */
public final class C7516b0 implements C7528h0<C7241g> {

    /* renamed from: a */
    public static final C7516b0 f16767a = new C7516b0();

    /* renamed from: b */
    public static final JsonReader.C4854a f16768b = JsonReader.C4854a.m10470a("c", "v", "i", "o");

    /* renamed from: a */
    public final Object mo19999a(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.mo14635k() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.mo14625a();
        }
        jsonReader.mo14626b();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z = false;
        while (jsonReader.mo14629f()) {
            int r = jsonReader.mo14637r(f16768b);
            if (r == 0) {
                z = jsonReader.mo14630g();
            } else if (r == 1) {
                arrayList = C7536p.m14517c(jsonReader, f);
            } else if (r == 2) {
                arrayList2 = C7536p.m14517c(jsonReader, f);
            } else if (r != 3) {
                jsonReader.mo14638t();
                jsonReader.mo14639u();
            } else {
                arrayList3 = C7536p.m14517c(jsonReader, f);
            }
        }
        jsonReader.mo14628e();
        if (jsonReader.mo14635k() == JsonReader.Token.END_ARRAY) {
            jsonReader.mo14627d();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (arrayList.isEmpty()) {
            return new C7241g(new PointF(), false, Collections.emptyList());
        } else {
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList arrayList4 = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) arrayList.get(i);
                int i2 = i - 1;
                arrayList4.add(new C7100a(C7658d.m14696a((PointF) arrayList.get(i2), (PointF) arrayList3.get(i2)), C7658d.m14696a(pointF2, (PointF) arrayList2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = (PointF) arrayList.get(0);
                int i3 = size - 1;
                arrayList4.add(new C7100a(C7658d.m14696a((PointF) arrayList.get(i3), (PointF) arrayList3.get(i3)), C7658d.m14696a(pointF3, (PointF) arrayList2.get(0)), pointF3));
            }
            return new C7241g(pointF, z, arrayList4);
        }
    }
}
