package p291y3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import androidx.browser.customtabs.CustomTabsService;
import com.paypal.pyplcheckout.utils.BrowserPackages;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: y3.j */
public final class C8386j {

    /* renamed from: a */
    public static WebView f18388a;

    /* renamed from: y3.j$a */
    public interface C8387a {
    }

    /* renamed from: a */
    public static String m16727a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        boolean z = false;
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String str = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo next : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
            intent2.setPackage(next.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(next.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (String) arrayList.get(0);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                if (queryIntentActivities2 != null) {
                    if (queryIntentActivities2.size() != 0) {
                        Iterator<ResolveInfo> it = queryIntentActivities2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ResolveInfo next2 = it.next();
                                IntentFilter intentFilter = next2.filter;
                                if (intentFilter != null) {
                                    if (intentFilter.countDataAuthorities() != 0) {
                                        if (intentFilter.countDataPaths() != 0) {
                                            if (next2.activityInfo != null) {
                                                z = true;
                                                break;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
            } catch (RuntimeException e) {
                Log.d("BitlySDK", "Bitly SDK Failed to determine specialized handler intents", e);
            }
            if (!z && arrayList.contains(str)) {
                return str;
            }
        }
        if (arrayList.contains(BrowserPackages.CHROME_PACKAGE)) {
            return BrowserPackages.CHROME_PACKAGE;
        }
        if (arrayList.contains("com.chrome.beta")) {
            return "com.chrome.beta";
        }
        if (arrayList.contains("com.chrome.dev")) {
            return "com.chrome.dev";
        }
        if (arrayList.contains("com.google.android.apps.chrome")) {
            return "com.google.android.apps.chrome";
        }
        return null;
    }
}
