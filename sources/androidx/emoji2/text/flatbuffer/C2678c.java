package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* renamed from: androidx.emoji2.text.flatbuffer.c */
public class C2678c {

    /* renamed from: a */
    public int f6027a;

    /* renamed from: b */
    public ByteBuffer f6028b;

    /* renamed from: c */
    public int f6029c;

    /* renamed from: d */
    public int f6030d;

    public C2678c() {
        if (Utf8.f6026a == null) {
            Utf8.f6026a = new Utf8Safe();
        }
    }

    /* renamed from: a */
    public final int mo10072a(int i) {
        if (i < this.f6030d) {
            return this.f6028b.getShort(this.f6029c + i);
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo10073b(ByteBuffer byteBuffer, int i) {
        this.f6028b = byteBuffer;
        if (byteBuffer != null) {
            this.f6027a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f6029c = i2;
            this.f6030d = this.f6028b.getShort(i2);
            return;
        }
        this.f6027a = 0;
        this.f6029c = 0;
        this.f6030d = 0;
    }
}
