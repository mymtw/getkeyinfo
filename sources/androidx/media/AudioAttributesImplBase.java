package androidx.media;

import java.util.Arrays;
import p003a2.C0015b;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f6552a = 0;

    /* renamed from: b */
    public int f6553b = 0;

    /* renamed from: c */
    public int f6554c = 0;

    /* renamed from: d */
    public int f6555d = -1;

    /* renamed from: a */
    public final int mo10858a() {
        int i = this.f6555d;
        return i != -1 ? i : AudioAttributesCompat.m6828b(this.f6554c, this.f6552a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f6553b != audioAttributesImplBase.f6553b) {
            return false;
        }
        int i = this.f6554c;
        int i2 = audioAttributesImplBase.f6554c;
        int a = audioAttributesImplBase.mo10858a();
        if (a == 6) {
            i2 |= 4;
        } else if (a == 7) {
            i2 |= 1;
        }
        return i == (i2 & 273) && this.f6552a == audioAttributesImplBase.f6552a && this.f6555d == audioAttributesImplBase.f6555d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6553b), Integer.valueOf(this.f6554c), Integer.valueOf(this.f6552a), Integer.valueOf(this.f6555d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f6555d != -1) {
            sb.append(" stream=");
            sb.append(this.f6555d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f6552a;
        int i2 = AudioAttributesCompat.f6548b;
        switch (i) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
            default:
                str = C0015b.m88g("unknown usage ", i);
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f6553b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f6554c).toUpperCase());
        return sb.toString();
    }
}
