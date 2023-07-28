package currencyConversion;

import java.util.List;

public class BankAccountDto {
	private long accountID;
    private List<CurrenciesAmountDto> currencies;
    private String email;

    public BankAccountDto() {
    }

    public long getAccountID() {
        return accountID;
    }

    public void setAccountId(long accountID) {
        this.accountID = accountID;
    }

    public List<CurrenciesAmountDto> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<CurrenciesAmountDto> currencies) {
        this.currencies = currencies;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
