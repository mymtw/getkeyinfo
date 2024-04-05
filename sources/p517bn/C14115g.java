package p517bn;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.concurrent.Callable;

/* renamed from: bn.g */
public final /* synthetic */ class C14115g implements Callable {

    /* renamed from: b */
    public /* synthetic */ Context f31099b;

    /* renamed from: c */
    public /* synthetic */ Intent f31100c;

    public /* synthetic */ C14115g(Context context, Intent intent) {
        this.f31099b = context;
        this.f31100c = intent;
    }

    public final Object call() {
        String str;
        int i;
        ComponentName componentName;
        Context context = this.f31099b;
        Intent intent = this.f31100c;
        C14133x a = C14133x.m21880a();
        a.getClass();
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        a.f31137d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (a) {
            str = a.f31134a;
            if (str == null) {
                ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                if (resolveService != null) {
                    ServiceInfo serviceInfo = resolveService.serviceInfo;
                    if (serviceInfo != null) {
                        if (context.getPackageName().equals(serviceInfo.packageName)) {
                            String str2 = serviceInfo.name;
                            if (str2 != null) {
                                if (str2.startsWith(".")) {
                                    String valueOf = String.valueOf(context.getPackageName());
                                    String valueOf2 = String.valueOf(serviceInfo.name);
                                    a.f31134a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                                } else {
                                    a.f31134a = serviceInfo.name;
                                }
                                str = a.f31134a;
                            }
                        }
                        String str3 = serviceInfo.packageName;
                        String str4 = serviceInfo.name;
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
                        sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                        sb.append(str3);
                        sb.append("/");
                        sb.append(str4);
                        Log.e("FirebaseMessaging", sb.toString());
                        str = null;
                    }
                }
                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                str = null;
            }
        }
        if (str != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", str.length() != 0 ? "Restricting intent to a specific service: ".concat(str) : new String("Restricting intent to a specific service: "));
            }
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if (a.mo47027c(context)) {
                componentName = C14114f0.m21854a(context, intent2);
            } else {
                componentName = context.startService(intent2);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                i = HttpStatus.HTTP_NOT_FOUND;
            } else {
                i = -1;
            }
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e);
            i = 401;
        } catch (IllegalStateException e2) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: ".concat(e2.toString()));
            i = 402;
        }
        return Integer.valueOf(i);
    }
}
