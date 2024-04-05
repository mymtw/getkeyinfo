package p340ea;

import java.io.IOException;
import java.security.cert.CertPathValidatorException;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;

/* renamed from: ea.p */
public final class C12677p {

    /* renamed from: b */
    public static final Class<? extends Exception>[] f27951b = {IOException.class, CertPathValidatorException.class};

    /* renamed from: c */
    public static final String[] f27952c = {"GaiException", "ErrnoException"};

    /* renamed from: a */
    public final C12673n f27953a;

    public C12677p(C12673n nVar) {
        C19383o.m32797g(nVar, "elkLogger");
        this.f27953a = nVar;
    }

    /* renamed from: a */
    public final void mo45452a(String str, String str2, Exception exc) {
        String str3;
        Class<? extends Exception> cls;
        C19383o.m32797g(str2, "message");
        Class<? extends Exception>[] clsArr = f27951b;
        int i = 0;
        int i2 = 0;
        while (true) {
            str3 = null;
            if (i2 >= 2) {
                cls = null;
                break;
            }
            cls = clsArr[i2];
            if (cls.isAssignableFrom(exc.getClass())) {
                break;
            }
            i2++;
        }
        if (cls == null) {
            String[] strArr = f27952c;
            while (true) {
                if (i >= 2) {
                    break;
                }
                String str4 = strArr[i];
                if (C19457k.m33018V0(exc.getClass().getSimpleName(), str4)) {
                    str3 = str4;
                    break;
                }
                i++;
            }
            if (str3 == null) {
                this.f27953a.mo45450b(str, str2);
            }
        }
    }
}
