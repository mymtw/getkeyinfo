package p756lr;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* renamed from: lr.i */
public interface C19897i extends C19888c0, ReadableByteChannel {
    /* renamed from: C */
    String mo72710C(long j) throws IOException;

    /* renamed from: I */
    boolean mo72718I(long j, ByteString byteString) throws IOException;

    /* renamed from: L */
    String mo72719L() throws IOException;

    /* renamed from: U */
    void mo72723U(long j) throws IOException;

    /* renamed from: X */
    ByteString mo72725X(long j) throws IOException;

    /* renamed from: b0 */
    int mo72728b0(C19908t tVar) throws IOException;

    /* renamed from: d0 */
    byte[] mo72732d0() throws IOException;

    /* renamed from: e0 */
    boolean mo72733e0() throws IOException;

    /* renamed from: g0 */
    long mo72737g0(C19896h hVar) throws IOException;

    /* renamed from: k0 */
    String mo72744k0(Charset charset) throws IOException;

    /* renamed from: l */
    C19893f mo72745l();

    C19913x peek();

    byte readByte() throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    boolean request(long j) throws IOException;

    void skip(long j) throws IOException;

    /* renamed from: w */
    long mo72763w(ByteString byteString) throws IOException;

    /* renamed from: y0 */
    long mo72772y0() throws IOException;

    /* renamed from: z */
    long mo72773z(ByteString byteString) throws IOException;

    /* renamed from: z0 */
    InputStream mo72774z0();
}
