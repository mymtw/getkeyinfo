package p318bg;

import android.text.TextUtils;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C19383o;
import kotlin.text.Regex;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: bg.g */
public final class C8559g {

    /* renamed from: a */
    public static final C8559g f18641a = new C8559g();

    /* renamed from: a */
    public static final File m16966a() {
        Class<C8559g> cls = C8559g.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            File file = new File(C13418j.m21106b().getFilesDir(), "facebook_ml/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public final String mo21079b(String str) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            C19383o.m32797g(str, "str");
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i > length) {
                    break;
                }
                boolean z2 = C19383o.m32799i(str.charAt(!z ? i : length), 32) <= 0;
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            Object[] array = new Regex("\\s+").split(str.subSequence(i, length + 1).toString(), 0).toArray(new String[0]);
            if (array != null) {
                String join = TextUtils.join(" ", (String[]) array);
                C19383o.m32796f(join, "TextUtils.join(\" \", strArray)");
                return join;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    /* renamed from: c */
    public final int[] mo21080c(String str) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            C19383o.m32797g(str, "texts");
            int[] iArr = new int[128];
            String b = mo21079b(str);
            Charset forName = Charset.forName("UTF-8");
            C19383o.m32796f(forName, "Charset.forName(\"UTF-8\")");
            if (b != null) {
                byte[] bytes = b.getBytes(forName);
                C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
                for (int i = 0; i < 128; i++) {
                    if (i < bytes.length) {
                        iArr[i] = bytes[i] & 255;
                    } else {
                        iArr[i] = 0;
                    }
                }
                return iArr;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }
}
