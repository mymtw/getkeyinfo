package com.google.android.exoplayer2.offline;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.exoplayer2.scheduler.Requirements;
import java.util.HashMap;
import java.util.List;
import p003a2.C0023f;
import p513bj.C14049b0;
import p513bj.C14075p;
import p579hi.C17809a;
import p579hi.C17810b;
import p579hi.C17811c;
import p587ii.C17841b;

public abstract class DownloadService extends Service {
    public static final String ACTION_ADD_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD";
    public static final String ACTION_INIT = "com.google.android.exoplayer.downloadService.action.INIT";
    public static final String ACTION_PAUSE_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS";
    public static final String ACTION_REMOVE_ALL_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";
    public static final String ACTION_REMOVE_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD";
    private static final String ACTION_RESTART = "com.google.android.exoplayer.downloadService.action.RESTART";
    public static final String ACTION_RESUME_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS";
    public static final String ACTION_SET_REQUIREMENTS = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS";
    public static final String ACTION_SET_STOP_REASON = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON";
    public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000;
    public static final int FOREGROUND_NOTIFICATION_ID_NONE = 0;
    public static final String KEY_CONTENT_ID = "content_id";
    public static final String KEY_DOWNLOAD_REQUEST = "download_request";
    public static final String KEY_FOREGROUND = "foreground";
    public static final String KEY_REQUIREMENTS = "requirements";
    public static final String KEY_STOP_REASON = "stop_reason";
    private static final String TAG = "DownloadService";
    private static final HashMap<Class<? extends DownloadService>, C14282a> downloadManagerHelpers = new HashMap<>();
    private final int channelDescriptionResourceId;
    private final String channelId;
    private final int channelNameResourceId;
    /* access modifiers changed from: private */
    public C17810b downloadManager;
    private final C14283b foregroundNotificationUpdater;
    private boolean isDestroyed;
    private boolean isStopped;
    private int lastStartId;
    private boolean startedInForeground;
    private boolean taskRemoved;

    /* renamed from: com.google.android.exoplayer2.offline.DownloadService$a */
    public static final class C14282a {

        /* renamed from: a */
        public DownloadService f31730a;

        public C14282a() {
            throw null;
        }
    }

    /* renamed from: com.google.android.exoplayer2.offline.DownloadService$b */
    public final class C14283b {

        /* renamed from: a */
        public final int f31731a;

        /* renamed from: b */
        public final long f31732b;

        /* renamed from: c */
        public final Handler f31733c = new Handler(Looper.getMainLooper());

        /* renamed from: d */
        public boolean f31734d;

        /* renamed from: e */
        public boolean f31735e;

        public C14283b(int i, long j) {
            this.f31731a = i;
            this.f31732b = j;
        }

        /* renamed from: a */
        public final void mo47595a() {
            DownloadService.this.downloadManager.getClass();
            DownloadService downloadService = DownloadService.this;
            downloadService.startForeground(this.f31731a, downloadService.getForegroundNotification((List<C17809a>) null));
            this.f31735e = true;
            if (this.f31734d) {
                this.f31733c.removeCallbacksAndMessages((Object) null);
                this.f31733c.postDelayed(new C17811c(this, 0), this.f31732b);
            }
        }
    }

    public DownloadService(int i) {
        this(i, 1000);
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z) {
        return buildAddDownloadIntent(context, cls, downloadRequest, 0, z);
    }

