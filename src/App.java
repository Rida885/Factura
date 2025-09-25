public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Rojo Polo Paella Inc");
        System.out.println();
        System.out.println("Carretera Muelle 38");
        System.out.println("37531 Avila,Avila");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.printf("%-30s%-30s%-30s%40s%n", "Factura A", "ENVIAR A", "Nº DE FACTURA","ES-001");
        System.out.printf("%-30s%-30s%-30s%40s%n", "Leda Villa real", "Leda Villareal", "FECHA","29.01.2019");
        System.out.printf("%-30s%-30s%-30s%40s%n", "Virgen Blanca 63", "Cercas Bajas 68", "Nº DE PEDIDO","1730/2019");
        System.out.printf("%-30s%-30s%-30s%40s%n", "08759 Burgos, Burgos", "47300 Cádiz, Cádiz", "","");
        System.out.printf("%-30s%-30s%-30s%40s%n", "", "", "FECHA", "29-01-2019");
        System.out.printf("%-30s%-30s%-30s%40s%n", "", "", "VENCIMIENTO", "");
        System.out.printf("────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────%n");
        System.out.printf("%-30s%-30s%-30s%40s%n","Total Factura","","","199,65$");
        System.out.printf("────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────%n");
        System.out.printf("%-30s%-40s%30s%30s%n", "CANT.", "DESCRIPCIÓN", "PRECIO","IMPORTE");
        System.out.printf("%-30s%-40s%30s%30s%n", "", "", "UNITARIO","");
        System.out.printf("%-30s%-40s%30s%30s%n", "1", "Talla pequeña traje de luces en rojo", "100,00","100,00");
        System.out.printf("%-30s%-40s%30s%30s%n", "2", "Mui grande churrolito", "25,00","50,00");
        System.out.printf("%-30s%-40s%30s%30s%n", "3", "Equipaje de futbol", "5,00","15,00");
        System.out.printf("%-30s%-40s%30s%30s%n", "", "", "", "");
        System.out.printf("%-30s%-40s%30s%30s%n", "", "", "Subtotal", "165,00");
        System.out.printf("%-30s%-40s%30s%30s%n", "", "", "IVA 21.0%%", "34,65");



    }
}
