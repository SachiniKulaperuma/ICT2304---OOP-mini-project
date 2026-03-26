package com.rajaratabank;

import com.rajaratabank.config.FirebaseConfig;
import com.rajaratabank.models.Customer;
import com.rajaratabank.models.accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        System.out.println("Launching Rajarata Digital Bank UI...");
        com.rajaratabank.ui.BankUI.main(args);
    }
}
