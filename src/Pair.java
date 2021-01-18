import java.io.Serializable;

public class Pair implements Serializable {
    private double buy_price;
    private double sell_price;
    private double last_trade;
    private double high;
    private double low;
    private double avg;
    private double vol;
    private double vol_cur;
    private int updated;

    public double getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(double buy_price) {
        this.buy_price = buy_price;
    }

    public double getSell_price() {
        return sell_price;
    }

    public void setSell_price(double sell_price) {
        this.sell_price = sell_price;
    }

    public double getLast_trade() {
        return last_trade;
    }

    public void setLast_trade(double last_trade) {
        this.last_trade = last_trade;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public double getVol() {
        return vol;
    }

    public void setVol(double vol) {
        this.vol = vol;
    }

    public double getVol_cur() {
        return vol_cur;
    }

    public void setVol_cur(double vol_cur) {
        this.vol_cur = vol_cur;
    }

    public int getUpdated() {
        return updated;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }
    
}