package com.example.walletapp;

public abstract class DAO {

    public static final String Users = "users";
    public static final String Expenses = "expenses";
    public abstract static class USERS {
        public static final String email = "email";
        public static final String name = "name";
        public static final String bank = "bank";
        public static final String phone = "phone";
    }

    public abstract static class EXPENSES {
        public static final String category = "category";
        public static final String cost = "cost";
        public static final String date_str = "date";
        public static final String datetime = "datetime";
        public static final String description = "desc";
        public static final String title = "title";
    }

    public abstract static class CATEGORIES {
        public static final String bill = "Bill";
        public static final String food = "Food";
        public static final String gas = "Gas";
        public static final String holidays = "Holidays";
    }
}
