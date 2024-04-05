package p776xq;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import p399me.leolin.shortcutbadger.ShortcutBadgeException;
import p399me.leolin.shortcutbadger.impl.AdwHomeBadger;
import p399me.leolin.shortcutbadger.impl.ApexHomeBadger;
import p399me.leolin.shortcutbadger.impl.DefaultBadger;
import p399me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import p399me.leolin.shortcutbadger.impl.NovaHomeBadger;
import p399me.leolin.shortcutbadger.impl.SonyHomeBadger;
import p777yq.C20221a;
import p777yq.C20222b;
import p777yq.C20223c;
import p777yq.C20224d;
import p777yq.C20225e;
import p777yq.C20227g;
import p777yq.C20228h;
import p777yq.C20229i;

/* renamed from: xq.b */
public final class C20220b {

    /* renamed from: a */
    public static final LinkedList f44839a;

    /* renamed from: b */
    public static C20219a f44840b;

    /* renamed from: c */
    public static ComponentName f44841c;

    static {
        LinkedList linkedList = new LinkedList();
        f44839a = linkedList;
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(DefaultBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(C20221a.class);
        linkedList.add(C20223c.class);
        linkedList.add(C20224d.class);
        linkedList.add(C20225e.class);
        linkedList.add(C20229i.class);
        linkedList.add(C20227g.class);
        linkedList.add(C20228h.class);
        linkedList.add(C20222b.class);
    }

    /* renamed from: a */
    public static void m34591a(Context context, int i) throws ShortcutBadgeException {
        boolean z;
        if (f44840b == null) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                StringBuilder h = C0072d.m201h("Unable to find launch intent for package ");
                h.append(context.getPackageName());
                Log.e("ShortcutBadger", h.toString());
                z = false;
            } else {
                f44841c = launchIntentForPackage.getComponent();
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
                    String str = resolveInfo.activityInfo.packageName;
                    Iterator it = f44839a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C20219a aVar = null;
                        try {
                            aVar = (C20219a) ((Class) it.next()).newInstance();
                        } catch (Exception unused) {
                        }
                        if (aVar != null && aVar.mo72810a().contains(str)) {
                            f44840b = aVar;
                            break;
                        }
                    }
                    if (f44840b != null) {
                        break;
                    }
                }
                if (f44840b == null) {
                    String str2 = Build.MANUFACTURER;
                    if (str2.equalsIgnoreCase("ZUK")) {
                        f44840b = new C20229i();
                    } else if (str2.equalsIgnoreCase("OPPO")) {
                        f44840b = new C20224d();
                    } else if (str2.equalsIgnoreCase("VIVO")) {
                        f44840b = new C20227g();
                    } else if (str2.equalsIgnoreCase("ZTE")) {
                        f44840b = new C20228h();
                    } else {
                        f44840b = new DefaultBadger();
                    }
                }
                z = true;
            }
            if (!z) {
                throw new ShortcutBadgeException("No default launcher available");
            }
        }
        try {
            f44840b.mo72811b(context, f44841c, i);
        } catch (Exception e) {
            throw new ShortcutBadgeException("Unable to execute badge", e);
        }
    }
}
