package com.google.android.gms.common.server.response;

import android.support.p013v4.media.C0072d;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.JsonFactory;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import p003a2.C0023f;

@ShowFirstParty
@KeepForSdk
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaf = {'u', 'l', 'l'};
    private static final char[] zag = {'r', 'u', 'e'};
    private static final char[] zah = {'r', 'u', 'e', JsonFactory.DEFAULT_QUOTE_CHAR};
    private static final char[] zai = {'a', 'l', 's', 'e'};
    private static final char[] zaj = {'a', 'l', 's', 'e', JsonFactory.DEFAULT_QUOTE_CHAR};
    private static final char[] zak = {10};
    private static final zaa<Integer> zam = new zab();
    private static final zaa<Long> zan = new zaa();
    private static final zaa<Float> zao = new zad();
    private static final zaa<Double> zap = new zac();
    private static final zaa<Boolean> zaq = new zaf();
    private static final zaa<String> zar = new zae();
    private static final zaa<BigInteger> zas = new zah();
    private static final zaa<BigDecimal> zat = new zag();
    private final char[] zaa = new char[1];
    private final char[] zab = new char[32];
    private final char[] zac = new char[RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE];
    private final StringBuilder zad = new StringBuilder(32);
    private final StringBuilder zae = new StringBuilder(RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE);
    private final Stack<Integer> zal = new Stack<>();

    @ShowFirstParty
    @KeepForSdk
    public static class ParseException extends Exception {
        public ParseException(@RecentlyNonNull String str) {
            super(str);
        }

        public ParseException(@RecentlyNonNull String str, @RecentlyNonNull Throwable th) {
            super(str, th);
        }

        public ParseException(@RecentlyNonNull Throwable th) {
            super(th);
        }
    }

    public interface zaa<O> {
        O zaa(FastParser fastParser, BufferedReader bufferedReader) throws ParseException, IOException;
    }

    private final boolean zaa(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) throws ParseException, IOException {
        HashMap hashMap;
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        String zaa2 = zaa(bufferedReader);
        if (zaa2 == null) {
            zaa(1);
            return false;
        }
        while (zaa2 != null) {
            FastJsonResponse.Field field = fieldMappings.get(zaa2);
            if (field == null) {
                zaa2 = zab(bufferedReader);
            } else {
                int i = 4;
                this.zal.push(4);
                switch (field.zaa) {
                    case 0:
                        if (!field.zab) {
                            fastJsonResponse.zaa(field, zad(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.zaa(field, zaa(bufferedReader, zam));
                            break;
                        }
                    case 1:
                        if (!field.zab) {
                            fastJsonResponse.zaa(field, zaf(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.zab(field, zaa(bufferedReader, zas));
                            break;
                        }
                    case 2:
                        if (!field.zab) {
                            fastJsonResponse.zaa(field, zae(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.zac(field, zaa(bufferedReader, zan));
                            break;
                        }
                    case 3:
                        if (!field.zab) {
                            fastJsonResponse.zaa(field, zag(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.zad(field, zaa(bufferedReader, zao));
                            break;
                        }
                    case 4:
                        if (!field.zab) {
                            fastJsonResponse.zaa(field, zah(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.zae(field, zaa(bufferedReader, zap));
                            break;
                        }
                    case 5:
                        if (!field.zab) {
                            fastJsonResponse.zaa(field, zai(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.zaf(field, zaa(bufferedReader, zat));
                            break;
                        }
                    case 6:
                        if (!field.zab) {
                            fastJsonResponse.zaa(field, zaa(bufferedReader, false));
                            break;
                        } else {
                            fastJsonResponse.zag(field, zaa(bufferedReader, zaq));
                            break;
                        }
                    case 7:
                        if (!field.zab) {
                            fastJsonResponse.zaa(field, zac(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.zah(field, zaa(bufferedReader, zar));
                            break;
                        }
                    case 8:
                        fastJsonResponse.zaa(field, Base64Utils.decode(zaa(bufferedReader, this.zac, this.zae, zak)));
                        break;
                    case 9:
                        fastJsonResponse.zaa(field, Base64Utils.decodeUrlSafe(zaa(bufferedReader, this.zac, this.zae, zak)));
                        break;
                    case 10:
                        char zaj2 = zaj(bufferedReader);
                        if (zaj2 == 'n') {
                            zab(bufferedReader, zaf);
                            hashMap = null;
                        } else if (zaj2 == '{') {
                            this.zal.push(1);
                            hashMap = new HashMap();
                            while (true) {
                                char zaj3 = zaj(bufferedReader);
                                if (zaj3 == 0) {
                                    throw new ParseException("Unexpected EOF");
                                } else if (zaj3 == '\"') {
                                    String zab2 = zab(bufferedReader, this.zab, this.zad, (char[]) null);
                                    if (zaj(bufferedReader) != ':') {
                                        String valueOf = String.valueOf(zab2);
                                        throw new ParseException(valueOf.length() != 0 ? "No map value found for key ".concat(valueOf) : new String("No map value found for key "));
                                    } else if (zaj(bufferedReader) != '\"') {
                                        String valueOf2 = String.valueOf(zab2);
                                        throw new ParseException(valueOf2.length() != 0 ? "Expected String value for key ".concat(valueOf2) : new String("Expected String value for key "));
                                    } else {
                                        hashMap.put(zab2, zab(bufferedReader, this.zab, this.zad, (char[]) null));
                                        char zaj4 = zaj(bufferedReader);
                                        if (zaj4 != ',') {
                                            if (zaj4 == '}') {
                                                zaa(1);
                                            } else {
                                                StringBuilder sb = new StringBuilder(48);
                                                sb.append("Unexpected character while parsing string map: ");
                                                sb.append(zaj4);
                                                throw new ParseException(sb.toString());
                                            }
                                        }
                                    }
                                } else if (zaj3 == '}') {
                                    zaa(1);
                                }
                            }
                        } else {
                            throw new ParseException("Expected start of a map object");
                        }
                        fastJsonResponse.zaa(field, (Map<String, String>) hashMap);
                        break;
                    case 11:
                        if (field.zab) {
                            char zaj5 = zaj(bufferedReader);
                            if (zaj5 == 'n') {
                                zab(bufferedReader, zaf);
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, (ArrayList) null);
                                break;
                            } else {
                                this.zal.push(5);
                                if (zaj5 == '[') {
                                    fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, zaa(bufferedReader, (FastJsonResponse.Field<?, ?>) field));
                                    break;
                                } else {
                                    throw new ParseException("Expected array start");
                                }
                            }
                        } else {
                            char zaj6 = zaj(bufferedReader);
                            if (zaj6 == 'n') {
                                zab(bufferedReader, zaf);
                                fastJsonResponse.addConcreteTypeInternal(field, field.zae, null);
                                break;
                            } else {
                                this.zal.push(1);
                                if (zaj6 == '{') {
                                    try {
                                        FastJsonResponse zac2 = field.zac();
                                        zaa(bufferedReader, zac2);
                                        fastJsonResponse.addConcreteTypeInternal(field, field.zae, zac2);
                                        break;
                                    } catch (InstantiationException e) {
                                        throw new ParseException("Error instantiating inner object", e);
                                    } catch (IllegalAccessException e2) {
                                        throw new ParseException("Error instantiating inner object", e2);
                                    }
                                } else {
                                    throw new ParseException("Expected start of object");
                                }
                            }
                        }
                    default:
                        throw new ParseException(C0072d.m200g(30, "Invalid field type ", field.zaa));
                }
                i = 4;
                zaa(i);
                zaa(2);
                char zaj7 = zaj(bufferedReader);
                if (zaj7 == ',') {
                    zaa2 = zaa(bufferedReader);
                } else if (zaj7 == '}') {
                    zaa2 = null;
                } else {
                    StringBuilder sb2 = new StringBuilder(55);
                    sb2.append("Expected end of object or field separator, but found: ");
                    sb2.append(zaj7);
                    throw new ParseException(sb2.toString());
                }
            }
        }
        zaa(1);
        return true;
    }

    private final String zab(BufferedReader bufferedReader) throws ParseException, IOException {
        BufferedReader bufferedReader2 = bufferedReader;
        bufferedReader2.mark(RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE);
        char zaj2 = zaj(bufferedReader);
        if (zaj2 != '\"') {
            if (zaj2 != ',') {
                int i = 1;
                if (zaj2 == '[') {
                    this.zal.push(5);
                    bufferedReader2.mark(32);
                    if (zaj(bufferedReader) == ']') {
                        zaa(5);
                    } else {
                        bufferedReader.reset();
                        boolean z = false;
                        boolean z2 = false;
                        while (i > 0) {
                            char zaj3 = zaj(bufferedReader);
                            if (zaj3 == 0) {
                                throw new ParseException("Unexpected EOF while parsing array");
                            } else if (!Character.isISOControl(zaj3)) {
                                if (zaj3 == '\"' && !z) {
                                    z2 = !z2;
                                }
                                if (zaj3 == '[' && !z2) {
                                    i++;
                                }
                                if (zaj3 == ']' && !z2) {
                                    i--;
                                }
                                z = (zaj3 != '\\' || !z2) ? false : !z;
                            } else {
                                throw new ParseException("Unexpected control character while reading array");
                            }
                        }
                        zaa(5);
                    }
                } else if (zaj2 != '{') {
                    bufferedReader.reset();
                    zaa(bufferedReader2, this.zac);
                } else {
                    this.zal.push(1);
                    bufferedReader2.mark(32);
                    char zaj4 = zaj(bufferedReader);
                    if (zaj4 == '}') {
                        zaa(1);
                    } else if (zaj4 == '\"') {
                        bufferedReader.reset();
                        zaa(bufferedReader);
                        do {
                        } while (zab(bufferedReader) != null);
                        zaa(1);
                    } else {
                        StringBuilder sb = new StringBuilder(18);
                        sb.append("Unexpected token ");
                        sb.append(zaj4);
                        throw new ParseException(sb.toString());
                    }
                }
            } else {
                throw new ParseException("Missing value");
            }
        } else if (bufferedReader2.read(this.zaa) != -1) {
            char c = this.zaa[0];
            boolean z3 = false;
            do {
                if (c != '\"' || z3) {
                    z3 = c == '\\' ? !z3 : false;
                    if (bufferedReader2.read(this.zaa) != -1) {
                        c = this.zaa[0];
                    } else {
                        throw new ParseException("Unexpected EOF while parsing string");
                    }
                }
            } while (!Character.isISOControl(c));
            throw new ParseException("Unexpected control character while reading string");
        } else {
            throw new ParseException("Unexpected EOF while parsing string");
        }
        char zaj5 = zaj(bufferedReader);
        if (zaj5 == ',') {
            zaa(2);
            return zaa(bufferedReader);
        } else if (zaj5 == '}') {
            zaa(2);
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder(18);
            sb2.append("Unexpected token ");
            sb2.append(zaj5);
            throw new ParseException(sb2.toString());
        }
    }

    /* access modifiers changed from: private */
    public final String zac(BufferedReader bufferedReader) throws ParseException, IOException {
        return zaa(bufferedReader, this.zab, this.zad, (char[]) null);
    }

    /* access modifiers changed from: private */
    public final int zad(BufferedReader bufferedReader) throws ParseException, IOException {
        int i;
        int i2;
        int zaa2 = zaa(bufferedReader, this.zac);
        int i3 = 0;
        if (zaa2 == 0) {
            return 0;
        }
        char[] cArr = this.zac;
        if (zaa2 > 0) {
            if (cArr[0] == '-') {
                i2 = Integer.MIN_VALUE;
                i = 1;
            } else {
                i2 = -2147483647;
                i = 0;
            }
            int i4 = i;
            if (i < zaa2) {
                int i5 = i + 1;
                int digit = Character.digit(cArr[i], 10);
                if (digit >= 0) {
                    int i6 = -digit;
                    i = i5;
                    i3 = i6;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            while (i < zaa2) {
                int i7 = i + 1;
                int digit2 = Character.digit(cArr[i], 10);
                if (digit2 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                } else if (i3 >= -214748364) {
                    int i8 = i3 * 10;
                    if (i8 >= i2 + digit2) {
                        i3 = i8 - digit2;
                        i = i7;
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Number too large");
                }
            }
            if (i4 == 0) {
                return -i3;
            }
            if (i > 1) {
                return i3;
            }
            throw new ParseException("No digits to parse");
        }
        throw new ParseException("No number to parse");
    }

    /* access modifiers changed from: private */
    public final long zae(BufferedReader bufferedReader) throws ParseException, IOException {
        long j;
        int zaa2 = zaa(bufferedReader, this.zac);
        long j2 = 0;
        if (zaa2 == 0) {
            return 0;
        }
        char[] cArr = this.zac;
        if (zaa2 > 0) {
            int i = 0;
            if (cArr[0] == '-') {
                j = Long.MIN_VALUE;
                i = 1;
            } else {
                j = -9223372036854775807L;
            }
            int i2 = i;
            int i3 = 10;
            if (i < zaa2) {
                int i4 = i + 1;
                int digit = Character.digit(cArr[i], 10);
                if (digit >= 0) {
                    i = i4;
                    j2 = (long) (-digit);
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            while (i < zaa2) {
                int i5 = i + 1;
                int digit2 = Character.digit(cArr[i], i3);
                if (digit2 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                } else if (j2 >= -922337203685477580L) {
                    long j3 = j2 * 10;
                    int i6 = i5;
                    long j4 = (long) digit2;
                    if (j3 >= j + j4) {
                        j2 = j3 - j4;
                        i = i6;
                        i3 = 10;
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Number too large");
                }
            }
            if (i2 == 0) {
                return -j2;
            }
            if (i > 1) {
                return j2;
            }
            throw new ParseException("No digits to parse");
        }
        throw new ParseException("No number to parse");
    }

    /* access modifiers changed from: private */
    public final BigInteger zaf(BufferedReader bufferedReader) throws ParseException, IOException {
        int zaa2 = zaa(bufferedReader, this.zac);
        if (zaa2 == 0) {
            return null;
        }
        return new BigInteger(new String(this.zac, 0, zaa2));
    }

    /* access modifiers changed from: private */
    public final float zag(BufferedReader bufferedReader) throws ParseException, IOException {
        int zaa2 = zaa(bufferedReader, this.zac);
        if (zaa2 == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.zac, 0, zaa2));
    }

    /* access modifiers changed from: private */
    public final double zah(BufferedReader bufferedReader) throws ParseException, IOException {
        int zaa2 = zaa(bufferedReader, this.zac);
        return zaa2 == 0 ? ShadowDrawableWrapper.COS_45 : Double.parseDouble(new String(this.zac, 0, zaa2));
    }

    /* access modifiers changed from: private */
    public final BigDecimal zai(BufferedReader bufferedReader) throws ParseException, IOException {
        int zaa2 = zaa(bufferedReader, this.zac);
        if (zaa2 == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zac, 0, zaa2));
    }

    private final char zaj(BufferedReader bufferedReader) throws ParseException, IOException {
        if (bufferedReader.read(this.zaa) == -1) {
            return 0;
        }
        while (Character.isWhitespace(this.zaa[0])) {
            if (bufferedReader.read(this.zaa) == -1) {
                return 0;
            }
        }
        return this.zaa[0];
    }

    @KeepForSdk
    public void parse(@RecentlyNonNull InputStream inputStream, @RecentlyNonNull T t) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE);
        try {
            this.zal.push(0);
            char zaj2 = zaj(bufferedReader);
            if (zaj2 != 0) {
                if (zaj2 == '[') {
                    this.zal.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t.getFieldMappings();
                    if (fieldMappings.size() == 1) {
                        FastJsonResponse.Field field = (FastJsonResponse.Field) fieldMappings.entrySet().iterator().next().getValue();
                        t.addConcreteTypeArrayInternal(field, field.zae, zaa(bufferedReader, (FastJsonResponse.Field<?, ?>) field));
                    } else {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                } else if (zaj2 == '{') {
                    this.zal.push(1);
                    zaa(bufferedReader, (FastJsonResponse) t);
                } else {
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("Unexpected token: ");
                    sb.append(zaj2);
                    throw new ParseException(sb.toString());
                }
                zaa(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                }
            } else {
                throw new ParseException("No data to parse");
            }
        } catch (IOException e) {
            throw new ParseException((Throwable) e);
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0030 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String zab(java.io.BufferedReader r9, char[] r10, java.lang.StringBuilder r11, char[] r12) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            r0 = 0
            r11.setLength(r0)
            int r1 = r10.length
            r9.mark(r1)
            r1 = r0
            r2 = r1
        L_0x000a:
            int r3 = r9.read(r10)
            r4 = -1
            if (r3 == r4) goto L_0x006d
            r4 = r0
        L_0x0012:
            if (r4 >= r3) goto L_0x0065
            char r5 = r10[r4]
            boolean r6 = java.lang.Character.isISOControl(r5)
            r7 = 1
            if (r6 == 0) goto L_0x0038
            if (r12 == 0) goto L_0x002c
            r6 = r0
        L_0x0020:
            int r8 = r12.length
            if (r6 >= r8) goto L_0x002c
            char r8 = r12[r6]
            if (r8 != r5) goto L_0x0029
            r6 = r7
            goto L_0x002d
        L_0x0029:
            int r6 = r6 + 1
            goto L_0x0020
        L_0x002c:
            r6 = r0
        L_0x002d:
            if (r6 == 0) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            com.google.android.gms.common.server.response.FastParser$ParseException r9 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r10 = "Unexpected control character while reading string"
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x0038:
            r6 = 34
            if (r5 != r6) goto L_0x0059
            if (r1 != 0) goto L_0x0059
            r11.append(r10, r0, r4)
            r9.reset()
            int r4 = r4 + r7
            long r0 = (long) r4
            r9.skip(r0)
            if (r2 == 0) goto L_0x0054
            java.lang.String r9 = r11.toString()
            java.lang.String r9 = com.google.android.gms.common.util.JsonUtils.unescapeString(r9)
            return r9
        L_0x0054:
            java.lang.String r9 = r11.toString()
            return r9
        L_0x0059:
            r6 = 92
            if (r5 != r6) goto L_0x0061
            r1 = r1 ^ 1
            r2 = r7
            goto L_0x0062
        L_0x0061:
            r1 = r0
        L_0x0062:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0065:
            r11.append(r10, r0, r3)
            int r3 = r10.length
            r9.mark(r3)
            goto L_0x000a
        L_0x006d:
            com.google.android.gms.common.server.response.FastParser$ParseException r9 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r10 = "Unexpected EOF while parsing string"
            r9.<init>((java.lang.String) r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zab(java.io.BufferedReader, char[], java.lang.StringBuilder, char[]):java.lang.String");
    }

    private final void zab(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i = 0;
        while (i < cArr.length) {
            int read = bufferedReader.read(this.zab, 0, cArr.length - i);
            if (read != -1) {
                int i2 = 0;
                while (i2 < read) {
                    if (cArr[i2 + i] == this.zab[i2]) {
                        i2++;
                    } else {
                        throw new ParseException("Unexpected character");
                    }
                }
                i += read;
            } else {
                throw new ParseException("Unexpected EOF");
            }
        }
    }

    private final String zaa(BufferedReader bufferedReader) throws ParseException, IOException {
        this.zal.push(2);
        char zaj2 = zaj(bufferedReader);
        if (zaj2 == '\"') {
            this.zal.push(3);
            String zab2 = zab(bufferedReader, this.zab, this.zad, (char[]) null);
            zaa(3);
            if (zaj(bufferedReader) == ':') {
                return zab2;
            }
            throw new ParseException("Expected key/value separator");
        } else if (zaj2 == ']') {
            zaa(2);
            zaa(1);
            zaa(5);
            return null;
        } else if (zaj2 == '}') {
            zaa(2);
            return null;
        } else {
            StringBuilder sb = new StringBuilder(19);
            sb.append("Unexpected token: ");
            sb.append(zaj2);
            throw new ParseException(sb.toString());
        }
    }

    private final <O> ArrayList<O> zaa(BufferedReader bufferedReader, zaa<O> zaa2) throws ParseException, IOException {
        char zaj2 = zaj(bufferedReader);
        if (zaj2 == 'n') {
            zab(bufferedReader, zaf);
            return null;
        } else if (zaj2 == '[') {
            this.zal.push(5);
            ArrayList<O> arrayList = new ArrayList<>();
            while (true) {
                bufferedReader.mark(RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE);
                char zaj3 = zaj(bufferedReader);
                if (zaj3 == 0) {
                    throw new ParseException("Unexpected EOF");
                } else if (zaj3 != ',') {
                    if (zaj3 != ']') {
                        bufferedReader.reset();
                        arrayList.add(zaa2.zaa(this, bufferedReader));
                    } else {
                        zaa(5);
                        return arrayList;
                    }
                }
            }
        } else {
            throw new ParseException("Expected start of array");
        }
    }

    private final String zaa(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) throws ParseException, IOException {
        char zaj2 = zaj(bufferedReader);
        if (zaj2 == '\"') {
            return zab(bufferedReader, cArr, sb, cArr2);
        }
        if (zaj2 == 'n') {
            zab(bufferedReader, zaf);
            return null;
        }
        throw new ParseException("Expected string");
    }

    /* access modifiers changed from: private */
    public final boolean zaa(BufferedReader bufferedReader, boolean z) throws ParseException, IOException {
        while (true) {
            char zaj2 = zaj(bufferedReader);
            if (zaj2 != '\"') {
                if (zaj2 == 'f') {
                    zab(bufferedReader, z ? zaj : zai);
                    return false;
                } else if (zaj2 == 'n') {
                    zab(bufferedReader, zaf);
                    return false;
                } else if (zaj2 == 't') {
                    zab(bufferedReader, z ? zah : zag);
                    return true;
                } else {
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("Unexpected token: ");
                    sb.append(zaj2);
                    throw new ParseException(sb.toString());
                }
            } else if (!z) {
                z = true;
            } else {
                throw new ParseException("No boolean value found in string");
            }
        }
    }

    private final <T extends FastJsonResponse> ArrayList<T> zaa(BufferedReader bufferedReader, FastJsonResponse.Field<?, ?> field) throws ParseException, IOException {
        ArrayList<T> arrayList = new ArrayList<>();
        char zaj2 = zaj(bufferedReader);
        if (zaj2 == ']') {
            zaa(5);
            return arrayList;
        } else if (zaj2 == 'n') {
            zab(bufferedReader, zaf);
            zaa(5);
            return null;
        } else if (zaj2 == '{') {
            this.zal.push(1);
            while (true) {
                try {
                    FastJsonResponse zac2 = field.zac();
                    if (!zaa(bufferedReader, zac2)) {
                        return arrayList;
                    }
                    arrayList.add(zac2);
                    char zaj3 = zaj(bufferedReader);
                    if (zaj3 != ',') {
                        if (zaj3 == ']') {
                            zaa(5);
                            return arrayList;
                        }
                        StringBuilder sb = new StringBuilder(19);
                        sb.append("Unexpected token: ");
                        sb.append(zaj3);
                        throw new ParseException(sb.toString());
                    } else if (zaj(bufferedReader) == '{') {
                        this.zal.push(1);
                    } else {
                        throw new ParseException("Expected start of next object in array");
                    }
                } catch (InstantiationException e) {
                    throw new ParseException("Error instantiating inner object", e);
                } catch (IllegalAccessException e2) {
                    throw new ParseException("Error instantiating inner object", e2);
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append("Unexpected token: ");
            sb2.append(zaj2);
            throw new ParseException(sb2.toString());
        }
    }

    private final int zaa(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i;
        char zaj2 = zaj(bufferedReader);
        if (zaj2 == 0) {
            throw new ParseException("Unexpected EOF");
        } else if (zaj2 == ',') {
            throw new ParseException("Missing value");
        } else if (zaj2 == 'n') {
            zab(bufferedReader, zaf);
            return 0;
        } else {
            bufferedReader.mark(RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE);
            if (zaj2 == '\"') {
                i = 0;
                boolean z = false;
                while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                    char c = cArr[i];
                    if (Character.isISOControl(c)) {
                        throw new ParseException("Unexpected control character while reading string");
                    } else if (c != '\"' || z) {
                        z = c == '\\' ? !z : false;
                        i++;
                    } else {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i + 1));
                        return i;
                    }
                }
            } else {
                cArr[0] = zaj2;
                int i2 = 1;
                while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                    char c2 = cArr[i];
                    if (c2 == '}' || c2 == ',' || Character.isWhitespace(c2) || cArr[i] == ']') {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i - 1));
                        cArr[i] = 0;
                        return i;
                    }
                    i2 = i + 1;
                }
            }
            if (i == cArr.length) {
                throw new ParseException("Absurdly long value");
            }
            throw new ParseException("Unexpected EOF");
        }
    }

    private final void zaa(int i) throws ParseException {
        if (!this.zal.isEmpty()) {
            int intValue = this.zal.pop().intValue();
            if (intValue != i) {
                throw new ParseException(C0023f.m107h(46, "Expected state ", i, " but had ", intValue));
            }
            return;
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append("Expected state ");
        sb.append(i);
        sb.append(" but had empty stack");
        throw new ParseException(sb.toString());
    }
}
