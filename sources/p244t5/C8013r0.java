package p244t5;

import com.google.android.play.core.appupdate.C15567i;
import java.io.ByteArrayOutputStream;

/* renamed from: t5.r0 */
public final class C8013r0 extends C7990j1 {
    public C8013r0(C15567i iVar) {
        super(iVar);
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C7959a aVar = this.f17476b;
        if (aVar != null) {
            byteArrayOutputStream.write(aVar.mo20561a("DL"));
        }
        C7999m1 m1Var = this.f17477c;
        if (m1Var != null) {
            byteArrayOutputStream.write(m1Var.mo20561a("DL"));
        }
        C8018s1 s1Var = this.f17478d;
        if (s1Var != null) {
            byteArrayOutputStream.write(s1Var.mo20561a("DL"));
        }
        byteArrayOutputStream.write(new C7992k0(true, this.f17479e, this.f17480f).mo20561a("DL"));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        r1Var.mo20567c(32, 8);
        r1Var.mo20566b(byteArray.length);
        r1Var.f17501a.write(byteArray);
    }

    /* renamed from: n */
    public final int mo20509n() {
        return mo19527c().length;
    }
}
