public class Bai2_String {

    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
    public static void main(String[] args) {
//         bài 1: Nhập 1 sâu ký tự
//        String Str;
//        int count = 0;
//        Scanner scanner = new Scanner(System.in);
//        Str = scanner.nextLine();
//        for (int i = 0; i <Str.length();i++){
//            if (Str.charAt(i) != SPACE && Str.charAt(i) != TAB  && Str.charAt(i) != BREAK_LINE){
//                count ++;
//            }
//        }
//        System.out.println("Số ký tự là : "+count);

//         Bài 2 liệt kê số lần xuất hiện của các từ trong một chuỗi
//        String Str;
//        int counter[] = new int[256];
//        Scanner scanner = new Scanner(System.in);
//        Str = scanner.nextLine();
//        System.out.println(Str);
//
//        for (int i = 0; i < Str.length(); i++){
//            counter[Str.charAt(i)]++;
//        }
//        char[] array = new char[Str.length()];
//        for (int i = 0; i < Str.length(); i++){
//            array[i] = Str.charAt(i);
//            int flag = 0;
//            for(int j = 0; j <=i;j++){
//                if (Str.charAt(i) == array[j])
//                    flag++;
//            }
//            if (flag == 1)
//                System.out.println("Số lần xuất hiện của " + Str.charAt(i)
//                        + " trong chuỗi:" + counter[Str.charAt(i)]);
//        }

//        bài 3:  kiểm tra xem chuỗi s1 chứa chuỗi s2 không
//        String str1,str2;
//        Scanner scanner = new Scanner(System.in);
//        str1 = scanner.nextLine();
//        str2 = scanner.nextLine();

//        String result = (str1.contains(str2)) ? "Chuỗi s1 chứa chuỗi s2" : "Chuỗi s1 không chứa s2";
//        System.out.println(result);

//        Bài 4: so sánh 2 chuỗi ký tự

//        String str1,str2;
//        Scanner scanner = new Scanner(System.in);
//        str1 = scanner.nextLine();
//        str2 = scanner.nextLine();
//        System.out.println(str1.equalsIgnoreCase(str2));

//        Bài 5: Kiểm tra chuỗi đảo ngược
//        String str1,str2;
//        Scanner scanner = new Scanner(System.in);
//        str1 = scanner.nextLine();
//        str2 = scanner.nextLine();
//        String strReverse = new StringBuffer(str2).reverse().toString();
//
//        String result = (str1.equalsIgnoreCase(strReverse)) ? "Yes" : "No";
//        System.out.println(result);

//        Bài 6:Tìm ký tự chỉ xuất hiện một lần trong chuỗi, nếu có nhiều hơn một thì xuất ra màn hình ký tự đầu tiên. Nếu không có ký tự nào unique xuất ra “NO”.
//        LinkedHashMap<Character,Integer> linkedHashMap = new LinkedHashMap<Character, Integer>();
//        String str;
//        Scanner scanner = new Scanner(System.in);
//        str = scanner.nextLine();
//        for (int i =0 ; i< str.length();i++){
//            linkedHashMap.put(str.charAt(i),linkedHashMap.getOrDefault(str.charAt(i),0) + 1);
//        }
//        for (Map.Entry<Character,Integer> entry : linkedHashMap.entrySet()){
//            if (entry.getValue() == 1){
//                System.out.println("Ký tự " +entry.getKey()+ " xuất hiện "+entry.getValue()+" lần");
//                return;
//            }
//        }
//        System.out.println("NO");

//        Bài 7: Kiểm tra chuỗi có chứa chữ số không
//        String str;
//        String pattern = "\\D+";
//        Scanner scanner = new Scanner(System.in);
//        str = scanner.nextLine();
//        Boolean result =  (Pattern.matches(pattern,str)) ? true : false;
//        System.out.println(result);

    }


}
