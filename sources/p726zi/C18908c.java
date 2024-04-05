package p726zi;

import android.content.res.Resources;
import android.text.TextUtils;
import com.etsy.android.R;
import com.google.android.exoplayer2.Format;
import java.util.Locale;
import p513bj.C14049b0;
import p513bj.C14065m;

/* renamed from: zi.c */
public final class C18908c implements C18929o {

    /* renamed from: a */
    public final Resources f42125a;

    public C18908c(Resources resources) {
        resources.getClass();
        this.f42125a = resources;
    }

    /* renamed from: a */
    public final String mo70334a(Format format) {
        String str;
        String str2;
        int h = C14065m.m21678h(format.sampleMimeType);
        if (h == -1) {
            String str3 = format.codecs;
            String str4 = null;
            if (str3 != null) {
                String[] H = C14049b0.m21627H(str3);
                int length = H.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        str2 = C14065m.m21674d(H[i]);
                        if (str2 != null && C14065m.m21681k(str2)) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            str2 = null;
            if (str2 == null) {
                String str5 = format.codecs;
                if (str5 != null) {
                    String[] H2 = C14049b0.m21627H(str5);
                    int length2 = H2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            String d = C14065m.m21674d(H2[i2]);
                            if (d != null && C14065m.m21679i(d)) {
                                str4 = d;
                                break;
                            }
                            i2++;
                        } else {
                            break;
                        }
                    }
                }
                if (str4 == null) {
                    if (format.width == -1 && format.height == -1) {
                        if (format.channelCount == -1 && format.sampleRate == -1) {
                            h = -1;
                        }
                    }
                }
                h = 1;
            }
            h = 2;
        }
        String str6 = "";
        if (h == 2) {
            String[] strArr = new String[3];
            strArr[0] = mo70337d(format);
            int i3 = format.width;
            int i4 = format.height;
            if (!(i3 == -1 || i4 == -1)) {
                str6 = this.f42125a.getString(R.string.exo_track_resolution, new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)});
            }
            strArr[1] = str6;
            strArr[2] = mo70335b(format);
            str = mo70338e(strArr);
        } else if (h == 1) {
            String[] strArr2 = new String[3];
            strArr2[0] = mo70336c(format);
            int i5 = format.channelCount;
            if (i5 != -1 && i5 >= 1) {
                str6 = i5 != 1 ? i5 != 2 ? (i5 == 6 || i5 == 7) ? this.f42125a.getString(R.string.exo_track_surround_5_point_1) : i5 != 8 ? this.f42125a.getString(R.string.exo_track_surround) : this.f42125a.getString(R.string.exo_track_surround_7_point_1) : this.f42125a.getString(R.string.exo_track_stereo) : this.f42125a.getString(R.string.exo_track_mono);
            }
            strArr2[1] = str6;
            strArr2[2] = mo70335b(format);
            str = mo70338e(strArr2);
        } else {
            str = mo70336c(format);
        }
        return str.length() == 0 ? this.f42125a.getString(R.string.exo_track_unknown) : str;
    }

    /* renamed from: b */
    public final String mo70335b(Format format) {
        int i = format.bitrate;
        if (i == -1) {
            return "";
        }
        return this.f42125a.getString(R.string.exo_track_bitrate, new Object[]{Float.valueOf(((float) i) / 1000000.0f)});
    }

    /* renamed from: c */
    public final String mo70336c(Format format) {
        String str;
        String[] strArr = new String[2];
        String str2 = format.language;
        String str3 = "";
        if (TextUtils.isEmpty(str2) || "und".equals(str2)) {
            str = str3;
        } else {
            str = (C14049b0.f30913a >= 21 ? Locale.forLanguageTag(str2) : new Locale(str2)).getDisplayName();
        }
        strArr[0] = str;
        strArr[1] = mo70337d(format);
        String e = mo70338e(strArr);
        if (!TextUtils.isEmpty(e)) {
            return e;
        }
        if (!TextUtils.isEmpty(format.label)) {
            str3 = format.label;
        }
        return str3;
    }

    /* renamed from: d */
    public final String mo70337d(Format format) {
        String string = (format.roleFlags & 2) != 0 ? this.f42125a.getString(R.string.exo_track_role_alternate) : "";
        if ((format.roleFlags & 4) != 0) {
            string = mo70338e(string, this.f42125a.getString(R.string.exo_track_role_supplementary));
        }
        if ((format.roleFlags & 8) != 0) {
            string = mo70338e(string, this.f42125a.getString(R.string.exo_track_role_commentary));
        }
        if ((format.roleFlags & 1088) == 0) {
            return string;
        }
        return mo70338e(string, this.f42125a.getString(R.string.exo_track_role_closed_captions));
    }

    /* renamed from: e */
    public final String mo70338e(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = this.f42125a.getString(R.string.exo_item_list, new Object[]{str, str2});
                }
            }
        }
        return str;
    }
}
