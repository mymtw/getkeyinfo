package p196o3;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: o3.w */
public final class C7544w implements C7528h0<PointF> {

    /* renamed from: a */
    public static final C7544w f16808a = new C7544w();

    /* renamed from: a */
    public final Object mo19999a(JsonReader jsonReader, float f) throws IOException {
        JsonReader.Token k = jsonReader.mo14635k();
        if (k == JsonReader.Token.BEGIN_ARRAY) {
            return C7536p.m14516b(jsonReader, f);
        }
        if (k == JsonReader.Token.BEGIN_OBJECT) {
            return C7536p.m14516b(jsonReader, f);
        }
        if (k == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.mo14632h()) * f, ((float) jsonReader.mo14632h()) * f);
            while (jsonReader.mo14629f()) {
                jsonReader.mo14639u();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + k);
    }
}
