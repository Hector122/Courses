package structural.composite.menu;

public class CompositeMenuDemo {

    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "./main");

        //add leaf
        MenuItem safetyMenuItem = new MenuItem("Safety", "./safety" );
        mainMenu.add(safetyMenuItem);

        //add composite
        Menu claimsSubMenu = new Menu("Claims", "/claims");
        mainMenu.add(claimsSubMenu);

        // add leaf
        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());
    }
}
