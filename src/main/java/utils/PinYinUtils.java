package utils;



public class PinYinUtils {
    public static String toPinYin(String input){
       // return Pinyin.toPinyin(input,"_").toLowerCase();
        return input;
    }

    public static String[] toPinYin(String[] inputs) {
        if (null == inputs) {
            return null;
        }
        String[] result = new String[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            result[i] = toPinYin(inputs[i]);
        }
        return result;
    }
}
