package p196o3;

import android.graphics.Color;
import android.graphics.PointF;
import android.support.p013v4.media.C0072d;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: o3.p */
public final class C7536p {

    /* renamed from: a */
    public static final JsonReader.C4854a f16793a = JsonReader.C4854a.m10470a(EtsyDialogFragment.OPT_X_BUTTON, "y");

    /* renamed from: o3.p$a */
    public static /* synthetic */ class C7537a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16794a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.parser.moshi.JsonReader$Token[] r0 = com.airbnb.lottie.parser.moshi.JsonReader.Token.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16794a = r0
                com.airbnb.lottie.parser.moshi.JsonReader$Token r1 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16794a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.parser.moshi.JsonReader$Token r1 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16794a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.parser.moshi.JsonReader$Token r1 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p196o3.C7536p.C7537a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m14515a(JsonReader jsonReader) throws IOException {
        jsonReader.mo14625a();
        int h = (int) (jsonReader.mo14632h() * 255.0d);
        int h2 = (int) (jsonReader.mo14632h() * 255.0d);
        int h3 = (int) (jsonReader.mo14632h() * 255.0d);
        while (jsonReader.mo14629f()) {
            jsonReader.mo14639u();
        }
        jsonReader.mo14627d();
        return Color.argb(255, h, h2, h3);
    }

    /* renamed from: b */
    public static PointF m14516b(JsonReader jsonReader, float f) throws IOException {
        int i = C7537a.f16794a[jsonReader.mo14635k().ordinal()];
        if (i == 1) {
            float h = (float) jsonReader.mo14632h();
            float h2 = (float) jsonReader.mo14632h();
            while (jsonReader.mo14629f()) {
                jsonReader.mo14639u();
            }
            return new PointF(h * f, h2 * f);
        } else if (i == 2) {
            jsonReader.mo14625a();
            float h3 = (float) jsonReader.mo14632h();
            float h4 = (float) jsonReader.mo14632h();
            while (jsonReader.mo14635k() != JsonReader.Token.END_ARRAY) {
                jsonReader.mo14639u();
            }
            jsonReader.mo14627d();
            return new PointF(h3 * f, h4 * f);
        } else if (i == 3) {
            jsonReader.mo14626b();
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (jsonReader.mo14629f()) {
                int r = jsonReader.mo14637r(f16793a);
                if (r == 0) {
                    f2 = m14518d(jsonReader);
                } else if (r != 1) {
                    jsonReader.mo14638t();
                    jsonReader.mo14639u();
                } else {
                    f3 = m14518d(jsonReader);
                }
            }
            jsonReader.mo14628e();
            return new PointF(f2 * f, f3 * f);
        } else {
            StringBuilder h5 = C0072d.m201h("Unknown point starts with ");
            h5.append(jsonReader.mo14635k());
            throw new IllegalArgumentException(h5.toString());
        }
    }

    /* renamed from: c */
    public static ArrayList m14517c(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.mo14625a();
        while (jsonReader.mo14635k() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.mo14625a();
            arrayList.add(m14516b(jsonReader, f));
            jsonReader.mo14627d();
        }
        jsonReader.mo14627d();
        return arrayList;
    }

    /* renamed from: d */
    public static float m14518d(JsonReader jsonReader) throws IOException {
        JsonReader.Token k = jsonReader.mo14635k();
        int i = C7537a.f16794a[k.ordinal()];
        if (i == 1) {
            return (float) jsonReader.mo14632h();
        }
        if (i == 2) {
            jsonReader.mo14625a();
            float h = (float) jsonReader.mo14632h();
            while (jsonReader.mo14629f()) {
                jsonReader.mo14639u();
            }
            jsonReader.mo14627d();
            return h;
        }
        throw new IllegalArgumentException("Unknown value for token of type " + k);
    }
}
