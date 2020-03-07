package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-03-07
 */
public class JudgeCharUnique {
    public boolean isUnique(String astr) {
        int[] count = new int[26];
        for (int i = 0; i < astr.length(); i++) {
            int pos = astr.charAt(i) - 'a';
            count[pos] += 1;
            if (count[pos] > 1) {
                return false;
            }
        }
        return true;
    }

    public boolean isUnique1(String astr) {
        while (astr.length() > 0) {
            int len = astr.length();
            String ch = astr.substring(0, 1);
            astr = astr.replace(ch, "");
            if (astr.length() != len - 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String astr = "leetcode";
        //String astr = "abc";
        System.out.println(new JudgeCharUnique().isUnique(astr));
    }
}
