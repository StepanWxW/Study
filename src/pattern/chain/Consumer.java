package pattern.chain;

public class Consumer {
    public static void main(String[] args) {
        Lada grantaEconomy = new GrantaEconomy(Equipment.ECONOMY);
        Lada grantaNormal = new GrantaNormal(Equipment.NORMAL);
        Lada grantaLuxe = new GrantaLuxe(Equipment.LUXE);
        grantaEconomy.setNextLada(grantaNormal);
        grantaNormal.setNextLada(grantaLuxe);
        grantaEconomy.ladaManager("Хочу гранту в минималке", Equipment.ECONOMY);
        grantaEconomy.ladaManager("Хочу гранту с кондером", Equipment.NORMAL);
        grantaEconomy.ladaManager("Гранту хочу в максималке", Equipment.LUXE);
    }
}
