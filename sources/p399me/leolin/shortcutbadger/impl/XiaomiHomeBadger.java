package p399me.leolin.shortcutbadger.impl;

import android.content.pm.ResolveInfo;
import java.util.Arrays;
import java.util.List;
import p776xq.C20219a;

@Deprecated
/* renamed from: me.leolin.shortcutbadger.impl.XiaomiHomeBadger */
public class XiaomiHomeBadger implements C20219a {

    /* renamed from: a */
    public ResolveInfo f43932a;

    /* renamed from: a */
    public final List<String> mo72810a() {
        return Arrays.asList(new String[]{"com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher"});
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r3.set(r2, java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002a */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72811b(android.content.Context r8, android.content.ComponentName r9, int r10) throws p399me.leolin.shortcutbadger.ShortcutBadgeException {
        /*
            r7 = this;
            java.lang.String r0 = ""
            r1 = 1
            java.lang.String r2 = "android.app.MiuiNotification"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x0032 }
            java.lang.Object r2 = r2.newInstance()     // Catch:{ Exception -> 0x0032 }
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x0032 }
            java.lang.String r4 = "messageCount"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ Exception -> 0x0032 }
            r3.setAccessible(r1)     // Catch:{ Exception -> 0x0032 }
            if (r10 != 0) goto L_0x001e
            r4 = r0
            goto L_0x0022
        L_0x001e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x002a }
        L_0x0022:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x002a }
            r3.set(r2, r4)     // Catch:{ Exception -> 0x002a }
            goto L_0x006e
        L_0x002a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0032 }
            r3.set(r2, r4)     // Catch:{ Exception -> 0x0032 }
            goto L_0x006e
        L_0x0032:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.APPLICATION_MESSAGE_UPDATE"
            r2.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r9.getPackageName()
            r3.append(r4)
            java.lang.String r4 = "/"
            r3.append(r4)
            java.lang.String r9 = r9.getClassName()
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            java.lang.String r3 = "android.intent.extra.update_application_component_name"
            r2.putExtra(r3, r9)
            if (r10 != 0) goto L_0x005e
            r9 = r0
            goto L_0x0062
        L_0x005e:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
        L_0x0062:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r3 = "android.intent.extra.update_application_message_text"
            r2.putExtra(r3, r9)
            p778zq.C20230a.m34610b(r8, r2)     // Catch:{ ShortcutBadgeException -> 0x006e }
        L_0x006e:
            java.lang.String r9 = android.os.Build.MANUFACTURER
            java.lang.String r2 = "Xiaomi"
            boolean r9 = r9.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x00f2
            android.content.pm.ResolveInfo r9 = r7.f43932a
            if (r9 != 0) goto L_0x0094
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.MAIN"
            r9.<init>(r2)
            java.lang.String r2 = "android.intent.category.HOME"
            r9.addCategory(r2)
            android.content.pm.PackageManager r2 = r8.getPackageManager()
            r3 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r9 = r2.resolveActivity(r9, r3)
            r7.f43932a = r9
        L_0x0094:
            android.content.pm.ResolveInfo r9 = r7.f43932a
            if (r9 == 0) goto L_0x00f2
            java.lang.String r9 = "notification"
            java.lang.Object r9 = r8.getSystemService(r9)
            android.app.NotificationManager r9 = (android.app.NotificationManager) r9
            android.app.Notification$Builder r2 = new android.app.Notification$Builder
            r2.<init>(r8)
            android.app.Notification$Builder r8 = r2.setContentTitle(r0)
            android.app.Notification$Builder r8 = r8.setContentText(r0)
            android.content.pm.ResolveInfo r0 = r7.f43932a
            int r0 = r0.getIconResource()
            android.app.Notification$Builder r8 = r8.setSmallIcon(r0)
            android.app.Notification r8 = r8.build()
            java.lang.Class r0 = r8.getClass()     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r2 = "extraNotification"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x00e9 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ Exception -> 0x00e9 }
            java.lang.Class r2 = r0.getClass()     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r3 = "setMessageCount"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x00e9 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00e9 }
            r6 = 0
            r4[r6] = r5     // Catch:{ Exception -> 0x00e9 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch:{ Exception -> 0x00e9 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00e9 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x00e9 }
            r1[r6] = r10     // Catch:{ Exception -> 0x00e9 }
            r2.invoke(r0, r1)     // Catch:{ Exception -> 0x00e9 }
            r9.notify(r6, r8)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00f2
        L_0x00e9:
            r8 = move-exception
            me.leolin.shortcutbadger.ShortcutBadgeException r9 = new me.leolin.shortcutbadger.ShortcutBadgeException
            java.lang.String r10 = "not able to set badge"
            r9.<init>(r10, r8)
            throw r9
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p399me.leolin.shortcutbadger.impl.XiaomiHomeBadger.mo72811b(android.content.Context, android.content.ComponentName, int):void");
    }
}
