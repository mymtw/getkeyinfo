package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.profileinstaller.C3063h;
import java.io.File;

public class ProfileInstallReceiver extends BroadcastReceiver {
    public static final String ACTION_INSTALL_PROFILE = "androidx.profileinstaller.action.INSTALL_PROFILE";
    public static final String ACTION_SKIP_FILE = "androidx.profileinstaller.action.SKIP_FILE";
    private static final String EXTRA_SKIP_FILE_OPERATION = "EXTRA_SKIP_FILE_OPERATION";
    private static final String EXTRA_SKIP_FILE_OPERATION_DELETE = "DELETE_SKIP_FILE";
    private static final String EXTRA_SKIP_FILE_OPERATION_WRITE = "WRITE_SKIP_FILE";

    /* renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    public class C3052a implements C3063h.C3066c {
        public C3052a() {
        }

        /* renamed from: a */
        public final void mo11216a(int i, Object obj) {
            C3063h.f6981b.mo11216a(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (ACTION_INSTALL_PROFILE.equals(action)) {
                C3063h.m7230b(context, new C3060e(), new C3052a(), true);
            } else if (ACTION_SKIP_FILE.equals(action)) {
                String string = intent.getExtras().getString(EXTRA_SKIP_FILE_OPERATION);
                if (EXTRA_SKIP_FILE_OPERATION_WRITE.equals(string)) {
                    C3052a aVar = new C3052a();
                    try {
                        C3063h.m7229a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        new C3062g(10, aVar, (Object) null, 0).run();
                    } catch (PackageManager.NameNotFoundException e) {
                        new C3062g(7, aVar, e, 0).run();
                    }
                } else if (EXTRA_SKIP_FILE_OPERATION_DELETE.equals(string)) {
                    C3052a aVar2 = new C3052a();
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    aVar2.mo11216a(11, (Object) null);
                }
            }
        }
    }
}
