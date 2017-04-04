import java.util.*;
/**
* <h1>Purchase</h1>
* <p>The Purchase class is the template for the Purchase object. It includes all it's private methods
* as well as it's public mutators. The class also includes Comparator methods.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-04-04
*/
public class Purchase{
  private String serviceDescription;
  private double price;
  private int time;

  public void setServiceDescription(String sd){
    this.serviceDescription = sd;
  }
  public String getServiceDescription(){
    return this.serviceDescription;
  }
  public void setPrice(double p){
    this.price = p;
  }
  public double getPrice(){
    return this.price;
  }
  public void setTime(int t){
    this.time = t;
  }
  public int getTime(){
      return this.time;
  }

  public Purchase(String a, double b, int c){
    this.serviceDescription = a;
    this.price = b;
    this.time = c;
  }

  public static Comparator<Purchase> purchaseDescriptionComparator = new Comparator<Purchase>(){
    public int compare(Purchase p1, Purchase p2){
      String purchaseDescripton1 = p1.getServiceDescription().toUpperCase();
      String purchaseDescripton2 = p2.getServiceDescription().toUpperCase();

      return purchaseDescripton1.compareTo(purchaseDescripton2);
    }
  };

  public static Comparator<Purchase> purchasePriceComparator = new Comparator<Purchase>(){
    public int compare(Purchase p1, Purchase p2){
      return Double.compare(p1.getPrice(), p2.getPrice());
    }
  };

  public static Comparator<Purchase> purchaseTimecomparator = new Comparator<Purchase>(){
    public int compare(Purchase p1, Purchase p2){
      return (p1.getTime() - p2.getTime());
    }
  };

}
