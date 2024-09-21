package laba1;

public class labarotornay1 {

    public static void main(String[] args) {
        DealType brokerDeal = new DealType(1, "Broker") {
            @Override
            public String getType() {
                return super.getType() + " (Anonymous Class)";
            }
        };
        DealPlace mmvbPlace = new DealPlace(1, "Moscow Exchange", "MMVB") {
            @Override
            public String getDealPlaceFull() {
                return super.getDealPlaceFull() + " (Anonymous Class)";
            }
        };

        Currency rubleCurrency = new Currency(1, "Russian Ruble", "RUB") {
            @Override
            public String getCurrencyShort() {
                return super.getCurrencyShort() + " (Anonymous Class)";
            }
        };

        Deal deal = new Deal(1, brokerDeal, mmvbPlace, rubleCurrency, "SBER", 
                             "ORD12345", "DEAL67890", 100, 240.5, 24050.0, 
                             "TRD001", 0.2);

        System.out.println("Deal Details:");
        System.out.println("Type: " + deal.getType().getType());
        System.out.println("Place: " + deal.getPlace().getDealPlaceFull());
        System.out.println("Currency: " + deal.getCurrency().getCurrencyShort());
        System.out.println("Ticker: " + deal.getTiker());
        System.out.println("Total Cost: " + deal.getTotalCost());
    }

    static class DealType {
        private int id;
        private String type;

        public DealType(int id, String type) {
            this.id = id;
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    static class DealPlace {
        private int id;
        private String dealPlaceFull;
        private String dealPlaceShort;

        public DealPlace(int id, String dealPlaceFull, String dealPlaceShort) {
            this.id = id;
            this.dealPlaceFull = dealPlaceFull;
            this.dealPlaceShort = dealPlaceShort;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDealPlaceFull() {
            return dealPlaceFull;
        }

        public void setDealPlaceFull(String dealPlaceFull) {
            this.dealPlaceFull = dealPlaceFull;
        }

        public String getDealPlaceShort() {
            return dealPlaceShort;
        }

        public void setDealPlaceShort(String dealPlaceShort) {
            this.dealPlaceShort = dealPlaceShort;
        }
    }

    static class Currency {
        private int id;
        private String currencyFull;
        private String currencyShort;

        public Currency(int id, String currencyFull, String currencyShort) {
            this.id = id;
            this.currencyFull = currencyFull;
            this.currencyShort = currencyShort;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCurrencyFull() {
            return currencyFull;
        }

        public void setCurrencyFull(String currencyFull) {
            this.currencyFull = currencyFull;
        }

        public String getCurrencyShort() {
            return currencyShort;
        }

        public void setCurrencyShort(String currencyShort) {
            this.currencyShort = currencyShort;
        }
    }

    static class Deal {
        private int id;
        private DealType type;
        private DealPlace place;
        private Currency currency;
        private String tiker;
        private String order;
        private String number;
        private int quantity;
        private double price;
        private double totalCost;
        private String trader;
        private double commission;

        // Constructor
        public Deal(int id, DealType type, DealPlace place, Currency currency, String tiker, 
                    String order, String number, int quantity, double price, double totalCost,
                    String trader, double commission) {
            this.id = id;
            this.type = type;
            this.place = place;
            this.currency = currency;
            this.tiker = tiker;
            this.order = order;
            this.number = number;
            this.quantity = quantity;
            this.price = price;
            this.totalCost = totalCost;
            this.trader = trader;
            this.commission = commission;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public DealType getType() {
            return type;
        }

        public void setType(DealType type) {
            this.type = type;
        }

        public DealPlace getPlace() {
            return place;
        }

        public void setPlace(DealPlace place) {
            this.place = place;
        }

        public Currency getCurrency() {
            return currency;
        }

        public void setCurrency(Currency currency) {
            this.currency = currency;
        }

        public String getTiker() {
            return tiker;
        }

        public void setTiker(String tiker) {
            this.tiker = tiker;
        }

        public String getOrder() {
            return order;
        }

        public void setOrder(String order) {
            this.order = order;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getTotalCost() {
            return totalCost;
        }

        public void setTotalCost(double totalCost) {
            this.totalCost = totalCost;
        }

        public String getTrader() {
            return trader;
        }

        public void setTrader(String trader) {
            this.trader = trader;
        }

        public double getCommission() {
            return commission;
        }

        public void setCommission(double commission) {
            this.commission = commission;
        }
    }
}
