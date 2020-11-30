package Form.Handlling.form.handling;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Input {

    private String time12h;
    private String time24h;
    private String email;
    private String creditCardNumber;
    private String currency;
    private String ipAddress;
    private String decimal;

    public String getTime12h() {
        return time12h;
    }

    public void setTime12h(String time12h) {
        this.time12h = time12h;
    }

    public String getTime24h() {
        return time24h;
    }

    public void setTime24h(String time24h) {
        this.time24h = time24h;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getDecimal() {
        return decimal;
    }

    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }
}