package com.company;

public class Bankomat implements BankomatImpl {
    private Card[] _cards;
    private Card _userCard;

    public Bankomat() {
    //в конструкторе создаем базу данных карточек
        this._cards = new Card[]{
                new Card("1234567", "1234", 120.9f),
                new Card("7654321", "4321", 0),
                new Card("8765432", "5432", 100),
        };
    }
    public boolean checkPin (String cardID, String pin ) {
               int i =0;
        for (; i < this._cards.length; i++ ) {
            if (this._cards[i].ID.equals(cardID)) {
                this._userCard  = this._cards[i];
                break;
            }
        }
        // found == false; !found = true
        // found == true; !found = false
        // ! инвертирует логическое значение
        // null - нулевой указатель, никуда не указывает ни на какую область памяти
        if (this._userCard == null) {
            System.out.println("неверный ID карточки");
            return false;
        }
        //проверяем пин код
        return this._cards[i].PIN.equals(pin);
    }
        public float getBallance() {
        return this._userCard.money;
            }
    // проверка наличия денег на карте
    public void getCash (float cash) {
        if (cash > this._userCard.money) {
            System.out.println("недостаточно средств");
        }
        else {
           // this._userCard = this._userCard - cash;
            this._userCard.money -= cash;
        }
    }
    public void addCash(float cash) {
        this._userCard.money += cash;
    }
    // забрать карту из банкомата
    public void reject() {
        this._userCard = null;
    }
    class Card {
        String ID;
        String PIN;
        float money;

        public Card(String id, String pin, float money) {
            this.ID = id;
            this.PIN = pin;
            this.money = money;

        }
    }
}
