package p196o3;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.appboy.Constants;
import java.io.IOException;

/* renamed from: o3.h */
public final class C7527h implements C7528h0<DocumentData> {

    /* renamed from: a */
    public static final C7527h f16780a = new C7527h();

    /* renamed from: b */
    public static final JsonReader.C4854a f16781b = JsonReader.C4854a.m10470a(Constants.APPBOY_PUSH_TITLE_KEY, "f", Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    /* renamed from: a */
    public final Object mo19999a(JsonReader jsonReader, float f) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.mo14626b();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        boolean z = true;
        while (jsonReader.mo14629f()) {
            switch (jsonReader.mo14637r(f16781b)) {
                case 0:
                    str = jsonReader.mo14634j();
                    break;
                case 1:
                    str2 = jsonReader.mo14634j();
                    break;
                case 2:
                    d = jsonReader.mo14632h();
                    break;
                case 3:
                    int i4 = jsonReader.mo14633i();
                    justification2 = DocumentData.Justification.CENTER;
                    if (i4 <= justification2.ordinal() && i4 >= 0) {
                        justification2 = DocumentData.Justification.values()[i4];
                        break;
                    }
                case 4:
                    i = jsonReader.mo14633i();
                    break;
                case 5:
                    d2 = jsonReader.mo14632h();
                    break;
                case 6:
                    d3 = jsonReader.mo14632h();
                    break;
                case 7:
                    i2 = C7536p.m14515a(jsonReader);
                    break;
                case 8:
                    i3 = C7536p.m14515a(jsonReader);
                    break;
                case 9:
                    d4 = jsonReader.mo14632h();
                    break;
                case 10:
                    z = jsonReader.mo14630g();
                    break;
                default:
                    jsonReader.mo14638t();
                    jsonReader.mo14639u();
                    break;
            }
        }
        JsonReader jsonReader2 = jsonReader;
        jsonReader.mo14628e();
        return new DocumentData(str, str2, d, justification2, i, d2, d3, i2, i3, d4, z);
    }
}
