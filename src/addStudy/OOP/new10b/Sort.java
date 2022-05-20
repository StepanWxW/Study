package addStudy.OOP.new10b;

public interface Sort {
    Start start = new Start();

    default int[] sort(int[] array) {

        return array;
    }
    static String getName(){
        return "";
    }
}
