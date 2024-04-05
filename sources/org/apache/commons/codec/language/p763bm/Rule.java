package org.apache.commons.codec.language.p763bm;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.appcompat.widget.C0326j;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.apache.commons.codec.language.p763bm.Languages;
import p003a2.C0015b;
import p010a9.C0048b;

/* renamed from: org.apache.commons.codec.language.bm.Rule */
public class Rule {
    public static final String ALL = "ALL";
    public static final RPattern ALL_STRINGS_RMATCHER = new RPattern() {
        public boolean isMatch(CharSequence charSequence) {
            return true;
        }
    };
    private static final String DOUBLE_QUOTE = "\"";
    private static final String HASH_INCLUDE = "#include";
    private static final Map<NameType, Map<RuleType, Map<String, List<Rule>>>> RULES = new EnumMap(NameType.class);
    private final RPattern lContext;
    private final String pattern;
    private final PhonemeExpr phoneme;
    private final RPattern rContext;

    /* renamed from: org.apache.commons.codec.language.bm.Rule$Phoneme */
    public static final class Phoneme implements PhonemeExpr {
        public static final Comparator<Phoneme> COMPARATOR = new Comparator<Phoneme>() {
            public int compare(Phoneme phoneme, Phoneme phoneme2) {
                for (int i = 0; i < phoneme.phonemeText.length(); i++) {
                    if (i >= phoneme2.phonemeText.length()) {
                        return 1;
                    }
                    int charAt = phoneme.phonemeText.charAt(i) - phoneme2.phonemeText.charAt(i);
                    if (charAt != 0) {
                        return charAt;
                    }
                }
                if (phoneme.phonemeText.length() < phoneme2.phonemeText.length()) {
                    return -1;
                }
                return 0;
            }
        };
        private final Languages.LanguageSet languages;
        /* access modifiers changed from: private */
        public final CharSequence phonemeText;

        public Phoneme(CharSequence charSequence, Languages.LanguageSet languageSet) {
            this.phonemeText = charSequence;
            this.languages = languageSet;
        }

        public Phoneme append(CharSequence charSequence) {
            return new Phoneme(this.phonemeText.toString() + charSequence.toString(), this.languages);
        }

        public Languages.LanguageSet getLanguages() {
            return this.languages;
        }

        public CharSequence getPhonemeText() {
            return this.phonemeText;
        }

        public Iterable<Phoneme> getPhonemes() {
            return Collections.singleton(this);
        }

        public Phoneme join(Phoneme phoneme) {
            return new Phoneme(this.phonemeText.toString() + phoneme.phonemeText.toString(), this.languages.restrictTo(phoneme.languages));
        }
    }

    /* renamed from: org.apache.commons.codec.language.bm.Rule$PhonemeExpr */
    public interface PhonemeExpr {
        Iterable<Phoneme> getPhonemes();
    }

    /* renamed from: org.apache.commons.codec.language.bm.Rule$PhonemeList */
    public static final class PhonemeList implements PhonemeExpr {
        private final List<Phoneme> phonemes;

        public PhonemeList(List<Phoneme> list) {
            this.phonemes = list;
        }

        public List<Phoneme> getPhonemes() {
            return this.phonemes;
        }
    }

    /* renamed from: org.apache.commons.codec.language.bm.Rule$RPattern */
    public interface RPattern {
        boolean isMatch(CharSequence charSequence);
    }

    static {
        for (NameType nameType : NameType.values()) {
            EnumMap enumMap = new EnumMap(RuleType.class);
            for (RuleType ruleType : RuleType.values()) {
                HashMap hashMap = new HashMap();
                for (String next : Languages.getInstance(nameType).getLanguages()) {
                    try {
                        hashMap.put(next, parseRules(createScanner(nameType, ruleType, next), createResourceName(nameType, ruleType, next)));
                    } catch (IllegalStateException e) {
                        StringBuilder h = C0072d.m201h("Problem processing ");
                        h.append(createResourceName(nameType, ruleType, next));
                        throw new IllegalStateException(h.toString(), e);
                    }
                }
                if (!ruleType.equals(RuleType.RULES)) {
                    hashMap.put("common", parseRules(createScanner(nameType, ruleType, "common"), createResourceName(nameType, ruleType, "common")));
                }
                enumMap.put(ruleType, Collections.unmodifiableMap(hashMap));
            }
            RULES.put(nameType, Collections.unmodifiableMap(enumMap));
        }
    }

    public Rule(String str, String str2, String str3, PhonemeExpr phonemeExpr) {
        this.pattern = str;
        this.lContext = pattern(C0326j.m864i(str2, "$"));
        this.rContext = pattern(C0326j.m864i("^", str3));
        this.phoneme = phonemeExpr;
    }

