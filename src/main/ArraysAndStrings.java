package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andre-PC on 9/27/2018.
 */
public class ArraysAndStrings {

    public boolean isUnique(String str) {
        boolean unique = true;

        ArrayList<String> chars = new ArrayList<>();
        for (int i = 0; i<str.length(); i++) {
            if (chars.contains(""+str.charAt(i))) {
                unique = false;
                break;
            } else {
                chars.add(""+str.charAt(0));
            }
        }

        return unique;
    }

    public boolean checkPermutation(String str1, String str2) {
        boolean isPermutation = false;

        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();
        if (str1.length() == str2.length()) {
            int length = str1.length();
            for (int i = 0; i<length; i++) {
                if (str1.contains(""+str2.charAt(i))) {
                    str1 = str1.replaceFirst(""+str2.charAt(i), "");
                }
            }
            if (str1.length() == 0)
                isPermutation = true;
        }

        return isPermutation;
    }

    public char[] URLify(char[] string, int truelength) {
        char[] result = new char[string.length];
        int pos = 0;
        for (int i = 0; i<truelength; i++) {
            if (string[i] == ' ') {
                result[pos] = '%';
                result[++pos] = '2';
                result[++pos] = '0';
            } else {
                result[pos] = string[i];
            }
            pos++;
        }
        return result;
    }

    public boolean palindromePermutation(String str) {
        str = str.toLowerCase().replaceAll(" ", "");
        Map<String, Integer> map = new HashMap<>();
        int oddCount = 0;
        for (char ch : str.toCharArray()) {
            if (map.keySet().contains(""+ch)) {
                map.put(""+ch, map.get(""+ch)+1);
            } else {
                map.put(""+ch, 1);
            }

            if (map.get(""+ch) % 2 == 1) {
                oddCount++;
            } else {
                oddCount--;
            }
        }
        return oddCount <= 1;
    }

    public boolean oneAway(String str1, String str2) {
        boolean isOneAway = true;

        if (!str1.equals(str2)) {
            if (str1.length() == str2.length()) {
                isOneAway = oneEditReplace(str1, str2);
            } else {
                if (str1.length()> str2.length()) {
                    isOneAway = oneEditInsert(str2, str1);
                } else {
                    isOneAway = oneEditInsert(str1, str2);
                }
            }
        }

        return isOneAway;
    }

    private boolean oneEditReplace(String str1, String str2) {
        int howManyAway = 0;
        boolean isOneAway = true;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != str1.charAt(i)) {
                howManyAway++;
            }
            if (howManyAway > 1) {
                isOneAway = false;
                break;
            }
        }
        return isOneAway;
    }

    private boolean oneEditInsert(String shorter, String longer) {
        int howManyAway = 0;
        boolean isOneAway = true;
        for (int i = 0; i < shorter.length(); i++) {
            if (shorter.charAt(i) != longer.charAt(i+howManyAway)) {
                howManyAway++;
                i--;
            }
            if (howManyAway > 1) {
                isOneAway = false;
                break;
            }
        }
        return isOneAway;
    }

    public String stringCompression(String str) {
        StringBuilder compressed = new StringBuilder();
        compressed.append(str.charAt(0));

        int letterCount = 1;
        for (int i = 1; i<str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                letterCount++;
            } else {
                compressed.append(letterCount);
                compressed.append(str.charAt(i));
                letterCount = 1;
            }
        }
        compressed.append(letterCount);

        return compressed.toString();
    }

    public int[][] rotateMatrix
            (int[][] matrix) {
        int width = matrix.length;

        for (int i = 0; i<Math.round(width/2.0); i++) {
            for (int j = 0; j<Math.round(width/2.0); j++) {
                int startingPos = matrix[i][j];
                matrix[i][j] = matrix[width-1-j][i];
                matrix[width-1-j][i] = matrix[width-1-i][width-1-j];
                matrix[width-1-i][width-1-j] = matrix[j][width-1-i];
                matrix[j][width-1-i] = startingPos;
            }
        }

        return matrix;
    }

    public int[][] zeroMatrix(int[][] matrix) {
        ArrayList<Integer> zeroColumns = new ArrayList<>();
        ArrayList<Integer> zeroRows = new ArrayList<>();
        int height = matrix.length;
        int width = matrix[0].length;
        for (int i = 0; i<height; i++) {
            for (int j = 0; j<width; j++) {
                if (matrix[i][j] == 0) {
                    if (!zeroColumns.contains(j))
                        zeroColumns.add(j);
                    if (!zeroRows.contains(i))
                        zeroRows.add(i);
                }
            }
        }
        for (Integer col : zeroColumns) {
            for (int i = 0; i<height; i++) {
                matrix[i][col] = 0;
            }
        }
        for (Integer row : zeroRows) {
            for (int i = 0; i<width; i++) {
                matrix[row][i] = 0;
            }
        }
        return matrix;
    }

    public boolean stringRotation(String str1, String str2) {
        String temp = str1+str1;
        return temp.contains(str2);
    }

}
