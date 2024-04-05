package p197o4;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5968d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p025b5.C3479d;
import p150j4.C7114e;
import p197o4.C7588n;

/* renamed from: o4.d */
public final class C7562d<Model, Data> implements C7588n<Model, Data> {

    /* renamed from: a */
    public final C7563a<Data> f16820a;

    /* renamed from: o4.d$a */
    public interface C7563a<Data> {
    }

    /* renamed from: o4.d$b */
    public static final class C7564b<Data> implements C5968d<Data> {

        /* renamed from: b */
        public final String f16821b;

        /* renamed from: c */
        public final C7563a<Data> f16822c;

        /* renamed from: d */
        public ByteArrayInputStream f16823d;

        public C7564b(String str, C7563a<Data> aVar) {
            this.f16821b = str;
            this.f16822c = aVar;
        }

        /* renamed from: a */
        public final Class<Data> mo16848a() {
            ((C7565c.C7566a) this.f16822c).getClass();
            return InputStream.class;
        }

        /* renamed from: b */
        public final void mo16851b() {
            try {
                C7563a<Data> aVar = this.f16822c;
                ByteArrayInputStream byteArrayInputStream = this.f16823d;
                ((C7565c.C7566a) aVar).getClass();
                byteArrayInputStream.close();
            } catch (IOException unused) {
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
                ByteArrayInputStream a = ((C7565c.C7566a) this.f16822c).mo20006a(this.f16821b);
                this.f16823d = a;
                aVar.mo16863f(a);
            } catch (IllegalArgumentException e) {
                aVar.mo16862c(e);
            }
        }
    }

    /* renamed from: o4.d$c */
    public static final class C7565c<Model> implements C7590o<Model, InputStream> {

        /* renamed from: a */
        public final C7566a f16824a = new C7566a();

        /* renamed from: o4.d$c$a */
        public class C7566a implements C7563a<InputStream> {
            /* renamed from: a */
            public final ByteArrayInputStream mo20006a(String str) throws IllegalArgumentException {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        /* renamed from: b */
        public final C7588n<Model, InputStream> mo20003b(C7596r rVar) {
            return new C7562d(this.f16824a);
        }
    }

    public C7562d(C7565c.C7566a aVar) {
        this.f16820a = aVar;
    }

    /* renamed from: a */
    public final C7588n.C7589a<Data> mo20000a(Model model, int i, int i2, C7114e eVar) {
        return new C7588n.C7589a<>(new C3479d(model), new C7564b(model.toString(), this.f16820a));
    }

    /* renamed from: b */
    public final boolean mo20001b(Model model) {
        return model.toString().startsWith("data:image");
    }
}
