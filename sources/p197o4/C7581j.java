package p197o4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5968d;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.jvm.internal.C19382n;
import p025b5.C3479d;
import p150j4.C7114e;
import p197o4.C7588n;

/* renamed from: o4.j */
public final class C7581j implements C7588n<Uri, File> {

    /* renamed from: a */
    public final Context f16843a;

    /* renamed from: o4.j$a */
    public static final class C7582a implements C7590o<Uri, File> {

        /* renamed from: a */
        public final Context f16844a;

        public C7582a(Context context) {
            this.f16844a = context;
        }

        /* renamed from: b */
        public final C7588n<Uri, File> mo20003b(C7596r rVar) {
            return new C7581j(this.f16844a);
        }
    }

    /* renamed from: o4.j$b */
    public static class C7583b implements C5968d<File> {

        /* renamed from: d */
        public static final String[] f16845d = {"_data"};

        /* renamed from: b */
        public final Context f16846b;

        /* renamed from: c */
        public final Uri f16847c;

        public C7583b(Context context, Uri uri) {
            this.f16846b = context;
            this.f16847c = uri;
        }

        /* renamed from: a */
        public final Class<File> mo16848a() {
            return File.class;
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
        public final void mo16855e(Priority priority, C5968d.C5969a<? super File> aVar) {
            Cursor query = this.f16846b.getContentResolver().query(this.f16847c, f16845d, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder h = C0072d.m201h("Failed to find file path for: ");
                h.append(this.f16847c);
                aVar.mo16862c(new FileNotFoundException(h.toString()));
                return;
            }
            aVar.mo16863f(new File(str));
        }
    }

    public C7581j(Context context) {
        this.f16843a = context;
    }

    /* renamed from: a */
    public final C7588n.C7589a mo20000a(Object obj, int i, int i2, C7114e eVar) {
        Uri uri = (Uri) obj;
        return new C7588n.C7589a(new C3479d(uri), new C7583b(this.f16843a, uri));
    }

    /* renamed from: b */
    public final boolean mo20001b(Object obj) {
        return C19382n.m32766q0((Uri) obj);
    }
}
