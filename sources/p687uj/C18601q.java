package p687uj;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import p674sm.C18536c;
import p674sm.C18540g;

/* renamed from: uj.q */
public final class C18601q implements C18540g {

    /* renamed from: a */
    public boolean f41080a = false;

    /* renamed from: b */
    public boolean f41081b = false;

    /* renamed from: c */
    public C18536c f41082c;

    /* renamed from: d */
    public final C18598n f41083d;

    public C18601q(C18598n nVar) {
        this.f41083d = nVar;
    }

    /* renamed from: b */
    public final C18540g mo70052b(String str) throws IOException {
        if (!this.f41080a) {
            this.f41080a = true;
            this.f41083d.mo70105b(this.f41082c, str, this.f41081b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* renamed from: e */
    public final C18540g mo70053e(boolean z) throws IOException {
        if (!this.f41080a) {
            this.f41080a = true;
            this.f41083d.mo70106e(this.f41082c, z ? 1 : 0, this.f41081b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }
}
