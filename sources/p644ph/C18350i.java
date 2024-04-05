package p644ph;

import java.io.IOException;
import p505aj.C13997e;

/* renamed from: ph.i */
public interface C18350i extends C13997e {
    /* renamed from: a */
    void mo69871a(int i, int i2, byte[] bArr) throws IOException;

    /* renamed from: c */
    boolean mo69872c(byte[] bArr, int i, int i2, boolean z) throws IOException;

    /* renamed from: f */
    void mo69873f();

    /* renamed from: g */
    boolean mo69874g(byte[] bArr, int i, int i2, boolean z) throws IOException;

    long getLength();

    long getPosition();

    /* renamed from: h */
    long mo69877h();

    /* renamed from: i */
    void mo69878i(int i) throws IOException;

    /* renamed from: j */
    void mo69879j(int i) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;

    void readFully(byte[] bArr, int i, int i2) throws IOException;
}