    /* access modifiers changed from: private */
    public static boolean contains(CharSequence charSequence, char c) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (charSequence.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

    private static String createResourceName(NameType nameType, RuleType ruleType, String str) {
        return String.format("org/apache/commons/codec/language/bm/%s_%s_%s.txt", new Object[]{nameType.getName(), ruleType.getName(), str});
    }

    private static Scanner createScanner(NameType nameType, RuleType ruleType, String str) {
        String createResourceName = createResourceName(nameType, ruleType, str);
        InputStream resourceAsStream = Languages.class.getClassLoader().getResourceAsStream(createResourceName);
        if (resourceAsStream != null) {
            return new Scanner(resourceAsStream, "UTF-8");
        }
        throw new IllegalArgumentException(C0326j.m864i("Unable to load resource: ", createResourceName));
    }

    /* access modifiers changed from: private */
    public static boolean endsWith(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        int length = charSequence.length() - 1;
        for (int length2 = charSequence2.length() - 1; length2 >= 0; length2--) {
            if (charSequence.charAt(length) != charSequence2.charAt(length2)) {
                return false;
            }
            length--;
        }
        return true;
    }

    public static List<Rule> getInstance(NameType nameType, RuleType ruleType, Languages.LanguageSet languageSet) {
        return getInstance(nameType, ruleType, languageSet.isSingleton() ? languageSet.getAny() : Languages.ANY);
    }

    private static Phoneme parsePhoneme(String str) {
        int indexOf = str.indexOf("[");
        if (indexOf < 0) {
            return new Phoneme(str, Languages.ANY_LANGUAGE);
        }
        if (str.endsWith("]")) {
            return new Phoneme(str.substring(0, indexOf), Languages.LanguageSet.from(new HashSet(Arrays.asList(str.substring(indexOf + 1, str.length() - 1).split("[+]")))));
        }
        throw new IllegalArgumentException("Phoneme expression contains a '[' but does not end in ']'");
    }

    private static PhonemeExpr parsePhonemeExpr(String str) {
        if (!str.startsWith("(")) {
            return parsePhoneme(str);
        }
        if (str.endsWith(")")) {
            ArrayList arrayList = new ArrayList();
            String substring = str.substring(1, str.length() - 1);
            for (String parsePhoneme : substring.split("[|]")) {
                arrayList.add(parsePhoneme(parsePhoneme));
            }
            if (substring.startsWith("|") || substring.endsWith("|")) {
                arrayList.add(new Phoneme("", Languages.ANY_LANGUAGE));
            }
            return new PhonemeList(arrayList);
        }
        throw new IllegalArgumentException("Phoneme starts with '(' so must end with ')'");
    }

    private static List<Rule> parseRules(Scanner scanner, String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        while (scanner.hasNextLine()) {
            i++;
            String nextLine = scanner.nextLine();
            if (z) {
                if (nextLine.endsWith(ResourceConstants.EXT_CMT_END)) {
                    z = false;
                }
            } else if (nextLine.startsWith(ResourceConstants.EXT_CMT_START)) {
                z = true;
            } else {
                int indexOf = nextLine.indexOf(ResourceConstants.CMT);
                String trim = (indexOf >= 0 ? nextLine.substring(0, indexOf) : nextLine).trim();
                if (trim.length() != 0) {
                    if (trim.startsWith(HASH_INCLUDE)) {
                        String trim2 = trim.substring(8).trim();
                        if (trim2.contains(" ")) {
                            System.err.println("Warining: malformed import statement: " + nextLine);
                        } else {
                            arrayList.addAll(parseRules(createScanner(trim2), C0048b.m163a(str, "->", trim2)));
                        }
                    } else {
                        String[] split = trim.split("\\s+");
                        if (split.length != 4) {
                            PrintStream printStream = System.err;
                            StringBuilder h = C0072d.m201h("Warning: malformed rule statement split into ");
                            h.append(split.length);
                            h.append(" parts: ");
                            h.append(nextLine);
                            printStream.println(h.toString());
                        } else {
                            try {
                                arrayList.add(new Rule(stripQuotes(split[0]), stripQuotes(split[1]), stripQuotes(split[2]), parsePhonemeExpr(stripQuotes(split[3])), i, str) {
                                    private final String loc;
                                    private final int myLine;
                                    public final /* synthetic */ int val$cLine;
                                    public final /* synthetic */ String val$location;

                                    {
                                        this.val$cLine = r5;
                                        this.val$location = r6;
                                        this.myLine = r5;
                                        this.loc = r6;
                                    }

                                    public String toString() {
                                        StringBuilder k = C0073e.m211k("Rule", "{line=");
                                        k.append(this.myLine);
                                        k.append(", loc='");
                                        k.append(this.loc);
                                        k.append('\'');
                                        k.append('}');
                                        return k.toString();
                                    }
                                });
                            } catch (IllegalArgumentException e) {
                                throw new IllegalStateException(C0015b.m88g("Problem parsing line ", i), e);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static RPattern pattern(String str) {
        boolean startsWith = str.startsWith("^");
        boolean endsWith = str.endsWith("$");
        int length = str.length();
        if (endsWith) {
            length--;
        }
        final String substring = str.substring(startsWith ? 1 : 0, length);
        if (substring.contains("[")) {
            boolean startsWith2 = substring.startsWith("[");
            boolean endsWith2 = substring.endsWith("]");
            if (startsWith2 && endsWith2) {
                final String substring2 = substring.substring(1, substring.length() - 1);
                if (!substring2.contains("[")) {
                    boolean startsWith3 = substring2.startsWith("^");
                    if (startsWith3) {
                        substring2 = substring2.substring(1);
                    }
                    final boolean z = !startsWith3;
                    if (startsWith && endsWith) {
                        return new RPattern() {
                            public boolean isMatch(CharSequence charSequence) {
                                return charSequence.length() == 1 && Rule.contains(substring2, charSequence.charAt(0)) == z;
                            }
                        };
                    }
                    if (startsWith) {
                        return new RPattern() {
                            public boolean isMatch(CharSequence charSequence) {
                                return charSequence.length() > 0 && Rule.contains(substring2, charSequence.charAt(0)) == z;
                            }
                        };
                    }
                    if (endsWith) {
                        return new RPattern() {
                            public boolean isMatch(CharSequence charSequence) {
                                return charSequence.length() > 0 && Rule.contains(substring2, charSequence.charAt(charSequence.length() - 1)) == z;
                            }
                        };
                    }
                }
            }
        } else if (startsWith && endsWith) {
            return substring.length() == 0 ? new RPattern() {
                public boolean isMatch(CharSequence charSequence) {
                    return charSequence.length() == 0;
                }
            } : new RPattern() {
                public boolean isMatch(CharSequence charSequence) {
                    return charSequence.equals(substring);
                }
            };
        } else {
            if ((startsWith || endsWith) && substring.length() == 0) {
                return ALL_STRINGS_RMATCHER;
            }
            if (startsWith) {
                return new RPattern() {
                    public boolean isMatch(CharSequence charSequence) {
                        return Rule.startsWith(charSequence, substring);
                    }
                };
            }
            if (endsWith) {
                return new RPattern() {
                    public boolean isMatch(CharSequence charSequence) {
                        return Rule.endsWith(charSequence, substring);
                    }
                };
            }
        }
        return new RPattern(str) {
            public Pattern pattern;
            public final /* synthetic */ String val$regex;

            {
                this.val$regex = r1;
                this.pattern = Pattern.compile(r1);
            }

            public boolean isMatch(CharSequence charSequence) {
                return this.pattern.matcher(charSequence).find();
            }
        };
    }

    /* access modifiers changed from: private */
    public static boolean startsWith(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        for (int i = 0; i < charSequence2.length(); i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private static String stripQuotes(String str) {
        if (str.startsWith(DOUBLE_QUOTE)) {
            str = str.substring(1);
        }
        return str.endsWith(DOUBLE_QUOTE) ? str.substring(0, str.length() - 1) : str;
    }

    public RPattern getLContext() {
        return this.lContext;
    }

    public String getPattern() {
        return this.pattern;
    }

    public PhonemeExpr getPhoneme() {
        return this.phoneme;
    }

    public RPattern getRContext() {
        return this.rContext;
    }

    public boolean patternAndContextMatches(CharSequence charSequence, int i) {
        if (i >= 0) {
            int length = this.pattern.length() + i;
            if (length > charSequence.length()) {
                return false;
            }
            return charSequence.subSequence(i, length).equals(this.pattern) && this.rContext.isMatch(charSequence.subSequence(length, charSequence.length())) && this.lContext.isMatch(charSequence.subSequence(0, i));
        }
        throw new IndexOutOfBoundsException("Can not match pattern at negative indexes");
    }

    public static List<Rule> getInstance(NameType nameType, RuleType ruleType, String str) {
        List<Rule> list = (List) ((Map) RULES.get(nameType).get(ruleType)).get(str);
        if (list != null) {
            return list;
        }
        throw new IllegalArgumentException(String.format("No rules found for %s, %s, %s.", new Object[]{nameType.getName(), ruleType.getName(), str}));
    }

    private static Scanner createScanner(String str) {
        String format = String.format("org/apache/commons/codec/language/bm/%s.txt", new Object[]{str});
        InputStream resourceAsStream = Languages.class.getClassLoader().getResourceAsStream(format);
        if (resourceAsStream != null) {
            return new Scanner(resourceAsStream, "UTF-8");
        }
        throw new IllegalArgumentException(C0326j.m864i("Unable to load resource: ", format));
    }
}
