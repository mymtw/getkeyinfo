package p250u0;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* renamed from: u0.h */
public final class C8092h {

    /* renamed from: a */
    public final String f17621a;

    /* renamed from: b */
    public CharSequence f17622b;

    /* renamed from: c */
    public int f17623c;

    /* renamed from: d */
    public String f17624d;

    /* renamed from: e */
    public String f17625e;

    /* renamed from: f */
    public boolean f17626f = true;

    /* renamed from: g */
    public Uri f17627g = Settings.System.DEFAULT_NOTIFICATION_URI;

    /* renamed from: h */
    public AudioAttributes f17628h;

    /* renamed from: i */
    public boolean f17629i;

    /* renamed from: j */
    public int f17630j = 0;

    /* renamed from: k */
    public boolean f17631k;

    /* renamed from: l */
    public long[] f17632l;

    /* renamed from: m */
    public String f17633m;

    /* renamed from: n */
    public String f17634n;

    public C8092h(NotificationChannel notificationChannel) {
        String id = notificationChannel.getId();
        int importance = notificationChannel.getImportance();
        id.getClass();
        this.f17621a = id;
        this.f17623c = importance;
        this.f17628h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        this.f17622b = notificationChannel.getName();
        this.f17624d = notificationChannel.getDescription();
        this.f17625e = notificationChannel.getGroup();
        this.f17626f = notificationChannel.canShowBadge();
        this.f17627g = notificationChannel.getSound();
        this.f17628h = notificationChannel.getAudioAttributes();
        this.f17629i = notificationChannel.shouldShowLights();
        this.f17630j = notificationChannel.getLightColor();
        this.f17631k = notificationChannel.shouldVibrate();
        this.f17632l = notificationChannel.getVibrationPattern();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f17633m = notificationChannel.getParentChannelId();
            this.f17634n = notificationChannel.getConversationId();
        }
        notificationChannel.canBypassDnd();
        notificationChannel.getLockscreenVisibility();
        if (i >= 29) {
            notificationChannel.canBubble();
        }
        if (i >= 30) {
            notificationChannel.isImportantConversation();
        }
    }

    /* renamed from: a */
    public final NotificationChannel mo20681a() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        NotificationChannel notificationChannel = new NotificationChannel(this.f17621a, this.f17622b, this.f17623c);
        notificationChannel.setDescription(this.f17624d);
        notificationChannel.setGroup(this.f17625e);
        notificationChannel.setShowBadge(this.f17626f);
        notificationChannel.setSound(this.f17627g, this.f17628h);
        notificationChannel.enableLights(this.f17629i);
        notificationChannel.setLightColor(this.f17630j);
        notificationChannel.setVibrationPattern(this.f17632l);
        notificationChannel.enableVibration(this.f17631k);
        if (!(i < 30 || (str = this.f17633m) == null || (str2 = this.f17634n) == null)) {
            notificationChannel.setConversationId(str, str2);
        }
        return notificationChannel;
    }
}
