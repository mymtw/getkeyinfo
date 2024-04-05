package p698vm;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.C16548b;
import java.io.IOException;
import p674sm.C18536c;
import p674sm.C18540g;

/* renamed from: vm.f */
public final class C18665f implements C18540g {

    /* renamed from: a */
    public boolean f41272a = false;

    /* renamed from: b */
    public boolean f41273b = false;

    /* renamed from: c */
    public C18536c f41274c;

    /* renamed from: d */
    public final C16548b f41275d;

    public C18665f(C16548b bVar) {
        this.f41275d = bVar;
    }

    /* renamed from: b */
    public final C18540g mo70052b(String str) throws IOException {
        if (!this.f41272a) {
            this.f41272a = true;
            this.f41275d.mo59029b(this.f41274c, str, this.f41273b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* renamed from: e */
    public final C18540g mo70053e(boolean z) throws IOException {
        if (!this.f41272a) {
            this.f41272a = true;
            this.f41275d.mo59032e(this.f41274c, z ? 1 : 0, this.f41273b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }
}
