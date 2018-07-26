package regulars;

public class RegularExpressionsTest {
    public static void main(String[] args) {

        /*
         //d - одна цифра
         //w - одна буква
         + - 1 или более
         *- 0 или более
         ? - 0 или 1 символов до
         ( | | | )-одна из множества строк(или)
         [a-zA-z]- all english letters
         [^abc]- все символы краме [abc]
         . - любой символ
         {2}- 2 символа до (\\d{2}) две циыфры до
         {2,}- от 2-х символов
         {2,4}-от 2-х до 4-х символов
        */
        String a = "123434";
        String b = "-23434";
        String c = "+54354";
        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "qergF43567Gvfdl324325";
        System.out.println(d.matches("[a-zA-z0-9]+\\d+"));

        String e = "helloc";
        System.out.println(e.matches("[^abc]*"));

        String f = "http://www.google.com";
        System.out.println(f.matches("http://www\\..+\\.(com|ua)"));
    }
}
