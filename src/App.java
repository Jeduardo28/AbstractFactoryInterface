public class App {
    public static void main(String[] args) {
        System.out.println("Familia Windows:");
        System.out.println(new Tela(new FabricaWindows()).renderizar());
        System.out.println();
        System.out.println("Familia MacOS:");
        System.out.println(new Tela(new FabricaMacOS()).renderizar());
    }
}

