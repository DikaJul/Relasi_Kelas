public class KartuDebit {
    private String noRekening;
    private String pin;

    public KartuDebit(String noRekening, String pin) {
        this.noRekening = noRekening;
        this.pin = pin;
    }

    public boolean otentikasi(String inputPin) {
        return this.pin.equals(inputPin);
    }

    public String getNoRekening() {
        return noRekening;
    }
}
