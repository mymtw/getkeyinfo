package androidx.emoji2.text;

import androidx.emoji2.text.flatbuffer.C2677b;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* renamed from: androidx.emoji2.text.k */
public final class C2687k {

    /* renamed from: androidx.emoji2.text.k$a */
    public static class C2688a {

        /* renamed from: a */
        public final ByteBuffer f6057a;

        public C2688a(ByteBuffer byteBuffer) {
            this.f6057a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public final long mo10086a() throws IOException {
            return ((long) this.f6057a.getInt()) & UnsignedInteger.INT_MASK;
        }

        /* renamed from: b */
        public final void mo10087b(int i) throws IOException {
            ByteBuffer byteBuffer = this.f6057a;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    /* renamed from: a */
    public static C2677b m6443a(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        C2688a aVar = new C2688a(duplicate);
        aVar.mo10087b(4);
        short s = duplicate.getShort() & 65535;
        if (s <= 100) {
            aVar.mo10087b(6);
            int i = 0;
            while (true) {
                if (i >= s) {
                    j = -1;
                    break;
                }
                int i2 = aVar.f6057a.getInt();
                aVar.mo10087b(4);
                j = aVar.mo10086a();
                aVar.mo10087b(4);
                if (1835365473 == i2) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                aVar.mo10087b((int) (j - ((long) aVar.f6057a.position())));
                aVar.mo10087b(12);
                long a = aVar.mo10086a();
                for (int i3 = 0; ((long) i3) < a; i3++) {
                    int i4 = aVar.f6057a.getInt();
                    long a2 = aVar.mo10086a();
                    aVar.mo10086a();
                    if (1164798569 == i4 || 1701669481 == i4) {
                        duplicate.position((int) (a2 + j));
                        C2677b bVar = new C2677b();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        bVar.mo10073b(duplicate, duplicate.position() + duplicate.getInt(duplicate.position()));
                        return bVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }
}
