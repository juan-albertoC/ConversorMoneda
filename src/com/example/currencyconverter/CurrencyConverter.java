package com.example.currencyconverter;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private static final String API_KEY = "3af4d1637c8bf6e6a6799317";
    private ExchangeRateApiService apiService;
    private Map<String, Double> rates;

    public CurrencyConverter() {
        apiService = new ExchangeRateApiService(API_KEY);
        rates = new HashMap<>();
        loadRates();
    }

    private void loadRates() {
        String[] currencies = {"ARS", "BOB", "BRL", "CLP", "COP", "USD"};
        for (String currency : currencies) {
            rates.put(currency, apiService.getRate("USD", currency));
        }
    }

    public double convert(String baseCurrency, String targetCurrency, double amount) {
        if (!rates.containsKey(baseCurrency) || !rates.containsKey(targetCurrency)) {
            throw new IllegalArgumentException("Moneda no soportada");
        }
        double baseRate = rates.get(baseCurrency);
        double targetRate = rates.get(targetCurrency);
        return amount * (targetRate / baseRate);
    }
}