package Basic2;

public class FomatClass {
    public static void main(String[] args) {
        Goroke go1 = new Goroke("potato",3000);
        Goroke go2 = new Goroke("kimchi", 2000);
        Goroke go3 = new Goroke("sweetpotato", 3000);

        System.out.println("우리동네 고로케 인기 top 3는! ");

        System.out.println(go1.str());
        System.out.println(go2.str());
        System.out.println(go3.str());
    }
}

class Goroke {
    String name;
    int price;

    Goroke(String n, int p) {
        name = n;
        price = p;
    }

    String str(){
        return String.format("{name: %s}, {price: %d}",name,price);
    }

}


