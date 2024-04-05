package p196o3;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p214q3.C7721d;

/* renamed from: o3.a0 */
public final class C7514a0 implements C7528h0<C7721d> {

    /* renamed from: a */
    public static final C7514a0 f16764a = new C7514a0();

    /* renamed from: a */
    public final Object mo19999a(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.mo14635k() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.mo14625a();
        }
        float h = (float) jsonReader.mo14632h();
        float h2 = (float) jsonReader.mo14632h();
        while (jsonReader.mo14629f()) {
            jsonReader.mo14639u();
        }
        if (z) {
            jsonReader.mo14627d();
        }
        return new C7721d((h / 100.0f) * f, (h2 / 100.0f) * f);
    }
}
