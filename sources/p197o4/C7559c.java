package p197o4;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5968d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p025b5.C3479d;
import p036c5.C4410a;
import p150j4.C7114e;
import p197o4.C7588n;

/* renamed from: o4.c */
public final class C7559c implements C7588n<File, ByteBuffer> {

    /* renamed from: o4.c$a */
    public static final class C7560a implements C5968d<ByteBuffer> {

        /* renamed from: b */
        public final File f16819b;

        public C7560a(File file) {
            this.f16819b = file;
        }

        /* renamed from: a */
        public final Class<ByteBuffer> mo16848a() {
            return ByteBuffer.class;
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
        public final void mo16855e(Priority priority, C5968d.C5969a<? super ByteBuffer> aVar) {
            try {
                aVar.mo16863f(C4410a.m10111a(this.f16819b));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                aVar.mo16862c(e);
            }
        }
    }

    /* renamed from: o4.c$b */
    public static class C7561b implements C7590o<File, ByteBuffer> {
        /* renamed from: b */
        public final C7588n<File, ByteBuffer> mo20003b(C7596r rVar) {
            return new C7559c();
        }
    }

    /* renamed from: a */
    public final C7588n.C7589a mo20000a(Object obj, int i, int i2, C7114e eVar) {
        File file = (File) obj;
        return new C7588n.C7589a(new C3479d(file), new C7560a(file));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo20001b(Object obj) {
        File file = (File) obj;
        return true;
    }
}
