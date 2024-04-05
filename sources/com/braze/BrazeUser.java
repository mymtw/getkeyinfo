package com.braze;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.support.p013v4.media.session.C0087d;
import androidx.compose.animation.C0391c;
import com.appboy.enums.Gender;
import com.appboy.enums.Month;
import com.appboy.enums.NotificationSubscriptionType;
import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.ValidationUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import org.apache.commons.lang3.ClassUtils;
import p003a2.C0023f;
import p030bo.app.C3551a5;
import p030bo.app.C3596c0;
import p030bo.app.C3729h2;
import p030bo.app.C3787j;
import p030bo.app.C4010o;
import p030bo.app.C4077p5;
import p030bo.app.C4107q6;
import p030bo.app.C4208t1;
import p030bo.app.C4274x1;
import p753kq.C19846a;

public final class BrazeUser {

    /* renamed from: a */
    public final C4107q6 f11457a;

    /* renamed from: b */
    public final C4274x1 f11458b;

    /* renamed from: c */
    public volatile String f11459c;

    /* renamed from: d */
    public final C3729h2 f11460d;

    /* renamed from: e */
    public final C3551a5 f11461e;

    /* renamed from: f */
    public final ReentrantLock f11462f = new ReentrantLock();

    /* renamed from: com.braze.BrazeUser$a */
    final class C5324a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5324a f11463b = new C5324a();

