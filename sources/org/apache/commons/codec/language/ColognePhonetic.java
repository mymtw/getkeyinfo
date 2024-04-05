package org.apache.commons.codec.language;

import android.support.p013v4.media.C0072d;
import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

public class ColognePhonetic implements StringEncoder {
    private static final char[][] PREPROCESS_MAP = {new char[]{196, 'A'}, new char[]{220, 'U'}, new char[]{214, 'O'}, new char[]{223, 'S'}};

    public class CologneInputBuffer extends CologneBuffer {
        public CologneInputBuffer(char[] cArr) {
            super(cArr);
        }

        public void addLeft(char c) {
            this.length++;
            this.data[getNextPos()] = c;
        }

        public char[] copyData(int i, int i2) {
            char[] cArr = new char[i2];
            char[] cArr2 = this.data;
            System.arraycopy(cArr2, (cArr2.length - this.length) + i, cArr, 0, i2);
            return cArr;
        }

        public char getNextChar() {
            return this.data[getNextPos()];
        }

        public int getNextPos() {
            return this.data.length - this.length;
        }

        public char removeNext() {
            this.length--;
            return getNextChar();
        }
    }

    public class CologneOutputBuffer extends CologneBuffer {
        public CologneOutputBuffer(int i) {
            super(i);
        }

        public void addRight(char c) {
            char[] cArr = this.data;
            int i = this.length;
            cArr[i] = c;
            this.length = i + 1;
        }

        public char[] copyData(int i, int i2) {
            char[] cArr = new char[i2];
            System.arraycopy(this.data, i, cArr, 0, i2);
            return cArr;
        }
    }

    private static boolean arrayContains(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    private String preprocess(String str) {
        char[] charArray = str.toUpperCase(Locale.GERMAN).toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] > 'Z') {
                char[][] cArr = PREPROCESS_MAP;
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    char[] cArr2 = cArr[i2];
                    if (charArray[i] == cArr2[0]) {
                        charArray[i] = cArr2[1];
                        break;
                    }
                    i2++;
                }
            }
        }
        return new String(charArray);
    }

    public String colognePhonetic(String str) {
        char c;
        if (str == null) {
            return null;
        }
        String preprocess = preprocess(str);
        CologneOutputBuffer cologneOutputBuffer = new CologneOutputBuffer(preprocess.length() * 2);
        CologneInputBuffer cologneInputBuffer = new CologneInputBuffer(preprocess.toCharArray());
        int length = cologneInputBuffer.length();
        char c2 = '/';
        char c3 = '-';
        while (length > 0) {
            char removeNext = cologneInputBuffer.removeNext();
            int length2 = cologneInputBuffer.length();
            char nextChar = length2 > 0 ? cologneInputBuffer.getNextChar() : '-';
            if (arrayContains(new char[]{'A', 'E', 'I', 'J', 'O', 'U', 'Y'}, removeNext)) {
                c = '0';
            } else if (removeNext == 'H' || removeNext < 'A' || removeNext > 'Z') {
                if (c2 == '/') {
                    length = length2;
                } else {
                    c = '-';
                }
            } else if (removeNext == 'B' || (removeNext == 'P' && nextChar != 'H')) {
                c = '1';
            } else if ((removeNext == 'D' || removeNext == 'T') && !arrayContains(new char[]{'S', 'C', 'Z'}, nextChar)) {
                c = '2';
            } else if (arrayContains(new char[]{'W', 'F', 'P', 'V'}, removeNext)) {
                c = '3';
            } else {
                if (!arrayContains(new char[]{'G', 'K', 'Q'}, removeNext)) {
                    if (removeNext != 'X' || arrayContains(new char[]{'C', 'K', 'Q'}, c3)) {
                        if (!(removeNext == 'S' || removeNext == 'Z')) {
                            if (removeNext == 'C') {
                                if (c2 != '/') {
                                }
                            } else if (!arrayContains(new char[]{'T', 'D', 'X'}, removeNext)) {
                                c = removeNext == 'R' ? '7' : removeNext == 'L' ? '5' : (removeNext == 'M' || removeNext == 'N') ? '6' : removeNext;
                            }
                        }
                        c = '8';
                    } else {
                        cologneInputBuffer.addLeft('S');
                        length2++;
                    }
                }
                c = '4';
            }
            if (c != '-' && ((c2 != c && (c != '0' || c2 == '/')) || c < '0' || c > '8')) {
                cologneOutputBuffer.addRight(c);
            }
            c3 = removeNext;
            length = length2;
            c2 = c;
        }
        return cologneOutputBuffer.toString();
    }

    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        StringBuilder h = C0072d.m201h("This method's parameter was expected to be of the type ");
        h.append(String.class.getName());
        h.append(". But actually it was of the type ");
        h.append(obj.getClass().getName());
        h.append(".");
        throw new EncoderException(h.toString());
    }

    public boolean isEncodeEqual(String str, String str2) {
        return colognePhonetic(str).equals(colognePhonetic(str2));
    }

    public abstract class CologneBuffer {
        public final char[] data;
        public int length = 0;

        public CologneBuffer(char[] cArr) {
            this.data = cArr;
            this.length = cArr.length;
        }

        public abstract char[] copyData(int i, int i2);

        public int length() {
            return this.length;
        }

        public String toString() {
            return new String(copyData(0, this.length));
        }

        public CologneBuffer(int i) {
            this.data = new char[i];
            this.length = 0;
        }
    }

    public String encode(String str) {
        return colognePhonetic(str);
    }
}
