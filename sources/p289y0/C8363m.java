package p289y0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.google.android.gms.common.api.Api;
import com.google.logging.type.LogSeverity;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import p021b1.C3464l;
import p280x0.C8286d;

/* renamed from: y0.m */
public class C8363m {

    /* renamed from: y0.m$a */
    public interface C8364a<T> {
        /* renamed from: a */
        boolean mo20953a(T t);

        /* renamed from: b */
        int mo20954b(T t);
    }

    public C8363m() {
        new ConcurrentHashMap();
    }

    /* renamed from: d */
    public static <T> T m16701d(T[] tArr, int i, C8364a<T> aVar) {
        int i2 = (i & 1) == 0 ? LogSeverity.WARNING_VALUE : LogSeverity.ALERT_VALUE;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (T t2 : tArr) {
            int abs = (Math.abs(aVar.mo20954b(t2) - i2) * 2) + (aVar.mo20953a(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: a */
    public Typeface mo20944a(Context context, C8286d.C8288b bVar, Resources resources, int i) {
        throw null;
    }

    /* renamed from: b */
    public Typeface mo20945b(Context context, C3464l[] lVarArr, int i) {
        throw null;
    }

    /* renamed from: c */
    public Typeface mo20946c(Context context, Resources resources, int i, String str, int i2) {
        File d = C8365n.m16711d(context);
        if (d == null) {
            return null;
        }
        try {
            if (!C8365n.m16709b(d, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(d.getPath());
            d.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    /* renamed from: e */
    public C3464l mo20952e(int i, C3464l[] lVarArr) {
        return (C3464l) m16701d(lVarArr, i, new C8362l());
    }
}
