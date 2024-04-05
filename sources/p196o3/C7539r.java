package p196o3;

import com.airbnb.lottie.C4828c;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import p125h3.C6936h;
import p214q3.C7718a;

/* renamed from: o3.r */
public final class C7539r {

    /* renamed from: a */
    public static JsonReader.C4854a f16798a = JsonReader.C4854a.m10470a("k");

    /* renamed from: a */
    public static ArrayList m14520a(float f, C4828c cVar, C7528h0 h0Var, JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.mo14635k() == JsonReader.Token.STRING) {
            cVar.mo14581a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.mo14626b();
        while (jsonReader.mo14629f()) {
            if (jsonReader.mo14637r(f16798a) != 0) {
                jsonReader.mo14639u();
            } else if (jsonReader.mo14635k() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.mo14625a();
                if (jsonReader.mo14635k() == JsonReader.Token.NUMBER) {
                    arrayList.add(C7538q.m14519a(jsonReader, cVar, f, h0Var, false));
                } else {
                    while (jsonReader.mo14629f()) {
                        arrayList.add(C7538q.m14519a(jsonReader, cVar, f, h0Var, true));
                    }
                }
                jsonReader.mo14627d();
            } else {
                arrayList.add(C7538q.m14519a(jsonReader, cVar, f, h0Var, false));
            }
        }
        jsonReader.mo14628e();
        m14521b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static void m14521b(ArrayList arrayList) {
        int i;
        T t;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C7718a aVar = (C7718a) arrayList.get(i2);
            i2++;
            C7718a aVar2 = (C7718a) arrayList.get(i2);
            aVar.f17118f = Float.valueOf(aVar2.f17117e);
            if (aVar.f17115c == null && (t = aVar2.f17114b) != null) {
                aVar.f17115c = t;
                if (aVar instanceof C6936h) {
                    ((C6936h) aVar).mo19092d();
                }
            }
        }
        C7718a aVar3 = (C7718a) arrayList.get(i);
        if ((aVar3.f17114b == null || aVar3.f17115c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
