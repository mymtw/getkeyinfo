package p197o4;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5968d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p025b5.C3479d;
import p150j4.C7114e;
import p197o4.C7588n;

/* renamed from: o4.b */
public final class C7552b<Data> implements C7588n<byte[], Data> {

    /* renamed from: a */
    public final C7555b<Data> f16816a;

    /* renamed from: o4.b$a */
    public static class C7553a implements C7590o<byte[], ByteBuffer> {

        /* renamed from: o4.b$a$a */
        public class C7554a implements C7555b<ByteBuffer> {
            /* renamed from: a */
            public final Class<ByteBuffer> mo20004a() {
                return ByteBuffer.class;
            }

            /* renamed from: b */
            public final Object mo20005b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        /* renamed from: b */
        public final C7588n<byte[], ByteBuffer> mo20003b(C7596r rVar) {
            return new C7552b(new C7554a());
        }
    }

    /* renamed from: o4.b$b */
    public interface C7555b<Data> {
        /* renamed from: a */
        Class<Data> mo20004a();

        /* renamed from: b */
        Data mo20005b(byte[] bArr);
    }

    /* renamed from: o4.b$c */
    public static class C7556c<Data> implements C5968d<Data> {

        /* renamed from: b */
        public final byte[] f16817b;

        /* renamed from: c */
        public final C7555b<Data> f16818c;

        public C7556c(byte[] bArr, C7555b<Data> bVar) {
            this.f16817b = bArr;
            this.f16818c = bVar;
        }

        /* renamed from: a */
        public final Class<Data> mo16848a() {
            return this.f16818c.mo20004a();
        }

        /* renamed from: b */
        public final void mo16851b() {
        }

        public final void cancel() {
        }

        /* renamed from: d */
        public final DataSource mo16854d() {
            return DataSource.LOCAL;
        }

        /* renamed from: e */
        public final void mo16855e(Priority priority, C5968d.C5969a<? super Data> aVar) {
            aVar.mo16863f(this.f16818c.mo20005b(this.f16817b));
        }
    }

    /* renamed from: o4.b$d */
    public static class C7557d implements C7590o<byte[], InputStream> {

        /* renamed from: o4.b$d$a */
        public class C7558a implements C7555b<InputStream> {
            /* renamed from: a */
            public final Class<InputStream> mo20004a() {
                return InputStream.class;
            }

            /* renamed from: b */
            public final Object mo20005b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        /* renamed from: b */
        public final C7588n<byte[], InputStream> mo20003b(C7596r rVar) {
            return new C7552b(new C7558a());
        }
    }

    public C7552b(C7555b<Data> bVar) {
        this.f16816a = bVar;
    }

    /* renamed from: a */
    public final C7588n.C7589a mo20000a(Object obj, int i, int i2, C7114e eVar) {
        byte[] bArr = (byte[]) obj;
        return new C7588n.C7589a(new C3479d(bArr), new C7556c(bArr, this.f16816a));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo20001b(Object obj) {
        byte[] bArr = (byte[]) obj;
        return true;
    }
}
