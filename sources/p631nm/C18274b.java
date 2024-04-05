package p631nm;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import p001a0.C0005b;
import p631nm.C18274b;

/* renamed from: nm.b */
public abstract class C18274b<T extends C18274b<?>> {

    /* renamed from: a */
    public final Bundle f40106a = new Bundle();

    /* renamed from: b */
    public final String f40107b = "Thing";

    /* renamed from: c */
    public String f40108c;

    public C18274b() {
        Preconditions.checkNotNull("Thing");
        Preconditions.checkNotEmpty("Thing");
    }

    /* renamed from: a */
    public static void m30896a(Bundle bundle, String str, String... strArr) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(strArr);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < Math.min(strArr2.length, 100); i2++) {
                String str2 = strArr2[i2];
                strArr2[i] = str2;
                if (strArr2[i2] == null) {
                    StringBuilder sb = new StringBuilder(59);
                    sb.append("String at ");
                    sb.append(i2);
                    sb.append(" is null and is ignored by put method.");
                    C0005b.m62t0(sb.toString());
                } else {
                    int i3 = 20000;
                    if (str2.length() > 20000) {
                        StringBuilder sb2 = new StringBuilder(53);
                        sb2.append("String at ");
                        sb2.append(i2);
                        sb2.append(" is too long, truncating string.");
                        C0005b.m62t0(sb2.toString());
                        String str3 = strArr2[i];
                        if (str3.length() > 20000) {
                            if (Character.isHighSurrogate(str3.charAt(19999)) && Character.isLowSurrogate(str3.charAt(20000))) {
                                i3 = 19999;
                            }
                            str3 = str3.substring(0, i3);
                        }
                        strArr2[i] = str3;
                    }
                    i++;
                }
            }
            if (i > 0) {
                Object[] objArr = (String[]) Arrays.copyOfRange(strArr2, 0, i);
                if (objArr.length >= 100) {
                    C0005b.m62t0("Input Array of elements is too big, cutting off.");
                    objArr = Arrays.copyOf(objArr, 100);
                }
                bundle.putStringArray(str, (String[]) objArr);
                return;
            }
            return;
        }
        C0005b.m62t0("String array is empty and is ignored by put method.");
    }
}
