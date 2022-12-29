package hello.core;


@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args){
        HelloLombok helloLombok=new HelloLombok();
        helloLombok.setNmae("asdfas");

        System.out.println("helloLombok="+helloLombok);
    }
}
