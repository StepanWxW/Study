package chapter9;

interface MyIf {
    int getNumber();

    default String getString(){
        return "Object type String";
    }
}
