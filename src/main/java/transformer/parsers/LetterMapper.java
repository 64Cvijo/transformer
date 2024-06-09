package transformer.parsers;

import java.util.HashMap;
import java.util.Map;

public class LetterMapper {
        public static final Map<Character, String> cyrillicToLatinMap = new HashMap<>();
        public static final Map<Character, String> greekToLatinMap = new HashMap<>();

        static {
            cyrillicToLatinMap.put('А', "A");
            cyrillicToLatinMap.put('Б', "B");
            cyrillicToLatinMap.put('В', "V");
            cyrillicToLatinMap.put('Г', "G");
            cyrillicToLatinMap.put('Д', "D");
            cyrillicToLatinMap.put('Е', "E");
            cyrillicToLatinMap.put('Ё', "E");
            cyrillicToLatinMap.put('Ж', "Zh");
            cyrillicToLatinMap.put('З', "Z");
            cyrillicToLatinMap.put('И', "I");
            cyrillicToLatinMap.put('Й', "Y");
            cyrillicToLatinMap.put('К', "K");
            cyrillicToLatinMap.put('Л', "L");
            cyrillicToLatinMap.put('М', "M");
            cyrillicToLatinMap.put('Н', "N");
            cyrillicToLatinMap.put('О', "O");
            cyrillicToLatinMap.put('П', "P");
            cyrillicToLatinMap.put('Р', "R");
            cyrillicToLatinMap.put('С', "S");
            cyrillicToLatinMap.put('Т', "T");
            cyrillicToLatinMap.put('У', "U");
            cyrillicToLatinMap.put('Ф', "F");
            cyrillicToLatinMap.put('Х', "Kh");
            cyrillicToLatinMap.put('Ц', "Ts");
            cyrillicToLatinMap.put('Ч', "Ch");
            cyrillicToLatinMap.put('Ш', "Sh");
            cyrillicToLatinMap.put('Щ', "Shch");
            cyrillicToLatinMap.put('Ъ', "'");
            cyrillicToLatinMap.put('Ы', "Y");
            cyrillicToLatinMap.put('Ь', "'");
            cyrillicToLatinMap.put('Э', "E");
            cyrillicToLatinMap.put('Ю', "Yu");
            cyrillicToLatinMap.put('Я', "Ya");

            cyrillicToLatinMap.put('а', "a");
            cyrillicToLatinMap.put('б', "b");
            cyrillicToLatinMap.put('в', "v");
            cyrillicToLatinMap.put('г', "g");
            cyrillicToLatinMap.put('д', "d");
            cyrillicToLatinMap.put('е', "e");
            cyrillicToLatinMap.put('ё', "e");
            cyrillicToLatinMap.put('ж', "zh");
            cyrillicToLatinMap.put('з', "z");
            cyrillicToLatinMap.put('и', "i");
            cyrillicToLatinMap.put('й', "y");
            cyrillicToLatinMap.put('к', "k");
            cyrillicToLatinMap.put('л', "l");
            cyrillicToLatinMap.put('м', "m");
            cyrillicToLatinMap.put('н', "n");
            cyrillicToLatinMap.put('о', "o");
            cyrillicToLatinMap.put('п', "p");
            cyrillicToLatinMap.put('р', "r");
            cyrillicToLatinMap.put('с', "s");
            cyrillicToLatinMap.put('т', "t");
            cyrillicToLatinMap.put('у', "u");
            cyrillicToLatinMap.put('ф', "f");
            cyrillicToLatinMap.put('х', "kh");
            cyrillicToLatinMap.put('ц', "ts");
            cyrillicToLatinMap.put('ч', "ch");
            cyrillicToLatinMap.put('ш', "sh");
            cyrillicToLatinMap.put('щ', "shch");
            cyrillicToLatinMap.put('ъ', "'");
            cyrillicToLatinMap.put('ы', "y");
            cyrillicToLatinMap.put('ь', "'");
            cyrillicToLatinMap.put('э', "e");
            cyrillicToLatinMap.put('ю', "yu");
            cyrillicToLatinMap.put('я', "ya");

            greekToLatinMap.put('Α', "A");
            greekToLatinMap.put('Β', "B");
            greekToLatinMap.put('Γ', "G");
            greekToLatinMap.put('Δ', "D");
            greekToLatinMap.put('Ε', "E");
            greekToLatinMap.put('Ζ', "Z");
            greekToLatinMap.put('Η', "E");
            greekToLatinMap.put('Θ', "Th");
            greekToLatinMap.put('Ι', "I");
            greekToLatinMap.put('Κ', "K");
            greekToLatinMap.put('Λ', "L");
            greekToLatinMap.put('Μ', "M");
            greekToLatinMap.put('Ν', "N");
            greekToLatinMap.put('Ξ', "X");
            greekToLatinMap.put('Ο', "O");
            greekToLatinMap.put('Π', "P");
            greekToLatinMap.put('Ρ', "R");
            greekToLatinMap.put('Σ', "S");
            greekToLatinMap.put('Τ', "T");
            greekToLatinMap.put('Υ', "Y");
            greekToLatinMap.put('Φ', "Ph");
            greekToLatinMap.put('Χ', "Ch");
            greekToLatinMap.put('Ψ', "Ps");
            greekToLatinMap.put('Ω', "O");

            greekToLatinMap.put('α', "a");
            greekToLatinMap.put('β', "b");
            greekToLatinMap.put('γ', "g");
            greekToLatinMap.put('δ', "d");
            greekToLatinMap.put('ε', "e");
            greekToLatinMap.put('ζ', "z");
            greekToLatinMap.put('η', "e");
            greekToLatinMap.put('θ', "th");
            greekToLatinMap.put('ι', "i");
            greekToLatinMap.put('κ', "k");
            greekToLatinMap.put('λ', "l");
            greekToLatinMap.put('μ', "m");
            greekToLatinMap.put('ν', "n");
            greekToLatinMap.put('ξ', "x");
            greekToLatinMap.put('ό', "o");
            greekToLatinMap.put('π', "p");
            greekToLatinMap.put('ρ', "r");
            greekToLatinMap.put('σ', "s");
            greekToLatinMap.put('τ', "t");
            greekToLatinMap.put('υ', "y");
            greekToLatinMap.put('φ', "ph");
            greekToLatinMap.put('χ', "ch");
            greekToLatinMap.put('ψ', "ps");
            greekToLatinMap.put('ω', "o");
        }
}
