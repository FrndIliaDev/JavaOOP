public class main {
    public static void main(String[] args) {

        System.out.println("Кошка: ");
        animal vasek = new cat(200, 2, 2);
        vasek.run(1450);
        vasek.swim(1);
        vasek.jump(2);

        System.out.println("Собака: ");
        animal belka = new dog(500, 3, 2);
        belka.run(400);
        belka.swim(2);
        belka.jump(5);
    }
}

// 
