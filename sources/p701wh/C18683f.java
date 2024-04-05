package p701wh;

import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import p003a2.C0023f;
import p513bj.C14077r;

/* renamed from: wh.f */
public final class C18683f {

    /* renamed from: a */
    public static final String[] f41361a = {"Blues", "Classic Rock", ResponseConstants.Includes.COUNTRY, "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: a */
    public static CommentFrame m31527a(int i, C14077r rVar) {
        int c = rVar.mo46912c();
        if (rVar.mo46912c() == 1684108385) {
            rVar.mo46909A(8);
            String l = rVar.mo46921l(c - 16);
            return new CommentFrame("und", l, l);
        }
        String valueOf = String.valueOf(C18670a.m31498a(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    /* renamed from: b */
    public static ApicFrame m31528b(C14077r rVar) {
        int c = rVar.mo46912c();
        if (rVar.mo46912c() == 1684108385) {
            int c2 = rVar.mo46912c() & 16777215;
            String str = c2 == 13 ? "image/jpeg" : c2 == 14 ? "image/png" : null;
            if (str == null) {
                C0023f.m112m(41, "Unrecognized cover art flags: ", c2, "MetadataUtil");
                return null;
            }
            rVar.mo46909A(4);
            int i = c - 16;
            byte[] bArr = new byte[i];
            rVar.mo46911b(0, i, bArr);
            return new ApicFrame(str, (String) null, 3, bArr);
        }
        Log.w("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    /* renamed from: c */
    public static TextInformationFrame m31529c(int i, C14077r rVar, String str) {
        int c = rVar.mo46912c();
        if (rVar.mo46912c() == 1684108385 && c >= 22) {
            rVar.mo46909A(10);
            int u = rVar.mo46930u();
            if (u > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(u);
                String sb2 = sb.toString();
                int u2 = rVar.mo46930u();
                if (u2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(u2);
                    sb2 = sb3.toString();
                }
                return new TextInformationFrame(str, (String) null, sb2);
            }
        }
        String valueOf2 = String.valueOf(C18670a.m31498a(i));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    /* renamed from: d */
    public static TextInformationFrame m31530d(int i, C14077r rVar, String str) {
        int c = rVar.mo46912c();
        if (rVar.mo46912c() == 1684108385) {
            rVar.mo46909A(8);
            return new TextInformationFrame(str, (String) null, rVar.mo46921l(c - 16));
        }
        String valueOf = String.valueOf(C18670a.m31498a(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    /* renamed from: e */
    public static Id3Frame m31531e(int i, String str, C14077r rVar, boolean z, boolean z2) {
        int f = m31532f(rVar);
        if (z2) {
            f = Math.min(1, f);
        }
        if (f >= 0) {
            return z ? new TextInformationFrame(str, (String) null, Integer.toString(f)) : new CommentFrame("und", str, Integer.toString(f));
        }
        String valueOf = String.valueOf(C18670a.m31498a(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    /* renamed from: f */
    public static int m31532f(C14077r rVar) {
        rVar.mo46909A(4);
        if (rVar.mo46912c() == 1684108385) {
            rVar.mo46909A(8);
            return rVar.mo46925p();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
