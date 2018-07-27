package lambdaExpressions;

interface Executable {
    int execute(int x, int y);
}

class ExecRunner {
    public void run(Executable e) {
        int a = e.execute(10, 15);
        System.out.println(a);
    }
}

public class LambdaTest {
    public static void main(String[] args) {
        ExecRunner runner = new ExecRunner();
        int a = 1;
        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                System.out.println("Hello");
                int a = 2;
                return x + y;
            }
        });

        runner.run((x, y) -> x + y);
    }
}
