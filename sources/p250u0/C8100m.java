package p250u0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.etsy.android.R;
import java.util.ArrayList;

/* renamed from: u0.m */
public final class C8100m {

    /* renamed from: A */
    public String f17653A;

    /* renamed from: B */
    public boolean f17654B;

    /* renamed from: C */
    public Notification f17655C;
    @Deprecated

    /* renamed from: D */
    public ArrayList<String> f17656D;

    /* renamed from: a */
    public Context f17657a;

    /* renamed from: b */
    public ArrayList<C8094j> f17658b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<C8109u> f17659c = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<C8094j> f17660d = new ArrayList<>();

    /* renamed from: e */
    public CharSequence f17661e;

    /* renamed from: f */
    public CharSequence f17662f;

    /* renamed from: g */
    public PendingIntent f17663g;

    /* renamed from: h */
    public Bitmap f17664h;

    /* renamed from: i */
    public int f17665i;

    /* renamed from: j */
    public int f17666j;

    /* renamed from: k */
    public boolean f17667k = true;

    /* renamed from: l */
    public C8105q f17668l;

    /* renamed from: m */
    public CharSequence f17669m;

    /* renamed from: n */
    public int f17670n;

    /* renamed from: o */
    public int f17671o;

    /* renamed from: p */
    public boolean f17672p;

    /* renamed from: q */
    public String f17673q;

    /* renamed from: r */
    public boolean f17674r = false;

    /* renamed from: s */
    public String f17675s;

    /* renamed from: t */
    public Bundle f17676t;

    /* renamed from: u */
    public int f17677u = 0;

    /* renamed from: v */
    public int f17678v = 0;

    /* renamed from: w */
    public Notification f17679w;

    /* renamed from: x */
    public RemoteViews f17680x;

    /* renamed from: y */
    public RemoteViews f17681y;

    /* renamed from: z */
    public String f17682z;

    public C8100m(Context context, String str) {
        Notification notification = new Notification();
        this.f17655C = notification;
        this.f17657a = context;
        this.f17682z = str;
        notification.when = System.currentTimeMillis();
        this.f17655C.audioStreamType = -1;
        this.f17666j = 0;
        this.f17656D = new ArrayList<>();
        this.f17654B = true;
    }

    /* renamed from: c */
    public static CharSequence m16287c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* renamed from: a */
    public final void mo20688a(int i, String str, PendingIntent pendingIntent) {
        int i2 = i;
        this.f17658b.add(new C8094j(i2 == 0 ? null : IconCompat.m4961c((Resources) null, "", i2), str, pendingIntent, new Bundle(), (C8111v[]) null, (C8111v[]) null, true, 0, true, false));
    }

    /* renamed from: b */
    public final Notification mo20689b() {
        Bundle bundle;
        C8106r rVar = new C8106r(this);
        C8105q qVar = rVar.f17698c.f17668l;
        if (qVar != null) {
            qVar.mo20684b(rVar);
        }
        if (qVar != null) {
            qVar.mo20698e();
        }
        Notification build = rVar.f17697b.build();
        RemoteViews remoteViews = rVar.f17698c.f17680x;
        if (remoteViews != null) {
            build.contentView = remoteViews;
        }
        if (qVar != null) {
            qVar.mo20697d();
        }
        if (qVar != null) {
            rVar.f17698c.f17668l.mo20699f();
        }
        if (!(qVar == null || (bundle = build.extras) == null)) {
            qVar.mo20686a(bundle);
        }
        return build;
    }

    /* renamed from: d */
    public final void mo20690d(CharSequence charSequence) {
        this.f17662f = m16287c(charSequence);
    }

    /* renamed from: e */
    public final void mo20691e(CharSequence charSequence) {
        this.f17661e = m16287c(charSequence);
    }

    /* renamed from: f */
    public final void mo20692f(RemoteViews remoteViews) {
        this.f17680x = remoteViews;
    }

    /* renamed from: g */
    public final void mo20693g(int i, boolean z) {
        if (z) {
            Notification notification = this.f17655C;
            notification.flags = i | notification.flags;
            return;
        }
        Notification notification2 = this.f17655C;
        notification2.flags = (~i) & notification2.flags;
    }

    /* renamed from: h */
    public final void mo20694h(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f17657a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
            }
        }
        this.f17664h = bitmap;
    }

    /* renamed from: i */
    public final void mo20695i(Uri uri) {
        Notification notification = this.f17655C;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    }

    /* renamed from: j */
    public final void mo20696j(C8105q qVar) {
        if (this.f17668l != qVar) {
            this.f17668l = qVar;
            if (qVar != null) {
                qVar.mo20702g(this);
            }
        }
    }
}
