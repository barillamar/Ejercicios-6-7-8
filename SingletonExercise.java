package out.com.JavaAvanzado.Ejercicios.Ejercicios67y8;


public class SingletonExercise {

    /*
    Crea una pequeña aplicación implementando el patrón Singlenton y demuestra que, efectivamente,
    no crea instancias nuevas. Puedes tomar la sesión 7 como referencia.
     */
    private static SingletonExercise singletonExercise;
    int number;

    private SingletonExercise(){}

    public static SingletonExercise getInstance(){
        if(singletonExercise == null) {
            singletonExercise = new SingletonExercise();

        }
        return singletonExercise;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) {

        SingletonExercise singletonExercise = getInstance();
        singletonExercise.setNumber(12);

        SingletonExercise singletonExercise2 = getInstance();
        singletonExercise.setNumber(20);


        System.out.println("El valor del singleton original es: " + singletonExercise.getNumber());
        System.out.println("El valor del singleton 2 es: " + singletonExercise2.getNumber());


    }
}
