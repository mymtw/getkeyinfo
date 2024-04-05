package p604kj;

import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;

/* renamed from: kj.d */
public final class C18099d extends ClassLoader {
    public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return zzd.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return zzd.class;
    }
}
