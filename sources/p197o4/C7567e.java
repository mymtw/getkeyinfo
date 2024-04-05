package p197o4;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5968d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p025b5.C3479d;
import p150j4.C7114e;
import p197o4.C7588n;

/* renamed from: o4.e */
public final class C7567e<Data> implements C7588n<File, Data> {

    /* renamed from: a */
    public final C7572d<Data> f16825a;

    /* renamed from: o4.e$a */
    public static class C7568a<Data> implements C7590o<File, Data> {

        /* renamed from: a */
        public final C7572d<Data> f16826a;

        public C7568a(C7572d<Data> dVar) {
            this.f16826a = dVar;
        }

        /* renamed from: b */
        public final C7588n<File, Data> mo20003b(C7596r rVar) {
            return new C7567e(this.f16826a);
        }
    }

    /* renamed from: o4.e$b */
    public static class C7569b extends C7568a<ParcelFileDescriptor> {

        /* renamed from: o4.e$b$a */
        public class C7570a implements C7572d<ParcelFileDescriptor> {
            /* renamed from: a */
            public final Class<ParcelFileDescriptor> mo20007a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: b */
            public final Object mo20008b(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            /* renamed from: c */
            public final void mo20009c(Object obj) throws IOException {
                ((ParcelFileDescriptor) obj).close();
            }
        }

        public C7569b() {
            super(new C7570a());
        }
    }

    /* renamed from: o4.e$c */
    public static final class C7571c<Data> implements C5968d<Data> {

        /* renamed from: b */
        public final File f16827b;

        /* renamed from: c */
        public final C7572d<Data> f16828c;

        /* renamed from: d */
        public Data f16829d;

        public C7571c(File file, C7572d<Data> dVar) {
            this.f16827b = file;
            this.f16828c = dVar;
        }

        /* renamed from: a */
        public final Class<Data> mo16848a() {
            return this.f16828c.mo20007a();
        }

        /* renamed from: b */
        public final void mo16851b() {
            Data data = this.f16829d;
            if (data != null) {
                try {
                    this.f16828c.mo20009c(data);
                } catch (IOException unused) {
                }
            }
        }

        public final void cancel() {
        }

        /* renamed from: d */
        public final DataSource mo16854d() {
            return DataSource.LOCAL;
        }

        /* renamed from: e */
        public final void mo16855e(Priority priority, C5968d.C5969a<? super Data> aVar) {
            try {
                Data b = this.f16828c.mo20008b(this.f16827b);
                this.f16829d = b;
                aVar.mo16863f(b);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                aVar.mo16862c(e);
            }
        }
    }

    /* renamed from: o4.e$d */
    public interface C7572d<Data> {
        /* renamed from: a */
        Class<Data> mo20007a();

        /* renamed from: b */
        Data mo20008b(File file) throws FileNotFoundException;

        /* renamed from: c */
        void mo20009c(Data data) throws IOException;
    }

    /* renamed from: o4.e$e */
    public static class C7573e extends C7568a<InputStream> {

        /* renamed from: o4.e$e$a */
        public class C7574a implements C7572d<InputStream> {
            /* renamed from: a */
            public final Class<InputStream> mo20007a() {
                return InputStream.class;
            }

            /* renamed from: b */
            public final Object mo20008b(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            /* renamed from: c */
            public final void mo20009c(Object obj) throws IOException {
                ((InputStream) obj).close();
            }
        }

        public C7573e() {
            super(new C7574a());
        }
    }

    public C7567e(C7572d<Data> dVar) {
        this.f16825a = dVar;
    }

    /* renamed from: a */
    public final C7588n.C7589a mo20000a(Object obj, int i, int i2, C7114e eVar) {
        File file = (File) obj;
        return new C7588n.C7589a(new C3479d(file), new C7571c(file, this.f16825a));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo20001b(Object obj) {
        File file = (File) obj;
        return true;
    }
}
