package p196o3;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: o3.f */
public final class C7523f implements C7528h0<Integer> {

    /* renamed from: a */
    public static final C7523f f16775a = new C7523f();

    /* renamed from: a */
    public final Object mo19999a(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.mo14635k() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.mo14625a();
        }
        double h = jsonReader.mo14632h();
        double h2 = jsonReader.mo14632h();
        double h3 = jsonReader.mo14632h();
        double h4 = jsonReader.mo14632h();
        if (z) {
            jsonReader.mo14627d();
        }
        if (h <= 1.0d && h2 <= 1.0d && h3 <= 1.0d && h4 <= 1.0d) {
            h *= 255.0d;
            h2 *= 255.0d;
            h3 *= 255.0d;
            h4 *= 255.0d;
        }
        return Integer.valueOf(Color.argb((int) h4, (int) h, (int) h2, (int) h3));
    }
}
