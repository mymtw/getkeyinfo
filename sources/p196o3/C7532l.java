package p196o3;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import p167l3.C7237c;
import p206p3.C7658d;

/* renamed from: o3.l */
public final class C7532l implements C7528h0<C7237c> {

    /* renamed from: a */
    public int f16786a;

    public C7532l(int i) {
        this.f16786a = i;
    }

    /* renamed from: a */
    public final Object mo19999a(JsonReader jsonReader, float f) throws IOException {
        int i;
        double d;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z = jsonReader.mo14635k() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.mo14625a();
        }
        while (jsonReader.mo14629f()) {
            arrayList.add(Float.valueOf((float) jsonReader.mo14632h()));
        }
        if (z) {
            jsonReader.mo14627d();
        }
        if (this.f16786a == -1) {
            this.f16786a = arrayList.size() / 4;
        }
        int i3 = this.f16786a;
        float[] fArr = new float[i3];
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = this.f16786a * 4;
            if (i4 >= i) {
                break;
            }
            int i7 = i4 / 4;
            double floatValue = (double) ((Float) arrayList.get(i4)).floatValue();
            int i8 = i4 % 4;
            if (i8 == 0) {
                fArr[i7] = (float) floatValue;
            } else if (i8 == 1) {
                i5 = (int) (floatValue * 255.0d);
            } else if (i8 == 2) {
                i6 = (int) (floatValue * 255.0d);
            } else if (i8 == 3) {
                iArr[i7] = Color.argb(255, i5, i6, (int) (floatValue * 255.0d));
            }
            i4++;
        }
        C7237c cVar = new C7237c(fArr, iArr);
        if (arrayList.size() > i) {
            int size = (arrayList.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i9 = 0;
            while (i < arrayList.size()) {
                if (i % 2 == 0) {
                    dArr[i9] = (double) ((Float) arrayList.get(i)).floatValue();
                } else {
                    dArr2[i9] = (double) ((Float) arrayList.get(i)).floatValue();
                    i9++;
                }
                i++;
            }
            while (true) {
                int[] iArr2 = cVar.f16058b;
                if (i2 >= iArr2.length) {
                    break;
                }
                int i10 = iArr2[i2];
                double d2 = (double) cVar.f16057a[i2];
                int i11 = 1;
                while (true) {
                    if (i11 >= size) {
                        d = dArr2[size - 1] * 255.0d;
                        break;
                    }
                    int i12 = i11 - 1;
                    double d3 = dArr[i12];
                    double d4 = dArr[i11];
                    if (d4 >= d2) {
                        double d5 = dArr2[i12];
                        double d6 = dArr2[i11];
                        PointF pointF = C7658d.f16962a;
                        d = (((d6 - d5) * ((d2 - d3) / (d4 - d3))) + d5) * 255.0d;
                        break;
                    }
                    i11++;
                }
                cVar.f16058b[i2] = Color.argb((int) d, Color.red(i10), Color.green(i10), Color.blue(i10));
                i2++;
            }
        }
        return cVar;
    }
}
