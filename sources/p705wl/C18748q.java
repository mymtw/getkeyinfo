package p705wl;

import com.google.crypto.tink.proto.C16415a;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.nio.charset.Charset;
import p551dm.C17601c0;

/* renamed from: wl.q */
public final class C18748q {

    /* renamed from: a */
    public static final /* synthetic */ int f41523a = 0;

    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static C17601c0 m31621a(C16415a aVar) {
        C17601c0.C17603b x = C17601c0.m29487x();
        int z = aVar.mo58434z();
        x.mo58540o();
        C17601c0.m29485u((C17601c0) x.f36539c, z);
        for (C16415a.C16418c next : aVar.mo58433y()) {
            C17601c0.C17604c.C17605a z2 = C17601c0.C17604c.m29495z();
            String z3 = next.mo58438y().mo58430z();
            z2.mo58540o();
            C17601c0.C17604c.m29491u((C17601c0.C17604c) z2.f36539c, z3);
            KeyStatusType B = next.mo58436B();
            z2.mo58540o();
            C17601c0.C17604c.m29493w((C17601c0.C17604c) z2.f36539c, B);
            OutputPrefixType A = next.mo58435A();
            z2.mo58540o();
            C17601c0.C17604c.m29492v((C17601c0.C17604c) z2.f36539c, A);
            int z4 = next.mo58439z();
            z2.mo58540o();
            C17601c0.C17604c.m29494x((C17601c0.C17604c) z2.f36539c, z4);
            x.mo58540o();
            C17601c0.m29486v((C17601c0) x.f36539c, (C17601c0.C17604c) z2.mo58538l());
        }
        return (C17601c0) x.mo58538l();
    }
}
