package p600jo;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import p628nj.C18263b;

/* renamed from: jo.c */
public interface C18042c {
    /* renamed from: a */
    long mo69598a();

    /* renamed from: b */
    void mo69599b();

    /* renamed from: c */
    int mo69600c();

    /* renamed from: d */
    long mo69601d();

    /* renamed from: e */
    int mo69602e();

    /* renamed from: f */
    void mo69603f(long j);

    /* renamed from: g */
    int mo69604g(ByteBuffer byteBuffer);

    C18263b getSelection() {
        return new C18263b();
    }

    /* renamed from: h */
    MediaFormat mo69606h(int i);

    /* renamed from: i */
    void mo69607i(int i);

    /* renamed from: j */
    int mo69608j();

    void release();
}