    public static Intent buildPauseDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z) {
        return getIntent(context, cls, ACTION_PAUSE_DOWNLOADS, z);
    }

    public static Intent buildRemoveAllDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z) {
        return getIntent(context, cls, ACTION_REMOVE_ALL_DOWNLOADS, z);
    }

    public static Intent buildRemoveDownloadIntent(Context context, Class<? extends DownloadService> cls, String str, boolean z) {
        return getIntent(context, cls, ACTION_REMOVE_DOWNLOAD, z).putExtra(KEY_CONTENT_ID, str);
    }

    public static Intent buildResumeDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z) {
        return getIntent(context, cls, ACTION_RESUME_DOWNLOADS, z);
    }

    public static Intent buildSetRequirementsIntent(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z) {
        return getIntent(context, cls, ACTION_SET_REQUIREMENTS, z).putExtra(KEY_REQUIREMENTS, requirements);
    }

    public static Intent buildSetStopReasonIntent(Context context, Class<? extends DownloadService> cls, String str, int i, boolean z) {
        return getIntent(context, cls, ACTION_SET_STOP_REASON, z).putExtra(KEY_CONTENT_ID, str).putExtra(KEY_STOP_REASON, i);
    }

    private static Intent getIntent(Context context, Class<? extends DownloadService> cls, String str, boolean z) {
        return getIntent(context, cls, str).putExtra(KEY_FOREGROUND, z);
    }

    /* access modifiers changed from: private */
    public boolean isStopped() {
        return this.isStopped;
    }

    /* access modifiers changed from: private */
    public static boolean needsStartedService(int i) {
        return i == 2 || i == 5 || i == 7;
    }

    /* access modifiers changed from: private */
    public void notifyDownloadChanged(C17809a aVar) {
        onDownloadChanged(aVar);
        if (this.foregroundNotificationUpdater != null) {
            aVar.getClass();
            if (needsStartedService(0)) {
                C14283b bVar = this.foregroundNotificationUpdater;
                bVar.f31734d = true;
                bVar.mo47595a();
                return;
            }
            C14283b bVar2 = this.foregroundNotificationUpdater;
            if (bVar2.f31735e) {
                bVar2.mo47595a();
            }
        }
    }

    /* access modifiers changed from: private */
    public void notifyDownloadRemoved(C17809a aVar) {
        onDownloadRemoved(aVar);
        C14283b bVar = this.foregroundNotificationUpdater;
        if (bVar != null && bVar.f31735e) {
            bVar.mo47595a();
        }
    }

    /* access modifiers changed from: private */
    public void notifyDownloads(List<C17809a> list) {
        if (this.foregroundNotificationUpdater != null) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).getClass();
                if (needsStartedService(0)) {
                    C14283b bVar = this.foregroundNotificationUpdater;
                    bVar.f31734d = true;
                    bVar.mo47595a();
                    return;
                }
            }
        }
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z) {
        startService(context, buildAddDownloadIntent(context, cls, downloadRequest, z), z);
    }

    public static void sendPauseDownloads(Context context, Class<? extends DownloadService> cls, boolean z) {
        startService(context, buildPauseDownloadsIntent(context, cls, z), z);
    }

    public static void sendRemoveAllDownloads(Context context, Class<? extends DownloadService> cls, boolean z) {
        startService(context, buildRemoveAllDownloadsIntent(context, cls, z), z);
    }

    public static void sendRemoveDownload(Context context, Class<? extends DownloadService> cls, String str, boolean z) {
        startService(context, buildRemoveDownloadIntent(context, cls, str, z), z);
    }

    public static void sendResumeDownloads(Context context, Class<? extends DownloadService> cls, boolean z) {
        startService(context, buildResumeDownloadsIntent(context, cls, z), z);
    }

    public static void sendSetRequirements(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z) {
        startService(context, buildSetRequirementsIntent(context, cls, requirements, z), z);
    }

    public static void sendSetStopReason(Context context, Class<? extends DownloadService> cls, String str, int i, boolean z) {
        startService(context, buildSetStopReasonIntent(context, cls, str, i, z), z);
    }

    public static void start(Context context, Class<? extends DownloadService> cls) {
        context.startService(getIntent(context, cls, ACTION_INIT));
    }

    public static void startForeground(Context context, Class<? extends DownloadService> cls) {
        Intent intent = getIntent(context, cls, ACTION_INIT, true);
        if (C14049b0.f30913a >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    private static void startService(Context context, Intent intent, boolean z) {
        if (!z) {
            context.startService(intent);
        } else if (C14049b0.f30913a >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    /* access modifiers changed from: private */
    public void stop() {
        C14283b bVar = this.foregroundNotificationUpdater;
        if (bVar != null) {
            bVar.f31734d = false;
            bVar.f31733c.removeCallbacksAndMessages((Object) null);
        }
        if (C14049b0.f30913a >= 28 || !this.taskRemoved) {
            this.isStopped |= stopSelfResult(this.lastStartId);
            return;
        }
        stopSelf();
        this.isStopped = true;
    }

    public abstract C17810b getDownloadManager();

    public abstract Notification getForegroundNotification(List<C17809a> list);

    public abstract C17841b getScheduler();

    public final void invalidateForegroundNotification() {
        C14283b bVar = this.foregroundNotificationUpdater;
        if (bVar != null && !this.isDestroyed && bVar.f31735e) {
            bVar.mo47595a();
        }
    }

    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public void onCreate() {
        String str = this.channelId;
        if (str != null) {
            int i = this.channelNameResourceId;
            int i2 = this.channelDescriptionResourceId;
            if (C14049b0.f30913a >= 26) {
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                notificationManager.getClass();
                NotificationChannel notificationChannel = new NotificationChannel(str, getString(i), 2);
                if (i2 != 0) {
                    notificationChannel.setDescription(getString(i2));
                }
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        C14282a aVar = downloadManagerHelpers.get(getClass());
        boolean z = true;
        if (aVar == null) {
            if (this.foregroundNotificationUpdater == null) {
                z = false;
            }
            if (z) {
                getScheduler();
            }
            C17810b downloadManager2 = getDownloadManager();
            this.downloadManager = downloadManager2;
            downloadManager2.mo69048a(false);
            getApplicationContext();
            this.downloadManager.getClass();
            throw null;
        }
        this.downloadManager = null;
        if (aVar.f31730a != null) {
            z = false;
        }
        C14075p.m21694f(z);
        aVar.f31730a = this;
        throw null;
    }

    public void onDestroy() {
        boolean z = true;
        this.isDestroyed = true;
        C14282a aVar = downloadManagerHelpers.get(getClass());
        aVar.getClass();
        if (aVar.f31730a != this) {
            z = false;
        }
        C14075p.m21694f(z);
        aVar.f31730a = null;
        C14283b bVar = this.foregroundNotificationUpdater;
        if (bVar != null) {
            bVar.f31734d = false;
            bVar.f31733c.removeCallbacksAndMessages((Object) null);
        }
    }

    @Deprecated
    public void onDownloadChanged(C17809a aVar) {
    }

    @Deprecated
    public void onDownloadRemoved(C17809a aVar) {
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        String str2;
        C14283b bVar;
        this.lastStartId = i2;
        boolean z = false;
        this.taskRemoved = false;
        if (intent != null) {
            str2 = intent.getAction();
            str = intent.getStringExtra(KEY_CONTENT_ID);
            this.startedInForeground |= intent.getBooleanExtra(KEY_FOREGROUND, false) || ACTION_RESTART.equals(str2);
        } else {
            str2 = null;
            str = null;
        }
        if (str2 == null) {
            str2 = ACTION_INIT;
        }
        C17810b bVar2 = this.downloadManager;
        bVar2.getClass();
        char c = 65535;
        switch (str2.hashCode()) {
            case -1931239035:
                if (str2.equals(ACTION_ADD_DOWNLOAD)) {
                    c = 0;
                    break;
                }
                break;
            case -932047176:
                if (str2.equals(ACTION_RESUME_DOWNLOADS)) {
                    c = 1;
                    break;
                }
                break;
            case -871181424:
                if (str2.equals(ACTION_RESTART)) {
                    c = 2;
                    break;
                }
                break;
            case -650547439:
                if (str2.equals(ACTION_REMOVE_ALL_DOWNLOADS)) {
                    c = 3;
                    break;
                }
                break;
            case -119057172:
                if (str2.equals(ACTION_SET_REQUIREMENTS)) {
                    c = 4;
                    break;
                }
                break;
            case 191112771:
                if (str2.equals(ACTION_PAUSE_DOWNLOADS)) {
                    c = 5;
                    break;
                }
                break;
            case 671523141:
                if (str2.equals(ACTION_SET_STOP_REASON)) {
                    c = 6;
                    break;
                }
                break;
            case 1015676687:
                if (str2.equals(ACTION_INIT)) {
                    c = 7;
                    break;
                }
                break;
            case 1547520644:
                if (str2.equals(ACTION_REMOVE_DOWNLOAD)) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                intent.getClass();
                if (((DownloadRequest) intent.getParcelableExtra(KEY_DOWNLOAD_REQUEST)) == null) {
                    Log.e(TAG, "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                } else {
                    intent.getIntExtra(KEY_STOP_REASON, 0);
                    bVar2.f38717a++;
                    throw null;
                }
            case 1:
                bVar2.mo69048a(false);
                break;
            case 2:
            case 7:
                break;
            case 3:
                bVar2.f38717a++;
                throw null;
            case 4:
                intent.getClass();
                Requirements requirements = (Requirements) intent.getParcelableExtra(KEY_REQUIREMENTS);
                if (requirements == null) {
                    Log.e(TAG, "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                } else {
                    C17841b scheduler = getScheduler();
                    if (scheduler != null) {
                        Requirements a = scheduler.mo69075a();
                        if (!a.equals(requirements)) {
                            C0023f.m112m(65, "Ignoring requirements not supported by the Scheduler: ", requirements.getRequirements() ^ a.getRequirements(), TAG);
                        }
                    }
                    throw null;
                }
            case 5:
                bVar2.mo69048a(true);
                break;
            case 6:
                intent.getClass();
                if (!intent.hasExtra(KEY_STOP_REASON)) {
                    Log.e(TAG, "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    intent.getIntExtra(KEY_STOP_REASON, 0);
                    bVar2.f38717a++;
                    throw null;
                }
            case 8:
                if (str == null) {
                    Log.e(TAG, "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                } else {
                    bVar2.f38717a++;
                    throw null;
                }
            default:
                Log.e(TAG, str2.length() != 0 ? "Ignored unrecognized action: ".concat(str2) : new String("Ignored unrecognized action: "));
                break;
        }
        if (C14049b0.f30913a >= 26 && this.startedInForeground && (bVar = this.foregroundNotificationUpdater) != null && !bVar.f31735e) {
            bVar.mo47595a();
        }
        this.isStopped = false;
        if (bVar2.f38717a == 0) {
            z = true;
        }
        if (z) {
            stop();
        }
        return 1;
    }

    public void onTaskRemoved(Intent intent) {
        this.taskRemoved = true;
    }

    public DownloadService(int i, long j) {
        this(i, j, (String) null, 0, 0);
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i, boolean z) {
        return getIntent(context, cls, ACTION_ADD_DOWNLOAD, z).putExtra(KEY_DOWNLOAD_REQUEST, downloadRequest).putExtra(KEY_STOP_REASON, i);
    }

    /* access modifiers changed from: private */
    public static Intent getIntent(Context context, Class<? extends DownloadService> cls, String str) {
        return new Intent(context, cls).setAction(str);
    }

    @Deprecated
    public DownloadService(int i, long j, String str, int i2) {
        this(i, j, str, i2, 0);
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i, boolean z) {
        startService(context, buildAddDownloadIntent(context, cls, downloadRequest, i, z), z);
    }

    public DownloadService(int i, long j, String str, int i2, int i3) {
        if (i == 0) {
            this.foregroundNotificationUpdater = null;
            this.channelId = null;
            this.channelNameResourceId = 0;
            this.channelDescriptionResourceId = 0;
            return;
        }
        this.foregroundNotificationUpdater = new C14283b(i, j);
        this.channelId = str;
        this.channelNameResourceId = i2;
        this.channelDescriptionResourceId = i3;
    }
}
