public class SingletonClass {
    String message;
    private SingletonClass (){
        this.message = "There is only one Class";
    }
    private static SingletonClass instance; //creating a ref variable for object
    public static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }
}
