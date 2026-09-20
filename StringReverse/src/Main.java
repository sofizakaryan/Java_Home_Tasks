void main() {
    String str = "Hello Meow mEow! !";


    System.out.println(str);
    System.out.println(StrRev1(str));
    System.out.println(StrRev2(str));
    System.out.println(StrRev3(str));
}

String StrRev1(String str) {
    if (str == null || str.length() <= 1) {
        return str;
    }

    StringBuilder res = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
        res.append(str.charAt(i));
    }
    return res.toString();
}

String StrRev2(String str){
    if (str == null || str.length() <= 1) {
        return str;
    }
    StringBuilder res = new StringBuilder(str);
    return res.reverse().toString();
}

String StrRev3(String str){
    int size = str.length();
    if (str == null || size <= 1) {
        return str;
    }
    char[] chars = str.toCharArray();
    char tmp;
    for (int i = 0; i < size / 2; i++) {
        tmp = chars[i];
        chars[i] = chars[size - i - 1];
        chars[size - i - 1] = tmp;
    }
    return new String(chars);
}