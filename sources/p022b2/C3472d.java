package p022b2;

import android.app.slice.SliceManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import androidx.slice.C3274a;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import p193o.C7496d;

/* renamed from: b2.d */
public final class C3472d extends C3470b {

    /* renamed from: a */
    public final SliceManager f8093a;

    public C3472d(Context context) {
        this.f8093a = (SliceManager) context.getSystemService(SliceManager.class);
    }

    /* renamed from: a */
    public final List<Uri> mo12984a() {
        return this.f8093a.getPinnedSlices();
    }

    /* renamed from: b */
    public final C7496d mo12985b(Uri uri) {
        if (Build.VERSION.SDK_INT == 28 && uri != null && !uri.getAuthority().contains("@")) {
            String authority = uri.getAuthority();
            Uri.Builder buildUpon = uri.buildUpon();
            StringBuilder sb = new StringBuilder();
            UserHandle myUserHandle = Process.myUserHandle();
            int i = 0;
            try {
                i = ((Integer) myUserHandle.getClass().getDeclaredMethod("getIdentifier", new Class[0]).invoke(myUserHandle, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            sb.append(i);
            sb.append("@");
            sb.append(authority);
            uri = buildUpon.encodedAuthority(sb.toString()).build();
        }
        return C3274a.m7946b(this.f8093a.getPinnedSpecs(uri));
    }
}
