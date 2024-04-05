package p197o4;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.InputStream;
import p150j4.C7114e;
import p197o4.C7588n;

/* renamed from: o4.s */
public final class C7600s<Data> implements C7588n<Integer, Data> {

    /* renamed from: a */
    public final C7588n<Uri, Data> f16878a;

    /* renamed from: b */
    public final Resources f16879b;

    /* renamed from: o4.s$a */
    public static final class C7601a implements C7590o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        public final Resources f16880a;

        public C7601a(Resources resources) {
            this.f16880a = resources;
        }

        /* renamed from: b */
        public final C7588n<Integer, AssetFileDescriptor> mo20003b(C7596r rVar) {
            return new C7600s(this.f16880a, rVar.mo20029b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: o4.s$b */
    public static class C7602b implements C7590o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        public final Resources f16881a;

        public C7602b(Resources resources) {
            this.f16881a = resources;
        }

        /* renamed from: b */
        public final C7588n<Integer, ParcelFileDescriptor> mo20003b(C7596r rVar) {
            return new C7600s(this.f16881a, rVar.mo20029b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: o4.s$c */
    public static class C7603c implements C7590o<Integer, InputStream> {

        /* renamed from: a */
        public final Resources f16882a;

        public C7603c(Resources resources) {
            this.f16882a = resources;
        }

        /* renamed from: b */
        public final C7588n<Integer, InputStream> mo20003b(C7596r rVar) {
            return new C7600s(this.f16882a, rVar.mo20029b(Uri.class, InputStream.class));
        }
    }

    /* renamed from: o4.s$d */
    public static class C7604d implements C7590o<Integer, Uri> {

        /* renamed from: a */
        public final Resources f16883a;

        public C7604d(Resources resources) {
            this.f16883a = resources;
        }

        /* renamed from: b */
        public final C7588n<Integer, Uri> mo20003b(C7596r rVar) {
            return new C7600s(this.f16883a, C7609u.f16885a);
        }
    }

    public C7600s(Resources resources, C7588n<Uri, Data> nVar) {
        this.f16879b = resources;
        this.f16878a = nVar;
    }

    /* renamed from: a */
    public final C7588n.C7589a mo20000a(Object obj, int i, int i2, C7114e eVar) {
        Uri uri;
        Integer num = (Integer) obj;
        try {
            uri = Uri.parse("android.resource://" + this.f16879b.getResourcePackageName(num.intValue()) + JsonPointer.SEPARATOR + this.f16879b.getResourceTypeName(num.intValue()) + JsonPointer.SEPARATOR + this.f16879b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f16878a.mo20000a(uri, i, i2, eVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo20001b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }
}
