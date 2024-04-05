package p633no;

import android.media.MediaFormat;
import android.os.Build;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.Result;
import kotlin.jvm.internal.C19383o;

/* renamed from: no.e */
public final class C18287e {

    /* renamed from: a */
    public static final C18288a f40136a = new C18288a();

    /* renamed from: no.e$a */
    public static final class C18288a {
        /* renamed from: a */
        public static Number m30913a(MediaFormat mediaFormat, String str) {
            Object obj;
            Object obj2;
            C19383o.m32797g(mediaFormat, ResponseConstants.FORMAT);
            Number number = null;
            if (!mediaFormat.containsKey(str)) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                return mediaFormat.getNumber(str);
            }
            try {
                obj = Result.m35480constructorimpl(Integer.valueOf(mediaFormat.getInteger(str)));
            } catch (Throwable th) {
                obj = Result.m35480constructorimpl(C0761x.m1673J(th));
            }
            if (Result.m35483exceptionOrNullimpl(obj) != null) {
                try {
                    obj2 = Result.m35480constructorimpl(Float.valueOf(mediaFormat.getFloat(str)));
                } catch (Throwable th2) {
                    obj2 = Result.m35480constructorimpl(C0761x.m1673J(th2));
                }
                obj = obj2;
            }
            if (!Result.m35485isFailureimpl(obj)) {
                number = obj;
            }
            return number;
        }
    }
}
