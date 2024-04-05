package p356ge;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.BOEApplication;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.logger.C8693g;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.util.C8915n;
import com.etsy.android.p327ui.navigation.ActivityAnimationMode;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.BottomSheetNavigationKey;
import com.etsy.android.p327ui.navigation.keys.DeeplinkNavigationKey;
import com.etsy.android.p327ui.navigation.keys.DialogFragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.GenericHelpKey;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import com.etsy.android.uikit.util.C11897c;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;
import p323ce.C8582a;
import p350fe.C12737k;
import p363he.C12817a;
import p363he.C12818b;
import p363he.C12819c;
import p363he.C12821d;
import p363he.C12822e;
import p370ie.C12946f;

/* renamed from: ge.a */
public final class C12788a {

    /* renamed from: ge.a$a */
    public /* synthetic */ class C12789a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28266a;

        static {
            int[] iArr = new int[ActivityAnimationMode.values().length];
            iArr[ActivityAnimationMode.SLIDE_RIGHT.ordinal()] = 1;
            iArr[ActivityAnimationMode.SLIDE_LEFT.ordinal()] = 2;
            iArr[ActivityAnimationMode.SLIDE_BOTTOM.ordinal()] = 3;
            iArr[ActivityAnimationMode.FADE_SLOW.ordinal()] = 4;
            iArr[ActivityAnimationMode.FADE_IN_OUT.ordinal()] = 5;
            iArr[ActivityAnimationMode.DEFAULT.ordinal()] = 6;
            iArr[ActivityAnimationMode.DEFAULT_OUT.ordinal()] = 7;
            iArr[ActivityAnimationMode.POP.ordinal()] = 8;
            iArr[ActivityAnimationMode.ZOOM_IN_OUT.ordinal()] = 9;
            iArr[ActivityAnimationMode.BOTTOM_NAV_FADE_IN_OUT.ordinal()] = 10;
            iArr[ActivityAnimationMode.NONE.ordinal()] = 11;
            f28266a = iArr;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.etsy.android.p327ui.navigation.keys.DeeplinkNavigationKey m20422a(android.app.Activity r8, com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey r9, android.content.Intent r10) {
        /*
            com.etsy.android.ui.navigation.ActivityAnimationMode r5 = com.etsy.android.p327ui.navigation.ActivityAnimationMode.BOTTOM_NAV_FADE_IN_OUT
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            java.lang.String r0 = "animation"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            com.etsy.android.ui.navigation.keys.DeeplinkNavigationKey r6 = new com.etsy.android.ui.navigation.keys.DeeplinkNavigationKey
            java.lang.String r2 = kotlin.reflect.C19421p.m32935c0(r8)
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x0044
            android.content.Intent r3 = r8.getIntent()
            if (r3 == 0) goto L_0x0044
            int r3 = p250u0.C8077a.f17593c
            android.net.Uri r3 = r8.getReferrer()
            if (r3 == 0) goto L_0x0044
            java.lang.String r4 = r3.getScheme()
            java.lang.String r7 = "android-app"
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r7)
            if (r4 == 0) goto L_0x0044
            java.lang.String r3 = r3.getHost()
            android.content.ComponentName r8 = r8.getComponentName()
            java.lang.String r8 = r8.getPackageName()
            boolean r8 = kotlin.jvm.internal.C19383o.m32792b(r3, r8)
            if (r8 == 0) goto L_0x0044
            r3 = r0
            goto L_0x0045
        L_0x0044:
            r3 = r1
        L_0x0045:
            if (r10 == 0) goto L_0x004e
            java.lang.String r8 = "NAV_INTERNAL_LINK"
            boolean r8 = r10.getBooleanExtra(r8, r1)
            goto L_0x004f
        L_0x004e:
            r8 = r1
        L_0x004f:
            com.etsy.android.lib.core.EtsyApplication r10 = com.etsy.android.lib.core.EtsyApplication.get()
            boolean r10 = r10.isAppInBackground()
            if (r10 == 0) goto L_0x005d
            if (r8 != 0) goto L_0x005d
            r4 = r0
            goto L_0x005e
        L_0x005d:
            r4 = r1
        L_0x005e:
            r0 = r6
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p356ge.C12788a.m20422a(android.app.Activity, com.etsy.android.ui.navigation.keys.FragmentNavigationKey, android.content.Intent):com.etsy.android.ui.navigation.keys.DeeplinkNavigationKey");
    }

    /* renamed from: b */
    public static final void m20423b(Activity activity, GenericHelpKey genericHelpKey) {
        if (activity != null) {
            try {
                if (C8915n.m17353e(new URL(genericHelpKey.getUrl()).getHost())) {
                    m20424c(activity, genericHelpKey);
                }
            } catch (MalformedURLException unused) {
            }
        }
    }

    /* renamed from: c */
    public static final void m20424c(Activity activity, C12822e eVar) {
        C19383o.m32797g(eVar, "key");
        if (activity == null) {
            return;
        }
        if (eVar instanceof FragmentNavigationKey) {
            if (activity instanceof C8582a) {
                ((C8582a) activity).navigate(eVar);
                return;
            }
            throw new UnsupportedNavigationException("Activity " + activity + " is not a NavigationProvider");
        } else if (!(eVar instanceof DeeplinkNavigationKey)) {
            C19394m mVar = null;
            if (eVar instanceof C12821d) {
                C12821d dVar = (C12821d) eVar;
                Intent intent = new Intent(activity, dVar.f28303c);
                intent.setData(Uri.parse(dVar.f28302b));
                intent.putExtra("internal_link_extra", true);
                EtsyApplication etsyApplication = EtsyApplication.get();
                C19383o.m32795e(etsyApplication, "null cannot be cast to non-null type com.etsy.android.BOEApplication");
                C12737k internalDeeplinkRouter = ((BOEApplication) etsyApplication).getInternalDeeplinkRouter();
                C19383o.m32796f(internalDeeplinkRouter, "BOEApplication.get() as …n).internalDeeplinkRouter");
                if ((activity instanceof FragmentActivity) && (activity instanceof C8693g)) {
                    C8703p analyticsContext = ((C8693g) activity).getAnalyticsContext();
                    C19383o.m32796f(analyticsContext, "getAnalyticsContext()");
                    internalDeeplinkRouter.f28144a.mo45504b((JSONObject) null, (FragmentActivity) activity, intent, analyticsContext);
                }
            } else if (eVar instanceof BottomSheetNavigationKey) {
                BottomSheetNavigationKey bottomSheetNavigationKey = (BottomSheetNavigationKey) eVar;
                TrackingBottomSheetDialogFragment bottomSheetFragment = bottomSheetNavigationKey.getBottomSheetFragment();
                bottomSheetFragment.setArguments(bottomSheetNavigationKey.getNavigationParams().mo45608a());
                m20428g(activity, bottomSheetFragment, (String) null);
            } else if (eVar instanceof DialogFragmentNavigationKey) {
                DialogFragmentNavigationKey dialogFragmentNavigationKey = (DialogFragmentNavigationKey) eVar;
                DialogFragment dialogFragment = dialogFragmentNavigationKey.getDialogFragment();
                dialogFragment.setArguments(dialogFragmentNavigationKey.getNavigationParams().mo45608a());
                m20428g(activity, dialogFragment, (String) null);
            } else if (eVar instanceof C12819c) {
                C12819c cVar = (C12819c) eVar;
                m20428g(activity, cVar.mo45599g(), cVar.mo45596d());
            } else if (eVar instanceof C12818b) {
                C12818b bVar = (C12818b) eVar;
                Intent intent2 = new Intent(activity, bVar.getClazz());
                intent2.putExtras(bVar.getNavigationParams().mo45608a());
                if (bVar.clearTask()) {
                    intent2.setFlags(268468224);
                }
                m20427f(activity, bVar.getAnimationMode());
                activity.startActivity(intent2);
            } else if (eVar instanceof C12817a) {
                C12817a aVar = (C12817a) eVar;
                Intent intent3 = new Intent(activity, aVar.getClazz());
                intent3.putExtras(aVar.getNavigationParams().mo45608a());
                if (aVar.mo45589a() != null) {
                    intent3.setAction(aVar.mo45589a());
                }
                m20427f(activity, aVar.getAnimationMode());
                Fragment fragment = aVar.getFragment();
                if (fragment != null) {
                    fragment.startActivityForResult(intent3, aVar.mo45590b());
                    mVar = C19394m.f43287a;
                }
                if (mVar == null) {
                    activity.startActivityForResult(intent3, aVar.mo45590b());
                }
            } else {
                throw new UnsupportedNavigationException("Navigation key " + eVar + " is not supported");
            }
        } else if (activity instanceof C8582a) {
            ((C8582a) activity).navigate(eVar);
        } else {
            DeeplinkNavigationKey deeplinkNavigationKey = (DeeplinkNavigationKey) eVar;
            Intent intent4 = new Intent(activity, deeplinkNavigationKey.getClazz());
            intent4.putExtras(deeplinkNavigationKey.getNavigationParams().mo45608a());
            m20427f(activity, deeplinkNavigationKey.getAnimationMode());
            intent4.putExtra("deep_link_key_param", (Parcelable) eVar);
            activity.startActivity(intent4);
        }
    }

    /* renamed from: d */
    public static final void m20425d(Activity activity, C12946f fVar) throws UnsupportedNavigationException {
        if (activity != null) {
            Intent intent = new Intent(fVar.mo45714a());
            intent.setData(fVar.mo45715b());
            Bundle extras = fVar.getExtras();
            if (extras != null) {
                intent.putExtras(extras);
            }
            try {
                activity.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                StringBuilder h = C0072d.m201h("Action ");
                h.append(intent.getAction());
                h.append(" not supported");
                throw new UnsupportedNavigationException(h.toString());
            }
        }
    }

    /* renamed from: e */
    public static final void m20426e(FragmentActivity fragmentActivity) {
        if (fragmentActivity == null) {
            return;
        }
        if (fragmentActivity instanceof C11897c) {
            ((C11897c) fragmentActivity).popBackstack();
        } else if (fragmentActivity.getSupportFragmentManager().mo10355E() <= 0) {
            fragmentActivity.finish();
            if (fragmentActivity.getIntent() != null) {
                fragmentActivity.overridePendingTransition(fragmentActivity.getIntent().getIntExtra("NAV_ANIM_BOTTOM_ENTER", 0), fragmentActivity.getIntent().getIntExtra("NAV_ANIM_TOP_EXIT", 0));
            }
        } else {
            fragmentActivity.getSupportFragmentManager().mo10363P();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r5 = com.etsy.android.R.anim.nav_top_zoom_exit;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        r0 = com.etsy.android.R.anim.nav_fade_in;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r6.overridePendingTransition(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        r5 = r0;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m20427f(android.app.Activity r6, com.etsy.android.p327ui.navigation.ActivityAnimationMode r7) {
        /*
            java.lang.String r0 = "animationMode"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            if (r6 == 0) goto L_0x004f
            int[] r0 = p356ge.C12788a.C12789a.f28266a
            int r7 = r7.ordinal()
            r7 = r0[r7]
            r0 = 2130772023(0x7f010037, float:1.7147153E38)
            r1 = 2130772046(0x7f01004e, float:1.71472E38)
            r2 = 2130772025(0x7f010039, float:1.7147157E38)
            r3 = 2130772024(0x7f010038, float:1.7147155E38)
            r4 = 0
            r5 = 2130772016(0x7f010030, float:1.7147139E38)
            switch(r7) {
                case 1: goto L_0x0049;
                case 2: goto L_0x0045;
                case 3: goto L_0x0041;
                case 4: goto L_0x003b;
                case 5: goto L_0x0039;
                case 6: goto L_0x0034;
                case 7: goto L_0x0023;
                case 8: goto L_0x002f;
                case 9: goto L_0x002b;
                case 10: goto L_0x0025;
                default: goto L_0x0022;
            }
        L_0x0022:
            r0 = r4
        L_0x0023:
            r5 = r0
            goto L_0x004c
        L_0x0025:
            r0 = 2130771980(0x7f01000c, float:1.7147065E38)
            r5 = r0
            r0 = r4
            goto L_0x004c
        L_0x002b:
            r0 = 2130772017(0x7f010031, float:1.714714E38)
            goto L_0x0037
        L_0x002f:
            r0 = 2130772039(0x7f010047, float:1.7147185E38)
            r5 = r2
            goto L_0x004c
        L_0x0034:
            r0 = 2130772037(0x7f010045, float:1.7147181E38)
        L_0x0037:
            r5 = r1
            goto L_0x004c
        L_0x0039:
            r5 = r2
            goto L_0x003f
        L_0x003b:
            r0 = 2130772035(0x7f010043, float:1.7147177E38)
            r5 = r0
        L_0x003f:
            r0 = r3
            goto L_0x004c
        L_0x0041:
            r0 = 2130772036(0x7f010044, float:1.714718E38)
            goto L_0x004c
        L_0x0045:
            r0 = 2130772038(0x7f010046, float:1.7147183E38)
            goto L_0x004c
        L_0x0049:
            r0 = 2130772040(0x7f010048, float:1.7147187E38)
        L_0x004c:
            r6.overridePendingTransition(r0, r5)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p356ge.C12788a.m20427f(android.app.Activity, com.etsy.android.ui.navigation.ActivityAnimationMode):void");
    }

    /* renamed from: g */
    public static final void m20428g(Activity activity, DialogFragment dialogFragment, String str) {
        if (activity == null) {
            return;
        }
        if (activity instanceof FragmentActivity) {
            FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            C19383o.m32796f(supportFragmentManager, "it.supportFragmentManager");
            if (str == null) {
                str = dialogFragment.getClass().getSimpleName() + dialogFragment.hashCode();
            }
            if (supportFragmentManager.mo10353C(str) == null) {
                dialogFragment.show(supportFragmentManager, str);
                return;
            }
            return;
        }
        throw new UnsupportedNavigationException("Activity " + activity + " is not a FragmentActivity");
    }
}