        public C5324a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid alias parameter: alias is required to be non-null and non-empty. Not adding alias.";
        }
    }

    /* renamed from: com.braze.BrazeUser$a0 */
    final class C5325a0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11464b;

        /* renamed from: c */
        public final /* synthetic */ long f11465c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5325a0(String str, long j) {
            super(0);
            this.f11464b = str;
            this.f11465c = j;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to set custom attribute ");
            h.append(this.f11464b);
            h.append(" to ");
            return C0087d.m236f(h, this.f11465c, " seconds from epoch.");
        }
    }

    /* renamed from: com.braze.BrazeUser$a1 */
    final class C5326a1 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11466b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5326a1(String str) {
            super(0);
            this.f11466b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0391c.m1057c(C0072d.m201h("Failed to unset custom attribute "), this.f11466b, ClassUtils.PACKAGE_SEPARATOR_CHAR);
        }
    }

    /* renamed from: com.braze.BrazeUser$b */
    final class C5327b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5327b f11467b = new C5327b();

        public C5327b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid label parameter: label is required to be non-null and non-empty. Not adding alias.";
        }
    }

    /* renamed from: com.braze.BrazeUser$b0 */
    final class C5328b0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f11468b;

        /* renamed from: c */
        public final /* synthetic */ Month f11469c;

        /* renamed from: d */
        public final /* synthetic */ int f11470d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5328b0(int i, Month month, int i2) {
            super(0);
            this.f11468b = i;
            this.f11469c = month;
            this.f11470d = i2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to set date of birth to: ");
            h.append(this.f11468b);
            h.append('-');
            h.append(this.f11469c.getValue());
            h.append('-');
            h.append(this.f11470d);
            return h.toString();
        }
    }

    /* renamed from: com.braze.BrazeUser$b1 */
    final class C5329b1 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5329b1 f11471b = new C5329b1();

        public C5329b1() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Custom location attribute key was invalid. Not setting attribute.";
        }
    }

    /* renamed from: com.braze.BrazeUser$c */
    final class C5330c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11472b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5330c(String str) {
            super(0);
            this.f11472b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11472b, "Failed to set alias: ");
        }
    }

    /* renamed from: com.braze.BrazeUser$c0 */
    final class C5331c0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5331c0 f11473b = new C5331c0();

        public C5331c0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid email parameter: email is required to be non-empty. Not setting email.";
        }
    }

    /* renamed from: com.braze.BrazeUser$c1 */
    final class C5332c1 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11474b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5332c1(String str) {
            super(0);
            this.f11474b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0391c.m1057c(C0072d.m201h("Failed to unset custom location attribute with key '"), this.f11474b, '\'');
        }
    }

    /* renamed from: com.braze.BrazeUser$d */
    final class C5333d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5333d f11475b = new C5333d();

        public C5333d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute key was invalid. Not adding to attribute array.";
        }
    }

    /* renamed from: com.braze.BrazeUser$d0 */
    final class C5334d0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11476b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5334d0(String str) {
            super(0);
            this.f11476b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11476b, "Email address is not valid: ");
        }
    }

    /* renamed from: com.braze.BrazeUser$d1 */
    final class C5335d1 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11477b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5335d1(String str) {
            super(0);
            this.f11477b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11477b, "User object user id set to: ");
        }
    }

    /* renamed from: com.braze.BrazeUser$e */
    final class C5336e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11478b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5336e(String str) {
            super(0);
            this.f11478b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0023f.m110k(C0072d.m201h("Failed to add custom attribute with key '"), this.f11478b, "'.");
        }
    }

    /* renamed from: com.braze.BrazeUser$e0 */
    final class C5337e0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11479b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5337e0(String str) {
            super(0);
            this.f11479b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11479b, "Failed to set email to: ");
        }
    }

    /* renamed from: com.braze.BrazeUser$f */
    final class C5338f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5338f f11480b = new C5338f();

        public C5338f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not adding user to subscription group.";
        }
    }

    /* renamed from: com.braze.BrazeUser$f0 */
    final class C5339f0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ NotificationSubscriptionType f11481b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5339f0(NotificationSubscriptionType notificationSubscriptionType) {
            super(0);
            this.f11481b = notificationSubscriptionType;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11481b, "Failed to set email notification subscription to: ");
        }
    }

    /* renamed from: com.braze.BrazeUser$g */
    final class C5340g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11482b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5340g(String str) {
            super(0);
            this.f11482b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11482b, "Failed to add user to subscription group ");
        }
    }

    /* renamed from: com.braze.BrazeUser$g0 */
    final class C5341g0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5341g0 f11483b = new C5341g0();

        public C5341g0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to set Facebook user data.";
        }
    }

    /* renamed from: com.braze.BrazeUser$h */
    final class C5342h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11484b;

        /* renamed from: c */
        public final /* synthetic */ int f11485c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5342h(String str, int i) {
            super(0);
            this.f11484b = str;
            this.f11485c = i;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to increment custom attribute ");
            h.append(this.f11484b);
            h.append(" by ");
            return C0073e.m208h(h, this.f11485c, ClassUtils.PACKAGE_SEPARATOR_CHAR);
        }
    }

    /* renamed from: com.braze.BrazeUser$h0 */
    final class C5343h0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5343h0 f11486b = new C5343h0();

        public C5343h0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid first name parameter: first name is required to be non-empty. Not setting first name.";
        }
    }

    /* renamed from: com.braze.BrazeUser$i */
    final class C5344i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5344i f11487b = new C5344i();

        public C5344i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute key was invalid. Not removing from attribute array.";
        }
    }

    /* renamed from: com.braze.BrazeUser$i0 */
    final class C5345i0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11488b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5345i0(String str) {
            super(0);
            this.f11488b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11488b, "Failed to set first name to: ");
        }
    }

    /* renamed from: com.braze.BrazeUser$j */
    final class C5346j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11489b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5346j(String str) {
            super(0);
            this.f11489b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0023f.m110k(C0072d.m201h("Failed to remove custom attribute with key '"), this.f11489b, "'.");
        }
    }

    /* renamed from: com.braze.BrazeUser$j0 */
    final class C5347j0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Gender f11490b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5347j0(Gender gender) {
            super(0);
            this.f11490b = gender;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11490b, "Failed to set gender to: ");
        }
    }

    /* renamed from: com.braze.BrazeUser$k */
    final class C5348k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5348k f11491b = new C5348k();

        public C5348k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not removing user from subscription group.";
        }
    }

    /* renamed from: com.braze.BrazeUser$k0 */
    final class C5349k0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5349k0 f11492b = new C5349k0();

        public C5349k0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid home city parameter: home city is required to be non-blank. Not setting home city.";
        }
    }

    /* renamed from: com.braze.BrazeUser$l */
    final class C5350l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11493b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5350l(String str) {
            super(0);
            this.f11493b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11493b, "Failed to remove user from subscription group ");
        }
    }

    /* renamed from: com.braze.BrazeUser$l0 */
    final class C5351l0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11494b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5351l0(String str) {
            super(0);
            this.f11494b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11494b, "Failed to set home city to: ");
        }
    }

    /* renamed from: com.braze.BrazeUser$m */
    final class C5352m extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5352m f11495b = new C5352m();

        public C5352m() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to set attribution data.";
        }
    }

    /* renamed from: com.braze.BrazeUser$m0 */
    final class C5353m0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5353m0 f11496b = new C5353m0();

        public C5353m0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid language parameter: language is required to be non-empty. Not setting language.";
        }
    }

    /* renamed from: com.braze.BrazeUser$n */
    final class C5354n extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5354n f11497b = new C5354n();

        public C5354n() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid country parameter: country is required to be non-blank. Not setting country.";
        }
    }

    /* renamed from: com.braze.BrazeUser$n0 */
    final class C5355n0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11498b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5355n0(String str) {
            super(0);
            this.f11498b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11498b, "Failed to set language to: ");
        }
    }

    /* renamed from: com.braze.BrazeUser$o */
    final class C5356o extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11499b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5356o(String str) {
            super(0);
            this.f11499b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11499b, "Failed to set country to: ");
        }
    }

    /* renamed from: com.braze.BrazeUser$o0 */
    final class C5357o0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5357o0 f11500b = new C5357o0();

        public C5357o0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to manually set location.";
        }
    }

    /* renamed from: com.braze.BrazeUser$p */
    final class C5358p extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5358p f11501b = new C5358p();

        public C5358p() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute key cannot be null.";
        }
    }

    /* renamed from: com.braze.BrazeUser$p0 */
    final class C5359p0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5359p0 f11502b = new C5359p0();

        public C5359p0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid last name parameter: last name is required to be non-empty. Not setting last name.";
        }
    }

    /* renamed from: com.braze.BrazeUser$q */
    final class C5360q extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Object f11503b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5360q(Object obj) {
            super(0);
            this.f11503b = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11503b, "Error parsing date ");
        }
    }

    /* renamed from: com.braze.BrazeUser$q0 */
    final class C5361q0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11504b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5361q0(String str) {
            super(0);
            this.f11504b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11504b, "Failed to set last name to: ");
        }
    }

    /* renamed from: com.braze.BrazeUser$r */
    final class C5362r extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11505b;

        /* renamed from: c */
        public final /* synthetic */ Object f11506c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5362r(String str, Object obj) {
            super(0);
            this.f11505b = str;
            this.f11506c = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Could not add unsupported custom attribute type with key: ");
            h.append(this.f11505b);
            h.append(" and value: ");
            h.append(this.f11506c);
            return h.toString();
        }
    }

    /* renamed from: com.braze.BrazeUser$r0 */
    public static final class C5363r0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5363r0 f11507b = new C5363r0();

        public C5363r0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Custom location attribute key was invalid. Not setting attribute.";
        }
    }

    /* renamed from: com.braze.BrazeUser$s */
    final class C5364s extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11508b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5364s(String str) {
            super(0);
            this.f11508b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0023f.m110k(C0072d.m201h("Failed to set custom attribute array with key: '"), this.f11508b, "'.");
        }
    }

    /* renamed from: com.braze.BrazeUser$s0 */
    public static final class C5365s0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ double f11509b;

        /* renamed from: c */
        public final /* synthetic */ double f11510c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5365s0(double d, double d2) {
            super(0);
            this.f11509b = d;
            this.f11510c = d2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Cannot set custom location attribute due with invalid latitude '");
            h.append(this.f11509b);
            h.append(" and longitude '");
            h.append(this.f11510c);
            h.append('\'');
            return h.toString();
        }
    }

    /* renamed from: com.braze.BrazeUser$t */
    final class C5366t extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11511b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5366t(String str) {
            super(0);
            this.f11511b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0391c.m1057c(C0072d.m201h("Failed to set custom boolean attribute "), this.f11511b, ClassUtils.PACKAGE_SEPARATOR_CHAR);
        }
    }

    /* renamed from: com.braze.BrazeUser$t0 */
    public static final class C5367t0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11512b;

        /* renamed from: c */
        public final /* synthetic */ double f11513c;

        /* renamed from: d */
        public final /* synthetic */ double f11514d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5367t0(String str, double d, double d2) {
            super(0);
            this.f11512b = str;
            this.f11513c = d;
            this.f11514d = d2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to set custom location attribute with key '");
            h.append(this.f11512b);
            h.append("' and latitude '");
            h.append(this.f11513c);
            h.append("' and longitude '");
            h.append(this.f11514d);
            h.append('\'');
            return h.toString();
        }
    }

    /* renamed from: com.braze.BrazeUser$u */
    final class C5368u extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11515b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5368u(String str) {
            super(0);
            this.f11515b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0391c.m1057c(C0072d.m201h("Failed to set custom integer attribute "), this.f11515b, ClassUtils.PACKAGE_SEPARATOR_CHAR);
        }
    }

    /* renamed from: com.braze.BrazeUser$u0 */
    final class C5369u0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5369u0 f11516b = new C5369u0();

        public C5369u0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid phone number parameter: phone number is required to be non-empty. Not setting phone number.";
        }
    }

    /* renamed from: com.braze.BrazeUser$v */
    final class C5370v extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11517b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5370v(String str) {
            super(0);
            this.f11517b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0391c.m1057c(C0072d.m201h("Failed to set custom float attribute "), this.f11517b, ClassUtils.PACKAGE_SEPARATOR_CHAR);
        }
    }

    /* renamed from: com.braze.BrazeUser$v0 */
    final class C5371v0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11518b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5371v0(String str) {
            super(0);
            this.f11518b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11518b, "Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): ");
        }
    }

    /* renamed from: com.braze.BrazeUser$w */
    final class C5372w extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11519b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5372w(String str) {
            super(0);
            this.f11519b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0391c.m1057c(C0072d.m201h("Failed to set custom long attribute "), this.f11519b, ClassUtils.PACKAGE_SEPARATOR_CHAR);
        }
    }

    /* renamed from: com.braze.BrazeUser$w0 */
    final class C5373w0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11520b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5373w0(String str) {
            super(0);
            this.f11520b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11520b, "Failed to set phone number to: ");
        }
    }

    /* renamed from: com.braze.BrazeUser$x */
    final class C5374x extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11521b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5374x(String str) {
            super(0);
            this.f11521b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0391c.m1057c(C0072d.m201h("Failed to set custom string attribute "), this.f11521b, ClassUtils.PACKAGE_SEPARATOR_CHAR);
        }
    }

    /* renamed from: com.braze.BrazeUser$x0 */
    final class C5375x0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ NotificationSubscriptionType f11522b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5375x0(NotificationSubscriptionType notificationSubscriptionType) {
            super(0);
            this.f11522b = notificationSubscriptionType;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11522b, "Failed to set push notification subscription to: ");
        }
    }

    /* renamed from: com.braze.BrazeUser$y */
    final class C5376y extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11523b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5376y(String str) {
            super(0);
            this.f11523b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0391c.m1057c(C0072d.m201h("Failed to set custom double attribute "), this.f11523b, ClassUtils.PACKAGE_SEPARATOR_CHAR);
        }
    }

    /* renamed from: com.braze.BrazeUser$y0 */
    final class C5377y0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5377y0 f11524b = new C5377y0();

        public C5377y0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to set Twitter user data.";
        }
    }

    /* renamed from: com.braze.BrazeUser$z */
    final class C5378z extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11525b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5378z(String str) {
            super(0);
            this.f11525b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0023f.m110k(C0072d.m201h("Failed to set custom attribute "), this.f11525b, " to now.");
        }
    }

    /* renamed from: com.braze.BrazeUser$z0 */
    final class C5379z0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5379z0 f11526b = new C5379z0();

        public C5379z0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute key cannot be null.";
        }
    }

    public BrazeUser(C4107q6 q6Var, C4274x1 x1Var, String str, C4010o oVar, C3551a5 a5Var) {
        C19383o.m32797g(q6Var, "userCache");
        C19383o.m32797g(x1Var, "brazeManager");
        C19383o.m32797g(str, "internalUserId");
        C19383o.m32797g(oVar, "locationManager");
        C19383o.m32797g(a5Var, "serverConfigStorageProvider");
        this.f11457a = q6Var;
        this.f11458b = x1Var;
        this.f11459c = str;
        this.f11460d = oVar;
        this.f11461e = a5Var;
    }

    /* renamed from: d */
    public static void m10876d(BrazeUser brazeUser, String str) {
        brazeUser.getClass();
        C19383o.m32797g(str, "key");
        try {
            if (C3596c0.m8499a(str, brazeUser.f11461e.mo13080b())) {
                C4208t1 a = C3787j.f8608h.mo13464a(ValidationUtils.m11346a(str), 1);
                if (a != null) {
                    brazeUser.f11458b.mo13838a(a);
                }
            }
        } catch (Exception e) {
            BrazeUser brazeUser2 = brazeUser;
            BrazeLogger.m11282d(BrazeLogger.f11932a, brazeUser2, BrazeLogger.Priority.W, e, new C5342h(str, 1), 4);
        }
    }

    /* renamed from: a */
    public final void mo15726a(String str, String str2) {
        C19383o.m32797g(str, "alias");
        C19383o.m32797g(str2, ResponseConstants.LABEL);
        if (C19457k.m33020X0(str)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5324a.f11463b, 6);
        } else if (C19457k.m33020X0(str2)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5327b.f11467b, 6);
        } else {
            try {
                C4208t1 g = C3787j.f8608h.mo13486g(str, str2);
                if (g != null) {
                    this.f11458b.mo13838a(g);
                }
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new C5330c(str), 4);
            }
        }
    }

    /* renamed from: b */
    public final void mo15727b(String str, String str2) {
        C4208t1 a;
        C19383o.m32797g(str, "key");
        C19383o.m32797g(str2, "value");
        try {
            if (!C3596c0.m8499a(str, this.f11461e.mo13080b())) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5333d.f11475b, 6);
            } else if (C3596c0.m8498a(str2) && (a = C3787j.f8608h.mo13469a(ValidationUtils.m11346a(str), ValidationUtils.m11346a(str2))) != null) {
                this.f11458b.mo13838a(a);
            }
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C5336e(str), 4);
        }
    }

    /* renamed from: c */
    public final void mo15728c(String str) {
        C19383o.m32797g(str, "subscriptionGroupId");
        try {
            if (C19457k.m33020X0(str)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5338f.f11480b, 6);
                return;
            }
            C4208t1 a = C3787j.f8608h.mo13465a(str, C4077p5.SUBSCRIBED);
            if (a != null) {
                this.f11458b.mo13838a(a);
            }
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C5340g(str), 4);
        }
    }

    /* renamed from: e */
    public final void mo15729e(String str, String str2) {
        C4208t1 f;
        C19383o.m32797g(str, "key");
        C19383o.m32797g(str2, "value");
        try {
            if (!C3596c0.m8499a(str, this.f11461e.mo13080b())) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5344i.f11487b, 6);
            } else if (C3596c0.m8498a(str2) && (f = C3787j.f8608h.mo13484f(ValidationUtils.m11346a(str), ValidationUtils.m11346a(str2))) != null) {
                this.f11458b.mo13838a(f);
            }
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C5346j(str), 4);
        }
    }

    /* renamed from: f */
    public final void mo15730f(String str) {
        C19383o.m32797g(str, "subscriptionGroupId");
        try {
            if (C19457k.m33020X0(str)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5348k.f11491b, 6);
                return;
            }
            C4208t1 a = C3787j.f8608h.mo13465a(str, C4077p5.UNSUBSCRIBED);
            if (a != null) {
                this.f11458b.mo13838a(a);
            }
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C5350l(str), 4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b A[Catch:{ Exception -> 0x0021 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000e A[Catch:{ Exception -> 0x0021 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15731g(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != 0) goto L_0x0004
            goto L_0x000b
        L_0x0004:
            boolean r1 = kotlin.text.C19457k.m33020X0(r8)     // Catch:{ Exception -> 0x0021 }
            if (r1 != r0) goto L_0x000b
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 == 0) goto L_0x001b
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x0021 }
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W     // Catch:{ Exception -> 0x0021 }
            r4 = 0
            com.braze.BrazeUser$n r5 = com.braze.BrazeUser.C5354n.f11497b     // Catch:{ Exception -> 0x0021 }
            r6 = 6
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0021 }
            return
        L_0x001b:
            bo.app.q6 r0 = r7.f11457a     // Catch:{ Exception -> 0x0021 }
            r0.mo13924a((java.lang.String) r8)     // Catch:{ Exception -> 0x0021 }
            return
        L_0x0021:
            r0 = move-exception
            r4 = r0
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            com.braze.BrazeUser$o r5 = new com.braze.BrazeUser$o
            r5.<init>(r8)
            r6 = 4
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.mo15731g(java.lang.String):void");
    }

    /* renamed from: h */
    public final boolean mo15732h(Object obj, String str) {
        C19383o.m32797g(obj, "value");
        if (!C3596c0.m8499a(str, this.f11461e.mo13080b())) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5358p.f11501b, 6);
            return false;
        }
        String a = ValidationUtils.m11346a(str);
        boolean z = true;
        if (!(obj instanceof Boolean ? true : obj instanceof Integer ? true : obj instanceof Float ? true : obj instanceof Long)) {
            z = obj instanceof Double;
        }
        if (z) {
            return this.f11457a.mo13926a(a, obj);
        }
        if (obj instanceof String) {
            return this.f11457a.mo13926a(a, (Object) ValidationUtils.m11346a((String) obj));
        } else if (obj instanceof Date) {
            try {
                return this.f11457a.mo13926a(a, (Object) DateTimeUtils.m11300b((Date) obj, BrazeDateFormat.LONG));
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new C5360q(obj), 4);
                return false;
            }
        } else {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C5362r(str, obj), 6);
            return false;
        }
    }

    /* renamed from: i */
    public final void mo15733i(String str, String[] strArr) {
        C4208t1 a;
        C19383o.m32797g(str, "key");
        C19383o.m32797g(strArr, ResponseConstants.VALUES);
        try {
            if (C3596c0.m8499a(str, this.f11461e.mo13080b()) && (a = C3787j.f8608h.mo13471a(ValidationUtils.m11346a(str), C3596c0.m8500a(strArr))) != null) {
                this.f11458b.mo13838a(a);
            }
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C5364s(str), 4);
        }
    }

    /* renamed from: j */
    public final void mo15734j(int i, String str) {
        try {
            mo15732h(Integer.valueOf(i), str);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C5368u(str), 4);
        }
    }

    /* renamed from: k */
    public final void mo15735k(String str, double d) {
        try {
            mo15732h(Double.valueOf(d), str);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C5376y(str), 4);
        }
    }

    /* renamed from: l */
    public final void mo15736l(String str, String str2) {
        C19383o.m32797g(str2, "value");
        try {
            mo15732h(str2, str);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C5374x(str), 4);
        }
    }

    /* renamed from: m */
    public final void mo15737m(String str, boolean z) {
        try {
            mo15732h(Boolean.valueOf(z), str);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C5366t(str), 4);
        }
    }

    /* renamed from: n */
    public final void mo15738n(int i, Month month, int i2) {
        C19383o.m32797g(month, "month");
        try {
            int value = month.getValue();
            TimeZone timeZone = DateTimeUtils.f11946a;
            GregorianCalendar gregorianCalendar = new GregorianCalendar(i, value, i2, 0, 0, 0);
            gregorianCalendar.setTimeZone(DateTimeUtils.f11946a);
            Date time = gregorianCalendar.getTime();
            C19383o.m32796f(time, "calendar.time");
            this.f11457a.mo13929b(DateTimeUtils.m11300b(time, BrazeDateFormat.SHORT));
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C5328b0(i, month, i2), 4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d A[Catch:{ Exception -> 0x008c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010 A[Catch:{ Exception -> 0x008c }] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15739o(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            if (r10 != 0) goto L_0x0005
            goto L_0x000d
        L_0x0005:
            boolean r2 = kotlin.text.C19457k.m33020X0(r10)     // Catch:{ Exception -> 0x008c }
            if (r2 != r0) goto L_0x000d
            r2 = r0
            goto L_0x000e
        L_0x000d:
            r2 = r1
        L_0x000e:
            if (r2 == 0) goto L_0x001d
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x008c }
            com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.W     // Catch:{ Exception -> 0x008c }
            r6 = 0
            com.braze.BrazeUser$c0 r7 = com.braze.BrazeUser.C5331c0.f11473b     // Catch:{ Exception -> 0x008c }
            r8 = 6
            r4 = r9
            com.braze.support.BrazeLogger.m11282d(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x008c }
            return
        L_0x001d:
            if (r10 != 0) goto L_0x0021
            r2 = 0
            goto L_0x0056
        L_0x0021:
            int r2 = r10.length()     // Catch:{ Exception -> 0x008c }
            int r2 = r2 - r0
            r3 = r1
            r4 = r3
        L_0x0028:
            if (r3 > r2) goto L_0x004d
            if (r4 != 0) goto L_0x002e
            r5 = r3
            goto L_0x002f
        L_0x002e:
            r5 = r2
        L_0x002f:
            char r5 = r10.charAt(r5)     // Catch:{ Exception -> 0x008c }
            r6 = 32
            int r5 = kotlin.jvm.internal.C19383o.m32799i(r5, r6)     // Catch:{ Exception -> 0x008c }
            if (r5 > 0) goto L_0x003d
            r5 = r0
            goto L_0x003e
        L_0x003d:
            r5 = r1
        L_0x003e:
            if (r4 != 0) goto L_0x0047
            if (r5 != 0) goto L_0x0044
            r4 = r0
            goto L_0x0028
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x0047:
            if (r5 != 0) goto L_0x004a
            goto L_0x004d
        L_0x004a:
            int r2 = r2 + -1
            goto L_0x0028
        L_0x004d:
            int r2 = r2 + r0
            java.lang.CharSequence r2 = r10.subSequence(r3, r2)     // Catch:{ Exception -> 0x008c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x008c }
        L_0x0056:
            if (r2 == 0) goto L_0x0086
            com.braze.support.ValidationUtils r3 = com.braze.support.ValidationUtils.f11978a     // Catch:{ Exception -> 0x008c }
            int r3 = r2.length()     // Catch:{ Exception -> 0x008c }
            if (r3 != 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r0 = r1
        L_0x0062:
            if (r0 == 0) goto L_0x0065
            goto L_0x0074
        L_0x0065:
            int r0 = r2.length()     // Catch:{ Exception -> 0x008c }
            r3 = 255(0xff, float:3.57E-43)
            if (r0 <= r3) goto L_0x006e
            goto L_0x0074
        L_0x006e:
            kotlin.text.Regex r0 = com.braze.support.ValidationUtils.f11980c     // Catch:{ Exception -> 0x008c }
            boolean r1 = r0.matches(r2)     // Catch:{ Exception -> 0x008c }
        L_0x0074:
            if (r1 == 0) goto L_0x0077
            goto L_0x0086
        L_0x0077:
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x008c }
            r5 = 0
            r6 = 0
            com.braze.BrazeUser$d0 r7 = new com.braze.BrazeUser$d0     // Catch:{ Exception -> 0x008c }
            r7.<init>(r10)     // Catch:{ Exception -> 0x008c }
            r8 = 7
            r4 = r9
            com.braze.support.BrazeLogger.m11282d(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x008c }
            goto L_0x008b
        L_0x0086:
            bo.app.q6 r0 = r9.f11457a     // Catch:{ Exception -> 0x008c }
            r0.mo13931c(r2)     // Catch:{ Exception -> 0x008c }
        L_0x008b:
            return
        L_0x008c:
            r0 = move-exception
            r4 = r0
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            com.braze.BrazeUser$e0 r5 = new com.braze.BrazeUser$e0
            r5.<init>(r10)
            r6 = 4
            r2 = r9
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.mo15739o(java.lang.String):void");
    }

    /* renamed from: p */
    public final void mo15740p(NotificationSubscriptionType notificationSubscriptionType) {
        C19383o.m32797g(notificationSubscriptionType, "emailNotificationSubscriptionType");
        try {
            this.f11457a.mo13920a(notificationSubscriptionType);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C5339f0(notificationSubscriptionType), 4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b A[Catch:{ Exception -> 0x0021 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000e A[Catch:{ Exception -> 0x0021 }] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15741q(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != 0) goto L_0x0004
            goto L_0x000b
        L_0x0004:
            boolean r1 = kotlin.text.C19457k.m33020X0(r8)     // Catch:{ Exception -> 0x0021 }
            if (r1 != r0) goto L_0x000b
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 == 0) goto L_0x001b
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x0021 }
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W     // Catch:{ Exception -> 0x0021 }
            r4 = 0
            com.braze.BrazeUser$h0 r5 = com.braze.BrazeUser.C5343h0.f11486b     // Catch:{ Exception -> 0x0021 }
            r6 = 6
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0021 }
            return
        L_0x001b:
            bo.app.q6 r0 = r7.f11457a     // Catch:{ Exception -> 0x0021 }
            r0.mo13932d(r8)     // Catch:{ Exception -> 0x0021 }
            return
        L_0x0021:
            r0 = move-exception
            r4 = r0
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            com.braze.BrazeUser$i0 r5 = new com.braze.BrazeUser$i0
            r5.<init>(r8)
            r6 = 4
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.mo15741q(java.lang.String):void");
    }

    /* renamed from: r */
    public final void mo15742r(Gender gender) {
        C19383o.m32797g(gender, "gender");
        try {
            this.f11457a.mo13919a(gender);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C5347j0(gender), 4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b A[Catch:{ Exception -> 0x0021 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000e A[Catch:{ Exception -> 0x0021 }] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15743s(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != 0) goto L_0x0004
            goto L_0x000b
        L_0x0004:
            boolean r1 = kotlin.text.C19457k.m33020X0(r8)     // Catch:{ Exception -> 0x0021 }
            if (r1 != r0) goto L_0x000b
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 == 0) goto L_0x001b
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x0021 }
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W     // Catch:{ Exception -> 0x0021 }
            r4 = 0
            com.braze.BrazeUser$k0 r5 = com.braze.BrazeUser.C5349k0.f11492b     // Catch:{ Exception -> 0x0021 }
            r6 = 6
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0021 }
            return
        L_0x001b:
            bo.app.q6 r0 = r7.f11457a     // Catch:{ Exception -> 0x0021 }
            r0.mo13933e(r8)     // Catch:{ Exception -> 0x0021 }
            return
        L_0x0021:
            r0 = move-exception
            r4 = r0
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            com.braze.BrazeUser$l0 r5 = new com.braze.BrazeUser$l0
            r5.<init>(r8)
            r6 = 4
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.mo15743s(java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b A[Catch:{ Exception -> 0x0021 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000e A[Catch:{ Exception -> 0x0021 }] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15744t(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != 0) goto L_0x0004
            goto L_0x000b
        L_0x0004:
            boolean r1 = kotlin.text.C19457k.m33020X0(r8)     // Catch:{ Exception -> 0x0021 }
            if (r1 != r0) goto L_0x000b
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 == 0) goto L_0x001b
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x0021 }
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W     // Catch:{ Exception -> 0x0021 }
            r4 = 0
            com.braze.BrazeUser$m0 r5 = com.braze.BrazeUser.C5353m0.f11496b     // Catch:{ Exception -> 0x0021 }
            r6 = 6
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0021 }
            return
        L_0x001b:
            bo.app.q6 r0 = r7.f11457a     // Catch:{ Exception -> 0x0021 }
            r0.mo13935f(r8)     // Catch:{ Exception -> 0x0021 }
            return
        L_0x0021:
            r0 = move-exception
            r4 = r0
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            com.braze.BrazeUser$n0 r5 = new com.braze.BrazeUser$n0
            r5.<init>(r8)
            r6 = 4
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.mo15744t(java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b A[Catch:{ Exception -> 0x0021 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000e A[Catch:{ Exception -> 0x0021 }] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15745u(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != 0) goto L_0x0004
            goto L_0x000b
        L_0x0004:
            boolean r1 = kotlin.text.C19457k.m33020X0(r8)     // Catch:{ Exception -> 0x0021 }
            if (r1 != r0) goto L_0x000b
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 == 0) goto L_0x001b
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x0021 }
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W     // Catch:{ Exception -> 0x0021 }
            r4 = 0
            com.braze.BrazeUser$p0 r5 = com.braze.BrazeUser.C5359p0.f11502b     // Catch:{ Exception -> 0x0021 }
            r6 = 6
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0021 }
            return
        L_0x001b:
            bo.app.q6 r0 = r7.f11457a     // Catch:{ Exception -> 0x0021 }
            r0.mo13937g(r8)     // Catch:{ Exception -> 0x0021 }
            return
        L_0x0021:
            r0 = move-exception
            r4 = r0
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            com.braze.BrazeUser$q0 r5 = new com.braze.BrazeUser$q0
            r5.<init>(r8)
            r6 = 4
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.mo15745u(java.lang.String):void");
    }

    /* renamed from: v */
    public final void mo15746v(String str, double d, double d2) {
        String str2 = str;
        C19383o.m32797g(str2, "key");
        try {
            if (!C3596c0.m8499a(str2, this.f11461e.mo13080b())) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5363r0.f11507b, 6);
            } else if (!ValidationUtils.m11347b(d, d2)) {
                try {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C5365s0(d, d2), 6);
                } catch (Exception e) {
                    e = e;
                    double d3 = d;
                    double d4 = d2;
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C5367t0(str, d, d2), 4);
                }
            } else {
                double d5 = d;
                double d6 = d2;
                C4208t1 a = C3787j.f8608h.mo13463a(ValidationUtils.m11346a(str), d, d2);
                if (a != null) {
                    this.f11458b.mo13838a(a);
                }
            }
        } catch (Exception e2) {
            e = e2;
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C5367t0(str, d, d2), 4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d A[Catch:{ Exception -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010 A[Catch:{ Exception -> 0x0077 }] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15747w(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            if (r10 != 0) goto L_0x0005
            goto L_0x000d
        L_0x0005:
            boolean r2 = kotlin.text.C19457k.m33020X0(r10)     // Catch:{ Exception -> 0x0077 }
            if (r2 != r0) goto L_0x000d
            r2 = r0
            goto L_0x000e
        L_0x000d:
            r2 = r1
        L_0x000e:
            if (r2 == 0) goto L_0x001d
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x0077 }
            com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.W     // Catch:{ Exception -> 0x0077 }
            r6 = 0
            com.braze.BrazeUser$u0 r7 = com.braze.BrazeUser.C5369u0.f11516b     // Catch:{ Exception -> 0x0077 }
            r8 = 6
            r4 = r9
            com.braze.support.BrazeLogger.m11282d(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0077 }
            return
        L_0x001d:
            if (r10 != 0) goto L_0x0021
            r0 = 0
            goto L_0x0056
        L_0x0021:
            int r2 = r10.length()     // Catch:{ Exception -> 0x0077 }
            int r2 = r2 - r0
            r3 = r1
            r4 = r3
        L_0x0028:
            if (r3 > r2) goto L_0x004d
            if (r4 != 0) goto L_0x002e
            r5 = r3
            goto L_0x002f
        L_0x002e:
            r5 = r2
        L_0x002f:
            char r5 = r10.charAt(r5)     // Catch:{ Exception -> 0x0077 }
            r6 = 32
            int r5 = kotlin.jvm.internal.C19383o.m32799i(r5, r6)     // Catch:{ Exception -> 0x0077 }
            if (r5 > 0) goto L_0x003d
            r5 = r0
            goto L_0x003e
        L_0x003d:
            r5 = r1
        L_0x003e:
            if (r4 != 0) goto L_0x0047
            if (r5 != 0) goto L_0x0044
            r4 = r0
            goto L_0x0028
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x0047:
            if (r5 != 0) goto L_0x004a
            goto L_0x004d
        L_0x004a:
            int r2 = r2 + -1
            goto L_0x0028
        L_0x004d:
            int r2 = r2 + r0
            java.lang.CharSequence r0 = r10.subSequence(r3, r2)     // Catch:{ Exception -> 0x0077 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0077 }
        L_0x0056:
            if (r0 == 0) goto L_0x0071
            kotlin.text.Regex r1 = com.braze.support.ValidationUtils.f11981d     // Catch:{ Exception -> 0x0077 }
            boolean r1 = r1.matches(r0)     // Catch:{ Exception -> 0x0077 }
            if (r1 == 0) goto L_0x0061
            goto L_0x0071
        L_0x0061:
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x0077 }
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.W     // Catch:{ Exception -> 0x0077 }
            r5 = 0
            com.braze.BrazeUser$v0 r6 = new com.braze.BrazeUser$v0     // Catch:{ Exception -> 0x0077 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0077 }
            r7 = 6
            r3 = r9
            com.braze.support.BrazeLogger.m11282d(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0077 }
            return
        L_0x0071:
            bo.app.q6 r1 = r9.f11457a     // Catch:{ Exception -> 0x0077 }
            r1.mo13939h(r0)     // Catch:{ Exception -> 0x0077 }
            return
        L_0x0077:
            r0 = move-exception
            r4 = r0
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            com.braze.BrazeUser$w0 r5 = new com.braze.BrazeUser$w0
            r5.<init>(r10)
            r6 = 4
            r2 = r9
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.mo15747w(java.lang.String):void");
    }

    /* renamed from: x */
    public final void mo15748x(NotificationSubscriptionType notificationSubscriptionType) {
        C19383o.m32797g(notificationSubscriptionType, "pushNotificationSubscriptionType");
        try {
            this.f11457a.mo13928b(notificationSubscriptionType);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C5375x0(notificationSubscriptionType), 4);
        }
    }
}
