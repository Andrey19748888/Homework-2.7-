package sponsors;

public class Sponsor {
    private final String name;
    private  final int giftAmount;
    private final boolean isCompany;

    public Sponsor(String name, int giftAmount, boolean isCompany) {
        this.name = name;
        this.giftAmount = giftAmount;
        this.isCompany = isCompany;
    }

    public void sponsorRace() {
        System.out.printf("Спонсор %s спонсирует заезд на сумму %s ", name,giftAmount);
    }

    @Override
    public String toString() {
        return " Имя спонсора " + name;
    }

    public String getName() {
        return name;
    }

    public int getGiftAmount() {
        return giftAmount;
    }

    public boolean getIsCompany() {
        return isCompany;
    }


}
