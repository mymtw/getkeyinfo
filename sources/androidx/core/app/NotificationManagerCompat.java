package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.p013v4.app.INotificationSideChannel;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import com.etsy.android.lib.conversation.MessageDraft;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p003a2.C0023f;
import p250u0.C8092h;
import p250u0.C8093i;

public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    private static String sEnabledNotificationListeners;
    private static final Object sEnabledNotificationListenersLock = new Object();
    private static final Object sLock = new Object();
    private static C2262c sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;

    /* renamed from: androidx.core.app.NotificationManagerCompat$a */
    public static class C2260a implements C2264d {

        /* renamed from: a */
        public final String f5488a;

        /* renamed from: b */
        public final int f5489b;

        /* renamed from: c */
        public final String f5490c;

        /* renamed from: d */
        public final Notification f5491d;

        public C2260a(String str, int i, Notification notification, String str2) {
            this.f5488a = str;
            this.f5489b = i;
            this.f5490c = str2;
            this.f5491d = notification;
        }

        /* renamed from: a */
        public final void mo8716a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.notify(this.f5488a, this.f5489b, this.f5490c, this.f5491d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:");
            sb.append(this.f5488a);
            sb.append(", id:");
            sb.append(this.f5489b);
            sb.append(", tag:");
            return C0023f.m110k(sb, this.f5490c, "]");
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$b */
    public static class C2261b {

        /* renamed from: a */
        public final ComponentName f5492a;

        /* renamed from: b */
        public final IBinder f5493b;

        public C2261b(ComponentName componentName, IBinder iBinder) {
            this.f5492a = componentName;
            this.f5493b = iBinder;
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$c */
    public static class C2262c implements Handler.Callback, ServiceConnection {

        /* renamed from: b */
        public final Context f5494b;

        /* renamed from: c */
        public final Handler f5495c;

        /* renamed from: d */
        public final HashMap f5496d = new HashMap();

        /* renamed from: e */
        public Set<String> f5497e = new HashSet();

        /* renamed from: androidx.core.app.NotificationManagerCompat$c$a */
        public static class C2263a {

            /* renamed from: a */
            public final ComponentName f5498a;

            /* renamed from: b */
            public boolean f5499b = false;

            /* renamed from: c */
            public INotificationSideChannel f5500c;

            /* renamed from: d */
            public ArrayDeque<C2264d> f5501d = new ArrayDeque<>();

            /* renamed from: e */
            public int f5502e = 0;

            public C2263a(ComponentName componentName) {
                this.f5498a = componentName;
            }
        }

        public C2262c(Context context) {
            this.f5494b = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.f5495c = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        public final void mo8718a(C2263a aVar) {
            boolean z;
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                StringBuilder h = C0072d.m201h("Processing component ");
                h.append(aVar.f5498a);
                h.append(", ");
                h.append(aVar.f5501d.size());
                h.append(" queued tasks");
                Log.d(NotificationManagerCompat.TAG, h.toString());
            }
            if (!aVar.f5501d.isEmpty()) {
                if (aVar.f5499b) {
                    z = true;
                } else {
                    boolean bindService = this.f5494b.bindService(new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(aVar.f5498a), this, 33);
                    aVar.f5499b = bindService;
                    if (bindService) {
                        aVar.f5502e = 0;
                    } else {
                        StringBuilder h2 = C0072d.m201h("Unable to bind to listener ");
                        h2.append(aVar.f5498a);
                        Log.w(NotificationManagerCompat.TAG, h2.toString());
                        this.f5494b.unbindService(this);
                    }
                    z = aVar.f5499b;
                }
                if (!z || aVar.f5500c == null) {
                    mo8719b(aVar);
                    return;
                }
                while (true) {
                    C2264d peek = aVar.f5501d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            Log.d(NotificationManagerCompat.TAG, "Sending task " + peek);
                        }
                        peek.mo8716a(aVar.f5500c);
                        aVar.f5501d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            StringBuilder h3 = C0072d.m201h("Remote service has died: ");
                            h3.append(aVar.f5498a);
                            Log.d(NotificationManagerCompat.TAG, h3.toString());
                        }
                    } catch (RemoteException e) {
                        StringBuilder h4 = C0072d.m201h("RemoteException communicating with ");
                        h4.append(aVar.f5498a);
                        Log.w(NotificationManagerCompat.TAG, h4.toString(), e);
                    }
                }
                if (!aVar.f5501d.isEmpty()) {
                    mo8719b(aVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo8719b(C2263a aVar) {
            if (!this.f5495c.hasMessages(3, aVar.f5498a)) {
                int i = aVar.f5502e + 1;
                aVar.f5502e = i;
                if (i > 6) {
                    StringBuilder h = C0072d.m201h("Giving up on delivering ");
                    h.append(aVar.f5501d.size());
                    h.append(" tasks to ");
                    h.append(aVar.f5498a);
                    h.append(" after ");
                    h.append(aVar.f5502e);
                    h.append(" retries");
                    Log.w(NotificationManagerCompat.TAG, h.toString());
                    aVar.f5501d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                    Log.d(NotificationManagerCompat.TAG, "Scheduling retry for " + i2 + " ms");
                }
                this.f5495c.sendMessageDelayed(this.f5495c.obtainMessage(3, aVar.f5498a), (long) i2);
            }
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C2264d dVar = (C2264d) message.obj;
                Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(this.f5494b);
                if (!enabledListenerPackages.equals(this.f5497e)) {
                    this.f5497e = enabledListenerPackages;
                    List<ResolveInfo> queryIntentServices = this.f5494b.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
                    HashSet hashSet = new HashSet();
                    for (ResolveInfo next : queryIntentServices) {
                        if (enabledListenerPackages.contains(next.serviceInfo.packageName)) {
                            ServiceInfo serviceInfo = next.serviceInfo;
                            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                            if (next.serviceInfo.permission != null) {
                                Log.w(NotificationManagerCompat.TAG, "Permission present on component " + componentName + ", not adding listener record.");
                            } else {
                                hashSet.add(componentName);
                            }
                        }
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ComponentName componentName2 = (ComponentName) it.next();
                        if (!this.f5496d.containsKey(componentName2)) {
                            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                                Log.d(NotificationManagerCompat.TAG, "Adding listener record for " + componentName2);
                            }
                            this.f5496d.put(componentName2, new C2263a(componentName2));
                        }
                    }
                    Iterator it2 = this.f5496d.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        if (!hashSet.contains(entry.getKey())) {
                            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                                StringBuilder h = C0072d.m201h("Removing listener record for ");
                                h.append(entry.getKey());
                                Log.d(NotificationManagerCompat.TAG, h.toString());
                            }
                            C2263a aVar = (C2263a) entry.getValue();
                            if (aVar.f5499b) {
                                this.f5494b.unbindService(this);
                                aVar.f5499b = false;
                            }
                            aVar.f5500c = null;
                            it2.remove();
                        }
                    }
                }
                for (C2263a aVar2 : this.f5496d.values()) {
                    aVar2.f5501d.add(dVar);
                    mo8718a(aVar2);
                }
                return true;
            } else if (i == 1) {
                C2261b bVar = (C2261b) message.obj;
                ComponentName componentName3 = bVar.f5492a;
                IBinder iBinder = bVar.f5493b;
                C2263a aVar3 = (C2263a) this.f5496d.get(componentName3);
                if (aVar3 != null) {
                    aVar3.f5500c = INotificationSideChannel.Stub.asInterface(iBinder);
                    aVar3.f5502e = 0;
                    mo8718a(aVar3);
                }
                return true;
            } else if (i == 2) {
                C2263a aVar4 = (C2263a) this.f5496d.get((ComponentName) message.obj);
                if (aVar4 != null) {
                    if (aVar4.f5499b) {
                        this.f5494b.unbindService(this);
                        aVar4.f5499b = false;
                    }
                    aVar4.f5500c = null;
                }
                return true;
            } else if (i != 3) {
                return false;
            } else {
                C2263a aVar5 = (C2263a) this.f5496d.get((ComponentName) message.obj);
                if (aVar5 != null) {
                    mo8718a(aVar5);
                }
                return true;
            }
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Connected to service " + componentName);
            }
            this.f5495c.obtainMessage(1, new C2261b(componentName, iBinder)).sendToTarget();
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Disconnected from service " + componentName);
            }
            this.f5495c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$d */
    public interface C2264d {
        /* renamed from: a */
        void mo8716a(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) context.getSystemService("notification");
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string != null) {
                if (!string.equals(sEnabledNotificationListeners)) {
                    String[] split = string.split(MessageDraft.IMAGE_DELIMITER, -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    sEnabledNotificationListenerPackages = hashSet;
                    sEnabledNotificationListeners = string;
                }
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    private void pushSideChannelQueue(C2264d dVar) {
        synchronized (sLock) {
            if (sSideChannelManager == null) {
                sSideChannelManager = new C2262c(this.mContext.getApplicationContext());
            }
            sSideChannelManager.f5495c.obtainMessage(0, dVar).sendToTarget();
        }
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle bundle = notification.extras;
        return bundle != null && bundle.getBoolean(EXTRA_USE_SIDE_CHANNEL);
    }

    public boolean areNotificationsEnabled() {
        return this.mNotificationManager.areNotificationsEnabled();
    }

    public void cancel(int i) {
        cancel((String) null, i);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }

    public void createNotificationChannel(NotificationChannel notificationChannel) {
        this.mNotificationManager.createNotificationChannel(notificationChannel);
    }

    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup) {
        this.mNotificationManager.createNotificationChannelGroup(notificationChannelGroup);
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroup> list) {
        this.mNotificationManager.createNotificationChannelGroups(list);
    }

    public void createNotificationChannelGroupsCompat(List<C8093i> list) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C8093i next : list) {
                next.getClass();
                int i = Build.VERSION.SDK_INT;
                NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(next.f17635a, next.f17636b);
                if (i >= 28) {
                    notificationChannelGroup.setDescription(next.f17637c);
                }
                arrayList.add(notificationChannelGroup);
            }
            this.mNotificationManager.createNotificationChannelGroups(arrayList);
        }
    }

    public void createNotificationChannels(List<NotificationChannel> list) {
        this.mNotificationManager.createNotificationChannels(list);
    }

    public void createNotificationChannelsCompat(List<C8092h> list) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C8092h a : list) {
                arrayList.add(a.mo20681a());
            }
            this.mNotificationManager.createNotificationChannels(arrayList);
        }
    }

    public void deleteNotificationChannel(String str) {
        this.mNotificationManager.deleteNotificationChannel(str);
    }

    public void deleteNotificationChannelGroup(String str) {
        this.mNotificationManager.deleteNotificationChannelGroup(str);
    }

    public void deleteUnlistedNotificationChannels(Collection<String> collection) {
        for (NotificationChannel next : this.mNotificationManager.getNotificationChannels()) {
            if (!collection.contains(next.getId()) && (Build.VERSION.SDK_INT < 30 || !collection.contains(next.getParentChannelId()))) {
                this.mNotificationManager.deleteNotificationChannel(next.getId());
            }
        }
    }

    public int getImportance() {
        return this.mNotificationManager.getImportance();
    }

    public NotificationChannel getNotificationChannel(String str) {
        return this.mNotificationManager.getNotificationChannel(str);
    }

    public C8092h getNotificationChannelCompat(String str) {
        NotificationChannel notificationChannel = getNotificationChannel(str);
        if (notificationChannel != null) {
            return new C8092h(notificationChannel);
        }
        return null;
    }

    public NotificationChannelGroup getNotificationChannelGroup(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.mNotificationManager.getNotificationChannelGroup(str);
        }
        for (NotificationChannelGroup next : getNotificationChannelGroups()) {
            if (next.getId().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public C8093i getNotificationChannelGroupCompat(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            NotificationChannelGroup notificationChannelGroup = getNotificationChannelGroup(str);
            if (notificationChannelGroup != null) {
                return new C8093i(notificationChannelGroup);
            }
            return null;
        }
        NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
        if (notificationChannelGroup2 != null) {
            return new C8093i(notificationChannelGroup2, getNotificationChannels());
        }
        return null;
    }

    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        return this.mNotificationManager.getNotificationChannelGroups();
    }

    public List<C8093i> getNotificationChannelGroupsCompat() {
        int i = Build.VERSION.SDK_INT;
        List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
        if (notificationChannelGroups.isEmpty()) {
            return Collections.emptyList();
        }
        List<NotificationChannel> emptyList = i >= 28 ? Collections.emptyList() : getNotificationChannels();
        ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
        for (NotificationChannelGroup next : notificationChannelGroups) {
            if (Build.VERSION.SDK_INT >= 28) {
                arrayList.add(new C8093i(next));
            } else {
                arrayList.add(new C8093i(next, emptyList));
            }
        }
        return arrayList;
    }

    public List<NotificationChannel> getNotificationChannels() {
        return this.mNotificationManager.getNotificationChannels();
    }

    public List<C8092h> getNotificationChannelsCompat() {
        List<NotificationChannel> notificationChannels = getNotificationChannels();
        if (notificationChannels.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(notificationChannels.size());
        for (NotificationChannel hVar : notificationChannels) {
            arrayList.add(new C8092h(hVar));
        }
        return arrayList;
    }

    public void notify(int i, Notification notification) {
        notify((String) null, i, notification);
    }

    public void cancel(String str, int i) {
        this.mNotificationManager.cancel(str, i);
    }

    public void createNotificationChannel(C8092h hVar) {
        createNotificationChannel(hVar.mo20681a());
    }

    public void createNotificationChannelGroup(C8093i iVar) {
        iVar.getClass();
        int i = Build.VERSION.SDK_INT;
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(iVar.f17635a, iVar.f17636b);
        if (i >= 28) {
            notificationChannelGroup.setDescription(iVar.f17637c);
        }
        createNotificationChannelGroup(notificationChannelGroup);
    }

    public NotificationChannel getNotificationChannel(String str, String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.mNotificationManager.getNotificationChannel(str, str2);
        }
        return getNotificationChannel(str);
    }

    public void notify(String str, int i, Notification notification) {
        if (useSideChannelForNotification(notification)) {
            pushSideChannelQueue(new C2260a(this.mContext.getPackageName(), i, notification, str));
            this.mNotificationManager.cancel(str, i);
            return;
        }
        this.mNotificationManager.notify(str, i, notification);
    }

    public C8092h getNotificationChannelCompat(String str, String str2) {
        NotificationChannel notificationChannel = getNotificationChannel(str, str2);
        if (notificationChannel != null) {
            return new C8092h(notificationChannel);
        }
        return null;
    }
}
