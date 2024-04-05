package p250u0;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.Iterator;
import p002a1.C0006a;
import p193o.C7496d;

/* renamed from: u0.r */
public final class C8106r {

    /* renamed from: a */
    public final Context f17696a;

    /* renamed from: b */
    public final Notification.Builder f17697b;

    /* renamed from: c */
    public final C8100m f17698c;

    /* renamed from: d */
    public final Bundle f17699d;

    public C8106r(C8100m mVar) {
        String str;
        ArrayList<String> arrayList;
        C8106r rVar = this;
        C8100m mVar2 = mVar;
        new ArrayList();
        rVar.f17699d = new Bundle();
        rVar.f17698c = mVar2;
        rVar.f17696a = mVar2.f17657a;
        Notification.Builder builder = new Notification.Builder(mVar2.f17657a, mVar2.f17682z);
        rVar.f17697b = builder;
        Notification notification = mVar2.f17655C;
        Bundle[] bundleArr = null;
        int i = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(mVar2.f17661e).setContentText(mVar2.f17662f).setContentInfo((CharSequence) null).setContentIntent(mVar2.f17663g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent((PendingIntent) null, (notification.flags & 128) == 0 ? false : true).setLargeIcon(mVar2.f17664h).setNumber(mVar2.f17665i).setProgress(mVar2.f17670n, mVar2.f17671o, mVar2.f17672p);
        builder.setSubText(mVar2.f17669m).setUsesChronometer(false).setPriority(mVar2.f17666j);
        Iterator<C8094j> it = mVar2.f17658b.iterator();
        while (true) {
            str = "android.support.allowGeneratedReplies";
            if (!it.hasNext()) {
                break;
            }
            C8094j next = it.next();
            IconCompat a = next.mo20683a();
            Notification.Action.Builder builder2 = new Notification.Action.Builder(a != null ? a.mo8750g((Context) null) : null, next.f17647i, next.f17648j);
            C8111v[] vVarArr = next.f17641c;
            if (vVarArr != null) {
                int length = vVarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                for (int i2 = 0; i2 < vVarArr.length; i2++) {
                    vVarArr[i2].getClass();
                    RemoteInput.Builder addExtras = new RemoteInput.Builder((String) null).setLabel((CharSequence) null).setChoices((CharSequence[]) null).setAllowFreeFormInput(false).addExtras((Bundle) null);
                    if (Build.VERSION.SDK_INT >= 29) {
                        addExtras.setEditChoicesBeforeSending(0);
                    }
                    remoteInputArr[i2] = addExtras.build();
                }
                for (int i3 = 0; i3 < length; i3++) {
                    builder2.addRemoteInput(remoteInputArr[i3]);
                }
            }
            Bundle bundle = next.f17639a != null ? new Bundle(next.f17639a) : new Bundle();
            bundle.putBoolean(str, next.f17642d);
            int i4 = Build.VERSION.SDK_INT;
            builder2.setAllowGeneratedReplies(next.f17642d);
            bundle.putInt("android.support.action.semanticAction", next.f17644f);
            if (i4 >= 28) {
                builder2.setSemanticAction(next.f17644f);
            }
            if (i4 >= 29) {
                builder2.setContextual(next.f17645g);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", next.f17643e);
            builder2.addExtras(bundle);
            rVar.f17697b.addAction(builder2.build());
        }
        Bundle bundle2 = mVar2.f17676t;
        if (bundle2 != null) {
            rVar.f17699d.putAll(bundle2);
        }
        int i5 = Build.VERSION.SDK_INT;
        rVar.f17697b.setShowWhen(mVar2.f17667k);
        rVar.f17697b.setLocalOnly(mVar2.f17674r).setGroup(mVar2.f17673q).setGroupSummary(false).setSortKey((String) null);
        rVar.f17697b.setCategory(mVar2.f17675s).setColor(mVar2.f17677u).setVisibility(mVar2.f17678v).setPublicVersion(mVar2.f17679w).setSound(notification.sound, notification.audioAttributes);
        if (i5 < 28) {
            ArrayList<C8109u> arrayList2 = mVar2.f17659c;
            if (arrayList2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(arrayList2.size());
                Iterator<C8109u> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C8109u next2 = it2.next();
                    String str2 = next2.f17702b;
                    if (str2 == null) {
                        if (next2.f17701a != null) {
                            StringBuilder h = C0072d.m201h("name:");
                            h.append(next2.f17701a);
                            str2 = h.toString();
                        } else {
                            str2 = "";
                        }
                    }
                    arrayList.add(str2);
                }
            }
            ArrayList<String> arrayList3 = mVar2.f17656D;
            if (arrayList == null) {
                arrayList = arrayList3;
            } else if (arrayList3 != null) {
                C7496d dVar = new C7496d(arrayList3.size() + arrayList.size());
                dVar.addAll(arrayList);
                dVar.addAll(arrayList3);
                arrayList = new ArrayList<>(dVar);
            }
        } else {
            arrayList = mVar2.f17656D;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            for (String addPerson : arrayList) {
                rVar.f17697b.addPerson(addPerson);
            }
        }
        if (mVar2.f17660d.size() > 0) {
            if (mVar2.f17676t == null) {
                mVar2.f17676t = new Bundle();
            }
            Bundle bundle3 = mVar2.f17676t.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i6 = 0;
            while (i < mVar2.f17660d.size()) {
                String num = Integer.toString(i);
                C8094j jVar = mVar2.f17660d.get(i);
                Object obj = C8107s.f17700a;
                Bundle bundle6 = new Bundle();
                IconCompat a2 = jVar.mo20683a();
                bundle6.putInt(ResponseConstants.ICON, a2 != null ? a2.mo8747d() : i6);
                bundle6.putCharSequence("title", jVar.f17647i);
                bundle6.putParcelable("actionIntent", jVar.f17648j);
                Bundle bundle7 = jVar.f17639a != null ? new Bundle(jVar.f17639a) : new Bundle();
                bundle7.putBoolean(str, jVar.f17642d);
                bundle6.putBundle("extras", bundle7);
                C8111v[] vVarArr2 = jVar.f17641c;
                if (vVarArr2 != null) {
                    bundleArr = new Bundle[vVarArr2.length];
                    while (i6 < vVarArr2.length) {
                        C8111v vVar = vVarArr2[i6];
                        String str3 = str;
                        Bundle bundle8 = new Bundle();
                        vVar.getClass();
                        bundle8.putString("resultKey", (String) null);
                        bundle8.putCharSequence(ResponseConstants.LABEL, (CharSequence) null);
                        bundle8.putCharSequenceArray("choices", (CharSequence[]) null);
                        bundle8.putBoolean("allowFreeFormInput", false);
                        bundle8.putBundle("extras", (Bundle) null);
                        bundleArr[i6] = bundle8;
                        i6++;
                        str = str3;
                        vVarArr2 = vVarArr2;
                    }
                }
                String str4 = str;
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", jVar.f17643e);
                bundle6.putInt("semanticAction", jVar.f17644f);
                bundle5.putBundle(num, bundle6);
                i++;
                bundleArr = null;
                i6 = 0;
                str = str4;
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (mVar2.f17676t == null) {
                mVar2.f17676t = new Bundle();
            }
            mVar2.f17676t.putBundle("android.car.EXTENSIONS", bundle3);
            rVar = this;
            rVar.f17699d.putBundle("android.car.EXTENSIONS", bundle4);
        }
        int i7 = Build.VERSION.SDK_INT;
        rVar.f17697b.setExtras(mVar2.f17676t).setRemoteInputHistory((CharSequence[]) null);
        RemoteViews remoteViews = mVar2.f17680x;
        if (remoteViews != null) {
            rVar.f17697b.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = mVar2.f17681y;
        if (remoteViews2 != null) {
            rVar.f17697b.setCustomBigContentView(remoteViews2);
        }
        rVar.f17697b.setBadgeIconType(0).setSettingsText((CharSequence) null).setShortcutId(mVar2.f17653A).setTimeoutAfter(0).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(mVar2.f17682z)) {
            rVar.f17697b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
        }
        if (i7 >= 28) {
            Iterator<C8109u> it3 = mVar2.f17659c.iterator();
            while (it3.hasNext()) {
                rVar.f17697b.addPerson(it3.next().mo20703a());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            rVar.f17697b.setAllowSystemGeneratedContextualActions(mVar2.f17654B);
            rVar.f17697b.setBubbleMetadata((Notification.BubbleMetadata) null);
        }
        C0006a.m80a();
    }
}
