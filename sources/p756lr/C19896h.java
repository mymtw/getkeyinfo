package p756lr;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import okio.ByteString;

/* renamed from: lr.h */
public interface C19896h extends C19882a0, WritableByteChannel {
    /* renamed from: A */
    C19896h mo72706A() throws IOException;

    /* renamed from: H */
    C19896h mo72716H(String str) throws IOException;

    /* renamed from: V */
    C19896h mo72724V(long j) throws IOException;

    void flush() throws IOException;

    /* renamed from: l */
    C19893f mo72745l();

    /* renamed from: l0 */
    C19896h mo72746l0(long j) throws IOException;

    /* renamed from: o0 */
    C19896h mo72748o0(int i, int i2, String str) throws IOException;

    /* renamed from: s0 */
    C19896h mo72757s0(ByteString byteString) throws IOException;

    /* renamed from: v0 */
    C19896h mo72762v0(int i, int i2, byte[] bArr) throws IOException;

    /* renamed from: w0 */
    long mo72764w0(C19888c0 c0Var) throws IOException;

    C19896h write(byte[] bArr) throws IOException;

    C19896h writeByte(int i) throws IOException;

    C19896h writeInt(int i) throws IOException;

    C19896h writeShort(int i) throws IOException;
}
