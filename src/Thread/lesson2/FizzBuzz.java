package Thread.lesson2;

class FizzBuzz {
    int n;
    int count = -1;
    public FizzBuzz(int number){
        n = number;
    }
    public void fizz(){
        System.out.println("fizz");
    }
    public void buzz(){
        System.out.println("buzz");
    }
    public void fizzbuzz(){
        System.out.println("fizzbuzz");
    }
    public void number(){
        count++;
    }
}