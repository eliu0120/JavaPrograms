public class Assignment11 {
    public static String ns[] = {
            "Andrew", "Sarah", "Kevin", "Derek"
    };

    public static String suit[] = {
            "Regular", "Special"
    };

    public static String ca[] = {
            "No","Wearing"
    };

    public static void main(String[] args) {
        Superhero heroes[] = new Superhero[3];

        //Creates array of superhero
        for (int i = 0; i < heroes.length; i++) {
            //Creates single superhero object
            Superhero h = new Superhero();

            //Creates name of superhero
            Name n = new Name(ns[(int) (Math.random() * ns.length)]);
            h.setSuperName(n);

            //Creates suit of superhero
            h.setSuperSuit(suit[(int) (Math.random() * suit.length)]);

            //Sets power
            if (h.getSuperSuit().equals("Special")){
                h.setSpecialPower(true);
            }
            else {
                h.setSpecialPower(false);
            }

            //Creates cape of superhero
            h.setSuperCape(ca[(int) (Math.random() * ca.length)]);

            int randomYear = (int) (Math.random() * 103 + 1900);
            int randomMonth = (int) (Math.random() * 13);
            int randomDay = (int) (Math.random() * 29);

            Date d = new Date(randomYear, randomMonth, randomDay);
            h.setBirthDay(d);

            //Put hero object into array at index i
            heroes[i] = h;
        }

        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i]);
        }
    }


}