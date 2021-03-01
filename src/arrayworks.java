public class arrayworks {
    public static void main(String[] args) {
        String[] first_array = {"a"," b" ,"c" ,"d"};
        String[] second_array = new String[4];

        second_array = first_array.clone();

        for (int i = 0; i < second_array.length; i++) {
            System.out.println(i +"element"+ "" +second_array[i]);
        }

        boolean arethesame = first_array.equals(second_array);
        System.out.println("arethesame :"+ arethesame );

    }
}
