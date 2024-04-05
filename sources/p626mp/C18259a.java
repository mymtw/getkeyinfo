package p626mp;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

@TargetApi(11)
/* renamed from: mp.a */
public final class C18259a {
    /* renamed from: a */
    public static <T extends Activity> T m30804a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null!");
        } else if (context instanceof Activity) {
            return (Activity) context;
        } else {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext != null) {
                return m30804a(baseContext);
            }
            throw new IllegalStateException("Activity was not found as base context of view!");
        }
    }
}
