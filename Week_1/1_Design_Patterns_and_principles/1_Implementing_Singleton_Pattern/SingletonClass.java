public class SingletonClass {
    private SingletonClass (){

    }
    private static SingletonClass instance; //creating a ref variable for object
    public static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }
}
