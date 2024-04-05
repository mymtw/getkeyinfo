package p197o4;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.C5965a;
import com.bumptech.glide.load.data.C5968d;
import com.bumptech.glide.load.data.C5977i;
import com.bumptech.glide.load.data.C5984n;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p025b5.C3479d;
import p150j4.C7114e;
import p197o4.C7588n;

/* renamed from: o4.v */
public final class C7612v<Data> implements C7588n<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f16888b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{ResponseConstants.FILE, "android.resource", ResponseConstants.CONTENT})));

    /* renamed from: a */
    public final C7615c<Data> f16889a;

    /* renamed from: o4.v$a */
    public static final class C7613a implements C7590o<Uri, AssetFileDescriptor>, C7615c<AssetFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f16890a;

        public C7613a(ContentResolver contentResolver) {
            this.f16890a = contentResolver;
        }

        /* renamed from: a */
        public final C5968d<AssetFileDescriptor> mo20032a(Uri uri) {
            return new C5965a(this.f16890a, uri);
        }

        /* renamed from: b */
        public final C7588n<Uri, AssetFileDescriptor> mo20003b(C7596r rVar) {
            return new C7612v(this);
        }
    }

    /* renamed from: o4.v$b */
    public static class C7614b implements C7590o<Uri, ParcelFileDescriptor>, C7615c<ParcelFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f16891a;

        public C7614b(ContentResolver contentResolver) {
            this.f16891a = contentResolver;
        }

        /* renamed from: a */
        public final C5968d<ParcelFileDescriptor> mo20032a(Uri uri) {
            return new C5977i(this.f16891a, uri);
        }

        /* renamed from: b */
        public final C7588n<Uri, ParcelFileDescriptor> mo20003b(C7596r rVar) {
            return new C7612v(this);
        }
    }

    /* renamed from: o4.v$c */
    public interface C7615c<Data> {
        /* renamed from: a */
        C5968d<Data> mo20032a(Uri uri);
    }

    /* renamed from: o4.v$d */
    public static class C7616d implements C7590o<Uri, InputStream>, C7615c<InputStream> {

        /* renamed from: a */
        public final ContentResolver f16892a;

        public C7616d(ContentResolver contentResolver) {
            this.f16892a = contentResolver;
        }

        /* renamed from: a */
        public final C5968d<InputStream> mo20032a(Uri uri) {
            return new C5984n(this.f16892a, uri);
        }

        /* renamed from: b */
        public final C7588n<Uri, InputStream> mo20003b(C7596r rVar) {
            return new C7612v(this);
        }
    }

    public C7612v(C7615c<Data> cVar) {
        this.f16889a = cVar;
    }

    /* renamed from: a */
    public final C7588n.C7589a mo20000a(Object obj, int i, int i2, C7114e eVar) {
        Uri uri = (Uri) obj;
        return new C7588n.C7589a(new C3479d(uri), this.f16889a.mo20032a(uri));
    }

    /* renamed from: b */
    public final boolean mo20001b(Object obj) {
        return f16888b.contains(((Uri) obj).getScheme());
    }
}
