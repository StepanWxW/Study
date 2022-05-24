package chapter18;

public class ExecDemoFini {
        public static void main(String[] args) {
            Runtime r = Runtime.getRuntime();
            Process p = null;

            try {
                p = r.exec("Notepad");
                p.waitFor();
            } catch (Exception e) {
                System.out.println("Ощибка запуска Notepad");
            }
            System.out.println("Редактор Notepad возвратил: " +p.exitValue());
        }
    }
