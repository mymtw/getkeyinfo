package p222r4;

import com.bumptech.glide.load.data.C5970e;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: r4.a */
public final class C7743a implements C5970e<ByteBuffer> {

    /* renamed from: a */
    public final ByteBuffer f17168a;

    /* renamed from: r4.a$a */
    public static class C7744a implements C5970e.C5971a<ByteBuffer> {
        /* renamed from: a */
        public final Class<ByteBuffer> mo16846a() {
            return ByteBuffer.class;
        }

        /* renamed from: b */
        public final C5970e mo16847b(Object obj) {
            return new C7743a((ByteBuffer) obj);
        }
    }

    public C7743a(ByteBuffer byteBuffer) {
        this.f17168a = byteBuffer;
    }

    /* renamed from: a */
    public final Object mo16842a() throws IOException {
        this.f17168a.position(0);
        return this.f17168a;
    }

    /* renamed from: b */
    public final void mo16843b() {
    }
}
